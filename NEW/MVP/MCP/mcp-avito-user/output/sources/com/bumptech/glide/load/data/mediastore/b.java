package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

/* compiled from: MediaStoreUtil.java */
/* loaded from: classes5.dex */
public final class b {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
