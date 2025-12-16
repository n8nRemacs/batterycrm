package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class ai9 implements e88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e88
    public final void a(cj9 cj9Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                long j = ((bi9) obj).J0;
                MessagesListWidget messagesListWidget = ((kv9) ((sh9) obj2)).a;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                messagesListWidget.K0().H(cj9Var, j);
                break;
            default:
                kv9 kv9Var = ((jr9) obj2).o;
                long j2 = ((MessageModel) obj).a;
                MessagesListWidget messagesListWidget2 = kv9Var.a;
                yy7[] yy7VarArr2 = MessagesListWidget.b1;
                messagesListWidget2.K0().H(cj9Var, j2);
                break;
        }
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        switch (this.a) {
            case 0:
                sh9 sh9Var = (sh9) this.b;
                MessagesListWidget.y0(((kv9) sh9Var).a, str, i88Var, ((bi9) this.c).J0);
                break;
            default:
                kv9 kv9Var = ((jr9) this.b).o;
                MessagesListWidget.y0(kv9Var.a, str, i88Var, ((MessageModel) this.c).a);
                break;
        }
    }
}
