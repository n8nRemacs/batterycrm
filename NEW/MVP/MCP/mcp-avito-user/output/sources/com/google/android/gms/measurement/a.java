package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.measurement.internal.I2;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@Deprecated
/* loaded from: classes6.dex */
public class a extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@N Uri uri, @P String str, @N String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @P
    public final String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public final Uri insert(@N Uri uri, @N ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        C36729v.j(context);
        I2.a(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @P
    public final Cursor query(@N Uri uri, @N String[] strArr, @P String str, @N String[] strArr2, @P String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@N Uri uri, @P ContentValues contentValues, @P String str, @N String[] strArr) {
        return 0;
    }
}
