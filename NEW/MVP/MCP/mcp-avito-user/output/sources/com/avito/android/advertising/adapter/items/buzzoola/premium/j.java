package com.avito.android.advertising.adapter.items.buzzoola.premium;

import Ca1.ViewOnClickListenerC13236c;
import Db.InterfaceC13381a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advertising.di.v;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaButton;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaLegal;
import com.avito.android.advertising.loaders.buzzoola.p;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.Kundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPremiumPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/f;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87405b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87406c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87407d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87408e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87409f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.ui.buzzoola.i f87410g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaPremiumStates f87411h;

    @Inject
    public j(@Y61.k h31.e<InterfaceC44739c> eVar, @v @Y61.l Kundle kundle, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC13381a interfaceC13381a) {
        BuzzoolaPremiumStates buzzoolaPremiumStates;
        this.f87405b = eVar;
        this.f87406c = cVar;
        this.f87407d = iVar;
        this.f87408e = aVar;
        this.f87409f = interfaceC13381a;
        this.f87411h = (kundle == null || (buzzoolaPremiumStates = (BuzzoolaPremiumStates) kundle.d("buzzoola_premium_state")) == null) ? new BuzzoolaPremiumStates(null, 1, null) : buzzoolaPremiumStates;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar2;
        com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar3;
        Integer numE;
        String strG;
        String str;
        com.avito.android.advertising.ui.buzzoola.premium.p pVar = (com.avito.android.advertising.ui.buzzoola.premium.p) eVar;
        BuzzoolaPremiumBannerItem buzzoolaPremiumBannerItem = (BuzzoolaPremiumBannerItem) aVar;
        BuzzoolaBanner.BuzzoolaPremium banner = buzzoolaPremiumBannerItem.getBanner();
        banner.getClass();
        boolean zA2 = p.a.a(banner);
        BuzzoolaPremiumItemState buzzoolaPremiumItemState = this.f87411h.f87380b.get(Long.valueOf(buzzoolaPremiumBannerItem.getF74291l()));
        h31.e<InterfaceC44739c> eVar2 = this.f87405b;
        WeakReference weakReference = new WeakReference(eVar2);
        if (this.f87409f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = pVar.getView();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, buzzoolaPremiumBannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(buzzoolaPremiumBannerItem.getBannerInfo(), i12);
        }
        pVar.H0();
        boolean zB2 = pVar.getF88601c().b();
        List listSubList = banner.f88237b;
        if (!zB2 && !listSubList.isEmpty()) {
            listSubList = listSubList.subList(0, 1);
        }
        List<Uri> list = listSubList;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Uri uri : list) {
            arrayList.add(new com.avito.android.cyclic_gallery_widget.image_carousel.q(uri.toString(), com.avito.android.image_loader.b.b(ImageKt.toImage(uri)), null, null, null, false, false, null, null, 508, null));
        }
        Uri uri2 = banner.f88240e;
        BuzzoolaLegal buzzoolaLegal = banner.f88243h;
        if (buzzoolaLegal == null || !pVar.getF88601c().b() || (uri2 == null && buzzoolaLegal.f88292b.length() <= 0)) {
            aVar2 = null;
        } else {
            int i13 = buzzoolaLegal.f88294d;
            int i14 = buzzoolaLegal.f88293c;
            String str2 = buzzoolaLegal.f88292b;
            aVar2 = new com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a(i13, i14, banner.f88240e, str2, str2);
        }
        if (!zA2 || !pVar.getF88601c().b() || (str = banner.f88244i) == null || str.length() == 0) {
            aVar3 = null;
        } else {
            com.avito.android.advertising.ui.h.f88704a.getClass();
            String strG2 = com.avito.android.advertising.ui.h.g(str, banner.f88241f);
            if (strG2 == null) {
                strG2 = "";
            }
            aVar3 = new com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a(str, strG2, buzzoolaLegal != null ? Integer.valueOf(buzzoolaLegal.f88294d) : null, buzzoolaLegal != null ? Integer.valueOf(buzzoolaLegal.f88293c) : null);
        }
        pVar.jV(arrayList, aVar2, aVar3);
        pVar.H1(buzzoolaPremiumItemState != null ? buzzoolaPremiumItemState.f87379b : null);
        pVar.P1(new g(pVar, this, buzzoolaPremiumBannerItem));
        pVar.Q10(zA2);
        pVar.setTitle(banner.f88238c);
        pVar.h(banner.f88239d);
        boolean zB3 = pVar.getF88601c().b();
        BuzzoolaButton buzzoolaButton = banner.f88242g;
        if (zB3 && buzzoolaButton.f88280c) {
            com.avito.android.advertising.ui.h hVar2 = com.avito.android.advertising.ui.h.f88704a;
            Context context = pVar.getView().getContext();
            hVar2.getClass();
            numE = com.avito.android.advertising.ui.h.e(R.attr.ic_download24, context);
        } else if (pVar.getF88601c().b()) {
            com.avito.android.advertising.ui.h hVar3 = com.avito.android.advertising.ui.h.f88704a;
            Context context2 = pVar.getView().getContext();
            hVar3.getClass();
            numE = com.avito.android.advertising.ui.h.e(R.attr.ic_openInNew24, context2);
        } else {
            numE = null;
        }
        pVar.S5(numE);
        if (pVar.getF88601c().b()) {
            uri2 = null;
        }
        pVar.I4(uri2);
        pVar.hH(pVar.getF88601c().b() ? null : buzzoolaButton.f88279b, buzzoolaButton.f88280c);
        pVar.a(new h(weakReference, buzzoolaPremiumBannerItem, i12, this, banner, new WeakReference(this.f87408e)));
        if (pVar.getF88601c().b()) {
            pVar.S3(null);
        } else {
            BuzzoolaLegal buzzoolaLegal2 = buzzoolaPremiumBannerItem.getBanner().f88243h;
            String str3 = buzzoolaLegal2 != null ? buzzoolaLegal2.f88292b : null;
            if (zA2) {
                BuzzoolaBanner.BuzzoolaPremium banner2 = buzzoolaPremiumBannerItem.getBanner();
                com.avito.android.advertising.ui.h hVar4 = com.avito.android.advertising.ui.h.f88704a;
                String str4 = banner2.f88244i;
                hVar4.getClass();
                strG = com.avito.android.advertising.ui.h.g(str4, banner2.f88241f);
            } else {
                strG = null;
            }
            pVar.S3(new ViewOnClickListenerC13236c(this, str3, strG, 16));
        }
        pVar.d(new i(pVar));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@Y61.k Kundle kundle) {
        kundle.j(this.f87411h, "buzzoola_premium_state");
    }
}
