package com.avito.android.re_agent_landing.landing.flows_dialog;

import Cd.C13243a;
import Rh0.InterfaceC15042a;
import Y41.p;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.re_agent_landing.landing.error_dialog.ReAgentProfileCreateLandingErrorDialogFragment;
import com.avito.android.re_agent_landing.landing.flows_dialog.model.ReAgentProfileCreateLandingFlowsArguments;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.perf_const.ReAgentProfileCreateLandingFlowsScreen;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/ReAgentProfileCreateLandingFlowsDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReAgentProfileCreateLandingFlowsDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f250622n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.re_agent_landing.landing.flows_dialog.h f250623h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f250624i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f250625j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.re_agent_landing.landing.flows_dialog.e f250626k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f250627l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f250628m0;

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/ReAgentProfileCreateLandingFlowsDialogFragment$a;", "", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C7515a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ReAgentProfileCreateLandingFlowsArguments f250629l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7515a(ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments) {
                super(1);
                this.f250629l = reAgentProfileCreateLandingFlowsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("re_agent_profile_create_landing_flows_arguments", this.f250629l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ReAgentProfileCreateLandingFlowsDialogFragment a(@Y61.k ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments) {
            ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = new ReAgentProfileCreateLandingFlowsDialogFragment();
            C35966w1.a(reAgentProfileCreateLandingFlowsDialogFragment, -1, new C7515a(reAgentProfileCreateLandingFlowsArguments));
            return reAgentProfileCreateLandingFlowsDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/model/ReAgentProfileCreateLandingFlowsArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReAgentProfileCreateLandingFlowsArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReAgentProfileCreateLandingFlowsArguments invoke() {
            Bundle bundleRequireArguments = ReAgentProfileCreateLandingFlowsDialogFragment.this.requireArguments();
            return (ReAgentProfileCreateLandingFlowsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("re_agent_profile_create_landing_flows_arguments", ReAgentProfileCreateLandingFlowsArguments.class) : bundleRequireArguments.getParcelable("re_agent_profile_create_landing_flows_arguments"));
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$onCreateDialog$1", f = "ReAgentProfileCreateLandingFlowsDialogFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f250631q;

        /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$onCreateDialog$1$1", f = "ReAgentProfileCreateLandingFlowsDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f250633q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ReAgentProfileCreateLandingFlowsDialogFragment f250634r;

            /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$onCreateDialog$1$1$1", f = "ReAgentProfileCreateLandingFlowsDialogFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C7516a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f250635q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReAgentProfileCreateLandingFlowsDialogFragment f250636r;

                /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7517a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.re_agent_landing.landing.flows_dialog.c f250637b;

                    public C7517a(com.avito.android.re_agent_landing.landing.flows_dialog.c cVar) {
                        this.f250637b = cVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f250637b.a((ReAgentProfileCreateLandingFlowsState) obj);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f250637b, com.avito.android.re_agent_landing.landing.flows_dialog.c.class, "render", "render(Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7516a(ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment, Continuation<? super C7516a> continuation) {
                    super(2, continuation);
                    this.f250636r = reAgentProfileCreateLandingFlowsDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7516a(this.f250636r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7516a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f250635q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = this.f250636r;
                        n2<ReAgentProfileCreateLandingFlowsState> state = ((com.avito.android.re_agent_landing.landing.flows_dialog.g) reAgentProfileCreateLandingFlowsDialogFragment.f250624i0.getValue()).getState();
                        com.avito.android.re_agent_landing.landing.flows_dialog.e eVar = reAgentProfileCreateLandingFlowsDialogFragment.f250626k0;
                        if (eVar == null) {
                            eVar = null;
                        }
                        C7517a c7517a = new C7517a(eVar);
                        this.f250635q = 1;
                        if (state.collect(c7517a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$onCreateDialog$1$1$2", f = "ReAgentProfileCreateLandingFlowsDialogFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f250638q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReAgentProfileCreateLandingFlowsDialogFragment f250639r;

                /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7518a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ReAgentProfileCreateLandingFlowsDialogFragment f250640b;

                    public C7518a(ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment) {
                        this.f250640b = reAgentProfileCreateLandingFlowsDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15042a interfaceC15042a = (InterfaceC15042a) obj;
                        a aVar = ReAgentProfileCreateLandingFlowsDialogFragment.f250622n0;
                        ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = this.f250640b;
                        if (interfaceC15042a instanceof InterfaceC15042a.b) {
                            reAgentProfileCreateLandingFlowsDialogFragment.dismiss();
                        } else if (interfaceC15042a instanceof InterfaceC15042a.C0971a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = reAgentProfileCreateLandingFlowsDialogFragment.f250627l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC15042a.C0971a) interfaceC15042a).f14564a, null, null, 6);
                        } else if (interfaceC15042a instanceof InterfaceC15042a.c) {
                            new ReAgentProfileCreateLandingErrorDialogFragment().show(reAgentProfileCreateLandingFlowsDialogFragment.getParentFragmentManager(), "re_agent_profile_create_landing_error");
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f250640b, ReAgentProfileCreateLandingFlowsDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f250639r = reAgentProfileCreateLandingFlowsDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f250639r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f250638q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = this.f250639r;
                        InterfaceC43160i<InterfaceC15042a> events = ((com.avito.android.re_agent_landing.landing.flows_dialog.g) reAgentProfileCreateLandingFlowsDialogFragment.f250624i0.getValue()).getEvents();
                        C7518a c7518a = new C7518a(reAgentProfileCreateLandingFlowsDialogFragment);
                        this.f250638q = 1;
                        if (events.collect(c7518a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f250634r = reAgentProfileCreateLandingFlowsDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f250634r, continuation);
                aVar.f250633q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f250633q;
                ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = this.f250634r;
                C43259k.d(t12, null, null, new C7516a(reAgentProfileCreateLandingFlowsDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(reAgentProfileCreateLandingFlowsDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ReAgentProfileCreateLandingFlowsDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f250631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment = ReAgentProfileCreateLandingFlowsDialogFragment.this;
                a aVar = new a(reAgentProfileCreateLandingFlowsDialogFragment, null);
                this.f250631q = 1;
                if (C23056p0.b(reAgentProfileCreateLandingFlowsDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.re_agent_landing.landing.flows_dialog.c) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.re_agent_landing.landing.flows_dialog.c) this.receiver).c(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a aVar) {
            ((com.avito.android.re_agent_landing.landing.flows_dialog.g) ReAgentProfileCreateLandingFlowsDialogFragment.this.f250624i0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f250642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f250642l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f250642l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ReAgentProfileCreateLandingFlowsDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f250644l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f250644l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f250644l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f250645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f250645l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f250645l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f250646l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f250646l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f250646l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/re_agent_landing/landing/flows_dialog/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.re_agent_landing.landing.flows_dialog.g> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.re_agent_landing.landing.flows_dialog.g invoke() {
            com.avito.android.re_agent_landing.landing.flows_dialog.h hVar = ReAgentProfileCreateLandingFlowsDialogFragment.this.f250623h0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.re_agent_landing.landing.flows_dialog.g) hVar.get();
        }
    }

    public ReAgentProfileCreateLandingFlowsDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f250624i0 = new O0(m0.f406844a.b(com.avito.android.re_agent_landing.landing.flows_dialog.g.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f250628m0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.re_agent_landing.landing.flows_dialog.di.a.a().a((com.avito.android.re_agent_landing.di.c) C29972i.a(C29972i.b(this), com.avito.android.re_agent_landing.di.c.class), cv.c.b(this), new C28478k(ReAgentProfileCreateLandingFlowsScreen.f250842d, s.b(this), null, 4, null), (ReAgentProfileCreateLandingFlowsArguments) this.f250628m0.getValue(), new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f250625j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f250625j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.re_agent_landing.landing.flows_dialog.e eVar = this.f250626k0;
        d dVar2 = new d(1, eVar != null ? eVar : null, com.avito.android.re_agent_landing.landing.flows_dialog.c.class, "setUpContentView", "setUpContentView(Landroid/view/View;)V", 0);
        com.avito.android.re_agent_landing.landing.flows_dialog.e eVar2 = this.f250626k0;
        dVar.B(R.layout.re_agent_profile_create_landing_flows_dialog_content, R.layout.re_agent_profile_create_landing_flows_dialog_footer, dVar2, new e(1, eVar2 != null ? eVar2 : null, com.avito.android.re_agent_landing.landing.flows_dialog.c.class, "setUpFooterView", "setUpFooterView(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.re_agent_profile_create_landing_flows_dialog_header, (ViewGroup) null);
        com.avito.android.re_agent_landing.landing.flows_dialog.e eVar3 = this.f250626k0;
        if (eVar3 == null) {
            eVar3 = null;
        }
        eVar3.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.re_agent_profile_create_landing_flows_close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setOnClickListener(new com.avito.android.re_agent_landing.landing.flows_dialog.d(eVar3, 1));
        dVar.H(viewInflate);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f250625j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.re_agent_landing.landing.flows_dialog.e eVar = this.f250626k0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f250661b = null;
        eVar.f250662c = null;
        eVar.f250663d = null;
        eVar.f250664e = null;
        eVar.f250665f = null;
        eVar.f250666g = null;
        eVar.f250667h = null;
        eVar.f250668i = null;
        eVar.f250669j = null;
        eVar.f250670k = null;
    }
}
