package com.avito.android.serp.adapter.search_bar;

import BX.a;
import android.view.KeyEvent;
import android.view.View;
import androidx.view.C23038g0;
import androidx.view.C23071x;
import androidx.view.InterfaceC22983P;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import com.avito.android.search_view.SubscriptionButtonState;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.serp.adapter.search_bar.H;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import l41.InterfaceC43543a;
import rn0.InterfaceC47690b;
import ur.InterfaceC49101b;

/* compiled from: SearchBarItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/t;", "Lcom/avito/android/serp/adapter/search_bar/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.search_bar.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34840t implements InterfaceC34826e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f271660a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.p f271661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f271662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34825d> f271663d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f271664e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271665f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Rp0.b f271666g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delayed_ux_feedback.d f271667h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f271668i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f271669j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f271670k;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public M f271672m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f271673n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L f271674o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.android.ticket_view.g f271675p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public CX.a f271676q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public List<UxFeedbackConfigOld> f271677r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f271678s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public SearchSuggestInternalShowLink f271679t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f271681v;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f271671l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<com.avito.android.loyalty_program.loyalty_entry_view.utils.b> f271680u = new com.jakewharton.rxrelay3.b<>();

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.t$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SearchBarItem f271683m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchBarItem searchBarItem) {
            super(0);
            this.f271683m = searchBarItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            String strD80;
            C34840t c34840t = C34840t.this;
            M m12 = c34840t.f271672m;
            SearchBarItem searchBarItem = this.f271683m;
            if (m12 == null || (strD80 = m12.D80()) == null) {
                strD80 = searchBarItem.f271614h.f264137c;
            }
            b.a.a(c34840t.f271669j, SearchSuggestInternalShowLink.a(searchBarItem.f271614h, strD80), null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.t$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SearchSuggestInternalShowLink f271685m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SearchSuggestInternalShowLink searchSuggestInternalShowLink) {
            super(0);
            this.f271685m = searchSuggestInternalShowLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(C34840t.this.f271669j, this.f271685m, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/utils/b;", "kotlin.jvm.PlatformType", "onboardingParams", "Lkotlin/G0;", "accept", "(Lcom/avito/android/loyalty_program/loyalty_entry_view/utils/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.t$c */
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.loyalty_program.loyalty_entry_view.utils.b, G0> f271686b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C34840t f271687c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super com.avito.android.loyalty_program.loyalty_entry_view.utils.b, G0> lVar, C34840t c34840t) {
            this.f271686b = lVar;
            this.f271687c = c34840t;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.loyalty_program.loyalty_entry_view.utils.b bVar = (com.avito.android.loyalty_program.loyalty_entry_view.utils.b) obj;
            this.f271686b.invoke(bVar);
            CX.a aVar = this.f271687c.f271676q;
            if (aVar != null) {
                aVar.f2201a.accept(new a.b(bVar.f184194b.getOnceShowId()));
            }
        }
    }

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.search_bar.t$d */
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f271688b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("SearchBarItemPresenter", "Error loyalty show onboarding " + ((Throwable) obj));
        }
    }

    @Inject
    public C34840t(@Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, @Y61.k com.avito.android.serp.adapter.vertical_main.p pVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e<InterfaceC34825d> eVar, @Y61.k h31.e<InterfaceC47690b> eVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Rp0.b bVar, @Y61.k com.avito.android.delayed_ux_feedback.d dVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f271660a = n12;
        this.f271661b = pVar;
        this.f271662c = interfaceC35745a5;
        this.f271663d = eVar;
        this.f271664e = eVar2;
        this.f271665f = interfaceC28373a;
        this.f271666g = bVar;
        this.f271667h = dVar;
        this.f271668i = xVar;
        this.f271669j = aVar;
        this.f271670k = interfaceC49101b;
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void a(@Y61.k com.avito.android.search_view.k kVar, float f12) {
        C31100l2 c31100l2;
        M m12 = this.f271672m;
        if (m12 == null || (c31100l2 = m12.f271603d) == null) {
            return;
        }
        c31100l2.f174866f.a(kVar, f12);
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void b() {
        C31100l2 c31100l2;
        M m12 = this.f271672m;
        if (m12 == null || (c31100l2 = m12.f271603d) == null) {
            return;
        }
        c31100l2.f174866f.b();
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void c(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        M m12 = this.f271672m;
        if (m12 != null) {
            m12.f271604e.l(bVar);
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void d(boolean z12) {
        this.f271673n = z12;
        if (z12) {
            M m12 = this.f271672m;
            if (m12 != null) {
                m12.f271603d.f174866f.p(SubscriptionButtonState.f264430b);
                return;
            }
            return;
        }
        M m13 = this.f271672m;
        if (m13 != null) {
            m13.f271603d.f174866f.p(SubscriptionButtonState.f264431c);
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void e(@Y61.k M m12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.ticket_view.mvi.n nVar, @Y61.k CX.b bVar, @Y61.k com.avito.android.onboarding_manager.e eVar, boolean z17, @Y61.k final Y41.l lVar) {
        InterfaceC35745a5 interfaceC35745a5;
        Toolbar23SearchView toolbar23SearchView;
        View viewB80;
        View viewB;
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12;
        View viewC80;
        View viewB2;
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l13;
        this.f271681v = false;
        this.f271672m = m12;
        this.f271673n = false;
        InterfaceC35745a5 interfaceC35745a52 = this.f271662c;
        io.reactivex.rxjava3.disposables.c cVar = this.f271671l;
        if (z12) {
            C31100l2 c31100l2 = m12.f271603d;
            c31100l2.f174866f.h();
            c31100l2.c();
            com.avito.android.search_view.v vVar = c31100l2.f174866f;
            vVar.x();
            vVar.w();
            vVar.l(y6.b(16), y6.b(4));
            interfaceC35745a5 = interfaceC35745a52;
        } else {
            if (z14) {
                interfaceC35745a5 = interfaceC35745a52;
            } else {
                interfaceC35745a5 = interfaceC35745a52;
                this.f271674o = new com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L(interfaceC22983P, this.f271660a, false, 4, null);
                M m13 = this.f271672m;
                if (m13 != null && (viewB2 = m13.f271603d.b()) != null && (l13 = this.f271674o) != null) {
                    cVar.b(l13.c(viewB2).t0(new C34832k(this)));
                }
                this.f271660a.f176464O.observe(interfaceC22983P, new H.a(new C34834m(this)));
                m12.E80(z14, z15, z16);
            }
            if (!z15) {
                com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l14 = new com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L(interfaceC22983P, this.f271660a, false, 4, null);
                this.f271674o = l14;
                this.f271675p = new com.avito.android.ticket_view.g(nVar);
                m12.E80(z14, z15, z16);
                C23038g0 c23038g0 = l14.f176456a.f176464O;
                M m14 = this.f271672m;
                if (m14 != null && (viewC80 = m14.C80()) != null) {
                    cVar.b(C37722i.a(viewC80).K(new C34837p(nVar, this)).s0());
                }
                M m15 = this.f271672m;
                if (m15 != null && (viewB = m15.f271603d.b()) != null && (l12 = this.f271674o) != null) {
                    cVar.b(l12.c(viewB).t0(new C34838q(this)));
                }
                com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new C34839s(this, nVar, null), C43175k.r(new C1(nVar.getState(), C23071x.a(c23038g0), new r(3, null)))));
            }
            if (z16) {
                toolbar23SearchView = null;
            } else {
                this.f271676q = new CX.a(bVar);
                M m16 = this.f271672m;
                if (m16 != null && (viewB80 = m16.B80()) != null) {
                    cVar.b(C37722i.a(viewB80).K(new C34835n(bVar)).s0());
                }
                toolbar23SearchView = null;
                com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new C34836o(this, eVar, null), bVar.getState()));
                m12.E80(z14, z15, z16);
            }
            cVar.b(C35896f0.g(m12.f271603d.f174866f.e5(), new C34827f(this)));
            C31100l2 c31100l22 = m12.f271603d;
            if (z13) {
                c31100l22.f174866f.w();
            } else {
                c31100l22.c();
            }
            m12.G80();
            d(this.f271673n);
            M m17 = this.f271672m;
            if (m17 != null) {
                C31100l2 c31100l23 = m17.f271603d;
                I0 i0J0 = c31100l23.f174869i.j0(interfaceC35745a5.e());
                x xVar = new x(this);
                l41.g<? super Throwable> gVar = y.f271693b;
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar.b(i0J0.v0(xVar, gVar, interfaceC43543a));
                cVar.b(c31100l23.f174871k.j0(interfaceC35745a5.e()).v0(new z(this), A.f271578b, interfaceC43543a));
                cVar.b(c31100l23.f174866f.q().j0(interfaceC35745a5.e()).v0(new B(this), C.f271580b, interfaceC43543a));
                cVar.b(c31100l23.f174868h.j0(interfaceC35745a5.e()).v0(new D(this), E.f271582b, interfaceC43543a));
                cVar.b(c31100l23.a().j0(interfaceC35745a5.e()).v0(new F(this), C34841u.f271689b, interfaceC43543a));
                cVar.b(c31100l23.f174866f.s().j0(interfaceC35745a5.e()).v0(new v(this), w.f271691b, interfaceC43543a));
            }
            if (z17) {
                com.avito.android.search_view.v vVar2 = c31100l22.f174866f;
                Toolbar23SearchView toolbar23SearchView2 = vVar2 instanceof Toolbar23SearchView ? (Toolbar23SearchView) vVar2 : toolbar23SearchView;
                if (toolbar23SearchView2 != null) {
                    toolbar23SearchView2.setLeftButtonVisibility(true);
                }
            }
        }
        cVar.b(C35896f0.g(m12.f271603d.f174866f.z(), new C34828g(this)));
        cVar.b(this.f271661b.d().j0(interfaceC35745a5.e()).v0(new C34829h(m12), C34830i.f271639b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(m12.f271603d.f174870j.j0(interfaceC35745a5.e()).t0(new l41.g() { // from class: com.avito.android.serp.adapter.search_bar.j
            @Override // l41.g
            public final void accept(Object obj) {
                lVar.invoke((com.avito.android.search.p) obj);
            }
        }));
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void f() {
        C31100l2 c31100l2;
        this.f271681v = true;
        M m12 = this.f271672m;
        if (m12 == null || (c31100l2 = m12.f271603d) == null) {
            return;
        }
        com.avito.android.search_view.v vVar = c31100l2.f174866f;
        com.avito.android.search_view.h hVar = vVar instanceof com.avito.android.search_view.h ? (com.avito.android.search_view.h) vVar : null;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void g() {
        M m12 = this.f271672m;
        if (m12 != null) {
            m12.f271603d.f174866f.close();
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void h(@Y61.l List<UxFeedbackConfigOld> list) {
        this.f271677r = list;
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void i(boolean z12, @Y61.l NavigationBarStyle.DisplayType displayType) {
        int i12;
        M m12 = this.f271672m;
        if (m12 != null) {
            KeyEvent.Callback callback = m12.f271602c;
            boolean z13 = callback instanceof Toolbar23SearchView;
            if (z13 && (displayType instanceof NavigationBarStyle.DisplayType.LogoWithSearchInput)) {
                i12 = R.dimen.redesign_23_search_view_padding_bottom_visible_toolbar_logo;
            } else if (z13 && (displayType instanceof NavigationBarStyle.DisplayType.SearchWithActionTitle)) {
                i12 = R.dimen.redesign_23_search_view_padding_bottom_visible_search_with_action_title;
            } else if (z13 && z12) {
                i12 = R.dimen.redesign_23_search_view_padding_bottom_visible_inlines;
            } else if (!z13 || z12) {
                return;
            } else {
                i12 = R.dimen.redesign_23_search_view_padding_bottom_hidden_inlines;
            }
            com.avito.android.search_view.h hVar = callback instanceof com.avito.android.search_view.h ? (com.avito.android.search_view.h) callback : null;
            if (hVar != null) {
                hVar.r(((Toolbar23SearchView) callback).getResources().getDimensionPixelSize(i12));
            }
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void invalidate() {
        this.f271671l.e();
        this.f271672m = null;
        this.f271674o = null;
        this.f271675p = null;
        this.f271676q = null;
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void j(@Y61.k SearchBarItem searchBarItem) {
        C31100l2 c31100l2;
        C31100l2 c31100l22;
        G0 g02;
        Boolean bool;
        M m12;
        C31100l2 c31100l23;
        C31100l2 c31100l24;
        SearchSuggestInternalShowLink searchSuggestInternalShowLink = searchBarItem.f271614h;
        if (searchSuggestInternalShowLink == null || !this.f271670k.d()) {
            M m13 = this.f271672m;
            if (m13 != null && (c31100l22 = m13.f271603d) != null) {
                c31100l22.j(true);
            }
            M m14 = this.f271672m;
            if (m14 != null && (c31100l2 = m14.f271603d) != null) {
                c31100l2.f174866f.k();
            }
        } else {
            this.f271679t = searchSuggestInternalShowLink;
            M m15 = this.f271672m;
            if (m15 != null && (c31100l24 = m15.f271603d) != null) {
                c31100l24.j(false);
            }
            M m16 = this.f271672m;
            if (m16 != null && (c31100l23 = m16.f271603d) != null) {
                c31100l23.f174866f.setInputClickListener(new a(searchBarItem));
            }
        }
        if (searchBarItem.f271613g) {
            return;
        }
        this.f271673n = searchBarItem.f271609c;
        Boolean bool2 = searchBarItem.f271611e;
        if (bool2 != null && (bool = searchBarItem.f271612f) != null && (m12 = this.f271672m) != null) {
            boolean zBooleanValue = bool2.booleanValue();
            boolean zBooleanValue2 = true ^ bool.booleanValue();
            C31100l2 c31100l25 = m12.f271603d;
            c31100l25.f174866f.j(zBooleanValue);
            c31100l25.e(zBooleanValue, zBooleanValue2);
        }
        M m17 = this.f271672m;
        if (m17 != null) {
            String str = searchBarItem.f271610d;
            if (str == null) {
                str = "";
            }
            m17.f271603d.i(str);
        }
        String str2 = searchBarItem.f271608b;
        if (str2 != null) {
            M m18 = this.f271672m;
            if (m18 != null) {
                m18.F80(str2);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 != null) {
                return;
            }
        }
        M m19 = this.f271672m;
        if (m19 != null) {
            m19.G80();
            G0 g03 = G0.f406611a;
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void k(boolean z12) {
        M m12 = this.f271672m;
        if (m12 != null) {
            m12.f271604e.f271599b = z12;
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void l(boolean z12, @Y61.l SearchSuggestInternalShowLink searchSuggestInternalShowLink) {
        if (searchSuggestInternalShowLink == null) {
            searchSuggestInternalShowLink = this.f271679t;
        }
        if (searchSuggestInternalShowLink == null) {
            M m12 = this.f271672m;
            if (m12 != null) {
                C31100l2 c31100l2 = m12.f271603d;
                if (z12) {
                    c31100l2.f174866f.o();
                    return;
                } else {
                    c31100l2.f174866f.c();
                    return;
                }
            }
            return;
        }
        M m13 = this.f271672m;
        String strD80 = m13 != null ? m13.D80() : null;
        if (strD80 == null) {
            strD80 = "";
        }
        SearchSuggestInternalShowLink searchSuggestInternalShowLinkA = SearchSuggestInternalShowLink.a(searchSuggestInternalShowLink, strD80);
        if (!z12) {
            b.a.a(this.f271669j, searchSuggestInternalShowLinkA, null, null, 6);
            return;
        }
        M m14 = this.f271672m;
        if (m14 != null) {
            J j12 = new J(new b(searchSuggestInternalShowLinkA));
            View view = m14.f271602c;
            view.postDelayed(j12, 300L);
            view.addOnAttachStateChangeListener(new K(view, j12));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void m(@Y61.k Y41.l<? super com.avito.android.loyalty_program.loyalty_entry_view.utils.b, G0> lVar) {
        com.jakewharton.rxrelay3.b<com.avito.android.loyalty_program.loyalty_entry_view.utils.b> bVar = this.f271680u;
        bVar.getClass();
        this.f271671l.b(new C41981q0(bVar).j0(this.f271662c.e()).v0(new c(lVar, this), d.f271688b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void n(@Y61.l String str, @Y61.l String str2) {
        this.f271660a.oe(str, str2);
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34826e
    public final void o() {
        M m12 = this.f271672m;
        if (m12 != null) {
            m12.H80();
        }
    }
}
