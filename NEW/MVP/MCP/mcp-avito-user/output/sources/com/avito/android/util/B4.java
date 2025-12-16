package com.avito.android.util;

import android.content.res.Resources;
import android.net.Uri;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: Resources.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B4 {
    @Y61.k
    public static final Uri a(@Y61.k Resources resources, @InterfaceC42165v int i12) {
        return new Uri.Builder().scheme("android.resource").encodedAuthority(resources.getResourcePackageName(i12)).appendPath(resources.getResourceTypeName(i12)).appendPath(resources.getResourceEntryName(i12)).build();
    }
}
