package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class v0a extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, u6g {
    public static final int[] s0 = {-16724737, -16767233, -5963578};
    public static final int[] t0 = {-2500135, 14277081};
    public final Path X;
    public final Paint Y;
    public final Object Z;
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient d;
    public final int[] o;

    public v0a() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.o = s0;
        this.X = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.Y = paint2;
        this.Z = ipi.b(3, new fr7(18, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.d = linearGradient;
        this.a.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.X, this.Y);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((ValueAnimator) this.Z.getValue()).isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(fFloatValue, 0.0f);
        LinearGradient linearGradient = this.d;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.o);
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getBounds().height(), t0, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.Z.getValue()).setFloatValues(getBounds().width() * 2.0f, 0.0f);
        int iHeight = getBounds().height();
        Path path = this.X;
        path.reset();
        float fWidth = getBounds().width() / 2.0f;
        float f = vw4.d().getDisplayMetrics().density * 24.0f;
        float f2 = iHeight;
        path.addOval(0.0f - fWidth, (f2 - (vw4.d().getDisplayMetrics().density * 187.0f)) + f, getBounds().width() + fWidth, f2 + f, Path.Direction.CW);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        a(s0);
        this.Y.setColor(yebVar.b().l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.Y.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.Y.setColorFilter(colorFilter);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ?? r0 = this.Z;
        if (((ValueAnimator) r0.getValue()).isRunning()) {
            return;
        }
        ((ValueAnimator) r0.getValue()).start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((ValueAnimator) this.Z.getValue()).cancel();
    }
}
