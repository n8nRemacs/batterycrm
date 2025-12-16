package com.avito.android.wallet.page;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import ZO0.b;
import ZO0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.ActivityResult;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.util.C35961v3;
import com.avito.android.wallet.page.di.component.d;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import com.avito.android.wallet.page.mvi.i;
import cv.InterfaceC39417a;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: WalletPageActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/WalletPageActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPageActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f327737t = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public i f327738m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f327740o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f327741p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public com.avito.android.wallet.page.mvi.g f327742q;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f327739n = new O0(m0.f406844a.b(com.avito.android.wallet.page.mvi.h.class), new f(), new e(new h()), new g());

    /* renamed from: r, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f327743r = registerForActivityResult(new b.m(), new a());

    /* renamed from: s, reason: collision with root package name */
    @k
    public final Object f327744s = C35961v3.a(this);

    /* compiled from: WalletPageActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements androidx.view.result.a, D {
        public a() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            Intent intent;
            ActivityResult activityResult = (ActivityResult) obj;
            int i12 = WalletPageActivity.f327737t;
            WalletPageActivity walletPageActivity = WalletPageActivity.this;
            int i13 = activityResult.f21242b;
            if (i13 == -1) {
                ((com.avito.android.wallet.page.mvi.h) walletPageActivity.f327739n.getValue()).accept(b.d.f20121a);
                return;
            }
            if (i13 == 0 && (intent = activityResult.f21243c) != null && intent.hasExtra("payment_error_result")) {
                Toast.makeText(walletPageActivity, "TOP UP FAIL: " + intent.getStringExtra("payment_error_result"), 1).show();
            }
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, WalletPageActivity.this, WalletPageActivity.class, "onActivityResult", "onActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: WalletPageActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<ZO0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(ZO0.b bVar) {
            ((com.avito.android.wallet.page.mvi.h) this.receiver).accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPageActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<ZO0.e, G0> {
        @Override // Y41.l
        public final G0 invoke(ZO0.e eVar) {
            ZO0.e eVar2 = eVar;
            WalletPageActivity walletPageActivity = (WalletPageActivity) this.receiver;
            int i12 = WalletPageActivity.f327737t;
            walletPageActivity.getClass();
            if (eVar2 instanceof e.a) {
                walletPageActivity.finish();
            } else if (eVar2 instanceof e.c) {
                walletPageActivity.startActivity(((e.c) eVar2).f20136a);
            } else if (eVar2 instanceof e.d) {
                walletPageActivity.f327743r.b(((e.d) eVar2).f20137a);
            } else if (eVar2 instanceof e.b) {
                com.avito.android.util.text.a aVar = walletPageActivity.f327741p;
                if (aVar == null) {
                    aVar = null;
                }
                e.b bVar = (e.b) eVar2;
                CharSequence charSequenceC = aVar.c(walletPageActivity, bVar.f20134a);
                com.avito.android.wallet.page.mvi.g gVar = walletPageActivity.f327742q;
                if (gVar != null) {
                    f.a aVar2 = f.a.f125253a;
                    com.avito.android.component.toast.f fVar = bVar.f20135b;
                    boolean z12 = fVar.equals(aVar2) || fVar.equals(f.b.f125254a);
                    ToastBarPosition toastBarPosition = z12 ? ToastBarPosition.f181044b : ToastBarPosition.f181046d;
                    View view = z12 ? gVar.f328224l : gVar.f328216d;
                    if (charSequenceC != null && charSequenceC.length() != 0) {
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.e(charSequenceC), null, null, null, fVar, 2750, toastBarPosition, null, false, false, null, null, 3982);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPageActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<WalletPageState, G0> {
        @Override // Y41.l
        public final G0 invoke(WalletPageState walletPageState) {
            WalletPageState walletPageState2 = walletPageState;
            com.avito.android.wallet.page.mvi.g gVar = ((WalletPageActivity) this.receiver).f327742q;
            if (gVar != null) {
                gVar.a(walletPageState2.f328191d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f327746l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f327746l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f327746l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return WalletPageActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return WalletPageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WalletPageActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/page/mvi/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/page/mvi/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.wallet.page.mvi.h> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.wallet.page.mvi.h invoke() {
            i iVar = WalletPageActivity.this.f327738m;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.wallet.page.mvi.h) iVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.payment_wallet_page_activity;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    @l
    public final AvitoLayoutInflater.CompositeFactory W1(@l Bundle bundle) {
        String str = ((WalletPageOpenParams) this.f327744s.getValue()).f327750b;
        if (str != null) {
            setTheme(com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, str));
        }
        return super.W1(bundle);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(WalletPageScreen.f327759d, s.a(this), null, 4, null);
        d.a aVarA = com.avito.android.wallet.page.di.component.a.a();
        com.avito.android.wallet.page.di.component.e eVar = (com.avito.android.wallet.page.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.wallet.page.di.component.e.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        ?? r32 = this.f327744s;
        aVarA.a(eVar, interfaceC39417aA, c28478k, ((WalletPageOpenParams) r32.getValue()).f327751c, ((WalletPageOpenParams) r32.getValue()).f327752d).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327740o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327740o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        AbstractC19927a supportActionBar = getSupportActionBar();
        O0 o02 = this.f327739n;
        this.f327742q = new com.avito.android.wallet.page.mvi.g(viewK1, supportActionBar, new b(1, (com.avito.android.wallet.page.mvi.h) o02.getValue(), com.avito.android.wallet.page.mvi.h.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f327740o;
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.wallet.page.mvi.h) o02.getValue(), new c(1, this, WalletPageActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/page/mvi/entity/WalletPageOneTimeEvent;)V", 0), new d(1, this, WalletPageActivity.class, "render", "render(Lcom/avito/android/wallet/page/mvi/entity/WalletPageState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f327740o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
