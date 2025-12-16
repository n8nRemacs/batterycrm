package com.avito.android.advertising.adapter.items.buzzoola;

import Db.InterfaceC13381a;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaButton;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.V2;
import com.facebook.drawee.drawable.s;
import java.lang.ref.WeakReference;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nd.InterfaceC44378a;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/p;", "Lcom/avito/android/advertising/adapter/items/buzzoola/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44378a f87372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Activity f87373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.f f87375g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87376h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87377i;

    @Inject
    public p(@Y61.k h31.e<InterfaceC44739c> eVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k InterfaceC44378a interfaceC44378a, @Y61.k Activity activity, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advertising.loaders.f fVar, @Y61.k com.avito.android.advertising.a aVar2, @Y61.k InterfaceC13381a interfaceC13381a) {
        this.f87370b = eVar;
        this.f87371c = cVar;
        this.f87372d = interfaceC44378a;
        this.f87373e = activity;
        this.f87374f = aVar;
        this.f87375g = fVar;
        this.f87376h = aVar2;
        this.f87377i = interfaceC13381a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.advertising.ui.buzzoola.d dVar = (com.avito.android.advertising.ui.buzzoola.d) eVar;
        BuzzoolaDirectBannerItem buzzoolaDirectBannerItem = (BuzzoolaDirectBannerItem) aVar;
        BuzzoolaBanner.BuzzoolaDirect banner = buzzoolaDirectBannerItem.getBanner();
        BuzzoolaButton buzzoolaButton = buzzoolaDirectBannerItem.getBanner().f88221h;
        boolean z12 = buzzoolaButton.f88280c;
        h31.e<InterfaceC44739c> eVar2 = this.f87370b;
        WeakReference weakReference = new WeakReference(eVar2);
        BannerInfo bannerInfo = buzzoolaDirectBannerItem.getBannerInfo();
        String str = banner.f88225l;
        String str2 = banner.f88226m.f88291e;
        boolean z13 = (str.length() <= 0 || str2 == null || str2.length() == 0) ? false : true;
        if (this.f87377i.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View f88600b = dVar.getF88600b();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(f88600b, buzzoolaDirectBannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(bannerInfo, i12);
        }
        if (buzzoolaDirectBannerItem.getIsHidden() && z13) {
            dVar.Xa(false);
            return;
        }
        dVar.Xa(true);
        dVar.n4(banner.f88220g);
        dVar.setTitle(banner.f88216c);
        dVar.h(banner.getF88258c());
        Integer num = banner.f88228o;
        dVar.uF(Integer.valueOf(num != null ? num.intValue() : 0));
        dVar.px(banner.f88215b, s.c.f340133e, new l(banner, this, dVar));
        if (z12) {
            dVar.y9(banner.f88222i);
        }
        dVar.fu(z12);
        dVar.H60(R.dimen.ad_icon_corner_radius);
        com.avito.android.advertising.ui.h hVar2 = com.avito.android.advertising.ui.h.f88704a;
        Locale locale = Locale.getDefault();
        hVar2.getClass();
        String str3 = buzzoolaButton.f88279b;
        String strN = str3 != null ? C43066x.n(str3.toLowerCase(locale), locale) : null;
        if (strN == null) {
            strN = dVar.U30();
        }
        dVar.E8(strN);
        dVar.Ex(z12, dVar.getF88633c().a());
        dVar.p(banner.f88223j);
        dVar.BN(banner.f88224k, dVar.getF88633c());
        dVar.OB(dVar.getF88633c());
        dVar.a(new m(weakReference, bannerInfo, i12, this, banner));
        WeakReference weakReference2 = new WeakReference(dVar);
        String strG = com.avito.android.advertising.ui.h.g(banner.f88225l, banner.f88218e);
        if (strG == null) {
            strG = "";
        }
        dVar.HE(new n(this, buzzoolaDirectBannerItem, weakReference2, weakReference), new o(banner, this), strG, z13);
    }

    public final void k(String str) {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            b.a.a(this.f87374f, new WebViewLink.AnyDomain(Uri.parse(str), new WebViewLinkSettings(false, false, false, true, false, null, null, false, false, false, false, 2039, null), null, 4, null), null, null, 6);
        } catch (Throwable th3) {
            th = th3;
            V2.f318762a.a("DEFAULT_TAG", "BuzzoolaPresenterImpl", th);
        }
    }
}
