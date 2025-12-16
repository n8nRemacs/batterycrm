package com.avito.android.wallet.page.topup.form;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C22763c;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.ActivityResult;
import bP0.C25543d;
import bP0.InterfaceC25540a;
import bP0.InterfaceC25541b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
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

/* compiled from: TopUpFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/TopUpFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopUpFormActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f328228t = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.wallet.page.topup.form.mvi.c f328229m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f328231o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f328232p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f328233q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public com.avito.android.wallet.page.topup.form.mvi.a f328234r;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f328230n = new O0(m0.f406844a.b(com.avito.android.wallet.page.topup.form.mvi.b.class), new h(), new g(new j()), new i());

    /* renamed from: s, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f328235s = registerForActivityResult(new b.m(), new a());

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements androidx.view.result.a, D {
        public a() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            Intent intent;
            String stringExtra;
            com.avito.android.wallet.page.topup.form.mvi.a aVar;
            ActivityResult activityResult = (ActivityResult) obj;
            int i12 = TopUpFormActivity.f328228t;
            TopUpFormActivity topUpFormActivity = TopUpFormActivity.this;
            int i13 = activityResult.f21242b;
            if (i13 == -1) {
                topUpFormActivity.setResult(-1);
                topUpFormActivity.finish();
            } else {
                if (i13 != 0 || (intent = activityResult.f21243c) == null || (stringExtra = intent.getStringExtra("payment_error_result")) == null || (aVar = topUpFormActivity.f328234r) == null) {
                    return;
                }
                com.avito.android.component.snackbar.h.c(aVar.f328348a, stringExtra, 0, null, null, null, null, 238);
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
            return new H(1, TopUpFormActivity.this, TopUpFormActivity.class, "onActivityResult", "onActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC25541b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC25541b interfaceC25541b) {
            InterfaceC25541b interfaceC25541b2 = interfaceC25541b;
            TopUpFormActivity topUpFormActivity = (TopUpFormActivity) this.receiver;
            int i12 = TopUpFormActivity.f328228t;
            topUpFormActivity.getClass();
            if (interfaceC25541b2 instanceof InterfaceC25541b.a) {
                topUpFormActivity.setResult(0, new Intent().putExtra("payment_error_result", ((InterfaceC25541b.a) interfaceC25541b2).f57055a));
                topUpFormActivity.finish();
            } else if (interfaceC25541b2 instanceof InterfaceC25541b.C2000b) {
                K2.c(topUpFormActivity);
                topUpFormActivity.f328235s.b(((InterfaceC25541b.C2000b) interfaceC25541b2).f57056a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C25543d, G0> {
        @Override // Y41.l
        public final G0 invoke(C25543d c25543d) {
            C25543d c25543d2 = c25543d;
            com.avito.android.wallet.page.topup.form.mvi.a aVar = ((TopUpFormActivity) this.receiver).f328234r;
            if (aVar != null) {
                aVar.a(c25543d2.f57065d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = TopUpFormActivity.f328228t;
            ((com.avito.android.wallet.page.topup.form.mvi.b) TopUpFormActivity.this.f328230n.getValue()).accept(InterfaceC25540a.c.f57054a);
            return G0.f406611a;
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/input/a;", "item", "", "newValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/wallet/page/topup/form/items/input/a;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<com.avito.android.wallet.page.topup.form.items.input.a, String, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.wallet.page.topup.form.items.input.a aVar, String str) {
            int i12 = TopUpFormActivity.f328228t;
            ((com.avito.android.wallet.page.topup.form.mvi.b) TopUpFormActivity.this.f328230n.getValue()).accept(new InterfaceC25540a.b(aVar, str));
            return G0.f406611a;
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/bubble/a;", "bubbleItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/wallet/page/topup/form/items/bubble/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<com.avito.android.wallet.page.topup.form.items.bubble.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.wallet.page.topup.form.items.bubble.a aVar) {
            int i12 = TopUpFormActivity.f328228t;
            ((com.avito.android.wallet.page.topup.form.mvi.b) TopUpFormActivity.this.f328230n.getValue()).accept(new InterfaceC25540a.C1999a(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f328240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f328240l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f328240l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return TopUpFormActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return TopUpFormActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: TopUpFormActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/page/topup/form/mvi/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.wallet.page.topup.form.mvi.b> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.wallet.page.topup.form.mvi.b invoke() {
            com.avito.android.wallet.page.topup.form.mvi.c cVar = TopUpFormActivity.this.f328229m;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.wallet.page.topup.form.mvi.b) cVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_top_up;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.wallet.page.topup.form.di.b.a().a((com.avito.android.wallet.page.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.wallet.page.di.component.e.class), new C28478k(TopUpFormPerfScreen.f328244d, s.a(this), null, 4, null), getIntent().getStringExtra("TopUpFormActivity_amount"), getResources(), new d(), new e(), new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f328231o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
        super.Z1();
        Toolbar toolbar = this.f304539d;
        Drawable navigationIcon = toolbar != null ? toolbar.getNavigationIcon() : null;
        if (navigationIcon == null) {
            return;
        }
        navigationIcon.setColorFilter(C22763c.a(C35835l0.d(R.attr.black, this), BlendModeCompat.f44706c));
    }

    @Override // android.app.Activity
    public final void finish() {
        K2.c(this);
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f328231o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setResult(0);
        View viewK1 = K1();
        com.avito.konveyor.adapter.j jVar = this.f328232p;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.android.recycler.data_aware.c cVar = this.f328233q;
        if (cVar == null) {
            cVar = null;
        }
        this.f328234r = new com.avito.android.wallet.page.topup.form.mvi.a(viewK1, jVar, cVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f328231o;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.wallet.page.topup.form.mvi.b) this.f328230n.getValue(), new b(1, this, TopUpFormActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormOneTimeEvent;)V", 0), new c(1, this, TopUpFormActivity.class, "render", "render(Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f328231o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.wallet.page.topup.form.mvi.a aVar = this.f328234r;
        if (aVar != null) {
            aVar.f328352e.dispose();
        }
    }
}
