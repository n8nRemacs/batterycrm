package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rz2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ sz2 Y;
    public pb2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(sz2 sz2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sz2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rz2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rz2(this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r10 == r6) goto L24;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.X
            qqg r1 = defpackage.qqg.a
            r2 = 0
            r3 = 2
            r4 = 1
            sz2 r5 = r9.Y
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1f
            if (r0 != r3) goto L17
            pb2 r0 = r9.o
            defpackage.g8j.b(r10)
            goto L7f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            defpackage.g8j.b(r10)
            goto L5a
        L23:
            defpackage.g8j.b(r10)
            k18 r10 = r5.s0
            java.lang.Object r10 = r10.getValue()
            w63 r10 = (defpackage.w63) r10
            long[] r0 = r5.b
            java.lang.String r7 = r5.F0
            tcf r8 = r5.w0
            java.lang.Object r8 = r8.getValue()
            iz2 r8 = (defpackage.iz2) r8
            java.lang.String r8 = r8.b
            if (r8 == 0) goto L49
            java.lang.String r8 = defpackage.tfi.h(r8)
            if (r8 == 0) goto L49
            java.lang.String r8 = r8.toString()
            goto L4a
        L49:
            r8 = r2
        L4a:
            r9.X = r4
            ve2 r10 = r10.i()
            r10.getClass()
            java.lang.Comparable r10 = defpackage.si2.h(r10, r0, r7, r8, r9)
            if (r10 != r6) goto L5a
            goto L7e
        L5a:
            r0 = r10
            pb2 r0 = (defpackage.pb2) r0
            long r7 = r0.a
            r9.o = r0
            r9.X = r3
            yy7[] r10 = defpackage.sz2.H0
            lzf r10 = r5.u()
            q2b r10 = (defpackage.q2b) r10
            z74 r10 = r10.b()
            lz2 r3 = new lz2
            r3.<init>(r5, r7, r2)
            java.lang.Object r10 = defpackage.svi.i(r10, r3, r9)
            if (r10 != r6) goto L7b
            goto L7c
        L7b:
            r10 = r1
        L7c:
            if (r10 != r6) goto L7f
        L7e:
            return r6
        L7f:
            ci5 r10 = r5.y0
            wy2 r2 = new wy2
            long r6 = r0.a
            r2.<init>(r6)
            defpackage.xfh.r(r10, r2)
            k18 r10 = r5.t0
            java.lang.Object r10 = r10.getValue()
            uh7 r10 = (defpackage.uh7) r10
            if (r10 == 0) goto La5
            th7 r0 = new th7
            rh7 r2 = defpackage.rh7.Y
            r0.<init>(r2, r4)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            f1e r2 = defpackage.f1e.CHAT
            r10.f(r0, r2)
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz2.n(java.lang.Object):java.lang.Object");
    }
}
