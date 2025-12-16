package defpackage;

/* loaded from: classes2.dex */
public final class sc4 {
    public final k18 a;
    public final k18 b;

    public sc4(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(f7f f7fVar, int i) {
        String str;
        dd ddVar = (dd) this.a.getValue();
        us usVarA = ori.a(new imb("source_id", Long.valueOf(f7fVar.a)), new imb("source_type", Integer.valueOf(f7fVar.b)));
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "DANGEROUS_FILE_ACTIONS";
        if (i == 1) {
            str = "modal_is_shown";
        } else if (i == 2) {
            str = "download_file";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "not_download_file";
        }
        xp7Var.d = str;
        k18 k18Var = this.b;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.c(usVarA);
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        ddVar.h(xp7Var.d());
    }
}
