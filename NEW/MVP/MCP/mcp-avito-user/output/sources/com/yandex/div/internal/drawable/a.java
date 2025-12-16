package com.yandex.div.internal.drawable;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: CircleDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/drawable/a;", "Landroid/graphics/drawable/Drawable;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C10926a f370094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f370095b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Paint f370096c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f370097d;

    public a(@k C10926a c10926a) {
        Paint paint;
        Float f12;
        this.f370094a = c10926a;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(c10926a.f370099b);
        this.f370095b = paint2;
        Integer num = c10926a.f370100c;
        if (num == null || (f12 = c10926a.f370101d) == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(num.intValue());
            paint.setStrokeWidth(f12.floatValue());
        }
        this.f370096c = paint;
        float f13 = c10926a.f370098a * 2;
        RectF rectF = new RectF(0.0f, 0.0f, f13, f13);
        this.f370097d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        Paint paint = this.f370095b;
        C10926a c10926a = this.f370094a;
        paint.setColor(c10926a.f370099b);
        RectF rectF = this.f370097d;
        rectF.set(getBounds());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), c10926a.f370098a, paint);
        Paint paint2 = this.f370096c;
        if (paint2 != null) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), c10926a.f370098a, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((int) this.f370094a.f370098a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((int) this.f370094a.f370098a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    /* compiled from: CircleDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/a$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.internal.drawable.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10926a {

        /* renamed from: a, reason: collision with root package name */
        public final float f370098a;

        /* renamed from: b, reason: collision with root package name */
        public final int f370099b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f370100c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Float f370101d;

        public C10926a(@U float f12, int i12, @l Integer num, @l Float f13) {
            this.f370098a = f12;
            this.f370099b = i12;
            this.f370100c = num;
            this.f370101d = f13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10926a)) {
                return false;
            }
            C10926a c10926a = (C10926a) obj;
            return Float.valueOf(this.f370098a).equals(Float.valueOf(c10926a.f370098a)) && this.f370099b == c10926a.f370099b && L.f(this.f370100c, c10926a.f370100c) && L.f(this.f370101d, c10926a.f370101d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f370099b, Float.hashCode(this.f370098a) * 31, 31);
            Integer num = this.f370100c;
            int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
            Float f12 = this.f370101d;
            return iHashCode + (f12 != null ? f12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(radius=");
            sb2.append(this.f370098a);
            sb2.append(", color=");
            sb2.append(this.f370099b);
            sb2.append(", strokeColor=");
            sb2.append(this.f370100c);
            sb2.append(", strokeWidth=");
            return h.d(sb2, this.f370101d, ')');
        }

        public /* synthetic */ C10926a(float f12, int i12, Integer num, Float f13, int i13, C42822w c42822w) {
            this(f12, i12, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : f13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
