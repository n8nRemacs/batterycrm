package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes10.dex */
public class d extends Drawable implements Animatable {

    /* renamed from: h, reason: collision with root package name */
    public static final LinearInterpolator f54602h = new LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.b f54603i = new androidx.interpolator.view.animation.b();

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f54604j = {-16777216};

    /* renamed from: b, reason: collision with root package name */
    public final b f54605b;

    /* renamed from: c, reason: collision with root package name */
    public float f54606c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f54607d;

    /* renamed from: e, reason: collision with root package name */
    public final ValueAnimator f54608e;

    /* renamed from: f, reason: collision with root package name */
    public float f54609f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54610g;

    /* compiled from: CircularProgressDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    /* compiled from: CircularProgressDrawable.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f54611a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final Paint f54612b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f54613c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f54614d;

        /* renamed from: e, reason: collision with root package name */
        public float f54615e;

        /* renamed from: f, reason: collision with root package name */
        public float f54616f;

        /* renamed from: g, reason: collision with root package name */
        public float f54617g;

        /* renamed from: h, reason: collision with root package name */
        public float f54618h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f54619i;

        /* renamed from: j, reason: collision with root package name */
        public int f54620j;

        /* renamed from: k, reason: collision with root package name */
        public float f54621k;

        /* renamed from: l, reason: collision with root package name */
        public float f54622l;

        /* renamed from: m, reason: collision with root package name */
        public float f54623m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f54624n;

        /* renamed from: o, reason: collision with root package name */
        public Path f54625o;

        /* renamed from: p, reason: collision with root package name */
        public float f54626p;

        /* renamed from: q, reason: collision with root package name */
        public float f54627q;

        /* renamed from: r, reason: collision with root package name */
        public int f54628r;

        /* renamed from: s, reason: collision with root package name */
        public int f54629s;

        /* renamed from: t, reason: collision with root package name */
        public int f54630t;

        /* renamed from: u, reason: collision with root package name */
        public int f54631u;

