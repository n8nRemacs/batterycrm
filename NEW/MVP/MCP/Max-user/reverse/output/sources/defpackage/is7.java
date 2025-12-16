package defpackage;

/* loaded from: classes2.dex */
public final class is7 {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public is7(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public final void a(String str, String str2, String str3) {
        Integer numD = ((gda) this.b.getValue()).d();
        if (numD != null) {
            nn8 nn8Var = new nn8();
            k18 k18Var = this.a;
            nn8Var.put("session_id", Long.valueOf(((pe8) ((pb3) k18Var.getValue())).K()));
            nn8Var.put("screen", numD);
            nn8Var.put("entryPoint", str2);
            nn8Var.put("linkType", str3);
            nn8Var.put("status", "success");
            nn8 nn8VarB = nn8Var.b();
            xp7 xp7Var = new xp7();
            xp7Var.c = "INVITE_MAX_BANNER";
            xp7Var.d = str;
            xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
            xp7Var.a = System.currentTimeMillis();
            xp7Var.c(nn8VarB);
            ((dd) this.c.getValue()).h(xp7Var.d());
        }
    }
}
