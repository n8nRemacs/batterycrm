package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class qb {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final ContextScope g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final tcf i;
    public final tcf j;
    public final hbd k;
    public final jve l;
    public final gbd m;

    public qb(lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = d7j.a(((q2b) lzfVar).b());
        hd5 hd5Var = hd5.a;
        this.i = ucf.a(hd5Var);
        tcf tcfVarA = ucf.a(hd5Var);
        this.j = tcfVarA;
        this.k = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, 0, 7);
        this.l = jveVarB;
        this.m = new gbd(jveVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qb r5, defpackage.q44 r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.ob
            if (r0 == 0) goto L16
            r0 = r6
            ob r0 = (defpackage.ob) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            ob r0 = new ob
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.o
            qb r1 = r0.d
            defpackage.g8j.b(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            qb r5 = r0.d
            defpackage.g8j.b(r6)
            goto L57
        L3f:
            defpackage.g8j.b(r6)
            k18 r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            l24 r6 = (defpackage.l24) r6
            r0.d = r5
            r0.Z = r3
            qv3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r4) goto L57
            goto L69
        L57:
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            tcf r3 = r5.i
            r0.d = r5
            r0.o = r6
            r0.Z = r2
            r3.setValue(r1)
            qqg r1 = defpackage.qqg.a
            if (r1 != r4) goto L6a
        L69:
            return r4
        L6a:
            r1 = r5
            r5 = r6
        L6c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            n8 r5 = new n8
            r2 = 7
            r5.<init>(r2)
            oz5 r5 = defpackage.lee.h(r6, r5)
            x74 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.d7j.a(r6)
            nb r2 = new nb
            r3 = 0
            r2.<init>(r0, r6, r1, r3)
            nhg r6 = new nhg
            r6.<init>(r5, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.a(qb, q44):java.lang.Object");
    }

    public final da b(ku3 ku3Var) {
        String string;
        Uri uri;
        String strS = ku3Var.s(((w4e) ((pb3) this.c.getValue())).n(), il0.c);
        s5g n5gVar = (ku3Var.v() && ku3Var.A()) ? new n5g(mvd.R1) : ku3Var.y((rt5) this.d.getValue()) ? new n5g(mvd.C) : ku3Var.v() ? new n5g(mvd.n) : new r5g(((h8c) this.e.getValue()).b(ku3Var));
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (strS == null || (uri = Uri.parse(strS)) == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        return new da(jP, strE, n5gVar, string, ku3Var.o(), ku3Var.x());
    }
}
