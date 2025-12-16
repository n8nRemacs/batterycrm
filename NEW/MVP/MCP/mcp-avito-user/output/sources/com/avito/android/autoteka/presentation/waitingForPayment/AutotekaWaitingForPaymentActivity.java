package com.avito.android.autoteka.presentation.waitingForPayment;

import Cd.C13243a;
import L91.o;
import Uf.InterfaceC15514a;
import Uf.b;
import Y41.l;
import Y41.p;
import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.analytics.screens.AutotekaWaitingForPaymentScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.util.P5;
import com.avito.konveyor.adapter.j;
import i.b;
import java.util.Collections;
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
import kotlin.jvm.internal.C42822w;
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

/* compiled from: AutotekaWaitingForPaymentActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/AutotekaWaitingForPaymentActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaWaitingForPaymentActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f97837u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.presentation.waitingForPayment.d f97838m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public j f97840o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97841p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97842q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f97843r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97844s;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97839n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.waitingForPayment.c.class), new e(), new d(new g()), new f());

    /* renamed from: t, reason: collision with root package name */
    @k
    public final h<Intent> f97845t = registerForActivityResult(new b.m(), new o(this, 12));

    /* compiled from: AutotekaWaitingForPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/AutotekaWaitingForPaymentActivity$a;", "", "<init>", "()V", "", "KEY_WAITING_FOR_PAYMENT_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaWaitingForPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$onCreate$2", f = "AutotekaWaitingForPaymentActivity.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97846q;

        /* compiled from: AutotekaWaitingForPaymentActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$onCreate$2$1", f = "AutotekaWaitingForPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f97848q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutotekaWaitingForPaymentActivity f97849r;

            /* compiled from: AutotekaWaitingForPaymentActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$onCreate$2$1$1", f = "AutotekaWaitingForPaymentActivity.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$b$a$a, reason: collision with other inner class name */
            public static final class C2927a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97850q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaWaitingForPaymentActivity f97851r;

                /* compiled from: AutotekaWaitingForPaymentActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$b$a$a$a, reason: collision with other inner class name */
                public static final class C2928a extends N implements l<AutotekaWaitingForPaymentState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ AutotekaWaitingForPaymentActivity f97852l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2928a(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity) {
                        super(1);
                        this.f97852l = autotekaWaitingForPaymentActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(AutotekaWaitingForPaymentState autotekaWaitingForPaymentState) {
                        AutotekaWaitingForPaymentState autotekaWaitingForPaymentState2 = autotekaWaitingForPaymentState;
                        AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = this.f97852l;
                        com.avito.konveyor.adapter.a aVar = autotekaWaitingForPaymentActivity.f97841p;
                        if (aVar == null) {
                            aVar = null;
                        }
                        aVar.c(new UV0.c(Collections.singletonList(autotekaWaitingForPaymentState2.getF97893b())));
                        j jVar = autotekaWaitingForPaymentActivity.f97840o;
                        (jVar != null ? jVar : null).notifyDataSetChanged();
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2927a(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity, Continuation<? super C2927a> continuation) {
                    super(2, continuation);
                    this.f97851r = autotekaWaitingForPaymentActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2927a(this.f97851r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2927a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97850q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = AutotekaWaitingForPaymentActivity.f97837u;
                        AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = this.f97851r;
                        n2<AutotekaWaitingForPaymentState> state = ((com.avito.android.autoteka.presentation.waitingForPayment.c) autotekaWaitingForPaymentActivity.f97839n.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = autotekaWaitingForPaymentActivity.f97844s;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C2928a c2928a = new C2928a(autotekaWaitingForPaymentActivity);
                        this.f97850q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2928a, this) == coroutine_suspended) {
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

            /* compiled from: AutotekaWaitingForPaymentActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$onCreate$2$1$2", f = "AutotekaWaitingForPaymentActivity.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$b$a$b, reason: collision with other inner class name */
            public static final class C2929b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97853q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaWaitingForPaymentActivity f97854r;

                /* compiled from: AutotekaWaitingForPaymentActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2930a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutotekaWaitingForPaymentActivity f97855b;

                    public C2930a(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity) {
                        this.f97855b = autotekaWaitingForPaymentActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Uf.b bVar = (Uf.b) obj;
                        int i12 = AutotekaWaitingForPaymentActivity.f97837u;
                        AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = this.f97855b;
                        if (L.f(bVar, b.a.f16538a)) {
                            autotekaWaitingForPaymentActivity.finish();
                        } else {
                            if (bVar instanceof b.c) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar = autotekaWaitingForPaymentActivity.f97843r;
                                if (aVar == null) {
                                    aVar = null;
                                }
                                b.a.a(aVar, ((b.c) bVar).f16540a, null, null, 6);
                            } else if (bVar instanceof b.C1134b) {
                                InterfaceC19542a interfaceC19542a = autotekaWaitingForPaymentActivity.f97842q;
                                Intent intentA = (interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92691Z);
                                intentA.setFlags(603979776);
                                autotekaWaitingForPaymentActivity.f97845t.b(intentA);
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
                        return new C42801a(2, this.f97855b, AutotekaWaitingForPaymentActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2929b(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity, Continuation<? super C2929b> continuation) {
                    super(2, continuation);
                    this.f97854r = autotekaWaitingForPaymentActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2929b(this.f97854r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2929b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97853q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = AutotekaWaitingForPaymentActivity.f97837u;
                        AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = this.f97854r;
                        InterfaceC43160i<Uf.b> events = ((com.avito.android.autoteka.presentation.waitingForPayment.c) autotekaWaitingForPaymentActivity.f97839n.getValue()).getEvents();
                        C2930a c2930a = new C2930a(autotekaWaitingForPaymentActivity);
                        this.f97853q = 1;
                        if (events.collect(c2930a, this) == coroutine_suspended) {
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
            public a(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97849r = autotekaWaitingForPaymentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f97849r, continuation);
                aVar.f97848q = obj;
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
                T t12 = (T) this.f97848q;
                AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = this.f97849r;
                C43259k.d(t12, null, null, new C2927a(autotekaWaitingForPaymentActivity, null), 3);
                C43259k.d(t12, null, null, new C2929b(autotekaWaitingForPaymentActivity, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return AutotekaWaitingForPaymentActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97846q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity = AutotekaWaitingForPaymentActivity.this;
                a aVar = new a(autotekaWaitingForPaymentActivity, null);
                this.f97846q = 1;
                if (C23056p0.b(autotekaWaitingForPaymentActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaWaitingForPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUf/a;", "it", "Lkotlin/G0;", "invoke", "(LUf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<InterfaceC15514a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15514a interfaceC15514a) {
            int i12 = AutotekaWaitingForPaymentActivity.f97837u;
            ((com.avito.android.autoteka.presentation.waitingForPayment.c) AutotekaWaitingForPaymentActivity.this.f97839n.getValue()).accept(interfaceC15514a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97857l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f97857l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97857l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaWaitingForPaymentActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaWaitingForPaymentActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaWaitingForPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/waitingForPayment/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.autoteka.presentation.waitingForPayment.c> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.autoteka.presentation.waitingForPayment.c invoke() {
            com.avito.android.autoteka.presentation.waitingForPayment.d dVar = AutotekaWaitingForPaymentActivity.this.f97838m;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.autoteka.presentation.waitingForPayment.c) dVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_waiting_for_payment_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("WaitingForPaymentDetails", WaitingForPaymentDetails.class) : intent.getParcelableExtra("WaitingForPaymentDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("waitingForPaymentDetails cannot be null");
        }
        com.avito.android.autoteka.di.waitingForPayment.f.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), (WaitingForPaymentDetails) parcelableExtra, new c(), new C28478k(AutotekaWaitingForPaymentScreen.f90294d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97844s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97844s;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97844s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        j jVar = this.f97840o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.autoteka_item_list);
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.d(toolbar);
            toolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 1));
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97844s;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
