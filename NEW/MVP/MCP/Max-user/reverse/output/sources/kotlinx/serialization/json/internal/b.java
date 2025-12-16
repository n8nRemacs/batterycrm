package kotlinx.serialization.json.internal;

import defpackage.bj;
import defpackage.cmf;
import defpackage.ew7;
import defpackage.f9c;
import defpackage.kc3;
import defpackage.koi;
import defpackage.lw7;
import defpackage.mfh;
import defpackage.os0;
import defpackage.p6i;
import defpackage.ree;
import defpackage.tw7;
import defpackage.wl3;
import defpackage.wsi;
import defpackage.xl3;
import defpackage.zy7;

/* loaded from: classes.dex */
public final class b {
    public final os0 a;
    public final ew7 b;
    public final p6i c;
    public final b[] d;
    public final kc3 e;
    public final lw7 f;
    public boolean g;
    public String h;
    public String i;

    public b(os0 os0Var, ew7 ew7Var, p6i p6iVar, b[] bVarArr) {
        this.a = os0Var;
        this.b = ew7Var;
        this.c = p6iVar;
        this.d = bVarArr;
        this.e = ew7Var.b;
        this.f = ew7Var.a;
        int iOrdinal = p6iVar.ordinal();
        if (bVarArr != null) {
            b bVar = bVarArr[iOrdinal];
            if (bVar == null && bVar == this) {
                return;
            }
            bVarArr[iOrdinal] = this;
        }
    }

