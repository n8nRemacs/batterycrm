package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import java.util.EnumMap;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class pw5 extends Drawable implements u6g {
    public final Object X;
    public final BoringLayout.Metrics Y;
    public BoringLayout Z;
    public final Context a;
    public final ow5 b;
    public gv5 c;
    public final RectF d;
    public final TextPaint o;
    public final float s0;
    public float t0;

    public /* synthetic */ pw5(Context context) {
        this(context, new ow5(context));
    }

    public final void a(gv5 gv5Var) {
        if (fni.a(this.c, gv5Var)) {
            return;
        }
        this.c = gv5Var;
        onThemeChanged(a93.s0.x(this.a).k());
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = vw4.d().getDisplayMetrics().density * 6.0f * this.t0;
        float f2 = vw4.d().getDisplayMetrics().density * 2.0f * this.t0;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(iSave);
            float f3 = vw4.d().getDisplayMetrics().density * 4.0f * this.t0;
            ?? r1 = this.X;
            Paint paint = (Paint) r1.getValue();
            RectF rectF = this.d;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            BoringLayout boringLayout = this.Z;
            if (boringLayout == null) {
                return;
            }
            float fI = utb.i(rectF.width(), boringLayout.getWidth(), 0.5f, rectF.left);
            float fI2 = utb.i(rectF.height(), boringLayout.getHeight(), 0.5f, rectF.top);
            iSave = canvas.save();
            canvas.translate(fI, fI2);
            try {
                boringLayout.getPaint().setAlpha(((Paint) r1.getValue()).getAlpha());
                boringLayout.draw(canvas);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        ow5 ow5Var = this.b;
        if (ow5Var.getCallback() != getCallback()) {
            ow5Var.setCallback(getCallback());
        }
        ow5Var.invalidateSelf();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        BoringLayout.Metrics metrics = this.Y;
        TextPaint textPaint = this.o;
        int iWidth = rect.width();
        if (iWidth == 0) {
            return;
        }
        float f = iWidth;
        this.t0 = f / kti.d(40 * vw4.d().getDisplayMetrics().density);
        gv5 gv5Var = this.c;
        if (gv5Var == null) {
            return;
        }
        this.b.setBounds(0, 0, kti.d(kti.d(28 * vw4.d().getDisplayMetrics().density) * this.t0), kti.d(kti.d(36 * vw4.d().getDisplayMetrics().density) * this.t0));
        float f2 = vw4.d().getDisplayMetrics().density * 4.0f * this.t0;
        float f3 = vw4.d().getDisplayMetrics().density * 18.0f * this.t0;
        float f4 = f - ((vw4.d().getDisplayMetrics().density * 4.0f) * this.t0);
        float f5 = f - ((vw4.d().getDisplayMetrics().density * 8.0f) * this.t0);
        RectF rectF = this.d;
        rectF.set(f2, f3, f4, f5);
        try {
            textPaint.setTextSize(this.s0 * vw4.d().getDisplayMetrics().density * this.t0);
            textPaint.getFontMetricsInt(metrics);
            this.Z = BoringLayout.make(gv5Var.a(), textPaint, kti.d(rectF.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, metrics, false);
        } catch (Throwable th) {
            this.Z = null;
            wqi.e(pw5.class.getName(), "fail to generate boring layout for " + gv5Var.a(), th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        gv5 gv5Var = this.c;
        if (gv5Var == null) {
            return;
        }
        int i = yebVar.a().G().b.b.d;
        int iG = yebVar.a().g(gv5Var.c().b);
        int iG2 = yebVar.a().g(gv5Var.c().c);
        ow5 ow5Var = this.b;
        VectorPath vectorPath = (VectorPath) ow5Var.a.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) ow5Var.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(iG);
        }
        VectorPath vectorPath3 = (VectorPath) ow5Var.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(iG2);
        }
        ((Paint) this.X.getValue()).setColor(yebVar.a().g(gv5Var.c().a));
        this.o.setColor(yebVar.a().g(gv5Var.c().o));
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        ((Paint) this.X.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public pw5(Context context, ow5 ow5Var) {
        this.a = context;
        this.b = ow5Var;
        this.d = new RectF();
        TextPaint textPaint = new TextPaint();
        this.o = textPaint;
        this.X = ipi.b(3, new nq5(5));
        this.Y = new BoringLayout.Metrics();
        this.s0 = 9.0f;
        long jA = sw4.a(1, 9.0f);
        long jA2 = sw4.a(1, 14.0f);
        long jA3 = sw4.a(0, 0.03f);
        String str = dpg.o.f;
        EnumMap enumMap = new EnumMap(t75.class);
        t75 t75Var = t75.b;
        xrf.s(jA, enumMap, t75Var, t75.class).put((EnumMap) t75Var, (t75) new sw4(jA2));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        textPaint.setTypeface(vog.a(context, Typeface.create(str, 0), 500));
        textPaint.setLetterSpacing(sw4.c(jA3, displayMetrics));
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        textPaint.setTextSize(sw4.c((sw4Var == null ? (sw4) ue3.F(enumMap.values()) : sw4Var).a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        this.t0 = 1.0f;
    }
}
