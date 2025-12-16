package com.avito.android.position_in_search.stats.screen.old_position_in_search.view;

import Cd.C13243a;
import Y41.p;
import Z80.a;
import Z80.b;
import a90.b;
import a90.e;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
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
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.C33275a;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.SearchPositionToolbar;
import com.avito.android.position_in_search.stats.view.SearchPositionParams;
import com.avito.android.ui.fragments.BaseFragment;
import d90.InterfaceC39535a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: SearchPositionFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/SearchPositionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f220696x0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public c.a f220697n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public a.C6649a f220698o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public b.a f220699p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public b.a f220700q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public e.a f220701r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public c.a f220702s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C33275a.C6650a f220703t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f220704u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f220705v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f220706w0;

    /* compiled from: SearchPositionFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/SearchPositionFragment$a;", "Ld90/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC39535a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SearchPositionFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$onViewCreated$1", f = "SearchPositionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f220707q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e f220708r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a90.b f220709s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c f220710t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C33275a f220711u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Z80.b f220712v;

        /* compiled from: SearchPositionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$onViewCreated$1$1", f = "SearchPositionFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220713q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e f220714r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a90.b f220715s;

            /* compiled from: SearchPositionFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C6647a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a90.b f220716b;

                public C6647a(a90.b bVar) {
                    this.f220716b = bVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    a90.e eVar = (a90.e) obj;
                    a90.b bVar = this.f220716b;
                    ScreenPerformanceTracker screenPerformanceTracker = bVar.f20759a;
                    screenPerformanceTracker.l();
                    List<com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a> list = eVar.f20771c;
                    G0 g02 = null;
                    SearchPositionToolbar searchPositionToolbar = bVar.f20760b;
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.a aVar = bVar.f20764f;
                    r rVar = eVar.f20774f;
                    ToastState toastState = eVar.f20772d;
                    e.a aVar2 = eVar.f20770b;
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b bVar2 = eVar.f20769a;
                    r rVar2 = eVar.f20773e;
                    if (rVar2 != null) {
                        String str = rVar2.f90666a;
                        screenPerformanceTracker.m(str);
                        searchPositionToolbar.setState(bVar2);
                        bVar.a(aVar2);
                        aVar.b(toastState);
                        bVar.b(rVar, list);
                        ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, rVar2.f90667b, null, 4);
                        g02 = G0.f406611a;
                    }
                    if (g02 == null) {
                        searchPositionToolbar.setState(bVar2);
                        bVar.a(aVar2);
                        aVar.b(toastState);
                        bVar.b(rVar, list);
                    }
                    screenPerformanceTracker.f();
                    G0 g03 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g03;
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
                    return new C42801a(2, this.f220716b, a90.b.class, "render", "render(Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/screen/ScreenState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e eVar, a90.b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f220714r = eVar;
                this.f220715s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f220714r, this.f220715s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220713q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C6647a c6647a = new C6647a(this.f220715s);
                    this.f220713q = 1;
                    if (this.f220714r.a(c6647a, this) == coroutine_suspended) {
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

        /* compiled from: SearchPositionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$onViewCreated$1$2", f = "SearchPositionFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$b$b, reason: collision with other inner class name */
        public static final class C6648b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220717q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c f220718r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6648b(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c cVar, Continuation<? super C6648b> continuation) {
                super(2, continuation);
                this.f220718r = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6648b(this.f220718r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C6648b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220717q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f220717q = 1;
                    if (this.f220718r.a(this) == coroutine_suspended) {
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

        /* compiled from: SearchPositionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment$onViewCreated$1$3", f = "SearchPositionFragment.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f220719q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C33275a f220720r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Z80.b f220721s;

            /* compiled from: SearchPositionFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Z80.b f220722b;

                public a(Z80.b bVar) {
                    this.f220722b = bVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Z80.a aVar = (Z80.a) obj;
                    Z80.b bVar = this.f220722b;
                    if (aVar instanceof a.C1423a) {
                        bVar.f19935b.c();
                    } else {
                        boolean z12 = aVar instanceof a.b;
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = bVar.f19934a;
                        if (z12) {
                            b.a.a(aVar2, ((a.b) aVar).f19931a, null, null, 6);
                        } else if (aVar instanceof a.d) {
                            a.d dVar = (a.d) aVar;
                            aVar2.r6(C22777e.b(new Q("key_pis_sort_dialog_slug_result_in", dVar.f19933b)), dVar.f19932a, "search_position_sort_request_key");
                        } else if (aVar instanceof a.c) {
                            a.c cVar = (a.c) aVar;
                            a90.b bVar2 = bVar.f19936c;
                            Iterator it = bVar2.f20763e.f53650c.f53994f.iterator();
                            int i12 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i12 = -1;
                                    break;
                                }
                                TV0.a aVar3 = (TV0.a) it.next();
                                if (aVar3 instanceof com.avito.conveyor_item.a) {
                                    String f76204c = ((com.avito.conveyor_item.a) aVar3).getF76204c();
                                    cVar.getClass();
                                    if (L.f(f76204c, "position_in_search_competitors")) {
                                        break;
                                    }
                                }
                                i12++;
                            }
                            if (i12 >= 0) {
                                RecyclerView recyclerView = bVar2.f20761c;
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                                a90.c cVar2 = new a90.c(recyclerView.getContext());
                                cVar2.f53878a = i12;
                                linearLayoutManager.x1(cVar2);
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
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f220722b, Z80.b.class, "handle", "handle(Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/handler/SearchPositionEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C33275a c33275a, Z80.b bVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f220720r = c33275a;
                this.f220721s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f220720r, this.f220721s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f220719q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = new a(this.f220721s);
                    this.f220719q = 1;
                    if (this.f220720r.a(aVar, this) == coroutine_suspended) {
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
        public b(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e eVar, a90.b bVar, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c cVar, C33275a c33275a, Z80.b bVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f220708r = eVar;
            this.f220709s = bVar;
            this.f220710t = cVar;
            this.f220711u = c33275a;
            this.f220712v = bVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f220708r, this.f220709s, this.f220710t, this.f220711u, this.f220712v, continuation);
            bVar.f220707q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f220707q;
            C43259k.d(t12, null, null, new a(this.f220708r, this.f220709s, null), 3);
            C43259k.d(t12, null, null, new C6648b(this.f220710t, null), 3);
            C43259k.d(t12, null, null, new c(this.f220711u, this.f220712v, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPositionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/a;", "invoke", "()Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a invoke() {
            a.C6649a c6649a = SearchPositionFragment.this.f220698o0;
            if (c6649a == null) {
                c6649a = null;
            }
            return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a(c6649a.f220735a, null);
        }
    }

    /* compiled from: SearchPositionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/c;", "invoke", "()Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c invoke() {
            c.a aVar = SearchPositionFragment.this.f220697n0;
            if (aVar == null) {
                aVar = null;
            }
            return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c(aVar.f220830a, null);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220725l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220725l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f220725l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f220726l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f220726l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f220726l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SearchPositionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f220728l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f220728l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f220728l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220729l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f220729l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220730l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220730l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f220730l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f220731l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f220731l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f220731l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SearchPositionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f220733l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f220733l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f220733l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f220734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f220734l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f220734l.getValue()).getF42820b();
        }
    }

    public SearchPositionFragment() {
        super(R.layout.position_in_search_stats_fragment_layout);
        f fVar = new f(new d());
        g gVar = new g();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new h(gVar));
        n0 n0Var = m0.f406844a;
        this.f220705v0 = new O0(n0Var.b(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        k kVar = new k(new c());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new m(new l()));
        this.f220706w0 = new O0(n0Var.b(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a.class), new n(interfaceC42726CB2), kVar, new e(interfaceC42726CB2));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f220704u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        b.a aVar = this.f220700q0;
        if (aVar == null) {
            aVar = null;
        }
        a90.b bVar = new a90.b(view, aVar.f20766b, aVar.f20767c, aVar.f20765a, aVar.f20768d, null);
        b.a aVar2 = this.f220699p0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        Z80.b bVar2 = new Z80.b(aVar2.f19937a, requireActivity().getF21241d(), bVar, null);
        e.a aVar3 = this.f220701r0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        O0 o02 = this.f220705v0;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c cVar = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c) o02.getValue();
        O0 o03 = this.f220706w0;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e eVar = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.e(cVar, (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a) o03.getValue(), aVar3.f220792a, aVar3.f220793b, null);
        c.a aVar4 = this.f220702s0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c cVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c) o02.getValue(), (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a) o03.getValue(), aVar4.f220771a, null);
        C33275a.C6650a c6650a = this.f220703t0;
        if (c6650a == null) {
            c6650a = null;
        }
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.h(this, Lifecycle.State.f46682e, new b(eVar, bVar, cVar2, new C33275a((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c) o02.getValue(), (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a) o03.getValue(), c6650a.f220740a, c6650a.f220741b, null), bVar2, null), null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f220704u0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        SearchPositionParams.a aVar = SearchPositionParams.f221755d;
        Bundle bundleRequireArguments = requireArguments();
        aVar.getClass();
        SearchPositionParams searchPositionParams = (SearchPositionParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("position_in_search.stats.search_position_params_key", SearchPositionParams.class) : bundleRequireArguments.getParcelable("position_in_search.stats.search_position_params_key"));
        if (searchPositionParams == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long j12 = searchPositionParams.f221756b;
        String str = searchPositionParams.f221757c;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.c.a(this, new p.a(j12, str), new w.b(j12, str)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f220704u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f220704u0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}
