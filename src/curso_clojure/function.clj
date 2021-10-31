(ns curso-clojure.function)

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100)
  )

(defn mais-caro-que-100? [valor-bruto] (> valor-bruto 100))

; funcao anonima
;(fn [valor-bruto] (> valor-bruto 100))

(defn valor-descontado
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto)
      )
    valor-bruto
    )
  )

(def precos [100 150 200 300 400])

(println precos)

(println (map valor-descontado precos))

(println (filter aplica-desconto? precos))
;(println (valor-descontado 1000))

;(println "---------------------------")
;(println "Utilizando funcoes anonimas")
;(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
;(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
;;funcao anonima apenas com um parametro
;(println (valor-descontado #(> %1 100) 1000))
;(println (valor-descontado #(> % 100) 100))


