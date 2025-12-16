package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class li9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cda b;

    public /* synthetic */ li9(cda cdaVar, int i) {
        this.a = i;
        this.b = cdaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        cda cdaVar = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessageContextMenuBottomSheet.d1;
                qr9.c.s0((ei4) cdaVar);
                break;
            case 1:
                yy7[] yy7VarArr2 = MessagesListWidget.b1;
                qr9 qr9Var = qr9.c;
                lib libVar = (lib) cdaVar;
                long j = libVar.b;
                boolean z = libVar.c;
                qr9Var.p0().b(":call-user?opponent_id=" + j + "&video_enabled=" + z, null);
                break;
            default:
                yy7[] yy7VarArr3 = MessagesListWidget.b1;
                qr9.c.p0().b(":call-join-link?link=".concat(((zhb) cdaVar).d), null);
                break;
        }
        return qqgVar;
    }

    public /* synthetic */ li9(MessageContextMenuBottomSheet messageContextMenuBottomSheet, cda cdaVar) {
        this.a = 0;
        this.b = cdaVar;
    }
}
