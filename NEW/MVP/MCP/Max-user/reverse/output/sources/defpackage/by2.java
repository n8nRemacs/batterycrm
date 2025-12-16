package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class by2 extends l0g {
    public final List c;
    public final boolean d;
    public final Long o;

    public by2(Long l, List list, boolean z) {
        this.c = list;
        this.d = z;
        this.o = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.by2 e(defpackage.tm9 r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by2.e(tm9):by2");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return fni.a(this.c, by2Var.c) && this.d == by2Var.d && fni.a(this.o, by2Var.o);
    }

    public final int hashCode() {
        int iB = a9h.b(this.c.hashCode() * 31, 31, this.d);
        Long l = this.o;
        return iB + (l == null ? 0 : l.hashCode());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.d + ", marker=" + this.o + ")";
    }
}
