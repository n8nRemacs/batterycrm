package com.avito.android.publish.input_imei;

import Cd.C13243a;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InputImeiScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.analytics.E;
import com.avito.android.publish.input_imei.di.b;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import com.avito.android.validation.InterfaceC36014j;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Set;
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
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import le0.C43742c;
import le0.InterfaceC43740a;
import le0.InterfaceC43741b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: InputImeiFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/input_imei/InputImeiFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LId0/c;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InputImeiFragment extends BaseFragment implements InterfaceC28477j.b, Id0.c, com.avito.android.ui.fragments.c {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f236195A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.input_imei.l f236196n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f236197o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f236198p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f236199q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f236200r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f236201s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC36030r0 f236202t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f236203u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public E f236204v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public Q1 f236205w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f236206x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f236207y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.publish.input_imei.j f236208z0;

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/input_imei/InputImeiFragment$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            n<Object>[] nVarArr = InputImeiFragment.f236195A0;
            InputImeiFragment inputImeiFragment = InputImeiFragment.this;
            inputImeiFragment.r5().accept(new InterfaceC43740a.c(new com.avito.android.publish.input_imei.c(inputImeiFragment)));
            return G0.f406611a;
        }
    }

    /* compiled from: InputImeiFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC43741b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43741b interfaceC43741b) {
            InterfaceC43741b interfaceC43741b2 = interfaceC43741b;
            InputImeiFragment inputImeiFragment = (InputImeiFragment) this.receiver;
            n<Object>[] nVarArr = InputImeiFragment.f236195A0;
            Bundle arguments = inputImeiFragment.getArguments();
            if (arguments == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i12 = arguments.getInt("step_index");
            if (interfaceC43741b2 instanceof InterfaceC43741b.d) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, inputImeiFragment, ((InterfaceC43741b.d) interfaceC43741b2).f413971a, null, null, null, 0, null, 1022);
            } else {
                if (interfaceC43741b2 instanceof InterfaceC43741b.C11792b) {
                    K2.e(inputImeiFragment);
                    com.avito.android.publish.input_imei.j jVar = inputImeiFragment.f236208z0;
                    (jVar != null ? jVar : null).h();
                } else if (interfaceC43741b2 instanceof InterfaceC43741b.c) {
                    K2.e(inputImeiFragment);
                    com.avito.android.publish.input_imei.j jVar2 = inputImeiFragment.f236208z0;
                    (jVar2 != null ? jVar2 : null).Y0(i12);
                } else if (interfaceC43741b2 instanceof InterfaceC43741b.e) {
                    K2.e(inputImeiFragment);
                    C47313c c47313c = inputImeiFragment.f236207y0;
                    n<Object> nVar = InputImeiFragment.f236195A0[1];
                    ((C33862g0) c47313c.a()).d(((InterfaceC43741b.e) interfaceC43741b2).f413972a);
                } else if (interfaceC43741b2 instanceof InterfaceC43741b.a) {
                    inputImeiFragment.q5().l(new com.avito.android.publish.input_imei.a(((InterfaceC43741b.a) interfaceC43741b2).f413968a), -1);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lle0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lle0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C43742c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43742c c43742c) {
            n<Object>[] nVarArr = InputImeiFragment.f236195A0;
            InputImeiFragment inputImeiFragment = InputImeiFragment.this;
            C33862g0 c33862g0 = new C33862g0(inputImeiFragment.requireView().getRootView(), c43742c.f413976c);
            c33862g0.b(new com.avito.android.publish.input_imei.d(inputImeiFragment), new com.avito.android.publish.input_imei.e(inputImeiFragment));
            C47313c c47313c = inputImeiFragment.f236207y0;
            n<Object> nVar = InputImeiFragment.f236195A0[1];
            c47313c.b(inputImeiFragment, c33862g0);
            return G0.f406611a;
        }
    }

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_imei.InputImeiFragment$onCreateView$3", f = "InputImeiFragment.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f236211q;

        /* compiled from: InputImeiFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.input_imei.InputImeiFragment$onCreateView$3$1", f = "InputImeiFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f236213q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InputImeiFragment f236214r;

            /* compiled from: InputImeiFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.input_imei.InputImeiFragment$onCreateView$3$1$1", f = "InputImeiFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.input_imei.InputImeiFragment$e$a$a, reason: collision with other inner class name */
            public static final class C7116a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f236215q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InputImeiFragment f236216r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7116a(InputImeiFragment inputImeiFragment, Continuation<? super C7116a> continuation) {
                    super(2, continuation);
                    this.f236216r = inputImeiFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7116a(this.f236216r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7116a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f236215q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f236215q = 1;
                        InputImeiFragment inputImeiFragment = this.f236216r;
                        InterfaceC36030r0 interfaceC36030r0 = inputImeiFragment.f236202t0;
                        if (interfaceC36030r0 == null) {
                            interfaceC36030r0 = null;
                        }
                        Object objCollect = ((AbstractC43168f) y.a(interfaceC36030r0.g())).collect(new com.avito.android.publish.input_imei.b(inputImeiFragment), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
                        }
                        if (objCollect == coroutine_suspended) {
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
            public a(InputImeiFragment inputImeiFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f236214r = inputImeiFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f236214r, continuation);
                aVar.f236213q = obj;
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
                C43259k.d((T) this.f236213q, null, null, new C7116a(this.f236214r, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return InputImeiFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f236211q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                InputImeiFragment inputImeiFragment = InputImeiFragment.this;
                a aVar = new a(inputImeiFragment, null);
                this.f236211q = 1;
                if (C23056p0.b(inputImeiFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements p<String, Bundle, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            n<Object>[] nVarArr = InputImeiFragment.f236195A0;
            InputImeiFragment.this.r5().accept(InterfaceC43740a.e.f413967a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f236218l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f236218l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f236218l);
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
            return InputImeiFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f236220l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f236220l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f236220l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f236221l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f236221l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f236221l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f236222l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f236222l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f236222l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: InputImeiFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/input_imei/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/input_imei/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.publish.input_imei.k> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.input_imei.k invoke() {
            com.avito.android.publish.input_imei.l lVar = InputImeiFragment.this.f236196n0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.publish.input_imei.k) lVar.get();
        }
    }

    static {
        Y y12 = new Y(InputImeiFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f236195A0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(InputImeiFragment.class, "appbarView", "getAppbarView()Lcom/avito/android/publish/PublishAppbarView;", 0, n0Var)};
        new a(null);
    }

    public InputImeiFragment() {
        super(R.layout.input_imei_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f236197o0 = new O0(m0.f406844a.b(com.avito.android.publish.input_imei.k.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f236206x0 = new C47313c(null, 1, null);
        this.f236207y0 = new C47313c(null, 1, null);
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f236205w0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_button_re23 : R.layout.publish_button;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        r5().accept(InterfaceC43740a.C11791a.f413963a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f236208z0 = (com.avito.android.publish.input_imei.j) context;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC36014j interfaceC36014j = this.f236203u0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.e(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f236198p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.arch.mvi.android.f.a(r5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, InputImeiFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiOneTimeEvent;)V", 0), new d());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC36014j interfaceC36014j = this.f236203u0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC36030r0 interfaceC36030r0 = this.f236202t0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        interfaceC36030r0.a();
        E e12 = this.f236204v0;
        (e12 != null ? e12 : null).a();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r5().accept(InterfaceC43740a.b.f413964a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) requireView().findViewById(R.id.recycler_view);
        C47313c c47313c = this.f236206x0;
        n<Object> nVar = f236195A0[0];
        c47313c.b(this, recyclerView);
        RecyclerView recyclerViewQ5 = q5();
        requireView().getContext();
        recyclerViewQ5.setLayoutManager(new UnpredictiveLinearLayoutManager());
        RecyclerView.j itemAnimator = q5().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        q5().l(new com.avito.android.blueprints.publish.header.a(q5().getResources()), -1);
        RecyclerView recyclerViewQ52 = q5();
        RecyclerView.Adapter<?> adapter = this.f236200r0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerViewQ52.setAdapter(adapter);
        InterfaceC36030r0 interfaceC36030r0 = this.f236202t0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        Set<TV0.d<?, ?>> set = this.f236199q0;
        if (set == null) {
            set = null;
        }
        interfaceC36030r0.i(set);
        E e12 = this.f236204v0;
        if (e12 == null) {
            e12 = null;
        }
        e12.b();
        C22960s.b(this, "SCANNER_REQUEST_KEY", new f());
        ScreenPerformanceTracker screenPerformanceTracker = this.f236198p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments.getInt("step_index");
        C28478k c28478k = new C28478k(InputImeiScreen.f90379d, s.c(this), "imei");
        b.a aVarA = com.avito.android.publish.input_imei.di.a.a();
        aVarA.e((com.avito.android.publish.input_imei.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.input_imei.di.c.class));
        aVarA.a(cv.c.b(this));
        aVarA.b(getResources());
        aVarA.d(i12);
        aVarA.f(this);
        aVarA.c(c28478k);
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f236198p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final RecyclerView q5() {
        C47313c c47313c = this.f236206x0;
        n<Object> nVar = f236195A0[0];
        return (RecyclerView) c47313c.a();
    }

    public final com.avito.android.publish.input_imei.k r5() {
        return (com.avito.android.publish.input_imei.k) this.f236197o0.getValue();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        bVar.d(getString(R.string.continue_string));
        bVar.b(new b());
    }

    @Override // Id0.c
    public final void g2() {
    }
}
