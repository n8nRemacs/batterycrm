package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gi4 {
    public final Uri a;
    public final int b;
    public final LinkedHashSet c;
    public final boolean d;
    public final Set e;

    public gi4(Uri uri, int i, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = i;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi4)) {
            return false;
        }
        gi4 gi4Var = (gi4) obj;
        return this.a.equals(gi4Var.a) && this.b == gi4Var.b && this.c.equals(gi4Var.c) && this.d == gi4Var.d && fni.a(this.e, gi4Var.e);
    }

    public final int hashCode() {
        int iB = a9h.b((this.c.hashCode() + utb.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        Set set = this.e;
        return iB + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = az1.n("DeepLinkRoute(deepLinkUri=", this.a.toString(), ", constraint=");
        int i = this.b;
        sbN.append(i != 1 ? i != 2 ? "null" : "LOGGED_IN" : "NOT_LOGGED_IN");
        sbN.append(", requiredParams=");
        sbN.append(this.c);
        sbN.append(", supportRoot=");
        sbN.append(this.d);
        sbN.append(", bundleRequiredParams=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
