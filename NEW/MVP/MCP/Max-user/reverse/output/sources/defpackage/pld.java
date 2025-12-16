package defpackage;

/* loaded from: classes.dex */
public final class pld {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(tk0 tk0Var) {
        int i = tk0Var.Z;
        if (i == 2) {
            hsi.g(i == 2);
            tk0Var.Z = 1;
            tk0Var.t();
        }
    }

    public static boolean h(tk0 tk0Var) {
        return tk0Var.Z != 0;
    }

    public static void l(tk0 tk0Var, long j) {
        tk0Var.x0 = true;
        if (tk0Var instanceof h5g) {
            h5g h5gVar = (h5g) tk0Var;
            hsi.g(h5gVar.x0);
            h5gVar.U0 = j;
        }
    }

    public void a(tk0 tk0Var, sk skVar) {
        hsi.g(((tk0) this.e) == tk0Var || ((tk0) this.f) == tk0Var);
        if (h(tk0Var)) {
            if (tk0Var == ((tk0) skVar.X)) {
                skVar.Y = null;
                skVar.X = null;
                skVar.b = true;
            }
            b(tk0Var);
            hsi.g(tk0Var.Z == 1);
            tk0Var.c.clear();
            tk0Var.Z = 0;
            tk0Var.s0 = null;
            tk0Var.t0 = null;
            tk0Var.x0 = false;
            tk0Var.m();
            tk0Var.A0 = null;
        }
    }

    public int c() {
        boolean zH = h((tk0) this.e);
        tk0 tk0Var = (tk0) this.f;
        return (zH ? 1 : 0) + ((tk0Var == null || !h(tk0Var)) ? 0 : 1);
    }

    public tk0 d(r29 r29Var) {
        jxd jxdVar;
        if (r29Var != null && (jxdVar = r29Var.c[this.c]) != null) {
            tk0 tk0Var = (tk0) this.e;
            if (tk0Var.s0 == jxdVar) {
                return tk0Var;
            }
            tk0 tk0Var2 = (tk0) this.f;
            if (tk0Var2 != null && tk0Var2.s0 == jxdVar) {
                return tk0Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(defpackage.r29 r8, defpackage.tk0 r9) {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            jxd[] r2 = r8.c
            r2 = r2[r0]
            jxd r3 = r9.s0
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.i()
            if (r2 != 0) goto L49
            r29 r2 = r8.m
            u29 r3 = r8.g
            boolean r3 = r3.g
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof defpackage.h5g
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof defpackage.fz9
            if (r3 != 0) goto L39
            long r3 = r9.w0
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            r29 r8 = r8.m
            if (r8 == 0) goto L47
            jxd[] r8 = r8.c
            r8 = r8[r0]
            jxd r9 = r9.s0
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.e(r29, tk0):boolean");
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((tk0) this.e);
        }
        tk0 tk0Var = (tk0) this.f;
        tk0Var.getClass();
        return tk0Var.Z != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.a) {
                tk0 tk0Var = (tk0) this.e;
                hsi.g(tk0Var.Z == 0);
                tk0Var.c.clear();
                tk0Var.q();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            tk0 tk0Var2 = (tk0) this.f;
            tk0Var2.getClass();
            hsi.g(tk0Var2.Z == 0);
            tk0Var2.c.clear();
            tk0Var2.q();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(tk0 tk0Var, r29 r29Var, ggg gggVar, sk skVar) {
        int i;
        tk0 tk0Var2 = (tk0) this.e;
        int i2 = this.c;
        if (tk0Var == null || tk0Var.Z == 0 || (tk0Var == tk0Var2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (tk0Var == ((tk0) this.f) && this.d == 3) {
            return 1;
        }
        Object[] objArr = tk0Var.s0 != r29Var.c[i2];
        boolean zS = gggVar.S(i2);
        if (!zS || objArr != false) {
            if (!tk0Var.x0) {
                bn5 bn5Var = ((bn5[]) gggVar.o)[i2];
                int length = bn5Var != null ? bn5Var.length() : 0;
                hf6[] hf6VarArr = new hf6[length];
                for (int i3 = 0; i3 < length; i3++) {
                    bn5Var.getClass();
                    hf6VarArr[i3] = bn5Var.d(i3);
                }
                jxd jxdVar = r29Var.c[i2];
                jxdVar.getClass();
                tk0Var.x(hf6VarArr, jxdVar, r29Var.e(), r29Var.p, r29Var.g.a);
                return 3;
            }
            if (!tk0Var.j()) {
                return 0;
            }
            a(tk0Var, skVar);
            if (!zS || f()) {
                i(tk0Var == tk0Var2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((tk0) this.e)) {
            i(true);
        }
        tk0 tk0Var = (tk0) this.f;
        if (tk0Var == null || tk0Var.Z != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        tk0 tk0Var = (tk0) this.e;
        int i2 = tk0Var.Z;
        if (i2 == 1 && this.d != 4) {
            hsi.g(i2 == 1);
            tk0Var.Z = 2;
            tk0Var.s();
            return;
        }
        tk0 tk0Var2 = (tk0) this.f;
        if (tk0Var2 == null || (i = tk0Var2.Z) != 1 || this.d == 3) {
            return;
        }
        hsi.g(i == 1);
        tk0Var2.Z = 2;
        tk0Var2.s();
    }
}
