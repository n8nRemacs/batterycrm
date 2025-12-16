package com.avito.android.serp.adapter.rich_snippets.service;

import Er0.C13523a;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28417h;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.serp.adapter.rich_snippets.AdvertGalleryState;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/s;", "Lcom/avito/android/serp/adapter/rich_snippets/service/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements InterfaceC34807e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f271371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f271372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f271373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f271374e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271375f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f271376g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f271377h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final SearchParams f271378i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final p1 f271379j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AdvertGalleryState f271380k;

    @Inject
    public s(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar2, @Y61.l @InterfaceC30073i7 Kundle kundle, @Y61.k h31.e<InterfaceC28616b> eVar3, @Y61.k com.avito.android.async_phone.A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C36135w2 c36135w2, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.l SearchParams searchParams, @Y61.l p1 p1Var) {
        AdvertGalleryState advertGalleryState;
        this.f271371b = eVar;
        this.f271372c = eVar2;
        this.f271373d = eVar3;
        this.f271374e = a12;
        this.f271375f = interfaceC28373a;
        this.f271376g = c36135w2;
        this.f271377h = interfaceC34864v0;
        this.f271378i = searchParams;
        this.f271379j = p1Var;
        this.f271380k = (kundle == null || (advertGalleryState = (AdvertGalleryState) kundle.d("advert_gallery_state")) == null) ? new AdvertGalleryState(null, 1, null) : advertGalleryState;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<? extends com.avito.android.image_loader.k> listM0;
        List<AdvertAction> actions;
        v vVar = (v) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        Map<String, String> map = advertItem.f268398P;
        if (map != null && !map.isEmpty()) {
            this.f271375f.c(new C28417h(map));
        }
        List<ConstructorAdvertGalleryItemModel> list = advertItem.f268406T;
        String str = advertItem.f268425c;
        com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b bVarC = C13523a.c(str, list);
        if (bVarC != null) {
            vVar.k4(Collections.singletonList(bVarC));
        } else {
            vVar.k4(C42784z0.f406748b);
        }
        List listA = list != null ? C13523a.a(list) : advertItem.f268404S;
        ArrayList arrayList = null;
        if (O2.a(listA)) {
            ArrayList arrayList2 = new ArrayList();
            if (listA != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.avito.android.image_loader.b.a((DimmedImage) it.next()));
                }
            }
            listM0 = C42745f0.M0(arrayList2);
        } else {
            listM0 = null;
        }
        if (listM0 == null) {
            listM0 = C42784z0.f406748b;
        }
        List<? extends com.avito.android.image_loader.k> list2 = listM0;
        if (!list2.isEmpty()) {
            vVar.i3(listM0);
            vVar.H1(this.f271380k.a(str));
        } else if (bVarC != null) {
            vVar.i3(C42784z0.f406748b);
        } else {
            vVar.w4();
        }
        vVar.setTitle(advertItem.f268428d);
        vVar.z3(advertItem.f268440i, advertItem.f268436g, advertItem.f268438h);
        vVar.D0(advertItem.f268429d0);
        vVar.ee(advertItem.f268452o);
        vVar.h(advertItem.f268434f);
        vVar.C(advertItem.f268466v);
        List<GeoReference> list3 = advertItem.f268426c0;
        GeoReference geoReference = list3 != null ? (GeoReference) C42745f0.E(list3) : null;
        if ((geoReference != null ? geoReference.getAfterWithIcon() : null) != null) {
            vVar.t80(geoReference.getContent(), list3 != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list3) : null);
            AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
            vVar.S0(afterWithIcon != null ? afterWithIcon.getIconName() : null);
            AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
            vVar.E0(afterWithIcon2 != null ? afterWithIcon2.getText() : null);
        } else {
            vVar.t80(advertItem.f268462t, list3 != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list3) : null);
            vVar.S0(null);
            vVar.E0(advertItem.f268464u);
        }
        vVar.jb(advertItem.f268380G, (list2.isEmpty() && bVarC == null) ? false : true);
        vVar.setActive(advertItem.f268376E);
        vVar.q7(advertItem.f268394N, !list2.isEmpty());
        SerpBadgeBar serpBadgeBar = advertItem.f268416Y;
        vVar.vd(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
        AdvertActions advertActions = advertItem.f268408U;
        if (advertActions != null && (actions = advertActions.getActions()) != null) {
            arrayList = new ArrayList();
            for (Object obj : actions) {
                AdvertAction advertAction = (AdvertAction) obj;
                if ((advertAction instanceof AdvertAction.Phone) || (advertAction instanceof AdvertAction.Messenger) || (advertAction instanceof AdvertAction.Booking) || (advertAction instanceof AdvertAction.ServiceOrderRequest)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            vVar.W2();
        } else {
            vVar.h2(arrayList);
        }
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        if (advertSellerInfo != null) {
            String name = advertSellerInfo.getName();
            if (name == null) {
                name = "";
            }
            String str2 = name;
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(advertSellerInfo.getImage());
            SerpBadgeBar badgeBar = advertSellerInfo.getBadgeBar();
            Boolean boolIsShop = advertSellerInfo.isShop();
            vVar.kq(str2, aVarB, badgeBar, boolIsShop != null ? boolIsShop.booleanValue() : false, advertSellerInfo.getRating());
        } else {
            vVar.RF();
        }
        h31.e<InterfaceC28616b> eVar2 = this.f271373d;
        if (eVar2.get().N6()) {
            this.f271374e.n(vVar, str);
        } else {
            eVar2.get().L6(advertItem, vVar);
        }
        vVar.H0();
        vVar.P5(new C34811i(advertItem, advertItem, this, vVar));
        vVar.iu(new C34812j(advertItem, this));
        vVar.Bt(new C34814l(advertItem, advertItem, this, vVar));
        vVar.Fo(new C34815m(advertItem, this));
        vVar.sR(new C34816n(advertItem, vVar, this));
        vVar.cw(new C34817o(advertSellerInfo, this));
        vVar.l5(new C34818p(advertItem, this));
        vVar.R0(new C34819q(this, advertItem, i12, advertItem));
        vVar.a1(new r(this, advertItem, i12, advertItem));
        vVar.q4(new C34808f(this, advertItem, i12));
        vVar.d(new C34809g(vVar, this, vVar, advertItem, advertItem));
        if (this.f271376g.v().invoke().booleanValue()) {
            vVar.Z70(new C34810h(this));
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f271380k, "advert_gallery_state");
        return kundle;
    }

    public /* synthetic */ s(h31.e eVar, h31.e eVar2, Kundle kundle, h31.e eVar3, com.avito.android.async_phone.A a12, InterfaceC28373a interfaceC28373a, C36135w2 c36135w2, InterfaceC34864v0 interfaceC34864v0, SearchParams searchParams, p1 p1Var, int i12, C42822w c42822w) {
        this(eVar, eVar2, kundle, eVar3, a12, interfaceC28373a, c36135w2, interfaceC34864v0, (i12 & 256) != 0 ? null : searchParams, (i12 & 512) != 0 ? null : p1Var);
    }
}
