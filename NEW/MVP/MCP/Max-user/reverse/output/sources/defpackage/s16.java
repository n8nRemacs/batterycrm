package defpackage;

/* loaded from: classes.dex */
public final class s16 implements fp5 {
    public jp5 e;
    public rfg f;
    public sy9 h;
    public x16 i;
    public int j;
    public int k;
    public q16 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final qyg b = new qyg(0, new byte[32768]);
    public final boolean c = false;
    public final n7 d = new n7();
    public int g = 0;

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            q16 q16Var = this.l;
            if (q16Var != null) {
                q16Var.e(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.B(0);
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.e = jp5Var;
        this.f = jp5Var.B(0, 1);
        jp5Var.w();
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        gt.d(hp5Var, false);
        byte[] bArr = new byte[4];
        ((mm4) hp5Var).n(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030a  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, byte, int] */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r34, defpackage.n7 r35) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
