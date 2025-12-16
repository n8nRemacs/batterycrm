package com.avito.android.extended_profile_widgets.adapter.gallery;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.tns_gallery.t;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/gallery/f;", "Lcom/avito/android/extended_profile_widgets/adapter/gallery/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154404b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super oB.k, G0> lVar) {
        this.f154404b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        GalleryItem galleryItem = (GalleryItem) aVar;
        hVar.GO(galleryItem.f154393d);
        t tVarZ2 = hVar.Z2();
        List<TnsGalleryImage> list = galleryItem.f154394e;
        List<TnsGalleryImage> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            tVarZ2.c();
        } else {
            tVarZ2.b(list, new d(this), new e(this, galleryItem));
            tVarZ2.a(galleryItem.f154395f);
        }
    }
}
