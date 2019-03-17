(defproject shadow-cljs-app/lein-template "1.0.0-SNAPSHOT"
  :description "boilerplate to setup a clojurescript project built using shadow-cljs"
  :url "https://github.com/mraveloarinjaka/cljs-app"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-2.0"}
  :repositories [["releases" {:url "https://repo.clojars.org"
                               :username [:env/clojars_username]
                               :password [:env/clojars_password]}]
                 ["snapshots" {:url "https://repo.clojars.org"
                               :username [:env/clojars_username]
                               :password [:env/clojars_password]}]]
  :eval-in-leiningen true)
