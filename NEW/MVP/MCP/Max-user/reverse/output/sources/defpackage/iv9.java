package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class iv9 implements e88 {
    public final /* synthetic */ MessagesListWidget a;

    public iv9(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    @Override // defpackage.e88
    public final void a(cj9 cj9Var) {
        yy7[] yy7VarArr = MessagesListWidget.b1;
        this.a.K0().H(cj9Var, 0L);
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        MessagesListWidget.y0(this.a, str, i88Var, 0L);
    }
}
