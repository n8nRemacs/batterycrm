package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ni4 {
    public final String a;
    public final gi4 b;
    public final Bundle c;
    public final int d;
    public final li4 e;
    public final mi4 f;

    public ni4(String str, gi4 gi4Var, Bundle bundle, int i, li4 li4Var, mi4 mi4Var) {
        this.a = str;
        this.b = gi4Var;
        this.c = bundle;
        this.d = i;
        this.e = li4Var;
        this.f = mi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni4)) {
            return false;
        }
        ni4 ni4Var = (ni4) obj;
        return fni.a(this.a, ni4Var.a) && fni.a(this.b, ni4Var.b) && fni.a(this.c, ni4Var.c) && this.d == ni4Var.d && fni.a(this.e, ni4Var.e) && fni.a(this.f, ni4Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + utb.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        String str = "DeepLinkBundle(bundle=" + this.c + ")";
        StringBuilder sb = new StringBuilder("DeepLinkScreen(name=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", deepLinkBundle=");
        sb.append(str);
        sb.append(", mode=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ACTIVITY" : "FRAGMENT" : "DEFAULT");
        sb.append(", animations=");
        sb.append(this.e);
        sb.append(", screenFactory=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ni4(String str, gi4 gi4Var, Bundle bundle, int i, li4 li4Var, mi4 mi4Var, int i2) {
        this(str, gi4Var, bundle, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? new li4((q8g) null, 3) : li4Var, mi4Var);
    }
}
