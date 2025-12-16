package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class sk8 extends FrameLayout {
    public final h08 a;
    public final ok8 b;
    public boolean c;
    public boolean d;
    public mgf o;

    public sk8(Context context) {
        super(context, null);
        h08 h08Var = new h08(context);
        this.a = h08Var;
        ok8 ok8Var = new ok8(context, null);
        ok8Var.setId(uab.b);
        ok8Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = ok8Var;
        addView((OneMeDraweeView) h08Var.b);
        addView(ok8Var);
    }

    public final void a(fff fffVar, int i) {
        mgf mgfVar = this.o;
        if (mgfVar != null) {
            mgfVar.b(fffVar);
        }
        String str = fffVar.o;
        h08 h08Var = this.a;
        ok8 ok8Var = this.b;
        if (str == null || str.length() == 0) {
            ok8Var.f();
            ok8Var.setVisibility(8);
            ((OneMeDraweeView) h08Var.b).setVisibility(0);
        } else {
            ok8Var.setAutoRepeat(true);
            ok8Var.setOnFirstFrameListener(new sl6(14, this));
            ok8Var.setFailureListener(new zb8(5));
            ok8Var.setVisibility(0);
            this.c = true;
            boolean zA = ok8Var.a(i, i, str);
            this.c = false;
            z = zA && !this.d;
            this.d = false;
        }
        if (z) {
            String str2 = fffVar.d;
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) h08Var.b;
            rf7 rf7VarB = rf7.b(str2);
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.i(rf7VarB, null);
            oneMeDraweeView.setVisibility(0);
        }
    }

    public final void b(qk8 qk8Var) {
        if (qk8Var.a == null) {
            qk8Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = qk8Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final mgf getSizeConfigurator() {
        return this.o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        mgf mgfVar = this.o;
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
        this.o = mgfVar;
    }
}
