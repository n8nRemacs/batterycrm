package defpackage;

import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class qr3 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr3 b;

    public /* synthetic */ qr3(rr3 rr3Var, int i) {
        this.a = i;
        this.b = rr3Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                rr3 rr3Var = this.b;
                rr3Var.c.f((atc) obj, hf5.d, new qr3(rr3Var, 0));
                break;
            default:
                rr3 rr3Var2 = this.b;
                rde rdeVar = rr3Var2.c;
                int iIntValue = ((Integer) obj).intValue();
                spd spdVar = new spd();
                spdVar.a = iIntValue;
                rdeVar.f(spdVar, hf5.d, new qr3(rr3Var2, 0));
                break;
        }
    }
}
