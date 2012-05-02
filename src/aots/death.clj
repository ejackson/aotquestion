(ns aots.death)

(defrecord Dontwork [a])

(= (class (Dontwork. nil))
   (class (merge (Dontwork. nil) {:a 1})))
;; true

(= (class (Dontwork. nil))
   (class (map->Dontwork {:a 1})))
;; **FALSE** as this namespace it AOT complied
