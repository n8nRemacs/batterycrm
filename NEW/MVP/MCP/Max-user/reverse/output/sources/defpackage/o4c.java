package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o4c {
    public static final o4c c = new o4c(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = zxg.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public o4c(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4c)) {
            return false;
        }
        o4c o4cVar = (o4c) obj;
        return this.a == o4cVar.a && this.b == o4cVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
