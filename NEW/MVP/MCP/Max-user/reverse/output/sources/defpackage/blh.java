package defpackage;

/* loaded from: classes2.dex */
public final class blh {
    public final k18 a;
    public final k18 b;

    public blh(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(int i, long j, String str, ukh ukhVar, wa2 wa2Var) {
        String str2;
        dd ddVar = (dd) this.a.getValue();
        nn8 nn8Var = new nn8();
        nn8Var.put("botId", Long.valueOf(j));
        nn8Var.put("webAppName", str);
        nn8Var.put("entryPoint", Integer.valueOf(ukhVar.b));
        nn8Var.put("sourceType", Integer.valueOf(wa2Var.a));
        Long lA = wa2Var.a();
        if (lA != null) {
            nn8Var.put("sourceId", Long.valueOf(lA.longValue()));
        }
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.c = "WEBAPP_ACTION";
        k18 k18Var = this.b;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        if (i == 1) {
            str2 = "OPEN";
        } else if (i == 2) {
            str2 = "CLOSE";
        } else if (i == 3) {
            str2 = "REFRESH";
        } else if (i == 4) {
            str2 = "MINIAPP_TAKE_PHOTO";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "MINIAPP_TAKE_PHOTO_FROM_DOWNLOAD_MENU";
        }
        xp7Var.d = str2;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8VarB);
        ddVar.h(xp7Var.d());
    }
}
