package defpackage;

/* loaded from: classes.dex */
public final class vp8 extends l6i {
    public final boolean l;
    public final q9g m;
    public final m9g n;
    public rp8 o;
    public pp8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public vp8(ck0 ck0Var, boolean z) {
        super(ck0Var);
        this.l = z && ck0Var.j();
        this.m = new q9g();
        this.n = new m9g();
        s9g s9gVarH = ck0Var.h();
        if (s9gVarH == null) {
            this.o = new rp8(new tp8(ck0Var.i()), q9g.q, rp8.h);
        } else {
            this.o = new rp8(s9gVarH, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.l6i
    public final d99 A(d99 d99Var) {
        Object obj = d99Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = rp8.h;
        }
        return d99Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.l6i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.s9g r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp8.B(s9g):void");
    }

    @Override // defpackage.l6i
    public final void D() {
        if (this.l) {
            return;
        }
        this.q = true;
        C();
    }

    @Override // defpackage.ck0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final pp8 c(d99 d99Var, ri4 ri4Var, long j) {
        pp8 pp8Var = new pp8(d99Var, ri4Var, j);
        hsi.g(pp8Var.d == null);
        pp8Var.d = this.k;
        if (!this.r) {
            this.p = pp8Var;
            if (!this.q) {
                this.q = true;
                C();
            }
            return pp8Var;
        }
        Object obj = d99Var.a;
        if (this.o.g != null && obj.equals(rp8.h)) {
            obj = this.o.g;
        }
        pp8Var.a(d99Var.a(obj));
        return pp8Var;
    }

    public final boolean F(long j) {
        pp8 pp8Var = this.p;
        int iB = this.o.b(pp8Var.a.a);
        if (iB == -1) {
            return false;
        }
        rp8 rp8Var = this.o;
        m9g m9gVar = this.n;
        rp8Var.f(iB, m9gVar, false);
        long j2 = m9gVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        pp8Var.Y = j;
        return true;
    }

    @Override // defpackage.ck0
    public final boolean a(k09 k09Var) {
        return this.k.a(k09Var);
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        pp8 pp8Var = (pp8) p29Var;
        if (pp8Var.o != null) {
            ck0 ck0Var = pp8Var.d;
            ck0Var.getClass();
            ck0Var.o(pp8Var.o);
        }
        if (p29Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // defpackage.l6i, defpackage.ck0
    public final void t(k09 k09Var) {
        if (this.s) {
            rp8 rp8Var = this.o;
            this.o = new rp8(new f5c(this.o.e, k09Var), rp8Var.f, rp8Var.g);
        } else {
            this.o = new rp8(new tp8(k09Var), q9g.q, rp8.h);
        }
        this.k.t(k09Var);
    }
}
