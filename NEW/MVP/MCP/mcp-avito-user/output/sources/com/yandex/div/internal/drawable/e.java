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

/* compiled from: RoundedRectDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/drawable/e;", "Landroid/graphics/drawable/Drawable;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f370113a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f370114b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Paint f370115c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f370116d;

    public e(@k a aVar) {
        Paint paint;
        Float f12;
        this.f370113a = aVar;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(aVar.f370119c);
        this.f370114b = paint2;
        Integer num = aVar.f370121e;
        if (num == null || (f12 = aVar.f370122f) == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(num.intValue());
            paint.setStrokeWidth(f12.floatValue());
        }
        this.f370115c = paint;
        RectF rectF = new RectF(0.0f, 0.0f, aVar.f370117a, aVar.f370118b);
        this.f370116d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        Paint paint = this.f370114b;
        a aVar = this.f370113a;
        paint.setColor(aVar.f370119c);
        RectF rectF = this.f370116d;
        rectF.set(getBounds());
        float f12 = aVar.f370120d;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        Paint paint2 = this.f370115c;
        if (paint2 != null) {
            float f13 = aVar.f370120d;
            canvas.drawRoundRect(rectF, f13, f13, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f370113a.f370118b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f370113a.f370117a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    /* compiled from: RoundedRectDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/drawable/e$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f370117a;

        /* renamed from: b, reason: collision with root package name */
        public final float f370118b;

        /* renamed from: c, reason: collision with root package name */
        public final int f370119c;

        /* renamed from: d, reason: collision with root package name */
        public final float f370120d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f370121e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Float f370122f;

        public a(@U float f12, @U float f13, int i12, @U float f14, @l Integer num, @l Float f15) {
            this.f370117a = f12;
            this.f370118b = f13;
            this.f370119c = i12;
            this.f370120d = f14;
            this.f370121e = num;
            this.f370122f = f15;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.valueOf(this.f370117a).equals(Float.valueOf(aVar.f370117a)) && Float.valueOf(this.f370118b).equals(Float.valueOf(aVar.f370118b)) && this.f370119c == aVar.f370119c && Float.valueOf(this.f370120d).equals(Float.valueOf(aVar.f370120d)) && L.f(this.f370121e, aVar.f370121e) && L.f(this.f370122f, aVar.f370122f);
        }

        public final int hashCode() {
            int iD2 = r.d(this.f370120d, r.e(this.f370119c, r.d(this.f370118b, Float.hashCode(this.f370117a) * 31, 31), 31), 31);
            Integer num = this.f370121e;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            Float f12 = this.f370122f;
            return iHashCode + (f12 != null ? f12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(width=");
            sb2.append(this.f370117a);
            sb2.append(", height=");
            sb2.append(this.f370118b);
            sb2.append(", color=");
            sb2.append(this.f370119c);
            sb2.append(", radius=");
            sb2.append(this.f370120d);
            sb2.append(", strokeColor=");
            sb2.append(this.f370121e);
            sb2.append(", strokeWidth=");
            return h.d(sb2, this.f370122f, ')');
        }

        public /* synthetic */ a(float f12, float f13, int i12, float f14, Integer num, Float f15, int i13, C42822w c42822w) {
            this(f12, f13, i12, f14, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : f15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
