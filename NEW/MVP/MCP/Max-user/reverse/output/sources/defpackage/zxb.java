package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final class zxb implements cxb {
    public final /* synthetic */ PickerChatsListWidget a;

    public zxb(PickerChatsListWidget pickerChatsListWidget) {
        this.a = pickerChatsListWidget;
    }

    @Override // defpackage.cxb
    public final boolean U(yyb yybVar, boolean z) {
        yy7[] yy7VarArr = PickerChatsListWidget.A0;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        hs hsVar = pickerChatsListWidget.o;
        yy7 yy7Var = PickerChatsListWidget.A0[2];
        if (((Boolean) hsVar.a(pickerChatsListWidget)).booleanValue()) {
            return false;
        }
        em6 em6Var = pickerChatsListWidget.X;
        if (em6Var != null) {
            em6Var.invoke(Boolean.TRUE);
        }
        pickerChatsListWidget.B0().t(yybVar, z, pickerChatsListWidget.A0(), true);
        return true;
    }

    @Override // defpackage.cxb
    public final void d0(yyb yybVar, boolean z) {
        yy7[] yy7VarArr = PickerChatsListWidget.A0;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        pickerChatsListWidget.B0().t(yybVar, z, pickerChatsListWidget.A0(), true);
    }
}
