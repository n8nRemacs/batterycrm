package defpackage;

import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class xr7 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InviteByQrBottomSheet b;

    public /* synthetic */ xr7(InviteByQrBottomSheet inviteByQrBottomSheet, int i) {
        this.a = i;
        this.b = inviteByQrBottomSheet;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = InviteByQrBottomSheet.O0;
                ccb ccbVar = new ccb(inviteByQrBottomSheet);
                ccbVar.h(inviteByQrBottomSheet.getContext().getString(avd.g));
                ccbVar.e(new qcb(yud.J));
                return ccbVar;
            default:
                yy7[] yy7VarArr2 = InviteByQrBottomSheet.O0;
                return new ds7(inviteByQrBottomSheet.O0(), 0, 30);
        }
    }
}
