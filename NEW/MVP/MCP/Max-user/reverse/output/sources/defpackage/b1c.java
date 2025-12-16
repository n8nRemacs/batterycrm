package defpackage;

/* loaded from: classes2.dex */
public final class b1c implements c1c {
    public final long a;
    public final n5g b;
    public final r5g c;
    public final boolean d;

    public b1c(long j, n5g n5gVar, r5g r5gVar, boolean z) {
        this.a = j;
        this.b = n5gVar;
        this.c = r5gVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1c)) {
            return false;
        }
        b1c b1cVar = (b1c) obj;
        return this.a == b1cVar.a && this.b.equals(b1cVar.b) && this.c.equals(b1cVar.c) && this.d == b1cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + xrf.k(this.b.c, Long.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "State(messageId=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", canClose=" + this.d + ")";
    }
}
