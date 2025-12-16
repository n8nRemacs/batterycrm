package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import com.avito.android.photo_gallery_carousel.gallery_view.a;
import com.avito.android.remote.model.model_card.LinkInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryTeaserItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f217924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GalleryTeaserItem f217925m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, GalleryTeaserItem galleryTeaserItem) {
        super(0);
        this.f217924l = dVar;
        this.f217925m = galleryTeaserItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f217924l;
        LinkInfo button = this.f217925m.f217915c.getButton();
        dVar.f217926b.invoke(new a.c(button != null ? button.getDeeplink() : null));
        return G0.f406611a;
    }
}
