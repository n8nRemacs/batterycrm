package defpackage;

/* loaded from: classes.dex */
public abstract class mbj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            java.lang.String r1 = "getDataColumn: _data - ["
            java.lang.String r0 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r8 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L39
            r7 = 0
            r3 = r10
            r5 = r11
            r6 = r12
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L39
            if (r9 == 0) goto L30
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2d
            if (r10 == 0) goto L30
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2d
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2d
            r9.close()
            return r10
        L29:
            r0 = move-exception
            r10 = r0
            r8 = r9
            goto L5f
        L2d:
            r0 = move-exception
            r10 = r0
            goto L3c
        L30:
            if (r9 == 0) goto L5e
            r9.close()
            return r8
        L36:
            r0 = move-exception
            r10 = r0
            goto L5f
        L39:
            r0 = move-exception
            r10 = r0
            r9 = r8
        L3c:
            java.lang.String r11 = "FileUtils"
            java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L29
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r12.append(r10)     // Catch: java.lang.Throwable -> L29
            java.lang.String r10 = "]"
            r12.append(r10)     // Catch: java.lang.Throwable -> L29
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> L29
            android.util.Log.i(r11, r10)     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L5e
            r9.close()
        L5e:
            return r8
        L5f:
            if (r8 == 0) goto L64
            r8.close()
        L64:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbj.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static final void b(esg esgVar) {
        esgVar.b(1, new a4e(18));
        esgVar.d(584, new b4e(15));
        esgVar.d(585, new b4e(16));
    }
}
