package defpackage;

/* loaded from: classes.dex */
public final class ppg implements Comparable {
    public final long a;

    public /* synthetic */ ppg(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fni.c(this.a ^ Long.MIN_VALUE, ((ppg) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ppg) {
            return this.a == ((ppg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wni.c(10, this.a);
    }
}
