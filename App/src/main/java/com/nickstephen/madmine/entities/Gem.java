package com.nickstephen.madmine.entities;

import android.content.Context;

import com.nickstephen.gamelib.opengl.layout.Container;
import com.nickstephen.madmine.map.Map;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Ben on 22/04/2014.
 */
public class Gem extends GenericItem {
    static final short SUBTYPE = 0x4;

    // TODO: Gem class.
    Gem(@NotNull Context context, @NotNull Container parent, @NotNull Map map, int x, int y) {
        super(map, x, y);
    }
}
