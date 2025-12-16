package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes2.dex */
public final class yzg extends ImageSpan implements u6g {
    public final Resources X;
    public xzg Y;
    public final Context a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final wzg o;

    public yzg(Context context, int i, boolean z, wzg wzgVar) {
        super(context, i == 1 ? yud.b2 : yud.c2);
        this.a = context;
        this.b = i;
        this.c = true;
        this.d = z;
        this.o = wzgVar;
        this.X = Resources.getSystem();
        this.Y = new xzg(context, i, wzgVar);
        onThemeChanged(a93.s0.x(context).k());
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iSave = canvas.save();
        try {
            int i6 = paint.getFontMetricsInt().descent;
            float f2 = 2;
            canvas.translate(f, ((i4 + i6) - ((i6 - r3.ascent) / f2)) - ((this.Y.getBounds().bottom - this.Y.getBounds().top) / f2));
            this.Y.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.Y;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iR = kpi.r(paint.getTextSize() / this.X.getDisplayMetrics().density);
        int iG = xrf.g(iR);
        if (iR != this.b) {
            this.Y = new xzg(this.a, iR, this.o);
        }
        int iD = kti.d(xrf.d(iR) * vw4.d().getDisplayMetrics().density);
        int i3 = this.c ? iD : 0;
        if (!this.d) {
            iD = 0;
        }
        float f = iG;
        this.Y.setBounds(i3, 0, u45.c(f, vw4.d().getDisplayMetrics().density, i3), kti.d(vw4.d().getDisplayMetrics().density * f));
        return utb.j(f, vw4.d().getDisplayMetrics().density, i3, iD);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.Y.onThemeChanged(yebVar);
    }
}
