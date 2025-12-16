package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hka extends l0g {
    public final List X;
    public final long c;
    public final long d;
    public final int o;

    public hka(long j, long j2, int i, List list) {
        this.c = j;
        this.d = j2;
        this.o = i;
        this.X = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hka e(defpackage.tm9 r21) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.e(tm9):hka");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hka)) {
            return false;
        }
        hka hkaVar = (hka) obj;
        return this.c == hkaVar.c && this.d == hkaVar.d && this.o == hkaVar.o && fni.a(this.X, hkaVar.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + xrf.k(this.o, a9h.a(Long.hashCode(this.c) * 31, 31, this.d), 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        int size = this.X.size();
        StringBuilder sbL = az1.l(this.c, "{chatId=", ", messageId=");
        utb.n(sbL, this.d, ", totalCount=", this.o);
        sbL.append(", counters count=");
        sbL.append(size);
        sbL.append(" }");
        return sbL.toString();
    }
}
