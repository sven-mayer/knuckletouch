# KnuckleTouch
This repository contains the data set and scripts for the MuC '19 paper on "KnuckleTouch: Enabling Knuckle Gestures on Capacitive Touchscreens using Deep Learning".

## Abstract
While mobile devices have become essential for social communication and have paved the way for work on the go, their interactive capabilities are still limited to simple touch input. A promising enhancement for touch interaction is knuckle input but recognizing knuckle gestures robustly and accurately remains challenging. We present a method to differentiate between 17 finger and knuckle gestures based on a long short-term memory (LSTM) machine learning model. Furthermore, we introduce an open source approach that is ready-to-deploy on commodity touch-based devices. The model was trained on a new dataset that we collected in a mobile interaction study with 18 participants. We show that our method can achieve an accuracy of 86.8% on recognizing one of the 17 gestures and an accuracy of 94.6% to differentiate between finger and knuckle. In our evaluation study, we validate our models and found that the LSTM gestures recognizing archived an accuracy of 88.6%. We show that KnuckleTouch can be used to improve the input expressiveness and to provide shortcuts to frequently used functions.

This work can be cited as follows:
<pre>
@inproceedings{Schweigert:2019:KTE,
title = {KnuckleTouch: Enabling Knuckle Gestures on Capacitive Touchscreens using Deep Learning},
author = {Schweigert, Robin and Leusmann, Jan and Hagenmayer, Simon and Weiß, Maximilian and Le, Huy Viet and Mayer, Sven and Bulling, Andreas},
doi = {10.1145/3340764.3340767},
year = {2019},
date = {2019-09-08},
booktitle = {Mensch und Computer},
series = {MuC '19},
location = {Hamburg, Germany},
publisher = {ACM},
address = {New York, NY, USA},
}
</pre>
