package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h8g extends f8d {
    public final boolean b;
    public final boolean c;

    public h8g() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8g)) {
            return false;
        }
        h8g h8gVar = (h8g) obj;
        return this.c == h8gVar.c && this.b == h8gVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public h8g(boolean z) {
        this.b = true;
        this.c = z;
    }
}
