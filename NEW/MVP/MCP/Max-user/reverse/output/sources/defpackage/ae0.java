package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ae0 extends Drawable {
    public static final int[] e = {-2096531, -2007990, -164330, -616921, -2019997, -2206338, -2011174, -4377970, -13333023, -6993695, -13219103, -10719519, -16733746, -11226714, -13526051, -13462339};
    public final TextPaint a;
    public final zd0 b;
    public final CharSequence c;
    public final int d;

    public ae0(zd0 zd0Var, ku3 ku3Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = zd0Var;
        this.c = ku3Var.o();
        int i = e[(int) ((Math.abs(ku3Var.p()) >> 8) % 16)];
        this.d = i;
        textPaint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayoutBuild;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float fMin = Math.min(iWidth, iHeight) / 2.5f;
        float f = iWidth / 2.0f;
        canvas.drawCircle(f, f, f, this.a);
        CharSequence charSequence = this.c;
        if (TextUtils.isEmpty(charSequence)) {
            canvas2 = canvas;
        } else {
            zd0 zd0Var = this.b;
            TextPaint textPaint = zd0Var.a;
            TextPaint textPaint2 = zd0Var.a;
            textPaint.setTextSize(fMin);
            if (charSequence instanceof Spannable) {
                int iHashCode = charSequence.hashCode() + (iWidth * 31);
                kr8 kr8Var = zd0Var.b;
                Integer numValueOf = Integer.valueOf(iHashCode);
                Object obj = kr8Var.get(numValueOf);
                if (obj == null) {
                    try {
                        staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint2, iWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    } catch (Throwable unused) {
                        String string = charSequence.toString();
                        staticLayoutBuild = StaticLayout.Builder.obtain(string, 0, string.length(), textPaint2, iWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    }
                    obj = staticLayoutBuild;
                    kr8Var.put(numValueOf, obj);
                }
                canvas.translate(r8.getWidth() / 2.0f, (iHeight / 2.0f) - (r8.getHeight() / 2.0f));
                ((StaticLayout) obj).draw(canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawText(charSequence, 0, charSequence.length(), f, (iHeight / 2.0f) - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            }
        }
        canvas2.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return new ae0(this.b, this.c, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ae0(zd0 zd0Var, CharSequence charSequence, int i) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = zd0Var;
        this.c = charSequence;
        this.d = i;
        textPaint.setColor(i);
    }
}
