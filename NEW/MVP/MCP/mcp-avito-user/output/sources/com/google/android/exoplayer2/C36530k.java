package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;

/* compiled from: DefaultLoadControl.java */
/* renamed from: com.google.android.exoplayer2.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36530k implements N {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.q f345446a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345447b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345448c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345449d;

    /* renamed from: e, reason: collision with root package name */
    public final long f345450e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345451f;

    /* renamed from: g, reason: collision with root package name */
    public final long f345452g;

    /* renamed from: h, reason: collision with root package name */
    public int f345453h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345454i;

    /* compiled from: DefaultLoadControl.java */
    /* renamed from: com.google.android.exoplayer2.k$a */
    public static final class a {
    }

    public C36530k() {
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q();
        j(2500, 0, "bufferForPlaybackMs", "0");
        j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(50000, 50000, "maxBufferMs", "minBufferMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.f345446a = qVar;
        long j12 = 50000;
        this.f345447b = com.google.android.exoplayer2.util.U.H(j12);
        this.f345448c = com.google.android.exoplayer2.util.U.H(j12);
        this.f345449d = com.google.android.exoplayer2.util.U.H(2500);
        this.f345450e = com.google.android.exoplayer2.util.U.H(5000);
        this.f345451f = -1;
        this.f345453h = 13107200;
        this.f345452g = com.google.android.exoplayer2.util.U.H(0);
    }

    public static void j(int i12, int i13, String str, String str2) {
        C36585a.a(str + " cannot be less than " + str2, i12 >= i13);
    }

    @Override // com.google.android.exoplayer2.N
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.N
    public final long b() {
        return this.f345452g;
    }

    @Override // com.google.android.exoplayer2.N
    public final boolean c(long j12, float f12, boolean z12, long j13) {
        int i12;
        long jX2 = com.google.android.exoplayer2.util.U.x(j12, f12);
        long jMin = z12 ? this.f345450e : this.f345449d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(j13 / 2, jMin);
        }
        if (jMin > 0 && jX2 < jMin) {
            com.google.android.exoplayer2.upstream.q qVar = this.f345446a;
            synchronized (qVar) {
                i12 = qVar.f347953e * qVar.f347950b;
            }
            if (i12 < this.f345453h) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.N
    public final com.google.android.exoplayer2.upstream.q d() {
        return this.f345446a;
    }

    @Override // com.google.android.exoplayer2.N
    public final void e() {
        k(true);
    }

    @Override // com.google.android.exoplayer2.N
    public final void f() {
        k(false);
    }

    @Override // com.google.android.exoplayer2.N
    public final void g() {
        k(true);
    }

    @Override // com.google.android.exoplayer2.N
    public final boolean h(long j12, float f12) {
        int i12;
        com.google.android.exoplayer2.upstream.q qVar = this.f345446a;
        synchronized (qVar) {
            i12 = qVar.f347953e * qVar.f347950b;
        }
        boolean z12 = i12 >= this.f345453h;
        long j13 = this.f345448c;
        long jMin = this.f345447b;
        if (f12 > 1.0f) {
            jMin = Math.min(com.google.android.exoplayer2.util.U.u(jMin, f12), j13);
        }
        if (j12 < Math.max(jMin, 500000L)) {
            this.f345454i = !z12;
        } else if (j12 >= j13 || z12) {
            this.f345454i = false;
        }
        return this.f345454i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.N
    public final void i(h0[] h0VarArr, com.google.android.exoplayer2.trackselection.k[] kVarArr) {
        int iMax = this.f345451f;
        if (iMax == -1) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = 13107200;
                if (i12 < h0VarArr.length) {
                    if (kVarArr[i12] != null) {
                        switch (h0VarArr[i12].m()) {
                            case -2:
                                i14 = 0;
                                i13 += i14;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i14 = 144310272;
                                i13 += i14;
                                break;
                            case 1:
                                i13 += i14;
                                break;
                            case 2:
                                i14 = 131072000;
                                i13 += i14;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i14 = 131072;
                                i13 += i14;
                                break;
                        }
                    }
                    i12++;
                } else {
                    iMax = Math.max(13107200, i13);
                }
            }
        }
        this.f345453h = iMax;
        this.f345446a.f(iMax);
    }

    public final void k(boolean z12) {
        int i12 = this.f345451f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        this.f345453h = i12;
        this.f345454i = false;
        if (z12) {
            com.google.android.exoplayer2.upstream.q qVar = this.f345446a;
            synchronized (qVar) {
                if (qVar.f347949a) {
                    qVar.f(0);
                }
            }
        }
    }
}
