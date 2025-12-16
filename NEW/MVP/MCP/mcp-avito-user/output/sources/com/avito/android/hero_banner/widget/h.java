package com.avito.android.hero_banner.widget;

import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.Y0;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.serp.adapter.search_bar.InterfaceC34826e;
import j.D;
import javax.inject.Inject;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import lI.C43638a;
import lI.C43639b;

/* compiled from: HeroBannerWidgetPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/h;", "Lcom/avito/android/hero_banner/widget/g;", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f161898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f161899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f161900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f161901e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f161902f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f161903g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final e2 f161904h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f161905i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f161906j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public l f161907k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public BxContentFragment.H f161908l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    @D
    public Integer f161909m;

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "toolbarAnimateProgress", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Float, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            h.this.f161901e.K5(Float.valueOf(f12.floatValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ui/status_bar/d;", "statusBarUpdate", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/ui/status_bar/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.ui.status_bar.d, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.ui.status_bar.d dVar) {
            h.this.f161905i.K5(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors;", "toolbarAnimateProgress", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search_bar/utils/UdfToolbarColors;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<UdfToolbarColors, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UdfToolbarColors udfToolbarColors) {
            h.this.f161902f.K5(udfToolbarColors);
            return G0.f406611a;
        }
    }

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "title", "subtitle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<String, String, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            String str3 = str;
            String strI = H.i(';', str3, str2);
            h hVar = h.this;
            hVar.f161899c.h(0, "hero_banner", strI, null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : null);
            hVar.f161898b.c(new C43639b(strI, str3));
            return G0.f406611a;
        }
    }

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/hero_banner/widget/k;", "newState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/hero_banner/widget/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<k, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(k kVar) {
            h.this.f161904h.K5(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: HeroBannerWidgetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "subtitle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.q<DeepLink, String, String, G0> {
        public f() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(DeepLink deepLink, String str, String str2) {
            String str3 = str;
            String strI = H.i(';', str3, str2);
            h hVar = h.this;
            d.a.a(hVar.f161899c, 0, "hero_banner", strI, null, null, null, null, null, 248);
            hVar.f161898b.c(new C43638a(strI, str3));
            hVar.f161903g.K5(deepLink);
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k C36135w2 c36135w2) {
        this.f161898b = interfaceC28373a;
        this.f161899c = gVar;
        this.f161900d = c36135w2;
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f161901e = f2.b(0, 1, bufferOverflow, 1);
        this.f161902f = f2.b(0, 1, bufferOverflow, 1);
        this.f161903g = f2.b(0, 1, bufferOverflow, 1);
        this.f161904h = f2.b(0, 1, bufferOverflow, 1);
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f161905i = z1A;
        this.f161906j = z1A;
    }

    @Override // com.avito.android.hero_banner.widget.g
    public final void d3(boolean z12) {
        l lVar = this.f161907k;
        if (lVar != null) {
            lVar.d3(z12);
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f161906j;
    }

    @Override // com.avito.android.hero_banner.widget.g
    @Y61.k
    public final InterfaceC43160i<UdfToolbarColors> e3() {
        return C43175k.a(this.f161902f);
    }

    @Override // com.avito.android.hero_banner.widget.g
    public final void f0() {
        l lVar = this.f161907k;
        if (lVar != null) {
            lVar.f0();
        }
        this.f161907k = null;
        this.f161908l = null;
    }

    @Override // com.avito.android.hero_banner.widget.g
    @Y61.k
    public final InterfaceC43160i<Float> f3() {
        return C43175k.a(this.f161901e);
    }

    @Override // com.avito.android.hero_banner.widget.g
    @Y61.k
    public final InterfaceC43160i<DeepLink> g3() {
        return C43175k.a(this.f161903g);
    }

    @Override // com.avito.android.hero_banner.widget.g
    @Y61.k
    public final InterfaceC43160i<k> h3() {
        return C43175k.a(this.f161904h);
    }

    @Override // com.avito.android.hero_banner.widget.g
    public final void hide() {
        BxContentFragment.H h12 = this.f161908l;
        if (h12 != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            Y0 y0K5 = bxContentFragment.K5();
            bxContentFragment.g6();
            y0K5.XB(false);
            if (bxContentFragment.g6()) {
                bxContentFragment.Z5().accept(new InterfaceC29127b.L0(UdfToolbarStyle.SearchInputHeightType.f264073b, UdfToolbarStyle.SearchInputRightMargin.f264077b, UdfToolbarStyle.CartIconRightMargin.f264065b, 1.0f));
                return;
            }
            InterfaceC34826e interfaceC34826e = bxContentFragment.f108969X2;
            if (interfaceC34826e == null) {
                interfaceC34826e = null;
            }
            interfaceC34826e.b();
        }
    }

    @Override // com.avito.android.hero_banner.widget.g
    public final void l4(@Y61.k l lVar, @Y61.k BxContentFragment.H h12) {
        Integer numValueOf = Integer.valueOf(R.id.hero_banner_shadow);
        this.f161907k = lVar;
        this.f161908l = h12;
        this.f161909m = numValueOf;
    }

    @Override // com.avito.android.hero_banner.widget.g
    public final void z3(boolean z12, @Y61.k HeroBannerWidgetItem heroBannerWidgetItem, boolean z13) {
        BxContentFragment.H h12 = this.f161908l;
        G0 g02 = null;
        if (h12 != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            Y0 y0K5 = bxContentFragment.K5();
            bxContentFragment.g6();
            y0K5.XB(true);
            if (bxContentFragment.g6()) {
                bxContentFragment.Z5().accept(new InterfaceC29127b.L0(UdfToolbarStyle.SearchInputHeightType.f264074c, UdfToolbarStyle.SearchInputRightMargin.f264078c, UdfToolbarStyle.CartIconRightMargin.f264066c, 0.9f));
            } else {
                InterfaceC34826e interfaceC34826e = bxContentFragment.f108969X2;
                if (interfaceC34826e == null) {
                    interfaceC34826e = null;
                }
                interfaceC34826e.f();
                bxContentFragment.f6();
                com.avito.android.bxcontent.toolbar_helper.a aVar = bxContentFragment.f108915I3;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.G(bxContentFragment.Z5().f112646N.getValue().f111141a.f112301D, null, true);
            }
        }
        l lVar = this.f161907k;
        if (lVar != null) {
            HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig f161887j = heroBannerWidgetItem.getF161887j();
            C36135w2 c36135w2 = this.f161900d;
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[31];
            lVar.kY(z12, new a(), new b(), f161887j, new c(), new d(), new e(), ((Boolean) c36135w2.f327459B.a().invoke()).booleanValue(), z13);
            lVar.Ve(heroBannerWidgetItem.getF161880c(), heroBannerWidgetItem.getF161881d(), new f());
            String f161886i = heroBannerWidgetItem.getF161886i();
            if (f161886i != null) {
                lVar.hd(f161886i);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                lVar.aR(heroBannerWidgetItem.getGradientColors());
            }
            Integer num = this.f161909m;
            if (num != null) {
                lVar.uV(num.intValue(), heroBannerWidgetItem.getF161884g());
            }
            lVar.f4(heroBannerWidgetItem.getF161882e());
            lVar.v1(heroBannerWidgetItem.getF161883f());
        }
    }
}
