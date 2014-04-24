package com.nickstephen.madmine.entities;

import com.nickstephen.madmine.util.Position;

/**
 * Created by Ben on 22/04/2014.
 */
public class Spider extends GenericNPC{
    void onTick(){
        // TODO: Kill player?  I think this is done elsewhere though so maybe not required here.
        moveAttempt();
    }

    void moveAttempt(){
        // TODO: Spider movement.
        /*
        The spider should move anticlockwise around a space.
        From where it is placed, the spider should walk one step forwards, then wait 2/3 sec.
        If the spider can't walk forwards, it should turn right, then wait 2/3 sec.
         */

        // Sets the desired position to be the space directly in front of the spider.
        Position desiredPos = this.pos.getRelPos(directionFacing);
        // This is meant to check to see if the space can be moved into.
        if (desiredPos.emptySpace()) {
            // Moves the spider forward one block if there is room.
            moveEntity(this, desiredPos);
        }
        else {
            // If there is no room for the spider to move forwards, it turns pi/2 clockwise.
            // TODO: Will this turn the spider, or do I have to go this.directionFacing = this.directionFacing.rotateClockwise()?
            this.directionFacing = this.directionFacing.rotateClockwise();
        }


    }

}
