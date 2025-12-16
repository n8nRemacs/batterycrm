package com.avito.android.serp.adapter.recommendations_vacancy;

import Ax.InterfaceC13095a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30070i4;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: RdsAdvertVacancyItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/recommendations_vacancy/h;", "LTV0/d;", "Lcom/avito/android/serp/adapter/recommendations_vacancy/j;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.d<j, AdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34863v> f270595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<rn0.e> f270596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28616b f270597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A f270598e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f270599f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f270600g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f270601h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.b f270602i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f270603j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f270604k;

    @Inject
    public h(@Y61.k h31.e<InterfaceC34863v> eVar, @Y61.k h31.e<rn0.e> eVar2, @Y61.k InterfaceC28616b interfaceC28616b, @Y61.k A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k InterfaceC13095a interfaceC13095a, @Y61.k ru.avito.component.serp.job.geo.b bVar, @C30070i4.d @Y61.k com.avito.android.date_time_formatter.b bVar2, @Y61.k com.avito.android.server_time.h hVar) {
        this.f270595b = eVar;
        this.f270596c = eVar2;
        this.f270597d = interfaceC28616b;
        this.f270598e = a12;
        this.f270599f = interfaceC28373a;
        this.f270600g = interfaceC34864v0;
        this.f270601h = interfaceC13095a;
        this.f270602i = bVar;
        this.f270603j = bVar2;
        this.f270604k = hVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String name;
        j jVar = (j) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        Map<String, String> map = advertItem.f268398P;
        if (map != null && !map.isEmpty()) {
            this.f270599f.c(new C28417h(map));
        }
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        jVar.Vo(inlineAdvantages, name, advertSellerInfo != null ? advertSellerInfo.getOnlineStatus() : null);
        jVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        jVar.K0(advertItem.f268428d, advertItem.f268436g);
        jVar.p(advertItem.f268440i);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j12 = advertItem.f268474z;
        jVar.b0((j12 > 0 && ((timeUnit.toMillis(j12) > com.avito.android.date_time_formatter.e.a(this.f270604k) ? 1 : (timeUnit.toMillis(j12) == com.avito.android.date_time_formatter.e.a(this.f270604k) ? 0 : -1)) >= 0)) ? this.f270603j.a(Long.valueOf(j12), timeUnit) : null);
        List<GeoReference> list = advertItem.f268426c0;
        GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
        ArrayList arrayListA = list != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list) : null;
        this.f270602i.getClass();
        jVar.bk(ru.avito.component.serp.job.geo.b.a(geoReference, advertItem.f268464u, advertItem.f268466v, advertItem.f268462t, arrayListA));
        jVar.jb(advertItem.f268380G, false);
        jVar.setActive(advertItem.f268376E);
        jVar.setViewed(advertItem.f268394N);
        AdvertActions advertActions = advertItem.f268408U;
        jVar.qD(advertActions != null ? advertActions.getActions() : null, false);
        jVar.Q50(com.avito.android.image_loader.b.b(advertSellerInfo != null ? advertSellerInfo.getImage() : null));
        jVar.o5(advertItem.f268416Y);
        jVar.MU(advertItem.f268375D0);
        InterfaceC28616b interfaceC28616b = this.f270597d;
        if (interfaceC28616b.N6()) {
            this.f270598e.n(jVar, advertItem.f268425c);
        } else {
            interfaceC28616b.L6(advertItem, jVar);
        }
        jVar.H0();
        jVar.om(new c(this, advertItem, jVar));
        jVar.l5(new d(this, advertItem));
        jVar.X50(new e(this, advertItem, i12));
        jVar.d(new f(jVar, this, jVar, advertItem, advertItem));
    }
}
