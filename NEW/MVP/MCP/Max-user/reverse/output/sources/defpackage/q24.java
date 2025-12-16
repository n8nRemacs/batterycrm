package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class q24 {
    public static final /* synthetic */ yy7[] j;
    public final f84 a;
    public final mcf b;
    public final te8 c;
    public final k18 d;
    public final k18 e;
    public final t9f f = c7j.c();
    public final bwf g = new bwf(new hk1(28, this));
    public final tcf h;
    public final hbd i;

    static {
        z8a z8aVar = new z8a(q24.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public q24(ContextScope contextScope, mcf mcfVar, te8 te8Var, k18 k18Var, k18 k18Var2) {
        this.a = contextScope;
        this.b = mcfVar;
        this.c = te8Var;
        this.d = k18Var;
        this.e = k18Var2;
        tcf tcfVarA = ucf.a(nx3.d);
        this.h = tcfVarA;
        this.i = new hbd(tcfVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[EDGE_INSN: B:33:0x006e->B:23:0x006e BREAK  A[LOOP:1: B:11:0x002b->B:34:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(defpackage.q24 r7, java.util.List r8, java.lang.String r9) {
        /*
            r7.getClass()
            k18 r7 = r7.e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r8.next()
            r2 = r1
            xx3 r2 = (defpackage.xx3) r2
            java.util.List r3 = r2.d
            r4 = 0
            if (r3 == 0) goto L46
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L27
            goto L46
        L27:
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = defpackage.dnf.r(r5, r9, r4)
            if (r5 == 0) goto L2b
            goto L6e
        L46:
            java.lang.Object r3 = r7.getValue()
            o7e r3 = (defpackage.o7e) r3
            java.lang.CharSequence r5 = r2.b
            java.lang.String r5 = r5.toString()
            boolean r3 = r3.i(r5, r9)
            if (r3 != 0) goto L6e
            java.lang.CharSequence r2 = r2.c
            if (r2 == 0) goto L6b
            java.lang.Object r3 = r7.getValue()
            o7e r3 = (defpackage.o7e) r3
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.i(r2, r9)
            goto L6c
        L6b:
            r2 = r4
        L6c:
            if (r2 == 0) goto L6f
        L6e:
            r4 = 1
        L6f:
            if (r4 == 0) goto Le
            r0.add(r1)
            goto Le
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q24.a(q24, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public final void b() {
        ((f9a) this.g.getValue()).setValue(null);
        qt7 qt7Var = (qt7) this.f.D(this, j[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        this.h.m(null, nx3.d);
    }
}
