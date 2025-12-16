package defpackage;

import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class tj3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComplaintBottomSheet b;

    public /* synthetic */ tj3(ComplaintBottomSheet complaintBottomSheet, int i) {
        this.a = i;
        this.b = complaintBottomSheet;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ComplaintBottomSheet complaintBottomSheet = this.b;
        switch (i) {
            case 0:
                hs hsVar = complaintBottomSheet.b;
                yy7[] yy7VarArr = ComplaintBottomSheet.X;
                yy7 yy7Var = yy7VarArr[1];
                Long l = (Long) hsVar.a(complaintBottomSheet);
                hs hsVar2 = complaintBottomSheet.a;
                yy7 yy7Var2 = yy7VarArr[0];
                return new gk3(l, (long[]) hsVar2.a(complaintBottomSheet));
            default:
                yy7[] yy7VarArr2 = ComplaintBottomSheet.X;
                ccb ccbVar = new ccb(complaintBottomSheet);
                ccbVar.e(new qcb(yud.O1));
                ccbVar.g(new n5g(g3b.b));
                return ccbVar;
        }
    }
}
