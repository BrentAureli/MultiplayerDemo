package com.brentaureli.multiplayerdemo.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by brentaureli on 12/14/15.
 */
public class Starship extends Sprite {
    Vector2 previousPosition;
    public Starship(Texture texture){
        super(texture);
        previousPosition = new Vector2(getX(), getY());

    }

    public boolean hasMoved(){
        if(previousPosition.x != getX() || previousPosition.y != getY()){
            previousPosition.x = getX();
            previousPosition.y = getY();
            return true;
        }
        return false;
    }

}
