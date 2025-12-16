package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sxf extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vxf Z;
    public long o;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxf(vxf vxfVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = vxfVar;
        this.s0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sxf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sxf sxfVar = new sxf(this.Z, this.s0, continuation);
        sxfVar.Y = obj;
        return sxfVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:(1:(2:6|48)(2:7|8))(1:9))(3:10|(0)|47)|13|(4:15|(1:20)|21|(1:23))|24|50|25|26|(1:31)|32|(1:34)|35|(3:37|(1:45)|(1:47))|48) */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.n(java.lang.Object):java.lang.Object");
    }
}
