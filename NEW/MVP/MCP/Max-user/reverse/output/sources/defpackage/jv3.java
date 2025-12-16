package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class jv3 extends ClickableSpan {
    public final long a;
    public i62 b;

    public jv3(long j) {
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ukd ukdVar;
        i62 i62Var = this.b;
        if (i62Var == null || (ukdVar = ((t44) i62Var.b).I0) == null) {
            return;
        }
        MessagesListWidget messagesListWidget = (MessagesListWidget) ukdVar.b;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        messagesListWidget.K0().I(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
