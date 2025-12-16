package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a51 extends dtf implements sm6 {
    public final /* synthetic */ c51 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(c51 c51Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = c51Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a51) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a51(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r7.s(r13.Y, r10, r13) == r6) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.o
            r1 = 2
            long r2 = r13.Y
            r4 = 1
            c51 r5 = r13.X
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1d
            if (r0 != r1) goto L15
            defpackage.g8j.b(r14)
            goto L9c
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            defpackage.g8j.b(r14)
            goto L33
        L21:
            defpackage.g8j.b(r14)
            yy7[] r14 = defpackage.c51.o
            w63 r14 = r5.b()
            r13.o = r4
            java.lang.Object r14 = r14.p(r2, r13)
            if (r14 != r6) goto L33
            goto L9b
        L33:
            pb2 r14 = (defpackage.pb2) r14
            yy7[] r0 = defpackage.c51.o
            w63 r0 = r5.b()
            long r7 = r14.a
            hbd r0 = r0.j(r7)
            k18 r7 = r5.g
            java.lang.Object r7 = r7.getValue()
            dx3 r7 = (defpackage.dx3) r7
            x26 r7 = r7.a()
            d00 r8 = new d00
            r8.<init>(r7, r2, r4)
            z41 r7 = new z41
            r9 = 0
            r7.<init>(r8, r5, r14, r9)
            x26[] r14 = new defpackage.x26[r1]
            r14[r9] = r0
            r14[r4] = r7
            u92 r14 = defpackage.gw0.y(r14)
            x9f r14 = r5.c(r14, r4)
            t9f r0 = r5.l
            yy7[] r4 = defpackage.c51.o
            r4 = r4[r9]
            r0.O(r5, r4, r14)
            k18 r14 = r5.f
            java.lang.Object r14 = r14.getValue()
            qv3 r14 = (defpackage.qv3) r14
            boolean r14 = r14.m(r2)
            if (r14 == 0) goto L9c
            k18 r14 = r5.h
            java.lang.Object r14 = r14.getValue()
            r7 = r14
            k1a r7 = (defpackage.k1a) r7
            int r14 = defpackage.s65.d
            r14 = 30
            y65 r0 = defpackage.y65.SECONDS
            long r10 = defpackage.v9j.h(r14, r0)
            r13.o = r1
            long r8 = r13.Y
            r12 = r13
            java.lang.Object r14 = r7.s(r8, r10, r12)
            if (r14 != r6) goto L9c
        L9b:
            return r6
        L9c:
            qqg r14 = defpackage.qqg.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a51.n(java.lang.Object):java.lang.Object");
    }
}
