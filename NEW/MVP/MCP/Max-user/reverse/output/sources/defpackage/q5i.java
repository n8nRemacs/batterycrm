package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q5i {
    public final String a;
    public final w4i b;
    public final yd4 c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;

    public q5i(String str, w4i w4iVar, yd4 yd4Var, int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = w4iVar;
        this.c = yd4Var;
        this.d = i;
        this.e = i2;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5i)) {
            return false;
        }
        q5i q5iVar = (q5i) obj;
        return fni.a(this.a, q5iVar.a) && this.b == q5iVar.b && this.c.equals(q5iVar.c) && this.d == q5iVar.d && this.e == q5iVar.e && this.f.equals(q5iVar.f) && this.g.equals(q5iVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + xrf.k(this.e, xrf.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", runAttemptCount=" + this.d + ", generation=" + this.e + ", tags=" + this.f + ", progress=" + this.g + ')';
    }
}
