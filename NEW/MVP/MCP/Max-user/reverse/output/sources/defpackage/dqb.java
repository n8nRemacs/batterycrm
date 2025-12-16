package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class dqb extends f8d {
    public final float b;

    public dqb() {
        this.b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dqb) {
            return this.b == ((dqb) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public dqb(float f) {
        fsi.a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
