package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public final class h7g extends View implements u6g {
    public static final /* synthetic */ yy7[] w0 = {new z8a(h7g.class, "themeName", "getThemeName()Ljava/lang/String;"), u45.h(vid.a, h7g.class, "patternDrawable", "getPatternDrawable()Landroid/graphics/drawable/Drawable;")};
    public final g7g a;
    public final GradientDrawable b;
    public final g7g c;
    public final Paint d;
    public final Paint o;
    public final RectF s0;
    public final RectF t0;
    public LinearGradient u0;
    public LinearGradient v0;

    public h7g(Context context) {
        super(context);
        this.a = new g7g(a93.s0.B(this).a, this, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 10.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        jg3 jg3Var = getTheme().a().G().b.a;
        gradientDrawable.setColors(new int[]{jg3Var.g, jg3Var.h});
        this.b = gradientDrawable;
        this.c = new g7g(gradientDrawable, this, 1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        paint.setColor(getTheme().i().b.b);
        this.d = paint;
        this.o = new Paint(1);
        this.s0 = new RectF();
        this.t0 = new RectF();
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(new f83(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yeb getTheme() {
        yeb yebVarA;
        v1a v1aVar = a93.s0;
        h5b h5bVarA = ((afb) v1aVar.x(getContext()).c).a(getThemeName());
        return (h5bVarA == null || (yebVarA = h5bVarA.a(v1aVar.x(getContext()).l())) == null) ? v1aVar.x(getContext()).k() : yebVarA;
    }

    public final void b() {
        float f = vw4.d().getDisplayMetrics().density * 8.0f;
        float f2 = vw4.d().getDisplayMetrics().density * 30.0f;
        float f3 = (vw4.d().getDisplayMetrics().density * 48.0f) + f;
        float f4 = (vw4.d().getDisplayMetrics().density * 24.0f) + f2;
        int[] incomingColors = getIncomingColors();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.u0 = new LinearGradient(f3, f2, f, f4, incomingColors, (float[]) null, tileMode);
        float f5 = vw4.d().getDisplayMetrics().density * 16.0f;
        this.v0 = new LinearGradient((vw4.d().getDisplayMetrics().density * 48.0f) + f5, (vw4.d().getDisplayMetrics().density * 4.0f) + f4, f5, getHeight() - (vw4.d().getDisplayMetrics().density * 30.0f), getOutgoingColors(), (float[]) null, tileMode);
    }

    public final int[] getIncomingColors() {
        return getTheme().a().i().a.o;
    }

    public final int[] getOutgoingColors() {
        return getTheme().a().r().a.o;
    }

    public final Drawable getPatternDrawable() {
        yy7 yy7Var = w0[1];
        return (Drawable) this.c.b;
    }

    public final String getThemeName() {
        yy7 yy7Var = w0[0];
        return (String) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = (isSelected() ? vw4.d().getDisplayMetrics().density * 4.0f : vw4.d().getDisplayMetrics().density * 1.0f) / 2;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (vw4.d().getDisplayMetrics().density * 10.0f) - f, (vw4.d().getDisplayMetrics().density * 10.0f) - f, this.d);
        float f2 = vw4.d().getDisplayMetrics().density * 8.0f;
        float f3 = vw4.d().getDisplayMetrics().density * 30.0f;
        float f4 = (vw4.d().getDisplayMetrics().density * 48.0f) + (vw4.d().getDisplayMetrics().density * 8.0f);
        float f5 = (vw4.d().getDisplayMetrics().density * 24.0f) + (vw4.d().getDisplayMetrics().density * 30.0f);
        RectF rectF = this.s0;
        rectF.set(f2, f3, f4, f5);
        LinearGradient linearGradient = this.u0;
        Paint paint = this.o;
        paint.setShader(linearGradient);
        canvas.drawRoundRect(rectF, vw4.d().getDisplayMetrics().density * 8.0f, vw4.d().getDisplayMetrics().density * 8.0f, paint);
        float f6 = vw4.d().getDisplayMetrics().density * 16.0f;
        float f7 = (vw4.d().getDisplayMetrics().density * 4.0f) + rectF.bottom;
        float f8 = (vw4.d().getDisplayMetrics().density * 48.0f) + (vw4.d().getDisplayMetrics().density * 16.0f);
        float height = getHeight() - (vw4.d().getDisplayMetrics().density * 30.0f);
        RectF rectF2 = this.t0;
        rectF2.set(f6, f7, f8, height);
        paint.setShader(this.v0);
        canvas.drawRoundRect(rectF2, vw4.d().getDisplayMetrics().density * 8.0f, vw4.d().getDisplayMetrics().density * 8.0f, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(kti.d(72 * vw4.d().getDisplayMetrics().density), kti.d(112 * vw4.d().getDisplayMetrics().density));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setColor(isSelected() ? getTheme().b().k : getTheme().i().b.b);
        jg3 jg3Var = getTheme().a().G().b.a;
        this.b.setColors(new int[]{jg3Var.g, jg3Var.h});
        b();
        invalidate();
    }

    public final void setBackgroundPattern(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setPatternDrawable(Drawable drawable) {
        this.c.O(this, w0[1], drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        Paint paint = this.d;
        if (z) {
            paint.setColor(getTheme().b().k);
            paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        } else {
            paint.setColor(getTheme().i().b.b);
            paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        }
        super.setSelected(z);
    }

    public final void setThemeName(String str) {
        this.a.O(this, w0[0], str);
    }
}
