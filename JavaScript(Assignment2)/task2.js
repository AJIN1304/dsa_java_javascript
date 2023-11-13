// Perform sorting of an array in descending order. 

 //METHOD-1 using compare function

 /*
 const arr = [3, 10, 4, 21, 5, 9, 2, 6, 5, 3, 5];

 Descending Order
 arr.sort((a, b) => b - a);
 console.log(arr); // Output: [21,10,9,6,5,5,5,4,3,3,2]

 */



 
//METHOD-2  sorting algoritham

/*
function bubbleSort(array) {
    var done = false;
    while (!done) {
      done = true;
      for (var i = 1; i < array.length; i += 1) {
        if (array[i - 1] < array[i]) {
          done = false;
          var tmp = array[i - 1];
          array[i - 1] = array[i];
          array[i] = tmp;
        }
      }
    }

    return array;
  }

  var numbers = [12, 10, 15, 110, 14, 13, 16];
  bubbleSort(numbers);
  console.log(numbers);

*/