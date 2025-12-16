package com.avito.android.sbc.dispatch_edit;

import Cd.C13243a;
import Wo0.InterfaceC15787c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.DispatchEdit;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.sbc.autodispatches.x;
import com.avito.android.sbc.dispatch_edit.di.b;
import com.avito.android.ui.fragments.BaseFragment;
import java.io.Serializable;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: SbcDispatchEditFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/SbcDispatchEditFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LWo0/d;", VoiceInfo.STATE, "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcDispatchEditFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f260032s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f260033n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f260034o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f260035p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f260036q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public x f260037r0;

    /* compiled from: SbcDispatchEditFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/SbcDispatchEditFragment$a;", "", "<init>", "()V", "", "DISPATCH_ID", "Ljava/lang/String;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbcDispatchEditFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = SbcDispatchEditFragment.this.f260035p0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: SbcDispatchEditFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f260039l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SbcDispatchEditFragment f260040m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComposeView composeView, SbcDispatchEditFragment sbcDispatchEditFragment) {
            super(2);
            this.f260039l = composeView;
            this.f260040m = sbcDispatchEditFragment;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f260039l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                SbcDispatchEditFragment sbcDispatchEditFragment = this.f260040m;
                com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) sbcDispatchEditFragment.f260036q0.getValue(), androidx.compose.runtime.internal.r.c(-821446196, new com.avito.android.sbc.dispatch_edit.c(C22126m3.b(((s) sbcDispatchEditFragment.f260034o0.getValue()).getState(), a13), sbcDispatchEditFragment), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SbcDispatchEditFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment$onCreateView$2$1$1", f = "SbcDispatchEditFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260041q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f260042r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SbcDispatchEditFragment f260043s;

        /* compiled from: SbcDispatchEditFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment$onCreateView$2$1$1$1", f = "SbcDispatchEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f260044q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SbcDispatchEditFragment f260045r;

            /* compiled from: SbcDispatchEditFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment$onCreateView$2$1$1$1$1", f = "SbcDispatchEditFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment$d$a$a, reason: collision with other inner class name */
            public static final class C7797a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f260046q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SbcDispatchEditFragment f260047r;

                /* compiled from: SbcDispatchEditFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment$d$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7798a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SbcDispatchEditFragment f260048b;

                    public C7798a(SbcDispatchEditFragment sbcDispatchEditFragment) {
                        this.f260048b = sbcDispatchEditFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15787c interfaceC15787c = (InterfaceC15787c) obj;
                        a aVar = SbcDispatchEditFragment.f260032s0;
                        SbcDispatchEditFragment sbcDispatchEditFragment = this.f260048b;
                        if (interfaceC15787c instanceof InterfaceC15787c.b) {
                            x xVar = sbcDispatchEditFragment.f260037r0;
                            if (xVar != null) {
                                xVar.f0(((InterfaceC15787c.b) interfaceC15787c).f18057a);
                            }
                        } else if (interfaceC15787c instanceof InterfaceC15787c.a) {
                            x xVar2 = sbcDispatchEditFragment.f260037r0;
                            if (xVar2 != null) {
                                xVar2.g1();
                            }
                        } else if (interfaceC15787c instanceof InterfaceC15787c.C1286c) {
                            InterfaceC15787c.C1286c c1286c = (InterfaceC15787c.C1286c) interfaceC15787c;
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, sbcDispatchEditFragment, com.avito.android.printable_text.b.f(z.k(c1286c.f18058a)), null, null, new f.c(c1286c.f18058a), 0, ToastBarPosition.f181046d, 942);
                        } else if (interfaceC15787c instanceof InterfaceC15787c.d) {
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            ((InterfaceC15787c.d) interfaceC15787c).getClass();
                            com.avito.android.component.toast.c.c(cVar, sbcDispatchEditFragment, com.avito.android.printable_text.b.c(R.string.sbc_dispatch_edit_failed_general_error, new Serializable[0]), null, null, null, 0, ToastBarPosition.f181046d, 958);
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
                        return new C42801a(2, this.f260048b, SbcDispatchEditFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7797a(SbcDispatchEditFragment sbcDispatchEditFragment, Continuation<? super C7797a> continuation) {
                    super(2, continuation);
                    this.f260047r = sbcDispatchEditFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7797a(this.f260047r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7797a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f260046q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SbcDispatchEditFragment sbcDispatchEditFragment = this.f260047r;
                        InterfaceC43160i<InterfaceC15787c> events = ((s) sbcDispatchEditFragment.f260034o0.getValue()).getEvents();
                        C7798a c7798a = new C7798a(sbcDispatchEditFragment);
                        this.f260046q = 1;
                        if (events.collect(c7798a, this) == coroutine_suspended) {
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
            public a(SbcDispatchEditFragment sbcDispatchEditFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f260045r = sbcDispatchEditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f260045r, continuation);
                aVar.f260044q = obj;
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
                C43259k.d((T) this.f260044q, null, null, new C7797a(this.f260045r, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC22983P interfaceC22983P, SbcDispatchEditFragment sbcDispatchEditFragment, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f260042r = interfaceC22983P;
            this.f260043s = sbcDispatchEditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f260042r, this.f260043s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260041q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC22983P interfaceC22983P = this.f260042r;
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f260043s, null);
                this.f260041q = 1;
                if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f260049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f260049l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f260049l);
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
            return SbcDispatchEditFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f260051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f260051l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f260051l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260052l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260052l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f260052l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260053l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f260053l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SbcDispatchEditFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sbc/dispatch_edit/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<s> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = SbcDispatchEditFragment.this.f260033n0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public SbcDispatchEditFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f260034o0 = new O0(m0.f406844a.b(s.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f260036q0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        boolean z12 = context instanceof x;
        Object obj = context;
        if (!z12) {
            obj = null;
        }
        this.f260037r0 = (x) obj;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f260035p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(699315308, new c(composeView, this), true));
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner), null, null, new d(viewLifecycleOwner, this, null), 3);
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f260035p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(DispatchEdit.f90343d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.sbc.dispatch_edit.di.a.a();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("You have to pass dispatchId");
        }
        aVarA.a(c28478k, arguments.getLong("dispatch_id"), (com.avito.android.sbc.dispatch_edit.di.c) C29972i.a(C29972i.b(this), com.avito.android.sbc.dispatch_edit.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f260035p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
