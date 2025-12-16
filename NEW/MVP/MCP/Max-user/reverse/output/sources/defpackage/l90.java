package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l90 {
    public final String a;
    public final Class b;
    public final hie c;
    public final xwg d;
    public final Size e;
    public final ob0 f;
    public final List g;

    public l90(String str, Class cls, hie hieVar, xwg xwgVar, Size size, ob0 ob0Var, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.a = str;
        this.b = cls;
        if (hieVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = hieVar;
        if (xwgVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = xwgVar;
        this.e = size;
        this.f = ob0Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        Size size;
        ob0 ob0Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l90) {
            l90 l90Var = (l90) obj;
            String str = l90Var.a;
            List list2 = l90Var.g;
            ob0 ob0Var2 = l90Var.f;
            Size size2 = l90Var.e;
            if (this.a.equals(str) && this.b.equals(l90Var.b) && this.c.equals(l90Var.c) && this.d.equals(l90Var.d) && ((size = this.e) != null ? size.equals(size2) : size2 == null) && ((ob0Var = this.f) != null ? ob0Var.equals(ob0Var2) : ob0Var2 == null) && ((list = this.g) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        ob0 ob0Var = this.f;
        int iHashCode3 = (iHashCode2 ^ (ob0Var == null ? 0 : ob0Var.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return az1.j(sb, this.g, "}");
    }
}
