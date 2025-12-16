package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: CompactStringObjectMap.java */
/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f342608e = new h(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f342609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342610c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f342611d;

    public h(int i12, int i13, Object[] objArr) {
        this.f342609b = i12;
        this.f342610c = i13;
        this.f342611d = objArr;
    }

    public final Object a(String str) {
        int iHashCode = str.hashCode();
        int i12 = this.f342609b;
        int i13 = iHashCode & i12;
        int i14 = i13 << 1;
        Object[] objArr = this.f342611d;
        Object obj = objArr[i14];
        if (obj == str || str.equals(obj)) {
            return objArr[i14 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i15 = i12 + 1;
        int i16 = ((i13 >> 1) + i15) << 1;
        Object obj2 = objArr[i16];
        if (str.equals(obj2)) {
            return objArr[i16 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i17 = (i15 + (i15 >> 1)) << 1;
        int i18 = this.f342610c + i17;
        while (i17 < i18) {
            Object obj3 = objArr[i17];
            if (obj3 == str || str.equals(obj3)) {
                return objArr[i17 + 1];
            }
            i17 += 2;
        }
        return null;
    }
}
