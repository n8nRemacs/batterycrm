package L21;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: TextDrawable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL21/b;", "Landroid/graphics/drawable/Drawable;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.yandex.div.internal.widget.slider.b f9765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f9766b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RectF f9767c = new RectF();

    public b(@k com.yandex.div.internal.widget.slider.b bVar) {
        this.f9765a = bVar;
        this.f9766b = new a(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        RectF rectF = this.f9767c;
        rectF.set(getBounds());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        a aVar = this.f9766b;
        String str = aVar.f9762d;
        if (str == null) {
            return;
        }
        float f12 = fCenterX - aVar.f9763e;
        com.yandex.div.internal.widget.slider.b bVar = aVar.f9759a;
        canvas.drawText(str, f12 + bVar.f370340c, fCenterY + aVar.f9764f + bVar.f370341d, aVar.f9761c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        com.yandex.div.internal.widget.slider.b bVar = this.f9765a;
        return (int) (Math.abs(bVar.f370341d) + bVar.f370338a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (Math.abs(this.f9765a.f370340c) + this.f9767c.width());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
