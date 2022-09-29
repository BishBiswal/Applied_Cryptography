# Cryptographic Protocols
step by step procedure involvs Crypto algo to get a goal.
you can not change it
do not roll your own crypto

properties of crypto protocol:
==============================
Privacy
integrity : prevent malicious corruption of data by bad actors
Authentication : id verification
Non-Repudiation: You can not say that I did not do it
Access control: you get access to the data

Types of Crypto Protocol :
==========================
Arbitrated: 3rd paty , Trusted person
Adjudicated : Judge(3rd party) after process is done
Self Enforcing: Every step in the process is verified
Example:
========
And the assumption is Alice knows Bob's public key, okay? Now, this sounds good. That is this is just a random number. It's a challenge response, but this random number has no information in it. Bob just encrypts it with his private key. The private key is not exposed. This final thing comes in and Alice upon getting this number can decrypt it using the public key.


Alice is being crafty picked up a document. Calculated the hash of that document. Nice random looking number, sent that to Bob. Bob returns it encrypted. What is Alice do? Got Bob to sign the document. This is the same procedure as digital signatures. So this is completely broken or Alice could be doing something else. Alice found that Carol has been emailing Bob and Carol is sending her private messages encrypted with Bob's public key, so that Bob can read them. So Alice grabs a copy of that encrypted message. So nice looking random number since the random number over to Bob. Bob decrypts the message. So Alice gets what did Carol tell Bob, she gets to know that. So these are the attacks that can happen.

Solution:
Alice could send a random number encrypted with Bob's public key. I'll just write pub and R1 and R2. And Bob will find R1 and then send back R2 encrypted with R1. This is symmetric. And here, Alice gets ahold of R2 and finds that's the are two she sent, but it came in an encrypted form and only Bob can do it.
