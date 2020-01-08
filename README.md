[![Build Status](https://travis-ci.com/Artyom16RUS/Preemptive_cahe.svg?branch=master)](https://travis-ci.com/Artyom16RUS/Preemptive_cahe) [![codecov](https://codecov.io/gh/Artyom16RUS/Preemptive_cahe/branch/master/graph/badge.svg)](https://codecov.io/gh/Artyom16RUS/Preemptive_cahe)
## _Preemptive cache_

* #### Вытесняющий кэш для высоконагруженной системы.

Введение:

Из известных алгоритмов (OPT), FIFO, LRU, SNLRU, LFU, Q2, MQ и исходя из задания, на мой взгялд самая простая и 
производительная реализация без экономии памяти, будет по алгоритму LRU. 

Что умеет делать:
- Добавляет объект или перезаписывает если такой объект уже есть в кэш.
- Передвигает в начало списка объект который был использован в данный момент.
- Вытесняет дольше всех не успользованый объект.

Что реализованно:
- Код написан согласно стандарту  _[wikipedia](https://en.wikipedia.org/wiki/Cache_replacement_policies#Least_recently_used_(LRU))_
- API документировано в Java DOC.
- Код покрыт JUnit тестами.
- Код покрыт нагрузочными BenchMark тестами.





