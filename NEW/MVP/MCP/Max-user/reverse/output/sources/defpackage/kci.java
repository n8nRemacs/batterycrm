package defpackage;

import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class kci extends gqd {
    public final PendingIntent a;
    public final boolean b;

    public kci(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqd) {
            gqd gqdVar = (gqd) obj;
            if (this.a.equals(((kci) gqdVar).a)) {
                if (this.b == ((kci) gqdVar).b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return az1.k(az1.n("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
