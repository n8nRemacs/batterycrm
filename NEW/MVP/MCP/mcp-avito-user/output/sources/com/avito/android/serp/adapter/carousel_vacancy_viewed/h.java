package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import Ax.InterfaceC13095a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.C30070i4;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import rn0.InterfaceC47690b;

/* compiled from: CarouselVacancyViewedItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_vacancy_viewed/h;", "LTV0/d;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.d<com.avito.android.serp.adapter.rich_snippets.job.m, AdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f269184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f269185c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f269186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28616b f269187e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A f269188f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f269189g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f269190h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f269191i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final SearchParams f269192j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.b f269193k;

    @Inject
    public h(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar2, @C30070i4.b @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k InterfaceC28616b interfaceC28616b, @Y61.k A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k InterfaceC13095a interfaceC13095a, @Y61.l SearchParams searchParams, @Y61.k ru.avito.component.serp.job.geo.b bVar2) {
        this.f269184b = eVar;
        this.f269185c = eVar2;
        this.f269186d = bVar;
        this.f269187e = interfaceC28616b;
        this.f269188f = a12;
        this.f269189g = interfaceC28373a;
        this.f269190h = interfaceC34864v0;
        this.f269191i = interfaceC13095a;
        this.f269192j = searchParams;
        this.f269193k = bVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String name;
        com.avito.android.serp.adapter.rich_snippets.job.m mVar = (com.avito.android.serp.adapter.rich_snippets.job.m) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        Map<String, String> map = advertItem.f268398P;
        if (map != null && !map.isEmpty()) {
            this.f269189g.c(new C28417h(map));
        }
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        mVar.Vo(inlineAdvantages, name, null);
        mVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        mVar.K0(advertItem.f268428d, advertItem.f268436g);
        mVar.p(advertItem.f268440i);
        long j12 = advertItem.f268474z;
        mVar.b0(j12 > 0 ? this.f269186d.a(Long.valueOf(j12), TimeUnit.SECONDS) : null);
        List<GeoReference> list = advertItem.f268426c0;
        GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
        ArrayList arrayListA = list != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list) : null;
        this.f269193k.getClass();
        mVar.bk(ru.avito.component.serp.job.geo.b.a(geoReference, advertItem.f268464u, advertItem.f268466v, advertItem.f268462t, arrayListA));
        mVar.jb(advertItem.f268380G, false);
        mVar.setActive(advertItem.f268376E);
        mVar.setViewed(advertItem.f268394N);
        AdvertActions advertActions = advertItem.f268408U;
        mVar.qD(advertActions != null ? advertActions.getActions() : null, false);
        mVar.Q50(com.avito.android.image_loader.b.b(advertSellerInfo != null ? advertSellerInfo.getImage() : null));
        mVar.o5(advertItem.f268416Y);
        mVar.MU(advertItem.f268375D0);
        InterfaceC28616b interfaceC28616b = this.f269187e;
        if (interfaceC28616b.N6()) {
            this.f269188f.n(mVar, advertItem.f268425c);
        } else {
            interfaceC28616b.L6(advertItem, mVar);
        }
        mVar.H0();
        mVar.om(new c(this, advertItem, mVar));
        mVar.l5(new d(this, advertItem));
        mVar.X50(new e(this, advertItem));
        mVar.d(new f(mVar, this, mVar, advertItem, advertItem));
    }

    public final void k(AdvertAction advertAction, AdvertItem advertItem) {
        DeepLink deepLink = advertAction.getDeepLink();
        if (deepLink == null) {
            return;
        }
        this.f269184b.get().W(advertItem.f268425c, deepLink, ContactSource.f89919d, ScreenIdField.f90254f, advertItem.f268420a0);
    }

    public /* synthetic */ h(h31.e eVar, h31.e eVar2, com.avito.android.date_time_formatter.b bVar, InterfaceC28616b interfaceC28616b, A a12, InterfaceC28373a interfaceC28373a, InterfaceC34864v0 interfaceC34864v0, InterfaceC13095a interfaceC13095a, SearchParams searchParams, ru.avito.component.serp.job.geo.b bVar2, int i12, C42822w c42822w) {
        this(eVar, eVar2, bVar, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, (i12 & 256) != 0 ? null : searchParams, bVar2);
    }
}
