package com.vk.api.sdk.browser;

/* compiled from: DelimitedVersion.java */
/* loaded from: classes7.dex */
public class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f366535b;

    public e(long[] jArr) {
        this.f366535b = jArr;
    }

    public static e b(String str) {
        String[] strArrSplit = str.split("[^0-9]+");
        long[] jArr = new long[strArrSplit.length];
        int i12 = 0;
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                jArr[i12] = Long.parseLong(str2);
                i12++;
            }
        }
        do {
            i12--;
            if (i12 < 0) {
                break;
            }
        } while (jArr[i12] <= 0);
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        System.arraycopy(jArr, 0, jArr2, 0, i13);
        return new e(jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        r1 = r2.length;
        r6 = r9.f366535b.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r1 >= r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r1 <= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return 0;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(@j.N com.vk.api.sdk.browser.e r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            long[] r2 = r8.f366535b
            int r3 = r2.length
            r4 = -1
            r5 = 1
            if (r1 >= r3) goto L22
            long[] r3 = r9.f366535b
            int r6 = r3.length
            if (r1 >= r6) goto L22
            r6 = r2[r1]
            r2 = r3[r1]
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L1c
        L17:
            if (r2 <= 0) goto L1b
            r4 = r5
            goto L1c
        L1b:
            r4 = r0
        L1c:
            if (r4 == 0) goto L1f
            return r4
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            int r1 = r2.length
            long r1 = (long) r1
            long[] r9 = r9.f366535b
            int r9 = r9.length
            long r6 = (long) r9
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 >= 0) goto L2e
            r0 = r4
            goto L31
        L2e:
            if (r9 <= 0) goto L31
            r0 = r5
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.browser.e.compareTo(com.vk.api.sdk.browser.e):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public final int hashCode() {
        int i12 = 0;
        for (long j12 : this.f366535b) {
            i12 = (i12 * 92821) + ((int) j12);
        }
        return i12;
    }

    public final String toString() {
        long[] jArr = this.f366535b;
        if (jArr.length == 0) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jArr[0]);
        for (int i12 = 1; i12 < jArr.length; i12++) {
            sb2.append('.');
            sb2.append(jArr[i12]);
        }
        return sb2.toString();
    }
}
