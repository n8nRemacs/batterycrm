package defpackage;

/* loaded from: classes2.dex */
public final class ii0 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final g8a d;
    public final g8a e;
    public final g8a f;

    public ii0(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        int i = po7.a;
        this.d = new g8a(6);
        this.e = new g8a(6);
        this.f = new g8a(6);
    }

    public final void a(int i, int i2, int i3) {
        Integer numD = ((gda) this.c.getValue()).d();
        if (numD != null) {
            b(i, numD.intValue(), i2, i3, ((pe8) ((pb3) this.a.getValue())).K(), "clicked");
        }
    }

    public final void b(int i, int i2, int i3, int i4, long j, String str) {
        String str2;
        String str3;
        String str4;
        dd ddVar = (dd) this.b.getValue();
        nn8 nn8Var = new nn8();
        if (i == 1) {
            str2 = "push";
        } else if (i == 2) {
            str2 = "contacts";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "mic";
        }
        nn8Var.put("bannerType", str2);
        nn8Var.put("screen", Integer.valueOf(i2));
        if (i3 == 1) {
            str3 = "small";
        } else if (i3 == 2) {
            str3 = "medium";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str3 = "large";
        }
        nn8Var.put("bannerSize", str3);
        if (i4 == 1) {
            str4 = "carousel";
        } else {
            if (i4 != 2) {
                throw null;
            }
            str4 = "banner";
        }
        nn8Var.put("bannerShowType", str4);
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.c = "BANNER";
        xp7Var.b = ((w4e) ((pb3) this.a.getValue())).s();
        xp7Var.o = j;
        xp7Var.d = str;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8VarB);
        ddVar.h(xp7Var.d());
    }
}
