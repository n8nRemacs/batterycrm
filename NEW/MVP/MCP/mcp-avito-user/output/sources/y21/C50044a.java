package y21;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.math.b;

/* compiled from: ScaleDrawable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ly21/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: y21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C50044a extends Drawable implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f442866b;

    /* renamed from: c, reason: collision with root package name */
    public final float f442867c;

    /* renamed from: d, reason: collision with root package name */
    public final float f442868d;

    public C50044a(@k Drawable drawable, float f12) {
        this.f442866b = drawable;
        this.f442867c = f12;
        this.f442868d = f12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.scale(this.f442867c, this.f442868d);
            this.f442866b.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f442866b.getIntrinsicHeight() == -1) {
            return -1;
        }
        return b.b(r0.getIntrinsicHeight() * this.f442868d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f442866b.getIntrinsicWidth() == -1) {
            return -1;
        }
        return b.b(r0.getIntrinsicWidth() * this.f442867c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f442866b.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f442866b;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f442866b.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
        this.f442866b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f442866b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f442866b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }
}
