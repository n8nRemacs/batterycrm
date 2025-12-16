package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public final class g12 extends View {
    public static final float A0;
    public static final float B0;
    public static final /* synthetic */ yy7[] v0;
    public static final float w0;
    public static final float x0;
    public static final float y0;
    public static final float z0;
    public final nk a;
    public final ArgbEvaluator b;
    public final FloatEvaluator c;
    public ValueAnimator d;
    public final Paint o;
    public final Paint s0;
    public float t0;
    public float u0;

    static {
        z8a z8aVar = new z8a(g12.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;");
        vid.a.getClass();
        v0 = new yy7[]{z8aVar};
        float f = vw4.d().getDisplayMetrics().density * 4.0f;
        w0 = f;
        x0 = f / 2;
        y0 = vw4.d().getDisplayMetrics().density * 4.0f;
        z0 = vw4.d().getDisplayMetrics().density * 8.0f;
        A0 = vw4.d().getDisplayMetrics().density * 4.0f;
        B0 = vw4.d().getDisplayMetrics().density * 14.0f;
    }

    public g12(Context context) {
        super(context, null);
        this.a = new nk(this);
        this.b = new ArgbEvaluator();
        this.c = new FloatEvaluator();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(w0);
        this.o = paint;
        Paint paint2 = new Paint();
        a93.s0.y(this).i();
        paint2.setColor(1308622847);
        this.s0 = paint2;
        this.t0 = y0;
    }

    public final f12 getType() {
        yy7 yy7Var = v0[0];
        return (f12) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width - x0, this.o);
        float f = w0 + this.t0;
        float fFloatValue = this.c.evaluate(this.u0, (Number) Float.valueOf(1.0f), (Number) Float.valueOf(0.5f)).floatValue() * ((getWidth() - f) / 2);
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, fFloatValue, fFloatValue, this.s0);
        super.onDraw(canvas);
    }

    public final void setType(f12 f12Var) {
        this.a.O(this, v0[0], f12Var);
    }
}
