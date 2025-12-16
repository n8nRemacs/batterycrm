package com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar;

import Oi0.C14701e;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.remote.model.vertical_main.StyleBlockGradient;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.p;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.L;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import com.avito.android.ui.status_bar.d;
import hs0.r;
import hs0.s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import tl.InterfaceC48685a;

/* compiled from: VerticalFilterToolbarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/e;", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f113156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f113157c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f113158d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final M f113159e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f113160f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.c f113161g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C14701e f113162h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public h f113163i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public BxContentFragment.D f113164j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public InterfaceC48685a f113165k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public L f113166l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public VerticalPromoBlockItem.VerticalFilterItem f113167m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f113168n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Z1<com.avito.android.ui.status_bar.d> f113169o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final n2<com.avito.android.ui.status_bar.d> f113170p;

    @Inject
    public e(@k p pVar, @hs0.p @k com.avito.konveyor.adapter.h hVar, @k @r com.avito.konveyor.a aVar, @k M m12, @k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k com.avito.android.serp.adapter.vertical_main.c cVar, @s @k C14701e c14701e) {
        this.f113156b = pVar;
        this.f113157c = hVar;
        this.f113158d = aVar;
        this.f113159e = m12;
        this.f113160f = gVar;
        this.f113161g = cVar;
        this.f113162h = c14701e;
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f113169o = z1A;
        this.f113170p = C43175k.b(z1A);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a
    public final void T(@k h hVar, @k BxContentFragment.D d12, @k InterfaceC48685a interfaceC48685a) {
        this.f113163i = hVar;
        this.f113164j = d12;
        this.f113165k = interfaceC48685a;
        Banner bannerT1 = hVar.T1();
        C14701e c14701e = this.f113162h;
        com.avito.konveyor.adapter.h hVar2 = this.f113157c;
        this.f113166l = new L(bannerT1, hVar2, c14701e.a(hVar2), this.f113159e, this.f113158d, Integer.valueOf(R.id.content), Integer.valueOf(R.id.action), Integer.valueOf(R.id.promoContent), this.f113161g);
        io.reactivex.rxjava3.disposables.d dVarT0 = hVar.getF113110q().t0(new b(interfaceC48685a));
        io.reactivex.rxjava3.disposables.c cVar = this.f113168n;
        cVar.b(dVarT0);
        cVar.b(hVar.getF113114u().t0(new c(interfaceC48685a)));
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a
    public final void e(@l l1 l1Var) {
        L l12;
        StyleBlockGradient gradient;
        StyleBlockGradient gradient2;
        PromoStyle preset;
        VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem = l1Var instanceof VerticalPromoBlockItem.VerticalFilterItem ? (VerticalPromoBlockItem.VerticalFilterItem) l1Var : null;
        Z1<com.avito.android.ui.status_bar.d> z12 = this.f113169o;
        if (verticalFilterItem == null) {
            if (this.f113167m == null) {
                return;
            }
            z12.setValue(null);
            BxContentFragment.D d12 = this.f113164j;
            if (d12 != null) {
                BxContentFragment bxContentFragment = BxContentFragment.this;
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.a6(false, false);
                bxContentFragment.K5().FL(false);
                return;
            }
            return;
        }
        h hVar = this.f113163i;
        if (hVar == null || (l12 = this.f113166l) == null) {
            return;
        }
        if (this.f113167m == null) {
            this.f113160f.h(-1, verticalFilterItem.f272534f, verticalFilterItem.f272535g, null, null, (56 & 32) != 0 ? null : verticalFilterItem.f272546r, (56 & 64) != 0 ? null : verticalFilterItem.f272544p);
        }
        this.f113167m = verticalFilterItem;
        hVar.setTitle(verticalFilterItem.f272535g);
        StyleBlock styleBlock = verticalFilterItem.f272541m;
        Integer numValueOf = (styleBlock == null || (preset = styleBlock.getPreset()) == null) ? null : Integer.valueOf(this.f113161g.a(preset));
        if (numValueOf != null) {
            l12.yM(numValueOf.intValue(), R.layout.vertical_filter_toolbar_promo_block_content);
        }
        this.f113156b.h(l12, verticalFilterItem, -1);
        z12.setValue(new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.C9357d(R.color.vf_toolbar_gradient_bg_endColor)));
        BxContentFragment.D d13 = this.f113164j;
        if (d13 != null) {
            BxContentFragment bxContentFragment2 = BxContentFragment.this;
            BxContentFragment.C28907a c28907a2 = BxContentFragment.f108886v5;
            bxContentFragment2.a6(true, false);
            bxContentFragment2.K5().FL(true);
        }
        UniversalColor startColor = (styleBlock == null || (gradient2 = styleBlock.getGradient()) == null) ? null : gradient2.getStartColor();
        UniversalColor endColor = (styleBlock == null || (gradient = styleBlock.getGradient()) == null) ? null : gradient.getEndColor();
        hVar.a(startColor, endColor, styleBlock != null ? styleBlock.getIconColor() : null, new d(this));
        hVar.h(verticalFilterItem.f272542n == null);
        hVar.d(startColor, endColor);
    }

    @Override // com.avito.android.ui.status_bar.k
    @k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f113170p;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.a
    public final void f0() {
        this.f113169o.setValue(null);
        this.f113168n.e();
        this.f113163i = null;
        this.f113164j = null;
        this.f113166l = null;
        this.f113167m = null;
    }
}
