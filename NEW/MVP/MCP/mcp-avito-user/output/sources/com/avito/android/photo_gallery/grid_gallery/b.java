package com.avito.android.photo_gallery.grid_gallery;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertGridGalleryPositionStore.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/b;", "Lcom/avito/android/photo_gallery/grid_gallery/a;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC33188a {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f217148a;

    @Inject
    public b() {
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.InterfaceC33188a
    public final void a(int i12) {
        this.f217148a = i12;
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.InterfaceC33188a
    /* renamed from: getPosition, reason: from getter */
    public final int getF217148a() {
        return this.f217148a;
    }
}
