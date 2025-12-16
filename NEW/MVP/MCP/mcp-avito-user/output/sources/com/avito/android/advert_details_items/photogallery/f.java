package com.avito.android.advert_details_items.photogallery;

import com.avito.android.advert_details_items.photogallery.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f85064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdvertDetailsGalleryItem advertDetailsGalleryItem, k kVar) {
        super(0);
        this.f85064l = kVar;
        this.f85065m = advertDetailsGalleryItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f85064l;
        kVar.f85077e.c(new R8.a(this.f85065m.f85014m));
        AdvertDetailsGalleryItem advertDetailsGalleryItem = kVar.f85083k;
        c.a.a(kVar.f85074b, advertDetailsGalleryItem != null ? advertDetailsGalleryItem.f85012k : 0, advertDetailsGalleryItem != null ? Long.valueOf(advertDetailsGalleryItem.f85013l) : null, null, 8);
        return G0.f406611a;
    }
}
