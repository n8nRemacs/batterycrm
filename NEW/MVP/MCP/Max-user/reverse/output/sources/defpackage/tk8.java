package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class tk8 extends d2f {
    public final /* synthetic */ int E0;
    public final int F0;
    public fff G0;

    public tk8(Context context, cff cffVar, int i) {
        this.E0 = i;
        switch (i) {
            case 1:
                oef oefVar = new oef(context);
                super(oefVar);
                this.F0 = 81;
                int iD = kti.d(81 * vw4.d().getDisplayMetrics().density);
                oefVar.setLayoutParams(new ViewGroup.LayoutParams(iD, iD));
                f8j.d(oefVar, 300L, new wfe(this, 11, cffVar));
                oefVar.setOnLongClickListener(new d72(this, 7, cffVar));
                break;
            case 2:
                e1i e1iVar = new e1i(context);
                super(e1iVar);
                int iMin = Math.min(350, kti.d(81 * vw4.d().getDisplayMetrics().density));
                this.F0 = iMin;
                e1iVar.setLayoutParams(new ViewGroup.LayoutParams(iMin, iMin));
                f8j.d(e1iVar, 300L, new wfe(this, 23, cffVar));
                e1iVar.setOnLongClickListener(new d72(this, 9, cffVar));
                break;
            default:
                sk8 sk8Var = new sk8(context);
                super(sk8Var);
                int iMin2 = Math.min(350, kti.d(81 * vw4.d().getDisplayMetrics().density));
                this.F0 = iMin2;
                sk8Var.setLayoutParams(new ViewGroup.LayoutParams(iMin2, iMin2));
                f8j.d(sk8Var, 300L, new kg6(this, 8, cffVar));
                sk8Var.setOnLongClickListener(new d72(this, 3, cffVar));
                break;
        }
    }

    @Override // defpackage.d2f
    public final void A(t98 t98Var, Object obj) {
        switch (this.E0) {
            case 0:
                if (!(obj instanceof eff)) {
                    z(t98Var);
                    break;
                } else {
                    ((sk8) this.a).setAlpha(((eff) obj).a ? 0.3f : 1.0f);
                    break;
                }
            case 1:
                if (!(obj instanceof eff)) {
                    z(t98Var);
                    break;
                } else {
                    ((oef) this.a).setAlpha(((eff) obj).a ? 0.3f : 1.0f);
                    break;
                }
            default:
                if (!(obj instanceof eff)) {
                    z(t98Var);
                    break;
                } else {
                    ((e1i) this.a).setAlpha(((eff) obj).a ? 0.3f : 1.0f);
                    break;
                }
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                if (t98Var instanceof fff) {
                    fff fffVar = (fff) t98Var;
                    this.G0 = fffVar;
                    View view = this.a;
                    ((sk8) view).a(fffVar, this.F0);
                    ((sk8) view).setAlpha(fffVar.t0 ? 0.3f : 1.0f);
                    break;
                }
                break;
            case 1:
                if (t98Var instanceof fff) {
                    fff fffVar2 = (fff) t98Var;
                    this.G0 = fffVar2;
                    int i = this.F0;
                    View view2 = this.a;
                    if (i == 0) {
                        ((oef) view2).setSizeConfigurator(new mgf(view2));
                    }
                    ((oef) view2).a(fffVar2);
                    ((oef) view2).setAlpha(fffVar2.t0 ? 0.3f : 1.0f);
                    break;
                }
                break;
            default:
                if (t98Var instanceof fff) {
                    fff fffVar3 = (fff) t98Var;
                    this.G0 = fffVar3;
                    View view3 = this.a;
                    ((e1i) view3).a(fffVar3, this.F0);
                    ((e1i) view3).setAlpha(fffVar3.t0 ? 0.3f : 1.0f);
                    break;
                }
                break;
        }
    }
}