        public b() {
            Paint paint = new Paint();
            this.f54612b = paint;
            Paint paint2 = new Paint();
            this.f54613c = paint2;
            Paint paint3 = new Paint();
            this.f54614d = paint3;
            this.f54615e = 0.0f;
            this.f54616f = 0.0f;
            this.f54617g = 0.0f;
            this.f54618h = 5.0f;
            this.f54626p = 1.0f;
            this.f54630t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i12) {
            this.f54620j = i12;
            this.f54631u = this.f54619i[i12];
        }
    }

    public d(@N Context context) {
        context.getClass();
        this.f54607d = context.getResources();
        b bVar = new b();
        this.f54605b = bVar;
        bVar.f54619i = f54604j;
        bVar.a(0);
        f(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new androidx.swiperefreshlayout.widget.b(this, bVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f54602h);
        valueAnimatorOfFloat.addListener(new c(this, bVar));
        this.f54608e = valueAnimatorOfFloat;
    }

    public static void h(float f12, b bVar) {
        if (f12 <= 0.75f) {
            bVar.f54631u = bVar.f54619i[bVar.f54620j];
            return;
        }
        float f13 = (f12 - 0.75f) / 0.25f;
        int[] iArr = bVar.f54619i;
        int i12 = bVar.f54620j;
        int i13 = iArr[i12];
        int i14 = iArr[(i12 + 1) % iArr.length];
        bVar.f54631u = ((((i13 >> 24) & 255) + ((int) ((((i14 >> 24) & 255) - r1) * f13))) << 24) | ((((i13 >> 16) & 255) + ((int) ((((i14 >> 16) & 255) - r3) * f13))) << 16) | ((((i13 >> 8) & 255) + ((int) ((((i14 >> 8) & 255) - r4) * f13))) << 8) | ((i13 & 255) + ((int) (f13 * ((i14 & 255) - r2))));
    }

    public final void a(float f12, b bVar, boolean z12) {
        float interpolation;
        float interpolation2;
        if (this.f54610g) {
            h(f12, bVar);
            float fFloor = (float) (Math.floor(bVar.f54623m / 0.8f) + 1.0d);
            float f13 = bVar.f54621k;
            float f14 = bVar.f54622l;
            bVar.f54615e = (((f14 - 0.01f) - f13) * f12) + f13;
            bVar.f54616f = f14;
            float f15 = bVar.f54623m;
            bVar.f54617g = r.c(fFloor, f15, f12, f15);
            return;
        }
        if (f12 != 1.0f || z12) {
            float f16 = bVar.f54623m;
            androidx.interpolator.view.animation.b bVar2 = f54603i;
            if (f12 < 0.5f) {
                interpolation = bVar.f54621k;
                interpolation2 = (bVar2.getInterpolation(f12 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f17 = bVar.f54621k + 0.79f;
                interpolation = f17 - (((1.0f - bVar2.getInterpolation((f12 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f17;
            }
            float f18 = (0.20999998f * f12) + f16;
            float f19 = (f12 + this.f54609f) * 216.0f;
            bVar.f54615e = interpolation;
            bVar.f54616f = interpolation2;
            bVar.f54617g = f18;
            this.f54606c = f19;
        }
    }

    public final void b(float f12) {
        this.f54605b.f54627q = f12;
        invalidateSelf();
    }

    public final void c(float f12) {
        this.f54605b.f54617g = f12;
        invalidateSelf();
    }

    public final void d(float f12, float f13, float f14, float f15) {
        float f16 = this.f54607d.getDisplayMetrics().density;
        float f17 = f13 * f16;
        b bVar = this.f54605b;
        bVar.f54618h = f17;
        bVar.f54612b.setStrokeWidth(f17);
        bVar.f54627q = f12 * f16;
        bVar.a(0);
        bVar.f54628r = (int) (f14 * f16);
        bVar.f54629s = (int) (f15 * f16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f54606c, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f54605b;
        RectF rectF = bVar.f54611a;
        float f12 = bVar.f54627q;
        float fMin = (bVar.f54618h / 2.0f) + f12;
        if (f12 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bVar.f54628r * bVar.f54626p) / 2.0f, bVar.f54618h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f13 = bVar.f54615e;
        float f14 = bVar.f54617g;
        float f15 = (f13 + f14) * 360.0f;
        float f16 = ((bVar.f54616f + f14) * 360.0f) - f15;
        Paint paint = bVar.f54612b;
        paint.setColor(bVar.f54631u);
        paint.setAlpha(bVar.f54630t);
        float f17 = bVar.f54618h / 2.0f;
        rectF.inset(f17, f17);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bVar.f54614d);
        float f18 = -f17;
        rectF.inset(f18, f18);
        canvas.drawArc(rectF, f15, f16, false, paint);
        if (bVar.f54624n) {
            Path path = bVar.f54625o;
            if (path == null) {
                Path path2 = new Path();
                bVar.f54625o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f19 = (bVar.f54628r * bVar.f54626p) / 2.0f;
            bVar.f54625o.moveTo(0.0f, 0.0f);
            bVar.f54625o.lineTo(bVar.f54628r * bVar.f54626p, 0.0f);
            Path path3 = bVar.f54625o;
            float f22 = bVar.f54628r;
            float f23 = bVar.f54626p;
            path3.lineTo((f22 * f23) / 2.0f, bVar.f54629s * f23);
            bVar.f54625o.offset((rectF.centerX() + fMin2) - f19, (bVar.f54618h / 2.0f) + rectF.centerY());
            bVar.f54625o.close();
            Paint paint2 = bVar.f54613c;
            paint2.setColor(bVar.f54631u);
            paint2.setAlpha(bVar.f54630t);
            canvas.save();
            canvas.rotate(f15 + f16, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bVar.f54625o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void e(float f12) {
        b bVar = this.f54605b;
        bVar.f54615e = 0.0f;
        bVar.f54616f = f12;
        invalidateSelf();
    }

    public final void f(float f12) {
        b bVar = this.f54605b;
        bVar.f54618h = f12;
        bVar.f54612b.setStrokeWidth(f12);
        invalidateSelf();
    }

    public final void g(int i12) {
        if (i12 == 0) {
            d(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            d(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f54605b.f54630t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f54608e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f54605b.f54630t = i12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54605b.f54612b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f54608e.cancel();
        b bVar = this.f54605b;
        float f12 = bVar.f54615e;
        bVar.f54621k = f12;
        float f13 = bVar.f54616f;
        bVar.f54622l = f13;
        bVar.f54623m = bVar.f54617g;
        if (f13 != f12) {
            this.f54610g = true;
            this.f54608e.setDuration(666L);
            this.f54608e.start();
            return;
        }
        bVar.a(0);
        bVar.f54621k = 0.0f;
        bVar.f54622l = 0.0f;
        bVar.f54623m = 0.0f;
        bVar.f54615e = 0.0f;
        bVar.f54616f = 0.0f;
        bVar.f54617g = 0.0f;
        this.f54608e.setDuration(1332L);
        this.f54608e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f54608e.cancel();
        this.f54606c = 0.0f;
        b bVar = this.f54605b;
        if (bVar.f54624n) {
            bVar.f54624n = false;
        }
        bVar.a(0);
        bVar.f54621k = 0.0f;
        bVar.f54622l = 0.0f;
        bVar.f54623m = 0.0f;
        bVar.f54615e = 0.0f;
        bVar.f54616f = 0.0f;
        bVar.f54617g = 0.0f;
        invalidateSelf();
    }
}
