package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class lc0 extends Drawable implements u6g {
    public static final c9a A0;
    public static final Object B0;
    public static Paint C0;
    public static final lcj x0;
    public static final /* synthetic */ yy7[] y0;
    public static final int[][] z0;
    public final Drawable X;
    public int Y;
    public LinearGradient Z;
    public final Context a;
    public final nxa b;
    public final int[] c;
    public final Rect d;
    public final char[] o;
    public int s0;
    public ColorFilter t0;
    public float u0;
    public int v0;
    public final kc0 w0;

    static {
        z8a z8aVar = new z8a(lc0.class, "isGradientEnabled", "isGradientEnabled$common_release()Z");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
        x0 = new lcj(13);
        z0 = jfi.a;
        A0 = new c9a();
        B0 = ipi.b(3, new l(12));
    }

    public lc0(Context context, nxa nxaVar, mc0 mc0Var, yeb yebVar) {
        j7f j7fVar;
        Spanned spanned;
        this.a = context;
        this.b = nxaVar;
        long j = mc0Var.a;
        this.c = z0[(int) Math.abs(j % r0.length)];
        this.d = new Rect();
        CharSequence charSequence = mc0Var.b;
        char[] cArr = {0, 0};
        Drawable drawableB = null;
        if (charSequence.length() != 0) {
            Character chZ = vmf.z(0, charSequence);
            Character chValueOf = chZ != null ? Character.valueOf(Character.toUpperCase(chZ.charValue())) : null;
            Character chZ2 = vmf.z(1, charSequence);
            char upperCase = chZ2 != null ? Character.toUpperCase(chZ2.charValue()) : (char) 0;
            if (chValueOf != null) {
                cArr[0] = chValueOf.charValue();
                cArr[1] = upperCase;
            }
        }
        this.o = cArr;
        this.Y = 255;
        this.s0 = yebVar.b().m;
        this.v0 = -1;
        this.w0 = new kc0(this, yebVar);
        int length = charSequence.length();
        try {
            spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, j7f.class) : null;
        j7f[] j7fVarArr = (j7f[]) spans;
        if (j7fVarArr != null && (j7fVar = (j7f) ys.w(j7fVarArr)) != null) {
            drawableB = j7fVar.b();
        }
        this.X = drawableB;
    }

    public final Paint a() {
        x0.getClass();
        if (C0 == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setSubpixelText(true);
            paint.setLinearText(true);
            paint.setTypeface(vog.a(this.a, Typeface.SANS_SERIF, 600));
            C0 = paint;
        }
        Paint paint2 = C0;
        if (paint2 == null) {
            return null;
        }
        return paint2;
    }

    public final void b() {
        LinearGradient linearGradient;
        if (getBounds().isEmpty()) {
            return;
        }
        yy7 yy7Var = y0[0];
        if (((Boolean) this.w0.b).booleanValue()) {
            linearGradient = new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.c, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        this.Z = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        lcj lcjVar = x0;
        int color = lcj.f(lcjVar).getColor();
        int alpha = lcj.f(lcjVar).getAlpha();
        ColorFilter colorFilter = lcj.f(lcjVar).getColorFilter();
        Shader shader = lcj.f(lcjVar).getShader();
        try {
            lcj.f(lcjVar).setColor(this.s0);
            lcj.f(lcjVar).setAlpha(this.Y);
            lcj.f(lcjVar).setColorFilter(this.t0);
            lcj.f(lcjVar).setShader(this.Z);
            nxa nxaVar = this.b;
            if (nxaVar instanceof kxa) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, lcj.f(lcjVar));
            } else if (nxaVar instanceof mxa) {
                Path path = (Path) A0.f(getBounds());
                if (path != null) {
                    canvas.drawPath(path, lcj.f(lcjVar));
                }
            } else {
                if (!fni.a(nxaVar, lxa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                canvas.drawPaint(lcj.f(lcjVar));
            }
            lcj.f(lcjVar).setColor(color);
            lcj.f(lcjVar).setAlpha(alpha);
            lcj.f(lcjVar).setColorFilter(colorFilter);
            lcj.f(lcjVar).setShader(shader);
            Drawable drawable = this.X;
            if (drawable != null) {
                float fExactCenterX = getBounds().exactCenterX() - (drawable.getBounds().width() / 2);
                float fExactCenterY = getBounds().exactCenterY() - (drawable.getBounds().height() / 2);
                int iSave = canvas.save();
                canvas.translate(fExactCenterX, fExactCenterY);
                try {
                    drawable.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            float fExactCenterX2 = getBounds().exactCenterX();
            Rect rect = this.d;
            float fExactCenterX3 = fExactCenterX2 - rect.exactCenterX();
            float fExactCenterY2 = getBounds().exactCenterY() - rect.exactCenterY();
            int color2 = a().getColor();
            try {
                a().setColor(this.v0);
                Paint paintA = a();
                float f = this.u0;
                float textSize = paintA.getTextSize();
                try {
                    paintA.setTextSize(f);
                    char[] cArr = this.o;
                    canvas.drawText(cArr, 0, cArr.length, fExactCenterX3, fExactCenterY2, a());
                    paintA.setTextSize(textSize);
                    a().setColor(color2);
                } catch (Throwable th) {
                    paintA.setTextSize(textSize);
                    throw th;
                }
            } catch (Throwable th2) {
                a().setColor(color2);
                throw th2;
            }
        } catch (Throwable th3) {
            lcj.f(lcjVar).setColor(color);
            lcj.f(lcjVar).setAlpha(alpha);
            lcj.f(lcjVar).setColorFilter(colorFilter);
            lcj.f(lcjVar).setShader(shader);
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof mxa) {
            c9a c9aVar = A0;
            Object objF = c9aVar.f(rect);
            if (objF == null) {
                objF = new Path();
                c9aVar.m(rect, objF);
            }
            hte.a((Path) objF, rect);
        }
        this.u0 = rect.height() * 0.33f;
        Paint paintA = a();
        float f = this.u0;
        float textSize = paintA.getTextSize();
        try {
            paintA.setTextSize(f);
            Paint paintA2 = a();
            char[] cArr = this.o;
            paintA2.getTextBounds(cArr, 0, cArr.length, this.d);
            Drawable drawable = this.X;
            if (drawable != null) {
                int i = a().getFontMetricsInt().descent - a().getFontMetricsInt().ascent;
                drawable.setBounds(0, 0, i, i);
            }
            paintA.setTextSize(textSize);
            b();
            invalidateSelf();
        } catch (Throwable th) {
            paintA.setTextSize(textSize);
            throw th;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yy7 yy7Var = y0[0];
        if (((Boolean) this.w0.b).booleanValue()) {
            return;
        }
        this.v0 = yebVar.getText().e;
        this.s0 = yebVar.b().m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.Y = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.t0 = colorFilter;
        invalidateSelf();
    }
}
