[![Build Status](https://travis-ci.org/Artyom16RUS/Preemptive_cache.svg?branch=master)](https://travis-ci.org/Artyom16RUS/Preemptive_cache) [![codecov](https://codecov.io/gh/Artyom16RUS/Preemptive_cache/branch/master/graph/badge.svg)](https://codecov.io/gh/Artyom16RUS/Preemptive_cache)
## _Preemptive cache_

* #### Вытесняющий кэш для высоконагруженной системы.

Введение:

Из известных алгоритмов (OPT), FIFO, LRU, SNLRU, LFU, Q2, MQ и исходя из задания, на мой взгялд самая простая и 
производительная реализация без экономии памяти, будет по алгоритму LRU. 

Что умеет делать:
- Добавляет объект или перезаписывает если такой объект уже есть в кэш.
- Передвигает в начало списка объект который был использован в данный момент.
- Вытесняет дольше всех не успользованый объект.
- LRU в многопоточной среде.

Что реализованно:
- Код написан согласно стандарту  _[wikipedia](https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D1%8B_%D0%BA%D1%8D%D1%88%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F#Least_recently_used_(%D0%92%D1%8B%D1%82%D0%B5%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5_%D0%B4%D0%B0%D0%B2%D0%BD%D0%BE_%D0%BD%D0%B5%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D1%83%D0%B5%D0%BC%D1%8B%D1%85))_
- Код покрыт JUnit тестами.
- Код покрыт нагрузочными BenchMark тестами.





