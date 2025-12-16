package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* loaded from: classes2.dex */
public final class e92 extends dtf implements sm6 {
    public final /* synthetic */ ChangeOwnerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e92(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.X = changeOwnerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e92 e92Var = (e92) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e92Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e92 e92Var = new e92(continuation, this.X);
        e92Var.o = obj;
        return e92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sd9 sd9Var = (sd9) this.o;
        boolean z = sd9Var instanceof od9;
        ChangeOwnerScreen changeOwnerScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = ChangeOwnerScreen.t0;
            k92 k92Var = (k92) changeOwnerScreen.X.getValue();
            long j = ((od9) sd9Var).a;
            boolean zZ0 = changeOwnerScreen.z0();
            ku3 ku3Var = (ku3) ((l24) k92Var.o.getValue()).c(j).a.getValue();
            String strE = ku3Var != null ? ku3Var.e() : null;
            if (strE == null) {
                strE = "";
            }
            pb2 pb2Var = (pb2) ((w63) k92Var.d.getValue()).j(k92Var.b).a.getValue();
            if (pb2Var != null) {
                xfh.r(k92Var.Y, new i92(new n5g(zZ0 ? x8b.h0 : x8b.n0), pb2Var.M() ? new p5g(x8b.j0, ys.D(new Object[]{strE, pb2Var.s()})) : new p5g(x8b.l0, ys.D(new Object[]{pb2Var.s(), strE})), j));
            }
        } else if (sd9Var instanceof rd9) {
            ccb ccbVar = new ccb(changeOwnerScreen);
            ccbVar.h(z7.e(changeOwnerScreen.getContext(), mvd.H1));
            ccbVar.i();
        }
        return qqg.a;
    }
}
