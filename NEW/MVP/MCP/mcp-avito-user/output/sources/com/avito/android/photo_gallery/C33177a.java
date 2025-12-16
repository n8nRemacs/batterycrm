package com.avito.android.photo_gallery;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C33177a extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.photo_gallery.adapter.b bVar = ((GalleryFragment) this.receiver).f216491K0;
        if (bVar != null) {
            com.avito.android.photo_gallery.adapter.a aVar = bVar.f216712a;
            Integer num = aVar.f216686B;
            int i12 = bVar.f216713b;
            if (num != null && i12 == num.intValue()) {
                GalleryFragment galleryFragment = bVar.f216714c;
                if (galleryFragment.f216489I0 != null) {
                    D6.w(galleryFragment.f216502n0);
                    D6.H(galleryFragment.f216489I0);
                }
                aVar.f216686B = null;
            }
            aVar.f216692m.l();
            aVar.f216703x.invoke(Integer.valueOf(i12));
        }
        return G0.f406611a;
    }
}
