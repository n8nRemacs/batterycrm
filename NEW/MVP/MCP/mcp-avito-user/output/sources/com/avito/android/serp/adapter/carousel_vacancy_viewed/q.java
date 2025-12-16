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
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import rn0.InterfaceC47690b;

/* compiled from: CarouselVacancyViewedXlItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_vacancy_viewed/q;", "LTV0/d;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements TV0.d<com.avito.android.serp.adapter.rich_snippets.job.m, AdvertXlItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f269222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f269223c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.date_time_formatter.b> f269224d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f269225e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A f269226f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f269227g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f269228h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f269229i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final SearchParams f269230j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.b f269231k;

    @Inject
    public q(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar2, @C30070i4.b @Y61.k h31.e<com.avito.android.date_time_formatter.b> eVar3, @Y61.k h31.e<InterfaceC28616b> eVar4, @Y61.k A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k InterfaceC13095a interfaceC13095a, @Y61.l SearchParams searchParams, @Y61.k ru.avito.component.serp.job.geo.b bVar) {
        this.f269222b = eVar;
        this.f269223c = eVar2;
        this.f269224d = eVar3;
        this.f269225e = eVar4;
        this.f269226f = a12;
        this.f269227g = interfaceC28373a;
        this.f269228h = interfaceC34864v0;
        this.f269229i = interfaceC13095a;
        this.f269230j = searchParams;
        this.f269231k = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String name;
        com.avito.android.serp.adapter.rich_snippets.job.m mVar = (com.avito.android.serp.adapter.rich_snippets.job.m) eVar;
        AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
        Map<String, String> map = advertXlItem.f268749B;
        if (map != null) {
            this.f269227g.c(new C28417h(map));
        }
        AdvertSellerInfo advertSellerInfo = advertXlItem.f268764Q;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        mVar.Vo(inlineAdvantages, name, null);
        mVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        mVar.K0(advertXlItem.f268793k, advertXlItem.f268753F);
        mVar.p(advertXlItem.f268808t);
        long j12 = advertXlItem.f268807s;
        mVar.b0(j12 > 0 ? this.f269224d.get().a(Long.valueOf(j12), TimeUnit.SECONDS) : null);
        List<GeoReference> list = advertXlItem.f268765R;
        GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
        ArrayList arrayListA = list != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list) : null;
        this.f269231k.getClass();
        mVar.bk(ru.avito.component.serp.job.geo.b.a(geoReference, advertXlItem.f268767T, advertXlItem.f268806r, advertXlItem.f268805q, arrayListA));
        mVar.jb(advertXlItem.f268783f, false);
        mVar.setActive(advertXlItem.f268756I);
        mVar.setViewed(advertXlItem.f268760M);
        AdvertActions advertActions = advertXlItem.f268752E;
        mVar.qD(advertActions != null ? advertActions.getActions() : null, true);
        mVar.Q50(com.avito.android.image_loader.b.b(advertSellerInfo != null ? advertSellerInfo.getImage() : null));
        mVar.o5(advertXlItem.f268762O);
        mVar.MU(advertXlItem.f268792j0);
        h31.e<InterfaceC28616b> eVar2 = this.f269225e;
        if (eVar2.get().N6()) {
            this.f269226f.n(mVar, advertXlItem.f268777c);
        } else {
            eVar2.get().L6(advertXlItem, mVar);
        }
        mVar.H0();
        mVar.om(new l(this, advertXlItem, mVar));
        mVar.X50(new m(this, advertXlItem));
        mVar.l5(new n(this, advertXlItem));
        mVar.d(new o(mVar, this, mVar, advertXlItem, advertXlItem));
    }

    public final void k(AdvertAction advertAction, AdvertXlItem advertXlItem) {
        DeepLink deepLink = advertAction.getDeepLink();
        if (deepLink == null) {
            return;
        }
        this.f269222b.get().W(advertXlItem.f268777c, deepLink, ContactSource.f89919d, ScreenIdField.f90254f, advertXlItem.f268776b0);
    }

    public /* synthetic */ q(h31.e eVar, h31.e eVar2, h31.e eVar3, h31.e eVar4, A a12, InterfaceC28373a interfaceC28373a, InterfaceC34864v0 interfaceC34864v0, InterfaceC13095a interfaceC13095a, SearchParams searchParams, ru.avito.component.serp.job.geo.b bVar, int i12, C42822w c42822w) {
        this(eVar, eVar2, eVar3, eVar4, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, (i12 & 256) != 0 ? null : searchParams, bVar);
    }
}
