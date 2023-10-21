const array = [5, 2, 9, 1, 5, 8];
  const sortedArray = arrayDescending(array);

function arrayDescending(array) {
    
    array.sort(function(a, b) {
      return b - a;
    });
    return array;
  }
  
  
  console.log(sortedArray);
  