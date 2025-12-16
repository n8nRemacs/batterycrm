package com.avito.android.photo_picker.legacy.provider;

import Y61.k;
import android.net.Uri;
import com.avito.android.photo_picker.legacy.provider.PhotoContentProvider;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoContentUriProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/provider/b;", "Lcom/avito/android/photo_cache/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.photo_cache.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f219840a;

    @Inject
    public b(@k C c12) {
        this.f219840a = c12;
    }

    @Override // com.avito.android.photo_cache.a
    @k
    public final Uri a() {
        PhotoContentProvider.a aVar = PhotoContentProvider.f219834c;
        String strN = this.f219840a.n();
        aVar.getClass();
        return Uri.parse("content://" + strN.concat(".provider.photo"));
    }
}
