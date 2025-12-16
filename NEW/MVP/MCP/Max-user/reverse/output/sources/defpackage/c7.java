package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public final class c7 extends ph6 {
    public final /* synthetic */ int t0 = 0;
    public final /* synthetic */ View u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.u0 = actionMenuItemView;
    }

    @Override // defpackage.ph6
    public final yye b() {
        e7 e7Var;
        switch (this.t0) {
            case 0:
                d7 d7Var = ((ActionMenuItemView) this.u0).z0;
                if (d7Var == null || (e7Var = ((f7) d7Var).a.D0) == null) {
                    return null;
                }
                return e7Var.a();
            default:
                e7 e7Var2 = ((g7) this.u0).d.C0;
                if (e7Var2 == null) {
                    return null;
                }
                return e7Var2.a();
        }
    }

    @Override // defpackage.ph6
    public final boolean c() {
        yye yyeVarB;
        switch (this.t0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.u0;
                uf9 uf9Var = actionMenuItemView.x0;
                return uf9Var != null && uf9Var.a(actionMenuItemView.u0) && (yyeVarB = b()) != null && yyeVarB.a();
            default:
                ((g7) this.u0).d.l();
                return true;
        }
    }

    @Override // defpackage.ph6
    public boolean d() {
        switch (this.t0) {
            case 1:
                h7 h7Var = ((g7) this.u0).d;
                if (h7Var.E0 != null) {
                    return false;
                }
                h7Var.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(g7 g7Var, g7 g7Var2) {
        super(g7Var2);
        this.u0 = g7Var;
    }
}
