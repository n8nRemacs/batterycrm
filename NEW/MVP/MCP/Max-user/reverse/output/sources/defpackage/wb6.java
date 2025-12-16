package defpackage;

/* loaded from: classes2.dex */
public final class wb6 {
    public static final wb6 b = new wb6(fzd.b);
    public final c9a a;

    public wb6(c9a c9aVar) {
        this.a = c9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb6) && fni.a(this.a, ((wb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoldersCounters(counters=" + this.a + ")";
    }
}
