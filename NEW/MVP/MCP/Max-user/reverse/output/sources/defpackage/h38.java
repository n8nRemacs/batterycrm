package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h38 {
    public static final hl4 b = new hl4("LibraryVersion", "", 1);
    public static final h38 c = new h38();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "LibraryVersion"
            hl4 r1 = defpackage.h38.b
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.lang.String r3 = "/"
            java.lang.String r4 = "Please provide a valid libraryName"
            defpackage.s5j.d(r11, r4)
            java.util.concurrent.ConcurrentHashMap r4 = r10.a
            boolean r5 = r4.containsKey(r11)
            if (r5 == 0) goto L1c
            java.lang.Object r11 = r4.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1c:
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            r7.<init>(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            r7.append(r11)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.String r3 = ".properties"
            r7.append(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.String r3 = r7.toString()     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.Class<h38> r7 = defpackage.h38.class
            java.io.InputStream r3 = r7.getResourceAsStream(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            if (r3 == 0) goto L70
            r5.load(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = "version"
            java.lang.String r6 = r5.getProperty(r7, r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = " version is "
            r5.append(r7)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.b     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto La7
            java.lang.String r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.v(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            goto La7
        L69:
            r11 = move-exception
            goto L8d
        L6b:
            r5 = move-exception
            r9 = r6
            r6 = r3
            r3 = r9
            goto L95
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.b     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto La7
            java.lang.String r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            goto La7
        L8d:
            r6 = r3
            goto Lc6
        L8f:
            r3 = move-exception
            r5 = r3
            goto L94
        L92:
            r11 = move-exception
            goto Lc6
        L94:
            r3 = r6
        L95:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L92
            r7.append(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L92
            r1.a(r0, r2, r5)     // Catch: java.lang.Throwable -> L92
            r9 = r6
            r6 = r3
            r3 = r9
        La7:
            if (r3 == 0) goto Lac
            defpackage.efi.a(r3)
        Lac:
            if (r6 != 0) goto Lc2
            r2 = 3
            java.lang.String r3 = r1.b
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto Lc0
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r1.b(r2)
            android.util.Log.d(r0, r1)
        Lc0:
            java.lang.String r6 = "UNKNOWN"
        Lc2:
            r4.put(r11, r6)
            return r6
        Lc6:
            if (r6 == 0) goto Lcb
            defpackage.efi.a(r6)
        Lcb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h38.a(java.lang.String):java.lang.String");
    }
}
