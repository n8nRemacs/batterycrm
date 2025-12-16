package com.avito.android.advert.deeplinks;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.runtime.internal.P;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.NavigationSource;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.AdvertNavBarStyleKt;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.NavigationBarStyleKt;
import com.avito.android.util.H;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AdvertDetailsDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/deeplinks/i;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AdvertDetailsLink;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends AbstractC40161a<AdvertDetailsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f69021f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27793e f69022g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final L f69023h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.b f69024i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f69025j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f69026k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f69027l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdvertDetailsDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(i.this);
        }
    }

    @Inject
    public i(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC27793e interfaceC27793e, @Y61.k L l12, @Y61.k a.b bVar, @Y61.k com.avito.android.navigation.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f69021f = interfaceC4053a;
        this.f69022g = interfaceC27793e;
        this.f69023h = l12;
        this.f69024i = bVar;
        this.f69025j = aVar;
        this.f69026k = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AdvertNavBarStyle advertNavBarStyle;
        Image image;
        Integer numValueOf;
        String str2;
        DimmedImage dimmedImage;
        AdvertDetailsLink advertDetailsLink = (AdvertDetailsLink) deepLink;
        if (bundle != null) {
            AdvertNavBarStyle advertNavBarStyle2 = AdvertNavBarStyleKt.getAdvertNavBarStyle(bundle);
            if (advertNavBarStyle2 == null) {
                NavigationBarStyle serpNavigationBarStyle = NavigationBarStyleKt.getSerpNavigationBarStyle(bundle);
                advertNavBarStyle2 = serpNavigationBarStyle != null ? AdvertNavBarStyleKt.toAdvertNavBarStyle(serpNavigationBarStyle) : null;
            }
            advertNavBarStyle = advertNavBarStyle2;
        } else {
            advertNavBarStyle = null;
        }
        CalledFrom calledFromB = bundle != null ? H.b(bundle) : null;
        NavigationTabSetItem navigationTabSetItemA = this.f69025j.a();
        if (navigationTabSetItemA == null && calledFromB != null && calledFromB.c()) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        NavigationTabSetItem navigationTabSetItem = navigationTabSetItemA;
        ScreenSource screenSourceA = bundle != null ? (ScreenSource) bundle.getParcelable("screen_source") : null;
        if (screenSourceA == null) {
            ScreenSource.a aVar = ScreenSource.f251772c;
            String str3 = advertDetailsLink.f132949d;
            aVar.getClass();
            screenSourceA = ScreenSource.a.a(str3);
        }
        ScreenSource screenSource = screenSourceA;
        String string = bundle != null ? bundle.getString("title") : null;
        String string2 = bundle != null ? bundle.getString("price") : null;
        String string3 = bundle != null ? bundle.getString("normalized_price") : null;
        String string4 = bundle != null ? bundle.getString("old_price") : null;
        if (bundle == null || (dimmedImage = (DimmedImage) bundle.getParcelable("image")) == null || (image = dimmedImage.getImage()) == null) {
            image = advertDetailsLink.f132956k;
        }
        Image image2 = image;
        String string5 = bundle != null ? bundle.getString("key_category_id") : null;
        Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("active")) : null;
        TreeClickStreamParent treeClickStreamParent = bundle != null ? (TreeClickStreamParent) bundle.getParcelable("tree_parent") : null;
        if (bundle != null) {
            numValueOf = bundle.containsKey("gallery_position") ? Integer.valueOf(bundle.getInt("gallery_position")) : null;
        } else {
            numValueOf = null;
        }
        long j12 = bundle != null ? bundle.getLong("click_time") : SystemClock.elapsedRealtime();
        AdvertDetailsLink.Segment segment = advertDetailsLink.f132952g;
        if (segment == null) {
            segment = AdvertDetailsLink.Segment.f132963b;
        }
        AdvertDetailsLink.Segment segment2 = segment;
        AdvertDetailsLink.GigParams gigParams = advertDetailsLink.f132957l;
        Intent intentE = this.f69022g.e(advertDetailsLink.f132947b, advertDetailsLink.f132954i, advertDetailsLink.f132948c, string, string2, string3, string4, image2, string5, boolValueOf, advertDetailsLink.f132951f, treeClickStreamParent, j12, numValueOf, navigationTabSetItem, screenSource, advertDetailsLink.f132950e, segment2, advertDetailsLink.f132953h, advertNavBarStyle, advertDetailsLink.f132955j, gigParams != null ? gigParams.f132961b : null, gigParams != null ? gigParams.f132962c : null);
        if (bundle == null || !bundle.containsKey("with_up_intent")) {
            str2 = null;
        } else {
            str2 = null;
            intentE.putExtra("up_intent", L.a.a(this.f69023h, null, 3));
        }
        String string6 = bundle != null ? bundle.getString("DeepLinkNavigationSource") : str2;
        NavigationSource[] navigationSourceArr = NavigationSource.f134362b;
        boolean zF2 = kotlin.jvm.internal.L.f(string6, "Stories");
        a.InterfaceC4053a interfaceC4053a = this.f69021f;
        if ((zF2 || navigationTabSetItem == null) && advertDetailsLink.f132953h == null) {
            interfaceC4053a.J(intentE, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            j(AdvertDetailsLink.b.a.f132969b);
            interfaceC4053a.R(intentE, com.avito.android.deeplink_handler.view.b.f134588l);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wN2 = this.f69024i.Q().N(new a());
        l41.g gVar = new l41.g() { // from class: com.avito.android.advert.deeplinks.i.b
            @Override // l41.g
            public final void accept(Object obj) {
                i iVar = i.this;
                Intent intent = ((C47918a) obj).f437157c;
                String stringExtra = intent != null ? intent.getStringExtra("selected_page_from_stories") : null;
                if (stringExtra == null || stringExtra.length() == 0) {
                    iVar.j(AdvertDetailsLink.b.a.f132969b);
                } else {
                    iVar.j(new AdvertDetailsLink.b.C3984b(stringExtra));
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f69027l.b(wN2.v0(gVar, new l41.g() { // from class: com.avito.android.advert.deeplinks.i.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f69027l.e();
    }
}
