package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e11 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v11 b;

    public /* synthetic */ e11(v11 v11Var, int i) {
        this.a = i;
        this.b = v11Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new i11(this.b, 0);
            case 1:
                return new r11(this.b);
            case 2:
                v11 v11Var = this.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Low hands for all success.", null);
                    }
                }
                v11Var.C0.h(new db(true));
                break;
            case 3:
                v11 v11Var2 = this.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.d;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", "Disable cameras for all once was success", null);
                    }
                }
                v11Var2.C0.h(new ab(true));
                break;
            default:
                v11 v11Var3 = this.b;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null) {
                    lg8 lg8Var3 = lg8.d;
                    if (l6bVar3.b(lg8Var3)) {
                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", "Disable microphone for all once was success", null);
                    }
                }
                v11Var3.C0.h(new cb(true));
                break;
        }
        return qqg.a;
    }
}
