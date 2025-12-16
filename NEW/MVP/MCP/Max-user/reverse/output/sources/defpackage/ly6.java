package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ly6 {
    public final List a;

    public ly6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly6) && fni.a(this.a, ((ly6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GridModeState(opponentsPages=" + this.a + ")";
    }
}
