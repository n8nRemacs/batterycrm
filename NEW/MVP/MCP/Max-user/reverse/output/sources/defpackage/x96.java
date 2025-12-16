package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x96 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n96 Y;
    public final /* synthetic */ ca6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x96(n96 n96Var, ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = n96Var;
        this.Z = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x96 x96Var = new x96(this.Y, this.Z, continuation);
        x96Var.X = obj;
        return x96Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r0 == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if (defpackage.svi.i(((defpackage.q2b) r0.d).c(), new defpackage.y96(r0, null), r18) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        if (r0 == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        if (defpackage.svi.i(((defpackage.q2b) r0.d).c(), new defpackage.y96(r0, null), r18) == r3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x96.n(java.lang.Object):java.lang.Object");
    }
}
