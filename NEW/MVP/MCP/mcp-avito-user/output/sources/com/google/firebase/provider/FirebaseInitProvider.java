package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.g;
import com.google.firebase.o;
import j.N;
import j.P;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    @P
    public static final o f361950b = o.d();

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final AtomicBoolean f361951c = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        C36729v.k(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
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
        AtomicBoolean atomicBoolean = f361951c;
        try {
            atomicBoolean.set(true);
            g.g(getContext());
            return false;
        } finally {
            atomicBoolean.set(false);
        }
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
