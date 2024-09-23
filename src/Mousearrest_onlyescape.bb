;		Mousearrest - Press ESC to end & release -- No Vblank more strict version
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

		AppTitle "Mousearrest v1.1 NOTIMER   [Esc] quits"
		;Create graphics window
		Graphics 555,555,16,2

		;Initialize countdown
		;countdown = 2800 ;how many ticks before automatic end of program



		;Clear the screen
		Color 0,0,0
		Rect 0,0,555,555,1

		;Print application title on the sceen
		Color 0,255,0 : Locate 10, 10 : Print "MOUSEARREST - MOUSE AND KEYBOARD TEMPORARILY LOCKED" 
		;Print countdown on the screen
		;Color 255,255,0 : Locate 10, 30 : Print "Countdown to auto-release: " + Str(countdown) 
		;Print message on the screen
		Color 0,255,255 : Locate 165,360 : Print "Press <esc> to release mouse"
		Color 0,255,255 : Locate 138,380 : Print "(Window might hang a while, sorry.)"

.loop
		;Check for user input
		;Was the Escape Key Pressed?
		
		If (GetKey())=27 Then Goto released 

		;The actual arrest of the mouse

		Color 0,0,0 : Locate 255,200 : Print "<ESC>"

		MoveMouse 252,252

		Color 0,255,0 : Locate 255,200 : Print "<ESC>"

		Goto loop

;---------------------------------------------------------------------------


.released	End

;-------------EOF

;~IDEal Editor Parameters:
;~C#Blitz3D