package com.avito.android.services_onboarding;

import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import Zu0.InterfaceC19610a;
import Zu0.b;
import Zu0.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
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
import com.avito.android.analytics.screens.ServiceCpxOnboardingScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.P5;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: ServicesOnboardingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServicesOnboardingFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f279769y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.services_onboarding.h f279770n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f279771o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f279772p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f279773q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f279774r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f279775s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final e2 f279776t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f279777u0;

    /* renamed from: v0, reason: collision with root package name */
    public PageIndicatorRe23 f279778v0;

    /* renamed from: w0, reason: collision with root package name */
    public Button f279779w0;

    /* renamed from: x0, reason: collision with root package name */
    public C42670a f279780x0;

    /* compiled from: ServicesOnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingFragment$a;", "", "<init>", "()V", "", "SCROLL_DEBOUNCE_MILLIS", "J", "", "SERVICES_ONBOARDING_STEP_BUNDLE_KEY", "Ljava/lang/String;", "SERVICES_ONBOARDING_TARGET_BUNDLE_KEY", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServicesOnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onCreateView$1", f = "ServicesOnboardingFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279781q;

        /* compiled from: ServicesOnboardingFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onCreateView$1$1", f = "ServicesOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f279783q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ServicesOnboardingFragment f279784r;

            /* compiled from: ServicesOnboardingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onCreateView$1$1$1", f = "ServicesOnboardingFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.services_onboarding.ServicesOnboardingFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8315a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f279785q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServicesOnboardingFragment f279786r;

                /* compiled from: ServicesOnboardingFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZu0/c;", "it", "Lkotlin/G0;", "invoke", "(LZu0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.services_onboarding.ServicesOnboardingFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8316a extends N implements l<Zu0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ServicesOnboardingFragment f279787l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8316a(ServicesOnboardingFragment servicesOnboardingFragment) {
                        super(1);
                        this.f279787l = servicesOnboardingFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(Zu0.c cVar) {
                        Zu0.c cVar2 = cVar;
                        a aVar = ServicesOnboardingFragment.f279769y0;
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279787l;
                        if (cVar2.f20562g) {
                            C42670a c42670a = servicesOnboardingFragment.f279780x0;
                            C42670a.d(c42670a != null ? c42670a : null);
                        } else if (cVar2.f20561f != null) {
                            C42670a c42670a2 = servicesOnboardingFragment.f279780x0;
                            if (c42670a2 == null) {
                                c42670a2 = null;
                            }
                            c42670a2.c(null, new com.avito.android.services_onboarding.e(servicesOnboardingFragment));
                        } else {
                            com.avito.konveyor.adapter.a aVar2 = servicesOnboardingFragment.f279774r0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            aVar2.c(new UV0.c(cVar2.f20557b));
                            c.a aVar3 = cVar2.f20558c;
                            if (aVar3 != null) {
                                Button button = servicesOnboardingFragment.f279779w0;
                                if (button == null) {
                                    button = null;
                                }
                                com.avito.android.lib.design.button.b.a(button, aVar3.f20563a, false);
                                Button button2 = servicesOnboardingFragment.f279779w0;
                                if (button2 == null) {
                                    button2 = null;
                                }
                                button2.setOnClickListener(new com.avito.android.services_onboarding.c(servicesOnboardingFragment, 2));
                            }
                            C42670a c42670a3 = servicesOnboardingFragment.f279780x0;
                            (c42670a3 != null ? c42670a3 : null).b();
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8315a(ServicesOnboardingFragment servicesOnboardingFragment, Continuation<? super C8315a> continuation) {
                    super(2, continuation);
                    this.f279786r = servicesOnboardingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8315a(this.f279786r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8315a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f279785q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ServicesOnboardingFragment.f279769y0;
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279786r;
                        n2<Zu0.c> state = servicesOnboardingFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = servicesOnboardingFragment.f279772p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8316a c8316a = new C8316a(servicesOnboardingFragment);
                        this.f279785q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8316a, this) == coroutine_suspended) {
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

            /* compiled from: ServicesOnboardingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onCreateView$1$1$2", f = "ServicesOnboardingFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.services_onboarding.ServicesOnboardingFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8317b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f279788q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServicesOnboardingFragment f279789r;

                /* compiled from: ServicesOnboardingFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.services_onboarding.ServicesOnboardingFragment$b$a$b$a, reason: collision with other inner class name */
                public static final class C8318a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ServicesOnboardingFragment f279790b;

                    public C8318a(ServicesOnboardingFragment servicesOnboardingFragment) {
                        this.f279790b = servicesOnboardingFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        ((Number) obj).intValue();
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279790b;
                        RecyclerView recyclerView = servicesOnboardingFragment.f279777u0;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.H1()) : null;
                        Integer num = (numValueOf == null || numValueOf.intValue() != -1) ? numValueOf : null;
                        servicesOnboardingFragment.q5().accept(new InterfaceC19610a.c(num != null ? num.intValue() : 0));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8317b(ServicesOnboardingFragment servicesOnboardingFragment, Continuation<? super C8317b> continuation) {
                    super(2, continuation);
                    this.f279789r = servicesOnboardingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8317b(this.f279789r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8317b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f279788q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279789r;
                        InterfaceC43160i interfaceC43160iN = C43175k.n(C43175k.r(servicesOnboardingFragment.f279776t0), 100L);
                        C8318a c8318a = new C8318a(servicesOnboardingFragment);
                        this.f279788q = 1;
                        if (interfaceC43160iN.collect(c8318a, this) == coroutine_suspended) {
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

            /* compiled from: ServicesOnboardingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onCreateView$1$1$3", f = "ServicesOnboardingFragment.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f279791q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServicesOnboardingFragment f279792r;

                /* compiled from: ServicesOnboardingFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.services_onboarding.ServicesOnboardingFragment$b$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C8319a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ServicesOnboardingFragment f279793b;

                    public C8319a(ServicesOnboardingFragment servicesOnboardingFragment) {
                        this.f279793b = servicesOnboardingFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Zu0.b bVar = (Zu0.b) obj;
                        a aVar = ServicesOnboardingFragment.f279769y0;
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279793b;
                        if (bVar instanceof b.C1470b) {
                            RecyclerView recyclerView = servicesOnboardingFragment.f279777u0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            b.C1470b c1470b = (b.C1470b) bVar;
                            recyclerView.A0(c1470b.f20553a);
                            PageIndicatorRe23 pageIndicatorRe23 = servicesOnboardingFragment.f279778v0;
                            PageIndicatorRe23 pageIndicatorRe232 = pageIndicatorRe23 != null ? pageIndicatorRe23 : null;
                            int i12 = PageIndicatorRe23.f179906k;
                            pageIndicatorRe232.e(c1470b.f20553a, pageIndicatorRe232.getState$_design_modules_components().f179932b);
                        } else if (bVar instanceof b.a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = servicesOnboardingFragment.f279775s0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.a) bVar).f20552a, null, null, 6);
                        } else if (L.f(bVar, b.c.f20554a)) {
                            RecyclerView recyclerView2 = servicesOnboardingFragment.f279777u0;
                            if (recyclerView2 == null) {
                                recyclerView2 = null;
                            }
                            RecyclerView.m layoutManager = recyclerView2.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.L1()) : null;
                            if (numValueOf != null) {
                                int iIntValue = numValueOf.intValue();
                                com.avito.konveyor.adapter.j jVar = servicesOnboardingFragment.f279773q0;
                                if (jVar == null) {
                                    jVar = null;
                                }
                                if (iIntValue < jVar.f338513c.getCount() - 1) {
                                    RecyclerView recyclerView3 = servicesOnboardingFragment.f279777u0;
                                    (recyclerView3 != null ? recyclerView3 : null).F0(numValueOf.intValue() + 1);
                                }
                            }
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
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f279793b, ServicesOnboardingFragment.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(ServicesOnboardingFragment servicesOnboardingFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f279792r = servicesOnboardingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new c(this.f279792r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f279791q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ServicesOnboardingFragment.f279769y0;
                        ServicesOnboardingFragment servicesOnboardingFragment = this.f279792r;
                        InterfaceC43160i<Zu0.b> events = servicesOnboardingFragment.q5().getEvents();
                        C8319a c8319a = new C8319a(servicesOnboardingFragment);
                        this.f279791q = 1;
                        if (events.collect(c8319a, this) == coroutine_suspended) {
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
            public a(ServicesOnboardingFragment servicesOnboardingFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f279784r = servicesOnboardingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f279784r, continuation);
                aVar.f279783q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f279783q;
                ServicesOnboardingFragment servicesOnboardingFragment = this.f279784r;
                C43259k.d(t12, null, null, new C8315a(servicesOnboardingFragment, null), 3);
                C43259k.d(t12, null, null, new C8317b(servicesOnboardingFragment, null), 3);
                C43259k.d(t12, null, null, new c(servicesOnboardingFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return ServicesOnboardingFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279781q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ServicesOnboardingFragment servicesOnboardingFragment = ServicesOnboardingFragment.this;
                a aVar = new a(servicesOnboardingFragment, null);
                this.f279781q = 1;
                if (C23056p0.b(servicesOnboardingFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ServicesOnboardingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f279794l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f279794l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f279794l.findViewById(R.id.content_group);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: ServicesOnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/services_onboarding/ServicesOnboardingFragment$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.r {

        /* compiled from: ServicesOnboardingFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.services_onboarding.ServicesOnboardingFragment$onViewCreated$4$onScrolled$1", f = "ServicesOnboardingFragment.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f279796q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ServicesOnboardingFragment f279797r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f279798s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ServicesOnboardingFragment servicesOnboardingFragment, int i12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f279797r = servicesOnboardingFragment;
                this.f279798s = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new a(this.f279797r, this.f279798s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f279796q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e2 e2Var = this.f279797r.f279776t0;
                    Integer numBoxInt = Boxing.boxInt(this.f279798s);
                    this.f279796q = 1;
                    if (e2Var.emit(numBoxInt, this) == coroutine_suspended) {
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

        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            ServicesOnboardingFragment servicesOnboardingFragment = ServicesOnboardingFragment.this;
            C43259k.d(C22984Q.a(servicesOnboardingFragment.getViewLifecycleOwner()), null, null, new a(servicesOnboardingFragment, i12, null), 3);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f279799l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f279799l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f279799l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServicesOnboardingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f279801l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f279801l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f279801l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f279802l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f279802l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f279802l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f279803l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f279803l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f279803l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServicesOnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/services_onboarding/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.services_onboarding.g> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.services_onboarding.g invoke() {
            com.avito.android.services_onboarding.h hVar = ServicesOnboardingFragment.this.f279770n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.services_onboarding.g) hVar.get();
        }
    }

    public ServicesOnboardingFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f279771o0 = new O0(m0.f406844a.b(com.avito.android.services_onboarding.g.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f279776t0 = f2.b(0, 0, null, 7);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f279772p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_services_onboarding, viewGroup, false);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f279772p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        View viewFindViewById = view.findViewById(R.id.onboarding_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f279779w0 = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler_page_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23");
        }
        this.f279778v0 = (PageIndicatorRe23) viewFindViewById2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f279777u0 = recyclerView;
        com.avito.konveyor.adapter.j jVar = this.f279773q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        View viewFindViewById3 = view.findViewById(R.id.toolbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById3;
        P5.d(toolbar);
        toolbar.setNavigationOnClickListener(new com.avito.android.services_onboarding.c(this, 0));
        View viewFindViewById4 = view.findViewById(R.id.progress_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById4, new c(view), 0, 4, null);
        this.f279780x0 = c42670a;
        c42670a.a(new com.avito.android.services_onboarding.c(this, 1));
        J j12 = new J();
        RecyclerView recyclerView2 = this.f279777u0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        j12.b(recyclerView2);
        PageIndicatorRe23 pageIndicatorRe23 = this.f279778v0;
        if (pageIndicatorRe23 == null) {
            pageIndicatorRe23 = null;
        }
        RecyclerView recyclerView3 = this.f279777u0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        com.avito.android.lib.design.page_indicator_re23.b.a(pageIndicatorRe23, recyclerView3);
        RecyclerView recyclerView4 = this.f279777u0;
        (recyclerView4 != null ? recyclerView4 : null).o(new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ServicesOnboardingTarget servicesOnboardingTarget;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(ServiceCpxOnboardingScreen.f90486d, s.c(this), "servicesCpxOnboarding");
        Bundle arguments = getArguments();
        if (arguments != null) {
            servicesOnboardingTarget = (ServicesOnboardingTarget) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("services_onboarding_target_bundle_key", ServicesOnboardingTarget.class) : arguments.getParcelable("services_onboarding_target_bundle_key"));
        } else {
            servicesOnboardingTarget = null;
        }
        if (servicesOnboardingTarget == null) {
            throw new IllegalArgumentException("onboarding target bundle parameter must not be null");
        }
        Bundle arguments2 = getArguments();
        Integer numValueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt("services_onboarding_step_bundle_key")) : null;
        com.avito.android.services_onboarding.di.a.a().a((com.avito.android.services_onboarding.di.e) C29972i.a(C29972i.b(this), com.avito.android.services_onboarding.di.e.class), cv.c.b(this), getResources(), c28478k, servicesOnboardingTarget, (numValueOf != null && numValueOf.intValue() == -1) ? null : numValueOf).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f279772p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.services_onboarding.g q5() {
        return (com.avito.android.services_onboarding.g) this.f279771o0.getValue();
    }
}
