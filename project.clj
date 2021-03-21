(defproject shadow-cljs-app/lein-template "1.0.1"
  :description "boilerplate to setup a clojurescript project built using shadow-cljs"
  :url "https://github.com/mraveloarinjaka/cljs-app"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-2.0"}
  :repositories [["releases" {:url           "https://clojars.org/repo"
                              :sign-releases false
                              :username      :env/clojars_username
                              :password      :env/clojars_password}]
                 ["snapshots" {:url           "https://clojars.org/repo"
                               :sign-releases false
                               :username      :env/clojars_username
                               :password      :env/clojars_password}]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :eval-in-leiningen true)
