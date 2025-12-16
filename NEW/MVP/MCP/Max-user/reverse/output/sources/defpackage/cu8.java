package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cu8 extends dtf implements sm6 {
    public final /* synthetic */ mu8 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu8(mu8 mu8Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = mu8Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cu8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cu8(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.o
            qqg r1 = defpackage.qqg.a
            r2 = 2
            r3 = 1
            mu8 r4 = r11.X
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            defpackage.g8j.b(r12)
            return r1
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            defpackage.g8j.b(r12)
            goto L39
        L20:
            defpackage.g8j.b(r12)
            k18 r12 = r4.c
            java.lang.Object r12 = r12.getValue()
            gx9 r12 = (defpackage.gx9) r12
            r11.o = r3
            bsd r12 = r12.a
            long r6 = r11.Y
            java.lang.Object r12 = r12.j(r6, r11)
            if (r12 != r5) goto L39
            goto Lca
        L39:
            si9 r12 = (defpackage.si9) r12
            if (r12 != 0) goto L3f
            goto Lcb
        L3f:
            sd8 r0 = defpackage.mu8.t(r4)
            dce r0 = r0.f
            java.lang.CharSequence r0 = r0.j
            k18 r6 = r4.d
            java.lang.Object r6 = r6.getValue()
            sd8 r6 = (defpackage.sd8) r6
            dce r6 = r6.f
            r7 = 0
            r6.j = r7
            dce r6 = r4.u()
            java.util.ArrayList r6 = r6.d()
            dce r7 = r4.u()
            java.util.concurrent.CopyOnWriteArraySet r7 = r7.a
            boolean r8 = r12.t()
            r9 = 0
            if (r8 == 0) goto L7f
            jdc r12 = r12.x0
            java.lang.Object r12 = r12.b
            java.util.List r12 = (java.util.List) r12
            ycd r8 = new ycd
            r10 = 10
            r8.<init>(r10)
            java.util.List r12 = defpackage.jqi.d(r12, r8)
            int r12 = r12.size()
            goto L80
        L7f:
            r12 = r9
        L80:
            int r8 = r7.size()
            if (r12 == r8) goto L88
        L86:
            r9 = r3
            goto Lb1
        L88:
            java.util.Iterator r12 = r7.iterator()
        L8c:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto Lb1
            java.lang.Object r7 = r12.next()
            fce r7 = (defpackage.fce) r7
            boolean r8 = r7.f
            pd8 r10 = r7.a
            if (r8 != 0) goto La3
            boolean r8 = r10 instanceof defpackage.g00
            if (r8 == 0) goto La3
            goto L86
        La3:
            zub r7 = r7.c
            boolean r7 = defpackage.zub.b(r7, r10)
            if (r7 == 0) goto Lac
            goto L86
        Lac:
            boolean r7 = r10 instanceof defpackage.g00
            if (r7 != 0) goto L8c
            goto L86
        Lb1:
            ci5 r12 = r4.x0
            tt8 r7 = new tt8
            r7.<init>(r0, r6, r9)
            defpackage.xfh.r(r12, r7)
            pv0 r12 = r4.u0
            zs8 r0 = new zs8
            r0.<init>(r3)
            r11.o = r2
            java.lang.Object r12 = r12.h(r0, r11)
            if (r12 != r5) goto Lcb
        Lca:
            return r5
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu8.n(java.lang.Object):java.lang.Object");
    }
}
