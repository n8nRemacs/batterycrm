package defpackage;

/* loaded from: classes2.dex */
public final class rcd {
    public final long a;
    public final qcd b;
    public final String c;

    public rcd(long j, qcd qcdVar, String str) {
        this.a = j;
        this.b = qcdVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rcd a(defpackage.tm9 r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcd.a(tm9):rcd");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcd)) {
            return false;
        }
        rcd rcdVar = (rcd) obj;
        return this.a == rcdVar.a && this.b == rcdVar.b && fni.a(this.c, rcdVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        return ctd.j(sb, ", value=", this.c, ")");
    }
}
