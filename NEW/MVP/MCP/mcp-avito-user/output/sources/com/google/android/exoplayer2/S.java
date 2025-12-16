package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes6.dex */
final class S {

    /* renamed from: a, reason: collision with root package name */
    public final y.b f343685a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343686b;

    /* renamed from: c, reason: collision with root package name */
    public final long f343687c;

    /* renamed from: d, reason: collision with root package name */
    public final long f343688d;

    /* renamed from: e, reason: collision with root package name */
    public final long f343689e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f343690f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f343691g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f343692h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f343693i;

    public S(y.b bVar, long j12, long j13, long j14, long j15, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        C36585a.b(!z15 || z13);
        C36585a.b(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        C36585a.b(z16);
        this.f343685a = bVar;
        this.f343686b = j12;
        this.f343687c = j13;
        this.f343688d = j14;
        this.f343689e = j15;
        this.f343690f = z12;
        this.f343691g = z13;
        this.f343692h = z14;
        this.f343693i = z15;
    }

    public final S a(long j12) {
        if (j12 == this.f343687c) {
            return this;
        }
        return new S(this.f343685a, this.f343686b, j12, this.f343688d, this.f343689e, this.f343690f, this.f343691g, this.f343692h, this.f343693i);
    }

    public final S b(long j12) {
        if (j12 == this.f343686b) {
            return this;
        }
        return new S(this.f343685a, j12, this.f343687c, this.f343688d, this.f343689e, this.f343690f, this.f343691g, this.f343692h, this.f343693i);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s5 = (S) obj;
        return this.f343686b == s5.f343686b && this.f343687c == s5.f343687c && this.f343688d == s5.f343688d && this.f343689e == s5.f343689e && this.f343690f == s5.f343690f && this.f343691g == s5.f343691g && this.f343692h == s5.f343692h && this.f343693i == s5.f343693i && com.google.android.exoplayer2.util.U.a(this.f343685a, s5.f343685a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f343685a.hashCode() + 527) * 31) + ((int) this.f343686b)) * 31) + ((int) this.f343687c)) * 31) + ((int) this.f343688d)) * 31) + ((int) this.f343689e)) * 31) + (this.f343690f ? 1 : 0)) * 31) + (this.f343691g ? 1 : 0)) * 31) + (this.f343692h ? 1 : 0)) * 31) + (this.f343693i ? 1 : 0);
    }
}
