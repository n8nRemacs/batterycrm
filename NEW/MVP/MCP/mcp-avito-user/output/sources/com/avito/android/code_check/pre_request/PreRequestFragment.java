package com.avito.android.code_check.pre_request;

import Cd.C13243a;
import So.InterfaceC15208a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
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
import com.avito.android.code_check.pre_request.a;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import dagger.internal.t;
import dagger.internal.u;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: PreRequestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/pre_request/PreRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PreRequestFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f119144s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f119145n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check_public.screen.g f119146o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check.d f119147p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final O0 f119148q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f119149r0;

    /* compiled from: PreRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check/pre_request/PreRequestFragment$a;", "", "<init>", "()V", "", "ARGS_SCREEN_NAME", "Ljava/lang/String;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PreRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.code_check.pre_request.PreRequestFragment$a$a, reason: collision with other inner class name */
        public static final class C3483a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f119150l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3483a(String str) {
                super(1);
                this.f119150l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("code_check.pre_request.screen_name", this.f119150l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static PreRequestFragment a(@k String str) {
            PreRequestFragment preRequestFragment = new PreRequestFragment();
            C35966w1.a(preRequestFragment, -1, new C3483a(str));
            return preRequestFragment;
        }

        public a() {
        }
    }

    /* compiled from: PreRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.pre_request.PreRequestFragment$onViewCreated$1", f = "PreRequestFragment.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119151q;

        /* compiled from: PreRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.pre_request.PreRequestFragment$onViewCreated$1$1", f = "PreRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f119153q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PreRequestFragment f119154r;

            /* compiled from: PreRequestFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.code_check.pre_request.PreRequestFragment$onViewCreated$1$1$1", f = "PreRequestFragment.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.pre_request.PreRequestFragment$b$a$a, reason: collision with other inner class name */
            public static final class C3484a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f119155q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PreRequestFragment f119156r;

                /* compiled from: PreRequestFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.code_check.pre_request.PreRequestFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3485a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreRequestFragment f119157b;

                    public C3485a(PreRequestFragment preRequestFragment) {
                        this.f119157b = preRequestFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15208a interfaceC15208a = (InterfaceC15208a) obj;
                        a aVar = PreRequestFragment.f119144s0;
                        PreRequestFragment preRequestFragment = this.f119157b;
                        if (interfaceC15208a instanceof InterfaceC15208a.C1034a) {
                            com.avito.android.code_check.p.a(preRequestFragment, new a.b.C3497b(null, new a.b.C3497b.C3498a(((InterfaceC15208a.C1034a) interfaceC15208a).f15145a, true), null, null, null, 29, null));
                        } else {
                            if (L.f(interfaceC15208a, InterfaceC15208a.b.f15148a)) {
                                com.avito.android.code_check_public.screen.g gVar = preRequestFragment.f119146o0;
                                com.avito.android.code_check.p.a(preRequestFragment, (gVar != null ? gVar : null).f119381b.f119385a);
                            } else if (interfaceC15208a instanceof InterfaceC15208a.c) {
                                com.avito.android.code_check.p.a(preRequestFragment, ((InterfaceC15208a.c) interfaceC15208a).f15149a);
                            } else if (interfaceC15208a instanceof InterfaceC15208a.d) {
                                ((InterfaceC15208a.d) interfaceC15208a).getClass();
                                com.avito.android.code_check.p.a(preRequestFragment, new a.b.C3497b(null, new a.b.C3497b.C3498a(null, false, 2, null), null, null, null, 29, null));
                            } else {
                                if (!(interfaceC15208a instanceof InterfaceC15208a.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Context context = preRequestFragment.getContext();
                                com.avito.android.code_check.p.a(preRequestFragment, new a.b.C3497b(null, null, context != null ? ((InterfaceC15208a.e) interfaceC15208a).f15150a.k0(context) : null, null, null, 27, null));
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
                        return new C42801a(2, this.f119157b, PreRequestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3484a(PreRequestFragment preRequestFragment, Continuation<? super C3484a> continuation) {
                    super(2, continuation);
                    this.f119156r = preRequestFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C3484a(this.f119156r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3484a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f119155q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        PreRequestFragment preRequestFragment = this.f119156r;
                        InterfaceC43160i<InterfaceC15208a> events = ((i) preRequestFragment.f119148q0.getValue()).getEvents();
                        C3485a c3485a = new C3485a(preRequestFragment);
                        this.f119155q = 1;
                        if (events.collect(c3485a, this) == coroutine_suspended) {
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

            /* compiled from: PreRequestFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.code_check.pre_request.PreRequestFragment$onViewCreated$1$1$2", f = "PreRequestFragment.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.pre_request.PreRequestFragment$b$a$b, reason: collision with other inner class name */
            public static final class C3486b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f119158q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PreRequestFragment f119159r;

                /* compiled from: PreRequestFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSo/b;", "it", "Lkotlin/G0;", "emit", "(LSo/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.code_check.pre_request.PreRequestFragment$b$a$b$a, reason: collision with other inner class name */
                public static final class C3487a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C3487a<T> f119160b = new C3487a<>();

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3486b(PreRequestFragment preRequestFragment, Continuation<? super C3486b> continuation) {
                    super(2, continuation);
                    this.f119159r = preRequestFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C3486b(this.f119159r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3486b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f119158q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        n2<So.b> state = ((i) this.f119159r.f119148q0.getValue()).getState();
                        InterfaceC43172j<? super So.b> interfaceC43172j = C3487a.f119160b;
                        this.f119158q = 1;
                        if (state.collect(interfaceC43172j, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PreRequestFragment preRequestFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119154r = preRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f119154r, continuation);
                aVar.f119153q = obj;
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
                T t12 = (T) this.f119153q;
                PreRequestFragment preRequestFragment = this.f119154r;
                C43259k.d(t12, null, null, new C3484a(preRequestFragment, null), 3);
                C43259k.d(t12, null, null, new C3486b(preRequestFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return PreRequestFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119151q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                PreRequestFragment preRequestFragment = PreRequestFragment.this;
                a aVar = new a(preRequestFragment, null);
                this.f119151q = 1;
                if (C23056p0.b(preRequestFragment, state, aVar, this) == coroutine_suspended) {
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
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f119161l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f119161l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f119161l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PreRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f119163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f119163l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f119163l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119164l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f119164l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119165l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f119165l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PreRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/code_check/pre_request/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<i> {
        public h() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final i invoke() {
            u uVar = PreRequestFragment.this.f119145n0;
            if (uVar == null) {
                uVar = null;
            }
            return (i) uVar.get();
        }
    }

    public PreRequestFragment() {
        super(R.layout.fragment_container);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f119148q0 = new O0(m0.f406844a.b(i.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c(new com.avito.android.code_check.pre_request.e(), (com.avito.android.code_check.pre_request.c) C29972i.a(C29972i.b(this), com.avito.android.code_check.pre_request.c.class), cv.c.b(this), requireArguments().getString("code_check.pre_request.screen_name"), s.c(this), null);
        this.f119145n0 = cVar.f119176j;
        this.f119146o0 = cVar.f119170d.get();
        com.avito.android.code_check.d dVarVj = cVar.f119167a.Vj();
        t.c(dVarVj);
        this.f119147p0 = dVarVj;
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f119175i.get();
        this.f119149r0 = screenPerformanceTracker;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            com.avito.android.code_check_public.screen.g gVar = this.f119146o0;
            if (gVar == null) {
                gVar = null;
            }
            l<Phone, G0> lVar = gVar.f119382c;
            if (lVar != null) {
                com.avito.android.code_check.d dVar = this.f119147p0;
                if (dVar == null) {
                    dVar = null;
                }
                String strA = dVar.G3().a();
                String strA2 = strA != null ? To.c.a(strA) : null;
                lVar.invoke(strA2 != null ? Phone.a(strA2) : null);
            }
        }
    }
}
