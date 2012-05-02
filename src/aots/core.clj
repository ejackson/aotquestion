(ns aots.core)

(defrecord AOT [a])

(= (class (AOT. nil))
   (class (merge (AOT. nil) {:a 1})))
;; true

(= (class (AOT. nil))
   (class (map->AOT {:a 1})))
;; true as this namespace is not AOT compiled
