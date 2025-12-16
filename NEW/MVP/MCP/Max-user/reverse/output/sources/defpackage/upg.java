package defpackage;

/* loaded from: classes.dex */
public final class upg implements Comparable {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return fni.b(this.a & 65535, ((upg) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof upg) {
            return this.a == ((upg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
