package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class ji9 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ ji9(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.E0(true);
                break;
            case 1:
                yy7[] yy7VarArr2 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.O0(((b44) obj).a);
                break;
            default:
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.O0(((b44) obj).a);
                break;
        }
        return qqgVar;
    }
}
