(ns curso-clojure.vetores)

(def precos [30 70 1000])

(println (precos 0))

;return error indexOutOfBounds Exception
;(println (precos 3))

; se nao existe, retorna nil. o get faz um tratamento
(println (get precos 3))
; valor default = 0 caso nao exista
(println (get precos 3 0))

;atualizar o primeiro elemento e retorna um novo vetor
(def precos-inc (update precos 0 inc))
(def precos-dec (update precos 1 dec))
(println precos-inc)
(println precos-dec)
(println precos)

(defn soma-1
  [valor]
  (+ valor 1)
  )
(println (update precos 2 soma-1))