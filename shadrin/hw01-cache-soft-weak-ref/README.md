# Домашнее задание №1
### Использование SoftReference & WeakReference в кэшах

### Цель:
Написать собственную имплементацию кеша с использованием WeakReference & SoftReference

### Описание/Пошаговая инструкция выполнения домашнего задания:
1. Создать структуру данных типа кеш. Кеш должен быть абстрактный. То есть необходимо, чтобы можно было задать ключ 
получения объекта кеша, и, в случае если его нет в памяти, задать поведение загрузки этого объекта в кеш:
- указать кэшируемую директорию
- загрузить содержимое файла в кэш
- получить содержимое файла из кэша

2. Создать программу, эмулирующую поведение данного кэша. Программа должна считывать текстовые файлы из системы и 
выдавать текст при запросе имени файла. Если в кэше файла нет, кэш должен загрузить себе данные. По умолчанию в кеше 
нет ни одного файла. Текстовые файлы должны лежать в одной директории. Пример: Names.txt, Address.txt - файлы в системе. 
При запросе по ключу Names.txt - кеш должен вернуть содержимое файла Names.txt.

3. Создать в папке cache/menu класс Emulator для работы с пользователем. Предоставить пользователю возможности:
- указать кэшируемую директорию
- загрузить содержимое файла в кэш
- получить содержимое файла из кэша"

### Примечание по реализации:
1. Чтобы корректно отработал тест shouldClearSoftRefCache необходимо установить флаг JVM -Xmx10m