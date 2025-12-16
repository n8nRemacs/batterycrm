package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x41 extends dtf implements sm6 {
    public k58 X;
    public int Y;
    public /* synthetic */ Object Z;
    public c51 o;
    public final /* synthetic */ c51 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(c51 c51Var, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = c51Var;
        this.t0 = str;
        this.u0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x41) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x41 x41Var = new x41(this.s0, this.t0, this.u0, continuation);
        x41Var.Z = obj;
        return x41Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r10 == r5) goto L29;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.Y
            r1 = 2
            java.lang.String r2 = "CallChatRepositoryTag"
            c51 r3 = r9.s0
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L27
            if (r0 == r4) goto L21
            if (r0 != r1) goto L19
            k58 r0 = r9.X
            c51 r3 = r9.o
            defpackage.g8j.b(r10)
            goto La1
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L25
            goto L51
        L25:
            r10 = move-exception
            goto L54
        L27:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.Z
            f84 r10 = (defpackage.f84) r10
            java.lang.String r10 = r9.t0
            boolean r0 = r9.u0
            java.lang.String r6 = "start loading call link info"
            defpackage.wqi.d(r2, r6)     // Catch: java.lang.Throwable -> L25
            k18 r6 = r3.c     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L25
            hwa r6 = (defpackage.hwa) r6     // Catch: java.lang.Throwable -> L25
            j58 r7 = new j58     // Catch: java.lang.Throwable -> L25
            java.lang.String r10 = defpackage.dqi.u(r10)     // Catch: java.lang.Throwable -> L25
            r7.<init>(r10, r0)     // Catch: java.lang.Throwable -> L25
            r9.Y = r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r6.F(r7, r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r5) goto L51
            goto La0
        L51:
            k58 r10 = (defpackage.k58) r10     // Catch: java.lang.Throwable -> L25
            goto L5a
        L54:
            ipd r0 = new ipd
            r0.<init>(r10)
            r10 = r0
        L5a:
            java.lang.Throwable r0 = defpackage.kpd.a(r10)
            if (r0 == 0) goto L86
            java.lang.String r6 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "fail when loading call link info due to: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.wqi.e(r2, r6, r0)
            tcf r0 = r3.i
        L77:
            java.lang.Object r6 = r0.getValue()
            r7 = r6
            n41 r7 = (defpackage.n41) r7
            n41 r7 = defpackage.n41.h
            boolean r6 = r0.c(r6, r7)
            if (r6 == 0) goto L77
        L86:
            boolean r0 = r10 instanceof defpackage.ipd
            if (r0 != 0) goto Lc4
            r0 = r10
            k58 r0 = (defpackage.k58) r0
            java.lang.String r6 = "call link info loaded success"
            defpackage.wqi.d(r2, r6)
            r9.Z = r10
            r9.o = r3
            r9.X = r0
            r9.Y = r1
            java.lang.Object r10 = defpackage.c51.a(r3, r0, r9)
            if (r10 != r5) goto La1
        La0:
            return r5
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            d2h r0 = r0.Z
            if (r0 == 0) goto Lc4
            long r0 = r0.Y
            r10 = r10 ^ r4
            w63 r2 = r3.b()
            hbd r0 = r2.k(r0)
            x9f r10 = r3.c(r0, r10)
            t9f r0 = r3.l
            yy7[] r1 = defpackage.c51.o
            r2 = 0
            r1 = r1[r2]
            r0.O(r3, r1, r10)
        Lc4:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x41.n(java.lang.Object):java.lang.Object");
    }
}
