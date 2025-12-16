package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final class rjh {
    public final Context a;
    public final bwf b;
    public final bwf c;

    public rjh(Context context) {
        this.a = context;
        final int i = 0;
        this.b = new bwf(new cm6(this) { // from class: qjh
            public final /* synthetic */ rjh b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                rjh rjhVar = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = rjhVar.a;
                        Drawable drawableMutate = r34.b(context2, i0b.w).mutate();
                        drawableMutate.setTintList(ColorStateList.valueOf(a93.s0.z(context2).c.getIcon().e));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        float f = 8;
                        layerDrawable.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        Context context3 = rjhVar.a;
                        Drawable drawableMutate2 = r34.b(context3, i0b.c0).mutate();
                        drawableMutate2.setTintList(ColorStateList.valueOf(a93.s0.z(context3).c.getIcon().c));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        float f2 = 8;
                        layerDrawable2.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
        final int i2 = 1;
        this.c = new bwf(new cm6(this) { // from class: qjh
            public final /* synthetic */ rjh b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                rjh rjhVar = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = rjhVar.a;
                        Drawable drawableMutate = r34.b(context2, i0b.w).mutate();
                        drawableMutate.setTintList(ColorStateList.valueOf(a93.s0.z(context2).c.getIcon().e));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        float f = 8;
                        layerDrawable.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        Context context3 = rjhVar.a;
                        Drawable drawableMutate2 = r34.b(context3, i0b.c0).mutate();
                        drawableMutate2.setTintList(ColorStateList.valueOf(a93.s0.z(context3).c.getIcon().c));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        float f2 = 8;
                        layerDrawable2.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
    }
}
