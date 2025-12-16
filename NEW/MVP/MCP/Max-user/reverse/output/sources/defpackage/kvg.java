package defpackage;

/* loaded from: classes2.dex */
public final class kvg extends yqb {
    public static final kvg g;
    public static final String h;

    static {
        fo4 fo4Var = new fo4();
        drb drbVar = drb.a;
        fo4Var.c = (erb) drbVar.getAccessor().c(7);
        fo4Var.o = (lzf) drbVar.getAccessor().c(8);
        fo4Var.d = (yi5) drbVar.getAccessor().c(9);
        w8a w8aVar = (w8a) fo4Var.b;
        w8aVar.b(new dga(20));
        w8aVar.b(new iqb(0, new l25(drbVar.getAccessor().d(0), (erb) drbVar.getAccessor().c(7), 2)));
        g = new kvg(fo4Var.a());
        h = "upload";
    }

    @Override // defpackage.yqb
    public final String g() {
        return h;
    }

    @Override // defpackage.yqb
    public final long k(c9a c9aVar) {
        Object objF = c9aVar.f("size");
        Long l = objF instanceof Long ? (Long) objF : null;
        if (l == null) {
            String str = this.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "Trying to provide timeout for metric without fileSize", null);
                }
            }
            int i = s65.d;
            return v9j.h(5, y65.MINUTES);
        }
        if (l.longValue() > 104857600) {
            int i2 = s65.d;
            return v9j.h(5, y65.MINUTES);
        }
        if (l.longValue() > 10485760) {
            int i3 = s65.d;
            return v9j.h(3, y65.MINUTES);
        }
        int i4 = s65.d;
        return v9j.h(1, y65.MINUTES);
    }
}
