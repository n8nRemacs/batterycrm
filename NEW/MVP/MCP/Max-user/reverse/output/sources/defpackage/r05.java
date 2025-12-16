package defpackage;

/* loaded from: classes2.dex */
public final class r05 extends sj0 {
    public final String b;
    public final String c;
    public final long d;

    public r05(long j, long j2, String str, String str2) {
        super(j);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.d = j2;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadErrorEvent{url='");
        sb.append(this.b);
        sb.append("', attachLocalId='");
        return ho7.l(sb, this.c, "'}");
    }
}
