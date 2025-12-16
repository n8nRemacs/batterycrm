package com.avito.android.favorites.adapter.job_snippet;

import android.view.View;
import android.widget.TextView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.C30070i4;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.remote.model.favorite_contacts.Contacts;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.util.C35787f0;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: FavoriteJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/job_snippet/i;", "LTV0/d;", "Lcom/avito/android/favorites/adapter/job_snippet/l;", "Lcom/avito/android/favorites/adapter/advert/FavoriteAdvertItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements TV0.d<l, FavoriteAdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f156620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.e f156621c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f156622d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<rn0.e> f156623e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f156624f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f156625g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<d.a> f156626h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f156627i;

    @Inject
    public i(@Y61.k com.avito.android.server_time.h hVar, @Y61.k ru.avito.component.serp.job.geo.e eVar, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k h31.e<rn0.e> eVar2, @C30070i4.d @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k h31.e<d.a> eVar3, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f156620b = hVar;
        this.f156621c = eVar;
        this.f156622d = interfaceC34864v0;
        this.f156623e = eVar2;
        this.f156624f = bVar;
        this.f156625g = aVar;
        this.f156626h = eVar3;
        this.f156627i = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String name;
        ArrayList arrayList;
        Q q12;
        ArrayList arrayList2;
        List<String> colors;
        l lVar = (l) eVar;
        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVar;
        Map<String, String> map = favoriteAdvertItem.f156393E;
        if (map != null && !map.isEmpty()) {
            this.f156627i.c(new C28417h(map));
        }
        AdvertSellerInfo advertSellerInfo = favoriteAdvertItem.f156392D;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        lVar.Vo(inlineAdvantages, name, advertSellerInfo != null ? advertSellerInfo.getOnlineStatus() : null);
        lVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        lVar.K0(favoriteAdvertItem.f156405c, false);
        lVar.p(favoriteAdvertItem.f156406d);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long l12 = favoriteAdvertItem.f156410h;
        lVar.b0((l12 == null || l12.longValue() <= 0 || !(l12 != null && (timeUnit.toMillis(l12.longValue()) > com.avito.android.date_time_formatter.e.a(this.f156620b) ? 1 : (timeUnit.toMillis(l12.longValue()) == com.avito.android.date_time_formatter.e.a(this.f156620b) ? 0 : -1)) >= 0)) ? null : this.f156624f.a(l12, timeUnit));
        List<GeoReference> list = favoriteAdvertItem.f156427y;
        GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
        if (list != null) {
            GeoReference geoReference2 = (GeoReference) C42745f0.G(list);
            if (geoReference2 == null || (colors = geoReference2.getColors()) == null) {
                arrayList2 = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = colors.iterator();
                while (it.hasNext()) {
                    Integer numA = C35787f0.a((String) it.next());
                    if (numA != null) {
                        arrayList3.add(numA);
                    }
                }
                arrayList2 = new ArrayList(C42745f0.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Color(((Number) it2.next()).intValue()));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.f156621c.getClass();
        lVar.lo(ru.avito.component.serp.job.geo.e.a(geoReference, favoriteAdvertItem.f156428z, favoriteAdvertItem.f156416n, favoriteAdvertItem.f156400L, arrayList, favoriteAdvertItem.f156389A));
        lVar.o5(favoriteAdvertItem.f156402N);
        lVar.jb(favoriteAdvertItem.f156394F, false);
        boolean z12 = favoriteAdvertItem.f156411i;
        lVar.setActive(z12);
        ru.avito.component.serp.job.e eVar2 = lVar.f156637c;
        TextView textView = eVar2.f430490u;
        if (textView != null) {
            I5.a(textView, favoriteAdvertItem.f156403O, false);
        }
        View view = eVar2.f430489t;
        if (view != null) {
            view.setVisibility(!z12 ? 0 : 8);
        }
        lVar.setViewed(favoriteAdvertItem.f156398J && z12);
        if (z12) {
            q12 = new Q(null, null);
        } else {
            FavoriteAdvertActionButton favoriteAdvertActionButton = favoriteAdvertItem.f156424v;
            q12 = new Q(favoriteAdvertActionButton != null ? favoriteAdvertActionButton.getTitle() : null, new d(favoriteAdvertActionButton, this, favoriteAdvertItem));
        }
        String str = (String) q12.f406619b;
        Y41.a aVar2 = (Y41.a) q12.f406620c;
        Button button = eVar2.f430488s;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setOnClickListener(new ru.avito.component.payments.method.b(1, aVar2));
        }
        Contacts contacts = favoriteAdvertItem.f156426x;
        lVar.qD(contacts != null ? contacts.getItems() : null, false);
        lVar.FO();
        lVar.Q50(com.avito.android.image_loader.b.b(advertSellerInfo != null ? advertSellerInfo.getImage() : null));
        lVar.MU(favoriteAdvertItem.f156390B);
        lVar.H0();
        lVar.om(new e(this, favoriteAdvertItem));
        lVar.l5(new f(this, favoriteAdvertItem));
        lVar.X50(new g(this, lVar, favoriteAdvertItem));
        lVar.f156638d = new h(lVar);
    }

    public final void k(AdvertAction advertAction, FavoriteAdvertItem favoriteAdvertItem) {
        DeepLink deepLink = advertAction.getDeepLink();
        if (deepLink == null) {
            return;
        }
        this.f156623e.get().W(favoriteAdvertItem.f156404b, deepLink, ContactSource.f89919d, ScreenIdField.f90252d, String.valueOf(favoriteAdvertItem.f156413k));
    }
}
