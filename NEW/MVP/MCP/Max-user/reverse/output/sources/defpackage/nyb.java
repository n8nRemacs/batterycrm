package defpackage;

import java.util.Set;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class nyb implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ nyb(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        fxb fxbVar;
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                PickerContactsListWidget pickerContactsListWidget = this.b;
                int iJ = pickerContactsListWidget.Z.j();
                dxb dxbVar = pickerContactsListWidget.X;
                int iJ2 = dxbVar.j() + iJ;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.z0().t0.a.getValue();
                if ((charSequence == null || charSequence.length() == 0) && iIntValue >= iJ && iIntValue < iJ2 && (fxbVar = (fxb) dxbVar.G(iIntValue - iJ)) != null) {
                    return fxbVar.c;
                }
                return null;
            case 1:
                PickerContactsListWidget pickerContactsListWidget2 = this.b;
                int iJ3 = pickerContactsListWidget2.Z.j();
                int iJ4 = pickerContactsListWidget2.X.j() + iJ3;
                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.z0().t0.a.getValue();
                return Boolean.valueOf(!(charSequence2 == null || charSequence2.length() == 0) || (iIntValue >= iJ3 && iIntValue < iJ4));
            default:
                PickerContactsListWidget pickerContactsListWidget3 = this.b;
                int iJ5 = pickerContactsListWidget3.Z.j();
                dxb dxbVar2 = pickerContactsListWidget3.X;
                int iJ6 = dxbVar2.j() + iJ5;
                CharSequence charSequence3 = (CharSequence) pickerContactsListWidget3.z0().t0.a.getValue();
                fxb fxbVar2 = (charSequence3 == null || charSequence3.length() == 0) ? (iIntValue >= iJ5 && iIntValue < iJ6) ? (fxb) dxbVar2.G(iIntValue - iJ5) : null : (fxb) pickerContactsListWidget3.Y.G(iIntValue);
                return Boolean.valueOf(fxbVar2 != null ? ((Set) pickerContactsListWidget3.z0().Y.a.getValue()).contains(Long.valueOf(fxbVar2.a)) : false);
        }
    }
}
