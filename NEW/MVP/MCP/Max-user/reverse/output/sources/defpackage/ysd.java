package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ysd {
    public static final ysd c = new ysd(-1, false);
    public static final ysd d = new ysd(-1, true);
    public final int a;
    public final boolean b;

    public ysd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ysd)) {
            return false;
        }
        ysd ysdVar = (ysd) obj;
        return this.a == ysdVar.a && this.b == ysdVar.b;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Boolean boolValueOf = Boolean.valueOf(this.b);
        return ((numValueOf.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)}, 2));
    }
}
