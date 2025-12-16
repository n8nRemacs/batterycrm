package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c {

    public interface a {
        void a(Boolean bool);
    }

    public static class b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        a f363929a;

        /* renamed from: b, reason: collision with root package name */
        String f363930b;

        public b(a aVar) {
            this.f363929a = aVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            Cursor cursorQuery = null;
            boolean z12 = false;
            try {
                try {
                    cursorQuery = com.huawei.updatesdk.a.b.a.a.c().a().getContentResolver().query(Uri.parse(this.f363930b), null, null, null, null);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "cursor == null");
                    } else {
                        boolean zBooleanValue = Boolean.valueOf(cursorQuery.getString(cursorQuery.getColumnIndex("isagree"))).booleanValue();
                        boolean zBooleanValue2 = Boolean.valueOf(cursorQuery.getString(cursorQuery.getColumnIndex("isopenautoupdate"))).booleanValue();
                        boolean zBooleanValue3 = Boolean.valueOf(cursorQuery.getString(cursorQuery.getColumnIndex("isneverreminder"))).booleanValue();
                        if (zBooleanValue && !zBooleanValue2 && !zBooleanValue3) {
                            z12 = true;
                        }
                    }
                } catch (Exception e12) {
                    com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "close cursor error: " + e12.toString());
                    if (0 != 0) {
                    }
                }
                return Boolean.valueOf(z12);
            } finally {
                if (0 != 0) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                        com.huawei.updatesdk.a.a.c.a.a.a.b("AutoUpdateUtil", "cursor Execption");
                    }
                }
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            a aVar = this.f363929a;
            if (aVar != null) {
                aVar.a(bool);
            }
        }

        public void a(String str) {
            this.f363930b = str;
        }
    }

    public void a(Context context, String str, a aVar, boolean z12) {
        if (com.huawei.updatesdk.b.e.f.a(z12).c(context) && f.e().d()) {
            Locale locale = Locale.ROOT;
            String strK = AK.c.k("content://", str, ".commondata/item/4");
            if (com.huawei.updatesdk.b.h.d.a(context, Uri.parse(strK), str)) {
                b bVar = new b(aVar);
                try {
                    bVar.a(strK);
                    bVar.executeOnExecutor(com.huawei.updatesdk.b.g.c.f363854a, new Void[0]);
                    bVar.get(500L, TimeUnit.MILLISECONDS);
                    return;
                } catch (Exception e12) {
                    bVar.cancel(true);
                    com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "init AutoUpdateInfo error: " + e12.toString());
                    aVar.a(Boolean.FALSE);
                    return;
                }
            }
        }
        aVar.a(Boolean.FALSE);
    }
}
