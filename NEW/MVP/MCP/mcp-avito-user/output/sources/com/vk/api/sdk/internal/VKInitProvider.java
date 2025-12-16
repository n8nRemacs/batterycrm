package com.vk.api.sdk.internal;

import Y61.k;
import Y61.l;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vk.api.sdk.C37878d;
import kotlin.Metadata;

/* compiled from: VKInitProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/internal/VKInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class VKInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@k Uri uri, @l String str, @l String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @l
    public final String getType(@k Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @l
    public final Uri insert(@k Uri uri, @l ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            C37878d.b(getContext());
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    @l
    public final Cursor query(@k Uri uri, @l String[] strArr, @l String str, @l String[] strArr2, @l String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@k Uri uri, @l ContentValues contentValues, @l String str, @l String[] strArr) {
        return 0;
    }
}
