package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34880w;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: CarouselVacancyViewedItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f269175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f269176m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AdvertItem advertItem) {
        super(0);
        this.f269175l = hVar;
        this.f269176m = advertItem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        DimmedImage dimmedImage;
        h hVar = this.f269175l;
        InterfaceC47690b interfaceC47690b = hVar.f269184b.get();
        AdvertItem advertItem = this.f269176m;
        DeepLink deepLink = advertItem.f268396O;
        List<DimmedImage> list = advertItem.f268404S;
        InterfaceC47691c.a.a(interfaceC47690b, deepLink, C34880w.a(advertItem.f268428d, advertItem.f268440i, advertItem.f268446l, (list == null || (dimmedImage = (DimmedImage) C42745f0.G(list)) == null) ? null : dimmedImage.getImage(), advertItem.f268420a0, null, hVar.f269192j), 8);
        ?? r02 = advertItem.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem.f268425c);
        }
        return G0.f406611a;
    }
}
