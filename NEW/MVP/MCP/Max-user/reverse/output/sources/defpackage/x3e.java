package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x3e {
    public static final x3e b;
    public final hh7 a;

    static {
        s6b s6bVar = new s6b();
        s6bVar.a = hh7.i(2, 1, 5);
        b = new x3e(s6bVar);
    }

    public x3e(s6b s6bVar) {
        this.a = (hh7) s6bVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x3e) && this.a.equals(((x3e) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
