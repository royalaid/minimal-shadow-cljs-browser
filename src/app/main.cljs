
(ns app.main
  (:require [app.lib :as lib]
            [reagent.core :as r]))

(def a 1)

(defonce b 2)

(defonce greeting "Hello")
(def who "WORld")

(defn app []
  [:div greeting " " who])

(defn ^:dev/after-load main! []
  (r/render [app]
            (.getElementById js/document "app"))
  (println "[main]: loading"))

(defn reload! []
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b))
