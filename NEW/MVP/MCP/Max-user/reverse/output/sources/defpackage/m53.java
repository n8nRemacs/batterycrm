package defpackage;

import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class m53 implements dcb {
    public final /* synthetic */ int a;
    public final /* synthetic */ jxe b;

    public /* synthetic */ m53(jxe jxeVar, int i) {
        this.a = i;
        this.b = jxeVar;
    }

    @Override // defpackage.dcb
    public final void l(ecb ecbVar) {
        int i = this.a;
        jxe jxeVar = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatsListWidget.L0;
                jxeVar.b.invoke(ecbVar);
                break;
            default:
                yy7[] yy7VarArr2 = ContactListWidget.O0;
                jxeVar.b.invoke(ecbVar);
                break;
        }
    }
}
