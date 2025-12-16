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
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.serp.adapter.advert_xl.C34686f;
import com.avito.android.serp.adapter.p1;
import com.avito.android.serp.adapter.rich_snippets.AdvertGalleryState;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/O;", "Lcom/avito/android/serp/adapter/rich_snippets/service/B;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class O implements B {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f271283b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f271284c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f271285d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f271286e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271287f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f271288g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final SearchParams f271289h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final p1 f271290i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AdvertGalleryState f271291j;

    public /* synthetic */ O(h31.e eVar, h31.e eVar2, Kundle kundle, h31.e eVar3, com.avito.android.async_phone.A a12, InterfaceC28373a interfaceC28373a, C36135w2 c36135w2, InterfaceC34864v0 interfaceC34864v0, SearchParams searchParams, p1 p1Var, int i12, C42822w c42822w) {
        this(eVar, eVar2, kundle, eVar3, a12, interfaceC28373a, interfaceC34864v0, (i12 & 256) != 0 ? null : searchParams, (i12 & 512) != 0 ? null : p1Var);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<AdvertAction> actions;
        v vVar = (v) eVar;
        AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
        Map<String, String> map = advertXlItem.f268749B;
        if (map != null && !map.isEmpty()) {
            this.f271287f.c(new C28417h(map));
        }
        List<ConstructorAdvertGalleryItemModel> list = advertXlItem.f268781e;
        String str = advertXlItem.f268777c;
        com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b bVarC = C13523a.c(str, list);
        if (bVarC != null) {
            vVar.k4(Collections.singletonList(bVarC));
        } else {
            vVar.k4(C42784z0.f406748b);
        }
        List<? extends com.avito.android.image_loader.k> listA = C34686f.a(advertXlItem);
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        List<? extends com.avito.android.image_loader.k> list2 = listA;
        if (!list2.isEmpty()) {
            vVar.i3(listA);
            vVar.H1(this.f271291j.a(str));
        } else if (bVarC != null) {
            vVar.i3(C42784z0.f406748b);
        } else {
            vVar.w4();
        }
        vVar.setTitle(advertXlItem.f268793k);
        vVar.z3(advertXlItem.f268808t, advertXlItem.f268753F, advertXlItem.f268754G);
        vVar.D0(advertXlItem.f268766S);
        vVar.ee(advertXlItem.f268814z);
        vVar.h(advertXlItem.f268795l);
        vVar.C(advertXlItem.f268806r);
        ArrayList arrayList = null;
        List<GeoReference> list3 = advertXlItem.f268765R;
        GeoReference geoReference = list3 != null ? (GeoReference) C42745f0.E(list3) : null;
        if ((geoReference != null ? geoReference.getAfterWithIcon() : null) != null) {
            vVar.t80(geoReference.getContent(), list3 != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list3) : null);
            AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
            vVar.S0(afterWithIcon != null ? afterWithIcon.getIconName() : null);
            AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
            vVar.E0(afterWithIcon2 != null ? afterWithIcon2.getText() : null);
        } else {
            vVar.t80(advertXlItem.f268805q, list3 != null ? com.avito.android.serp.adapter.rich_snippets.job.k.a(list3) : null);
            vVar.S0(null);
            vVar.E0(advertXlItem.f268767T);
        }
        vVar.jb(advertXlItem.f268783f, (list2.isEmpty() && bVarC == null) ? false : true);
        vVar.setActive(advertXlItem.f268756I);
        vVar.q7(advertXlItem.f268760M, !list2.isEmpty());
        SerpBadgeBar serpBadgeBar = advertXlItem.f268762O;
        vVar.vd(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
        AdvertActions advertActions = advertXlItem.f268752E;
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
        AdvertSellerInfo advertSellerInfo = advertXlItem.f268764Q;
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
        h31.e<InterfaceC28616b> eVar2 = this.f271285d;
        if (eVar2.get().N6()) {
            this.f271286e.n(vVar, str);
        } else {
            eVar2.get().L6(advertXlItem, vVar);
        }
        vVar.H0();
        vVar.P5(new E(advertXlItem, vVar, this));
        vVar.iu(new F(advertXlItem, this));
        vVar.Bt(new H(advertXlItem, this, advertXlItem, vVar));
        vVar.Fo(new I(advertXlItem, this));
        vVar.sR(new J(advertXlItem, vVar, this));
        vVar.cw(new K(advertSellerInfo, this));
        vVar.l5(new L(advertXlItem, this));
        vVar.R0(new M(this, advertXlItem, i12, advertXlItem));
        vVar.a1(new N(this, advertXlItem, i12, advertXlItem));
        vVar.q4(new C(this, advertXlItem, i12));
        vVar.d(new D(vVar, this, vVar, advertXlItem, advertXlItem));
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f271291j, "advert_xl_gallery_state");
        return kundle;
    }

    @Inject
    public O(@Y61.k h31.e eVar, @Y61.k h31.e eVar2, @Y61.l @InterfaceC30073i7 Kundle kundle, @Y61.k h31.e eVar3, @Y61.k com.avito.android.async_phone.A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.l SearchParams searchParams, @Y61.l p1 p1Var) {
        AdvertGalleryState advertGalleryState;
        this.f271283b = eVar;
        this.f271284c = eVar2;
        this.f271285d = eVar3;
        this.f271286e = a12;
        this.f271287f = interfaceC28373a;
        this.f271288g = interfaceC34864v0;
        this.f271289h = searchParams;
        this.f271290i = p1Var;
        this.f271291j = (kundle == null || (advertGalleryState = (AdvertGalleryState) kundle.d("advert_xl_gallery_state")) == null) ? new AdvertGalleryState(null, 1, null) : advertGalleryState;
    }
}
