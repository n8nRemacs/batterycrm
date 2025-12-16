package com.avito.android.work_profile.profile.work_profile_host.ui;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qQ0.C47332a;
import qQ0.C47333b;
import rQ0.C47587b;
import z1.AbstractC50339a;

/* compiled from: WorkProfileHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/WorkProfileHostFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkProfileHostFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public C47333b f331293n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f331294o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final C35968w3 f331295p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f331296q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f331297r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f331292t0 = {m0.f406844a.e(new Y(WorkProfileHostFragment.class, "openParams", "getOpenParams()Lcom/avito/android/work_profile/WorkProfileOpenParams;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f331291s0 = new a(null);

    /* compiled from: WorkProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/WorkProfileHostFragment$a;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WorkProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.work_profile_host.ui.WorkProfileHostFragment$onViewCreated$1", f = "WorkProfileHostFragment.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331298q;

        /* compiled from: WorkProfileHostFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.work_profile.profile.work_profile_host.ui.WorkProfileHostFragment$onViewCreated$1$1", f = "WorkProfileHostFragment.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f331300q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ WorkProfileHostFragment f331301r;

            /* compiled from: WorkProfileHostFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrQ0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LrQ0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.work_profile.profile.work_profile_host.ui.WorkProfileHostFragment$b$a$a, reason: collision with other inner class name */
            public static final class C10299a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WorkProfileHostFragment f331302b;

                public C10299a(WorkProfileHostFragment workProfileHostFragment) {
                    this.f331302b = workProfileHostFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    C47587b c47587b = (C47587b) obj;
                    com.avito.android.work_profile.profile.work_profile_host.ui.f fVar = (com.avito.android.work_profile.profile.work_profile_host.ui.f) this.f331302b.f331297r0.getValue();
                    C42670a c42670a = fVar.f331320f;
                    if (c47587b.f429812d) {
                        C42670a.d(c42670a);
                    } else if (c47587b.f429814f) {
                        c42670a.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), new com.avito.android.work_profile.profile.work_profile_host.ui.g(fVar));
                    } else {
                        com.avito.android.work_profile.profile.work_profile_host.ui.a aVar = fVar.f331316b;
                        List<? extends WorkProfileTab> list = aVar.f331311k;
                        List<WorkProfileTab> list2 = c47587b.f429810b;
                        if (!L.f(list, list2) && !list2.isEmpty()) {
                            aVar.f331311k = list2;
                            aVar.notifyDataSetChanged();
                            for (WorkProfileTab workProfileTab : list2) {
                                com.avito.android.lib.design.tab_layout.c cVar = fVar.f331317c;
                                c.i iVarK = cVar.k();
                                iVarK.c(workProfileTab.f330700c);
                                ArrayList<c.i> arrayList = cVar.f180847b;
                                cVar.b(iVarK, arrayList.size(), arrayList.isEmpty());
                            }
                            com.avito.android.work_profile.profile.work_profile_host.ui.e eVar = fVar.f331319e;
                            ViewPager2 viewPager2 = fVar.f331318d;
                            if (eVar == null) {
                                com.avito.android.work_profile.profile.work_profile_host.ui.e eVar2 = new com.avito.android.work_profile.profile.work_profile_host.ui.e(fVar, c47587b);
                                viewPager2.e(eVar2);
                                fVar.f331319e = eVar2;
                            }
                            viewPager2.g(list2.indexOf(c47587b.f429811c), false);
                            c42670a.b();
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WorkProfileHostFragment workProfileHostFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f331301r = workProfileHostFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f331301r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f331300q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    WorkProfileHostFragment workProfileHostFragment = this.f331301r;
                    n2<C47587b> state = ((C47332a) workProfileHostFragment.f331294o0.getValue()).getState();
                    C10299a c10299a = new C10299a(workProfileHostFragment);
                    this.f331300q = 1;
                    if (state.collect(c10299a, this) == coroutine_suspended) {
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return WorkProfileHostFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331298q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                WorkProfileHostFragment workProfileHostFragment = WorkProfileHostFragment.this;
                a aVar = new a(workProfileHostFragment, null);
                this.f331298q = 1;
                if (C23056p0.b(workProfileHostFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: WorkProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/a;", "invoke", "()Lcom/avito/android/work_profile/profile/work_profile_host/ui/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.work_profile.profile.work_profile_host.ui.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.work_profile.profile.work_profile_host.ui.a invoke() {
            com.avito.android.work_profile.profile.work_profile_host.ui.a aVar = new com.avito.android.work_profile.profile.work_profile_host.ui.a(WorkProfileHostFragment.this);
            aVar.f331311k = C42784z0.f406748b;
            return aVar;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f331304l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f331304l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f331304l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return WorkProfileHostFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f331306l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f331306l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f331306l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f331307l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f331307l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f331307l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f331308l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f331308l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f331308l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: WorkProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LqQ0/a;", "kotlin.jvm.PlatformType", "invoke", "()LqQ0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<C47332a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final C47332a invoke() {
            C47333b c47333b = WorkProfileHostFragment.this.f331293n0;
            if (c47333b == null) {
                c47333b = null;
            }
            return (C47332a) c47333b.get();
        }
    }

    /* compiled from: WorkProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/f;", "invoke", "()Lcom/avito/android/work_profile/profile/work_profile_host/ui/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.work_profile.profile.work_profile_host.ui.f> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.work_profile.profile.work_profile_host.ui.f invoke() {
            WorkProfileHostFragment workProfileHostFragment = WorkProfileHostFragment.this;
            return new com.avito.android.work_profile.profile.work_profile_host.ui.f((ViewGroup) workProfileHostFragment.requireActivity().findViewById(R.id.root), new com.avito.android.work_profile.profile.work_profile_host.ui.b(1, (C47332a) workProfileHostFragment.f331294o0.getValue(), C47332a.class, "accept", "accept(Ljava/lang/Object;)V", 0), (com.avito.android.work_profile.profile.work_profile_host.ui.a) workProfileHostFragment.f331296q0.getValue(), new com.avito.android.work_profile.profile.work_profile_host.ui.c(workProfileHostFragment));
        }
    }

    public WorkProfileHostFragment() {
        super(R.layout.work_profile_host_fragment);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f331294o0 = new O0(m0.f406844a.b(C47332a.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f331295p0 = new C35968w3(this);
        this.f331296q0 = C42727D.c(new c());
        this.f331297r0 = C42727D.c(new j());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.work_profile.profile.work_profile_host.di.a.a().a((com.avito.android.work_profile.profile.work_profile_host.di.c) C29972i.a(C29972i.b(this), com.avito.android.work_profile.profile.work_profile_host.di.c.class), (WorkProfileOpenParams) this.f331295p0.getValue(this, f331292t0[0])).a(this);
    }
}
