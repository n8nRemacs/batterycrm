package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class xa1 {
    public final boolean a;
    public final Map b;

    public xa1(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa1)) {
            return false;
        }
        xa1 xa1Var = (xa1) obj;
        return this.a == xa1Var.a && fni.a(this.b, xa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectedMode(isEnabled=" + this.a + ", selectedIds=" + this.b + ")";
    }

    public /* synthetic */ xa1() {
        this(false, id5.a);
    }
}
