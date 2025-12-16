package defpackage;

/* loaded from: classes2.dex */
public final class tia {
    public final kz4 a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;
    public final kz4 e;

    public tia(kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5) {
        this.a = kz4Var;
        this.b = kz4Var2;
        this.c = kz4Var3;
        this.d = kz4Var4;
        this.e = kz4Var5;
    }

    public final void a(uia uiaVar) {
        long j = uiaVar.Z;
        if (j != 0) {
            wqi.c("tia", "setFavoritesSync: %d", Long.valueOf(j));
            ((w4e) ((pb3) this.c.get())).z(uiaVar.Z);
        }
    }
}
