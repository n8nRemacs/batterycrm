package com.avito.android.advert.item;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/G;", "invoke", "()Lcom/avito/android/advertising/loaders/beduin/G;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.advertising.loaders.beduin.G> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFragment f71309l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AdvertDetailsFragment advertDetailsFragment) {
        super(0);
        this.f71309l = advertDetailsFragment;
    }

    @Override // Y41.a
    public final com.avito.android.advertising.loaders.beduin.G invoke() {
        AdvertDetailsFragment advertDetailsFragment = this.f71309l;
        com.avito.android.advertising.loaders.n nVar = advertDetailsFragment.f71471g4;
        if (nVar == null) {
            nVar = null;
        }
        com.avito.android.advert.item.beduin.k kVar = advertDetailsFragment.f71499n4;
        if (kVar == null) {
            kVar = null;
        }
        com.avito.android.advertising.loaders.beduin.H f73242l = kVar.getF73242L();
        com.avito.android.advertising.loaders.event_service.c cVar = advertDetailsFragment.f71475h4;
        return new com.avito.android.advertising.loaders.beduin.G(nVar, f73242l, cVar != null ? cVar : null, BannerPageSource.f87779e, false, 16, null);
    }
}
