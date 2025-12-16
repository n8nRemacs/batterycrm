package defpackage;

import android.animation.AnimatorSet;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class sfd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfd(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sfd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sfd sfdVar = new sfd(continuation, this.Y);
        sfdVar.X = obj;
        return sfdVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        while (d7j.f(f84Var)) {
            yy7[] yy7VarArr = RecordControlsWidget.g1;
            RecordControlsWidget recordControlsWidget = this.Y;
            int iA = recordControlsWidget.S0().C().a();
            recordControlsWidget.C0().clearAnimation();
            float f = ((iA * 1.45f) / 32768) + 1;
            float f2 = f > 1.45f ? 1.45f : f;
            o98 o98VarM = cqi.m(recordControlsWidget.C0(), recordControlsWidget.U0, f2, 100L, 0L);
            AnimatorSet animatorSet = new AnimatorSet();
            recordControlsWidget.b1 = animatorSet;
            animatorSet.setInterpolator((yq5) recordControlsWidget.M0.getValue());
            AnimatorSet animatorSet2 = recordControlsWidget.b1;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(o98VarM);
            }
            AnimatorSet animatorSet3 = recordControlsWidget.b1;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            recordControlsWidget.U0 = f2;
            this.X = f84Var;
            this.o = 1;
            Object objC = s8j.c(100L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        }
        return qqg.a;
    }
}
