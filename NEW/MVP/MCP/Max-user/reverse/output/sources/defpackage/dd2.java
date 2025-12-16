package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dd2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public final /* synthetic */ boolean Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd2(sd2 sd2Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dd2 dd2Var = (dd2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dd2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dd2 dd2Var = new dd2(this.X, this.Y, continuation);
        dd2Var.o = obj;
        return dd2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        sd2 sd2Var = this.X;
        pb2 pb2VarP = sd2Var.p();
        qqg qqgVar = qqg.a;
        if (pb2VarP == null) {
            return qqgVar;
        }
        rf2 rf2Var = pb2VarP.b;
        if (rf2Var.a == 0) {
            wqi.q(f84Var.getClass().getName(), "Try update revokePrivateLink with charServerId == 0", new Object[0]);
            ((j94) sd2Var.r.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update revokePrivateLink with charServerId == 0. ChatChangeLink"));
            return qqgVar;
        }
        long jG = ((hwa) sd2Var.q.getValue()).g(pb2VarP.a, rf2Var.a, 0, null, true, null);
        if (this.Y) {
            sd2Var.y.set(jG);
            return qqgVar;
        }
        sd2Var.z.set(jG);
        return qqgVar;
    }
}
