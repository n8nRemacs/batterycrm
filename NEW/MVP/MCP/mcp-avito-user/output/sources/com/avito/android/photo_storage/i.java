package com.avito.android.photo_storage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: PrivatePhotosStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_storage/i;", "", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface i {

    /* compiled from: PrivatePhotosStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.k ArrayList arrayList);

    @Y61.k
    File b(@Y61.l String str);

    void c(@Y61.k File file);

    boolean d(@Y61.k Uri uri);
}
