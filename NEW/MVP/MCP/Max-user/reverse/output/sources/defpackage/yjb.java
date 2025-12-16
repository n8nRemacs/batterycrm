package defpackage;

/* loaded from: classes2.dex */
public final class yjb {
    public final int a;
    public final long b;
    public final long c;

    public yjb(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutgoingMessageLink{type=");
        sb.append(vb9.j(this.a));
        sb.append(", chatId=");
        sb.append(this.b);
        return u45.i(this.c, ", messageId=", "}", sb);
    }
}
