/*
 Take a sentence as an input and reverse every word in that sentence. 
 Example - This is a sunny day > sihT si a ynnus yad. 
*/


//  METHOD-1
/*
(using built in method)
const str = 'Hello World how is it outside';
const reverseSentence = str => {
   const arr = str.split(" ");
   const reversed = arr.map(el => {
      return el.split('').reverse().join("");
   });
   return reversed.join(" ");
};
console.log(reverseSentence(str));
*/



//METHOD-2  Use a For Loop to Reverse Each Word of the String

// Original String
const str = "This is a sunny day";

// Get words from string
const arr = str.split(' ');

// Loop through each word
for(let i = 0; i < arr.length; i++){
    
    // Current word
    let word = arr[i];
    
    // Create an empty string to store reversed word
    let result = "";
    
    // Loop through current word string
    for(let j = word.length - 1; j >= 0; j--){
        
        // Join each character of original word
        // in a reversed manner
        result = result + word[j];
        
    }
    
    // Replace original word with the reversed word
    arr[i] = result;
    
}

// Join back each reversed word with a space character(' ')
const ans = arr.join(' ');

// Print the result
console.log(ans);

