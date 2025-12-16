package com.avito.android.gallery.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.di.C;
import com.avito.android.gallery.ui.PhotoGalleryActivity;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: GalleryScreenComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gallery/di/c;", "", "a", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@B
@C
/* loaded from: classes13.dex */
public interface c {

    /* compiled from: GalleryScreenComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/di/c$a;", "", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k b bVar);
    }

    void a(@k PhotoGalleryActivity photoGalleryActivity);

    void b(@k GalleryFragment galleryFragment);
}
