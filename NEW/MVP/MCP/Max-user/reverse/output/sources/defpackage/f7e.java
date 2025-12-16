package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class f7e {
    public static final f7e c = new f7e(1, hd5.a);
    public final int a;
    public final List b;

    public f7e(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7e)) {
            return false;
        }
        f7e f7eVar = (f7e) obj;
        return this.a == f7eVar.a && fni.a(this.b, f7eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (az1.v(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "EMPTY" : "CONTENT" : "LOADING");
        sb.append(", content=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
