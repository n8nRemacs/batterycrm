package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j59 {
    public final Bundle a;
    public d69 b;

    public j59(d69 d69Var, boolean z) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = d69Var;
        bundle.putBundle("selector", d69Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            d69 d69Var = null;
            if (bundle != null) {
                d69Var = new d69(bundle, null);
            } else {
                d69 d69Var2 = d69.c;
            }
            this.b = d69Var;
            if (d69Var == null) {
                this.b = d69.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j59) {
            j59 j59Var = (j59) obj;
            a();
            d69 d69Var = this.b;
            j59Var.a();
            if (d69Var.equals(j59Var.b) && b() == j59Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return az1.k(sb, !r1.b.contains(null), " }");
    }
}
