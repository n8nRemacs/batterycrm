package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;

/* loaded from: classes8.dex */
final class hd0 {

    /* renamed from: a, reason: collision with root package name */
    private final i91.b f386102a = new i91.b();

    /* renamed from: b, reason: collision with root package name */
    private final i91.d f386103b = new i91.d();

    /* renamed from: c, reason: collision with root package name */
    private final j9 f386104c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f386105d;

    /* renamed from: e, reason: collision with root package name */
    private long f386106e;

    /* renamed from: f, reason: collision with root package name */
    private int f386107f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f386108g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private ed0 f386109h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private ed0 f386110i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private ed0 f386111j;

    /* renamed from: k, reason: collision with root package name */
    private int f386112k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private Object f386113l;

    /* renamed from: m, reason: collision with root package name */
    private long f386114m;

    public hd0(j9 j9Var, Handler handler) {
        this.f386104c = j9Var;
        this.f386105d = handler;
    }

    private void g() {
        int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar = new p.a();
        for (ed0 ed0VarB = this.f386109h; ed0VarB != null; ed0VarB = ed0VarB.b()) {
            aVar.b(ed0VarB.f384900f.f385717a);
        }
        ed0 ed0Var = this.f386110i;
        this.f386105d.post(new H0(this, aVar, ed0Var == null ? null : ed0Var.f384900f.f385717a, 0));
    }

    public final ed0 b() {
        ed0 ed0Var = this.f386110i;
        db.b((ed0Var == null || ed0Var.b() == null) ? false : true);
        this.f386110i = this.f386110i.b();
        g();
        return this.f386110i;
    }

    public final void c() {
        if (this.f386112k == 0) {
            return;
        }
        ed0 ed0VarB = (ed0) db.b(this.f386109h);
        this.f386113l = ed0VarB.f384896b;
        this.f386114m = ed0VarB.f384900f.f385717a.f385283d;
        while (ed0VarB != null) {
            ed0VarB.g();
            ed0VarB = ed0VarB.b();
        }
        this.f386109h = null;
        this.f386111j = null;
        this.f386110i = null;
        this.f386112k = 0;
        g();
    }

    @j.P
    public final ed0 d() {
        return this.f386111j;
    }

    @j.P
    public final ed0 e() {
        return this.f386109h;
    }

    @j.P
    public final ed0 f() {
        return this.f386110i;
    }

    public final boolean h() {
        ed0 ed0Var = this.f386111j;
        return ed0Var == null || (!ed0Var.f384900f.f385725i && ed0Var.f384898d && ((!ed0Var.f384899e || ed0Var.f384895a.getBufferedPositionUs() == Long.MIN_VALUE) && this.f386111j.f384900f.f385721e != -9223372036854775807L && this.f386112k < 100));
    }

    public final boolean a(i91 i91Var, int i12) {
        this.f386107f = i12;
        return a(i91Var);
    }

    public final boolean a(i91 i91Var, boolean z12) {
        this.f386108g = z12;
        return a(i91Var);
    }

    public final boolean a(dd0 dd0Var) {
        ed0 ed0Var = this.f386111j;
        return ed0Var != null && ed0Var.f384895a == dd0Var;
    }

    public final void a(long j12) {
        ed0 ed0Var = this.f386111j;
        if (ed0Var != null) {
            ed0Var.b(j12);
        }
    }

    @j.P
    public final gd0 a(long j12, at0 at0Var) {
        ed0 ed0Var = this.f386111j;
        if (ed0Var == null) {
            i91 i91Var = at0Var.f383641a;
            jd0.b bVar = at0Var.f383642b;
            long j13 = at0Var.f383643c;
            long j14 = at0Var.f383658r;
            i91Var.a(bVar.f385280a, this.f386102a);
            if (bVar.a()) {
                return a(i91Var, bVar.f385280a, bVar.f385281b, bVar.f385282c, j13, bVar.f385283d);
            }
            return a(i91Var, bVar.f385280a, j14, j13, bVar.f385283d);
        }
        return a(at0Var.f383641a, ed0Var, j12);
    }

    public final ed0 a(vx0[] vx0VarArr, ca1 ca1Var, h9 h9Var, md0 md0Var, gd0 gd0Var, da1 da1Var) {
        ed0 ed0Var = this.f386111j;
        ed0 ed0Var2 = new ed0(vx0VarArr, ed0Var == null ? 1000000000000L : (ed0Var.c() + this.f386111j.f384900f.f385721e) - gd0Var.f385718b, ca1Var, h9Var, md0Var, gd0Var, da1Var);
        ed0 ed0Var3 = this.f386111j;
        if (ed0Var3 != null) {
            ed0Var3.a(ed0Var2);
        } else {
            this.f386109h = ed0Var2;
            this.f386110i = ed0Var2;
        }
        this.f386113l = null;
        this.f386111j = ed0Var2;
        this.f386112k++;
        g();
        return ed0Var2;
    }

