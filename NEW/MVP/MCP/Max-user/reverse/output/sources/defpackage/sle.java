package defpackage;

/* loaded from: classes2.dex */
public final class sle extends xfh {
    public static final /* synthetic */ yy7[] A0 = {new z8a(sle.class, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, sle.class, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;"), new z8a(sle.class, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;")};
    public final tcf X;
    public final hbd Y;
    public final t9f Z;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final t9f s0;
    public final t9f t0;
    public final t9f u0;
    public final t9f v0;
    public final t9f w0;
    public final t9f x0;
    public final t9f y0;
    public final ci5 z0;

    public sle(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        tcf tcfVarA = ucf.a(hd5.a);
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        this.Z = c7j.c();
        this.s0 = c7j.c();
        this.t0 = c7j.c();
        this.u0 = c7j.c();
        this.v0 = c7j.c();
        this.w0 = c7j.c();
        this.x0 = c7j.c();
        this.y0 = c7j.c();
        this.z0 = new ci5(0);
        xfh.o(this, null, new hle(this, null), 3);
    }

    public static final Object t(sle sleVar, dtf dtfVar) {
        Object objI = svi.i(((q2b) ((lzf) sleVar.b.getValue())).b(), new ile(sleVar, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public static s5g w(int i, boolean z) {
        return i != -1 ? i != 0 ? i != 1 ? new r5g("") : new n5g(ibb.g) : new n5g(ibb.a) : z ? new n5g(ibb.b) : new n5g(ibb.c);
    }

    public final void A(int i) {
        x9f x9fVarO = xfh.o(this, null, new ple(this, i, null), 3);
        this.s0.O(this, A0[1], x9fVarO);
    }

    public final void B(b2h b2hVar) {
        x9f x9fVarO = xfh.o(this, null, new rle(this, b2hVar, null), 3);
        this.v0.O(this, A0[4], x9fVarO);
    }

    public final sxg u() {
        return (sxg) this.c.getValue();
    }

    public final void v(int i) {
        int i2 = gbb.i;
        yy7[] yy7VarArr = A0;
        if (i == i2) {
            this.x0.O(this, yy7VarArr[6], xfh.o(this, null, new kle(this, !u().g.getBoolean("app.media.autoplay.gif", true), null), 3));
            return;
        }
        int i3 = gbb.g;
        t9f t9fVar = this.y0;
        if (i == i3) {
            t9fVar.O(this, yy7VarArr[7], xfh.o(this, null, new jle(this, !((gk) this.d.getValue()).a(), null), 3));
            return;
        }
        if (i == gbb.j) {
            this.w0.O(this, yy7VarArr[5], xfh.o(this, null, new nle(this, !u().g.getBoolean("app.media.load.roaming", false), null), 3));
            return;
        }
        if (i == gbb.l) {
            t9fVar.O(this, yy7VarArr[7], xfh.o(this, null, new qle(this, !u().g.getBoolean("app.media.autoplay.playlist", true), null), 3));
            return;
        }
        int i4 = gbb.k;
        ci5 ci5Var = this.z0;
        if (i == i4) {
            xfh.r(ci5Var, qpe.d);
            return;
        }
        if (i == gbb.q) {
            y(0);
            return;
        }
        if (i == gbb.s) {
            y(1);
            return;
        }
        if (i == gbb.r) {
            y(-1);
            return;
        }
        if (i == gbb.h) {
            xfh.r(ci5Var, qpe.e);
            return;
        }
        if (i == gbb.d) {
            x(0);
            return;
        }
        if (i == gbb.f) {
            x(1);
            return;
        }
        if (i == gbb.e) {
            x(-1);
            return;
        }
        if (i == gbb.o) {
            xfh.r(ci5Var, qpe.f);
            return;
        }
        if (i == gbb.C) {
            A(0);
            return;
        }
        if (i == gbb.E) {
            A(1);
            return;
        }
        if (i == gbb.D) {
            A(-1);
            return;
        }
        if (i == gbb.m) {
            xfh.r(ci5Var, qpe.g);
            return;
        }
        if (i == gbb.a) {
            z(0);
            return;
        }
        if (i == gbb.c) {
            z(1);
            return;
        }
        if (i == gbb.b) {
            z(-1);
            return;
        }
        if (i == gbb.p) {
            xfh.r(ci5Var, qpe.h);
            return;
        }
        if (i == gbb.t) {
            B(b2h.WITHOUT_COMPRESS);
            return;
        }
        if (i == gbb.v) {
            B(b2h.OPTIMAL);
        } else if (i == gbb.u) {
            B(b2h.MAXIMUM);
        } else if (i == gbb.n) {
            xfh.r(ci5Var, ope.b);
        }
    }

    public final void x(int i) {
        x9f x9fVarO = xfh.o(this, null, new lle(this, i, null), 3);
        this.t0.O(this, A0[2], x9fVarO);
    }

    public final void y(int i) {
        x9f x9fVarO = xfh.o(this, null, new mle(this, i, null), 3);
        this.u0.O(this, A0[3], x9fVarO);
    }

    public final void z(int i) {
        x9f x9fVarO = xfh.o(this, null, new ole(this, i, null), 3);
        this.Z.O(this, A0[0], x9fVarO);
    }
}
