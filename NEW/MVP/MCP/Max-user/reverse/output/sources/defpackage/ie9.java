package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class ie9 extends dtf implements sm6 {
    public final /* synthetic */ MembersListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie9(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.X = membersListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ie9 ie9Var = (ie9) l((kd9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ie9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ie9 ie9Var = new ie9(continuation, this.X);
        ie9Var.o = obj;
        return ie9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        kd9 kd9Var = (kd9) this.o;
        boolean z = kd9Var instanceof id9;
        MembersListWidget membersListWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = MembersListWidget.C0;
            ce9 ce9VarB0 = membersListWidget.B0();
            List list = ((id9) kd9Var).a;
            x9f x9fVar = ce9VarB0.u0;
            if (x9fVar == null || !x9fVar.isActive()) {
                ce9VarB0.u0 = xfh.o(ce9VarB0, ((q2b) ((lzf) ce9VarB0.Y.getValue())).a(), new ae9(ce9VarB0, list, null), 2);
            }
        } else {
            if (!(kd9Var instanceof jd9)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr2 = MembersListWidget.C0;
            ce9 ce9VarB02 = membersListWidget.B0();
            ed9 ed9Var = ce9VarB02.X;
            svi.e(ed9Var.b, null, null, new dd9(ed9Var, new wc9(ce9VarB02.b, ce9VarB02.c, ce9VarB02.t0), null), 3);
            ce9VarB02.t0 = rd5.a;
        }
        return qqg.a;
    }
}
