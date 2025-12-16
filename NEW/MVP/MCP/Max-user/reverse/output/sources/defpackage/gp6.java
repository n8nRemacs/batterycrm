package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gp6 implements lp6 {
    public final Object a;

    public gp6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp6) && this.a.equals(((gp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectionChanged(items=" + this.a + ")";
    }
}
