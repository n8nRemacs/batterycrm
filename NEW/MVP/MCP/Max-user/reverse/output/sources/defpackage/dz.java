package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dz extends dtf implements sm6 {
    public final /* synthetic */ eh9 X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ gz o;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(gz gzVar, eh9 eh9Var, Long l, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = gzVar;
        this.X = eh9Var;
        this.Y = l;
        this.Z = i;
        this.s0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dz) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dz(this.o, this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz.n(java.lang.Object):java.lang.Object");
    }
}
