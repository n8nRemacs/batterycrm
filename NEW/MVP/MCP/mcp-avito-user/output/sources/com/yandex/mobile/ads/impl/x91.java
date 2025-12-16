package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public interface x91 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f391583a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f391584b;

        /* renamed from: c, reason: collision with root package name */
        public final int f391585c;

        /* renamed from: d, reason: collision with root package name */
        public final int f391586d;

        public a(int i12, int i13, int i14, byte[] bArr) {
            this.f391583a = i12;
            this.f391584b = bArr;
            this.f391585c = i13;
            this.f391586d = i14;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f391583a == aVar.f391583a && this.f391585c == aVar.f391585c && this.f391586d == aVar.f391586d && Arrays.equals(this.f391584b, aVar.f391584b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f391584b) + (this.f391583a * 31)) * 31) + this.f391585c) * 31) + this.f391586d;
        }
    }

    int a(dn dnVar, int i12, boolean z12);

    default void a(int i12, pr0 pr0Var) {
        b(i12, pr0Var);
    }

    void a(long j12, int i12, int i13, int i14, @j.P a aVar);

    void a(vw vwVar);

    default int b(dn dnVar, int i12, boolean z12) {
        return a(dnVar, i12, z12);
    }

    void b(int i12, pr0 pr0Var);
}
