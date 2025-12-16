package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class e7 extends gg9 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ h7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(h7 h7Var, Context context, vf9 vf9Var, View view) {
        super(context, vf9Var, view, true, fvc.actionOverflowMenuStyle, 0);
        this.m = h7Var;
        this.f = 8388613;
        r5j r5jVar = h7Var.G0;
        this.h = r5jVar;
        eg9 eg9Var = this.i;
        if (eg9Var != null) {
            eg9Var.e(r5jVar);
        }
    }

    @Override // defpackage.gg9
    public final void c() {
        switch (this.l) {
            case 0:
                h7 h7Var = this.m;
                h7Var.D0 = null;
                h7Var.getClass();
                super.c();
                break;
            default:
                h7 h7Var2 = this.m;
                vf9 vf9Var = h7Var2.c;
                if (vf9Var != null) {
                    vf9Var.c(true);
                }
                h7Var2.C0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(h7 h7Var, Context context, qnf qnfVar, View view) {
        super(context, qnfVar, view, false, fvc.actionOverflowMenuStyle, 0);
        this.m = h7Var;
        if ((qnfVar.K0.H0 & 32) != 32) {
            View view2 = h7Var.s0;
            this.e = view2 == null ? (View) h7Var.Z : view2;
        }
        r5j r5jVar = h7Var.G0;
        this.h = r5jVar;
        eg9 eg9Var = this.i;
        if (eg9Var != null) {
            eg9Var.e(r5jVar);
        }
    }
}
