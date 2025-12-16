package com.yandex.runtime.i18n;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes8.dex */
public class CanonicalUnit implements Serializable {
    private String unit;
    private double value;

    public CanonicalUnit(@N String str, double d12) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"unit\" cannot be null");
        }
        this.unit = str;
        this.value = d12;
    }

    @N
    public String getUnit() {
        return this.unit;
    }

    public double getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.unit = archive.add(this.unit, false);
        this.value = archive.add(this.value);
    }

    public CanonicalUnit() {
    }
}
