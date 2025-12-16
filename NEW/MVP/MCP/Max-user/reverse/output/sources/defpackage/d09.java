package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d09 {
    public static final d09 d = new d09(new u5i());
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = zxg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public d09(u5i u5iVar) {
        this.a = (Uri) u5iVar.a;
        this.b = (String) u5iVar.b;
        this.c = (Bundle) u5iVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d09)) {
            return false;
        }
        d09 d09Var = (d09) obj;
        if (Objects.equals(this.a, d09Var.a) && Objects.equals(this.b, d09Var.b)) {
            if ((this.c == null) == (d09Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
