package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class yh9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bi9 b;
    public final /* synthetic */ sh9 c;

    public /* synthetic */ yh9(bi9 bi9Var, kv9 kv9Var) {
        this.b = bi9Var;
        this.c = kv9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sh9 sh9Var = this.c;
        bi9 bi9Var = this.b;
        switch (i) {
            case 0:
                long j = bi9Var.J0;
                MessagesListWidget messagesListWidget = ((kv9) sh9Var).a;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                messagesListWidget.K0().M(j);
                break;
            default:
                bi9Var.K(sh9Var, null);
                break;
        }
    }

    public /* synthetic */ yh9(kv9 kv9Var, bi9 bi9Var) {
        this.c = kv9Var;
        this.b = bi9Var;
    }
}
