package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z17 extends f8d {
    public final boolean b;
    public final boolean c;

    public z17() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z17)) {
            return false;
        }
        z17 z17Var = (z17) obj;
        return this.c == z17Var.c && this.b == z17Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public z17(boolean z) {
        this.b = true;
        this.c = z;
    }
}
