package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class icg extends wq8 implements z3g {
    public CharSequence I0;
    public final Context J0;
    public final Paint.FontMetrics K0;
    public final a4g L0;
    public final es0 M0;
    public final Rect N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public float V0;
    public float W0;
    public float X0;
    public float Y0;

    public icg(Context context, int i) {
        super(context, null, 0, i);
        this.K0 = new Paint.FontMetrics();
        a4g a4gVar = new a4g(this);
        this.L0 = a4gVar;
        this.M0 = new es0(16, this);
        this.N0 = new Rect();
        this.V0 = 1.0f;
        this.W0 = 1.0f;
        this.X0 = 0.5f;
        this.Y0 = 1.0f;
        this.J0 = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = a4gVar.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fQ = q();
        float f = (float) (-((Math.sqrt(2.0d) * this.T0) - this.T0));
        canvas.scale(this.V0, this.W0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.X0) + getBounds().top);
        canvas.translate(fQ, f);
        super.draw(canvas);
        if (this.I0 == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            a4g a4gVar = this.L0;
            TextPaint textPaint = a4gVar.a;
            Paint.FontMetrics fontMetrics = this.K0;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (a4gVar.g != null) {
                textPaint.drawableState = getState();
                a4gVar.g.e(this.J0, a4gVar.a, a4gVar.b);
                textPaint.setAlpha((int) (this.Y0 * 255.0f));
            }
            CharSequence charSequence = this.I0;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.L0.a.getTextSize(), this.Q0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.O0 * 2;
        CharSequence charSequence = this.I0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.L0.a(charSequence.toString())), this.P0);
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.S0) {
            s5i s5iVarE = this.a.a.e();
            s5iVarE.k = r();
            setShapeAppearanceModel(s5iVarE.g());
        }
    }

    public final float q() {
        int i;
        Rect rect = this.N0;
        if (((rect.right - getBounds().right) - this.U0) - this.R0 < 0) {
            i = ((rect.right - getBounds().right) - this.U0) - this.R0;
        } else {
            if (((rect.left - getBounds().left) - this.U0) + this.R0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.U0) + this.R0;
        }
        return i;
    }

    public final cua r() {
        float f = -q();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.T0))) / 2.0f;
        return new cua(new lp8(this.T0), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
