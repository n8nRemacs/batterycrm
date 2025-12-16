package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class pk extends FitFontImageSpan implements j7f, me {
    public final long a;
    public final ok b;
    public final String c;

    public pk(long j, ok okVar) {
        super(okVar, a16.a, true, false, 8, null);
        this.a = j;
        this.b = okVar;
        this.c = pk.class.getName();
    }

    @Override // defpackage.j7f
    public final Drawable b() {
        return this.b;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Number numberValueOf;
        ok okVar = this.b;
        int iSave = canvas.save();
        try {
            canvas.translate(f, i3);
            canvas.clipRect(getFontRect());
            if (okVar.getBounds().height() > 0) {
                numberValueOf = Integer.valueOf(okVar.getBounds().height());
            } else if (okVar.getIntrinsicHeight() > 0) {
                numberValueOf = Integer.valueOf(okVar.getIntrinsicHeight());
            } else {
                wqi.q(this.c, "AnimojiStateSpan.draw bad drawable height", new Object[0]);
                numberValueOf = Float.valueOf(getFontRect().height());
            }
            float fHeight = getFontRect().height() / numberValueOf.floatValue();
            if (fHeight - 1.0f > 0.001f && getNeedCustomScale()) {
                canvas.scale(fHeight, fHeight);
            }
            okVar.d(canvas, okVar.e().getBounds().height(), paint);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        return this.a == pkVar.a && fni.a(this.b, pkVar.b);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        ok okVar = this.b;
        if (size <= 0) {
            wqi.c(pk.class.getName(), "Empty size when try get size from span", new Object[0]);
            size = okVar.getBounds().right;
        }
        nk nkVar = okVar.Z;
        yy7 yy7Var = ok.C0[0];
        if (kk.$EnumSwitchMapping$0[((jk) nkVar.b).ordinal()] != 1 || (okVar.c instanceof wi)) {
            return size;
        }
        return 0;
    }

    @Override // one.me.sdk.uikit.common.span.FitFontImageSpan
    public final int hashCode() {
        return (Long.hashCode(this.a) * 31) + (this.b.hashCode() * 31) + pk.class.hashCode();
    }
}
