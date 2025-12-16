package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes2.dex */
public final class owe extends LayerDrawable implements Animatable, u6g {
    public final boolean X;
    public final int a;
    public final nwe b;
    public final int c;
    public int d;
    public int o;

    public owe(Context context) {
        super(new Drawable[0]);
        nwe nweVar = new nwe(context);
        this.b = nweVar;
        this.d = kti.d(80 * vw4.d().getDisplayMetrics().density);
        this.o = -1;
        this.X = c9j.b(context).compareTo(nv4.AVERAGE) >= 0;
        Drawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int iAddLayer = addLayer(colorDrawable);
        this.a = iAddLayer;
        setLayerGravity(iAddLayer, 119);
        int iAddLayer2 = addLayer(nweVar);
        this.c = iAddLayer2;
        nweVar.setCallback(this);
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(a93.s0.x(context).k());
    }

    public final void a(int i) {
        this.o = i;
        if (getBounds().isEmpty()) {
            return;
        }
        b(i, getBounds());
    }

    public final void b(int i, Rect rect) {
        Drawable drawable = getDrawable(this.c);
        int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) / 2;
        setLayerInset(this.c, 0, i - intrinsicHeight, 0, rect.height() - (i + intrinsicHeight));
    }

    public final boolean c(Drawable drawable) {
        if (drawable == this) {
            return true;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getDrawable(i) == drawable) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.X && this.b.isRunning();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMin = Math.min(rect.width() - (this.d * 2), rect.height() - (this.d * 2));
        setLayerSize(this.c, iMin, iMin);
        int i = this.o;
        if (i > 0) {
            b(i, rect);
        }
        this.b.setBounds(new Rect(0, 0, iMin, iMin));
        super.onBoundsChange(rect);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.onThemeChanged(yebVar);
        ((ColorDrawable) getDrawable(this.a)).setColor(yebVar.b().l);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.X) {
            this.b.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.X) {
            this.b.stop();
        }
    }
}
