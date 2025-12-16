package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class wtd {
    public final aa a;
    public final Proxy b;
    public final InetSocketAddress c;

    public wtd(aa aaVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = aaVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wtd)) {
            return false;
        }
        wtd wtdVar = (wtd) obj;
        return fni.a(wtdVar.a, this.a) && fni.a(wtdVar.b, this.b) && fni.a(wtdVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
