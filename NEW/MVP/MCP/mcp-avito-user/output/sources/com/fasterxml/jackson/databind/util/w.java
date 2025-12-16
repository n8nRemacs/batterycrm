package com.fasterxml.jackson.databind.util;

import androidx.compose.foundation.H;

/* compiled from: PrimitiveArrayBuilder.java */
/* loaded from: classes4.dex */
public abstract class w<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f342639a;

    /* renamed from: b, reason: collision with root package name */
    public a<T> f342640b;

    /* renamed from: c, reason: collision with root package name */
    public a<T> f342641c;

    /* renamed from: d, reason: collision with root package name */
    public int f342642d;

    /* compiled from: PrimitiveArrayBuilder.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f342643a;

        /* renamed from: b, reason: collision with root package name */
        public final int f342644b;

        /* renamed from: c, reason: collision with root package name */
        public a<T> f342645c;

        public a(T t12, int i12) {
            this.f342643a = t12;
            this.f342644b = i12;
        }
    }

    public abstract T a(int i12);

    public final Object b(int i12, Object obj) {
        a<T> aVar = new a<>(obj, i12);
        if (this.f342640b == null) {
            this.f342641c = aVar;
            this.f342640b = aVar;
        } else {
            a<T> aVar2 = this.f342641c;
            if (aVar2.f342645c != null) {
                throw new IllegalStateException();
            }
            aVar2.f342645c = aVar;
            this.f342641c = aVar;
        }
        this.f342642d += i12;
        return a(i12 < 16384 ? i12 + i12 : i12 + (i12 >> 2));
    }

    public final Object c(int i12, Object obj) {
        int i13 = this.f342642d + i12;
        T tA2 = a(i13);
        int i14 = 0;
        for (a<T> aVar = this.f342640b; aVar != null; aVar = aVar.f342645c) {
            T t12 = aVar.f342643a;
            int i15 = aVar.f342644b;
            System.arraycopy(t12, 0, tA2, i14, i15);
            i14 += i15;
        }
        System.arraycopy(obj, 0, tA2, i14, i12);
        int i16 = i14 + i12;
        if (i16 == i13) {
            return tA2;
        }
        throw new IllegalStateException(H.j(i13, i16, "Should have gotten ", " entries, got "));
    }

    public final T d() {
        a<T> aVar = this.f342641c;
        if (aVar != null) {
            this.f342639a = aVar.f342643a;
        }
        this.f342641c = null;
        this.f342640b = null;
        this.f342642d = 0;
        T t12 = this.f342639a;
        return t12 == null ? a(12) : t12;
    }
}
