package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class v69 {
    public final wg7 a;
    public final int b;
    public final long c;

    public v69(int i, long j, List list) {
        this.a = wg7.j(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v69)) {
            return false;
        }
        v69 v69Var = (v69) obj;
        return this.a.equals(v69Var.a) && this.b == v69Var.b && this.c == v69Var.c;
    }

    public final int hashCode() {
        return fsi.g(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
