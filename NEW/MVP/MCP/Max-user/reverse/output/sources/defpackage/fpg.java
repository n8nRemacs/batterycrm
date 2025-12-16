package defpackage;

/* loaded from: classes.dex */
public final class fpg implements Comparable {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return fni.b(this.a & 255, ((fpg) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fpg) {
            return this.a == ((fpg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
