package org.joda.time.base;

import org.joda.time.J;

/* compiled from: AbstractDuration.java */
/* loaded from: classes7.dex */
public abstract class b implements J {
    @Override // java.lang.Comparable
    public final int compareTo(J j12) {
        long millis = j12.getMillis();
        if (0 < millis) {
            return -1;
        }
        return 0 > millis ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && 0 == ((J) obj).getMillis();
    }

    public final int hashCode() {
        return (int) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0026 -> B:12:0x001f). Please report as a decompilation issue!!! */
    @org.joda.convert.ToString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "PT"
            r0.append(r1)
            int r1 = org.joda.time.format.i.f420790b
            r1 = 0
            int r3 = (int) r1
            long r4 = (long) r3
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L18
            org.joda.time.format.i.c(r0, r3)     // Catch: java.io.IOException -> L1f
            goto L1f
        L18:
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch: java.io.IOException -> L1f
            r0.append(r1)     // Catch: java.io.IOException -> L1f
        L1f:
            int r1 = r0.length()
            r2 = 6
            if (r1 >= r2) goto L2d
            r1 = 2
            java.lang.String r2 = "0"
            r0.insert(r1, r2)
            goto L1f
        L2d:
            int r1 = r0.length()
            int r1 = r1 + (-3)
            r0.setLength(r1)
            r1 = 83
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.base.b.toString():java.lang.String");
    }
}
