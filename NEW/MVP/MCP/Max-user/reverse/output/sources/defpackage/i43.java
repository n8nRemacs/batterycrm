package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i43 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ k53 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(int i, k53 k53Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = k53Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i43) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new i43(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x03db A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i43.n(java.lang.Object):java.lang.Object");
    }
}
