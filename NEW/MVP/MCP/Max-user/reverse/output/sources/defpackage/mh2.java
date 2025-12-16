package defpackage;

/* loaded from: classes2.dex */
public final class mh2 {
    public final k18 a;
    public final k18 b;
    public final String c = mh2.class.getName();

    public mh2(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static void a(mh2 mh2Var, long j, long j2, long j3, long j4, rs4 rs4Var) {
        String str = mh2Var.c;
        StringBuilder sbN = ho7.n("from: chatId = ", j, ", time = ", d8j.a(Long.valueOf(j3)));
        sbN.append(", chatAccessToken=");
        sbN.append(true);
        wqi.c(str, sbN.toString(), new Object[0]);
        m1g.b((m1g) mh2Var.b.getValue(), new hh2(((w4e) ((pb3) mh2Var.a.getValue())).k(), j, j2, j3, j4, 0L, rs4Var, 3776));
    }

    public static long b(mh2 mh2Var, long j, long j2, long j3, long j4, long j5, rs4 rs4Var) {
        String str = mh2Var.c;
        String strA = d8j.a(Long.valueOf(j3));
        String strA2 = d8j.a(Long.valueOf(j4));
        StringBuilder sbN = ho7.n("from-to: chatId = ", j, ", time = ", strA);
        sbN.append(", backwardTime = ");
        sbN.append(strA2);
        sbN.append(", chatAccessToken=");
        sbN.append(true);
        wqi.c(str, sbN.toString(), new Object[0]);
        return m1g.b((m1g) mh2Var.b.getValue(), new hh2(((w4e) ((pb3) mh2Var.a.getValue())).k(), j, j2, j3, j5, j4, rs4Var, 3200));
    }

    public static long c(mh2 mh2Var, long j, long j2, long j3, long j4, long j5, rs4 rs4Var) {
        String str = mh2Var.c;
        String strA = d8j.a(Long.valueOf(j3));
        String strA2 = d8j.a(Long.valueOf(j4));
        StringBuilder sbN = ho7.n("to: chatId = ", j, ", time = ", strA);
        sbN.append(", backwardTime = ");
        sbN.append(strA2);
        sbN.append(", chatAccessToken=");
        sbN.append(true);
        wqi.c(str, sbN.toString(), new Object[0]);
        return m1g.b((m1g) mh2Var.b.getValue(), new hh2(((w4e) ((pb3) mh2Var.a.getValue())).k(), j, j2, j3, j5, j4, rs4Var, 3264));
    }
}
