package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class xxb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ xxb(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 4;
        boolean z = false;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = PickerChatsListWidget.A0;
                zfb zfbVar = new zfb(13);
                e03 e03Var = e03.a;
                bwf bwfVarD = e03Var.getAccessor().d(46);
                e03Var.getAccessor().getClass();
                e23 e23Var = new e23(zfbVar, bwfVarD, e03Var.getAccessor().d(48), e03Var.getAccessor().d(HttpStatus.SC_MULTI_STATUS), e03Var.getAccessor().d(HttpStatus.SC_PRECONDITION_FAILED), e03Var.getAccessor().d(214));
                bwf bwfVar = new bwf(new xxb(pickerChatsListWidget, 3));
                String str = pickerChatsListWidget.b;
                pb3 pb3Var = (pb3) e03Var.getAccessor().c(46);
                lzf lzfVar = (lzf) e03Var.getAccessor().c(8);
                sl7 sl7Var = new sl7(e23Var);
                return new wxb(str, ((c13) e03Var.getAccessor().c(559)).a(pickerChatsListWidget.b), (ay3) e03Var.getAccessor().c(556), pb3Var, new xxb(pickerChatsListWidget, i2), pickerChatsListWidget.A0(), lzfVar, e03Var.getAccessor().d(352), sl7Var, bwfVar);
            case 1:
                yy7[] yy7VarArr2 = PickerChatsListWidget.A0;
                return new w73(new xxb(pickerChatsListWidget, 5), new iqb(i2, pickerChatsListWidget), new yxb(pickerChatsListWidget, 0), new yxb(pickerChatsListWidget, 1));
            case 2:
                yy7[] yy7VarArr3 = PickerChatsListWidget.A0;
                x3b x3bVar = new x3b(pickerChatsListWidget.getContext());
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.d));
                x3bVar.setSubtitle(new n5g(avd.c));
                return x3bVar;
            case 3:
                yy7[] yy7VarArr4 = PickerChatsListWidget.A0;
                e03 e03Var2 = e03.a;
                return new myb(e03Var2.getAccessor().d(48), e03Var2.getAccessor().d(HttpStatus.SC_MULTI_STATUS), e03Var2.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT), pickerChatsListWidget.A0());
            case 4:
                hs hsVar = pickerChatsListWidget.d;
                yy7 yy7Var = PickerChatsListWidget.A0[1];
                if (((Boolean) hsVar.a(pickerChatsListWidget)).booleanValue() && fni.a(pickerChatsListWidget.b, "all.chat.folder")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                yy7[] yy7VarArr5 = PickerChatsListWidget.A0;
                return kk4.j(pickerChatsListWidget.getContext());
        }
    }
}
