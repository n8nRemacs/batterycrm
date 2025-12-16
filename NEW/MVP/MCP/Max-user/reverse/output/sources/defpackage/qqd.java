package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qqd extends Drawable implements Animatable {
    public RadialGradient Y;
    public RadialGradient Z;
    public final ValueAnimator s0;
    public final m8f t0;
    public float a = (vw4.d().getDisplayMetrics().density * 16.0f) / 2.0f;
    public float b = (vw4.d().getDisplayMetrics().density * 16.0f) / 2.0f;
    public float c = 0.7f;
    public long d = m26.a(-1.0f, -1.0f);
    public final Paint o = new Paint(1);
    public final Paint X = new Paint(1);

    public qqd() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new q00(22, this));
        this.s0 = valueAnimatorOfFloat;
        r26 r26Var = new r26();
        r26Var.a = 0.0f;
        m8f m8fVar = new m8f(r26Var);
        n8f n8fVar = new n8f();
        n8fVar.b(6.54f);
        n8fVar.a(0.7f);
        n8fVar.i = 1.0f;
        m8fVar.m = n8fVar;
        r75 r75Var = new r75() { // from class: pqd
            @Override // defpackage.r75
            public final void g(float f) {
                this.a.invalidateSelf();
            }
        };
        if (m8fVar.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = m8fVar.l;
        if (!arrayList.contains(r75Var)) {
            arrayList.add(r75Var);
        }
        this.t0 = m8fVar;
    }

    public final void a() {
        if (Float.intBitsToFloat((int) (this.d >> 32)) == -1.0f || Float.intBitsToFloat((int) (this.d & 4294967295L)) == -1.0f) {
            return;
        }
        long j = this.d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = this.a;
        int[] iArr = {Color.parseColor("#330F8EC2"), Color.parseColor("#800F8EC2")};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.Y = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, f, iArr, (float[]) null, tileMode);
        this.Z = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, this.b, new int[]{Color.parseColor("#330F8EC2"), Color.parseColor("#800F8EC2")}, (float[]) null, tileMode);
        this.o.setShader(this.Y);
        this.X.setShader(this.Z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (Float.intBitsToFloat((int) (this.d >> 32)) == -1.0f || Float.intBitsToFloat((int) (this.d & 4294967295L)) == -1.0f) {
            return;
        }
        long j = this.d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = 255;
        int i = (int) (this.c * f);
        Paint paint = this.o;
        paint.setAlpha(i);
        int i2 = (int) (f * this.c * 0.5f);
        Paint paint2 = this.X;
        paint2.setAlpha(i2);
        canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, this.b, paint2);
        canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, this.a, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.s0.isRunning() || this.t0.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.s0.start();
        m8f m8fVar = this.t0;
        m8fVar.b = 0.0f;
        m8fVar.c = true;
        m8fVar.g();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.s0.end();
        m8f m8fVar = this.t0;
        if (m8fVar.m.b > 0.0d) {
            m8fVar.f();
        } else {
            m8fVar.b();
        }
    }
}
