package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class bc extends qmc {
    public final /* synthetic */ int E0;
    public final Object F0;

    public bc(Context context, int i) {
        this.E0 = i;
        switch (i) {
            case 1:
                roe roeVar = new roe(context, 0);
                super(roeVar);
                toe toeVar = new toe(128, 0, new n5g(x8b.P), null, null, baj.a(yud.Z1), yne.a, null, null, 280);
                this.F0 = toeVar;
                roeVar.setModelItem(toeVar);
                break;
            case 2:
                super(new roe(context, 0));
                this.F0 = new toe(131072, 0, new n5g(x8b.O), null, null, new s18(ivd.a, 0, 2), null, null, null, 280);
                break;
            case 3:
                roe roeVar2 = new roe(context, 0);
                super(roeVar2);
                this.F0 = roeVar2;
                roeVar2.setMinHeight(kti.d(56 * vw4.d().getDisplayMetrics().density));
                break;
            default:
                roe roeVar3 = new roe(context, 0);
                super(roeVar3);
                toe toeVar2 = new toe(64, 0, new n5g(x8b.D), null, null, baj.a(yud.d), yne.a, null, null, 280);
                this.F0 = toeVar2;
                roeVar3.setModelItem(toeVar2);
                break;
        }
    }

    @Override // defpackage.qmc
    public final void H(View.OnClickListener onClickListener) {
        switch (this.E0) {
            case 0:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 1:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 2:
                f8j.d(this.a, 300L, onClickListener);
                break;
            default:
                f8j.d((roe) this.F0, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.qmc
    public void I(View.OnLongClickListener onLongClickListener) {
        switch (this.E0) {
            case 3:
                ((roe) this.F0).setOnLongClickListener(onLongClickListener);
                break;
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                ((roe) this.a).setModelItem(toe.l((toe) this.F0, null, new boe(new r5g(String.valueOf(((uic) t98Var).a)), null), 447));
                return;
            case 1:
                ((roe) this.a).setModelItem(toe.l((toe) this.F0, null, new boe(new r5g(v1a.v(((ijc) t98Var).a)), null), 447));
                return;
            case 2:
                ((roe) this.a).setModelItem((toe) this.F0);
                return;
            default:
                t98Var.getClass();
                throw new ClassCastException();
        }
    }
}
