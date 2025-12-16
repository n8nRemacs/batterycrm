package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class yu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yu8 yu8Var = (yu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yu8 yu8Var = new yu8(continuation, this.X);
        yu8Var.o = obj;
        return yu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i;
        g8j.b(obj);
        db9 db9Var = (db9) this.o;
        boolean zA = fni.a(db9Var, ab9.a);
        MediaBarWidget mediaBarWidget = this.X;
        if (zA) {
            yy7[] yy7VarArr = MediaBarWidget.c1;
            mediaBarWidget.J0().j(true);
            xfh.r(mediaBarWidget.N0().x0, wt8.a);
        } else if (fni.a(db9Var, bb9.a)) {
            yy7[] yy7VarArr2 = MediaBarWidget.c1;
            mu8 mu8VarN0 = mediaBarWidget.N0();
            int iOrdinal = ((l00) mu8VarN0.s0.getValue()).ordinal();
            if (iOrdinal == 0) {
                mu8VarN0.s0.m(null, l00.b);
                dce dceVarU = mu8VarN0.u();
                int i2 = k00.$EnumSwitchMapping$0[1];
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = 3;
                }
                dceVarU.p(i);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                mu8VarN0.u0.g(et8.a);
            }
        } else {
            if (!(db9Var instanceof cb9)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr3 = MediaBarWidget.c1;
            mu8 mu8VarN02 = mediaBarWidget.N0();
            cb9 cb9Var = (cb9) db9Var;
            cf8 cf8Var = cb9Var.a;
            xfh.r(mu8VarN02.x0, new yt8(cb9Var.b, cb9Var.c, cf8Var));
        }
        return qqg.a;
    }
}
