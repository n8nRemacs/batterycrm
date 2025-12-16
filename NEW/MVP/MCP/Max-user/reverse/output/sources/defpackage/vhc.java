package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vhc extends xhc {
    public final List a;

    public vhc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhc) && fni.a(this.a, ((vhc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowMoreActions(actions=" + this.a + ")";
    }
}
