package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class i22 extends j22 {
    public final String a;
    public final List b;

    public i22(String str, List list) {
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
        if (!(obj instanceof i22)) {
            return false;
        }
        i22 i22Var = (i22) obj;
        return fni.a(this.a, i22Var.a) && fni.a(this.b, i22Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
