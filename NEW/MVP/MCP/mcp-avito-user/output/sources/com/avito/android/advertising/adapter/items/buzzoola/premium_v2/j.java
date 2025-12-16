package com.avito.android.advertising.adapter.items.buzzoola.premium_v2;

import Ca1.ViewOnClickListenerC13236c;
import Db.InterfaceC13381a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.buzzoola.premium.BuzzoolaPremiumItemState;
import com.avito.android.advertising.adapter.items.buzzoola.premium.BuzzoolaPremiumStates;
import com.avito.android.advertising.di.v;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaLegal;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaTextWithColor;
import com.avito.android.advertising.loaders.buzzoola.p;
import com.avito.android.cyclic_gallery_widget.image_carousel.q;
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

/* compiled from: BuzzoolaPremiumV2Presenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/f;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87470b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87471c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87472d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87473e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87474f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.ui.buzzoola.i f87475g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaPremiumStates f87476h;

    @Inject
    public j(@Y61.k h31.e<InterfaceC44739c> eVar, @v @Y61.l Kundle kundle, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC13381a interfaceC13381a) {
        BuzzoolaPremiumStates buzzoolaPremiumStates;
        this.f87470b = eVar;
        this.f87471c = cVar;
        this.f87472d = iVar;
        this.f87473e = aVar;
        this.f87474f = interfaceC13381a;
        this.f87476h = (kundle == null || (buzzoolaPremiumStates = (BuzzoolaPremiumStates) kundle.d("buzzoola_premiumv2_state")) == null) ? new BuzzoolaPremiumStates(null, 1, null) : buzzoolaPremiumStates;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numE;
        com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar2;
        com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar3;
        String str;
        com.avito.android.advertising.ui.buzzoola.premium_v2.c cVar = (com.avito.android.advertising.ui.buzzoola.premium_v2.c) eVar;
        BuzzoolaPremiumV2BannerItem buzzoolaPremiumV2BannerItem = (BuzzoolaPremiumV2BannerItem) aVar;
        BuzzoolaBanner.BuzzoolaPremiumV2 banner = buzzoolaPremiumV2BannerItem.getBanner();
        banner.getClass();
        boolean zA2 = p.a.a(banner);
        BuzzoolaPremiumItemState buzzoolaPremiumItemState = this.f87476h.f87380b.get(Long.valueOf(buzzoolaPremiumV2BannerItem.getF270085i()));
        h31.e<InterfaceC44739c> eVar2 = this.f87470b;
        WeakReference weakReference = new WeakReference(eVar2);
        if (this.f87474f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = cVar.getView();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, buzzoolaPremiumV2BannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(buzzoolaPremiumV2BannerItem.getBannerInfo(), i12);
        }
        cVar.H0();
        boolean zB2 = cVar.getF87108c().b();
        List listSubList = banner.f88247b;
        if (!zB2 && !listSubList.isEmpty()) {
            listSubList = listSubList.subList(0, 1);
        }
        BuzzoolaTextWithColor buzzoolaTextWithColor = banner.f88248c;
        String str2 = buzzoolaTextWithColor.f88310b;
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(ImageKt.toImage((Uri) C42745f0.E(listSubList)));
        if (banner.f88252g.f88280c) {
            com.avito.android.advertising.ui.h hVar2 = com.avito.android.advertising.ui.h.f88704a;
            Context context = cVar.getView().getContext();
            hVar2.getClass();
            numE = com.avito.android.advertising.ui.h.e(R.attr.ic_download24, context);
        } else {
            com.avito.android.advertising.ui.h hVar3 = com.avito.android.advertising.ui.h.f88704a;
            Context context2 = cVar.getView().getContext();
            hVar3.getClass();
            numE = com.avito.android.advertising.ui.h.e(R.attr.ic_openInNew24, context2);
        }
        boolean zB3 = cVar.getF87108c().b();
        Uri uri = banner.f88250e;
        Uri uri2 = zB3 ? null : uri;
        BuzzoolaTextWithColor buzzoolaTextWithColor2 = banner.f88249d;
        com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.a aVar4 = new com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.a(str2, aVarB, numE, uri2, buzzoolaTextWithColor.f88310b, buzzoolaTextWithColor.f88311c, buzzoolaTextWithColor2.f88310b, buzzoolaTextWithColor2.f88311c);
        List<Uri> listSubList2 = listSubList.subList(1, listSubList.size());
        ArrayList arrayList = new ArrayList(C42745f0.q(listSubList2, 10));
        for (Uri uri3 : listSubList2) {
            arrayList.add(new q(uri3.toString(), com.avito.android.image_loader.b.b(ImageKt.toImage(uri3)), null, null, null, false, false, null, null, 508, null));
        }
        BuzzoolaLegal buzzoolaLegal = banner.f88253h;
        if (buzzoolaLegal == null || !cVar.getF87108c().b() || (uri == null && buzzoolaLegal.f88292b.length() <= 0)) {
            aVar2 = null;
        } else {
            int i13 = buzzoolaLegal.f88294d;
            int i14 = buzzoolaLegal.f88293c;
            String str3 = buzzoolaLegal.f88292b;
            aVar2 = new com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a(i13, i14, banner.f88250e, str3, str3);
        }
        if (!zA2 || !cVar.getF87108c().b() || (str = banner.f88254i) == null || str.length() == 0) {
            aVar3 = null;
        } else {
            com.avito.android.advertising.ui.h.f88704a.getClass();
            String strG = com.avito.android.advertising.ui.h.g(str, banner.f88251f);
            if (strG == null) {
                strG = "";
            }
            aVar3 = new com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a(str, strG, buzzoolaLegal != null ? Integer.valueOf(buzzoolaLegal.f88294d) : null, buzzoolaLegal != null ? Integer.valueOf(buzzoolaLegal.f88293c) : null);
        }
        cVar.NG(aVar4, arrayList, aVar2, aVar3);
        cVar.H1(buzzoolaPremiumItemState != null ? buzzoolaPremiumItemState.f87379b : null);
        cVar.P1(new g(cVar, this, buzzoolaPremiumV2BannerItem));
        cVar.Q10(zA2);
        String strG2 = null;
        cVar.a(new h(weakReference, buzzoolaPremiumV2BannerItem, i12, this, banner, new WeakReference(this.f87473e)));
        if (cVar.getF87108c().b()) {
            cVar.S3(null);
        } else {
            BuzzoolaLegal buzzoolaLegal2 = buzzoolaPremiumV2BannerItem.getBanner().f88253h;
            String str4 = buzzoolaLegal2 != null ? buzzoolaLegal2.f88292b : null;
            if (zA2) {
                BuzzoolaBanner.BuzzoolaPremiumV2 banner2 = buzzoolaPremiumV2BannerItem.getBanner();
                com.avito.android.advertising.ui.h hVar4 = com.avito.android.advertising.ui.h.f88704a;
                String str5 = banner2.f88254i;
                hVar4.getClass();
                strG2 = com.avito.android.advertising.ui.h.g(str5, banner2.f88251f);
            }
            cVar.S3(new ViewOnClickListenerC13236c(this, str4, strG2, 17));
        }
        cVar.d(new i(cVar));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@Y61.k Kundle kundle) {
        kundle.j(this.f87476h, "buzzoola_premiumv2_state");
    }
}
