package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class zd0 {
    public final TextPaint a;
    public final kr8 b;

    public zd0() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-1);
        this.b = new kr8(100, 0);
    }
}
