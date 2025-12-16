package defpackage;

/* loaded from: classes2.dex */
public final class c9i {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public c9i(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return u45.l(sb, this.a, '}');
    }
}
