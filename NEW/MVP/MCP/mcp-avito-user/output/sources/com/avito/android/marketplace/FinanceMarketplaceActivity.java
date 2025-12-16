package com.avito.android.marketplace;

import Cd.C13243a;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
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
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewAction;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewDialogData;
import com.avito.android.marketplace.mvi.entity.FinanceMarketplaceState;
import com.avito.android.marketplace.perf.FinanceMarketplacePerfScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.H5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.N0;
import com.avito.android.webview.C36149b;
import com.yatatsu.powerwebview.PowerWebView;
import i.b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41990t1;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.kotlin.A1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lY.C43702b;
import lY.C43704d;
import lY.C43705e;
import mY.InterfaceC44028a;
import mY.InterfaceC44029b;
import z1.AbstractC50339a;

/* compiled from: FinanceMarketplaceActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/marketplace/FinanceMarketplaceActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinanceMarketplaceActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f185844E = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public ValueCallback<Uri[]> f185845A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Void> f185846B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f185847C;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public u f185849m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f185851o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f185852p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f185853q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public m f185854r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f185855s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f185856t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f185857u;

    /* renamed from: w, reason: collision with root package name */
    public A f185859w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f185860x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f185861y;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f185850n = new O0(m0.f406844a.b(t.class), new e(), new d(new h()), new f());

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Object f185858v = C35961v3.a(this);

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G0> f185862z = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final g f185848D = new g();

    /* compiled from: FinanceMarketplaceActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/marketplace/FinanceMarketplaceActivity$a;", "", "<init>", "()V", "", "WEB_VIEW_PRELOADING_TIMEOUT_MS", "J", "", "WEB_VIEW_STATE_KEY", "Ljava/lang/String;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FinanceMarketplaceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC44029b, G0> {
        public final void f(@Y61.k InterfaceC44029b interfaceC44029b) {
            FinanceMarketplaceWebViewAction financeMarketplaceWebViewAction;
            DeepLink deeplink;
            FinanceMarketplaceActivity financeMarketplaceActivity = (FinanceMarketplaceActivity) this.receiver;
            int i12 = FinanceMarketplaceActivity.f185844E;
            financeMarketplaceActivity.getClass();
            boolean z12 = interfaceC44029b instanceof InterfaceC44029b.C11832b;
            io.reactivex.rxjava3.subjects.e<G0> eVar = financeMarketplaceActivity.f185862z;
            if (z12) {
                financeMarketplaceActivity.f185860x = true;
                io.reactivex.rxjava3.internal.observers.y yVar = financeMarketplaceActivity.f185861y;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                }
                A a12 = financeMarketplaceActivity.f185859w;
                if (a12 == null) {
                    a12 = null;
                }
                O oK2 = C25404c.a(a12.f185841i).K(new com.avito.android.marketplace.d(financeMarketplaceActivity));
                C41990t1 c41990t1Z0 = eVar.z0(1L);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC35745a5 interfaceC35745a5 = financeMarketplaceActivity.f185855s;
                if (interfaceC35745a5 == null) {
                    interfaceC35745a5 = null;
                }
                financeMarketplaceActivity.f185861y = A1.h(io.reactivex.rxjava3.core.z.g0(oK2, c41990t1Z0.E0(30000L, timeUnit, null, interfaceC35745a5.c()).K(new com.avito.android.marketplace.e(financeMarketplaceActivity))), new com.avito.android.marketplace.f(financeMarketplaceActivity), null, 6);
                A a13 = financeMarketplaceActivity.f185859w;
                (a13 != null ? a13 : null).f185841i.loadUrl(financeMarketplaceActivity.a2().f185869b);
                return;
            }
            if (interfaceC44029b instanceof InterfaceC44029b.c) {
                eVar.onNext(G0.f406611a);
                return;
            }
            if (!(interfaceC44029b instanceof InterfaceC44029b.d)) {
                if (interfaceC44029b instanceof InterfaceC44029b.e) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    View viewK1 = financeMarketplaceActivity.K1();
                    PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.fmp_webview_permission_camera, new Serializable[0]);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, viewK1, printableTextC, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                    return;
                }
                if (!(interfaceC44029b instanceof InterfaceC44029b.f)) {
                    if (interfaceC44029b instanceof InterfaceC44029b.a) {
                        financeMarketplaceActivity.finish();
                        return;
                    }
                    return;
                } else {
                    financeMarketplaceActivity.f185845A = ((InterfaceC44029b.f) interfaceC44029b).f414571a;
                    if (androidx.core.content.d.checkSelfPermission(financeMarketplaceActivity, "android.permission.CAMERA") == 0) {
                        financeMarketplaceActivity.f185846B.b(null);
                        return;
                    } else {
                        financeMarketplaceActivity.f185847C.b("android.permission.CAMERA");
                        return;
                    }
                }
            }
            InterfaceC28373a interfaceC28373a = financeMarketplaceActivity.f185853q;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C43702b(financeMarketplaceActivity.a2().f185870c, financeMarketplaceActivity.a2().f185872e, financeMarketplaceActivity.a2().f185871d, financeMarketplaceActivity.a2().f185869b));
            if (financeMarketplaceActivity.a2().f185878k) {
                A a14 = financeMarketplaceActivity.f185859w;
                A a15 = a14 != null ? a14 : null;
                com.avito.android.marketplace.b bVar = new com.avito.android.marketplace.b(financeMarketplaceActivity);
                com.avito.android.marketplace.c cVar2 = new com.avito.android.marketplace.c(financeMarketplaceActivity);
                N0.a(a15.f185843k);
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, a15.f185833a.getContext(), new z(a15, bVar, cVar2));
                a15.f185843k = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
                return;
            }
            financeMarketplaceActivity.setResult(0);
            List<FinanceMarketplaceWebViewAction> list = financeMarketplaceActivity.a2().f185880m;
            if (list != null && (financeMarketplaceWebViewAction = list.get(0)) != null && (deeplink = financeMarketplaceWebViewAction.getDeeplink()) != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = financeMarketplaceActivity.f185857u;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deeplink, null, null, 6);
            }
            financeMarketplaceActivity.finish();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC44029b interfaceC44029b) {
            f(interfaceC44029b);
            return G0.f406611a;
        }
    }

    /* compiled from: FinanceMarketplaceActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<FinanceMarketplaceState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(FinanceMarketplaceState financeMarketplaceState) {
            FinanceMarketplaceState financeMarketplaceState2 = financeMarketplaceState;
            A a12 = FinanceMarketplaceActivity.this.f185859w;
            if (a12 == null) {
                a12 = null;
            }
            a12.getClass();
            boolean zEquals = financeMarketplaceState2.equals(FinanceMarketplaceState.Content.f185950d);
            com.avito.android.progress_overlay.l lVar = a12.f185842j;
            FinanceMarketplaceOpenParams financeMarketplaceOpenParams = a12.f185839g;
            InterfaceC28373a interfaceC28373a = a12.f185838f;
            if (zEquals) {
                interfaceC28373a.c(new C43705e(financeMarketplaceOpenParams.f185870c, financeMarketplaceOpenParams.f185872e, financeMarketplaceOpenParams.f185871d, financeMarketplaceOpenParams.f185869b));
                lVar.j();
            } else if (financeMarketplaceState2 instanceof FinanceMarketplaceState.Error) {
                interfaceC28373a.c(new C43704d(financeMarketplaceOpenParams.f185870c, financeMarketplaceOpenParams.f185872e, financeMarketplaceOpenParams.f185871d, financeMarketplaceOpenParams.f185869b));
                lVar.a("");
            } else if (financeMarketplaceState2 instanceof FinanceMarketplaceState.Loading) {
                lVar.k(String.format(a12.f185837e.f185956a.getString(R.string.finance_marketplace_progress_message), Arrays.copyOf(new Object[]{Integer.valueOf(((FinanceMarketplaceState.Loading) financeMarketplaceState2).f185952d)}, 1)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f185864l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f185864l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f185864l);
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
            return FinanceMarketplaceActivity.this.getF42820b();
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
            return FinanceMarketplaceActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FinanceMarketplaceActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/marketplace/FinanceMarketplaceActivity$g", "Lcom/yatatsu/powerwebview/d;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements com.yatatsu.powerwebview.d {
        public g() {
        }

        @Override // com.yatatsu.powerwebview.d
        public final boolean b(boolean z12, @Y61.k Uri uri) {
            FinanceMarketplaceActivity financeMarketplaceActivity = FinanceMarketplaceActivity.this;
            com.avito.android.deep_linking.x xVar = financeMarketplaceActivity.f185856t;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkE = xVar.e(uri);
            if (financeMarketplaceActivity.f185860x || z12) {
                financeMarketplaceActivity.b2().accept(new InterfaceC44028a.g(deepLinkE));
            } else {
                financeMarketplaceActivity.f185860x = true;
            }
            return !(deepLinkE instanceof NoMatchLink);
        }
    }

    /* compiled from: FinanceMarketplaceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/marketplace/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/marketplace/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<t> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = FinanceMarketplaceActivity.this.f185849m;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    static {
        new a(null);
    }

    public FinanceMarketplaceActivity() {
        final int i12 = 0;
        this.f185846B = registerForActivityResult(new C36149b(), new androidx.view.result.a(this) { // from class: com.avito.android.marketplace.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FinanceMarketplaceActivity f185882c;

            {
                this.f185882c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                FinanceMarketplaceActivity financeMarketplaceActivity = this.f185882c;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = financeMarketplaceActivity.f185845A;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            financeMarketplaceActivity.f185845A = null;
                            financeMarketplaceActivity.b2().accept(InterfaceC44028a.d.f414562a);
                            break;
                        } else {
                            int i13 = FinanceMarketplaceActivity.f185844E;
                            financeMarketplaceActivity.b2().accept(new InterfaceC44028a.c(financeMarketplaceActivity.f185845A));
                            break;
                        }
                }
            }
        });
        final int i13 = 1;
        this.f185847C = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.marketplace.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FinanceMarketplaceActivity f185882c;

            {
                this.f185882c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                FinanceMarketplaceActivity financeMarketplaceActivity = this.f185882c;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = financeMarketplaceActivity.f185845A;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            financeMarketplaceActivity.f185845A = null;
                            financeMarketplaceActivity.b2().accept(InterfaceC44028a.d.f414562a);
                            break;
                        } else {
                            int i132 = FinanceMarketplaceActivity.f185844E;
                            financeMarketplaceActivity.b2().accept(new InterfaceC44028a.c(financeMarketplaceActivity.f185845A));
                            break;
                        }
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.finance_marketplace_web_view;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.marketplace.di.component.a.a().a((com.avito.android.marketplace.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.marketplace.di.component.c.class), cv.c.a(this), new C28478k(FinanceMarketplacePerfScreen.f185954d, com.avito.android.analytics.screens.s.a(this), null, 4, null), a2().f185869b, new k(String.valueOf(a2().f185870c), String.valueOf(a2().f185872e), String.valueOf(a2().f185871d))).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f185851o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final FinanceMarketplaceOpenParams a2() {
        return (FinanceMarketplaceOpenParams) this.f185858v.getValue();
    }

    public final t b2() {
        return (t) this.f185850n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        b2().accept(InterfaceC44028a.C11831a.f414559a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f185851o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Resources resources = getResources();
        FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData = a2().f185879l;
        String str = a2().f185873f;
        s sVar = new s(resources, financeMarketplaceWebViewDialogData, str);
        View viewK1 = K1();
        com.avito.android.cookie_provider.e eVar = this.f185852p;
        com.avito.android.cookie_provider.e eVar2 = eVar != null ? eVar : null;
        m mVar = this.f185854r;
        m mVar2 = mVar != null ? mVar : null;
        InterfaceC28373a interfaceC28373a = this.f185853q;
        this.f185859w = new A(viewK1, eVar2, mVar2, this.f185848D, sVar, interfaceC28373a != null ? interfaceC28373a : null, a2(), new com.avito.android.marketplace.g(1, this, FinanceMarketplaceActivity.class, "onShowFileChooser", "onShowFileChooser(Landroid/webkit/ValueCallback;)V", 0), new com.avito.android.marketplace.h(this));
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            D6.G(toolbar, a2().f185876i);
            toolbar.setTitle(str == null ? "" : str);
            toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
            toolbar.setNavigationOnClickListener(new H5(1, new i(this)));
        }
        com.avito.android.arch.mvi.android.f.a(b2(), this, Lifecycle.State.f46681d, new b(1, this, FinanceMarketplaceActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f185851o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f185861y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        A a12 = this.f185859w;
        if (a12 == null) {
            a12 = null;
        }
        N0.a(a12.f185843k);
        PowerWebView powerWebView = a12.f185841i;
        powerWebView.f392926d.clear();
        powerWebView.setWebResourceErrorHandlerDelegate(null);
        powerWebView.setSslErrorHandlerDelegate(null);
        ((ViewGroup) a12.f185833a).removeView(powerWebView);
        powerWebView.clearHistory();
        powerWebView.removeAllViews();
        powerWebView.post(new v(powerWebView, 0));
        K2.c(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(@Y61.k Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("finance_marketplace_web_view_state_key");
        if (bundle2 != null) {
            A a12 = this.f185859w;
            if (a12 == null) {
                a12 = null;
            }
            a12.f185841i.restoreState(bundle2);
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        A a12 = this.f185859w;
        if (a12 == null) {
            a12 = null;
        }
        a12.f185841i.saveState(bundle2);
        bundle.putBundle("finance_marketplace_web_view_state_key", bundle2);
    }
}
