package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class hr0 extends ClickableSpan {
    public final String a;
    public final int b;
    public c88 c;

    public hr0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        c88 c88Var = this.c;
        if (c88Var != null) {
            h88 h88Var = c88Var.a;
            Object obj = c88Var.b;
            h88Var.b(view, this.a, i88.c, (ClickableSpan) obj);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
