package com.fasterxml.jackson.databind.util;

import androidx.compose.foundation.H;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: ObjectBuffer.java */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public r<Object[]> f342635a;

    /* renamed from: b, reason: collision with root package name */
    public r<Object[]> f342636b;

    /* renamed from: c, reason: collision with root package name */
    public int f342637c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f342638d;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i12, int i13, Object obj, Object[] objArr) {
        int i14 = 0;
        for (r rVar = this.f342635a; rVar != null; rVar = rVar.f342627b) {
            Object[] objArr2 = (Object[]) rVar.f342626a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i14, length);
            i14 += length;
        }
        System.arraycopy(objArr, 0, obj, i14, i13);
        int i15 = i14 + i13;
        if (i15 != i12) {
            throw new IllegalStateException(H.j(i12, i15, "Should have gotten ", " entries, got "));
        }
    }

    public final void b() {
        r<Object[]> rVar = this.f342636b;
        if (rVar != null) {
            this.f342638d = rVar.f342626a;
        }
        this.f342636b = null;
        this.f342635a = null;
        this.f342637c = 0;
    }

    public final Object[] c(Object[] objArr) {
        r rVar = new r(objArr, null);
        if (this.f342635a == null) {
            this.f342636b = rVar;
            this.f342635a = rVar;
        } else {
            r<Object[]> rVar2 = this.f342636b;
            if (rVar2.f342627b != null) {
                throw new IllegalStateException();
            }
            rVar2.f342627b = rVar;
            this.f342636b = rVar;
        }
        int length = objArr.length;
        this.f342637c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object[] objArr, int i12, ArrayList arrayList) {
        int i13;
        r rVar = this.f342635a;
        while (true) {
            i13 = 0;
            if (rVar == null) {
                break;
            }
            Object[] objArr2 = (Object[]) rVar.f342626a;
            int length = objArr2.length;
            while (i13 < length) {
                arrayList.add(objArr2[i13]);
                i13++;
            }
            rVar = rVar.f342627b;
        }
        while (i13 < i12) {
            arrayList.add(objArr[i13]);
            i13++;
        }
        b();
    }

    public final Object[] e(int i12, Object[] objArr) {
        int i13 = this.f342637c + i12;
        Object[] objArr2 = new Object[i13];
        a(i13, i12, objArr2, objArr);
        b();
        return objArr2;
    }

    public final <T> T[] f(Object[] objArr, int i12, Class<T> cls) {
        int i13 = this.f342637c + i12;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i13));
        a(i13, i12, tArr, objArr);
        b();
        return tArr;
    }

    public final Object[] g() {
        b();
        Object[] objArr = this.f342638d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f342638d = objArr2;
        return objArr2;
    }

    public final Object[] h(int i12, Object[] objArr) {
        b();
        Object[] objArr2 = this.f342638d;
        if (objArr2 == null || objArr2.length < i12) {
            this.f342638d = new Object[Math.max(12, i12)];
        }
        System.arraycopy(objArr, 0, this.f342638d, 0, i12);
        return this.f342638d;
    }
}
