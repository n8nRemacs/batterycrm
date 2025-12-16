package defpackage;

/* loaded from: classes2.dex */
public final class b50 extends sj0 {
    public final long b;
    public final int c;
    public final long d;

    public b50(int i, long j, long j2) {
        this.c = i;
        this.b = j;
        this.d = j2;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaybackEvent{type=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", chatId=");
        return utb.l(sb, this.d, '}');
    }
}
