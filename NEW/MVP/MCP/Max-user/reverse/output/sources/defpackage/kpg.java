package defpackage;

/* loaded from: classes.dex */
public final class kpg implements Comparable {
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fni.b(this.a ^ Integer.MIN_VALUE, ((kpg) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kpg) {
            return this.a == ((kpg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 4294967295L);
    }
}
