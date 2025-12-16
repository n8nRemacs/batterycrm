package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class no4 {
    public final kce a;
    public final int b;

    public no4(kce kceVar, int i) {
        this.a = kceVar;
        this.b = i;
    }

    public final String a(String str) {
        String str2;
        int i = this.b;
        if (i == 1) {
            str2 = "lottie_cache";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "webm_cache";
        }
        return u45.k(str2, "_", Pattern.compile("\\W+").matcher(str).replaceAll(""));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wca b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            kce r1 = r5.a     // Catch: java.lang.Exception -> L54
            java.io.File r1 = r1.D()     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = r5.a(r6)     // Catch: java.lang.Exception -> L54
            mo4 r2 = new mo4     // Catch: java.lang.Exception -> L54
            r2.<init>()     // Catch: java.lang.Exception -> L54
            java.io.File[] r1 = r1.listFiles(r2)     // Catch: java.lang.Exception -> L54
            if (r1 == 0) goto L54
            int r2 = r1.length     // Catch: java.lang.Exception -> L54
            if (r2 != 0) goto L1a
            goto L54
        L1a:
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L54
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> L54
            if (r3 == 0) goto L4d
            int r4 = r3.length()     // Catch: java.lang.Exception -> L54
            if (r4 != 0) goto L2a
            goto L4d
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            r4.<init>()     // Catch: java.lang.Exception -> L54
            r4.append(r6)     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = "_origname_"
            r4.append(r6)     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L54
            r4 = 6
            int r2 = defpackage.vmf.D(r3, r6, r2, r2, r4)     // Catch: java.lang.Exception -> L54
            r4 = -1
            if (r2 == r4) goto L4d
            int r6 = r6.length()     // Catch: java.lang.Exception -> L54
            int r2 = r2 + r6
            java.lang.String r6 = r3.substring(r2)     // Catch: java.lang.Exception -> L54
            goto L4e
        L4d:
            r6 = r0
        L4e:
            wca r2 = new wca     // Catch: java.lang.Exception -> L54
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L54
            return r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no4.b(java.lang.String):wca");
    }

    public final File c(String str, String str2) {
        String str3;
        File fileD = this.a.D();
        String strA = a(str);
        if (str2 == null || str2.length() == 0) {
            int i = this.b;
            if (i == 1) {
                str2 = "json";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "webm";
            }
            str3 = ".";
        } else {
            str3 = "_origname_";
        }
        return new File(fileD, az1.i(strA, str3.concat(str2)));
    }
}
