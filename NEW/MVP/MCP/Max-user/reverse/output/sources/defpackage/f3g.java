package defpackage;

import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f3g implements Runnable {
    public final InetAddress[] a;
    public final unc b;
    public final int c;
    public final String d;

    public f3g(InetAddress[] inetAddressArr, unc uncVar, uaj uajVar, int i) {
        this.a = inetAddressArr;
        this.b = uncVar;
        this.c = i;
        this.d = ho7.g("TcpConnectTask", i, System.identityHashCode(this), "@");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3g.run():void");
    }

    public final String toString() {
        return ho7.i("FastConnectTask(timeout=15000ms|", Arrays.toString(this.a), ")");
    }
}
