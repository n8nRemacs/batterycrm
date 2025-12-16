package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class DirectionSignRoad implements Serializable {
    private String name;
    private DirectionSignStyle style;

    public DirectionSignRoad(@N String str, @N DirectionSignStyle directionSignStyle) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (directionSignStyle == null) {
            throw new IllegalArgumentException("Required field \"style\" cannot be null");
        }
        this.name = str;
        this.style = directionSignStyle;
    }

    @N
    public String getName() {
        return this.name;
    }

    @N
    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignRoad() {
    }
}
