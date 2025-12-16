package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k33 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ b43 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k33(int i, b43 b43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = b43Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k33(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x038c A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k33.n(java.lang.Object):java.lang.Object");
    }
}
