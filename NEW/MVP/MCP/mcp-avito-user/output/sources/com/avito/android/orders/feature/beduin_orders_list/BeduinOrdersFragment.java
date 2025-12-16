package com.avito.android.orders.feature.beduin_orders_list;

import Cd.C13243a;
import Y41.p;
import Z40.a;
import Z40.b;
import Z40.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.y6;
import gj.InterfaceC40691b;
import gj.m;
import gj.o;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import n50.InterfaceC44195a;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: BeduinOrdersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/BeduinOrdersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BeduinOrdersFragment extends BaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f209960E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f209961F0;

    /* renamed from: A0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f209962A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public String f209963B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public String f209964C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public String f209965D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.orders.feature.beduin_orders_list.e f209966n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f209967o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public gj.n f209968p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f209969q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f209970r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209971s0;

    /* renamed from: t0, reason: collision with root package name */
    public com.avito.android.beduin_shared.model.progress_overlay.a f209972t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47312b f209973u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47312b f209974v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47312b f209975w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f209976x0;

    /* renamed from: y0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f209977y0;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f209978z0;

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/BeduinOrdersFragment$a;", "", "<init>", "()V", "", "ORDER_OWNER_TYPE_KEY", "Ljava/lang/String;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinOrdersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/i;", "invoke", "()Lcom/avito/android/orders/feature/beduin_orders_list/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.orders.feature.beduin_orders_list.i> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.orders.feature.beduin_orders_list.i invoke() {
            String string;
            Bundle arguments = BeduinOrdersFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("order_owner_type_key")) == null) {
                return null;
            }
            return new com.avito.android.orders.feature.beduin_orders_list.i(string);
        }
    }

    /* compiled from: BeduinOrdersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f209980l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f209980l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f209980l.findViewById(R.id.orders_content);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_shared/model/progress_overlay/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<com.avito.android.beduin_shared.model.progress_overlay.b, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.beduin_shared.model.progress_overlay.b bVar) {
            com.avito.android.beduin_shared.model.progress_overlay.b bVar2 = bVar;
            b.a aVar = bVar2 instanceof b.a ? (b.a) bVar2 : null;
            a aVar2 = BeduinOrdersFragment.f209960E0;
            BeduinOrdersFragment.this.s5().accept(new a.C1416a(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$onViewCreated$3", f = "BeduinOrdersFragment.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209982q;

        /* compiled from: BeduinOrdersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$onViewCreated$3$1", f = "BeduinOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f209984q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BeduinOrdersFragment f209985r;

            /* compiled from: BeduinOrdersFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$onViewCreated$3$1$1", f = "BeduinOrdersFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$e$a$a, reason: collision with other inner class name */
            public static final class C6265a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f209986q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BeduinOrdersFragment f209987r;

                /* compiled from: BeduinOrdersFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$e$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6266a extends H implements Y41.l<Z40.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(Z40.c cVar) {
                        Z40.c cVar2 = cVar;
                        BeduinOrdersFragment beduinOrdersFragment = (BeduinOrdersFragment) this.receiver;
                        a aVar = BeduinOrdersFragment.f209960E0;
                        beduinOrdersFragment.getClass();
                        if (cVar2 instanceof c.C1417c) {
                            com.avito.android.beduin_shared.model.progress_overlay.a aVar2 = beduinOrdersFragment.f209972t0;
                            C42670a.d(aVar2 != null ? aVar2 : null);
                        } else if (cVar2 instanceof c.d) {
                            com.avito.android.beduin_shared.model.progress_overlay.a aVar3 = beduinOrdersFragment.f209972t0;
                            C42670a.d(aVar3 != null ? aVar3 : null);
                        } else if (cVar2 instanceof c.b) {
                            c.b bVar = (c.b) cVar2;
                            com.avito.android.beduin_shared.model.progress_overlay.a aVar4 = beduinOrdersFragment.f209972t0;
                            (aVar4 != null ? aVar4 : null).e(new b.a(beduinOrdersFragment.requireContext(), z.k(bVar.f19871b), null, null, beduinOrdersFragment.getString(R.string.orders_retry_label), new com.avito.android.order.feature.c(beduinOrdersFragment, 1), 12, null));
                        } else if (cVar2 instanceof c.a) {
                            c.a aVar5 = (c.a) cVar2;
                            beduinOrdersFragment.f209963B0 = aVar5.f19861b;
                            beduinOrdersFragment.f209964C0 = aVar5.f19863d;
                            beduinOrdersFragment.f209965D0 = aVar5.f19865f;
                            AbstractC25658a<? extends RecyclerView.C> abstractC25658a = beduinOrdersFragment.f209977y0;
                            if (abstractC25658a == null) {
                                abstractC25658a = null;
                            }
                            abstractC25658a.m(aVar5.f19862c);
                            AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = beduinOrdersFragment.f209978z0;
                            if (abstractC25658a2 == null) {
                                abstractC25658a2 = null;
                            }
                            abstractC25658a2.m(aVar5.f19864e);
                            AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = beduinOrdersFragment.f209962A0;
                            if (abstractC25658a3 == null) {
                                abstractC25658a3 = null;
                            }
                            abstractC25658a3.m(aVar5.f19866g);
                            if (aVar5.f19867h) {
                                com.avito.android.beduin_shared.model.progress_overlay.a aVar6 = beduinOrdersFragment.f209972t0;
                                C42670a.d(aVar6 != null ? aVar6 : null);
                            } else {
                                b.a aVar7 = aVar5.f19870k;
                                if (aVar7 != null) {
                                    com.avito.android.beduin_shared.model.progress_overlay.a aVar8 = beduinOrdersFragment.f209972t0;
                                    (aVar8 != null ? aVar8 : null).e(aVar7);
                                } else {
                                    com.avito.android.beduin_shared.model.progress_overlay.a aVar9 = beduinOrdersFragment.f209972t0;
                                    (aVar9 != null ? aVar9 : null).b();
                                }
                            }
                            C47313c c47313c = beduinOrdersFragment.f209976x0;
                            n<Object> nVar = BeduinOrdersFragment.f209961F0[3];
                            ((SwipeRefreshLayout) c47313c.a()).setRefreshing(aVar5.f19869j);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6265a(BeduinOrdersFragment beduinOrdersFragment, Continuation<? super C6265a> continuation) {
                    super(2, continuation);
                    this.f209987r = beduinOrdersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6265a(this.f209987r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6265a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f209986q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BeduinOrdersFragment.f209960E0;
                        BeduinOrdersFragment beduinOrdersFragment = this.f209987r;
                        n2<Z40.c> state = beduinOrdersFragment.s5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = beduinOrdersFragment.f209970r0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6266a c6266a = new C6266a(1, beduinOrdersFragment, BeduinOrdersFragment.class, "render", "render(Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersState;)V", 0);
                        this.f209986q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6266a, this) == coroutine_suspended) {
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

            /* compiled from: BeduinOrdersFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$onViewCreated$3$1$2", f = "BeduinOrdersFragment.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f209988q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BeduinOrdersFragment f209989r;

                /* compiled from: BeduinOrdersFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment$e$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6267a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BeduinOrdersFragment f209990b;

                    public C6267a(BeduinOrdersFragment beduinOrdersFragment) {
                        this.f209990b = beduinOrdersFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Z40.b bVar = (Z40.b) obj;
                        a aVar = BeduinOrdersFragment.f209960E0;
                        BeduinOrdersFragment beduinOrdersFragment = this.f209990b;
                        if (bVar instanceof b.a) {
                            ApiError apiError = ((b.a) bVar).f19860a;
                            com.avito.android.component.toast.b.c(beduinOrdersFragment, apiError.getF244063c(), null, new f.c(apiError), 382);
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
                        return new C42801a(2, this.f209990b, BeduinOrdersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BeduinOrdersFragment beduinOrdersFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f209989r = beduinOrdersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f209989r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f209988q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BeduinOrdersFragment.f209960E0;
                        BeduinOrdersFragment beduinOrdersFragment = this.f209989r;
                        InterfaceC43160i<Z40.b> events = beduinOrdersFragment.s5().getEvents();
                        C6267a c6267a = new C6267a(beduinOrdersFragment);
                        this.f209988q = 1;
                        if (events.collect(c6267a, this) == coroutine_suspended) {
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
            public a(BeduinOrdersFragment beduinOrdersFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f209985r = beduinOrdersFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f209985r, continuation);
                aVar.f209984q = obj;
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
                T t12 = (T) this.f209984q;
                BeduinOrdersFragment beduinOrdersFragment = this.f209985r;
                C43259k.d(t12, null, null, new C6265a(beduinOrdersFragment, null), 3);
                C43259k.d(t12, null, null, new b(beduinOrdersFragment, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BeduinOrdersFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209982q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BeduinOrdersFragment beduinOrdersFragment = BeduinOrdersFragment.this;
                a aVar = new a(beduinOrdersFragment, null);
                this.f209982q = 1;
                if (C23056p0.b(beduinOrdersFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f209991b;

        public f(Y41.l lVar) {
            this.f209991b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f209991b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f209991b;
        }

        public final int hashCode() {
            return this.f209991b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f209991b.invoke(obj);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f209992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f209992l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f209992l);
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
            return BeduinOrdersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f209994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f209994l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f209994l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209995l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209995l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f209995l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209996l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f209996l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/orders/feature/beduin_orders_list/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.orders.feature.beduin_orders_list.d> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.orders.feature.beduin_orders_list.d invoke() {
            com.avito.android.orders.feature.beduin_orders_list.e eVar = BeduinOrdersFragment.this.f209966n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.orders.feature.beduin_orders_list.d) eVar.get();
        }
    }

    static {
        Y y12 = new Y(BeduinOrdersFragment.class, "topRecyclerView", "getTopRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f209961F0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BeduinOrdersFragment.class, "mainRecyclerView", "getMainRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BeduinOrdersFragment.class, "bottomRecyclerView", "getBottomRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BeduinOrdersFragment.class, "refreshLayout", "getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", 0, n0Var)};
        f209960E0 = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOrdersFragment() {
        super(R.layout.beduin_orders);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f209967o0 = new O0(m0.f406844a.b(com.avito.android.orders.feature.beduin_orders_list.d.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f209971s0 = C42727D.c(new b());
        this.f209973u0 = new C47312b(null, 1, null);
        this.f209974v0 = new C47312b(null, 1, null);
        this.f209975w0 = new C47312b(null, 1, null);
        this.f209976x0 = new C47313c(null, 1, 0 == true ? 1 : 0);
    }

    public static RecyclerView t5(View view, int i12, AbstractC25658a abstractC25658a) {
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, abstractC25658a);
        return recyclerView;
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        boolean zEquals = str.equals(this.f209963B0);
        n<Object>[] nVarArr = f209961F0;
        if (zEquals) {
            n<Object> nVar = nVarArr[0];
            return (RecyclerView) this.f209973u0.a();
        }
        if (str.equals(this.f209964C0)) {
            return r5();
        }
        if (!str.equals(this.f209965D0)) {
            return null;
        }
        n<Object> nVar2 = nVarArr[2];
        return (RecyclerView) this.f209975w0.a();
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final o c1() {
        return new o(new o.a(r5(), ToastBarPosition.f181047e), new o.a(r5(), ToastBarPosition.f181044b));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f209964C0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f209970r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.orders_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f209972t0 = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById, new c(view));
        gj.n nVar = this.f209968p0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = m.a(nVar, this);
        InterfaceC40691b interfaceC40691b = s5().f210004N;
        ((com.avito.android.beduin.view.c) kVarA).l(interfaceC40691b);
        interfaceC40691b.s(requireContext()).observe(getViewLifecycleOwner(), new f(new d()));
        Integer numValueOf = Integer.valueOf(y6.b(16));
        this.f209977y0 = q5(numValueOf);
        this.f209978z0 = q5(numValueOf);
        this.f209962A0 = q5(numValueOf);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f209977y0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        RecyclerView recyclerViewT5 = t5(view, R.id.orders_top_list, abstractC25658a);
        n<Object>[] nVarArr = f209961F0;
        n<Object> nVar2 = nVarArr[0];
        this.f209973u0.b(this, recyclerViewT5);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f209978z0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        RecyclerView recyclerViewT52 = t5(view, R.id.orders_main_list, abstractC25658a2);
        n<Object> nVar3 = nVarArr[1];
        this.f209974v0.b(this, recyclerViewT52);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f209962A0;
        if (abstractC25658a3 == null) {
            abstractC25658a3 = null;
        }
        RecyclerView recyclerViewT53 = t5(view, R.id.orders_bottom_list, abstractC25658a3);
        n<Object> nVar4 = nVarArr[2];
        this.f209975w0.b(this, recyclerViewT53);
        View viewFindViewById2 = view.findViewById(R.id.orders_swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        C47313c c47313c = this.f209976x0;
        n<Object> nVar5 = nVarArr[3];
        c47313c.b(this, (SwipeRefreshLayout) viewFindViewById2);
        n<Object> nVar6 = nVarArr[3];
        ((SwipeRefreshLayout) c47313c.a()).setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 1));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.orders.feature.beduin_orders_list.a(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f209970r0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.orders.feature.beduin_orders_list.di.i.a().a((com.avito.android.orders.feature.beduin_orders_list.di.c) C29972i.a(C29972i.b(this), com.avito.android.orders.feature.beduin_orders_list.di.c.class), (InterfaceC44195a) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), (com.avito.android.orders.feature.beduin_orders_list.i) this.f209971s0.getValue(), new C28478k(BeduinOrdersScreen.f209998d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f209970r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final AbstractC25658a<? extends RecyclerView.C> q5(Integer num) {
        InterfaceC25659b interfaceC25659b = this.f209969q0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(num);
        aVarB.f100611g = s5().f210004N.B0();
        return aVarB;
    }

    public final RecyclerView r5() {
        n<Object> nVar = f209961F0[1];
        return (RecyclerView) this.f209974v0.a();
    }

    public final com.avito.android.orders.feature.beduin_orders_list.d s5() {
        return (com.avito.android.orders.feature.beduin_orders_list.d) this.f209967o0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
