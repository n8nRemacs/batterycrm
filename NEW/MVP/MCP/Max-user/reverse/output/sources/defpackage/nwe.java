package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nwe extends Drawable implements Animatable, u6g {
    public static final /* synthetic */ yy7[] A0 = {new z8a(nwe.class, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;"), u45.h(vid.a, nwe.class, "blurPadding", "getBlurPadding()I"), new z8a(nwe.class, "rotationValues", "getRotationValues()[F"), new z8a(nwe.class, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;"), new z8a(nwe.class, "rotationDuration", "getRotationDuration()J"), new z8a(nwe.class, "scaleValues", "getScaleValues()[F"), new z8a(nwe.class, "scaleDuration", "getScaleDuration()J"), new z8a(nwe.class, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;"), new z8a(nwe.class, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z")};
    public static final float[] B0 = {1.0f, 0.33f, 1.0f};
    public static final float[] C0 = {0.0f, 359.0f};
    public final ObjectAnimator X;
    public final Object Y;
    public final mwe Z;
    public final Context a;
    public final Object b = ipi.b(3, new prd(17, this));
    public final qoc c;
    public final qoc d;
    public final ObjectAnimator o;
    public final mwe s0;
    public final mwe t0;
    public final mwe u0;
    public final mwe v0;
    public final mwe w0;
    public final mwe x0;
    public final mwe y0;
    public final mwe z0;

    public nwe(Context context) {
        this.a = context;
        qoc qocVar = new qoc("scaleXY", 1.0f);
        this.c = qocVar;
        qoc qocVar2 = new qoc("rotation", 0.0f);
        this.d = qocVar2;
        float[] fArr = B0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, qocVar, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setDuration(8000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        final int i = 0;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jwe
            public final /* synthetic */ nwe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.o = objectAnimatorOfFloat;
        float[] fArr2 = C0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, qocVar2, Arrays.copyOf(fArr2, fArr2.length));
        objectAnimatorOfFloat2.setDuration(8000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        final int i2 = 1;
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jwe
            public final /* synthetic */ nwe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.X = objectAnimatorOfFloat2;
        this.Y = ipi.b(3, new nte(6));
        this.Z = new mwe(this, 0);
        this.s0 = new mwe(Integer.valueOf(kti.d(150 * vw4.d().getDisplayMetrics().density) * 2), this, 1);
        this.t0 = new mwe(fArr2, this, 2);
        this.u0 = new mwe(this, 3);
        this.v0 = new mwe(this, 4);
        this.w0 = new mwe(fArr, this, 5);
        this.x0 = new mwe(this, 6);
        this.y0 = new mwe(this, 7);
        this.z0 = new mwe(this, 8);
    }

    public final kwe a() {
        yy7 yy7Var = A0[0];
        return (kwe) this.Z.b;
    }

    public final Integer b() {
        yy7 yy7Var = A0[7];
        return (Integer) this.y0.b;
    }

    public final void c(kwe kweVar) {
        this.Z.O(this, A0[0], kweVar);
    }

    public final void d(boolean z) {
        this.z0.O(this, A0[8], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BitmapDrawable bitmapDrawableA = ((cw0) this.b.getValue()).a(a93.s0.x(this.a).k(), a(), b());
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        int iSave = canvas.save();
        try {
            mwe mweVar = this.s0;
            yy7 yy7Var = A0[1];
            float fIntValue = ((Number) mweVar.b).intValue();
            canvas.scale((getBounds().width() + fIntValue) / bitmapDrawableA.getBounds().width(), (getBounds().height() + fIntValue) / bitmapDrawableA.getBounds().width(), fCenterX, fCenterY);
            iSave = canvas.save();
            canvas.rotate(this.d.a, fCenterX, fCenterY);
            float f = this.c.a;
            canvas.scale(f, f, fCenterX, fCenterY);
            iSave = canvas.save();
            canvas.translate(fCenterX - bitmapDrawableA.getBounds().centerX(), fCenterY - bitmapDrawableA.getBounds().centerY());
            try {
                Bitmap bitmap = bitmapDrawableA.getBitmap();
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) this.Y.getValue());
                }
                canvas.restoreToCount(iSave);
                canvas.restoreToCount(iSave);
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    public final void e() {
        yy7 yy7Var = A0[8];
        if (((Boolean) this.z0.b).booleanValue()) {
            ObjectAnimator objectAnimator = this.o;
            if (objectAnimator.isRunning()) {
                return;
            }
            objectAnimator.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return ((Paint) this.Y.getValue()).getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.X.isRunning() || this.o.isRunning();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        ((cw0) this.b.getValue()).a(a93.s0.x(this.a).k(), a(), b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ((cw0) this.b.getValue()).a(yebVar, a(), b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.Y.getValue()).setAlpha(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.Y.getValue()).setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        wqi.c("ShineAnimatedDrawable", "start()", new Object[0]);
        e();
        this.X.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        wqi.c("ShineAnimatedDrawable", "stop()", new Object[0]);
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.X.cancel();
    }
}
