package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class gj5 {
    public bj a;
    public a9 b;
    public int c;
    public int d;
    public int e;
    public wtd f;
    public final z95 g;
    public final aa h;
    public final mbd i;

    public gj5(z95 z95Var, aa aaVar, mbd mbdVar) {
        this.g = z95Var;
        this.h = aaVar;
        this.i = mbdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qbd a(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.a(int, int, int, boolean, boolean):qbd");
    }

    public final void b(IOException iOException) {
        this.f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == 8) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
