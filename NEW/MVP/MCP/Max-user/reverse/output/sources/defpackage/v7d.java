package defpackage;

/* loaded from: classes.dex */
public final class v7d {
    public final int a;
    public final Integer b;
    public final boolean c;

    public v7d(int i, Integer num, boolean z) {
        this.a = i;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7d)) {
            return false;
        }
        v7d v7dVar = (v7d) obj;
        return this.a == v7dVar.a && this.b.equals(v7dVar.b) && this.c == v7dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((s7d.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RateCallButtonData(id=" + this.a + ", size=" + s7d.b + ", icon=" + this.b + ", isEnabled=" + this.c + ")";
    }
}
