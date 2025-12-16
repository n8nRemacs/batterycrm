package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: SQLiteDatabases.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class X4 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    @android.annotation.SuppressLint({"Recycle"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.k android.database.sqlite.SQLiteDatabase r2, @Y61.k java.lang.String r3, @Y61.k java.lang.String r4) throws java.lang.Throwable {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " LIMIT 0"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            android.database.Cursor r2 = r2.rawQuery(r3, r0)
            r3 = 1
            r0 = 0
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r1 = -1
            if (r4 == r1) goto L22
            goto L23
        L22:
            r3 = r0
        L23:
            r2.close()
            return r3
        L27:
            r3 = move-exception
            goto L33
        L29:
            r4 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L32
            goto L32
        L2e:
            r4 = move-exception
            r0 = r3
            r3 = r4
            goto L33
        L32:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L33:
            if (r0 != 0) goto L38
            r2.close()
        L38:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.X4.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }
}
