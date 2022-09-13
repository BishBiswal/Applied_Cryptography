# Modes of encryption?

Electronic code book:-
The user takes the first block of plaintext and encrypts it with the key to produce the first block of ciphertext.
He then takes the second block of plaintext and follows the same process with same key and so on so forth.

![image](https://user-images.githubusercontent.com/112304474/189990912-e61082eb-fa48-4070-85f0-6dd949cf61f4.png)

Cipher Block Chaining (CBC):-

CBC mode of operation provides message dependence for generating ciphertext and makes the system non-deterministic.

The operation of CBC mode is depicted in the following illustration. The steps are as follows −

Load the n-bit Initialization Vector (IV) in the top register.

XOR the n-bit plaintext block with data value in top register.

Encrypt the result of XOR operation with underlying block cipher with key K.

Feed ciphertext block into top register and continue the operation till all plaintext blocks are processed.

For decryption, IV data is XORed with first ciphertext block decrypted. The first ciphertext block is also fed into to register replacing IV for decrypting next ciphertext block.


Cipher Feedback (CFB):-

The operation of CFB mode is depicted in the following illustration. For example, in the present system, a message block has a size ‘s’ bits where 1 < s < n. The CFB mode requires an initialization vector (IV) as the initial random n-bit input block. The IV need not be secret. Steps of operation are −

Load the IV in the top register.

Encrypt the data value in top register with underlying block cipher with key K.

Take only ‘s’ number of most significant bits (left bits) of output of encryption process and XOR them with ‘s’ bit plaintext message block to generate ciphertext block.

Feed ciphertext block into top register by shifting already present data to the left and continue the operation till all plaintext blocks are processed.

Essentially, the previous ciphertext block is encrypted with the key, and then the result is XORed to the current plaintext block.

Similar steps are followed for decryption. Pre-decided IV is initially loaded at the start of decryption.

CFB Mode

* How can I create a stream cipher from a block cipher?
Apparently, CFB mode is converting a block cipher into a type of stream cipher. The encryption algorithm is used as a key-stream generator to produce key-stream that is placed in the bottom register. This key stream is then XORed with the plaintext as in case of stream cipher.
