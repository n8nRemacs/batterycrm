package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class DirectionSignToponym implements Serializable {
    private DirectionSignStyle style;
    private String text;

    public DirectionSignToponym(@N String str, @N DirectionSignStyle directionSignStyle) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        if (directionSignStyle == null) {
            throw new IllegalArgumentException("Required field \"style\" cannot be null");
        }
        this.text = str;
        this.style = directionSignStyle;
    }

    @N
    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @N
    public String getText() {
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.text = archive.add(this.text, false);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignToponym() {
    }
}
