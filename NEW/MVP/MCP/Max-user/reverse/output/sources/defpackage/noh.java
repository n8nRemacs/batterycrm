package defpackage;

/* loaded from: classes2.dex */
public final class noh {
    public final k18 a;
    public final k18 b;

    public noh(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static void a(noh nohVar, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        k18 k18Var = nohVar.a;
        k18 k18Var2 = nohVar.b;
        dd ddVar = (dd) k18Var.getValue();
        nn8 nn8Var = new nn8();
        nn8Var.put("sessionId", Long.valueOf(((pe8) ((pb3) k18Var2.getValue())).K()));
        nn8Var.put("botId", Long.valueOf(j));
        nn8Var.put("webAppName", str2);
        nn8Var.put("success", Integer.valueOf(z ? 1 : 0));
        nn8Var.put("type", Integer.valueOf(i));
        if (num != null) {
            nn8Var.put("method", num);
        }
        if (num2 != null) {
            nn8Var.put("code", num2);
        }
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.c = "WEBAPP_BRIDGE";
        xp7Var.b = ((w4e) ((pb3) k18Var2.getValue())).s();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.d = str;
        xp7Var.c(nn8VarB);
        ddVar.h(xp7Var.d());
    }
}
