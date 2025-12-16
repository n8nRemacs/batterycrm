package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iw1 extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ nw1 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw1(k18 k18Var, nw1 nw1Var, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = nw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new iw1(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r5.a(defpackage.o71.a, r4) == r3) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r5)
            goto L3f
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            defpackage.g8j.b(r5)
            goto L30
        L1c:
            defpackage.g8j.b(r5)
            k18 r5 = r4.X
            java.lang.Object r5 = r5.getValue()
            qi8 r5 = (defpackage.qi8) r5
            r4.o = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r3) goto L30
            goto L3e
        L30:
            nw1 r5 = r4.Y
            jve r5 = r5.b
            r4.o = r1
            o71 r0 = defpackage.o71.a
            java.lang.Object r5 = r5.a(r0, r4)
            if (r5 != r3) goto L3f
        L3e:
            return r3
        L3f:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw1.n(java.lang.Object):java.lang.Object");
    }
}