    @j.P
    public final ed0 a() {
        ed0 ed0Var = this.f386109h;
        if (ed0Var == null) {
            return null;
        }
        if (ed0Var == this.f386110i) {
            this.f386110i = ed0Var.b();
        }
        this.f386109h.g();
        int i12 = this.f386112k - 1;
        this.f386112k = i12;
        if (i12 == 0) {
            this.f386111j = null;
            ed0 ed0Var2 = this.f386109h;
            this.f386113l = ed0Var2.f384896b;
            this.f386114m = ed0Var2.f384900f.f385717a.f385283d;
        }
        this.f386109h = this.f386109h.b();
        g();
        return this.f386109h;
    }

    public final boolean a(ed0 ed0Var) {
        boolean z12 = false;
        db.b(ed0Var != null);
        if (ed0Var.equals(this.f386111j)) {
            return false;
        }
        this.f386111j = ed0Var;
        while (ed0Var.b() != null) {
            ed0Var = ed0Var.b();
            if (ed0Var == this.f386110i) {
                this.f386110i = this.f386109h;
                z12 = true;
            }
            ed0Var.g();
            this.f386112k--;
        }
        this.f386111j.a((ed0) null);
        g();
        return z12;
    }

    public final boolean a(i91 i91Var, long j12, long j13) {
        gd0 gd0VarA;
        gd0 gd0Var;
        gd0 gd0Var2;
        i91 i91Var2 = i91Var;
        ed0 ed0VarB = this.f386109h;
        ed0 ed0Var = null;
        while (ed0VarB != null) {
            gd0 gd0Var3 = ed0VarB.f384900f;
            if (ed0Var == null) {
                gd0VarA = a(i91Var2, gd0Var3);
            } else {
                gd0 gd0VarA2 = a(i91Var2, ed0Var, j12);
                if (gd0VarA2 == null) {
                    return !a(ed0Var);
                }
                if (gd0Var3.f385718b != gd0VarA2.f385718b || !gd0Var3.f385717a.equals(gd0VarA2.f385717a)) {
                    return !a(ed0Var);
                }
                gd0VarA = gd0VarA2;
            }
            long j14 = gd0Var3.f385719c;
            if (j14 == gd0VarA.f385719c) {
                gd0Var2 = gd0VarA;
                gd0Var = gd0Var3;
            } else {
                gd0Var = gd0Var3;
                gd0Var2 = new gd0(gd0VarA.f385717a, gd0VarA.f385718b, j14, gd0VarA.f385720d, gd0VarA.f385721e, gd0VarA.f385722f, gd0VarA.f385723g, gd0VarA.f385724h, gd0VarA.f385725i);
            }
            ed0VarB.f384900f = gd0Var2;
            long j15 = gd0Var.f385721e;
            long j16 = gd0VarA.f385721e;
            if (j15 != -9223372036854775807L && j15 != j16) {
                dd0 dd0Var = ed0VarB.f384895a;
                if (dd0Var instanceof gj) {
                    long j17 = gd0Var2.f385720d;
                    if (j17 == -9223372036854775807L) {
                        j17 = Long.MIN_VALUE;
                    }
                    ((gj) dd0Var).a(j17);
                }
                long j18 = gd0VarA.f385721e;
                return (a(ed0VarB) || (ed0VarB == this.f386110i && !ed0VarB.f384900f.f385722f && ((j13 > Long.MIN_VALUE ? 1 : (j13 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j13 > ((j18 > (-9223372036854775807L) ? 1 : (j18 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : ed0VarB.d(j18)) ? 1 : (j13 == ((j18 > (-9223372036854775807L) ? 1 : (j18 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : ed0VarB.d(j18)) ? 0 : -1)) >= 0))) ? false : true;
            }
            ed0Var = ed0VarB;
            ed0VarB = ed0VarB.b();
            i91Var2 = i91Var;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.gd0 a(com.yandex.mobile.ads.impl.i91 r22, com.yandex.mobile.ads.impl.gd0 r23) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hd0.a(com.yandex.mobile.ads.impl.i91, com.yandex.mobile.ads.impl.gd0):com.yandex.mobile.ads.impl.gd0");
    }

    private static jd0.b a(i91 i91Var, Object obj, long j12, long j13, i91.d dVar, i91.b bVar) {
        Object obj2 = obj;
        i91Var.a(obj, bVar);
        i91Var.a(bVar.f386391c, dVar, 0L);
        int iA2 = i91Var.a(obj);
        while (bVar.f386392d == 0 && bVar.a() > 0 && bVar.f(bVar.c()) && bVar.b(0L) == -1) {
            int i12 = iA2 + 1;
            if (iA2 >= dVar.f386419p) {
                break;
            }
            i91Var.a(i12, bVar, true);
            obj2 = bVar.f386390b;
            obj2.getClass();
            iA2 = i12;
        }
        i91Var.a(obj2, bVar);
        int iB2 = bVar.b(j12);
        if (iB2 == -1) {
            return new jd0.b(bVar.a(j12), j13, obj2);
        }
        return new jd0.b(obj2, iB2, bVar.d(iB2), j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(p.a aVar, jd0.b bVar) {
        this.f386104c.a(aVar.a(), bVar);
    }

    public final jd0.b a(i91 i91Var, Object obj, long j12) {
        long j13;
        int iA2;
        Object obj2 = obj;
        int i12 = i91Var.a(obj2, this.f386102a).f386391c;
        Object obj3 = this.f386113l;
        if (obj3 != null && (iA2 = i91Var.a(obj3)) != -1 && i91Var.a(iA2, this.f386102a, false).f386391c == i12) {
            j13 = this.f386114m;
        } else {
            ed0 ed0VarB = this.f386109h;
            while (true) {
                if (ed0VarB != null) {
                    if (ed0VarB.f384896b.equals(obj2)) {
                        j13 = ed0VarB.f384900f.f385717a.f385283d;
                        break;
                    }
                    ed0VarB = ed0VarB.b();
                } else {
                    ed0 ed0VarB2 = this.f386109h;
                    while (true) {
                        if (ed0VarB2 != null) {
                            int iA3 = i91Var.a(ed0VarB2.f384896b);
                            if (iA3 != -1 && i91Var.a(iA3, this.f386102a, false).f386391c == i12) {
                                j13 = ed0VarB2.f384900f.f385717a.f385283d;
                                break;
                            }
                            ed0VarB2 = ed0VarB2.b();
                        } else {
                            j13 = this.f386106e;
                            this.f386106e = 1 + j13;
                            if (this.f386109h == null) {
                                this.f386113l = obj2;
                                this.f386114m = j13;
                            }
                        }
                    }
                }
            }
        }
        long j14 = j13;
        i91Var.a(obj2, this.f386102a);
        i91Var.a(this.f386102a.f386391c, this.f386103b, 0L);
        boolean z12 = false;
        for (int iA4 = i91Var.a(obj); iA4 >= this.f386103b.f386418o; iA4--) {
            i91Var.a(iA4, this.f386102a, true);
            boolean z13 = this.f386102a.a() > 0;
            z12 |= z13;
            i91.b bVar = this.f386102a;
            if (bVar.b(bVar.f386392d) != -1) {
                obj2 = this.f386102a.f386390b;
                obj2.getClass();
            }
            if (z12 && (!z13 || this.f386102a.f386392d != 0)) {
                break;
            }
        }
        return a(i91Var, obj2, j12, j14, this.f386103b, this.f386102a);
    }

    private boolean a(i91 i91Var) {
        ed0 ed0VarB = this.f386109h;
        if (ed0VarB == null) {
            return true;
        }
        int iA2 = i91Var.a(ed0VarB.f384896b);
        while (true) {
            iA2 = i91Var.a(iA2, this.f386102a, this.f386103b, this.f386107f, this.f386108g);
            while (ed0VarB.b() != null && !ed0VarB.f384900f.f385723g) {
                ed0VarB = ed0VarB.b();
            }
            ed0 ed0VarB2 = ed0VarB.b();
            if (iA2 == -1 || ed0VarB2 == null || i91Var.a(ed0VarB2.f384896b) != iA2) {
                break;
            }
            ed0VarB = ed0VarB2;
        }
        boolean zA2 = a(ed0VarB);
        ed0VarB.f384900f = a(i91Var, ed0VarB.f384900f);
        return !zA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.mobile.ads.impl.gd0 a(com.yandex.mobile.ads.impl.i91 r21, com.yandex.mobile.ads.impl.ed0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hd0.a(com.yandex.mobile.ads.impl.i91, com.yandex.mobile.ads.impl.ed0, long):com.yandex.mobile.ads.impl.gd0");
    }

    private gd0 a(i91 i91Var, Object obj, int i12, int i13, long j12, long j13) {
        jd0.b bVar = new jd0.b(obj, i12, i13, j13);
        long jA2 = i91Var.a(obj, this.f386102a).a(i12, i13);
        long jB2 = i13 == this.f386102a.d(i12) ? this.f386102a.b() : 0L;
        return new gd0(bVar, (jA2 == -9223372036854775807L || jB2 < jA2) ? jB2 : Math.max(0L, jA2 - 1), j12, -9223372036854775807L, jA2, this.f386102a.f(i12), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.mobile.ads.impl.gd0 a(com.yandex.mobile.ads.impl.i91 r29, java.lang.Object r30, long r31, long r33, long r35) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hd0.a(com.yandex.mobile.ads.impl.i91, java.lang.Object, long, long, long):com.yandex.mobile.ads.impl.gd0");
    }
}
