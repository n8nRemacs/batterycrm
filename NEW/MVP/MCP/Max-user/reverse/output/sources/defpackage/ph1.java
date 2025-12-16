package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ph1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ph1 ph1Var = (ph1) l((qa) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ph1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ph1 ph1Var = new ph1(this.X, continuation);
        ph1Var.o = obj;
        return ph1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r4 = defpackage.ve3.a(r4);
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r11.o
            qa r12 = (defpackage.qa) r12
            ci1 r0 = r11.X
            qv1 r1 = r0.X
            long r2 = r12.c
            java.util.Map r12 = r12.a
            r1.h(r2)
            tcf r1 = r0.B0
        L14:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            pa r3 = (defpackage.pa) r3
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L29
            int r4 = defpackage.m0b.s2
            n5g r5 = new n5g
            r5.<init>(r4)
            goto L35
        L29:
            int r4 = defpackage.l0b.a
            int r5 = r12.size()
            j5g r6 = new j5g
            r6.<init>(r4, r5)
            r5 = r6
        L35:
            lcj r4 = r0.Y
            r4.getClass()
            int r4 = r12.size()
            r6 = 5
            if (r4 > r6) goto L46
            java.util.ArrayList r4 = defpackage.lcj.l(r12)
            goto La3
        L46:
            o98 r4 = defpackage.ve3.d()
            java.util.Set r7 = r12.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L53:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r7.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L9a
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            if (r8 >= r6) goto L7a
            java.lang.Object r8 = r9.getKey()
            zi1 r8 = (defpackage.zi1) r8
            java.lang.Object r9 = r9.getValue()
            gs1 r9 = (defpackage.gs1) r9
            ixg r8 = defpackage.lcj.m(r8, r9)
            r4.add(r8)
            r8 = r10
            goto L53
        L7a:
            jxg r6 = new jxg
            int r7 = defpackage.m0b.t2
            int r8 = r12.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            p5g r9 = new p5g
            java.util.List r8 = defpackage.ys.D(r8)
            r9.<init>(r7, r8)
            r6.<init>(r9)
            r4.add(r6)
            goto L9f
        L9a:
            defpackage.ve3.p()
            r12 = 0
            throw r12
        L9f:
            o98 r4 = defpackage.ve3.a(r4)
        La3:
            r3.getClass()
            pa r3 = new pa
            r3.<init>(r5, r4)
            boolean r2 = r1.c(r2, r3)
            if (r2 == 0) goto L14
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph1.n(java.lang.Object):java.lang.Object");
    }
}
