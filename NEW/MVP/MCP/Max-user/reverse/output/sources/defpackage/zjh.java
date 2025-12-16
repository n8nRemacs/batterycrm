package defpackage;

/* loaded from: classes2.dex */
public final class zjh {
    public final k18 a;
    public final k18 b;

    public zjh(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(int i, int i2) {
        String str;
        String str2;
        nn8 nn8Var = new nn8();
        nn8Var.put("UIElementType", "procced_url_modal_window");
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = "go";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "close";
            }
            nn8Var.put("clickType", str2);
        }
        nn8 nn8VarB = nn8Var.b();
        dd ddVar = (dd) this.a.getValue();
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "DANGEROUS_URL_ACTIONS";
        if (i == 1) {
            str = "clicked";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "showed";
        }
        xp7Var.d = str;
        k18 k18Var = this.b;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.c(nn8VarB);
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        ddVar.h(xp7Var.d());
    }
}
