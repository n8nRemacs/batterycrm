package defpackage;

/* loaded from: classes2.dex */
public final class n25 extends yqb {
    public static final n25 g;
    public static final String h;

    static {
        fo4 fo4Var = new fo4();
        drb drbVar = drb.a;
        fo4Var.c = (erb) drbVar.getAccessor().c(7);
        fo4Var.o = (lzf) drbVar.getAccessor().c(8);
        fo4Var.d = (yi5) drbVar.getAccessor().c(9);
        w8a w8aVar = (w8a) fo4Var.b;
        w8aVar.b(new dga(20));
        w8aVar.b(new iqb(0, new l25(drbVar.getAccessor().d(0), (erb) drbVar.getAccessor().c(7), 0)));
        g = new n25(fo4Var.a());
        h = "download";
    }

    @Override // defpackage.yqb
    public final String g() {
        return h;
    }

    public final void o(long j, long j2, String str) {
        long[] jArr = fzd.a;
        c9a c9aVar = new c9a();
        c9aVar.i("size", Long.valueOf(j));
        Long lValueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            c9aVar.i("local_range", Long.valueOf(j2));
        }
        this.f.h(new mqb(str, c9aVar));
    }
}
