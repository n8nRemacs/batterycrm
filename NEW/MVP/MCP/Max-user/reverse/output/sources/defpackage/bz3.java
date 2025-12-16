package defpackage;

import android.view.View;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class bz3 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ bz3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ContactListWidget contactListWidget = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iJ = contactListWidget.t0.j();
                b0i b0iVar = contactListWidget.X;
                int iJ2 = b0iVar.j() + iJ;
                b0i b0iVar2 = contactListWidget.Z;
                int iJ3 = b0iVar2.j() + iJ2;
                int iJ4 = contactListWidget.s0.j();
                CharSequence charSequenceA0 = contactListWidget.A0();
                if ((charSequenceA0 == null || charSequenceA0.length() == 0) && iIntValue >= iJ && iIntValue >= iJ4) {
                    if (iIntValue >= iJ2) {
                        if (iIntValue < iJ3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                ((is7) contactListWidget.d.getValue()).a("show", "plus", "invite_friends");
                h6j.a(1).B((View) obj).o(contactListWidget.D0).f().build().u(contactListWidget);
                break;
            default:
                yy7[] yy7VarArr = ContactListWidget.O0;
                contactListWidget.getRouter().B(contactListWidget);
                break;
        }
        return qqgVar;
    }
}
