package com.avito.android.advertising.adapter.items.web;

import Db.InterfaceC13381a;
import android.view.View;
import android.webkit.WebView;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.util.y6;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44739c;

/* compiled from: CommercialHtmlPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/d;", "Lcom/avito/android/advertising/adapter/items/web/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f87656b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87657c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87658d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87659e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87660f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f87661g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f87662h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87663i;

    /* renamed from: j, reason: collision with root package name */
    public long f87664j = -1;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public H f87665k;

    /* compiled from: CommercialHtmlPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/adapter/items/web/d$a", "Landroidx/lifecycle/L;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22979L {
        public a() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                d dVar = d.this;
                dVar.f87656b.a(dVar.f87664j);
            }
        }
    }

    @Inject
    public d(@Y61.k m mVar, @Y61.k h31.e<InterfaceC44739c> eVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k InterfaceC13381a interfaceC13381a, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f87656b = mVar;
        this.f87657c = eVar;
        this.f87658d = cVar;
        this.f87659e = aVar;
        this.f87660f = iVar;
        this.f87661g = bVar;
        this.f87662h = jVar;
        this.f87663i = interfaceC13381a;
        interfaceC22983P.getLifecycle().a(new a());
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        CommercialHtmlBannerItem commercialHtmlBannerItem = (CommercialHtmlBannerItem) aVar;
        if (this.f87663i.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = jVar.getF87686b();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, commercialHtmlBannerItem);
        }
        h31.e<InterfaceC44739c> eVar2 = this.f87657c;
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(commercialHtmlBannerItem.getBannerInfo(), i12);
        }
        Integer num = commercialHtmlBannerItem.getBannerInfo().f87893x;
        if (num == null || num.intValue() != 100) {
            commercialHtmlBannerItem.getBannerInfo().f87893x = 0;
        }
        if (commercialHtmlBannerItem.getBanner().getF88275f()) {
            jVar.y3();
            return;
        }
        jVar.c0();
        Integer width = commercialHtmlBannerItem.getBanner().getF88272c();
        jVar.eT(width != null ? Integer.valueOf(y6.b(width.intValue())) : null);
        Integer height = commercialHtmlBannerItem.getBanner().getF88273d();
        jVar.bz(height != null ? Integer.valueOf(y6.b(height.intValue())) : null);
        jVar.CV(commercialHtmlBannerItem.getBanner().getF88274e());
        try {
            WebView webViewQA = jVar.QA();
            m mVar = this.f87656b;
            if (webViewQA == null) {
                jVar.Q7(mVar.c(jVar.getF87686b().getContext(), commercialHtmlBannerItem.getBannerInfo().getF272777l()));
            }
            this.f87664j = commercialHtmlBannerItem.getBannerInfo().getF272777l();
            mVar.b(commercialHtmlBannerItem.getBannerInfo().getF272777l(), commercialHtmlBannerItem.getBanner().getF88271b(), new e(commercialHtmlBannerItem, this, new WeakReference(jVar), new WeakReference(eVar2), i12, new WeakReference(this.f87659e)));
        } catch (Exception e12) {
            k(jVar, commercialHtmlBannerItem, 100000, e12.getMessage());
        }
    }

    @Override // com.avito.android.advertising.adapter.items.web.c
    public final void h6(@Y61.l H h12) {
        this.f87665k = h12;
    }

    public final void k(j jVar, CommercialHtmlBannerItem commercialHtmlBannerItem, Integer num, String str) {
        jVar.y3();
        commercialHtmlBannerItem.getBanner().t();
        H h12 = this.f87665k;
        if (h12 != null) {
            h12.d(new H.b.a(commercialHtmlBannerItem, num, str));
        }
        this.f87662h.n5(commercialHtmlBannerItem.getBannerInfo(), num, str);
    }
}
