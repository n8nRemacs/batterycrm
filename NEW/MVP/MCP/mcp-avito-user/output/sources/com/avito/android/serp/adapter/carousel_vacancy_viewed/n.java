package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselVacancyViewedXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f269213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f269214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, AdvertXlItem advertXlItem) {
        super(0);
        this.f269213l = qVar;
        this.f269214m = advertXlItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.rich_snippets.a aVar = this.f269213l.f269223c.get();
        AdvertXlItem advertXlItem = this.f269214m;
        aVar.Ld(advertXlItem, new AbstractC30567a.n(advertXlItem.f268785g));
        return G0.f406611a;
    }
}
