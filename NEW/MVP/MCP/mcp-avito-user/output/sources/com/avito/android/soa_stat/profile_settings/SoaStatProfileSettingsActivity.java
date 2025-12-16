package com.avito.android.soa_stat.profile_settings;

import Cd.C13243a;
import Y41.p;
import android.os.Bundle;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.soa_stat.profile_settings.l;
import com.avito.android.soa_stat.profile_settings.view.d;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import z1.AbstractC50339a;

/* compiled from: SoaStatProfileSettingsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/SoaStatProfileSettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoaStatProfileSettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f284058s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f284059m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f284060n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public l.a f284061o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public d.a f284062p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public R0 f284063q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final O0 f284064r = new O0(m0.f406844a.b(l.class), new c(), new b(new e()), new d());

    /* compiled from: SoaStatProfileSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity$onCreate$1", f = "SoaStatProfileSettingsActivity.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f284065q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.soa_stat.profile_settings.view.d f284067s;

        /* compiled from: SoaStatProfileSettingsActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity$onCreate$1$1", f = "SoaStatProfileSettingsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity$a$a, reason: collision with other inner class name */
        public static final class C8475a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f284068q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SoaStatProfileSettingsActivity f284069r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.soa_stat.profile_settings.view.d f284070s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8475a(SoaStatProfileSettingsActivity soaStatProfileSettingsActivity, com.avito.android.soa_stat.profile_settings.view.d dVar, Continuation<? super C8475a> continuation) {
                super(2, continuation);
                this.f284069r = soaStatProfileSettingsActivity;
                this.f284070s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8475a c8475a = new C8475a(this.f284069r, this.f284070s, continuation);
                c8475a.f284068q = obj;
                return c8475a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8475a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f284068q;
                int i12 = SoaStatProfileSettingsActivity.f284058s;
                SoaStatProfileSettingsActivity soaStatProfileSettingsActivity = this.f284069r;
                com.avito.android.soa_stat.profile_settings.view.d dVar = this.f284070s;
                C43259k.d(t12, null, null, new h(soaStatProfileSettingsActivity, dVar, null), 3);
                C43259k.d(t12, null, null, new i(soaStatProfileSettingsActivity, dVar, null), 3);
                C43259k.d(t12, null, null, new f(soaStatProfileSettingsActivity, dVar, null), 3);
                C43259k.d(t12, null, null, new g(soaStatProfileSettingsActivity, dVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.soa_stat.profile_settings.view.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f284067s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SoaStatProfileSettingsActivity.this.new a(this.f284067s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f284065q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SoaStatProfileSettingsActivity soaStatProfileSettingsActivity = SoaStatProfileSettingsActivity.this;
                C8475a c8475a = new C8475a(soaStatProfileSettingsActivity, this.f284067s, null);
                this.f284065q = 1;
                if (C23056p0.b(soaStatProfileSettingsActivity, state, c8475a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f284071l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f284071l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f284071l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SoaStatProfileSettingsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SoaStatProfileSettingsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: SoaStatProfileSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/l;", "invoke", "()Lcom/avito/android/soa_stat/profile_settings/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<l> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            l.a aVar = SoaStatProfileSettingsActivity.this.f284061o;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.soa_stat_profile_settings);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.soa_stat.di.a.a().a(s.a(this), (com.avito.android.soa_stat.di.c) C29972i.a(C29972i.b(this), com.avito.android.soa_stat.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f284060n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f284060n;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        getF21241d().a(this, new com.avito.android.soa_stat.profile_settings.e(this));
        d.a aVar = this.f284062p;
        if (aVar == null) {
            aVar = null;
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new a(aVar.a(findViewById(R.id.soa_stat_profile_settings_screen_root), C22981N.a(getLifecycle())), null), 3);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f284060n;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
