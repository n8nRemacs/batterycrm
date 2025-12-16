package defpackage;

/* loaded from: classes2.dex */
public final class wh2 extends sj0 {
    public final String b;
    public final long c;
    public final int d;

    public wh2(int i, long j, long j2, String str) {
        super(j);
        this.b = str;
        this.c = j2;
        this.d = i;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "ChatJoinEvent{link='" + this.b + "', chatId=" + this.c + ", type=" + wy1.y(this.d) + '}' + super.toString();
    }
}
