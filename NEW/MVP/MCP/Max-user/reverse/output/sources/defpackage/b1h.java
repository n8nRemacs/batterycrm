package defpackage;

/* loaded from: classes2.dex */
public final class b1h implements c1h {
    public final long a;
    public final b5h b;

    public b1h(long j, b5h b5hVar) {
        this.a = j;
        this.b = b5hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1h)) {
            return false;
        }
        b1h b1hVar = (b1h) obj;
        return this.a == b1hVar.a && fni.a(this.b, b1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StartVideoMessage(msgId=" + this.a + ", attachModel=" + this.b + ")";
    }
}
