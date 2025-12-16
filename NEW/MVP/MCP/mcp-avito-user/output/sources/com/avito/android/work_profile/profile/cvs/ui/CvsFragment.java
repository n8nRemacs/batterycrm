package com.avito.android.work_profile.profile.cvs.ui;

import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_snippet.CvSnippet;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.work_profile.domain.entity.CvsAction;
import com.avito.konveyor.adapter.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import lQ0.C43670a;
import mQ0.AbstractC44002a;
import mQ0.C44003b;
import nQ0.InterfaceC44322a;
import z1.AbstractC50339a;

/* compiled from: CvsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/ui/CvsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LnQ0/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CvsFragment extends BaseFragment implements InterfaceC44322a, InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f331065s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f331066n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f331067o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public lQ0.b f331068p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final O0 f331069q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f331070r0;

    /* compiled from: CvsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/ui/CvsFragment$a;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.cvs.ui.CvsFragment$onViewCreated$1", f = "CvsFragment.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331071q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.work_profile.profile.cvs.ui.c f331073s;

        /* compiled from: CvsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.work_profile.profile.cvs.ui.CvsFragment$onViewCreated$1$1", f = "CvsFragment.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f331074q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CvsFragment f331075r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.work_profile.profile.cvs.ui.c f331076s;

            /* compiled from: CvsFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LmQ0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LmQ0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.work_profile.profile.cvs.ui.CvsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C10288a extends N implements l<C44003b, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.work_profile.profile.cvs.ui.c f331077l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10288a(com.avito.android.work_profile.profile.cvs.ui.c cVar) {
                    super(1);
                    this.f331077l = cVar;
                }

                @Override // Y41.l
                public final G0 invoke(C44003b c44003b) {
                    final C44003b c44003b2 = c44003b;
                    final com.avito.android.work_profile.profile.cvs.ui.c cVar = this.f331077l;
                    com.avito.android.progress_overlay.l lVar = cVar.f331091d;
                    if (c44003b2.f414503d) {
                        lVar.k(null);
                    } else {
                        SwipeRefreshLayout swipeRefreshLayout = cVar.f331092e;
                        ApiError apiError = c44003b2.f414504e;
                        if (apiError != null) {
                            if (C43066x.K(apiError.getF244063c())) {
                                lVar.a("");
                            } else {
                                lVar.a(apiError.getF244063c());
                            }
                            swipeRefreshLayout.setRefreshing(false);
                        } else {
                            List<CvSnippet> list = c44003b2.f414501b;
                            boolean zIsEmpty = list.isEmpty();
                            LinearLayout linearLayout = cVar.f331097j;
                            CvsAction cvsAction = c44003b2.f414502c;
                            if (!zIsEmpty) {
                                D6.w(linearLayout);
                                cVar.f331093f.setAdapter(cVar.f331089b);
                                com.avito.konveyor.util.a.a(cVar.f331088a, list);
                                if (cvsAction != null) {
                                    final int i12 = 0;
                                    cVar.f331095h.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.work_profile.profile.cvs.ui.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i12) {
                                                case 0:
                                                    cVar.f331090c.invoke(new AbstractC44002a.C11828a(c44003b2.f414502c.getDeepLink()));
                                                    break;
                                                default:
                                                    cVar.f331090c.invoke(new AbstractC44002a.C11828a(c44003b2.f414502c.getDeepLink()));
                                                    break;
                                            }
                                        }
                                    });
                                    D6.H(cVar.f331094g);
                                }
                                lVar.j();
                            } else if (cvsAction != null) {
                                String title = cvsAction.getTitle();
                                Button button = cVar.f331096i;
                                button.setText(title);
                                final int i13 = 1;
                                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.work_profile.profile.cvs.ui.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i13) {
                                            case 0:
                                                cVar.f331090c.invoke(new AbstractC44002a.C11828a(c44003b2.f414502c.getDeepLink()));
                                                break;
                                            default:
                                                cVar.f331090c.invoke(new AbstractC44002a.C11828a(c44003b2.f414502c.getDeepLink()));
                                                break;
                                        }
                                    }
                                });
                                D6.H(linearLayout);
                            }
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CvsFragment cvsFragment, com.avito.android.work_profile.profile.cvs.ui.c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f331075r = cvsFragment;
                this.f331076s = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new a(this.f331075r, this.f331076s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f331074q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = CvsFragment.f331065s0;
                    CvsFragment cvsFragment = this.f331075r;
                    n2<C44003b> state = cvsFragment.q5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = cvsFragment.f331070r0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C10288a c10288a = new C10288a(this.f331076s);
                    this.f331074q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c10288a, this) == coroutine_suspended) {
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
        public b(com.avito.android.work_profile.profile.cvs.ui.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f331073s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return CvsFragment.this.new b(this.f331073s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331071q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                com.avito.android.work_profile.profile.cvs.ui.c cVar = this.f331073s;
                CvsFragment cvsFragment = CvsFragment.this;
                a aVar = new a(cvsFragment, cVar, null);
                this.f331071q = 1;
                if (C23056p0.b(cvsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CvsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LmQ0/a;", "action", "Lkotlin/G0;", "invoke", "(LmQ0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<AbstractC44002a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC44002a abstractC44002a) {
            a aVar = CvsFragment.f331065s0;
            CvsFragment.this.q5().accept(abstractC44002a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f331079l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f331079l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f331079l);
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
            return CvsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f331081l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f331081l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f331081l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f331082l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f331082l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f331082l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f331083l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f331083l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f331083l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CvsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LlQ0/a;", "kotlin.jvm.PlatformType", "invoke", "()LlQ0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<C43670a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final C43670a invoke() {
            lQ0.b bVar = CvsFragment.this.f331068p0;
            if (bVar == null) {
                bVar = null;
            }
            return (C43670a) bVar.get();
        }
    }

    public CvsFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f331069q0 = new O0(m0.f406844a.b(C43670a.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // nQ0.InterfaceC44322a
    public final void V4(@k DeepLink deepLink) {
        q5().accept(new AbstractC44002a.b(deepLink));
    }

    @Override // nQ0.InterfaceC44322a
    public final void W2(@k DeepLink deepLink) {
        q5().accept(new AbstractC44002a.b(deepLink));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f331070r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.cvs_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(AbstractC44002a.c.f414499a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.root);
        com.avito.konveyor.adapter.a aVar = this.f331066n0;
        if (aVar == null) {
            aVar = null;
        }
        j jVar = this.f331067o0;
        if (jVar == null) {
            jVar = null;
        }
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(new com.avito.android.work_profile.profile.cvs.ui.c(viewGroup, aVar, jVar, new c()), null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f331070r0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.work_profile.profile.cvs.di.h.a().a((com.avito.android.work_profile.profile.cvs.di.b) C29972i.a(C29972i.b(this), com.avito.android.work_profile.profile.cvs.di.b.class), cv.c.b(this), getResources(), this, s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f331070r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final C43670a q5() {
        return (C43670a) this.f331069q0.getValue();
    }
}
