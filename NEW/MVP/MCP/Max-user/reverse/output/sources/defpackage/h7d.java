package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final class h7d extends LayerDrawable implements Animatable {
    public final vf a;

    public h7d(Context context) {
        super(new Drawable[0]);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(a93.s0.z(context).c.b().a.n);
        int iAddLayer = addLayer(shapeDrawable);
        vf vfVarA = vf.a(context, kwc.ic_animated_handup);
        this.a = vfVarA;
        int iAddLayer2 = addLayer(vfVarA);
        float f = 48;
        setLayerSize(iAddLayer, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer, 17);
        float f2 = 28;
        setLayerSize(iAddLayer2, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer2, 17);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        vf vfVar = this.a;
        return vfVar != null && vfVar.isRunning();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot(rect.centerX(), rect.centerY());
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.stop();
        }
    }
}
