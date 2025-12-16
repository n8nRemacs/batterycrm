package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vy3 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ zy3 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy3(int i, zy3 zy3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = zy3Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vy3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vy3(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r1 == r13) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0216, code lost:
    
        if (r1 == r13) goto L105;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy3.n(java.lang.Object):java.lang.Object");
    }
}
