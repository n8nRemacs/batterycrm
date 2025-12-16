package defpackage;

/* loaded from: classes2.dex */
public final class al7 {
    public final k18 a;
    public final k18 b;

    public al7(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(String str, String str2, byte b) {
        dd ddVar = (dd) this.b.getValue();
        nn8 nn8Var = new nn8();
        nn8Var.put("informer_id", str2);
        nn8Var.put("informer_type", Byte.valueOf(b));
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.c = "INFORMER";
        k18 k18Var = this.a;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        xp7Var.d = str;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8VarB);
        ddVar.h(xp7Var.d());
    }
}
