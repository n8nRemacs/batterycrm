package com.avito.android.serp.adapter.rich_snippets.job;

import Ax.InterfaceC13095a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30070i4;
import com.avito.android.remote.model.Action;
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

/* compiled from: AdvertXlRichJobItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/job/x;", "LTV0/d;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x implements TV0.d<m, AdvertXlItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270859b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f270860c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f270861d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28616b f270862e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A f270863f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f270864g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f270865h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f270866i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final SearchParams f270867j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.e f270868k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.b f270869l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f270870m;

    @Inject
    public x(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar2, @C30070i4.d @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k InterfaceC28616b interfaceC28616b, @Y61.k A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k InterfaceC13095a interfaceC13095a, @Y61.l SearchParams searchParams, @Y61.k ru.avito.component.serp.job.geo.e eVar3, @Y61.k ru.avito.component.serp.job.geo.b bVar2, @Y61.k com.avito.android.server_time.h hVar) {
        this.f270859b = eVar;
        this.f270860c = eVar2;
        this.f270861d = bVar;
        this.f270862e = interfaceC28616b;
        this.f270863f = a12;
        this.f270864g = interfaceC28373a;
        this.f270865h = interfaceC34864v0;
        this.f270866i = interfaceC13095a;
        this.f270867j = searchParams;
        this.f270868k = eVar3;
        this.f270869l = bVar2;
        this.f270870m = hVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String name;
        m mVar = (m) eVar;
        AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
        Map<String, String> map = advertXlItem.f268749B;
        if (map != null) {
            this.f270864g.c(new C28417h(map));
        }
        AdvertSellerInfo advertSellerInfo = advertXlItem.f268764Q;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        mVar.Vo(inlineAdvantages, name, advertSellerInfo != null ? advertSellerInfo.getOnlineStatus() : null);
        mVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        mVar.K0(advertXlItem.f268793k, advertXlItem.f268753F);
        mVar.p(advertXlItem.f268808t);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j12 = advertXlItem.f268807s;
        mVar.b0((j12 > 0 && ((timeUnit.toMillis(j12) > com.avito.android.date_time_formatter.e.a(this.f270870m) ? 1 : (timeUnit.toMillis(j12) == com.avito.android.date_time_formatter.e.a(this.f270870m) ? 0 : -1)) >= 0)) ? this.f270861d.a(Long.valueOf(j12), timeUnit) : null);
        boolean zA2 = com.avito.android.serp.adapter.rich_snippets.job.multi_addresses.b.a(advertXlItem);
        List<GeoReference> list = advertXlItem.f268765R;
        if (zA2) {
            GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
            ArrayList arrayListA = list != null ? k.a(list) : null;
            this.f270869l.getClass();
            mVar.bk(ru.avito.component.serp.job.geo.b.a(geoReference, advertXlItem.f268767T, advertXlItem.f268806r, advertXlItem.f268805q, arrayListA));
        } else {
            GeoReference geoReference2 = list != null ? (GeoReference) C42745f0.G(list) : null;
            ArrayList arrayListA2 = list != null ? k.a(list) : null;
            this.f270868k.getClass();
            mVar.lo(ru.avito.component.serp.job.geo.e.a(geoReference2, advertXlItem.f268767T, advertXlItem.f268806r, advertXlItem.f268805q, arrayListA2, advertXlItem.f268798m0));
        }
        mVar.jb(advertXlItem.f268783f, false);
        mVar.setActive(advertXlItem.f268756I);
        mVar.setViewed(advertXlItem.f268760M);
        AdvertActions advertActions = advertXlItem.f268752E;
        mVar.qD(advertActions != null ? advertActions.getActions() : null, true);
        mVar.Q50(com.avito.android.image_loader.b.b(advertSellerInfo != null ? advertSellerInfo.getImage() : null));
        mVar.o5(advertXlItem.f268762O);
        mVar.MU(advertXlItem.f268792j0);
        InterfaceC28616b interfaceC28616b = this.f270862e;
        if (interfaceC28616b.N6()) {
            this.f270863f.n(mVar, advertXlItem.f268777c);
        } else {
            interfaceC28616b.L6(advertXlItem, mVar);
        }
        mVar.FO();
        Action action = advertXlItem.f268759L;
        if (action == null) {
            mVar.FO();
        } else if (action.getTitleWithSalary() == null) {
            mVar.LS(action, new q(this, advertXlItem));
        } else {
            mVar.yT(action, new r(this, advertXlItem));
        }
        mVar.H0();
        mVar.om(new s(this, advertXlItem, mVar));
        mVar.X50(new t(this, advertXlItem));
        mVar.l5(new u(this, advertXlItem));
        mVar.d(new v(mVar, this, mVar, advertXlItem, advertXlItem));
    }

    public /* synthetic */ x(h31.e eVar, h31.e eVar2, com.avito.android.date_time_formatter.b bVar, InterfaceC28616b interfaceC28616b, A a12, InterfaceC28373a interfaceC28373a, InterfaceC34864v0 interfaceC34864v0, InterfaceC13095a interfaceC13095a, SearchParams searchParams, ru.avito.component.serp.job.geo.e eVar3, ru.avito.component.serp.job.geo.b bVar2, com.avito.android.server_time.h hVar, int i12, C42822w c42822w) {
        this(eVar, eVar2, bVar, interfaceC28616b, a12, interfaceC28373a, interfaceC34864v0, interfaceC13095a, (i12 & 256) != 0 ? null : searchParams, eVar3, bVar2, hVar);
    }
}
