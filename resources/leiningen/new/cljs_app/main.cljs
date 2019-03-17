(ns {{name}}.main)

(defn mount-app! []
  (let [app (.getElementById js/document "app")
        parent (.-parentElement app)]
    (.insertAdjacentHTML app "afterbegin" "<h1>FIXME</h1>")))

(defn ^:export init []
  (mount-app!)
  (js/console.log "application mounted"))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))

(defn ^:dev/after-load start []
  (js/console.log "start"))

(comment
  (js/alert "Welcome, you are good to go!"))
