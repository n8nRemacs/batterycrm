package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class fj9 extends ClickableSpan {
    public final cj9 a;
    public int b;
    public g88 c;

    public fj9(cj9 cj9Var, int i) {
        this.a = cj9Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        g88 g88Var = this.c;
        if (g88Var != null) {
            h88 h88Var = g88Var.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            n7 n7Var = h88.d;
            if (jCurrentTimeMillis - n7Var.a > 300) {
                n7Var.a = jCurrentTimeMillis;
                e88 e88Var = h88Var.a;
                if (e88Var == null) {
                    e88Var = view instanceof e88 ? (e88) view : null;
                }
                if (e88Var != null) {
                    e88Var.a(this.a);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
