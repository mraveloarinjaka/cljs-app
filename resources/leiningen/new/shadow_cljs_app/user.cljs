(ns cljs.user)

(extend-type js/Symbol
  IPrintWithWriter
  (-pr-writer [obj writer _]
    (write-all writer (str "#object[" (.toString obj) "]"))))
