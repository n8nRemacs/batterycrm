package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class oef extends FrameLayout {
    public final h08 a;
    public mgf b;
    public fff c;

    public oef(Context context) {
        super(context, null);
        h08 h08Var = new h08(context);
        this.a = h08Var;
        setClipToPadding(false);
        addView((OneMeDraweeView) h08Var.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(fff fffVar) {
        fff fffVar2 = this.c;
        boolean z = true;
        if (fffVar2 != null && fffVar2.Y == fffVar.Y && fffVar2.Z == fffVar.Z) {
            z = false;
        }
        this.c = fffVar;
        mgf mgfVar = this.b;
        if (mgfVar != null) {
            mgfVar.b(fffVar);
        }
        String str = fffVar.d;
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.a.b;
        rf7 rf7VarB = rf7.b(str);
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.i(rf7VarB, null);
        oneMeDraweeView.setVisibility(0);
        if (z) {
            requestLayout();
        }
    }

    public final mgf getSizeConfigurator() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        mgf mgfVar = this.b;
        kt ktVarA = mgfVar != null ? mgfVar.a(i, i2) : null;
        if (ktVarA != null) {
            i = ktVarA.b;
        }
        if (ktVarA != null) {
            i2 = ktVarA.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(mgf mgfVar) {
        this.b = mgfVar;
    }
}