    public final b a(ree reeVar) {
        b bVar;
        ew7 ew7Var = this.b;
        p6i p6iVarH = wsi.h(ew7Var, reeVar);
        char c = p6iVarH.a;
        os0 os0Var = this.a;
        os0Var.p(c);
        os0Var.a = true;
        String str = this.h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = reeVar.a();
            }
            os0Var.e();
            r(str);
            os0Var.p(':');
            r(strA);
            this.h = null;
            this.i = null;
        }
        if (this.c == p6iVarH) {
            return this;
        }
        b[] bVarArr = this.d;
        return (bVarArr == null || (bVar = bVarArr[p6iVarH.ordinal()]) == null) ? new b(os0Var, ew7Var, p6iVarH, bVarArr) : bVar;
    }

    public final void b(boolean z) {
        if (this.g) {
            r(String.valueOf(z));
        } else {
            ((bj) this.a.b).s(String.valueOf(z));
        }
    }

    public final void c(ree reeVar, int i, boolean z) {
        g(reeVar, i);
        b(z);
    }

    public final void d(byte b) {
        if (this.g) {
            r(String.valueOf((int) b));
        } else {
            this.a.n(b);
        }
    }

    public final void e(char c) {
        r(String.valueOf(c));
    }

    public final void f(double d) {
        boolean z = this.g;
        os0 os0Var = this.a;
        if (z) {
            r(String.valueOf(d));
        } else {
            ((bj) os0Var.b).s(String.valueOf(d));
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw koi.a(Double.valueOf(d), ((bj) os0Var.b).toString());
        }
    }

    public final void g(ree reeVar, int i) {
        int iOrdinal = this.c.ordinal();
        os0 os0Var = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!os0Var.a) {
                os0Var.p(',');
            }
            os0Var.e();
            return;
        }
        if (iOrdinal == 2) {
            if (os0Var.a) {
                this.g = true;
                os0Var.e();
                return;
            }
            if (i % 2 == 0) {
                os0Var.p(',');
                os0Var.e();
            } else {
                os0Var.p(':');
                os0Var.v();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!os0Var.a) {
                os0Var.p(',');
            }
            os0Var.e();
            mfh.i(this.b, reeVar);
            r(reeVar.g(i));
            os0Var.p(':');
            os0Var.v();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            os0Var.p(',');
            os0Var.v();
            this.g = false;
        }
    }

    public final void h(float f) {
        boolean z = this.g;
        os0 os0Var = this.a;
        if (z) {
            r(String.valueOf(f));
        } else {
            ((bj) os0Var.b).s(String.valueOf(f));
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw koi.a(Float.valueOf(f), ((bj) os0Var.b).toString());
        }
    }

    public final b i(ree reeVar) {
        boolean zA = cmf.a(reeVar);
        p6i p6iVar = this.c;
        ew7 ew7Var = this.b;
        os0 wl3Var = this.a;
        if (zA) {
            if (!(wl3Var instanceof xl3)) {
                wl3Var = new xl3((bj) wl3Var.b, this.g);
            }
            return new b(wl3Var, ew7Var, p6iVar, null);
        }
        if (reeVar.isInline() && reeVar.equals(tw7.a)) {
            if (!(wl3Var instanceof wl3)) {
                wl3Var = new wl3((bj) wl3Var.b, this.g);
            }
            return new b(wl3Var, ew7Var, p6iVar, null);
        }
        if (this.h != null) {
            this.i = reeVar.a();
        }
        return this;
    }

    public final b j(f9c f9cVar, int i) {
        g(f9cVar, i);
        return i(f9cVar.i(i));
    }

    public final void k(int i) {
        if (this.g) {
            r(String.valueOf(i));
        } else {
            this.a.q(i);
        }
    }

    public final void l(long j) {
        if (this.g) {
            r(String.valueOf(j));
        } else {
            this.a.r(j);
        }
    }

    public final void m() {
        this.a.s("null");
    }

    public final void n(ree reeVar, int i, zy7 zy7Var, Object obj) {
        if (obj != null || this.f.c) {
            g(reeVar, i);
            if (zy7Var.d().c()) {
                p(zy7Var, obj);
            } else if (obj == null) {
                m();
            } else {
                p(zy7Var, obj);
            }
        }
    }

    public final void o(ree reeVar, int i, zy7 zy7Var, Object obj) {
        g(reeVar, i);
        p(zy7Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.zy7 r5, java.lang.Object r6) {
        /*
            r4 = this;
            ew7 r0 = r4.b
            lw7 r1 = r0.a
            boolean r2 = r5 instanceof defpackage.s5c
            r3 = 1
            if (r2 == 0) goto Le
            int r1 = r1.g
            if (r1 == r3) goto L43
            goto L3a
        Le:
            int r1 = r1.g
            int r1 = defpackage.az1.v(r1)
            if (r1 == 0) goto L43
            if (r1 == r3) goto L22
            r0 = 2
            if (r1 != r0) goto L1c
            goto L43
        L1c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L22:
            ree r1 = r5.d()
            s9j r1 = r1.e()
            nnf r3 = defpackage.nnf.b
            boolean r3 = defpackage.fni.a(r1, r3)
            if (r3 != 0) goto L3a
            nnf r3 = defpackage.nnf.e
            boolean r1 = defpackage.fni.a(r1, r3)
            if (r1 == 0) goto L43
        L3a:
            ree r1 = r5.d()
            java.lang.String r0 = defpackage.i5j.a(r0, r1)
            goto L44
        L43:
            r0 = 0
        L44:
            if (r2 == 0) goto L75
            s5c r5 = (defpackage.s5c) r5
            if (r6 != 0) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            ree r5 = r5.d()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L6b:
            r5.getClass()
            kc3 r5 = r4.e
            r5.getClass()
            r5 = 0
            throw r5
        L75:
            if (r0 == 0) goto L83
            ree r1 = r5.d()
            java.lang.String r1 = r1.a()
            r4.h = r0
            r4.i = r1
        L83:
            r5.a(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.b.p(zy7, java.lang.Object):void");
    }

    public final void q(short s) {
        if (this.g) {
            r(String.valueOf((int) s));
        } else {
            this.a.t(s);
        }
    }

    public final void r(String str) {
        this.a.u(str);
    }

    public final void s(ree reeVar, int i, String str) {
        g(reeVar, i);
        r(str);
    }

    public final void t() {
        os0 os0Var = this.a;
        os0Var.getClass();
        os0Var.a = false;
        os0Var.p(this.c.b);
    }

    public final boolean u() {
        return false;
    }
}
