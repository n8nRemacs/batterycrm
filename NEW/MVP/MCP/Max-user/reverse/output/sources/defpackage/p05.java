package defpackage;

/* loaded from: classes2.dex */
public final class p05 extends sj0 {
    public final String b;
    public final String c;
    public final String d;
    public final long o;

    public p05(long j, long j2, String str, String str2, String str3) {
        super(j);
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? "" : str3;
        this.o = j2;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleteEvent{url='");
        sb.append(this.b);
        sb.append("', path='");
        sb.append(this.c);
        sb.append("', attachLocalId='");
        sb.append(this.d);
        sb.append("', messageId=");
        return utb.l(sb, this.o, '}');
    }
}
