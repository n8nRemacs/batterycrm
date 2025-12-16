package defpackage;

/* loaded from: classes2.dex */
public abstract class fo7 {
    public static final d9a a;

    static {
        d9a d9aVar = gzd.a;
        a = new d9a();
    }

    public static final void a() {
        d9a d9aVar = a;
        Object[] objArr = d9aVar.b;
        long[] jArr = d9aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((mdf) objArr[(i << 3) + i3]).e();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
