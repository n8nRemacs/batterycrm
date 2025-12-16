package Q81;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.remote.model.Color;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MetroLinesDrawable.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ81/g;", "Landroid/graphics/drawable/Drawable;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Color> f13556a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f13557b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f13558c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Rect f13559d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13560e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13561f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13562g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13563h;

    public /* synthetic */ g(Context context, List list, int i12, float f12, int i13, int i14, C42822w c42822w) {
        this(context, list, (i14 & 4) != 0 ? 3 : i12, (i14 & 8) != 0 ? 3.5f : f12, (i14 & 16) != 0 ? 1 : i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.f13563h);
        int i12 = 0;
        for (Object obj : this.f13556a) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Paint paint = this.f13557b;
            paint.setColor(((Color) obj).getValue());
            float fJ2 = (C42745f0.J(r0) - i12) * this.f13562g;
            float f12 = this.f13560e;
            float f13 = fJ2 + f12;
            float f14 = this.f13561f;
            canvas.drawCircle(f13, f14, f12, paint);
            canvas.drawCircle(f13, f14, f14, this.f13558c);
            i12 = i13;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @k
    public final Rect getDirtyBounds() {
        return this.f13559d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13559d.bottom;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13559d.right;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f13557b.setAlpha(i12);
    }

    public g(@k Context context, @k List<Color> list, int i12, float f12, int i13) {
        this.f13556a = C42745f0.q0(list);
        Paint paint = new Paint();
        this.f13557b = paint;
        Paint paint2 = new Paint();
        this.f13558c = paint2;
        Rect rect = new Rect();
        this.f13559d = rect;
        Resources resources = context.getResources();
        float f13 = i12 * resources.getDisplayMetrics().density;
        this.f13560e = f13;
        float f14 = f12 * resources.getDisplayMetrics().density;
        this.f13561f = f14;
        float f15 = 5 * resources.getDisplayMetrics().density;
        this.f13562g = f15;
        float f16 = 1 * resources.getDisplayMetrics().density;
        this.f13563h = i13 * resources.getDisplayMetrics().density;
        int iD2 = C35835l0.d(R.attr.white, context);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f16);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setColor(iD2);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        float f17 = 2;
        rect.bottom = kotlin.math.b.b(f14 * f17);
        rect.right = kotlin.math.b.b(((list.size() - 1) * f15) + (f13 * f17));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
