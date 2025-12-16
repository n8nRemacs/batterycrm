package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class d88 extends URLSpan {
    public e88 a;
    public int b;
    public final boolean c;
    public final n7 d;

    public d88(String str, int i, boolean z) {
        super(str);
        this.a = null;
        this.b = i;
        this.c = z;
        this.d = new n7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        n7 n7Var = this.d;
        if (jCurrentTimeMillis - n7Var.a > 300) {
            n7Var.a = jCurrentTimeMillis;
            if (!(view instanceof TextView) || ((TextView) view).getLinksClickable()) {
                e88 e88Var = this.a;
                if (e88Var == null) {
                    e88Var = view instanceof e88 ? (e88) view : null;
                }
                if (e88Var != null) {
                    e88Var.b(getURL(), i88.a, this);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
    }
}
