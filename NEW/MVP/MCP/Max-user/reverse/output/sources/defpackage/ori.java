package defpackage;

/* loaded from: classes.dex */
public abstract class ori {
    public static boolean a;

    public static final us a(imb... imbVarArr) {
        us usVar = new us(imbVarArr.length);
        for (imb imbVar : imbVarArr) {
            usVar.put(imbVar.a, imbVar.b);
        }
        return usVar;
    }

    public static void b(iu0 iu0Var, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = iu0Var.o;
            int i2 = iu0Var.X;
            int i3 = iu0Var.Y;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = iu0Var.d;
            if (j == iu0Var.a.b) {
                throw new IllegalStateException("no more bytes");
            }
        } while (iu0Var.d(j == -1 ? 0L : j + (iu0Var.Y - iu0Var.X)) != -1);
    }
}
