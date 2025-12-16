package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes6.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    public final s0.b f343697a = new s0.b();

    /* renamed from: b, reason: collision with root package name */
    public final s0.d f343698b = new s0.d();

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.a f343699c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f343700d;

    /* renamed from: e, reason: collision with root package name */
    public long f343701e;

    /* renamed from: f, reason: collision with root package name */
    public int f343702f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343703g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public Q f343704h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public Q f343705i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public Q f343706j;

    /* renamed from: k, reason: collision with root package name */
    public int f343707k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public Object f343708l;

    /* renamed from: m, reason: collision with root package name */
    public long f343709m;

    public U(com.google.android.exoplayer2.analytics.a aVar, Handler handler) {
        this.f343699c = aVar;
        this.f343700d = handler;
    }

    public static y.b l(s0 s0Var, Object obj, long j12, long j13, s0.d dVar, s0.b bVar) {
        s0Var.g(obj, bVar);
        s0Var.n(bVar.f345872d, dVar);
        int iB2 = s0Var.b(obj);
        Object obj2 = obj;
        while (bVar.f345873e == 0) {
            com.google.android.exoplayer2.source.ads.a aVar = bVar.f345876h;
            if (aVar.f346183c <= 0 || !bVar.g(aVar.f346186f) || bVar.f345876h.c(0L, bVar.f345873e) != -1) {
                break;
            }
            int i12 = iB2 + 1;
            if (iB2 >= dVar.f345895q) {
                break;
            }
            s0Var.f(i12, bVar, true);
            obj2 = bVar.f345871c;
            obj2.getClass();
            iB2 = i12;
        }
        s0Var.g(obj2, bVar);
        int iC2 = bVar.f345876h.c(j12, bVar.f345873e);
        return iC2 == -1 ? new y.b(bVar.c(j12), j13, obj2) : new y.b(obj2, iC2, bVar.f(iC2), j13, -1);
    }

    @j.P
    public final Q a() {
        Q q12 = this.f343704h;
        if (q12 == null) {
            return null;
        }
        if (q12 == this.f343705i) {
            this.f343705i = q12.f343681l;
        }
        q12.f();
        int i12 = this.f343707k - 1;
        this.f343707k = i12;
        if (i12 == 0) {
            this.f343706j = null;
            Q q13 = this.f343704h;
            this.f343708l = q13.f343671b;
            this.f343709m = q13.f343675f.f343685a.f346699d;
        }
        this.f343704h = this.f343704h.f343681l;
        j();
        return this.f343704h;
    }

    public final void b() {
        if (this.f343707k == 0) {
            return;
        }
        Q q12 = this.f343704h;
        C36585a.e(q12);
        this.f343708l = q12.f343671b;
        this.f343709m = q12.f343675f.f343685a.f346699d;
        while (q12 != null) {
            q12.f();
            q12 = q12.f343681l;
        }
        this.f343704h = null;
        this.f343706j = null;
        this.f343705i = null;
        this.f343707k = 0;
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.S c(com.google.android.exoplayer2.s0 r24, com.google.android.exoplayer2.Q r25, long r26) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.U.c(com.google.android.exoplayer2.s0, com.google.android.exoplayer2.Q, long):com.google.android.exoplayer2.S");
    }

    @j.P
    public final S d(s0 s0Var, y.b bVar, long j12, long j13) {
        s0Var.g(bVar.f346696a, this.f343697a);
        if (!bVar.a()) {
            return f(s0Var, bVar.f346696a, j13, j12, bVar.f346699d);
        }
        return e(s0Var, bVar.f346696a, bVar.f346697b, bVar.f346698c, j12, bVar.f346699d);
    }

    public final S e(s0 s0Var, Object obj, int i12, int i13, long j12, long j13) {
        y.b bVar = new y.b(obj, i12, i13, j13, -1);
        s0.b bVar2 = this.f343697a;
        long jB2 = s0Var.g(obj, bVar2).b(i12, i13);
        long j14 = i13 == bVar2.f(i12) ? bVar2.f345876h.f346184d : 0L;
        return new S(bVar, (jB2 == -9223372036854775807L || j14 < jB2) ? j14 : Math.max(0L, jB2 - 1), j12, -9223372036854775807L, jB2, bVar2.g(i12), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.S f(com.google.android.exoplayer2.s0 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.U.f(com.google.android.exoplayer2.s0, java.lang.Object, long, long, long):com.google.android.exoplayer2.S");
    }

    public final S g(s0 s0Var, S s5) {
        y.b bVar = s5.f343685a;
        boolean zA2 = bVar.a();
        int i12 = bVar.f346700e;
        boolean z12 = !zA2 && i12 == -1;
        boolean zI2 = i(s0Var, bVar);
        boolean zH2 = h(s0Var, bVar, z12);
        Object obj = bVar.f346696a;
        s0.b bVar2 = this.f343697a;
        s0Var.g(obj, bVar2);
        long jD2 = (bVar.a() || i12 == -1) ? -9223372036854775807L : bVar2.d(i12);
        boolean zA3 = bVar.a();
        int i13 = bVar.f346697b;
        return new S(bVar, s5.f343686b, s5.f343687c, jD2, zA3 ? bVar2.b(i13, bVar.f346698c) : (jD2 == -9223372036854775807L || jD2 == Long.MIN_VALUE) ? bVar2.f345873e : jD2, bVar.a() ? bVar2.g(i13) : i12 != -1 && bVar2.g(i12), z12, zI2, zH2);
    }

    public final boolean h(s0 s0Var, y.b bVar, boolean z12) {
        int iB2 = s0Var.b(bVar.f346696a);
        if (s0Var.m(s0Var.f(iB2, this.f343697a, false).f345872d, this.f343698b, 0L).f345888j) {
            return false;
        }
        return s0Var.d(iB2, this.f343697a, this.f343698b, this.f343702f, this.f343703g) == -1 && z12;
    }

    public final boolean i(s0 s0Var, y.b bVar) {
        if (!(!bVar.a() && bVar.f346700e == -1)) {
            return false;
        }
        Object obj = bVar.f346696a;
        return s0Var.m(s0Var.g(obj, this.f343697a).f345872d, this.f343698b, 0L).f345895q == s0Var.b(obj);
    }

    public final void j() {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        final AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        for (Q q12 = this.f343704h; q12 != null; q12 = q12.f343681l) {
            aVar.g(q12.f343675f.f343685a);
        }
        Q q13 = this.f343705i;
        final y.b bVar = q13 == null ? null : q13.f343675f.f343685a;
        this.f343700d.post(new Runnable() { // from class: com.google.android.exoplayer2.T
            @Override // java.lang.Runnable
            public final void run() {
                U u12 = this.f343694b;
                u12.getClass();
                u12.f343699c.cD(aVar.i(), bVar);
            }
        });
    }

    public final boolean k(Q q12) {
        boolean z12 = false;
        C36585a.d(q12 != null);
        if (q12.equals(this.f343706j)) {
            return false;
        }
        this.f343706j = q12;
        while (true) {
            q12 = q12.f343681l;
            if (q12 == null) {
                break;
            }
            if (q12 == this.f343705i) {
                this.f343705i = this.f343704h;
                z12 = true;
            }
            q12.f();
            this.f343707k--;
        }
        Q q13 = this.f343706j;
        if (q13.f343681l != null) {
            q13.b();
            q13.f343681l = null;
            q13.c();
        }
        j();
        return z12;
    }

    public final y.b m(s0 s0Var, Object obj, long j12) {
        long j13;
        int iB2;
        Object obj2 = obj;
        s0.b bVar = this.f343697a;
        int i12 = s0Var.g(obj2, bVar).f345872d;
        Object obj3 = this.f343708l;
        if (obj3 == null || (iB2 = s0Var.b(obj3)) == -1 || s0Var.f(iB2, bVar, false).f345872d != i12) {
            Q q12 = this.f343704h;
            while (true) {
                if (q12 == null) {
                    Q q13 = this.f343704h;
                    while (true) {
                        if (q13 != null) {
                            int iB3 = s0Var.b(q13.f343671b);
                            if (iB3 != -1 && s0Var.f(iB3, bVar, false).f345872d == i12) {
                                j13 = q13.f343675f.f343685a.f346699d;
                                break;
                            }
                            q13 = q13.f343681l;
                        } else {
                            j13 = this.f343701e;
                            this.f343701e = 1 + j13;
                            if (this.f343704h == null) {
                                this.f343708l = obj2;
                                this.f343709m = j13;
                            }
                        }
                    }
                } else {
                    if (q12.f343671b.equals(obj2)) {
                        j13 = q12.f343675f.f343685a.f346699d;
                        break;
                    }
                    q12 = q12.f343681l;
                }
            }
        } else {
            j13 = this.f343709m;
        }
        long j14 = j13;
        s0Var.g(obj2, bVar);
        int i13 = bVar.f345872d;
        s0.d dVar = this.f343698b;
        s0Var.n(i13, dVar);
        boolean z12 = false;
        for (int iB4 = s0Var.b(obj); iB4 >= dVar.f345894p; iB4--) {
            s0Var.f(iB4, bVar, true);
            com.google.android.exoplayer2.source.ads.a aVar = bVar.f345876h;
            boolean z13 = aVar.f346183c > 0;
            z12 |= z13;
            long j15 = bVar.f345873e;
            if (aVar.c(j15, j15) != -1) {
                obj2 = bVar.f345871c;
                obj2.getClass();
            }
            if (z12 && (!z13 || bVar.f345873e != 0)) {
                break;
            }
        }
        return l(s0Var, obj2, j12, j14, this.f343698b, this.f343697a);
    }

    public final boolean n(s0 s0Var) {
        Q q12;
        Q q13 = this.f343704h;
        if (q13 == null) {
            return true;
        }
        int iB2 = s0Var.b(q13.f343671b);
        while (true) {
            iB2 = s0Var.d(iB2, this.f343697a, this.f343698b, this.f343702f, this.f343703g);
            while (true) {
                q12 = q13.f343681l;
                if (q12 == null || q13.f343675f.f343691g) {
                    break;
                }
                q13 = q12;
            }
            if (iB2 == -1 || q12 == null || s0Var.b(q12.f343671b) != iB2) {
                break;
            }
            q13 = q12;
        }
        boolean zK2 = k(q13);
        q13.f343675f = g(s0Var, q13.f343675f);
        return !zK2;
    }

    public final boolean o(s0 s0Var, long j12, long j13) {
        S sG2;
        Q q12 = this.f343704h;
        Q q13 = null;
        while (q12 != null) {
            S s5 = q12.f343675f;
            if (q13 == null) {
                sG2 = g(s0Var, s5);
            } else {
                S sC2 = c(s0Var, q13, j12);
                if (sC2 == null) {
                    return !k(q13);
                }
                if (s5.f343686b != sC2.f343686b || !s5.f343685a.equals(sC2.f343685a)) {
                    return !k(q13);
                }
                sG2 = sC2;
            }
            q12.f343675f = sG2.a(s5.f343687c);
            long j14 = s5.f343689e;
            if (j14 != -9223372036854775807L) {
                long j15 = sG2.f343689e;
                if (j14 != j15) {
                    q12.h();
                    return (k(q12) || (q12 == this.f343705i && !q12.f343675f.f343690f && ((j13 > Long.MIN_VALUE ? 1 : (j13 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j13 > ((j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : q12.f343684o + j15) ? 1 : (j13 == ((j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : q12.f343684o + j15) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            q13 = q12;
            q12 = q12.f343681l;
        }
        return true;
    }
}
