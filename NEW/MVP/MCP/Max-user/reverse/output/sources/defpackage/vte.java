package defpackage;

/* loaded from: classes2.dex */
public final class vte implements aue {
    public final Long a;

    public vte(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vte) && fni.a(this.a, ((vte) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "Close(destination=" + this.a + ")";
    }
}
