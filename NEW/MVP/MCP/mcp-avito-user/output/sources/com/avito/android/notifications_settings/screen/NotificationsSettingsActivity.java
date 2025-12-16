package com.avito.android.notifications_settings.screen;

import Cd.r;
import Y41.p;
import android.os.Bundle;
import android.view.View;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import c40.InterfaceC26936a;
import c40.InterfaceC26937b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.notifications_settings.perf_const.NotificationSettingsScreen;
import com.avito.android.notifications_settings.screen.l;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
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

/* compiled from: NotificationsSettingsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_settings/screen/NotificationsSettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationsSettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f208024v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l.a f208025m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f208026n = new O0(m0.f406844a.b(l.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f208027o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f208028p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f208029q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f208030r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f208031s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f208032t;

    /* renamed from: u, reason: collision with root package name */
    public com.avito.android.notifications_settings.screen.c f208033u;

    /* compiled from: NotificationsSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$onCreate$1", f = "NotificationsSettingsActivity.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208034q;

        /* compiled from: NotificationsSettingsActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$onCreate$1$1", f = "NotificationsSettingsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$a$a, reason: collision with other inner class name */
        public static final class C6207a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f208036q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ NotificationsSettingsActivity f208037r;

            /* compiled from: NotificationsSettingsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$onCreate$1$1$1", f = "NotificationsSettingsActivity.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$a$a$a, reason: collision with other inner class name */
            public static final class C6208a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f208038q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationsSettingsActivity f208039r;

                /* compiled from: NotificationsSettingsActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C6209a extends N implements Y41.l<NotificationsSettingsState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ NotificationsSettingsActivity f208040l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C6209a(NotificationsSettingsActivity notificationsSettingsActivity) {
                        super(1);
                        this.f208040l = notificationsSettingsActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(NotificationsSettingsState notificationsSettingsState) {
                        NotificationsSettingsState notificationsSettingsState2 = notificationsSettingsState;
                        com.avito.android.notifications_settings.screen.c cVar = this.f208040l.f208033u;
                        if (cVar == null) {
                            cVar = null;
                        }
                        com.avito.android.progress_overlay.l lVar = cVar.f208054c;
                        if (notificationsSettingsState2.f208127c) {
                            lVar.k(null);
                        } else {
                            PrintableText printableText = notificationsSettingsState2.f208128d;
                            if (printableText != null) {
                                lVar.a(printableText.k0(cVar.f208055d.getContext()));
                            }
                            List<TV0.a> list = notificationsSettingsState2.f208129e;
                            if (list != null) {
                                com.avito.konveyor.util.a.a(cVar.f208052a, list);
                                cVar.f208053b.notifyDataSetChanged();
                                lVar.j();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6208a(NotificationsSettingsActivity notificationsSettingsActivity, Continuation<? super C6208a> continuation) {
                    super(2, continuation);
                    this.f208039r = notificationsSettingsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6208a(this.f208039r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6208a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f208038q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = NotificationsSettingsActivity.f208024v;
                        NotificationsSettingsActivity notificationsSettingsActivity = this.f208039r;
                        n2<NotificationsSettingsState> state = notificationsSettingsActivity.a2().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = notificationsSettingsActivity.f208027o;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6209a c6209a = new C6209a(notificationsSettingsActivity);
                        this.f208038q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6209a, this) == coroutine_suspended) {
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

            /* compiled from: NotificationsSettingsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$onCreate$1$1$2", f = "NotificationsSettingsActivity.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f208041q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationsSettingsActivity f208042r;

                /* compiled from: NotificationsSettingsActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.notifications_settings.screen.NotificationsSettingsActivity$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6210a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NotificationsSettingsActivity f208043b;

                    public C6210a(NotificationsSettingsActivity notificationsSettingsActivity) {
                        this.f208043b = notificationsSettingsActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC26937b interfaceC26937b = (InterfaceC26937b) obj;
                        int i12 = NotificationsSettingsActivity.f208024v;
                        NotificationsSettingsActivity notificationsSettingsActivity = this.f208043b;
                        if (L.f(interfaceC26937b, InterfaceC26937b.a.f57634a)) {
                            ru.avito.component.dialog.c cVar = ru.avito.component.dialog.c.f430348a;
                            com.avito.android.notifications_settings.screen.d dVar = new com.avito.android.notifications_settings.screen.d(notificationsSettingsActivity);
                            cVar.getClass();
                            ru.avito.component.dialog.c.a(notificationsSettingsActivity, dVar);
                            G0 g02 = G0.f406611a;
                        } else if (interfaceC26937b instanceof InterfaceC26937b.C2029b) {
                            com.avito.android.notifications_settings.screen.c cVar2 = notificationsSettingsActivity.f208033u;
                            if (cVar2 == null) {
                                cVar2 = null;
                            }
                            L5.b(cVar2.f208056e.getContext(), ((InterfaceC26937b.C2029b) interfaceC26937b).f57635a.k0(cVar2.f208055d.getContext()), 0);
                        }
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
                        return new C42801a(2, this.f208043b, NotificationsSettingsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(NotificationsSettingsActivity notificationsSettingsActivity, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f208042r = notificationsSettingsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f208042r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f208041q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = NotificationsSettingsActivity.f208024v;
                        NotificationsSettingsActivity notificationsSettingsActivity = this.f208042r;
                        InterfaceC43160i<InterfaceC26937b> events = notificationsSettingsActivity.a2().getEvents();
                        C6210a c6210a = new C6210a(notificationsSettingsActivity);
                        this.f208041q = 1;
                        if (events.collect(c6210a, this) == coroutine_suspended) {
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
            public C6207a(NotificationsSettingsActivity notificationsSettingsActivity, Continuation<? super C6207a> continuation) {
                super(2, continuation);
                this.f208037r = notificationsSettingsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C6207a c6207a = new C6207a(this.f208037r, continuation);
                c6207a.f208036q = obj;
                return c6207a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C6207a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f208036q;
                NotificationsSettingsActivity notificationsSettingsActivity = this.f208037r;
                C43259k.d(t12, null, null, new C6208a(notificationsSettingsActivity, null), 3);
                C43259k.d(t12, null, null, new b(notificationsSettingsActivity, null), 3);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return NotificationsSettingsActivity.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208034q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                NotificationsSettingsActivity notificationsSettingsActivity = NotificationsSettingsActivity.this;
                C6207a c6207a = new C6207a(notificationsSettingsActivity, null);
                this.f208034q = 1;
                if (C23056p0.b(notificationsSettingsActivity, state, c6207a, this) == coroutine_suspended) {
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

    /* compiled from: NotificationsSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/toggle/NotificationsSettingsToggleItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/notifications_settings/toggle/NotificationsSettingsToggleItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<NotificationsSettingsToggleItem, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(NotificationsSettingsToggleItem notificationsSettingsToggleItem) {
            int i12 = NotificationsSettingsActivity.f208024v;
            NotificationsSettingsActivity.this.a2().accept(new InterfaceC26936a.c(notificationsSettingsToggleItem));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f208046m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f208046m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(NotificationsSettingsActivity.this, this.f208046m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return NotificationsSettingsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return NotificationsSettingsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: NotificationsSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/notifications_settings/screen/l;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/notifications_settings/screen/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<C23060r0, l> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final l invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            l.a aVar = NotificationsSettingsActivity.this.f208025m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.notifications_settings;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.notifications_settings.screen.di.a.a().a((com.avito.android.notifications_settings.screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.notifications_settings.screen.di.c.class), cv.c.a(this), getResources(), bundle != null, new C28478k(NotificationSettingsScreen.f208009d, s.a(this), null, 4, null), new b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208027o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final l a2() {
        return (l) this.f208026n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f208027o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        com.avito.konveyor.a aVar = this.f208029q;
        if (aVar == null) {
            aVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f208031s;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.konveyor.adapter.a aVar2 = this.f208030r;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f208033u = new com.avito.android.notifications_settings.screen.c(viewK1, interfaceC28373a, aVar, aVar2);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new a(null), 3);
        com.avito.android.notifications_settings.screen.c cVar = this.f208033u;
        if (cVar == null) {
            cVar = null;
        }
        com.avito.android.notifications_settings.screen.e eVar = new com.avito.android.notifications_settings.screen.e(this);
        cVar.getClass();
        cVar.f208056e.c(R.attr.ic_arrowBack24, new com.avito.android.notifications_settings.screen.a(eVar));
        com.avito.android.notifications_settings.screen.c cVar2 = this.f208033u;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.f208054c.f231600j = new com.avito.android.notifications_settings.screen.b(new com.avito.android.notifications_settings.screen.f(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f208027o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f208032t) {
            a2().accept(InterfaceC26936a.C2028a.f57631a);
            this.f208032t = false;
        }
    }
}
