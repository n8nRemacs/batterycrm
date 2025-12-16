package com.avito.android.iac_calls_history.impl_module.screen;

import Cd.C13243a;
import Y41.p;
import YJ.a;
import ZJ.a;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a;
import com.avito.android.iac_calls_history.impl_module.screen.ui.r;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: CallsHistoryScreenActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/CallsHistoryScreenActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState;", VoiceInfo.STATE, "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallsHistoryScreenActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final a f164759q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f164760m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f164761n = new O0(m0.f406844a.b(j.class), new e(), new d(new g()), new f());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f164762o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f164763p;

    /* compiled from: CallsHistoryScreenActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/CallsHistoryScreenActivity$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CallsHistoryScreenActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = CallsHistoryScreenActivity.f164759q;
                CallsHistoryScreenActivity callsHistoryScreenActivity = CallsHistoryScreenActivity.this;
                CallsHistoryScreenState callsHistoryScreenState = (CallsHistoryScreenState) C22126m3.b(callsHistoryScreenActivity.a2().getState(), a13).getF42167b();
                a13.C(560992939);
                Object objT = a13.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    objT = new com.avito.android.iac_calls_history.impl_module.screen.b(callsHistoryScreenActivity);
                    a13.H(objT);
                }
                Y41.a aVar2 = (Y41.a) objT;
                a13.h();
                j jVarA2 = callsHistoryScreenActivity.a2();
                a13.C(560994847);
                boolean zB2 = a13.B(jVarA2);
                Object objT2 = a13.t();
                if (zB2 || objT2 == c1651a) {
                    objT2 = new com.avito.android.iac_calls_history.impl_module.screen.c(callsHistoryScreenActivity);
                    a13.H(objT2);
                }
                Y41.l lVar = (Y41.l) objT2;
                a13.h();
                j jVarA22 = callsHistoryScreenActivity.a2();
                a13.C(560998491);
                boolean zB3 = a13.B(jVarA22);
                Object objT3 = a13.t();
                if (zB3 || objT3 == c1651a) {
                    objT3 = new com.avito.android.iac_calls_history.impl_module.screen.d(callsHistoryScreenActivity);
                    a13.H(objT3);
                }
                Y41.l lVar2 = (Y41.l) objT3;
                a13.h();
                j jVarA23 = callsHistoryScreenActivity.a2();
                a13.C(561001974);
                boolean zB4 = a13.B(jVarA23);
                Object objT4 = a13.t();
                if (zB4 || objT4 == c1651a) {
                    objT4 = new com.avito.android.iac_calls_history.impl_module.screen.e(callsHistoryScreenActivity);
                    a13.H(objT4);
                }
                Y41.a aVar3 = (Y41.a) objT4;
                a13.h();
                j jVarA24 = callsHistoryScreenActivity.a2();
                a13.C(561005302);
                boolean zB5 = a13.B(jVarA24);
                Object objT5 = a13.t();
                if (zB5 || objT5 == c1651a) {
                    objT5 = new com.avito.android.iac_calls_history.impl_module.screen.f(callsHistoryScreenActivity);
                    a13.H(objT5);
                }
                a13.h();
                r.a(callsHistoryScreenState, aVar2, lVar, lVar2, aVar3, (Y41.a) objT5, null, a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CallsHistoryScreenActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity$onCreate$2", f = "CallsHistoryScreenActivity.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164765q;

        /* compiled from: CallsHistoryScreenActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity$onCreate$2$1", f = "CallsHistoryScreenActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f164767q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CallsHistoryScreenActivity f164768r;

            /* compiled from: CallsHistoryScreenActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity$onCreate$2$1$1", f = "CallsHistoryScreenActivity.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity$c$a$a, reason: collision with other inner class name */
            public static final class C4820a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f164769q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CallsHistoryScreenActivity f164770r;

                /* compiled from: CallsHistoryScreenActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.iac_calls_history.impl_module.screen.CallsHistoryScreenActivity$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4821a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CallsHistoryScreenActivity f164771b;

                    public C4821a(CallsHistoryScreenActivity callsHistoryScreenActivity) {
                        this.f164771b = callsHistoryScreenActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        ZJ.a aVar = (ZJ.a) obj;
                        a aVar2 = CallsHistoryScreenActivity.f164759q;
                        CallsHistoryScreenActivity callsHistoryScreenActivity = this.f164771b;
                        if (aVar instanceof a.b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = callsHistoryScreenActivity.f164763p;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            b.a.a(aVar3, ((a.b) aVar).f20088a, null, null, 6);
                        } else if (aVar instanceof a.c) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar4 = callsHistoryScreenActivity.f164763p;
                            if (aVar4 == null) {
                                aVar4 = null;
                            }
                            b.a.a(aVar4, new ToastMessageLink(callsHistoryScreenActivity.getString(R.string.iac_calls_history_loading_error), ToastMessageLink.ToastType.f133736e, null, null, null, false, null, 124, null), null, null, 6);
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
                        return new C42801a(2, this.f164771b, CallsHistoryScreenActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4820a(CallsHistoryScreenActivity callsHistoryScreenActivity, Continuation<? super C4820a> continuation) {
                    super(2, continuation);
                    this.f164770r = callsHistoryScreenActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4820a(this.f164770r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4820a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f164769q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CallsHistoryScreenActivity.f164759q;
                        CallsHistoryScreenActivity callsHistoryScreenActivity = this.f164770r;
                        InterfaceC43160i<ZJ.a> events = callsHistoryScreenActivity.a2().getEvents();
                        C4821a c4821a = new C4821a(callsHistoryScreenActivity);
                        this.f164769q = 1;
                        if (events.collect(c4821a, this) == coroutine_suspended) {
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
            public a(CallsHistoryScreenActivity callsHistoryScreenActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f164768r = callsHistoryScreenActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f164768r, continuation);
                aVar.f164767q = obj;
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
                C43259k.d((T) this.f164767q, null, null, new C4820a(this.f164768r, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CallsHistoryScreenActivity.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164765q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CallsHistoryScreenActivity callsHistoryScreenActivity = CallsHistoryScreenActivity.this;
                a aVar = new a(callsHistoryScreenActivity, null);
                this.f164765q = 1;
                if (C23056p0.b(callsHistoryScreenActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f164772l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f164772l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f164772l);
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
            return CallsHistoryScreenActivity.this.getF42820b();
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
            return CallsHistoryScreenActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CallsHistoryScreenActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/iac_calls_history/impl_module/screen/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<j> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            k kVar = CallsHistoryScreenActivity.this.f164760m;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.avito.android.iac_calls_history.impl_module.screen.a] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).fc().a(this, getResources(), s.a(this), new l() { // from class: com.avito.android.iac_calls_history.impl_module.screen.a
            @Override // com.avito.android.iac_calls_history.impl_module.screen.l
            public final void a(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a aVar) {
                CallsHistoryScreenActivity.a aVar2 = CallsHistoryScreenActivity.f164759q;
                this.f164776a.a2().accept(aVar);
            }
        }, cv.c.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f164762o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final j a2() {
        return (j) this.f164761n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f164762o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        androidx.view.compose.j.a(this, new C22096n(-887638480, new b(), true));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f164762o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        a2().accept(a.f.f164836a);
    }
}
