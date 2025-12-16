package defpackage;

/* loaded from: classes.dex */
public final class up8 extends hm3 {
    public final bk0 k;
    public final boolean l;
    public final p9g m;
    public final l9g n;
    public qp8 o;
    public op8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public up8(bk0 bk0Var, boolean z) {
        boolean z2;
        this.k = bk0Var;
        if (z) {
            bk0Var.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new p9g();
        this.n = new l9g();
        bk0Var.getClass();
        this.o = new qp8(new sp8(bk0Var.f()), p9g.B0, qp8.o);
    }

    @Override // defpackage.bk0
    public final i09 f() {
        return this.k.f();
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void g() {
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.j = vggVar;
        this.i = xxg.l(null);
        if (this.l) {
            return;
        }
        this.q = true;
        r(null, this.k);
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        op8 op8Var = (op8) o29Var;
        if (op8Var.o != null) {
            bk0 bk0Var = op8Var.d;
            bk0Var.getClass();
            bk0Var.k(op8Var.o);
        }
        if (o29Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void m() {
        this.r = false;
        this.q = false;
        super.m();
    }

    @Override // defpackage.hm3
    public final c99 p(Object obj, c99 c99Var) {
        Object obj2 = c99Var.a;
        Object obj3 = this.o.d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = qp8.o;
        }
        return c99Var.b(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hm3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.Object r13, defpackage.bk0 r14, defpackage.r9g r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up8.q(java.lang.Object, bk0, r9g):void");
    }

    @Override // defpackage.bk0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final op8 a(c99 c99Var, qi4 qi4Var, long j) {
        op8 op8Var = new op8(c99Var, qi4Var, j);
        fsi.d(op8Var.d == null);
        bk0 bk0Var = this.k;
        op8Var.d = bk0Var;
        if (this.r) {
            Object obj = c99Var.a;
            if (this.o.d != null && obj.equals(qp8.o)) {
                obj = this.o.d;
            }
            c99 c99VarB = c99Var.b(obj);
            long j2 = op8Var.Y;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            bk0 bk0Var2 = op8Var.d;
            bk0Var2.getClass();
            o29 o29VarA = bk0Var2.a(c99VarB, qi4Var, j);
            op8Var.o = o29VarA;
            if (op8Var.X != null) {
                o29VarA.C(op8Var, j);
                return op8Var;
            }
        } else {
            this.p = op8Var;
            if (!this.q) {
                this.q = true;
                r(null, bk0Var);
            }
        }
        return op8Var;
    }

    public final void t(long j) {
        op8 op8Var = this.p;
        int iB = this.o.b(op8Var.a.a);
        if (iB == -1) {
            return;
        }
        qp8 qp8Var = this.o;
        l9g l9gVar = this.n;
        qp8Var.f(iB, l9gVar, false);
        long j2 = l9gVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        op8Var.Y = j;
    }
}
