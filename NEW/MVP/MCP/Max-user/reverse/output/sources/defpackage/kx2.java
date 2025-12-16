package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kx2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.o = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kx2 kx2Var = (kx2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kx2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kx2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zx2 zx2Var = this.o;
        pb2 pb2Var = (pb2) zx2Var.a1.a.getValue();
        qqg qqgVar = qqg.a;
        if (pb2Var != null) {
            long j = pb2Var.b.a;
            dkb dkbVar = (dkb) zx2Var.J0.getValue();
            dkbVar.getClass();
            if (j != 0) {
                dkbVar.f(j, s00.STICKER, 0L);
            }
        }
        return qqgVar;
    }
}
