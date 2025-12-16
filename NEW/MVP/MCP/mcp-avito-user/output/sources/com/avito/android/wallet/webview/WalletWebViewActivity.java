package com.avito.android.wallet.webview;

import Cd.C13243a;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import b31.C25404c;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.H5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.N0;
import com.avito.android.wallet.webview.deeplink.WalletWebViewDialogData;
import com.avito.android.wallet.webview.deeplink.WalletWebViewLink;
import com.avito.android.wallet.webview.di.component.c;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewState;
import com.avito.android.wallet.webview.perf.WalletWebViewPerfScreen;
import com.yatatsu.powerwebview.PowerWebView;
import cv.InterfaceC39417a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41990t1;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import tP0.C48594a;
import xP0.InterfaceC49873a;
import xP0.InterfaceC49874b;
import z1.AbstractC50339a;

/* compiled from: WalletWebViewActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/webview/WalletWebViewActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletWebViewActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f329347C = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public w f329350m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f329352o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f329353p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public l f329354q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f329355r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public x f329356s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f329357t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f329358u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329360w;

    /* renamed from: y, reason: collision with root package name */
    public u f329362y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public y f329363z;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f329351n = new O0(m0.f406844a.b(v.class), new e(), new d(new h()), new f());

    /* renamed from: v, reason: collision with root package name */
    public boolean f329359v = true;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Object f329361x = C35961v3.a(this);

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G0> f329348A = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final g f329349B = new g();

    /* compiled from: WalletWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/wallet/webview/WalletWebViewActivity$a;", "", "<init>", "()V", "", "WEB_VIEW_PRELOADING_TIMEOUT_MS", "J", "", "WEB_VIEW_STATE_KEY", "Ljava/lang/String;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WalletWebViewActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC49874b, G0> {
        public final void f(@Y61.k InterfaceC49874b interfaceC49874b) {
            WalletWebViewActivity walletWebViewActivity = (WalletWebViewActivity) this.receiver;
            int i12 = WalletWebViewActivity.f329347C;
            walletWebViewActivity.getClass();
            if (interfaceC49874b instanceof InterfaceC49874b.C12870b) {
                if (walletWebViewActivity.f329359v) {
                    walletWebViewActivity.c2();
                    u uVar = walletWebViewActivity.f329362y;
                    (uVar != null ? uVar : null).f329458h.loadUrl(walletWebViewActivity.a2().f329369b);
                }
                walletWebViewActivity.f329359v = false;
                return;
            }
            if (interfaceC49874b instanceof InterfaceC49874b.d) {
                walletWebViewActivity.c2();
                u uVar2 = walletWebViewActivity.f329362y;
                (uVar2 != null ? uVar2 : null).f329458h.loadUrl(walletWebViewActivity.a2().f329369b);
                return;
            }
            if (interfaceC49874b instanceof InterfaceC49874b.c) {
                walletWebViewActivity.f329348A.onNext(G0.f406611a);
                return;
            }
            if (!(interfaceC49874b instanceof InterfaceC49874b.e)) {
                if (interfaceC49874b instanceof InterfaceC49874b.a) {
                    walletWebViewActivity.finish();
                    return;
                }
                return;
            }
            if (walletWebViewActivity.a2().f329376i) {
                u uVar3 = walletWebViewActivity.f329362y;
                u uVar4 = uVar3 != null ? uVar3 : null;
                com.avito.android.wallet.webview.b bVar = com.avito.android.wallet.webview.b.f329379l;
                com.avito.android.wallet.webview.c cVar = new com.avito.android.wallet.webview.c(walletWebViewActivity);
                N0.a(uVar4.f329460j);
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, uVar4.f329451a.getContext(), new t(uVar4, bVar, cVar));
                uVar4.f329460j = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
                return;
            }
            walletWebViewActivity.setResult(0);
            DeepLink deepLink = walletWebViewActivity.a2().f329378k;
            if (deepLink != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = walletWebViewActivity.f329357t;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLink, null, null, 6);
            }
            walletWebViewActivity.finish();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC49874b interfaceC49874b) {
            f(interfaceC49874b);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletWebViewActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<WalletWebViewState, G0> {
        @Override // Y41.l
        public final G0 invoke(WalletWebViewState walletWebViewState) throws Resources.NotFoundException {
            WalletWebViewState walletWebViewState2 = walletWebViewState;
            u uVar = (u) this.receiver;
            uVar.getClass();
            boolean zEquals = walletWebViewState2.equals(WalletWebViewState.Content.f329435d);
            com.avito.android.progress_overlay.l lVar = uVar.f329459i;
            if (zEquals) {
                WalletWebViewOpenParams walletWebViewOpenParams = uVar.f329456f;
                uVar.f329457g.c(new C48594a(walletWebViewOpenParams.f329370c, walletWebViewOpenParams.f329371d));
                lVar.j();
            } else if (walletWebViewState2 instanceof WalletWebViewState.Error) {
                lVar.a("");
            } else if (walletWebViewState2 instanceof WalletWebViewState.Loading) {
                q qVar = uVar.f329455e;
                Resources resources = qVar.f329441a;
                String string = resources.getString(R.string.wallet_webview_progress_template);
                String string2 = qVar.f329443c;
                if (string2 == null) {
                    string2 = resources.getString(R.string.wallet_webview_progress_message);
                }
                lVar.k(String.format(string, Arrays.copyOf(new Object[]{string2, Integer.valueOf(((WalletWebViewState.Loading) walletWebViewState2).f329437d)}, 2)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f329364l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f329364l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f329364l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return WalletWebViewActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return WalletWebViewActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WalletWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/wallet/webview/WalletWebViewActivity$g", "Lcom/yatatsu/powerwebview/d;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements com.yatatsu.powerwebview.d {
        public g() {
        }

        @Override // com.yatatsu.powerwebview.d
        public final boolean b(boolean z12, @Y61.k Uri uri) {
            WalletWebViewActivity walletWebViewActivity = WalletWebViewActivity.this;
            x xVar = walletWebViewActivity.f329356s;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkE = xVar.e(uri);
            if (deepLinkE instanceof NoMatchLink) {
                return false;
            }
            walletWebViewActivity.b2().accept(new InterfaceC49873a.d(deepLinkE));
            if (deepLinkE instanceof WalletWebViewLink) {
                return true;
            }
            walletWebViewActivity.finish();
            return true;
        }
    }

    /* compiled from: WalletWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/v;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/webview/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<v> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final v invoke() {
            w wVar = WalletWebViewActivity.this.f329350m;
            if (wVar == null) {
                wVar = null;
            }
            return (v) wVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.wallet_web_view;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(WalletWebViewPerfScreen.f329440d, com.avito.android.analytics.screens.s.a(this), null, 4, null);
        this.f329360w = bundle != null;
        c.a aVarA = com.avito.android.wallet.webview.di.component.a.a();
        com.avito.android.wallet.webview.di.component.d dVar = (com.avito.android.wallet.webview.di.component.d) C29972i.a(C29972i.b(this), com.avito.android.wallet.webview.di.component.d.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        String str = a2().f329369b;
        String str2 = a2().f329370c;
        String str3 = a2().f329371d;
        aVarA.a(dVar, interfaceC39417aA, c28478k, str, new j(), this.f329360w).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f329352o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final WalletWebViewOpenParams a2() {
        return (WalletWebViewOpenParams) this.f329361x.getValue();
    }

    public final v b2() {
        return (v) this.f329351n.getValue();
    }

    public final void c2() {
        y yVar = this.f329363z;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        u uVar = this.f329362y;
        if (uVar == null) {
            uVar = null;
        }
        O oK2 = C25404c.a(uVar.f329458h).K(new com.avito.android.wallet.webview.d(this));
        C41990t1 c41990t1Z0 = this.f329348A.z0(1L);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f329355r;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        this.f329363z = A1.h(z.g0(oK2, c41990t1Z0.E0(30000L, timeUnit, null, interfaceC35745a5.c()).K(new com.avito.android.wallet.webview.e(this))), new com.avito.android.wallet.webview.f(this), null, 6);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        b2().accept(InterfaceC49873a.C12869a.f442459a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f329352o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Resources resources = getResources();
        WalletWebViewDialogData walletWebViewDialogData = a2().f329377j;
        String str = a2().f329372e;
        q qVar = new q(resources, walletWebViewDialogData, str, a2().f329373f);
        View viewK1 = K1();
        com.avito.android.cookie_provider.e eVar = this.f329353p;
        com.avito.android.cookie_provider.e eVar2 = eVar != null ? eVar : null;
        l lVar = this.f329354q;
        l lVar2 = lVar != null ? lVar : null;
        WalletWebViewOpenParams walletWebViewOpenParamsA2 = a2();
        InterfaceC28373a interfaceC28373a = this.f329358u;
        this.f329362y = new u(viewK1, eVar2, lVar2, this.f329349B, qVar, walletWebViewOpenParamsA2, interfaceC28373a != null ? interfaceC28373a : null, new com.avito.android.wallet.webview.g(this));
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            D6.G(toolbar, a2().f329375h);
            if (str == null) {
                str = "";
            }
            toolbar.setTitle(str);
            toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
            toolbar.setNavigationOnClickListener(new H5(1, new com.avito.android.wallet.webview.h(this)));
        }
        v vVarB2 = b2();
        b bVar = new b(1, this, WalletWebViewActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewOneTimeEvent;)V", 0);
        u uVar = this.f329362y;
        com.avito.android.arch.mvi.android.f.a(vVarB2, this, Lifecycle.State.f46682e, bVar, new c(1, uVar == null ? null : uVar, u.class, "render", "render(Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f329352o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        y yVar = this.f329363z;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        u uVar = this.f329362y;
        if (uVar == null) {
            uVar = null;
        }
        N0.a(uVar.f329460j);
        PowerWebView powerWebView = uVar.f329458h;
        powerWebView.f392926d.clear();
        powerWebView.setWebResourceErrorHandlerDelegate(null);
        powerWebView.setSslErrorHandlerDelegate(null);
        ((ViewGroup) uVar.f329451a).removeView(powerWebView);
        powerWebView.clearHistory();
        powerWebView.removeAllViews();
        powerWebView.post(new com.avito.android.marketplace.v(powerWebView, 2));
        K2.c(this);
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        u uVar = this.f329362y;
        if (uVar == null) {
            uVar = null;
        }
        uVar.f329458h.saveState(bundle2);
        bundle.putBundle("wallet_web_view_state_key", bundle2);
    }
}
