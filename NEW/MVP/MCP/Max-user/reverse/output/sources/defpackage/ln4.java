package defpackage;

/* loaded from: classes.dex */
public final class ln4 implements le7 {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = kfi.a("GIF87a");
    public static final byte[] g = kfi.a("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public final int a;

    static {
        byte[] bArrA = kfi.a("BM");
        h = bArrA;
        i = bArrA.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = kfi.a("ftyp");
        m = new byte[][]{kfi.a("heic"), kfi.a("heix"), kfi.a("hevc"), kfi.a("hevx"), kfi.a("mif1"), kfi.a("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
        q = new byte[]{3, 0, 8, 0};
        r = kfi.a("ftyp");
        s = kfi.a("avif");
    }

    public ln4() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            int i2 = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num3 = numArr[i2];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    @Override // defpackage.le7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.me7 a(int r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln4.a(int, byte[]):me7");
    }

    @Override // defpackage.le7
    public final int b() {
        return this.a;
    }
}
