package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class nmc extends ClickableSpan {
    public final String a;
    public int b;
    public boolean c = true;
    public f88 d;

    public nmc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        f88 f88Var = this.d;
        if (f88Var != null) {
            h88 h88Var = f88Var.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            n7 n7Var = h88.d;
            if (jCurrentTimeMillis - n7Var.a > 300) {
                n7Var.a = jCurrentTimeMillis;
                e88 e88Var = h88Var.a;
                if (e88Var != null) {
                    e88Var.b(this.a, i88.o, null);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.c);
    }
}
