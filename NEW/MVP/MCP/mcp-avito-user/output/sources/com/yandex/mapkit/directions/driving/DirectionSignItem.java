package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class DirectionSignItem implements Serializable {
    private DirectionSignExit exit;
    private DirectionSignIcon icon;
    private DirectionSignRoad road;
    private DirectionSignToponym toponym;

    @N
    public static DirectionSignItem fromExit(@N DirectionSignExit directionSignExit) {
        if (directionSignExit == null) {
            throw new IllegalArgumentException("Variant value \"exit\" cannot be null");
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.exit = directionSignExit;
        return directionSignItem;
    }

    @N
    public static DirectionSignItem fromIcon(@N DirectionSignIcon directionSignIcon) {
        if (directionSignIcon == null) {
            throw new IllegalArgumentException("Variant value \"icon\" cannot be null");
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.icon = directionSignIcon;
        return directionSignItem;
    }

    @N
    public static DirectionSignItem fromRoad(@N DirectionSignRoad directionSignRoad) {
        if (directionSignRoad == null) {
            throw new IllegalArgumentException("Variant value \"road\" cannot be null");
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.road = directionSignRoad;
        return directionSignItem;
    }

    @N
    public static DirectionSignItem fromToponym(@N DirectionSignToponym directionSignToponym) {
        if (directionSignToponym == null) {
            throw new IllegalArgumentException("Variant value \"toponym\" cannot be null");
        }
        DirectionSignItem directionSignItem = new DirectionSignItem();
        directionSignItem.toponym = directionSignToponym;
        return directionSignItem;
    }

    @P
    public DirectionSignExit getExit() {
        return this.exit;
    }

    @P
    public DirectionSignIcon getIcon() {
        return this.icon;
    }

    @P
    public DirectionSignRoad getRoad() {
        return this.road;
    }

    @P
    public DirectionSignToponym getToponym() {
        return this.toponym;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.toponym = (DirectionSignToponym) archive.add((Archive) this.toponym, true, (Class<Archive>) DirectionSignToponym.class);
        this.road = (DirectionSignRoad) archive.add((Archive) this.road, true, (Class<Archive>) DirectionSignRoad.class);
        this.exit = (DirectionSignExit) archive.add((Archive) this.exit, true, (Class<Archive>) DirectionSignExit.class);
        this.icon = (DirectionSignIcon) archive.add((Archive) this.icon, true, (Class<Archive>) DirectionSignIcon.class);
    }
}
