package com.yandex.mobile.ads.impl;

import okio.C44805o;

/* loaded from: classes8.dex */
public final class t00 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t00 f390046a = new t00();

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f390047b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final String[] f390048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private static final String[] f390049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private static final String[] f390050e;

    static {
        C44805o.f420139e.getClass();
        f390047b = C44805o.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f390048c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f390049d = new String[64];
        String[] strArr = new String[256];
        for (int i12 = 0; i12 < 256; i12++) {
            strArr[i12] = qc1.a("%8s", Integer.toBinaryString(i12)).replace(' ', '0');
        }
        f390050e = strArr;
        String[] strArr2 = f390049d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i13 = iArr[0];
        strArr2[i13 | 8] = AK.c.s(new StringBuilder(), strArr2[i13], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            int i16 = iArr[0];
            String[] strArr3 = f390049d;
            int i17 = i16 | i15;
            strArr3[i17] = strArr3[i16] + '|' + strArr3[i15];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i16]);
            sb2.append('|');
            strArr3[i17 | 8] = AK.c.s(sb2, strArr3[i15], "|PADDED");
        }
        int length = f390049d.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr4 = f390049d;
            if (strArr4[i18] == null) {
                strArr4[i18] = f390050e[i18];
            }
        }
    }

    private t00() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String r0 = a(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L59
        L9:
            r1 = 2
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4a
            r1 = 6
            if (r7 == r1) goto L4a
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = com.yandex.mobile.ads.impl.t00.f390049d
            int r2 = r1.length
            if (r8 >= r2) goto L24
            r1 = r1[r8]
            goto L28
        L24:
            java.lang.String[] r1 = com.yandex.mobile.ads.impl.t00.f390050e
            r1 = r1[r8]
        L28:
            r2 = 5
            r3 = 0
            if (r7 != r2) goto L39
            r2 = r8 & 4
            if (r2 == 0) goto L39
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = kotlin.text.C43066x.a0(r1, r7, r8, r3)
            goto L59
        L39:
            if (r7 != 0) goto L48
            r7 = r8 & 32
            if (r7 == 0) goto L48
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = kotlin.text.C43066x.a0(r1, r7, r8, r3)
            goto L59
        L48:
            r7 = r1
            goto L59
        L4a:
            r7 = 1
            if (r8 != r7) goto L50
            java.lang.String r7 = "ACK"
            goto L59
        L50:
            java.lang.String[] r7 = com.yandex.mobile.ads.impl.t00.f390050e
            r7 = r7[r8]
            goto L59
        L55:
            java.lang.String[] r7 = com.yandex.mobile.ads.impl.t00.f390050e
            r7 = r7[r8]
        L59:
            if (r4 == 0) goto L5e
            java.lang.String r4 = "<<"
            goto L60
        L5e:
            java.lang.String r4 = ">>"
        L60:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = com.yandex.mobile.ads.impl.qc1.a(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t00.a(boolean, int, int, int, int):java.lang.String");
    }

    @Y61.k
    public static String a(int i12) {
        String[] strArr = f390048c;
        return i12 < strArr.length ? strArr[i12] : qc1.a("0x%02x", Integer.valueOf(i12));
    }
}
