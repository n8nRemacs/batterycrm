package com.google.android.exoplayer2.video;

import androidx.appcompat.app.r;
import com.google.android.exoplayer2.InterfaceC36525h;
import j.P;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: ColorInfo.java */
/* loaded from: classes6.dex */
public final class b implements InterfaceC36525h {

    /* renamed from: b, reason: collision with root package name */
    public final int f348187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348188c;

    /* renamed from: d, reason: collision with root package name */
    public final int f348189d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final byte[] f348190e;

    /* renamed from: f, reason: collision with root package name */
    public int f348191f;

    public b(int i12, int i13, int i14, @P byte[] bArr) {
        this.f348187b = i12;
        this.f348188c = i13;
        this.f348189d = i14;
        this.f348190e = bArr;
    }

    @Pure
    public static int a(int i12) {
        if (i12 == 1) {
            return 1;
        }
        if (i12 != 9) {
            return (i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f348187b == bVar.f348187b && this.f348188c == bVar.f348188c && this.f348189d == bVar.f348189d && Arrays.equals(this.f348190e, bVar.f348190e);
    }

    public final int hashCode() {
        if (this.f348191f == 0) {
            this.f348191f = Arrays.hashCode(this.f348190e) + ((((((527 + this.f348187b) * 31) + this.f348188c) * 31) + this.f348189d) * 31);
        }
        return this.f348191f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f348187b);
        sb2.append(", ");
        sb2.append(this.f348188c);
        sb2.append(", ");
        sb2.append(this.f348189d);
        sb2.append(", ");
        return r.s(")", sb2, this.f348190e != null);
    }
}
