package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wjf extends dtf implements sm6 {
    public final /* synthetic */ hkf X;
    public final /* synthetic */ Set Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjf(hkf hkfVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.X = hkfVar;
        this.Y = set;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wjf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wjf(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r7.c(r0, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (defpackage.n8j.a(r7, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r5;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 2
            r2 = 1
            java.util.Set r3 = r6.Y
            hkf r4 = r6.X
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            defpackage.g8j.b(r7)
            goto L54
        L1b:
            defpackage.g8j.b(r7)
            ghf r7 = r4.b
            ghf r0 = defpackage.ghf.b
            g84 r5 = defpackage.g84.a
            if (r7 != r0) goto L3b
            k18 r7 = r4.X
            java.lang.Object r7 = r7.getValue()
            kdd r7 = (defpackage.kdd) r7
            java.util.List r0 = defpackage.ue3.d0(r3)
            r6.o = r2
            java.lang.Object r7 = r7.c(r0, r6)
            if (r7 != r5) goto L54
            goto L53
        L3b:
            k18 r7 = r4.Y
            java.lang.Object r7 = r7.getValue()
            ps5 r7 = (defpackage.ps5) r7
            java.util.List r0 = defpackage.ue3.d0(r3)
            uk3 r7 = r7.g(r0)
            r6.o = r1
            java.lang.Object r7 = defpackage.n8j.a(r7, r6)
            if (r7 != r5) goto L54
        L53:
            return r5
        L54:
            int r7 = defpackage.vdb.F
            int r0 = r3.size()
            yy7[] r1 = defpackage.hkf.A0
            java.lang.String r0 = r4.v(r0)
            ci5 r1 = r4.y0
            qne r2 = new qne
            int r3 = defpackage.yud.x
            android.content.Context r4 = r4.d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r7 = r4.getString(r7, r0)
            r5g r0 = new r5g
            r0.<init>(r7)
            r2.<init>(r3, r0)
            defpackage.xfh.r(r1, r2)
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjf.n(java.lang.Object):java.lang.Object");
    }
}
