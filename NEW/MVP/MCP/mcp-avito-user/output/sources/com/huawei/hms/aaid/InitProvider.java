package com.huawei.hms.aaid;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hms.support.log.HMSLog;
import y01.l;
import y01.n;

/* loaded from: classes7.dex */
public class InitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zB2;
        Context context = getContext();
        try {
            n nVarG = n.g(context);
            if (nVarG.a("push_kit_auto_init_enabled")) {
                zB2 = nVarG.b("push_kit_auto_init_enabled");
            } else {
                try {
                    zB2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("push_kit_auto_init_enabled");
                } catch (PackageManager.NameNotFoundException unused) {
                    zB2 = false;
                }
            }
            if (zB2) {
                HMSLog.i("AutoInit", "Push init start");
                l lVar = new l();
                lVar.f442824b = context;
                new Thread(lVar).start();
            }
        } catch (Exception e12) {
            HMSLog.e("AutoInit", "Push init failed", e12);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
