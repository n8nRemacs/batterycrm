package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class yah extends sj0 {
    public final Map b;
    public final long c;
    public final long d;
    public final String o;

    public yah(long j, long j2, long j3, String str, Map map) {
        super(j);
        this.b = map;
        this.c = j2;
        this.d = j3;
        this.o = str;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayEvent{urls=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.d);
        sb.append(", attachLocalId='");
        return ho7.l(sb, this.o, "'}");
    }
}
