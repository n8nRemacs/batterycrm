package defpackage;

/* loaded from: classes.dex */
public final class yib {
    public final zib a;

    public yib(zib zibVar) {
        this.a = zibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yib) && fni.a(this.a, ((yib) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentPayload(page=" + this.a + ")";
    }
}
