package com.yandex.mapkit.road_events_layer;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public class TextStyle implements Serializable {
    private int color;
    private boolean color__is_initialized;
    private float fontSize;
    private boolean fontSize__is_initialized;
    private NativeObject nativeObject;
    private Integer outlineColor;
    private boolean outlineColor__is_initialized;

    public TextStyle() {
        this.fontSize__is_initialized = false;
        this.color__is_initialized = false;
        this.outlineColor__is_initialized = false;
    }

    private native int getColor__Native();

    private native float getFontSize__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events_layer::TextStyle";
    }

    private native Integer getOutlineColor__Native();

    private native NativeObject init(float f12, int i12, Integer num);

    public synchronized int getColor() {
        try {
            if (!this.color__is_initialized) {
                this.color = getColor__Native();
                this.color__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.color;
    }

    public synchronized float getFontSize() {
        try {
            if (!this.fontSize__is_initialized) {
                this.fontSize = getFontSize__Native();
                this.fontSize__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.fontSize;
    }

    @P
    public synchronized Integer getOutlineColor() {
        try {
            if (!this.outlineColor__is_initialized) {
                this.outlineColor = getOutlineColor__Native();
                this.outlineColor__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.outlineColor;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFontSize());
            archive.add(getColor());
            archive.add(getOutlineColor(), true);
            return;
        }
        this.fontSize = archive.add(this.fontSize);
        this.fontSize__is_initialized = true;
        this.color = archive.add(this.color);
        this.color__is_initialized = true;
        Integer numAdd = archive.add(this.outlineColor, true);
        this.outlineColor = numAdd;
        this.outlineColor__is_initialized = true;
        this.nativeObject = init(this.fontSize, this.color, numAdd);
    }

    public TextStyle(float f12, int i12, @P Integer num) {
        this.fontSize__is_initialized = false;
        this.color__is_initialized = false;
        this.outlineColor__is_initialized = false;
        this.nativeObject = init(f12, i12, num);
        this.fontSize = f12;
        this.fontSize__is_initialized = true;
        this.color = i12;
        this.color__is_initialized = true;
        this.outlineColor = num;
        this.outlineColor__is_initialized = true;
    }

    private TextStyle(NativeObject nativeObject) {
        this.fontSize__is_initialized = false;
        this.color__is_initialized = false;
        this.outlineColor__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
