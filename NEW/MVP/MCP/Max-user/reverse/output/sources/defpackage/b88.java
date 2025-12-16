package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class b88 extends ClickableSpan implements ep8 {
    public int a;
    public boolean b;
    public final String c;
    public a88 d;
    public final int o = 6;

    public b88(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = vmf.c0(str).toString();
    }

    @Override // defpackage.g74
    public final g74 copy() {
        return new b88(this.c, this.a, true);
    }

    @Override // defpackage.ep8
    public final int getType() {
        return this.o;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        a88 a88Var = this.d;
        if (a88Var != null) {
            a88Var.a(view, this.c);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(this.b);
    }
}
