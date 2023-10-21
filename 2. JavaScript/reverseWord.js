const str = "This is a sunny day";
const reversedSentence = reverseWordString(str);


function reverseWordString(str) {
    const words = str.split(' ');

    const reversedWords = [];
    for (let i = 0; i < words.length; i++) {
        let word = words[i];

        const revWord = reverseWord(word);
        reversedWords.push(revWord);
    }

    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseWord(word) {
    const characters = word.split('');
    const revChar = characters.reverse();
    return revChar.join('');
}

console.log(reversedSentence);
