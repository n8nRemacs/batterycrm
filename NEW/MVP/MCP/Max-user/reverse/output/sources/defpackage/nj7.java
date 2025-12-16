package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nj7 implements brf {
    public final List a;
    public final boolean b;

    public nj7(List list, boolean z) {
        l5j.b("List of suppliers is empty!", !list.isEmpty());
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nj7) {
            return yyi.b(this.a, ((nj7) obj).a);
        }
        return false;
    }

    @Override // defpackage.brf
    public final Object get() {
        return new mj7(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.r(this.a, "list");
        return hc8VarC.toString();
    }
}
