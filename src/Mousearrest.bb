;		Mousearesst - Press ESC to end & release
;
;		USECASE : If you just want to double click to lock and clean your mouse
;       		  actually also traps your keyboard except for the escape key
;
;          		  happy cleaning
;
;		(c)1/2023 by WS/Genesis*Project
;
;		Blitz3D 1.108 Syntax -- Written in IDEal 0.8.94
;
;		https://github.com/wertstahl/Mousearrest
;

		AppTitle "Mousearrest v1.0  [Esc] quits"
		;Create graphics window
		Graphics 555,555,16,2

		;Initialize countdown
		countdown = 2800 ;how many ticks before automatic end of program



.loop
		;Clear the screen
		Cls
		;Print application title on the sceen
		Color 0,255,0 : Text 10, 10, "MOUSEARREST - MOUSE TEMPORARILY LOCKED" 
		;Print countdown on the screen
		Color 255,255,0 : Text 10, 30, "Countdown to auto-release: " + Str(countdown) 
		;Print message on the screen
		Color 0,255,255 : Text 165,360,"Press <esc> to release mouse"

		;Decrement countdown
		countdown = countdown - 1

		a = 0

.ticloop
		VWait ;frame delay

		;The actual arrest of the mouse
		MoveMouse 252,252

		;Check for user input
		key=GetKey()
		;Was the Escape Key Pressed?
		If key=27 Then Goto outmouse 
		;Has the countdown reached zero?
		If countdown < 1 Then Goto outmouse
  
		a = a +1
		If a < 60 Then Goto ticloop


		Goto loop


		;Freedom!
.outmouse
		End     ;Release mouse and close graphics window

;-------------EOF

;~IDEal Editor Parameters:
;~C#Blitz3D