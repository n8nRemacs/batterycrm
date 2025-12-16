package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes2.dex */
public final class w2c extends LayerDrawable implements u6g {
    public final Context a;
    public final int b;
    public final int c;

    public w2c(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int iAddLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = iAddLayer;
        int iAddLayer2 = addLayer(new RippleDrawable(ColorStateList.valueOf(-16777216), r34.b(context, yud.H0), null));
        this.c = iAddLayer2;
        float f = 44;
        setLayerSize(iAddLayer, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer, 17);
        float f2 = 24;
        setLayerSize(iAddLayer2, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(a93.s0.x(context).k());
    }

    public final void a() {
        int i = yud.w0;
        Context context = this.a;
        setDrawable(this.c, new RippleDrawable(ColorStateList.valueOf(-16777216), r34.b(context, i), null));
        onThemeChanged(a93.s0.x(context).k());
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot(rect.centerX(), rect.centerY());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        v1a v1aVar = a93.s0;
        Context context = this.a;
        v1aVar.x(context).k().a();
        paint.setColor(1543503872);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(v1aVar.x(context).k().c().a.a.d));
        Drawable drawable = rippleDrawable.getDrawable(0);
        v1aVar.x(context).k().getIcon();
        t35.g(drawable, -1);
    }
}
