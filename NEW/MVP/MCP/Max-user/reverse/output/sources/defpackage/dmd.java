package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dmd {
    public final qt7 a;
    public final List b;

    public dmd(qt7 qt7Var, List list) {
        this.a = qt7Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmd)) {
            return false;
        }
        dmd dmdVar = (dmd) obj;
        return fni.a(this.a, dmdVar.a) && fni.a(this.b, dmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobData(job=" + this.a + ", keys=" + this.b + ")";
    }
}
