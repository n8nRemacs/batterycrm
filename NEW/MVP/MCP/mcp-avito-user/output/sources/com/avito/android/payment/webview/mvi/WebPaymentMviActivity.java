package com.avito.android.payment.webview.mvi;

import Cd.r;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.view.C23060r0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import b31.C25404c;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.di.C29972i;
import com.avito.android.marketplace.v;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.di.component.i;
import com.avito.android.payment.o;
import com.avito.android.payment.webview.DefaultWebPaymentResourceProvider;
import com.avito.android.payment.webview.WebPaymentOpenParams;
import com.avito.android.payment.webview.mvi.entity.WebPaymentMviState;
import com.avito.android.payment.webview.mvi.k;
import com.avito.android.payment.webview.perf.WebPaymentScreen;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35961v3;
import com.avito.android.util.H5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.N0;
import com.avito.android.util.y6;
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
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import v60.InterfaceC49169a;
import x60.InterfaceC49775a;
import x60.c;
import z1.AbstractC50339a;

/* compiled from: WebPaymentMviActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment/webview/mvi/WebPaymentMviActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebPaymentMviActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f214826D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f214827A;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k.a f214830m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f214831n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f214832o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f214833p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public x f214834q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f214835r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC49169a f214836s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public E f214837t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.payment.webview.mvi.view.f f214838u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public o f214839v;

    /* renamed from: x, reason: collision with root package name */
    public com.avito.android.payment.webview.mvi.view.a f214841x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public y f214842y;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final O0 f214840w = new O0(m0.f406844a.b(k.class), new e(), new d(new h()), new f());

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G0> f214843z = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final Object f214828B = C35961v3.a(this);

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final g f214829C = new g();

    /* compiled from: WebPaymentMviActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/payment/webview/mvi/WebPaymentMviActivity$a;", "", "<init>", "()V", "", "UNDEFINED_DOMAIN", "Ljava/lang/String;", "", "WEB_VIEW_PRELOADING_TIMEOUT_MS", "J", "WEB_VIEW_STATE_KEY", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WebPaymentMviActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<x60.c, G0> {
        public final void f(@Y61.k x60.c cVar) {
            WebPaymentMviActivity webPaymentMviActivity = (WebPaymentMviActivity) this.receiver;
            int i12 = WebPaymentMviActivity.f214826D;
            webPaymentMviActivity.getClass();
            boolean z12 = cVar instanceof c.b;
            io.reactivex.rxjava3.subjects.e<G0> eVar = webPaymentMviActivity.f214843z;
            if (z12) {
                webPaymentMviActivity.f214827A = true;
                y yVar = webPaymentMviActivity.f214842y;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                }
                com.avito.android.payment.webview.mvi.view.a aVar = webPaymentMviActivity.f214841x;
                if (aVar == null) {
                    aVar = null;
                }
                O oK2 = C25404c.a(aVar.f214936g).K(new com.avito.android.payment.webview.mvi.d(webPaymentMviActivity));
                C41990t1 c41990t1Z0 = eVar.z0(1L);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC35745a5 interfaceC35745a5 = webPaymentMviActivity.f214833p;
                if (interfaceC35745a5 == null) {
                    interfaceC35745a5 = null;
                }
                webPaymentMviActivity.f214842y = A1.h(z.g0(oK2, c41990t1Z0.E0(30000L, timeUnit, null, interfaceC35745a5.c()).K(new com.avito.android.payment.webview.mvi.e(webPaymentMviActivity))), new com.avito.android.payment.webview.mvi.f(webPaymentMviActivity), null, 6);
                com.avito.android.payment.webview.mvi.view.a aVar2 = webPaymentMviActivity.f214841x;
                (aVar2 != null ? aVar2 : null).f214936g.loadUrl(webPaymentMviActivity.a2().f214820b);
                return;
            }
            if (cVar instanceof c.a) {
                Intent intent = new Intent();
                intent.putExtra("web_payment_final_deeplink_extra", ((c.a) cVar).f442235a);
                webPaymentMviActivity.setResult(-1, intent);
                webPaymentMviActivity.finish();
                return;
            }
            if (cVar instanceof c.e) {
                com.avito.android.payment.webview.mvi.view.f fVar = webPaymentMviActivity.f214838u;
                (fVar != null ? fVar : null).a(webPaymentMviActivity, new com.avito.android.payment.webview.mvi.b(webPaymentMviActivity), new com.avito.android.payment.webview.mvi.c(webPaymentMviActivity));
            } else if (cVar instanceof c.C12847c) {
                eVar.onNext(G0.f406611a);
            } else if (L.f(cVar, c.d.f442238a)) {
                com.avito.android.payment.webview.mvi.view.a aVar3 = webPaymentMviActivity.f214841x;
                (aVar3 != null ? aVar3 : null).f214936g.reload();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(x60.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: WebPaymentMviActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<WebPaymentMviState, G0> {
        @Override // Y41.l
        public final G0 invoke(WebPaymentMviState webPaymentMviState) {
            WebPaymentMviState webPaymentMviState2 = webPaymentMviState;
            com.avito.android.payment.webview.mvi.view.a aVar = (com.avito.android.payment.webview.mvi.view.a) this.receiver;
            aVar.getClass();
            boolean zEquals = webPaymentMviState2.equals(WebPaymentMviState.Content.f214921d);
            com.avito.android.progress_overlay.l lVar = aVar.f214937h;
            if (zEquals) {
                lVar.j();
            } else {
                boolean z12 = webPaymentMviState2 instanceof WebPaymentMviState.Error;
                o oVar = aVar.f214931b;
                if (z12) {
                    lVar.a(oVar.getF213993j());
                } else if (webPaymentMviState2 instanceof WebPaymentMviState.Loading) {
                    int i12 = ((WebPaymentMviState.Loading) webPaymentMviState2).f214923d;
                    lVar.k(i12 == 0 ? oVar.getF213995l() : String.format(oVar.getF213996m(), Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1)));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f214845m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f214845m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(WebPaymentMviActivity.this, this.f214845m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return WebPaymentMviActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return WebPaymentMviActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WebPaymentMviActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/payment/webview/mvi/WebPaymentMviActivity$g", "Lcom/yatatsu/powerwebview/d;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements com.yatatsu.powerwebview.d {
        public g() {
        }

        @Override // com.yatatsu.powerwebview.d
        public final boolean b(boolean z12, @Y61.k Uri uri) {
            WebPaymentMviActivity webPaymentMviActivity = WebPaymentMviActivity.this;
            x xVar = webPaymentMviActivity.f214834q;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkE = xVar.e(uri);
            if (webPaymentMviActivity.f214827A || z12) {
                webPaymentMviActivity.b2().accept(new InterfaceC49775a.e(deepLinkE));
            } else {
                webPaymentMviActivity.f214827A = true;
            }
            return !(deepLinkE instanceof NoMatchLink);
        }
    }

    /* compiled from: WebPaymentMviActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "stateHandle", "Lcom/avito/android/payment/webview/mvi/k;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/payment/webview/mvi/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, k> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final k invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            k.a aVar = WebPaymentMviActivity.this.f214830m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.web_payment_layout;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Object bVar;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        i.a aVarA = com.avito.android.payment.di.component.d.a();
        com.avito.android.payment.di.component.e eVar = (com.avito.android.payment.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.payment.di.component.e.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        C28478k c28478k = new C28478k(WebPaymentScreen.f214948d, s.a(this), null, 4, null);
        String str = a2().f214820b;
        String str2 = a2().f214821c;
        try {
            int i12 = Z.f406624c;
            String host = Uri.parse(a2().f214820b).getHost();
            bVar = host != null ? host.replace('.', '_') : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        String str3 = (String) bVar;
        if (str3 == null) {
            str3 = "undefined";
        }
        com.avito.android.payment.webview.mvi.a aVar = new com.avito.android.payment.webview.mvi.a(y6.e(C35835l0.i(this).heightPixels), y6.e(C35835l0.i(this).widthPixels), str2, str, str3);
        WebPaymentResourceProviderImpl defaultWebPaymentResourceProvider = a2().f214823e;
        if (defaultWebPaymentResourceProvider == null) {
            defaultWebPaymentResourceProvider = new DefaultWebPaymentResourceProvider(getResources(), a2().f214821c, a2().f214822d);
        }
        aVarA.a(eVar, interfaceC39417aA, this, c28478k, aVar, defaultWebPaymentResourceProvider).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f214832o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final WebPaymentOpenParams a2() {
        return (WebPaymentOpenParams) this.f214828B.getValue();
    }

    public final k b2() {
        return (k) this.f214840w.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        b2().accept(InterfaceC49775a.C12845a.f442222a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"CheckResult"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f214832o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        o oVar = this.f214839v;
        o oVar2 = oVar != null ? oVar : null;
        InterfaceC28373a interfaceC28373a = this.f214831n;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.cookie_provider.e eVar = this.f214835r;
        com.avito.android.cookie_provider.e eVar2 = eVar != null ? eVar : null;
        InterfaceC49169a interfaceC49169a = this.f214836s;
        this.f214841x = new com.avito.android.payment.webview.mvi.view.a(viewK1, oVar2, eVar2, interfaceC49169a != null ? interfaceC49169a : null, this.f214829C, new com.avito.android.payment.webview.mvi.view.c(new com.avito.android.payment.webview.mvi.g(this)), interfaceC28373a2, new com.avito.android.payment.webview.mvi.h(this));
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            o oVar3 = this.f214839v;
            if (oVar3 == null) {
                oVar3 = null;
            }
            toolbar.setTitle(oVar3.getF213985b());
        }
        Toolbar toolbar2 = this.f304539d;
        if (toolbar2 != null) {
            o oVar4 = this.f214839v;
            if (oVar4 == null) {
                oVar4 = null;
            }
            toolbar2.setNavigationIcon(oVar4.getF213994k());
        }
        Toolbar toolbar3 = this.f304539d;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new H5(1, new i(this)));
        }
        k kVarB2 = b2();
        b bVar = new b(1, this, WebPaymentMviActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/payment/webview/mvi/entity/WebPaymentMviOneTimeEvent;)V", 0);
        com.avito.android.payment.webview.mvi.view.a aVar = this.f214841x;
        com.avito.android.arch.mvi.android.f.b(this, kVarB2, bVar, new c(1, aVar == null ? null : aVar, com.avito.android.payment.webview.mvi.view.a.class, "render", "render(Lcom/avito/android/payment/webview/mvi/entity/WebPaymentMviState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f214832o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        y yVar = this.f214842y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        com.avito.android.payment.webview.mvi.view.a aVar = this.f214841x;
        if (aVar == null) {
            aVar = null;
        }
        PowerWebView powerWebView = aVar.f214936g;
        powerWebView.f392926d.clear();
        powerWebView.removeJavascriptInterface("appInterface");
        powerWebView.setWebResourceErrorHandlerDelegate(null);
        powerWebView.setSslErrorHandlerDelegate(null);
        ((ViewGroup) aVar.f214930a).removeView(powerWebView);
        powerWebView.clearHistory();
        powerWebView.removeAllViews();
        powerWebView.post(new v(powerWebView, 1));
        com.avito.android.payment.webview.mvi.view.f fVar = this.f214838u;
        N0.a((fVar != null ? fVar : null).f214944b);
        K2.c(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(@Y61.k Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("web_view_state_key");
        if (bundle2 != null) {
            com.avito.android.payment.webview.mvi.view.a aVar = this.f214841x;
            if (aVar == null) {
                aVar = null;
            }
            aVar.f214936g.restoreState(bundle2);
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        com.avito.android.payment.webview.mvi.view.a aVar = this.f214841x;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f214936g.saveState(bundle2);
        bundle.putBundle("web_view_state_key", bundle2);
    }
}
