package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class yr7 implements ro3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ro3
    public final void a() {
        switch (this.a) {
            case 0:
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.b;
                yy7[] yy7VarArr = InviteByQrBottomSheet.O0;
                String name = InviteByQrBottomSheet.class.getName();
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.o;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, name, "Recreate qr code due to display config change", null);
                    }
                }
                if (inviteByQrBottomSheet.getView() != null) {
                    ((AppCompatImageView) inviteByQrBottomSheet.E0.D(inviteByQrBottomSheet, InviteByQrBottomSheet.O0[1])).setImageBitmap(null);
                }
                ds7 ds7Var = (ds7) inviteByQrBottomSheet.K0.getValue();
                erc ercVarO0 = inviteByQrBottomSheet.O0();
                yy7[] yy7VarArr2 = ds7.s0;
                ds7Var.t(ercVarO0, true, 0);
                break;
            case 1:
                ((gr9) this.b).e().i(-1);
                break;
            case 2:
                ((dza) this.b).d.reset();
                break;
            default:
                cie cieVar = (cie) this.b;
                int size = cieVar.b().size();
                cieVar.b().evictAll();
                ((t4g) ((bwf) cieVar.h).getValue()).evictAll();
                if (size > 0) {
                    String str = (String) cieVar.f;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null) {
                        lg8 lg8Var2 = lg8.d;
                        if (l6bVar2.b(lg8Var2)) {
                            l6bVar2.c(lg8Var2, str, wy1.e(size, "Cache cleared: removed ", " layouts"), null);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
