package com.missionbit.Actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
public class Snake {


    boolean atkIsActive;
    Rectangle hurtbox;
    Rectangle hitbox;
  Vector2 position;

    Texture img;


    public Snake(int x, int y) {
        img = new Texture("Thug.png");
        hitbox = new Rectangle();
        position = new Vector2(x, y);
        hurtbox = new Rectangle();
        hitbox.set(x, y, img.getWidth(), img.getHeight());
    }

        public void update(){


        if (Gdx.input.justTouched()){
            atkIsActive = true;


        }


//            if (hitbox.contains())

//            int hp = - 10 int hp;






        }

        public void draw(SpriteBatch batch){


            batch.draw(img, position.x, position.y);
        }

    }
