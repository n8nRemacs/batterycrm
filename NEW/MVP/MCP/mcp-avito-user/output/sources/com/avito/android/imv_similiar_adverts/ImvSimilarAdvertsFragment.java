package com.avito.android.imv_similiar_adverts;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.P5;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;
import qN.b;
import rN.InterfaceC47570b;
import sN.C48078c;
import sN.InterfaceC48076a;
import sN.InterfaceC48077b;
import z1.AbstractC50339a;

/* compiled from: ImvSimilarAdvertsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/ImvSimilarAdvertsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvSimilarAdvertsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f170813A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f170814B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public s f170815n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f170816o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f170817p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f170818q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC47570b f170819r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f170820s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f170821t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f170822u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170823v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f170824w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170825x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170826y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170827z0;

    /* compiled from: ImvSimilarAdvertsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/ImvSimilarAdvertsFragment$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvSimilarAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$onCreateView$1", f = "ImvSimilarAdvertsFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f170828q;

        /* compiled from: ImvSimilarAdvertsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$onCreateView$1$1", f = "ImvSimilarAdvertsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f170830q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImvSimilarAdvertsFragment f170831r;

            /* compiled from: ImvSimilarAdvertsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$onCreateView$1$1$1", f = "ImvSimilarAdvertsFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C5056a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170832q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvSimilarAdvertsFragment f170833r;

                /* compiled from: ImvSimilarAdvertsFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsN/c;", "it", "Lkotlin/G0;", "invoke", "(LsN/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C5057a extends N implements Y41.l<C48078c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ImvSimilarAdvertsFragment f170834l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C5057a(ImvSimilarAdvertsFragment imvSimilarAdvertsFragment) {
                        super(1);
                        this.f170834l = imvSimilarAdvertsFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(C48078c c48078c) {
                        a aVar = ImvSimilarAdvertsFragment.f170813A0;
                        ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = this.f170834l;
                        P2<UV0.c<l1>> p22 = c48078c.f437633b;
                        if (p22 instanceof P2.b) {
                            com.avito.konveyor.adapter.a aVar2 = imvSimilarAdvertsFragment.f170818q0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            aVar2.c((UV0.a) ((P2.b) p22).f318720a);
                            com.avito.konveyor.adapter.j jVar = imvSimilarAdvertsFragment.f170817p0;
                            (jVar != null ? jVar : null).notifyDataSetChanged();
                            imvSimilarAdvertsFragment.q5().j();
                        } else if (p22 instanceof P2.c) {
                            imvSimilarAdvertsFragment.q5().k(null);
                        } else if (p22 instanceof P2.a) {
                            imvSimilarAdvertsFragment.q5().a(z.k(((P2.a) p22).f318719a));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5056a(ImvSimilarAdvertsFragment imvSimilarAdvertsFragment, Continuation<? super C5056a> continuation) {
                    super(2, continuation);
                    this.f170833r = imvSimilarAdvertsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5056a(this.f170833r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5056a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170832q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ImvSimilarAdvertsFragment.f170813A0;
                        ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = this.f170833r;
                        n2<C48078c> state = imvSimilarAdvertsFragment.r5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = imvSimilarAdvertsFragment.f170820s0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5057a c5057a = new C5057a(imvSimilarAdvertsFragment);
                        this.f170832q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5057a, this) == coroutine_suspended) {
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

            /* compiled from: ImvSimilarAdvertsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$onCreateView$1$1$2", f = "ImvSimilarAdvertsFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$b$a$b, reason: collision with other inner class name */
            public static final class C5058b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170835q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvSimilarAdvertsFragment f170836r;

                /* compiled from: ImvSimilarAdvertsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C5059a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ImvSimilarAdvertsFragment f170837b;

                    public C5059a(ImvSimilarAdvertsFragment imvSimilarAdvertsFragment) {
                        this.f170837b = imvSimilarAdvertsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC48077b interfaceC48077b = (InterfaceC48077b) obj;
                        a aVar = ImvSimilarAdvertsFragment.f170813A0;
                        ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = this.f170837b;
                        if (interfaceC48077b instanceof InterfaceC48077b.a) {
                            ActivityC22955m activityC22955mL1 = imvSimilarAdvertsFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.finish();
                            }
                        } else if (interfaceC48077b instanceof InterfaceC48077b.C12613b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = imvSimilarAdvertsFragment.f170821t0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC48077b.C12613b) interfaceC48077b).f437630a, null, null, 6);
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
                        return new C42801a(2, this.f170837b, ImvSimilarAdvertsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5058b(ImvSimilarAdvertsFragment imvSimilarAdvertsFragment, Continuation<? super C5058b> continuation) {
                    super(2, continuation);
                    this.f170836r = imvSimilarAdvertsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5058b(this.f170836r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5058b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170835q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ImvSimilarAdvertsFragment.f170813A0;
                        ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = this.f170836r;
                        InterfaceC43160i<InterfaceC48077b> events = imvSimilarAdvertsFragment.r5().getEvents();
                        C5059a c5059a = new C5059a(imvSimilarAdvertsFragment);
                        this.f170835q = 1;
                        if (events.collect(c5059a, this) == coroutine_suspended) {
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
            public a(ImvSimilarAdvertsFragment imvSimilarAdvertsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f170831r = imvSimilarAdvertsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f170831r, continuation);
                aVar.f170830q = obj;
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
                T t12 = (T) this.f170830q;
                ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = this.f170831r;
                C43259k.d(t12, null, null, new C5056a(imvSimilarAdvertsFragment, null), 3);
                C43259k.d(t12, null, null, new C5058b(imvSimilarAdvertsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ImvSimilarAdvertsFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f170828q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ImvSimilarAdvertsFragment imvSimilarAdvertsFragment = ImvSimilarAdvertsFragment.this;
                a aVar = new a(imvSimilarAdvertsFragment, null);
                this.f170828q = 1;
                if (C23056p0.b(imvSimilarAdvertsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ImvSimilarAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ImvSimilarAdvertsFragment.f170813A0;
            ImvSimilarAdvertsFragment.this.r5().accept(InterfaceC48076a.c.f437628a);
            return G0.f406611a;
        }
    }

    /* compiled from: ImvSimilarAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/AdvertItem;", "advert", "Lkotlin/G0;", "accept", "(Lcom/avito/android/serp/adapter/AdvertItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = ImvSimilarAdvertsFragment.f170813A0;
            ImvSimilarAdvertsFragment.this.r5().accept(new InterfaceC48076a.b(((AdvertItem) obj).f268396O));
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f170840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f170840l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f170840l);
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
            return ImvSimilarAdvertsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f170842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f170842l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f170842l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170843l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170843l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f170843l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170844l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f170844l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImvSimilarAdvertsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/imv_similiar_adverts/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<r> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = ImvSimilarAdvertsFragment.this.f170815n0;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    static {
        Y y12 = new Y(ImvSimilarAdvertsFragment.class, "openParams", "getOpenParams()Lcom/avito/android/imv_similiar_adverts/ImvSimilarAdvertsParams;", 0);
        n0 n0Var = m0.f406844a;
        f170814B0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ImvSimilarAdvertsFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvSimilarAdvertsFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvSimilarAdvertsFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f170813A0 = new a(null);
    }

    public ImvSimilarAdvertsFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f170816o0 = new O0(m0.f406844a.b(r.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f170823v0 = new C35968w3(this);
        this.f170824w0 = new io.reactivex.rxjava3.disposables.c();
        this.f170825x0 = new C47313c(null, 1, null);
        this.f170826y0 = new C47313c(null, 1, null);
        this.f170827z0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f170820s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return layoutInflater.inflate(R.layout.fragment_imv_similar_adverts, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f170824w0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170820s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.imv_similar_adverts_content), R.id.imv_similar_adverts_recycler_view, null, 0, 0, 28, null);
        C47313c c47313c = this.f170827z0;
        kotlin.reflect.n<Object>[] nVarArr = f170814B0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        c47313c.b(this, lVar);
        q5().f231600j = new c();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        C47313c c47313c2 = this.f170825x0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, (Toolbar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.imv_similar_adverts_recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        C47313c c47313c3 = this.f170826y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, (RecyclerView) viewFindViewById2);
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        P5.c((Toolbar) c47313c2.a(), R.attr.black);
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        ((Toolbar) c47313c2.a()).setNavigationOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 0));
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        RecyclerView recyclerView = (RecyclerView) c47313c3.a();
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        RecyclerView recyclerView2 = (RecyclerView) c47313c3.a();
        com.avito.konveyor.adapter.j jVar = this.f170817p0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        InterfaceC47570b interfaceC47570b = this.f170819r0;
        if (interfaceC47570b == null) {
            interfaceC47570b = null;
        }
        C41981q0 f429771c = interfaceC47570b.getF429771c();
        InterfaceC35745a5 interfaceC35745a5 = this.f170822u0;
        this.f170824w0.b(f429771c.j0((interfaceC35745a5 != null ? interfaceC35745a5 : null).e()).t0(new d()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        ((b.InterfaceC12325b) C29972i.a(C29972i.b(this), b.InterfaceC12325b.class)).he().a(getF42820b(), getResources(), (ImvSimilarAdvertsParams) this.f170823v0.getValue(this, f170814B0[0]), com.avito.android.analytics.screens.s.c(this), cv.c.d(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170820s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f170827z0;
        kotlin.reflect.n<Object> nVar = f170814B0[3];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final r r5() {
        return (r) this.f170816o0.getValue();
    }
}
