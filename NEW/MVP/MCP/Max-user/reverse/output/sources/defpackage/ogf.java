package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class ogf extends d2f {
    public final ShapeDrawable E0;
    public LayerDrawable F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public f62 K0;

    public ogf(Context context, ShapeDrawable shapeDrawable, wu7 wu7Var) {
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        oneMeDraweeView.setPadding(iD, iD, iD, iD);
        oneMeDraweeView.setLayoutParams(layoutParams);
        ((gr6) oneMeDraweeView.getHierarchy()).h(tyd.d);
        super(oneMeDraweeView);
        this.E0 = shapeDrawable;
        this.G0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.H0 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        this.I0 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        this.J0 = kti.d(14 * vw4.d().getDisplayMetrics().density);
        tqi.c(new kga(this, context, (Continuation) null), oneMeDraweeView);
        f8j.d(oneMeDraweeView, 300L, new wfe(this, 13, wu7Var));
    }

    public final void F(int i) {
        View view = this.a;
        if (i != 5) {
            ((gr6) ((OneMeDraweeView) view).getHierarchy()).k(null);
            return;
        }
        if (this.F0 == null) {
            this.F0 = H();
        }
        ((gr6) ((OneMeDraweeView) view).getHierarchy()).k(this.F0);
    }

    public final void G(boolean z) {
        v1a v1aVar = a93.s0;
        View view = this.a;
        if (z) {
            ((OneMeDraweeView) view).setBackground(this.E0);
        } else {
            ((OneMeDraweeView) view).setBackground(null);
        }
        f62 f62Var = this.K0;
        if ((f62Var != null ? f62Var.d : null) != null) {
            ((OneMeDraweeView) view).setImageTintList(ColorStateList.valueOf(z ? v1aVar.y(view).getIcon().f : v1aVar.y(view).getIcon().j));
        } else {
            ((OneMeDraweeView) view).setImageTintList(null);
        }
    }

    public final LayerDrawable H() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        v1a v1aVar = a93.s0;
        View view = this.a;
        cei.k(shapeDrawable, v1aVar.y(view).b().a.h);
        Drawable drawableB = r34.b(((OneMeDraweeView) view).getContext(), v5b.a);
        cei.k(drawableB, v1aVar.y(view).getIcon().i);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
        int i = this.H0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.G0;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.J0;
        layerDrawable.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.I0;
        layerDrawable.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        f62 f62Var = (f62) t98Var;
        this.K0 = f62Var;
        dgf dgfVar = f62Var.b;
        String str = dgfVar.c;
        Integer num = f62Var.d;
        View view = this.a;
        if (str != null && str.length() != 0) {
            ((OneMeDraweeView) view).setImageURI(str);
        } else if (num != null) {
            ((OneMeDraweeView) view).setImageResource(num.intValue());
        }
        G(dgfVar.Y);
        F(dgfVar.X);
    }
}
