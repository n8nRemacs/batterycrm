package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ToponymPhrase implements Serializable {
    private NativeObject nativeObject;
    private String text;
    private boolean text__is_initialized;

    public ToponymPhrase() {
        this.text__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::ToponymPhrase";
    }

    private native String getText__Native();

    private native NativeObject init(String str);

    @N
    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getText(), false);
            return;
        }
        String strAdd = archive.add(this.text, false);
        this.text = strAdd;
        this.text__is_initialized = true;
        this.nativeObject = init(strAdd);
    }

    public ToponymPhrase(@N String str) {
        this.text__is_initialized = false;
        if (str != null) {
            this.nativeObject = init(str);
            this.text = str;
            this.text__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"text\" cannot be null");
    }

    private ToponymPhrase(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
