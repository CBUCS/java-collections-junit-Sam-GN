# java-collections-junit-Sam-GN


My idea behind testing is that for each test case, I test the return of the method to
an expected outcome.

LinkedList Testing...................................................................

linkedListNotNull
   new object created
   test true for not being null


linkedListAdd
   test true for myLinkedList.add(1)'s return

linkedListContains
   add 1 to list
   test true for myLinkedList.contains(1)'s return

linkedListContainsAll
   1 and 2 added to list
   1 and 2 added to myList
   test true for myLinkedList.containsAll(myList)'s return

linkedListSize
   test equal to 1 for myLinkedList.size()'s return

linkedListRemove
   add 1 to list
   test equal to 1 for myLinkedList.remove(0)'s return

linkedListClear
   add 1 to list
   clear list
   test equal to 0 for myLinkedList.size()'s return

linkedListIsEmpty
   new object is created
   test true for myLinkedList.isEmpty()'s return

linkedListEquals
   add 1 to list and myList
   test true for myLinkedList.equals(myList)'s return

linkedListRetainAll
   1,2,3 are added to list
   1,2 are added to myList
   test true for myLinkedList.retainAll(myList)'s return


StackTesting........................................................................

stackPush
   test equal to 1 for myStack.push(1)'s return


stackPeak
   add 1 to stack
   test equal to 1 for myStack.peek()'s return

stackSearch
   add 1 to list
   test equal to 1 for myStack.search(1)'s return

stackSize
   add 1 to stack
   test equal to 1 for myStack.size()'s return

stackPop
   add 1 to stack
   test equal to 1 for myStack.pop()'s return

stackIsEmpty
   new object is created
   test true for myStack.isEmpty()'s return


QueueTesting.........................................................................

queueAdd
   test true for myQueue.add(1)'s return

queueElement
   add 1 to queue
   test equal to 1 for myQueue.element()'s return


queueOffer
   add 1 to queue
   test true for yQueue.offer(2)'s return

queuePeak
   new object is created
   test null for myQueue.peek()'s return
   add 1 to queue
   test equal to 1 for myQueue.peek()'s return

queuePoll
   new object is created
   test null for myQueue.poll()'s return
   add 1 to queue
   test equal to 1 for myQueue.poll()'s return
   test equal to 0 for myQueue.size()'s return

queueRemove
   add 1 to queue
   test equal to 1 for myQueue.remove()'s return


SetTesting..........................................................................

setAdd
   test true for mySet.add(1)'s return

setClear
   add 1 and 2 to set
   clear set
   test equal to 0 for mySet.size()'s return

setContains
   add 1 to set
   test true for mySet.contains(1)'s return

setContainsAll
   add 1 and 2 to set and myList
   test true for mySet.containsAll(myList)'s return

setIsEmpty
   new object is created
   test true for mySet.isEmpty()'s return

seEquals
   1 added to set and mySet2
   test true for mySet.equals(mySet2)'s return

setRemove
   add 1 to list
   test true for mySet.remove(1)'s return

setRetainsAll
   add 1 and 2 to set
   add 1 ro mySet2
   test true for mySet.retainAll(mySet2)'s return

setSize
   add 1 to set
   test equal to 1 for mySet.size()'s return


HashMapTesting........................................................................

mapPut
   test null for myMap.put(0,1)'s return (Since previous value for key 0 was null)

mapGet
   put 0,1 into map
   test equal to 1 for myMap.get(0)'s return

mapSize
   put 0,1 into map
   test equal to 1 for myMap.size()'s return

mapClear
   put 0,1 into map
   clear map
   test equal for myMap.size()'s return

mapContainsKey
   put 0,1 into map
   test true for myMap.containsKey(0)'s return

mapContainsValue
   put 0,1 into map
   test true for myMap.containsValue(1)'s return

mapRemove
   put 0,1 into map
   test true for myMap.remove(0,1)'s return

mapIsEmpty
   new object is created
   test true for myMap.isEmpty()'s return

mapReplace
   put 0,1 into map
   test true for myMap.replace(0,1,2)'s return

mapEqual
   put 0,1 into map and myMap2
   test true for myMap.equals(myMap2)'s return

mapCompute
   put 0,1 into map
   test equals to 2 for myMap.compute(0,(k, v) -> v==null ? 1: ++v)
   (if value for key exists, which it does, ++v will be replaced and true will be returned)

