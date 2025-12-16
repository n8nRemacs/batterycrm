package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes6.dex */
public final class w extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f362170b;

    public w(String str) {
        this.f362170b = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f362170b);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f362170b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        Object obj2 = ((w) obj).f362170b;
        String str = this.f362170b;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f362170b);
    }

    public final int hashCode() {
        return this.f362170b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f362170b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f362170b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f362170b;
    }
}
