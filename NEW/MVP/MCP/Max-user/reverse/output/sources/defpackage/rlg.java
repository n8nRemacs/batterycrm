package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rlg extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ emg Z;
    public emg o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlg(emg emgVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = emgVar;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rlg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rlg rlgVar = new rlg(this.Z, this.s0, continuation);
        rlgVar.Y = obj;
        return rlgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (defpackage.s8j.c(1000, r9) == r6) goto L29;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            emg r0 = r9.Z
            ci5 r1 = r0.C0
            int r2 = r9.X
            r3 = 1
            r4 = 2
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L26
            if (r2 == r3) goto L20
            if (r2 != r4) goto L18
            emg r0 = r9.o
            defpackage.g8j.b(r10)
            goto L97
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L24
            goto L47
        L24:
            r10 = move-exception
            goto L4a
        L26:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.Y
            f84 r10 = (defpackage.f84) r10
            java.lang.String r10 = r9.s0
            k18 r2 = r0.t0     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L24
            hwa r2 = (defpackage.hwa) r2     // Catch: java.lang.Throwable -> L24
            g70 r7 = new g70     // Catch: java.lang.Throwable -> L24
            java.lang.String r8 = r0.o     // Catch: java.lang.Throwable -> L24
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> L24
            r9.X = r3     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r2.F(r7, r9)     // Catch: java.lang.Throwable -> L24
            if (r10 != r6) goto L47
            goto L96
        L47:
            h70 r10 = (defpackage.h70) r10     // Catch: java.lang.Throwable -> L24
            goto L50
        L4a:
            ipd r2 = new ipd
            r2.<init>(r10)
            r10 = r2
        L50:
            boolean r2 = r10 instanceof defpackage.ipd
            if (r2 != 0) goto L67
            r2 = r10
            h70 r2 = (defpackage.h70) r2
            r0.L0 = r5
            jmg r2 = new jmg
            jq3 r3 = defpackage.jq3.SUCCESS
            r2.<init>(r3, r5)
            defpackage.xfh.r(r1, r2)
            r0.t(r5)
        L67:
            java.lang.Throwable r2 = defpackage.kpd.a(r10)
            if (r2 == 0) goto La5
            r0.L0 = r5
            boolean r3 = r2 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto La4
            java.lang.String r3 = r0.Y
            java.lang.String r7 = "Can't check email code"
            defpackage.wqi.p(r3, r7, r2)
            jmg r3 = new jmg
            jq3 r7 = defpackage.jq3.ERROR
            s5g r2 = defpackage.vmi.d(r2)
            r3.<init>(r7, r2)
            defpackage.xfh.r(r1, r3)
            r9.Y = r10
            r9.o = r0
            r9.X = r4
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.s8j.c(r1, r9)
            if (r10 != r6) goto L97
        L96:
            return r6
        L97:
            ci5 r10 = r0.C0
            jmg r0 = new jmg
            jq3 r1 = defpackage.jq3.NORMAL
            r0.<init>(r1, r5)
            defpackage.xfh.r(r10, r0)
            goto La5
        La4:
            throw r2
        La5:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlg.n(java.lang.Object):java.lang.Object");
    }
}
