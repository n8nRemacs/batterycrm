package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class o8b extends OneMeDraweeView implements u6g {
    public final ShapeDrawable C0;
    public final Drawable D0;
    public final Drawable E0;
    public final x93 F0;
    public final LayerDrawable G0;
    public final LayerDrawable H0;
    public boolean I0;

    public o8b(Context context) {
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.C0 = shapeDrawable;
        Drawable drawableMutate = r34.b(getContext(), yud.D1).mutate();
        this.D0 = drawableMutate;
        Drawable drawableMutate2 = r34.b(getContext(), yud.W1).mutate();
        this.E0 = drawableMutate2;
        x93 x93Var = new x93();
        this.F0 = x93Var;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
        float f = 40;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 16;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layerDrawable.setLayerSize(0, iD, iD);
        layerDrawable.setLayerSize(1, iD2, iD2);
        int i = (iD / 2) - (iD2 / 2);
        layerDrawable.setLayerInset(1, i, i, 0, 0);
        this.G0 = layerDrawable;
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate2, x93Var});
        int iD3 = kti.d(f * vw4.d().getDisplayMetrics().density);
        int iD4 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        layerDrawable2.setLayerSize(0, iD3, iD3);
        layerDrawable2.setLayerSize(1, iD4, iD4);
        float f3 = 36;
        layerDrawable2.setLayerSize(2, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        int i2 = (iD3 / 2) - (iD4 / 2);
        layerDrawable2.setLayerInset(1, i2, i2, 0, 0);
        float f4 = 2;
        layerDrawable2.setLayerInset(2, kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        this.H0 = layerDrawable2;
        ((gr6) getHierarchy()).m(vtd.a());
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        boolean z = this.I0;
        ShapeDrawable shapeDrawable = this.C0;
        if (z) {
            cei.k(shapeDrawable, yebVar.b().f);
        } else {
            cei.k(shapeDrawable, yebVar.getIcon().k);
        }
        cei.k(this.D0, -1);
        cei.k(this.E0, -1);
        this.F0.a.setColor(-1);
    }

    public final void setCover(Uri uri) {
        this.I0 = uri != null;
        yeb yebVarY = a93.s0.y(this);
        boolean z = this.I0;
        ShapeDrawable shapeDrawable = this.C0;
        if (z) {
            cei.k(shapeDrawable, yebVarY.b().f);
        } else {
            cei.k(shapeDrawable, yebVarY.getIcon().k);
        }
        i(rf7.a(uri), null);
    }

    public final void setPlaying(boolean z) {
        if (z) {
            ((gr6) getHierarchy()).k(this.H0);
        } else {
            ((gr6) getHierarchy()).k(this.G0);
        }
    }

    public final void setProgress(float f) {
        x93 x93Var = this.F0;
        x93Var.b = f * 3.6f;
        x93Var.invalidateSelf();
    }
}
