package com.avito.android.util;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;

/* compiled from: ContentProviderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/k0;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC35827k0 {
    @Y61.l
    Cursor a(@Y61.k Uri uri, @Y61.l String[] strArr, @Y61.l String str, @Y61.l String[] strArr2, @Y61.l String str2);

    @Y61.l
    Uri b(@Y61.k Uri uri, @Y61.l ContentValues contentValues);

    int c(@Y61.k Uri uri, @Y61.l ContentValues contentValues, @Y61.l String str, @Y61.l String[] strArr);

    int d(@Y61.k Uri uri, @Y61.l String str, @Y61.l String[] strArr);

    @Y61.l
    String e(@Y61.k Uri uri);
}
