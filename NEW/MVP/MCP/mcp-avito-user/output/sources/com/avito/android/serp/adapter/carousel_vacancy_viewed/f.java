package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselVacancyViewedItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f269178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269179n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f269180o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f269181p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.serp.adapter.rich_snippets.job.m mVar, h hVar, com.avito.android.serp.adapter.rich_snippets.job.m mVar2, AdvertItem advertItem, AdvertItem advertItem2) {
        super(0);
        this.f269177l = mVar;
        this.f269178m = hVar;
        this.f269179n = mVar2;
        this.f269180o = advertItem;
        this.f269181p = advertItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.rich_snippets.job.m mVar = this.f269177l;
        mVar.H0();
        mVar.d(null);
        h hVar = this.f269178m;
        InterfaceC28616b interfaceC28616b = hVar.f269187e;
        if (interfaceC28616b.N6()) {
            String str = this.f269180o.f268425c;
            hVar.f269188f.p(this.f269179n, str);
        } else {
            interfaceC28616b.M6(this.f269181p);
        }
        return G0.f406611a;
    }
}
