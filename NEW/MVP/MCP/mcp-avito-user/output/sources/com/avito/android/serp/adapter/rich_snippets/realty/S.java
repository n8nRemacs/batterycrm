package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cyclic_gallery_widget.image_carousel.ActionType;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.serp.adapter.rich_snippets.AdvertGalleryState;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: DevelopmentXlRichItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/S;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/I;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class S implements I {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270957b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f270958c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f270959d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f270960e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AdvertGalleryState f270961f;

    @Inject
    public S(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l @InterfaceC30073i7 Kundle kundle, @Y61.k C36135w2 c36135w2, @Y61.k com.avito.android.account.E e12) {
        AdvertGalleryState advertGalleryState;
        this.f270957b = eVar;
        this.f270958c = interfaceC28373a;
        this.f270959d = c36135w2;
        this.f270960e = e12;
        this.f270961f = (kundle == null || (advertGalleryState = (AdvertGalleryState) kundle.d("development_xl_gallery_state")) == null) ? new AdvertGalleryState(null, 1, null) : advertGalleryState;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<AdvertAction> actions;
        InterfaceC34777w interfaceC34777w = (InterfaceC34777w) eVar;
        DevelopmentXlItem developmentXlItem = (DevelopmentXlItem) aVar;
        interfaceC34777w.setTitle(developmentXlItem.f270914d);
        interfaceC34777w.p(developmentXlItem.f270916f);
        List<Image> list = developmentXlItem.f270921k;
        if (list == null || !(!list.isEmpty())) {
            interfaceC34777w.w4();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.avito.android.image_loader.b.b((Image) it.next()));
            }
            interfaceC34777w.i3(C42745f0.M0(arrayList));
            interfaceC34777w.H1(this.f270961f.a(developmentXlItem.f270913c));
        }
        List<String> list2 = developmentXlItem.f270925o;
        if (list2 != null) {
            interfaceC34777w.aY(C42745f0.O(list2, "\n", null, null, null, 62));
        }
        Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> setP0 = null;
        List<GeoReference> list3 = developmentXlItem.f270924n;
        interfaceC34777w.Q5(list3 != null ? (GeoReference) C42745f0.E(list3) : null);
        SerpBadgeBar serpBadgeBar = developmentXlItem.f270926p;
        interfaceC34777w.d4(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
        DeveloperProfile developerProfile = developmentXlItem.f270927q;
        if (developerProfile != null) {
            interfaceC34777w.FR(new J(this), developerProfile);
        } else {
            interfaceC34777w.vb(developmentXlItem.f270915e);
        }
        AdvertActions advertActions = developmentXlItem.f270922l;
        if (advertActions != null && (actions = advertActions.getActions()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AdvertAction advertAction : actions) {
                com.avito.android.cyclic_gallery_widget.image_carousel.a aVar2 = advertAction instanceof AdvertAction.Messenger ? new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131987f, advertAction.getTitle(), 0, null, 12, null) : advertAction instanceof AdvertAction.Phone ? new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131985d, advertAction.getTitle(), 0, null, 12, null) : null;
                if (aVar2 != null) {
                    arrayList2.add(aVar2);
                }
            }
            setP0 = C42745f0.P0(C42745f0.B0(arrayList2, new U()));
        }
        Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set = setP0;
        if (set == null || set.isEmpty()) {
            interfaceC34777w.W2();
        } else {
            interfaceC34777w.wd(setP0);
        }
        interfaceC34777w.setPhoneLoadingState(PhoneLoadingState.f430441b);
        interfaceC34777w.H0();
        interfaceC34777w.P5(new K(developmentXlItem, this));
        interfaceC34777w.Ls(new L(developmentXlItem, this));
        interfaceC34777w.dv(new M(developmentXlItem, this));
        interfaceC34777w.P1(new N(this, developmentXlItem, interfaceC34777w));
        interfaceC34777w.p7(new O(developmentXlItem, this));
        interfaceC34777w.d(new P(interfaceC34777w));
        if (this.f270959d.v().invoke().booleanValue()) {
            interfaceC34777w.Z70(new Q(this));
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f270961f, "development_gallery_state");
        return kundle;
    }
}
