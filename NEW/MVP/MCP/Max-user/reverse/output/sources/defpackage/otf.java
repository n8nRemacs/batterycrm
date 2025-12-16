package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class otf extends dtf implements sm6 {
    public ytf X;
    public bug Y;
    public int Z;
    public n9a o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ ytf t0;
    public final /* synthetic */ bug u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otf(ytf ytfVar, bug bugVar, Continuation continuation) {
        super(2, continuation);
        this.t0 = ytfVar;
        this.u0 = bugVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((otf) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        otf otfVar = new otf(this.t0, this.u0, continuation);
        otfVar.s0 = obj;
        return otfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r10.d(r0, r9) == r4) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.Z
            r1 = 2
            r2 = 1
            r3 = 0
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r10)
            goto La7
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            bug r0 = r9.Y
            ytf r2 = r9.X
            n9a r5 = r9.o
            java.lang.Object r6 = r9.s0
            sac r6 = (defpackage.sac) r6
            defpackage.g8j.b(r10)
            goto L48
        L28:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.s0
            r6 = r10
            sac r6 = (defpackage.sac) r6
            ytf r10 = r9.t0
            n9a r5 = r10.h
            r9.s0 = r6
            r9.o = r5
            r9.X = r10
            bug r0 = r9.u0
            r9.Y = r0
            r9.Z = r2
            java.lang.Object r2 = r5.e(r3, r9)
            if (r2 != r4) goto L47
            goto La6
        L47:
            r2 = r10
        L48:
            c9a r10 = r2.i     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r10 = r10.f(r0)     // Catch: java.lang.Throwable -> Laa
            x26 r10 = (defpackage.x26) r10     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto L53
            goto L8d
        L53:
            ltf r10 = new ltf     // Catch: java.lang.Throwable -> Laa
            r10.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> Laa
            mwd r7 = new mwd     // Catch: java.lang.Throwable -> Laa
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Laa
            mtf r10 = new mtf     // Catch: java.lang.Throwable -> Laa
            r10.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> Laa
            d53 r10 = defpackage.gw0.s(r7, r10)     // Catch: java.lang.Throwable -> Laa
            ntf r7 = new ntf     // Catch: java.lang.Throwable -> Laa
            r8 = 0
            r7.<init>(r2, r3, r8)     // Catch: java.lang.Throwable -> Laa
            m36 r8 = new m36     // Catch: java.lang.Throwable -> Laa
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> Laa
            mo1 r10 = new mo1     // Catch: java.lang.Throwable -> Laa
            r7 = 9
            r10.<init>(r2, r0, r3, r7)     // Catch: java.lang.Throwable -> Laa
            m36 r7 = new m36     // Catch: java.lang.Throwable -> Laa
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> Laa
            s83 r10 = new s83     // Catch: java.lang.Throwable -> Laa
            r10.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> Laa
            n46 r8 = new n46     // Catch: java.lang.Throwable -> Laa
            r8.<init>(r7, r10)     // Catch: java.lang.Throwable -> Laa
            c9a r10 = r2.i     // Catch: java.lang.Throwable -> Laa
            r10.m(r0, r8)     // Catch: java.lang.Throwable -> Laa
            r10 = r8
        L8d:
            r5.g(r3)
            w13 r0 = new w13
            r2 = 1
            r0.<init>(r2, r6)
            r9.s0 = r3
            r9.o = r3
            r9.X = r3
            r9.Y = r3
            r9.Z = r1
            java.lang.Object r10 = r10.d(r0, r9)
            if (r10 != r4) goto La7
        La6:
            return r4
        La7:
            qqg r10 = defpackage.qqg.a
            return r10
        Laa:
            r10 = move-exception
            r5.g(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otf.n(java.lang.Object):java.lang.Object");
    }
}
