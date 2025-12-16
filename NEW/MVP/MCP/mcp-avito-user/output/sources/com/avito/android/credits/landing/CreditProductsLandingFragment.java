package com.avito.android.credits.landing;

import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import b31.C25402a;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.component.toast.c;
import com.avito.android.credits.landing.di.a;
import com.avito.android.deep_linking.x;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.k;
import com.avito.android.location.H;
import com.avito.android.location.q;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.P5;
import com.yatatsu.powerwebview.PowerWebView;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: CreditProductsLandingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/credits/landing/CreditProductsLandingFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreditProductsLandingFragment extends TabBaseFragment implements com.avito.android.ui.fragments.c, InterfaceC28477j.a {

    /* renamed from: A0, reason: collision with root package name */
    @l
    public Toolbar f128883A0;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public ProgressBar f128884B0;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public com.avito.android.ui.view.d f128885C0;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public k f128886D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f128887E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f128888F0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public x f128889t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f128890u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public CookieManager f128891v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f128892w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public H f128893x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f128894y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public PowerWebView f128895z0;

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f128882H0 = {m0.f406844a.e(new Y(CreditProductsLandingFragment.class, "openParams", "getOpenParams()Lcom/avito/android/credits/landing/CreditProductsLandingArguments;", 0))};

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f128881G0 = new a(null);

    /* compiled from: CreditProductsLandingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/landing/CreditProductsLandingFragment$a;", "", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public CreditProductsLandingFragment() {
        super(0, 1, null);
        this.f128894y0 = new C35968w3(this);
        this.f128887E0 = new io.reactivex.rxjava3.disposables.c();
        this.f128888F0 = new NavigationState(false, null, 2, null);
    }

    public static final void D5(CreditProductsLandingFragment creditProductsLandingFragment, boolean z12) {
        k kVarB;
        if (z12) {
            return;
        }
        View view = creditProductsLandingFragment.getView();
        if (view != null) {
            kVarB = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.c(R.string.connection_problem, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(creditProductsLandingFragment.getResources().getString(R.string.try_again), false, null, new f(creditProductsLandingFragment), 6, null)), null, null, -1, null, null, false, false, null, null, 4058);
        } else {
            kVarB = null;
        }
        creditProductsLandingFragment.f128886D0 = kVarB;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        k kVar = this.f128886D0;
        if (kVar != null) {
            kVar.f();
        }
        this.f128886D0 = null;
        com.avito.android.ui.view.d dVar = this.f128885C0;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.credit_products_landing_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f128886D0;
        if (kVar != null) {
            kVar.f();
        }
        this.f128886D0 = null;
        PowerWebView powerWebView = this.f128895z0;
        if (powerWebView != null) {
            powerWebView.destroy();
        }
        this.f128887E0.dispose();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        com.avito.android.ui.view.d dVar;
        Location location;
        String id2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f128883A0 = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.progress);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        this.f128884B0 = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.web_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById3;
        this.f128895z0 = powerWebView;
        this.f128885C0 = new com.avito.android.ui.view.d(powerWebView);
        CreditProductsLandingArguments creditProductsLandingArguments = (CreditProductsLandingArguments) this.f128894y0.getValue(this, f128882H0[0]);
        PowerWebView powerWebView2 = this.f128895z0;
        if (powerWebView2 == null || (dVar = this.f128885C0) == null) {
            return;
        }
        Toolbar toolbar = this.f128883A0;
        io.reactivex.rxjava3.disposables.c cVar = this.f128887E0;
        if (toolbar != null) {
            toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
            toolbar.setTitle(creditProductsLandingArguments.f128880c);
            cVar.b(P5.g(toolbar).t0(new com.avito.android.credits.landing.a(this)));
        }
        powerWebView2.setBackgroundColor(C35835l0.d(R.attr.transparentBlack, requireContext()));
        powerWebView2.setLayerType(2, null);
        powerWebView2.setHorizontalScrollBarEnabled(false);
        powerWebView2.setHttpErrorHandlerDelegate(new com.avito.android.credits.credit_partner_screen.webview.e("CreditProductsLanding", new b(this)));
        CookieManager cookieManager = this.f128891v0;
        if (cookieManager == null) {
            cookieManager = null;
        }
        cookieManager.setAcceptCookie(true);
        com.avito.android.cookie_provider.e eVar = this.f128892w0;
        if (eVar == null) {
            eVar = null;
        }
        for (com.avito.android.cookie_provider.a aVar : eVar.a()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
        c cVar2 = new c(this, powerWebView2);
        l41.g<? super Throwable> gVar = d.f128903b;
        C25402a c25402a = dVar.f304688b;
        c25402a.getClass();
        cVar.b(c25402a.v0(cVar2, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
        Uri uri = creditProductsLandingArguments.f128879b;
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("platform", "android");
        if (uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID) == null) {
            H h12 = this.f128893x0;
            q qVarJ = (h12 != null ? h12 : null).j();
            if (qVarJ != null && (location = qVarJ.f181849a) != null && (id2 = location.getId()) != null) {
                builderAppendQueryParameter.appendQueryParameter(SearchParamsConverterKt.LOCATION_ID, id2);
            }
        }
        powerWebView2.loadUrl(builderAppendQueryParameter.build().toString());
        dVar.a(new e(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        a.InterfaceC3822a interfaceC3822aA = com.avito.android.credits.landing.di.f.a();
        interfaceC3822aA.b((com.avito.android.credits.landing.di.b) C29972i.a(C29972i.b(this), com.avito.android.credits.landing.di.b.class));
        interfaceC3822aA.a(cv.c.b(this));
        interfaceC3822aA.build().a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF107780y0() {
        return this.f128888F0;
    }
}
