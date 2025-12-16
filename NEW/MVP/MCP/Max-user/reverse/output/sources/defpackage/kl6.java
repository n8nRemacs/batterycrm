package defpackage;

/* loaded from: classes2.dex */
public final class kl6 implements le7 {
    public static final kl6 a = new kl6();
    public static final byte[] b;
    public static final byte[] c;
    public static final int d;

    static {
        int length = "<svg".getBytes(lb2.b).length;
        b = kfi.a("<svg");
        c = kfi.a("<?xm");
        d = length;
    }

    @Override // defpackage.le7
    public final me7 a(int i, byte[] bArr) {
        return (kfi.e(bArr, b, 0) || kfi.e(bArr, c, 0)) ? h2f.b : me7.c;
    }

    @Override // defpackage.le7
    public final int b() {
        return d;
    }
}
