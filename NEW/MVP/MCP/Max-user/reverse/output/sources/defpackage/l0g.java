package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class l0g extends pj0 {
    public static final k0g b = new k0g();

    public l0g() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x064d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.l0g c(short r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 3296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0g.c(short, byte[]):l0g");
    }

    public void d(tm9 tm9Var, String str) {
    }

    public l0g(tm9 tm9Var) {
        try {
            long jNanoTime = System.nanoTime();
            if (tm9Var.l()) {
                int iU0 = tm9Var.u0();
                for (int i = 0; i < iU0; i++) {
                    d(tm9Var, tm9Var.w0());
                }
            }
            this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - jNanoTime));
        } catch (Exception e) {
            wqi.e("l0g", "failed to parse unpacker response: ", e);
            throw new RuntimeException(e);
        }
    }
}
