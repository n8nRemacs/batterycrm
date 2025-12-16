package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.ha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38850ha implements R7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38823g8 f380688a;

    public C38850ha(@j.N InterfaceC38823g8 interfaceC38823g8, @j.N String str) {
        this.f380688a = interfaceC38823g8;
    }

    @Override // com.yandex.metrica.impl.ob.R7
    public void a(@j.N String str, @j.N byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f380688a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseA.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    this.f380688a.a(sQLiteDatabaseA);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f380688a.a(sQLiteDatabaseA);
    }

    @Override // com.yandex.metrica.impl.ob.R7
    public void b(@j.N String str) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f380688a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseA.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f380688a.a(sQLiteDatabaseA);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:8:0x001c, B:10:0x0023, B:12:0x0029, B:16:0x003e), top: B:28:0x001c }] */
    @Override // com.yandex.metrica.impl.ob.R7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a(@j.N java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            com.yandex.metrica.impl.ob.g8 r1 = r10.f380688a     // Catch: java.lang.Throwable -> L44
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L42
            java.lang.String r3 = "binary_data"
            java.lang.String r5 = "data_key = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L42
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            r2 = r1
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L3c
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L46
            r3 = 1
            if (r2 != r3) goto L3c
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3c
            java.lang.String r2 = "value"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L46
            byte[] r0 = r11.getBlob(r2)     // Catch: java.lang.Throwable -> L46
            com.yandex.metrica.impl.ob.A2.a(r11)
            com.yandex.metrica.impl.ob.g8 r11 = r10.f380688a
            r11.a(r1)
            return r0
        L3c:
            if (r11 == 0) goto L46
            r11.getCount()     // Catch: java.lang.Throwable -> L46
            goto L46
        L42:
            r11 = r0
            goto L46
        L44:
            r11 = r0
            r1 = r11
        L46:
            com.yandex.metrica.impl.ob.A2.a(r11)
            com.yandex.metrica.impl.ob.g8 r11 = r10.f380688a
            r11.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38850ha.a(java.lang.String):byte[]");
    }
}
