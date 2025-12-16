package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;

/* loaded from: classes2.dex */
public final class re extends View {
    public long a;
    public final int[] b;
    public final float[] c;
    public final float d;
    public float o;
    public RadialGradient s0;
    public float t0;
    public float u0;
    public long v0;
    public final Paint w0;

    public re(Context context) {
        super(context, null);
        this.a = m26.a(0.0f, 0.0f);
        int i = (int) 4294897919L;
        this.b = new int[]{0, (int) 4291331839L, i, i, (int) 4290012671L, 0};
        this.c = new float[6];
        this.d = vw4.d().getDisplayMetrics().density * 6.51172f;
        this.o = 0.2f;
        this.v0 = m26.a(0.0f, 0.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(this.s0);
        paint.setMaskFilter(new BlurMaskFilter(60.0f, BlurMaskFilter.Blur.NORMAL));
        this.w0 = paint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        int i;
        Paint paint = this.w0;
        float[] fArr = this.c;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.a >> 32)) == 0.0f ? measuredWidth / 2.0f : Float.intBitsToFloat((int) (this.a >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.a & 4294967295L)) == 0.0f ? measuredHeight / 2.0f : Float.intBitsToFloat((int) (this.a & 4294967295L));
        float f2 = this.t0;
        float f3 = this.d;
        float f4 = (f2 * f3) + 60.0f;
        float f5 = -f4;
        float f6 = measuredWidth + f4;
        float f7 = measuredHeight + f4;
        int iSave = canvas.save();
        canvas.clipRect(f5, f5, f6, f7);
        try {
            float f8 = this.u0;
            float f9 = this.t0;
            float f10 = f8 * f9;
            float f11 = f10 - ((f9 * f3) * 0.7f);
            if (f10 > 0.0f && f11 > 0.0f) {
                if (this.s0 != null) {
                    f = f3;
                    if (Float.intBitsToFloat((int) (this.v0 >> 32)) == f11 && Float.intBitsToFloat((int) (this.v0 & 4294967295L)) == f10) {
                        i = 0;
                    }
                    this.v0 = m26.a(f11, f10);
                    paint.setShader(this.s0);
                    paint.setAlpha(n7j.c((int) (this.o * 255), i, 255));
                    canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, f10, paint);
                    canvas.restoreToCount(iSave);
                }
                f = f3;
                float fB = n7j.b(f * this.t0 * 0.25f, 0.0f, 100.0f);
                float f12 = f11 - fB;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                float f13 = f10 - fB;
                fArr[0] = 0.0f;
                fArr[1] = n7j.b(f12 / f10, 0.0f, 1.0f);
                fArr[2] = n7j.b(f11 / f10, 0.0f, 1.0f);
                fArr[3] = n7j.b((0.9f * f13) / f10, 0.0f, 1.0f);
                fArr[4] = n7j.b(f13 / f10, 0.0f, 1.0f);
                fArr[5] = 1.0f;
                i = 0;
                this.s0 = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, f10, this.b, this.c, Shader.TileMode.CLAMP);
                this.v0 = m26.a(f11, f10);
                paint.setShader(this.s0);
                paint.setAlpha(n7j.c((int) (this.o * 255), i, 255));
                canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, f10, paint);
                canvas.restoreToCount(iSave);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void setBaseRadius(float f) {
        this.u0 = (f - this.d) / 2.0f;
    }
}
