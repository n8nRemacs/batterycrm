package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23123n;
import androidx.media3.exoplayer.source.A;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f48535a = new P.b();

    /* renamed from: b, reason: collision with root package name */
    public final P.d f48536b = new P.d();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.analytics.a f48537c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC23123n f48538d;

    /* renamed from: e, reason: collision with root package name */
    public long f48539e;

    /* renamed from: f, reason: collision with root package name */
    public int f48540f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48541g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public J f48542h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public J f48543i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public J f48544j;

    /* renamed from: k, reason: collision with root package name */
    public int f48545k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public Object f48546l;

    /* renamed from: m, reason: collision with root package name */
    public long f48547m;

    public M(androidx.media3.exoplayer.analytics.a aVar, InterfaceC23123n interfaceC23123n) {
        this.f48537c = aVar;
        this.f48538d = interfaceC23123n;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.exoplayer.source.A.b m(androidx.media3.common.P r15, java.lang.Object r16, long r17, long r19, androidx.media3.common.P.d r21, androidx.media3.common.P.b r22) {
        /*
            r0 = r15
            r1 = r17
            r3 = r21
            r4 = r16
            r5 = r22
            r15.o(r4, r5)
            int r6 = r5.f47381d
            r15.v(r6, r3)
            int r6 = r15.g(r16)
            r8 = r4
        L16:
            androidx.media3.common.c r4 = r5.f47385h
            int r4 = r4.f47622b
            r7 = -1
            if (r4 == 0) goto L70
            r9 = 1
            r10 = 0
            if (r4 != r9) goto L27
            boolean r11 = r5.n(r10)
            if (r11 != 0) goto L70
        L27:
            androidx.media3.common.c r11 = r5.f47385h
            int r11 = r11.f47625e
            boolean r11 = r5.o(r11)
            if (r11 == 0) goto L70
            r11 = 0
            int r13 = r5.g(r11)
            if (r13 == r7) goto L3a
            goto L70
        L3a:
            long r13 = r5.f47382e
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L41
            goto L61
        L41:
            int r13 = r4 + (-1)
            boolean r13 = r5.n(r13)
            if (r13 == 0) goto L4b
            r13 = 2
            goto L4c
        L4b:
            r13 = r9
        L4c:
            int r4 = r4 - r13
        L4d:
            if (r10 > r4) goto L5b
            androidx.media3.common.c r13 = r5.f47385h
            androidx.media3.common.c$b r13 = r13.a(r10)
            long r13 = r13.f47642h
            long r11 = r11 + r13
            int r10 = r10 + 1
            goto L4d
        L5b:
            long r13 = r5.f47382e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 > 0) goto L70
        L61:
            int r4 = r3.f47422q
            if (r6 > r4) goto L70
            r15.n(r6, r5, r9)
            java.lang.Object r8 = r5.f47380c
            r8.getClass()
            int r6 = r6 + 1
            goto L16
        L70:
            r15.o(r8, r5)
            int r9 = r5.g(r1)
            if (r9 != r7) goto L85
            int r0 = r5.b(r1)
            androidx.media3.exoplayer.source.A$b r1 = new androidx.media3.exoplayer.source.A$b
            r2 = r19
            r1.<init>(r0, r2, r8)
            return r1
        L85:
            r2 = r19
            int r10 = r5.m(r9)
            androidx.media3.exoplayer.source.A$b r0 = new androidx.media3.exoplayer.source.A$b
            r13 = -1
            r7 = r0
            r11 = r19
            r7.<init>(r8, r9, r10, r11, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.M.m(androidx.media3.common.P, java.lang.Object, long, long, androidx.media3.common.P$d, androidx.media3.common.P$b):androidx.media3.exoplayer.source.A$b");
    }

    @j.P
    public final J a() {
        J j12 = this.f48542h;
        if (j12 == null) {
            return null;
        }
        if (j12 == this.f48543i) {
            this.f48543i = j12.f48518l;
        }
        j12.f();
        int i12 = this.f48545k - 1;
        this.f48545k = i12;
        if (i12 == 0) {
            this.f48544j = null;
            J j13 = this.f48542h;
            this.f48546l = j13.f48508b;
            this.f48547m = j13.f48512f.f48522a.f47215d;
        }
        this.f48542h = this.f48542h.f48518l;
        k();
        return this.f48542h;
    }

    public final void b() {
        if (this.f48545k == 0) {
            return;
        }
        J j12 = this.f48542h;
        C23110a.h(j12);
        this.f48546l = j12.f48508b;
        this.f48547m = j12.f48512f.f48522a.f47215d;
        while (j12 != null) {
            j12.f();
            j12 = j12.f48518l;
        }
        this.f48542h = null;
        this.f48544j = null;
        this.f48543i = null;
        this.f48545k = 0;
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.K c(androidx.media3.common.P r24, androidx.media3.exoplayer.J r25, long r26) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.M.c(androidx.media3.common.P, androidx.media3.exoplayer.J, long):androidx.media3.exoplayer.K");
    }

    @j.P
    public final K d(androidx.media3.common.P p12, J j12, long j13) {
        K k12 = j12.f48512f;
        long j14 = (j12.f48521o + k12.f48526e) - j13;
        if (k12.f48528g) {
            return c(p12, j12, j14);
        }
        A.b bVar = k12.f48522a;
        Object obj = bVar.f47212a;
        P.b bVar2 = this.f48535a;
        p12.o(obj, bVar2);
        boolean zA2 = bVar.a();
        Object obj2 = bVar.f47212a;
        if (!zA2) {
            int i12 = bVar.f47216e;
            if (i12 != -1 && bVar2.n(i12)) {
                return c(p12, j12, j14);
            }
            int iM2 = bVar2.m(i12);
            boolean z12 = bVar2.o(i12) && bVar2.l(i12, iM2) == 3;
            if (iM2 != bVar2.f47385h.a(i12).f47637c && !z12) {
                return f(p12, bVar.f47212a, bVar.f47216e, iM2, k12.f48526e, bVar.f47215d);
            }
            p12.o(obj2, bVar2);
            long j15 = bVar2.j(i12);
            return g(p12, bVar.f47212a, j15 == Long.MIN_VALUE ? bVar2.f47382e : bVar2.f47385h.a(i12).f47642h + j15, k12.f48526e, bVar.f47215d);
        }
        C23089c c23089c = bVar2.f47385h;
        int i13 = bVar.f47213b;
        int i14 = c23089c.a(i13).f47637c;
        if (i14 != -1) {
            int iA2 = bVar2.f47385h.a(i13).a(bVar.f47214c);
            if (iA2 < i14) {
                return f(p12, bVar.f47212a, i13, iA2, k12.f48524c, bVar.f47215d);
            }
            long jLongValue = k12.f48524c;
            if (jLongValue == -9223372036854775807L) {
                Pair<Object, Long> pairR = p12.r(this.f48536b, bVar2, bVar2.f47381d, -9223372036854775807L, Math.max(0L, j14));
                if (pairR != null) {
                    jLongValue = ((Long) pairR.second).longValue();
                }
            }
            p12.o(obj2, bVar2);
            int i15 = bVar.f47213b;
            long j16 = bVar2.j(i15);
            return g(p12, bVar.f47212a, Math.max(j16 == Long.MIN_VALUE ? bVar2.f47382e : bVar2.f47385h.a(i15).f47642h + j16, jLongValue), k12.f48524c, bVar.f47215d);
        }
        return null;
    }

    @j.P
    public final K e(androidx.media3.common.P p12, A.b bVar, long j12, long j13) {
        p12.o(bVar.f47212a, this.f48535a);
        return bVar.a() ? f(p12, bVar.f47212a, bVar.f47213b, bVar.f47214c, j12, bVar.f47215d) : g(p12, bVar.f47212a, j13, j12, bVar.f47215d);
    }

    public final K f(androidx.media3.common.P p12, Object obj, int i12, int i13, long j12, long j13) {
        A.b bVar = new A.b(obj, i12, i13, j13, -1);
        P.b bVar2 = this.f48535a;
        long jA2 = p12.o(obj, bVar2).a(i12, i13);
        long j14 = i13 == bVar2.m(i12) ? bVar2.f47385h.f47623c : 0L;
        return new K(bVar, (jA2 == -9223372036854775807L || j14 < jA2) ? j14 : Math.max(0L, jA2 - 1), j12, -9223372036854775807L, jA2, bVar2.o(i12), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.K g(androidx.media3.common.P r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.M.g(androidx.media3.common.P, java.lang.Object, long, long, long):androidx.media3.exoplayer.K");
    }

    public final K h(androidx.media3.common.P p12, K k12) {
        A.b bVar = k12.f48522a;
        boolean zA2 = bVar.a();
        int i12 = bVar.f47216e;
        boolean z12 = !zA2 && i12 == -1;
        boolean zJ2 = j(p12, bVar);
        boolean zI2 = i(p12, bVar, z12);
        Object obj = bVar.f47212a;
        P.b bVar2 = this.f48535a;
        p12.o(obj, bVar2);
        long j12 = (bVar.a() || i12 == -1) ? -9223372036854775807L : bVar2.j(i12);
        boolean zA3 = bVar.a();
        int i13 = bVar.f47213b;
        return new K(bVar, k12.f48523b, k12.f48524c, j12, zA3 ? bVar2.a(i13, bVar.f47214c) : (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? bVar2.f47382e : j12, bVar.a() ? bVar2.o(i13) : i12 != -1 && bVar2.o(i12), z12, zJ2, zI2);
    }

    public final boolean i(androidx.media3.common.P p12, A.b bVar, boolean z12) {
        int iG2 = p12.g(bVar.f47212a);
        if (p12.u(p12.n(iG2, this.f48535a, false).f47381d, this.f48536b, 0L).f47415j) {
            return false;
        }
        return p12.l(iG2, this.f48535a, this.f48536b, this.f48540f, this.f48541g) == -1 && z12;
    }

    public final boolean j(androidx.media3.common.P p12, A.b bVar) {
        if (!(!bVar.a() && bVar.f47216e == -1)) {
            return false;
        }
        Object obj = bVar.f47212a;
        return p12.u(p12.o(obj, this.f48535a).f47381d, this.f48536b, 0L).f47422q == p12.g(obj);
    }

    public final void k() {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        for (J j12 = this.f48542h; j12 != null; j12 = j12.f48518l) {
            aVar.g(j12.f48512f.f48522a);
        }
        J j13 = this.f48543i;
        this.f48538d.d(new L(this, aVar, j13 == null ? null : j13.f48512f.f48522a, 0));
    }

    public final boolean l(J j12) {
        boolean z12 = false;
        C23110a.g(j12 != null);
        if (j12.equals(this.f48544j)) {
            return false;
        }
        this.f48544j = j12;
        while (true) {
            j12 = j12.f48518l;
            if (j12 == null) {
                break;
            }
            if (j12 == this.f48543i) {
                this.f48543i = this.f48542h;
                z12 = true;
            }
            j12.f();
            this.f48545k--;
        }
        J j13 = this.f48544j;
        if (j13.f48518l != null) {
            j13.b();
            j13.f48518l = null;
            j13.c();
        }
        k();
        return z12;
    }

    public final A.b n(androidx.media3.common.P p12, Object obj, long j12) {
        long j13;
        int iG2;
        Object obj2 = obj;
        P.b bVar = this.f48535a;
        int i12 = p12.o(obj2, bVar).f47381d;
        Object obj3 = this.f48546l;
        if (obj3 == null || (iG2 = p12.g(obj3)) == -1 || p12.n(iG2, bVar, false).f47381d != i12) {
            J j14 = this.f48542h;
            while (true) {
                if (j14 == null) {
                    J j15 = this.f48542h;
                    while (true) {
                        if (j15 != null) {
                            int iG3 = p12.g(j15.f48508b);
                            if (iG3 != -1 && p12.n(iG3, bVar, false).f47381d == i12) {
                                j13 = j15.f48512f.f48522a.f47215d;
                                break;
                            }
                            j15 = j15.f48518l;
                        } else {
                            j13 = this.f48539e;
                            this.f48539e = 1 + j13;
                            if (this.f48542h == null) {
                                this.f48546l = obj2;
                                this.f48547m = j13;
                            }
                        }
                    }
                } else {
                    if (j14.f48508b.equals(obj2)) {
                        j13 = j14.f48512f.f48522a.f47215d;
                        break;
                    }
                    j14 = j14.f48518l;
                }
            }
        } else {
            j13 = this.f48547m;
        }
        long j16 = j13;
        p12.o(obj2, bVar);
        int i13 = bVar.f47381d;
        P.d dVar = this.f48536b;
        p12.v(i13, dVar);
        boolean z12 = false;
        for (int iG4 = p12.g(obj); iG4 >= dVar.f47421p; iG4--) {
            p12.n(iG4, bVar, true);
            boolean z13 = bVar.f47385h.f47622b > 0;
            z12 |= z13;
            if (bVar.g(bVar.f47382e) != -1) {
                obj2 = bVar.f47380c;
                obj2.getClass();
            }
            if (z12 && (!z13 || bVar.f47382e != 0)) {
                break;
            }
        }
        return m(p12, obj2, j12, j16, this.f48536b, this.f48535a);
    }

    public final boolean o(androidx.media3.common.P p12) {
        J j12;
        J j13 = this.f48542h;
        if (j13 == null) {
            return true;
        }
        int iG2 = p12.g(j13.f48508b);
        while (true) {
            iG2 = p12.l(iG2, this.f48535a, this.f48536b, this.f48540f, this.f48541g);
            while (true) {
                j12 = j13.f48518l;
                if (j12 == null || j13.f48512f.f48528g) {
                    break;
                }
                j13 = j12;
            }
            if (iG2 == -1 || j12 == null || p12.g(j12.f48508b) != iG2) {
                break;
            }
            j13 = j12;
        }
        boolean zL2 = l(j13);
        j13.f48512f = h(p12, j13.f48512f);
        return !zL2;
    }

    public final boolean p(androidx.media3.common.P p12, long j12, long j13) {
        K kH2;
        J j14 = this.f48542h;
        J j15 = null;
        while (j14 != null) {
            K k12 = j14.f48512f;
            if (j15 == null) {
                kH2 = h(p12, k12);
            } else {
                K kD2 = d(p12, j15, j12);
                if (kD2 == null) {
                    return !l(j15);
                }
                if (k12.f48523b != kD2.f48523b || !k12.f48522a.equals(kD2.f48522a)) {
                    return !l(j15);
                }
                kH2 = kD2;
            }
            j14.f48512f = kH2.a(k12.f48524c);
            long j16 = k12.f48526e;
            if (j16 != -9223372036854775807L) {
                long j17 = kH2.f48526e;
                if (j16 != j17) {
                    j14.h();
                    return (l(j14) || (j14 == this.f48543i && !j14.f48512f.f48527f && ((j13 > Long.MIN_VALUE ? 1 : (j13 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j13 > ((j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j14.f48521o + j17) ? 1 : (j13 == ((j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j14.f48521o + j17) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            j15 = j14;
            j14 = j14.f48518l;
        }
        return true;
    }
}
