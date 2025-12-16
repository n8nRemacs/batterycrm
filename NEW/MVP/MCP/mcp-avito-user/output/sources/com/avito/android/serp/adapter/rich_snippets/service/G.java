package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "phoneLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f271260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271261m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AdvertXlItem advertXlItem, O o12) {
        super(1);
        this.f271260l = o12;
        this.f271261m = advertXlItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f271260l.f271284c.get().Sa(this.f271261m.f268777c, deepLink, ContactSource.f89921f);
        return G0.f406611a;
    }
}
