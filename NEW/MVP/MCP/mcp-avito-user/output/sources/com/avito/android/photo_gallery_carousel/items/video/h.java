package com.avito.android.photo_gallery_carousel.items.video;

import com.avito.android.R;
import com.avito.android.photo_gallery_carousel.gallery_view.a;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryVideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f218028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f218029m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GalleryVideoItem f218030n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i12, GalleryVideoItem galleryVideoItem) {
        super(0);
        this.f218028l = iVar;
        this.f218029m = i12;
        this.f218030n = galleryVideoItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.photo_gallery_carousel.gallery_view.a fVar;
        i iVar = this.f218028l;
        Y41.l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar = iVar.f218031b;
        if (iVar.f218032c.c()) {
            fVar = new a.g(this.f218029m, iVar.f218033d.t(this.f218030n.f218014d.getVideoUrl()));
        } else {
            fVar = new a.f(com.avito.android.printable_text.b.c(R.string.advert_core_network_unavailable_message, new Serializable[0]));
        }
        lVar.invoke(fVar);
        return G0.f406611a;
    }
}
