package com.google.common.primitives;

import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* compiled from: UnsignedInteger.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class v extends Number implements Comparable<v> {

    /* renamed from: b, reason: collision with root package name */
    public final int f360421b;

    static {
        new v(0);
        new v(1);
        new v(-1);
    }

    public v(int i12) {
        this.f360421b = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(v vVar) {
        v vVar2 = vVar;
        vVar2.getClass();
        int i12 = this.f360421b ^ BeduinInputModel.MIN_TEXT_VERSION;
        int i13 = vVar2.f360421b ^ BeduinInputModel.MIN_TEXT_VERSION;
        if (i12 < i13) {
            return -1;
        }
        return i12 > i13 ? 1 : 0;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(@I41.a Object obj) {
        return (obj instanceof v) && this.f360421b == ((v) obj).f360421b;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.f360421b;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f360421b;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f360421b & 4294967295L;
    }

    public final String toString() {
        return Long.toString(this.f360421b & 4294967295L, 10);
    }
}
