package com.my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f;
import e11.m2;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class MyTargetContentProvider extends ContentProvider {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f364774c = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f364775b = true;

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return;
        }
        if ("com.my.target.mytargetcontentprovider".equals(providerInfo.authority)) {
            this.f364775b = false;
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
        if (!this.f364775b) {
            return false;
        }
        m2.a(new f(this, 26));
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
