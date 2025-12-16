package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class fc5 extends d2f {
    public final ShapeDrawable E0;
    public final OneMeDraweeView F0;
    public final vnd G0;
    public final int H0;
    public e62 I0;

    public fc5(Context context, ShapeDrawable shapeDrawable, wu7 wu7Var) {
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        frameLayout.setPadding(iD, iD, iD, iD);
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        ((gr6) oneMeDraweeView.getHierarchy()).h(tyd.d);
        frameLayout.addView(oneMeDraweeView);
        super(frameLayout);
        this.E0 = shapeDrawable;
        View childAt = frameLayout.getChildAt(0);
        this.F0 = childAt instanceof OneMeDraweeView ? (OneMeDraweeView) childAt : null;
        this.G0 = e8j.b(new ns2(context, 4));
        this.H0 = kti.d(24 * vw4.d().getDisplayMetrics().density);
        tqi.c(new ld0(this, context, (Continuation) null, 13), frameLayout);
        f8j.d(frameLayout, 300L, new ub(this, 28, wu7Var));
    }

    public final void F(boolean z) {
        v1a v1aVar = a93.s0;
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.E0 : null);
        OneMeDraweeView oneMeDraweeView = this.F0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? v1aVar.y(view).getIcon().f : v1aVar.y(view).getIcon().j));
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        e62 e62Var = (e62) t98Var;
        String str = e62Var.X;
        this.I0 = e62Var;
        int i = e62Var.Z;
        String str2 = e62Var.o;
        vnd vndVar = this.G0;
        OneMeDraweeView oneMeDraweeView = this.F0;
        if (str2 != null) {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                rf7 rf7VarB = rf7.b(str2);
                int i2 = OneMeDraweeView.B0;
                oneMeDraweeView.i(rf7VarB, null);
            }
            if (str != null) {
                ok8 ok8Var = (ok8) vndVar.getValue();
                dqi.a((ViewGroup) this.a, ok8Var, -1);
                ok8Var.setVisibility(0);
                int i3 = this.H0;
                boolean zA = ok8Var.a(i3, i3, str);
                if (oneMeDraweeView != null) {
                    oneMeDraweeView.setVisibility(zA ? 0 : 8);
                }
                ok8Var.setOnFirstFrameListener(new wo4(8, this));
            } else if (vndVar.e()) {
                ok8 ok8Var2 = (ok8) vndVar.getValue();
                ok8Var2.f();
                ok8Var2.setVisibility(8);
            }
        } else {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setImageResource(i);
            }
            if (vndVar.e()) {
                ok8 ok8Var3 = (ok8) vndVar.getValue();
                ok8Var3.f();
                ok8Var3.setVisibility(8);
            }
        }
        F(e62Var.c);
    }
}
