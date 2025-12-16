package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ec implements aa5 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public rfg f;
    public rfg g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public rfg t;
    public long u;
    public final u62 b = new u62(new byte[7], 7, 2, (byte) 0);
    public final qyg c = new qyg(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public ec(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    @Override // defpackage.aa5
    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01ed  */
    @Override // defpackage.aa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.qyg r20) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec.d(qyg):void");
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // defpackage.aa5
    public final void g() {
    }

    @Override // defpackage.aa5
    public final void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.e = mjgVar.f;
        mjgVar.b();
        rfg rfgVarB = jp5Var.B(mjgVar.e, 1);
        this.f = rfgVarB;
        this.t = rfgVarB;
        if (!this.a) {
            this.g = new q65();
            return;
        }
        mjgVar.a();
        mjgVar.b();
        rfg rfgVarB2 = jp5Var.B(mjgVar.e, 5);
        this.g = rfgVarB2;
        ef6 ef6Var = new ef6();
        mjgVar.b();
        ef6Var.a = mjgVar.f;
        ef6Var.k = "application/id3";
        rfgVarB2.d(new gf6(ef6Var));
    }
}
