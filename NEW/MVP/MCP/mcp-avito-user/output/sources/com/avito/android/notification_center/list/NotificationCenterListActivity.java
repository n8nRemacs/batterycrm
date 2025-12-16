package com.avito.android.notification_center.list;

import D30.a;
import D30.b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.AnalyticParams;
import com.avito.android.CalledFrom;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import com.avito.android.notification_center.list.t;
import com.avito.android.perf_const.NotificationCenterListScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.H;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: NotificationCenterListActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notification_center/list/NotificationCenterListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationCenterListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f207504x = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public t.a f207505m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f207507o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f207508p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f207509q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f207510r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet> f207511s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f207512t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f207513u;

    /* renamed from: v, reason: collision with root package name */
    public s f207514v;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f207506n = new O0(m0.f406844a.b(t.class), new f(), new e(new h()), new g());

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f207515w = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: NotificationCenterListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            NotificationCenterListActivity.a2(NotificationCenterListActivity.this).accept(a.c.f2869a);
            return G0.f406611a;
        }
    }

    /* compiled from: NotificationCenterListActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListActivity$onCreate$2", f = "NotificationCenterListActivity.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207517q;

        /* compiled from: NotificationCenterListActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListActivity$onCreate$2$1", f = "NotificationCenterListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f207519q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ NotificationCenterListActivity f207520r;

            /* compiled from: NotificationCenterListActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListActivity$onCreate$2$1$1", f = "NotificationCenterListActivity.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.notification_center.list.NotificationCenterListActivity$b$a$a, reason: collision with other inner class name */
            public static final class C6187a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f207521q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationCenterListActivity f207522r;

                /* compiled from: NotificationCenterListActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.notification_center.list.NotificationCenterListActivity$b$a$a$a, reason: collision with other inner class name */
                public static final class C6188a extends N implements Y41.l<NotificationCenterMviState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ NotificationCenterListActivity f207523l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6188a(NotificationCenterListActivity notificationCenterListActivity) {
                        super(1);
                        this.f207523l = notificationCenterListActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(NotificationCenterMviState notificationCenterMviState) {
                        NotificationCenterMviState notificationCenterMviState2 = notificationCenterMviState;
                        s sVar = this.f207523l.f207514v;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.getClass();
                        sVar.f207731j = notificationCenterMviState2.f207680b != null;
                        com.avito.android.progress_overlay.l lVar = sVar.f207727f;
                        RecyclerView recyclerView = sVar.f207728g;
                        SwipeRefreshLayout swipeRefreshLayout = sVar.f207729h;
                        PrintableText printableText = notificationCenterMviState2.f207683e;
                        if (printableText != null) {
                            lVar.a(printableText.k0(recyclerView.getContext()));
                            D6.k(swipeRefreshLayout);
                        } else {
                            Boolean bool = Boolean.TRUE;
                            if (L.f(notificationCenterMviState2.f207684f, bool)) {
                                lVar.k(null);
                                D6.h(swipeRefreshLayout);
                            } else {
                                swipeRefreshLayout.setRefreshing(L.f(notificationCenterMviState2.f207685g, bool));
                                D6.k(swipeRefreshLayout);
                                List<TV0.a> list = notificationCenterMviState2.f207681c;
                                boolean zA2 = O2.a(list);
                                View view = sVar.f207726e;
                                if (zA2) {
                                    D6.w(view);
                                    D6.H(recyclerView);
                                    com.avito.konveyor.util.a.a(sVar.f207723b, list);
                                    sVar.f207725d.notifyDataSetChanged();
                                    lVar.j();
                                } else if (list != null && list.isEmpty()) {
                                    D6.H(view);
                                    D6.w(recyclerView);
                                    lVar.j();
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6187a(NotificationCenterListActivity notificationCenterListActivity, Continuation<? super C6187a> continuation) {
                    super(2, continuation);
                    this.f207522r = notificationCenterListActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6187a(this.f207522r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6187a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f207521q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        NotificationCenterListActivity notificationCenterListActivity = this.f207522r;
                        n2<NotificationCenterMviState> state = ((t) notificationCenterListActivity.f207506n.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = notificationCenterListActivity.f207507o;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6188a c6188a = new C6188a(notificationCenterListActivity);
                        this.f207521q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6188a, this) == coroutine_suspended) {
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

            /* compiled from: NotificationCenterListActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notification_center.list.NotificationCenterListActivity$onCreate$2$1$2", f = "NotificationCenterListActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.notification_center.list.NotificationCenterListActivity$b$a$b, reason: collision with other inner class name */
            public static final class C6189b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f207524q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationCenterListActivity f207525r;

                /* compiled from: NotificationCenterListActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.notification_center.list.NotificationCenterListActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6190a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NotificationCenterListActivity f207526b;

                    public C6190a(NotificationCenterListActivity notificationCenterListActivity) {
                        this.f207526b = notificationCenterListActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        D30.b bVar = (D30.b) obj;
                        int i12 = NotificationCenterListActivity.f207504x;
                        NotificationCenterListActivity notificationCenterListActivity = this.f207526b;
                        if (bVar instanceof b.a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar = notificationCenterListActivity.f207512t;
                            if (aVar == null) {
                                aVar = null;
                            }
                            b.a aVar2 = (b.a) bVar;
                            DeepLink deepLink = aVar2.f2872a;
                            Bundle bundle = new Bundle();
                            CalledFrom.NotificationCenter notificationCenter = aVar2.f2873b;
                            H.c(bundle, notificationCenter);
                            bundle.putParcelable("analytic_params", new AnalyticParams(notificationCenter.f67243b, null));
                            G0 g02 = G0.f406611a;
                            b.a.a(aVar, deepLink, null, bundle, 2);
                        } else if (bVar instanceof b.C0147b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = notificationCenterListActivity.f207512t;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            b.C0147b c0147b = (b.C0147b) bVar;
                            WebViewLink webViewLink = c0147b.f2874a;
                            Bundle bundle2 = new Bundle();
                            H.c(bundle2, c0147b.f2875b);
                            G0 g03 = G0.f406611a;
                            b.a.a(aVar3, webViewLink, null, bundle2, 2);
                        }
                        G0 g04 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g04;
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
                        return new C42801a(2, this.f207526b, NotificationCenterListActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6189b(NotificationCenterListActivity notificationCenterListActivity, Continuation<? super C6189b> continuation) {
                    super(2, continuation);
                    this.f207525r = notificationCenterListActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6189b(this.f207525r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6189b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f207524q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        NotificationCenterListActivity notificationCenterListActivity = this.f207525r;
                        InterfaceC43160i<D30.b> events = ((t) notificationCenterListActivity.f207506n.getValue()).getEvents();
                        C6190a c6190a = new C6190a(notificationCenterListActivity);
                        this.f207524q = 1;
                        if (events.collect(c6190a, this) == coroutine_suspended) {
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
            public a(NotificationCenterListActivity notificationCenterListActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f207520r = notificationCenterListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f207520r, continuation);
                aVar.f207519q = obj;
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
                T t12 = (T) this.f207519q;
                NotificationCenterListActivity notificationCenterListActivity = this.f207520r;
                C43259k.d(t12, null, null, new C6187a(notificationCenterListActivity, null), 3);
                C43259k.d(t12, null, null, new C6189b(notificationCenterListActivity, null), 3);
                ((t) notificationCenterListActivity.f207506n.getValue()).accept(a.b.f2868a);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return NotificationCenterListActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207517q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                NotificationCenterListActivity notificationCenterListActivity = NotificationCenterListActivity.this;
                a aVar = new a(notificationCenterListActivity, null);
                this.f207517q = 1;
                if (C23056p0.b(notificationCenterListActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: NotificationCenterListActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$ErrorSnippet;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$ErrorSnippet;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            NotificationCenterListActivity.a2(NotificationCenterListActivity.this).accept(a.e.f2871a);
        }
    }

    /* compiled from: NotificationCenterListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Integer, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            NotificationCenterListActivity.a2(NotificationCenterListActivity.this).accept(new a.d(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f207530m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar) {
            super(0);
            this.f207530m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(NotificationCenterListActivity.this, this.f207530m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return NotificationCenterListActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return NotificationCenterListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: NotificationCenterListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/notification_center/list/t;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/notification_center/list/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, t> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final t invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            t.a aVar = NotificationCenterListActivity.this.f207505m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public static final t a2(NotificationCenterListActivity notificationCenterListActivity) {
        return (t) notificationCenterListActivity.f207506n.getValue();
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.notification_center_list;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.notification_center.list.di.a.a().a((com.avito.android.notification_center.list.di.c) C29972i.a(C29972i.b(this), com.avito.android.notification_center.list.di.c.class), cv.c.a(this), getResources(), bundle != null, new C28478k(NotificationCenterListScreen.f215082d, com.avito.android.analytics.screens.s.a(this), null, 4, null), new d(), getF42820b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f207507o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f207507o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        com.avito.konveyor.a aVar = this.f207510r;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.a aVar3 = this.f207509q;
        com.avito.konveyor.adapter.a aVar4 = aVar3 != null ? aVar3 : null;
        InterfaceC28373a interfaceC28373a = this.f207508p;
        this.f207514v = new s(viewK1, aVar2, interfaceC28373a != null ? interfaceC28373a : null, aVar4, new a());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        s sVar = this.f207514v;
        if (sVar == null) {
            sVar = null;
        }
        sVar.f207727f.f231600j = new r(new com.avito.android.notification_center.list.a(this));
        s sVar2 = this.f207514v;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.android.notification_center.list.b bVar = new com.avito.android.notification_center.list.b(this);
        sVar2.getClass();
        sVar2.f207729h.setOnRefreshListener(new com.avito.android.advert.item.beduin.v2.di.b(2, bVar));
        s sVar3 = this.f207514v;
        if (sVar3 == null) {
            sVar3 = null;
        }
        com.avito.android.notification_center.list.c cVar = new com.avito.android.notification_center.list.c(this);
        sVar3.getClass();
        sVar3.f207730i.c(R.attr.ic_arrowBack24, new q(cVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f207507o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet> cVar = this.f207511s;
        if (cVar == null) {
            cVar = null;
        }
        this.f207515w.b(cVar.t0(new c()));
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f207515w.e();
    }
}
