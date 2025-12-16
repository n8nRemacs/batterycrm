package com.avito.android.photo_gallery;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C33179c extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        GalleryFragment galleryFragment = (GalleryFragment) this.receiver;
        if (!galleryFragment.f216492L0) {
            com.avito.android.photo_gallery.adapter.b bVar = galleryFragment.f216491K0;
            if (bVar != null) {
                bVar.f216712a.f216705z.invoke();
            }
            galleryFragment.f216492L0 = true;
        }
        return G0.f406611a;
    }
}
