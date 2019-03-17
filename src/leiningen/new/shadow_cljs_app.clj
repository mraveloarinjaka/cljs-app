(ns leiningen.new.cljs-app
  (:require [leiningen.new.templates :refer [renderer sanitize name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-app"))

(defn cljs-app
  "Generate boilerplate code to setup a clojurescript project built using shadow-cljs"
  [name]
  (let [data {:name name
              :sanitized-name (sanitize name)
              :sanitized-path (name-to-path name)}]
    (main/info "Generating fresh clojurescript project.")
    (->files data
             ["shadow-cljs.edn" (render "shadow-cljs.edn" data)]
             ["package.json" (render "package.json" data)]
             ["resources/public/index.html" (render "index.html" data)]
             "src/main"
             ["src/main/{{sanitized-path}}/main.cljs" (render "main.cljs" data)]
             "src/dev"
             ["src/dev/cljs/user.cljs" (render "user.cljs" data)]
             "src/test")))
