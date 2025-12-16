package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* loaded from: classes.dex */
public final class ag9 extends m7 implements ActionProvider.VisibilityListener {
    public usd c;
    public final ActionProvider d;

    public ag9(dg9 dg9Var, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = actionProvider;
    }

    @Override // defpackage.m7
    public final boolean a() {
        return this.d.hasSubMenu();
    }

    @Override // defpackage.m7
    public final boolean b() {
        return this.d.isVisible();
    }

    @Override // defpackage.m7
    public final View c() {
        return this.d.onCreateActionView();
    }

    @Override // defpackage.m7
    public final View d(zf9 zf9Var) {
        return this.d.onCreateActionView(zf9Var);
    }

    @Override // defpackage.m7
    public final boolean e() {
        return this.d.onPerformDefaultAction();
    }

    @Override // defpackage.m7
    public final void f(qnf qnfVar) {
        this.d.onPrepareSubMenu(qnfVar);
    }

    @Override // defpackage.m7
    public final boolean g() {
        return this.d.overridesItemVisibility();
    }

    @Override // defpackage.m7
    public final void h(usd usdVar) {
        this.c = usdVar;
        this.d.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        usd usdVar = this.c;
        if (usdVar != null) {
            vf9 vf9Var = ((zf9) usdVar.b).x0;
            vf9Var.Z = true;
            vf9Var.p(true);
        }
    }
}
