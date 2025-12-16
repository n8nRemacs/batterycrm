package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class yia extends l0g {
    public final long c;
    public final List d;
    public final long o;

    public yia(long j, long j2, List list) {
        this.c = j;
        this.d = list;
        this.o = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yia)) {
            return false;
        }
        yia yiaVar = (yia) obj;
        return s65.e(this.c, yiaVar.c) && fni.a(this.d, yiaVar.d) && this.o == yiaVar.o;
    }

    public final int hashCode() {
        int i = s65.d;
        return Long.hashCode(this.o) + xrf.l(this.d, Long.hashCode(this.c) * 31, 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        String strN = s65.n(this.c);
        StringBuilder sb = new StringBuilder("Response(showTime=");
        sb.append(strN);
        sb.append(", banners=");
        sb.append(this.d);
        sb.append(", updateTime=");
        return ho7.k(sb, this.o, ")");
    }
}
