package defpackage;

import java.net.InetAddress;

/* loaded from: classes2.dex */
public final class ss7 {
    public final InetAddress a;
    public volatile int b;
    public volatile int c;
    public volatile int d;

    public ss7(InetAddress inetAddress) {
        this.a = inetAddress;
    }

    public final String toString() {
        InetAddress inetAddress = this.a;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        float f = this.c != 0 ? this.d / this.c : 1.0f;
        StringBuilder sb = new StringBuilder("Ip(");
        sb.append(inetAddress);
        sb.append("|uc=");
        sb.append(i);
        sb.append("|sc=");
        hf3.g(sb, i2, "|tc=", i3, "|sr=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
