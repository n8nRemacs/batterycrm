package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ds2 extends sj0 {
    public final String b;
    public final List c;
    public final long d;
    public final int o;

    public ds2(long j, String str, List list, long j2, int i) {
        super(j);
        this.b = str;
        this.c = list;
        this.d = j2;
        this.o = i;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageSearchResultEvent{query='");
        sb.append(this.b);
        sb.append("', results=");
        sb.append(this.c);
        sb.append(", marker=");
        sb.append(this.d);
        sb.append(", total=");
        return xc0.h(sb, this.o, '}');
    }
}
