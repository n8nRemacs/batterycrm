package androidx.media3.exoplayer;

import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.source.A;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public final A.b f48522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48524c;

    /* renamed from: d, reason: collision with root package name */
    public final long f48525d;

    /* renamed from: e, reason: collision with root package name */
    public final long f48526e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48528g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48529h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f48530i;

    public K(A.b bVar, long j12, long j13, long j14, long j15, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        C23110a.b(!z15 || z13);
        C23110a.b(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        C23110a.b(z16);
        this.f48522a = bVar;
        this.f48523b = j12;
        this.f48524c = j13;
        this.f48525d = j14;
        this.f48526e = j15;
        this.f48527f = z12;
        this.f48528g = z13;
        this.f48529h = z14;
        this.f48530i = z15;
    }

    public final K a(long j12) {
        if (j12 == this.f48524c) {
            return this;
        }
        return new K(this.f48522a, this.f48523b, j12, this.f48525d, this.f48526e, this.f48527f, this.f48528g, this.f48529h, this.f48530i);
    }

    public final K b(long j12) {
        if (j12 == this.f48523b) {
            return this;
        }
        return new K(this.f48522a, j12, this.f48524c, this.f48525d, this.f48526e, this.f48527f, this.f48528g, this.f48529h, this.f48530i);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k12 = (K) obj;
        return this.f48523b == k12.f48523b && this.f48524c == k12.f48524c && this.f48525d == k12.f48525d && this.f48526e == k12.f48526e && this.f48527f == k12.f48527f && this.f48528g == k12.f48528g && this.f48529h == k12.f48529h && this.f48530i == k12.f48530i && androidx.media3.common.util.M.a(this.f48522a, k12.f48522a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f48522a.hashCode() + 527) * 31) + ((int) this.f48523b)) * 31) + ((int) this.f48524c)) * 31) + ((int) this.f48525d)) * 31) + ((int) this.f48526e)) * 31) + (this.f48527f ? 1 : 0)) * 31) + (this.f48528g ? 1 : 0)) * 31) + (this.f48529h ? 1 : 0)) * 31) + (this.f48530i ? 1 : 0);
    }
}
