package defpackage;

import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class j39 extends dtf implements sm6 {
    public final /* synthetic */ MediaPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j39(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.X = mediaPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j39 j39Var = (j39) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j39Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j39 j39Var = new j39(continuation, this.X);
        j39Var.o = obj;
        return j39Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        lp6 lp6Var = (lp6) this.o;
        if (lp6Var instanceof hp6) {
            yy7[] yy7VarArr = MediaPickerScreen.B0;
            r39 r39VarB0 = this.X.B0();
            vd8 vd8Var = ((hp6) lp6Var).c;
            if (r39VarB0.b.t0) {
                x9f x9fVar = r39VarB0.u0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    r39VarB0.u0 = xfh.o(r39VarB0, ((q2b) ((lzf) r39VarB0.o.getValue())).b(), new p39(r39VarB0, vd8Var, null), 2);
                }
            } else {
                xfh.r(r39VarB0.v0, new f39(vd8Var.b.toString()));
            }
        }
        return qqg.a;
    }
}
