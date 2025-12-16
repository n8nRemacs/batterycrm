package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class yf2 extends View implements u6g {
    public final int a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final Drawable o;
    public Object s0;

    public yf2(Context context) {
        super(context, null);
        this.a = kti.d(4 * vw4.d().getDisplayMetrics().density);
        float f = 12;
        this.b = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.c = kti.d(6 * vw4.d().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        wsf.j(this, textPaint, dpg.o);
        this.d = textPaint;
        Drawable drawableMutate = r34.b(getContext(), yud.i).mutate();
        drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        this.o = drawableMutate;
        this.s0 = hd5.a;
        onThemeChanged(a93.s0.y(this));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = this.a;
        int i3 = i + i2;
        int paddingTop = getPaddingTop() + i2;
        for (CharSequence charSequence : this.s0) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            float f = fontMetrics.ascent;
            float f2 = paddingTop - f;
            float f3 = ((f + fontMetrics.descent) / 2) + f2;
            int i4 = this.b;
            float f4 = i4 / 2;
            int i5 = (int) (f3 - f4);
            int i6 = (int) (f3 + f4);
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i4;
            Drawable drawable = this.o;
            drawable.setBounds(paddingLeft, i5, paddingLeft2, i6);
            drawable.draw(canvas);
            canvas.drawText(string, getPaddingLeft() + i4 + this.c, f2, textPaint);
            paddingTop += i3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Float fValueOf;
        String string;
        TextPaint textPaint = this.d;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (this.s0.size() * ((fontMetrics.descent - fontMetrics.ascent) + this.a)));
        ?? r2 = this.s0;
        ArrayList arrayList = new ArrayList(we3.q(r2, 10));
        for (CharSequence charSequence : r2) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(string)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        setMeasuredDimension(View.resolveSize((int) (getPaddingLeft() + this.b + this.c + (fValueOf != null ? fValueOf.floatValue() : 0.0f) + getPaddingRight()), i), View.resolveSize(paddingBottom, i2));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d.setColor(yebVar.getText().h);
        this.o.setTint(yebVar.a().G().a.b.b);
        invalidate();
    }
}
