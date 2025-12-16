package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C22767g;
import j.F;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.r;
import rY0.C47618a;

/* compiled from: BorderDrawable.java */
@RestrictTo
/* loaded from: classes6.dex */
class d extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Paint f356608b;

    /* renamed from: h, reason: collision with root package name */
    @r
    public float f356614h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC42156l
    public int f356615i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC42156l
    public int f356616j;

    /* renamed from: k, reason: collision with root package name */
    @InterfaceC42156l
    public int f356617k;

    /* renamed from: l, reason: collision with root package name */
    @InterfaceC42156l
    public int f356618l;

    /* renamed from: m, reason: collision with root package name */
    @InterfaceC42156l
    public int f356619m;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.material.shape.q f356621o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public ColorStateList f356622p;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.shape.r f356607a = com.google.android.material.shape.r.b();

    /* renamed from: c, reason: collision with root package name */
    public final Path f356609c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f356610d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f356611e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f356612f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final b f356613g = new b(null);

    /* renamed from: n, reason: collision with root package name */
    public boolean f356620n = true;

    /* compiled from: BorderDrawable.java */
    public class b extends Drawable.ConstantState {
        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            return d.this;
        }
    }

    public d(com.google.android.material.shape.q qVar) {
        this.f356621o = qVar;
        Paint paint = new Paint(1);
        this.f356608b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        boolean z12 = this.f356620n;
        Paint paint = this.f356608b;
        Rect rect = this.f356610d;
        if (z12) {
            copyBounds(rect);
            float fHeight = this.f356614h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C22767g.g(this.f356615i, this.f356619m), C22767g.g(this.f356616j, this.f356619m), C22767g.g(C22767g.i(this.f356616j, 0), this.f356619m), C22767g.g(C22767g.i(this.f356618l, 0), this.f356619m), C22767g.g(this.f356618l, this.f356619m), C22767g.g(this.f356617k, this.f356619m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f356620n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f356611e;
        rectF.set(rect);
        com.google.android.material.shape.e eVar = this.f356621o.f357085e;
        RectF rectF2 = this.f356612f;
        rectF2.set(getBounds());
        float fMin = Math.min(eVar.a(rectF2), rectF.width() / 2.0f);
        com.google.android.material.shape.q qVar = this.f356621o;
        rectF2.set(getBounds());
        if (qVar.e(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        return this.f356613g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f356614h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@N Outline outline) {
        com.google.android.material.shape.q qVar = this.f356621o;
        RectF rectF = this.f356612f;
        rectF.set(getBounds());
        if (qVar.e(rectF)) {
            com.google.android.material.shape.e eVar = this.f356621o.f357085e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), eVar.a(rectF));
            return;
        }
        Rect rect = this.f356610d;
        copyBounds(rect);
        RectF rectF2 = this.f356611e;
        rectF2.set(rect);
        com.google.android.material.shape.q qVar2 = this.f356621o;
        Path path = this.f356609c;
        this.f356607a.a(qVar2, 1.0f, rectF2, null, path);
        C47618a.d(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@N Rect rect) {
        com.google.android.material.shape.q qVar = this.f356621o;
        RectF rectF = this.f356612f;
        rectF.set(getBounds());
        if (!qVar.e(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f356614h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f356622p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f356620n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f356622p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f356619m)) != this.f356619m) {
            this.f356620n = true;
            this.f356619m = colorForState;
        }
        if (this.f356620n) {
            invalidateSelf();
        }
        return this.f356620n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@F int i12) {
        this.f356608b.setAlpha(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
        this.f356608b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
