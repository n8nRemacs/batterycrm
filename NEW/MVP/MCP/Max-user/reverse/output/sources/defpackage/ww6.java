package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ww6 extends Drawable implements ry2 {
    public static final /* synthetic */ yy7[] s0;
    public static final float t0;
    public final Paint X;
    public final RectF Y;
    public final float[] Z;
    public final Context a;
    public final float b;
    public final float c;
    public final nk d;
    public final Paint o;

    static {
        z8a z8aVar = new z8a(ww6.class, "gradientStrokeColors", "getGradientStrokeColors()[I");
        vid.a.getClass();
        s0 = new yy7[]{z8aVar};
        t0 = 1.0f;
    }

    public ww6(Context context) {
        float f = vw4.d().getDisplayMetrics().density;
        float f2 = t0;
        float f3 = vw4.d().getDisplayMetrics().density * 24.0f;
        this.a = context;
        this.b = f * f2;
        this.c = f3;
        v1a v1aVar = a93.s0;
        this.d = new nk(new int[]{v1aVar.x(context).k().a().G().b.d.g, v1aVar.x(context).k().a().G().b.d.h}, 10, this);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2 * vw4.d().getDisplayMetrics().density);
        this.X = paint2;
        this.Y = new RectF();
        this.Z = new float[]{0.0f, 0.6f, 1.0f};
    }

    @Override // defpackage.ry2
    public final void d(th3 th3Var) {
        RectF rectF = this.Y;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        int[] iArr = a93.s0.x(this.a).k().a().G().b.d.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.o.setShader(new LinearGradient(f, f2, f3, f4, iArr, this.Z, tileMode));
        float f5 = rectF.left;
        float f6 = rectF.top;
        float f7 = rectF.right;
        float f8 = rectF.bottom;
        yy7 yy7Var = s0[0];
        this.X.setShader(new LinearGradient(f5, f6, f7, f8, (int[]) this.d.b, (float[]) null, tileMode));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.o;
        RectF rectF = this.Y;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, this.X);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.Y;
        rectF.set(rect);
        float f = this.b / 2;
        rectF.inset(f, f);
        float f2 = rectF.top;
        float f3 = rectF.bottom;
        int[] iArr = a93.s0.x(this.a).k().a().G().b.d.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.o.setShader(new LinearGradient(0.0f, f2, 0.0f, f3, iArr, this.Z, tileMode));
        float f4 = rectF.top;
        float f5 = rectF.bottom;
        yy7 yy7Var = s0[0];
        this.X.setShader(new LinearGradient(0.0f, f4, 0.0f, f5, (int[]) this.d.b, (float[]) null, tileMode));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o.setAlpha(i);
        this.X.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        this.X.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
