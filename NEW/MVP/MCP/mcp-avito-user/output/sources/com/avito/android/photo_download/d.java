package com.avito.android.photo_download;

import Y61.k;
import Y61.l;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PhotoDownloadManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_download/d;", "", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {
    @l
    Object a(@k Uri uri, @k Continuation<? super com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends Uri>> continuation);
}
