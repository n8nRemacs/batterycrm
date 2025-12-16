package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class DirectionSignIcon implements Serializable {
    private DirectionSignImage image;
    private DirectionSignStyle style;

    public DirectionSignIcon(@N DirectionSignImage directionSignImage, @N DirectionSignStyle directionSignStyle) {
        if (directionSignImage == null) {
            throw new IllegalArgumentException("Required field \"image\" cannot be null");
        }
        if (directionSignStyle == null) {
            throw new IllegalArgumentException("Required field \"style\" cannot be null");
        }
        this.image = directionSignImage;
        this.style = directionSignStyle;
    }

    @N
    public DirectionSignImage getImage() {
        return this.image;
    }

    @N
    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.image = (DirectionSignImage) archive.add((Archive) this.image, false, (Class<Archive>) DirectionSignImage.class);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignIcon() {
    }
}
