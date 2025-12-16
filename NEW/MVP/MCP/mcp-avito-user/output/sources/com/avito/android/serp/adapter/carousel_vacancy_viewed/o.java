package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselVacancyViewedXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f269216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269217n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f269218o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f269219p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.avito.android.serp.adapter.rich_snippets.job.m mVar, q qVar, com.avito.android.serp.adapter.rich_snippets.job.m mVar2, AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2) {
        super(0);
        this.f269215l = mVar;
        this.f269216m = qVar;
        this.f269217n = mVar2;
        this.f269218o = advertXlItem;
        this.f269219p = advertXlItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.rich_snippets.job.m mVar = this.f269215l;
        mVar.H0();
        mVar.d(null);
        q qVar = this.f269216m;
        h31.e<InterfaceC28616b> eVar = qVar.f269225e;
        if (eVar.get().N6()) {
            String str = this.f269218o.f268777c;
            qVar.f269226f.p(this.f269217n, str);
        } else {
            eVar.get().M6(this.f269219p);
        }
        return G0.f406611a;
    }
}
