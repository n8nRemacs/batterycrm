package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class ki9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ ki9(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessageContextMenuBottomSheet.d1;
                hs hsVar = messageContextMenuBottomSheet.O0;
                yy7[] yy7VarArr2 = MessageContextMenuBottomSheet.d1;
                yy7 yy7Var = yy7VarArr2[9];
                if (!((Boolean) hsVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    yy7 yy7Var2 = yy7VarArr2[9];
                    hsVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    Object targetController = messageContextMenuBottomSheet.getTargetController();
                    g44 g44Var = targetController instanceof g44 ? (g44) targetController : null;
                    if (g44Var != null) {
                        g44Var.onDismiss();
                    }
                }
                return qqg.a;
            case 1:
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                hs hsVar2 = messageContextMenuBottomSheet.L0;
                yy7[] yy7VarArr4 = MessageContextMenuBottomSheet.d1;
                yy7 yy7Var3 = yy7VarArr4[6];
                long jLongValue = ((Number) hsVar2.a(messageContextMenuBottomSheet)).longValue();
                hs hsVar3 = messageContextMenuBottomSheet.M0;
                yy7 yy7Var4 = yy7VarArr4[7];
                long jLongValue2 = ((Number) hsVar3.a(messageContextMenuBottomSheet)).longValue();
                hs hsVar4 = messageContextMenuBottomSheet.N0;
                yy7 yy7Var5 = yy7VarArr4[8];
                return new hf9(jLongValue, jLongValue2, ((Number) hsVar4.a(messageContextMenuBottomSheet)).longValue());
            default:
                yy7[] yy7VarArr5 = MessageContextMenuBottomSheet.d1;
                return Boolean.valueOf(messageContextMenuBottomSheet.S0().z());
        }
    }
}
