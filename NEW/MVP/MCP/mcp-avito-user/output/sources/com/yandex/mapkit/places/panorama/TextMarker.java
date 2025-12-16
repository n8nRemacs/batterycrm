package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class TextMarker implements Serializable {
    private Direction angularPosition;
    private boolean angularPosition__is_initialized;
    private String fullLabel;
    private boolean fullLabel__is_initialized;
    private NativeObject nativeObject;
    private String shortLabel;
    private boolean shortLabel__is_initialized;

    public TextMarker() {
        this.angularPosition__is_initialized = false;
        this.shortLabel__is_initialized = false;
        this.fullLabel__is_initialized = false;
    }

    private native Direction getAngularPosition__Native();

    private native String getFullLabel__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::TextMarker";
    }

    private native String getShortLabel__Native();

    private native NativeObject init(Direction direction, String str, String str2);

    @N
    public synchronized Direction getAngularPosition() {
        try {
            if (!this.angularPosition__is_initialized) {
                this.angularPosition = getAngularPosition__Native();
                this.angularPosition__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.angularPosition;
    }

    @N
    public synchronized String getFullLabel() {
        try {
            if (!this.fullLabel__is_initialized) {
                this.fullLabel = getFullLabel__Native();
                this.fullLabel__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.fullLabel;
    }

    @N
    public synchronized String getShortLabel() {
        try {
            if (!this.shortLabel__is_initialized) {
                this.shortLabel = getShortLabel__Native();
                this.shortLabel__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.shortLabel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAngularPosition(), false, (Class<Archive>) Direction.class);
            archive.add(getShortLabel(), false);
            archive.add(getFullLabel(), false);
            return;
        }
        this.angularPosition = (Direction) archive.add((Archive) this.angularPosition, false, (Class<Archive>) Direction.class);
        this.angularPosition__is_initialized = true;
        this.shortLabel = archive.add(this.shortLabel, false);
        this.shortLabel__is_initialized = true;
        String strAdd = archive.add(this.fullLabel, false);
        this.fullLabel = strAdd;
        this.fullLabel__is_initialized = true;
        this.nativeObject = init(this.angularPosition, this.shortLabel, strAdd);
    }

    public TextMarker(@N Direction direction, @N String str, @N String str2) {
        this.angularPosition__is_initialized = false;
        this.shortLabel__is_initialized = false;
        this.fullLabel__is_initialized = false;
        if (direction == null) {
            throw new IllegalArgumentException("Required field \"angularPosition\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"shortLabel\" cannot be null");
        }
        if (str2 != null) {
            this.nativeObject = init(direction, str, str2);
            this.angularPosition = direction;
            this.angularPosition__is_initialized = true;
            this.shortLabel = str;
            this.shortLabel__is_initialized = true;
            this.fullLabel = str2;
            this.fullLabel__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"fullLabel\" cannot be null");
    }

    private TextMarker(NativeObject nativeObject) {
        this.angularPosition__is_initialized = false;
        this.shortLabel__is_initialized = false;
        this.fullLabel__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
