package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class h22 extends j22 {
    public final String a;
    public final List b;

    public h22(String str, List list) {
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
        if (!(obj instanceof h22)) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return fni.a(this.a, h22Var.a) && fni.a(this.b, h22Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Front(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
