package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class g22 extends j22 {
    public final String a;
    public final List b;

    public g22(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.j22
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g22)) {
            return false;
        }
        g22 g22Var = (g22) obj;
        return fni.a(this.a, g22Var.a) && fni.a(this.b, g22Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Back(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
