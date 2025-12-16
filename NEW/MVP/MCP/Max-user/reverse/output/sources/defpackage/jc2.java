package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class jc2 extends ml2 {
    public final /* synthetic */ int E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc2(View view, int i) {
        super(view);
        this.E0 = i;
    }

    @Override // defpackage.d2f
    public void E() {
        switch (this.E0) {
            case 0:
                pj2 pj2Var = (pj2) this.a;
                pj2Var.removeOnAttachStateChangeListener(pj2Var.I0);
                pj2Var.removeOnAttachStateChangeListener(pj2Var.J0);
                x9f x9fVar = pj2Var.K0;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                pj2Var.K0 = null;
                x9f x9fVar2 = pj2Var.L0;
                if (x9fVar2 != null) {
                    x9fVar2.cancel((CancellationException) null);
                }
                pj2Var.L0 = null;
                pj2Var.M0 = null;
                break;
            case 2:
                fn2 fn2Var = (fn2) this.a;
                fn2Var.removeOnAttachStateChangeListener(fn2Var.I0);
                x9f x9fVar3 = fn2Var.J0;
                if (x9fVar3 != null) {
                    x9fVar3.cancel((CancellationException) null);
                }
                fn2Var.J0 = null;
                fn2Var.K0 = null;
                break;
        }
    }

    @Override // defpackage.ml2
    public final void F(yb9 yb9Var, em6 em6Var, sm6 sm6Var) {
        switch (this.E0) {
            case 0:
                sb9 sb9Var = (sb9) yb9Var;
                pj2 pj2Var = (pj2) this.a;
                pj2Var.setId((int) sb9Var.a);
                pj2Var.setupAudio(sb9Var);
                super.F(sb9Var, em6Var, sm6Var);
                break;
            case 1:
                wb9 wb9Var = (wb9) yb9Var;
                rm2 rm2Var = (rm2) this.a;
                rm2Var.setId((int) wb9Var.a);
                rm2Var.setItem(wb9Var);
                super.F(wb9Var, em6Var, sm6Var);
                break;
            default:
                xb9 xb9Var = (xb9) yb9Var;
                fn2 fn2Var = (fn2) this.a;
                fn2Var.setId((int) xb9Var.a);
                fn2Var.setupVideo(xb9Var);
                super.F(xb9Var, em6Var, sm6Var);
                break;
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                sb9 sb9Var = (sb9) t98Var;
                pj2 pj2Var = (pj2) this.a;
                pj2Var.setId((int) sb9Var.a);
                pj2Var.setupAudio(sb9Var);
                break;
            case 1:
                wb9 wb9Var = (wb9) t98Var;
                rm2 rm2Var = (rm2) this.a;
                rm2Var.setId((int) wb9Var.a);
                rm2Var.setItem(wb9Var);
                break;
            default:
                xb9 xb9Var = (xb9) t98Var;
                fn2 fn2Var = (fn2) this.a;
                fn2Var.setId((int) xb9Var.a);
                fn2Var.setupVideo(xb9Var);
                break;
        }
    }
}
