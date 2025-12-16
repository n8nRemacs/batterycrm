package com.huawei.updatesdk.b.e;

import android.os.AsyncTask;

/* loaded from: classes7.dex */
public class d extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private String f363846a;

    /* renamed from: b, reason: collision with root package name */
    private String f363847b;

    public d(String str, String str2) {
        this.f363846a = str;
        this.f363847b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: all -> 0x005a, Exception -> 0x005d, TRY_LEAVE, TryCatch #7 {Exception -> 0x005d, all -> 0x005a, blocks: (B:8:0x002c, B:10:0x0032, B:15:0x0062), top: B:46:0x002c }] */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.Void... r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r12 = "cursor Execption"
            java.lang.String r0 = "GetAccountZoneTask"
            java.lang.String r1 = "close cursor error: "
            java.lang.String r2 = r11.f363846a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            java.lang.String r2 = r11.f363846a
            android.net.Uri r5 = android.net.Uri.parse(r2)
            com.huawei.updatesdk.a.b.a.a r2 = com.huawei.updatesdk.a.b.a.a.c()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            android.content.Context r2 = r2.a()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r2 == 0) goto L62
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r4 == 0) goto L62
            java.lang.String r4 = "homecountry"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r3 = r2.getString(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.huawei.updatesdk.service.otaupdate.f r4 = com.huawei.updatesdk.service.otaupdate.f.e()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r4.a(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.huawei.updatesdk.b.b.a r4 = com.huawei.updatesdk.b.b.a.d()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r5 = r11.f363847b     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r4.a(r5, r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.huawei.updatesdk.b.b.a r4 = com.huawei.updatesdk.b.b.a.d()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r5 = r11.f363847b     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r4.b(r5, r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            goto L67
        L5a:
            r1 = move-exception
            r3 = r2
            goto L91
        L5d:
            r4 = move-exception
            r10 = r3
            r3 = r2
            r2 = r10
            goto L71
        L62:
            java.lang.String r4 = "cursor == null: "
            com.huawei.updatesdk.a.a.a.a(r0, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
        L67:
            if (r2 == 0) goto L90
            r2.close()     // Catch: java.lang.Exception -> L8b
            goto L90
        L6d:
            r1 = move-exception
            goto L91
        L6f:
            r4 = move-exception
            r2 = r3
        L71:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6d
            r5.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L6d
            com.huawei.updatesdk.a.a.a.a(r0, r1)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L8f
            r3.close()     // Catch: java.lang.Exception -> L8a
            goto L8f
        L8a:
            r3 = r2
        L8b:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r12)
            goto L90
        L8f:
            r3 = r2
        L90:
            return r3
        L91:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Exception -> L97
            goto L9a
        L97:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r12)
        L9a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.e.d.doInBackground(java.lang.Void[]):java.lang.String");
    }
}
