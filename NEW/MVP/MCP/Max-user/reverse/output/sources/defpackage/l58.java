package defpackage;

/* loaded from: classes2.dex */
public final class l58 extends sj0 {
    public final d2h X;
    public final Long Y;
    public final String Z;
    public final Long b;
    public final long c;
    public final r04 d;
    public final fz6 o;

    public l58(long j, Long l, long j2, r04 r04Var, fz6 fz6Var, d2h d2hVar, Long l2, String str) {
        super(j);
        this.b = l;
        this.c = j2;
        this.d = r04Var;
        this.o = fz6Var;
        this.X = d2hVar;
        this.Y = l2;
        this.Z = str;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.d);
        sb.append(", groupChatInfo=");
        sb.append(this.o);
        sb.append(", videoConference=");
        sb.append(this.X);
        sb.append(", stickerSetId=");
        sb.append(this.Y);
        sb.append(", startPayload='");
        return ho7.l(sb, this.Z, "'}");
    }
}
