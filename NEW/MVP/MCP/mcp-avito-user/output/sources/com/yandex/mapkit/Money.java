package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Money implements Serializable {
    private String currency;
    private String text;
    private double value;

    public Money(double d12, @N String str, @N String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"currency\" cannot be null");
        }
        this.value = d12;
        this.text = str;
        this.currency = str2;
    }

    @N
    public String getCurrency() {
        return this.currency;
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
        this.currency = archive.add(this.currency, false);
    }

    public Money() {
    }
}
