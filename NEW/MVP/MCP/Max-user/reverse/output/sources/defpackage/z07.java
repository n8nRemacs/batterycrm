package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class z07 extends ClickableSpan {
    public final String a;
    public c88 b;
    public int c;

    public z07(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        c88 c88Var = this.b;
        if (c88Var != null) {
            h88 h88Var = c88Var.a;
            Object obj = c88Var.b;
            h88Var.b(view, this.a, i88.b, (ClickableSpan) obj);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.c);
        textPaint.setUnderlineText(true);
    }
}
