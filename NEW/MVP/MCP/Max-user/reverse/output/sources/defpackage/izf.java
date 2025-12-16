package defpackage;

/* loaded from: classes2.dex */
public final class izf {
    public final long a;
    public final long b;
    public final long c;

    public izf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawContact{tamtamContactId=");
        sb.append(this.a);
        sb.append(", rawContactId=");
        sb.append(this.b);
        sb.append(", contactId=");
        return utb.l(sb, this.c, '}');
    }
}
