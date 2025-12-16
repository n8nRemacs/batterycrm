package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ynd {
    public final int a;
    public final int b;

    public ynd(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ynd)) {
            return false;
        }
        ynd yndVar = (ynd) obj;
        return this.a == yndVar.a && this.b == yndVar.b;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }
}
