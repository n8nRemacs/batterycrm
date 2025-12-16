package defpackage;

/* loaded from: classes2.dex */
public final class z4a extends sj0 {
    public final long b;
    public final long[] c;
    public final sz d;
    public final long[] o;

    public z4a(long j, long j2, long[] jArr, sz szVar, long[] jArr2) {
        super(j);
        this.b = j2;
        this.c = jArr;
        this.d = szVar;
        this.o = jArr2;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "MsgGetEvent{serverChatId=" + this.b + ", serverMessageIds=" + this.c + ", messages=" + this.d + ", requestedMessageIds=" + this.o + "}";
    }
}
