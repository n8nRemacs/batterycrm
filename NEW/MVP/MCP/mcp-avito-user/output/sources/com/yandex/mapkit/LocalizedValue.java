package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class LocalizedValue implements Serializable {
    private String text;
    private double value;

    public LocalizedValue(double d12, @N String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        this.value = d12;
        this.text = str;
    }

    @N
    public String getText() {
        return this.text;
    }

    public double getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value);
        this.text = archive.add(this.text, false);
    }

    public LocalizedValue() {
    }
}
