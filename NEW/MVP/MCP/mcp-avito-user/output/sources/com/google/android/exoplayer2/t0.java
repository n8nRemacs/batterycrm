package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;
import com.google.common.collect.AbstractC37401r1;
import java.util.Arrays;

/* compiled from: Tracks.java */
/* loaded from: classes6.dex */
public final class t0 implements InterfaceC36525h {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f346708c = new t0(AbstractC37401r1.C());

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37401r1<a> f346709b;

    /* compiled from: Tracks.java */
    public static final class a implements InterfaceC36525h {

        /* renamed from: b, reason: collision with root package name */
        public final int f346710b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.V f346711c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f346712d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f346713e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean[] f346714f;

        public a(com.google.android.exoplayer2.source.V v12, boolean z12, int[] iArr, boolean[] zArr) {
            int i12 = v12.f346148b;
            this.f346710b = i12;
            boolean z13 = false;
            C36585a.b(i12 == iArr.length && i12 == zArr.length);
            this.f346711c = v12;
            if (z12 && i12 > 1) {
                z13 = true;
            }
            this.f346712d = z13;
            this.f346713e = (int[]) iArr.clone();
            this.f346714f = (boolean[]) zArr.clone();
        }

        public final I a(int i12) {
            return this.f346711c.f346151e[i12];
        }

        public final boolean b(int i12) {
            return this.f346714f[i12];
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f346712d == aVar.f346712d && this.f346711c.equals(aVar.f346711c) && Arrays.equals(this.f346713e, aVar.f346713e) && Arrays.equals(this.f346714f, aVar.f346714f);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f346714f) + ((Arrays.hashCode(this.f346713e) + (((this.f346711c.hashCode() * 31) + (this.f346712d ? 1 : 0)) * 31)) * 31);
        }
    }

    public t0(AbstractC37401r1 abstractC37401r1) {
        this.f346709b = AbstractC37401r1.v(abstractC37401r1);
    }

    public final AbstractC37401r1<a> a() {
        return this.f346709b;
    }

    public final boolean b(int i12) {
        int i13 = 0;
        while (true) {
            AbstractC37401r1<a> abstractC37401r1 = this.f346709b;
            if (i13 >= abstractC37401r1.size()) {
                return false;
            }
            a aVar = abstractC37401r1.get(i13);
            boolean[] zArr = aVar.f346714f;
            int length = zArr.length;
            boolean z12 = false;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                if (zArr[i14]) {
                    z12 = true;
                    break;
                }
                i14++;
            }
            if (z12 && aVar.f346711c.f346150d == i12) {
                return true;
            }
            i13++;
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        return this.f346709b.equals(((t0) obj).f346709b);
    }

    public final int hashCode() {
        return this.f346709b.hashCode();
    }
}
