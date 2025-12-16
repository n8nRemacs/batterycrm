package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class rkd {
    public final Map a;
    public final qkd b;

    public rkd(us usVar, qkd qkdVar) {
        this.a = usVar;
        this.b = qkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkd)) {
            return false;
        }
        rkd rkdVar = (rkd) obj;
        return fni.a(this.a, rkdVar.a) && this.b == rkdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteMessage(data=" + this.a + ", priority=" + this.b + ")";
    }
}
