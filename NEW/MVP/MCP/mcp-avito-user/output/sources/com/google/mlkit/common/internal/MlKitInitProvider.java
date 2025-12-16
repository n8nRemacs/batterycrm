package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37029l;
import com.google.firebase.components.b;
import com.google.firebase.components.e;
import com.google.firebase.components.l;
import com.google.mlkit.common.sdkinternal.C37642k;
import j.N;
import j.P;
import java.util.ArrayList;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        C36729v.l("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@N Uri uri, @P String str, @P String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @P
    public final String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public final Uri insert(@N Uri uri, @P ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        synchronized (C37642k.f362338b) {
            C36729v.l("MlKitContext is already initialized", C37642k.f362339c == null);
            C37642k c37642k = new C37642k();
            C37642k.f362339c = c37642k;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListA = e.b(context, MlKitComponentDiscoveryService.class).a();
            l.b bVar = new l.b(C37029l.f355673a);
            bVar.f360761b.addAll(arrayListA);
            bVar.a(b.c(context, Context.class, new Class[0]));
            bVar.a(b.c(c37642k, C37642k.class, new Class[0]));
            l lVar = new l(bVar.f360760a, bVar.f360761b, bVar.f360762c, bVar.f360763d, null);
            c37642k.f362340a = lVar;
            lVar.k(true);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    @P
    public final Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@N Uri uri, @P ContentValues contentValues, @P String str, @P String[] strArr) {
        return 0;
    }
}
