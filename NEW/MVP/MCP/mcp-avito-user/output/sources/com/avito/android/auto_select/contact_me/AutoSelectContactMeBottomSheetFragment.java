package com.avito.android.auto_select.contact_me;

import Cd.C13243a;
import Fc1.D3;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetResult;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.perf.AutoSelectContactMeBottomSheetScreen;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import gf.InterfaceC40670a;
import gf.InterfaceC40671b;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import p002if.InterfaceC41393a;
import z1.AbstractC50339a;

/* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lgf/c;", VoiceInfo.STATE, "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectContactMeBottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public r f95930h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f95931i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f95932j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f95933k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f95934l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f95929n0 = {m0.f406844a.e(new Y(AutoSelectContactMeBottomSheetFragment.class, "openParams", "getOpenParams()Lcom/avito/android/auto_select/contact_me/model/AutoSelectContactMeBottomSheetOpenArguments;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f95928m0 = new a(null);

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetFragment$a;", "", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = AutoSelectContactMeBottomSheetFragment.this.f95932j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment$onCreateDialog$1", f = "AutoSelectContactMeBottomSheetFragment.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f95936q;

        /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment$onCreateDialog$1$1", f = "AutoSelectContactMeBottomSheetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f95938q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutoSelectContactMeBottomSheetFragment f95939r;

            /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment$onCreateDialog$1$1$1", f = "AutoSelectContactMeBottomSheetFragment.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2836a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f95940q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutoSelectContactMeBottomSheetFragment f95941r;

                /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2837a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutoSelectContactMeBottomSheetFragment f95942b;

                    public C2837a(AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment) {
                        this.f95942b = autoSelectContactMeBottomSheetFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC40671b interfaceC40671b = (InterfaceC40671b) obj;
                        a aVar = AutoSelectContactMeBottomSheetFragment.f95928m0;
                        AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = this.f95942b;
                        boolean z12 = interfaceC40671b instanceof InterfaceC40671b.a;
                        String str = ((AutoSelectContactMeBottomSheetOpenArguments) autoSelectContactMeBottomSheetFragment.f95934l0.getValue(autoSelectContactMeBottomSheetFragment, AutoSelectContactMeBottomSheetFragment.f95929n0[0])).f95987b;
                        if (z12) {
                            AutoSelectContactMeBottomSheetResult.Cancel cancel = AutoSelectContactMeBottomSheetResult.Cancel.f95952b;
                            FragmentManager parentFragmentManager = autoSelectContactMeBottomSheetFragment.getParentFragmentManager();
                            cancel.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("auto_select_contact_me_link.AutoSelectContactMeBottomSheetResult", cancel);
                            parentFragmentManager.o0(bundle, str);
                            autoSelectContactMeBottomSheetFragment.dismissAllowingStateLoss();
                        } else if (interfaceC40671b instanceof InterfaceC40671b.C11219b) {
                            AutoSelectContactMeBottomSheetResult.NextLink nextLink = new AutoSelectContactMeBottomSheetResult.NextLink(((InterfaceC40671b.C11219b) interfaceC40671b).f396673a);
                            FragmentManager parentFragmentManager2 = autoSelectContactMeBottomSheetFragment.getParentFragmentManager();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("auto_select_contact_me_link.AutoSelectContactMeBottomSheetResult", nextLink);
                            parentFragmentManager2.o0(bundle2, str);
                            autoSelectContactMeBottomSheetFragment.dismissAllowingStateLoss();
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
                        return new C42801a(2, this.f95942b, AutoSelectContactMeBottomSheetFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2836a(AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment, Continuation<? super C2836a> continuation) {
                    super(2, continuation);
                    this.f95941r = autoSelectContactMeBottomSheetFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2836a(this.f95941r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2836a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f95940q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = AutoSelectContactMeBottomSheetFragment.f95928m0;
                        AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = this.f95941r;
                        InterfaceC43160i<InterfaceC40671b> events = autoSelectContactMeBottomSheetFragment.f5().getEvents();
                        C2837a c2837a = new C2837a(autoSelectContactMeBottomSheetFragment);
                        this.f95940q = 1;
                        if (events.collect(c2837a, this) == coroutine_suspended) {
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
            public a(AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95939r = autoSelectContactMeBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f95939r, continuation);
                aVar.f95938q = obj;
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
                C43259k.d((T) this.f95938q, null, null, new C2836a(this.f95939r, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AutoSelectContactMeBottomSheetFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f95936q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                AutoSelectContactMeBottomSheetFragment autoSelectContactMeBottomSheetFragment = AutoSelectContactMeBottomSheetFragment.this;
                a aVar = new a(autoSelectContactMeBottomSheetFragment, null);
                this.f95936q = 1;
                if (C23056p0.b(autoSelectContactMeBottomSheetFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.setContent(new C22096n(-50843848, new com.avito.android.auto_select.contact_me.e(AutoSelectContactMeBottomSheetFragment.this), true));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = AutoSelectContactMeBottomSheetFragment.f95928m0;
            AutoSelectContactMeBottomSheetFragment.this.f5().accept(InterfaceC40670a.d.f396671a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f95945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f95945l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f95945l);
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
            return AutoSelectContactMeBottomSheetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f95947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f95947l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f95947l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95948l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95948l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f95948l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95949l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95949l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f95949l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auto_select/contact_me/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auto_select/contact_me/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<q> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AutoSelectContactMeBottomSheetFragment.this.f95930h0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public AutoSelectContactMeBottomSheetFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f95931i0 = new O0(m0.f406844a.b(q.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f95933k0 = C42727D.c(new b());
        this.f95934l0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(AutoSelectContactMeBottomSheetScreen.f96030d, s.b(this), null, 4, null);
        com.avito.android.auto_select.contact_me.di.b.a().a(cv.c.b(this), (InterfaceC41393a) C29972i.a(C29972i.b(this), InterfaceC41393a.class), c28478k, (AutoSelectContactMeBottomSheetOpenArguments) this.f95934l0.getValue(this, f95929n0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f95932j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final q f5() {
        return (q) this.f95931i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f95932j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.C(R.layout.auto_select_compose_content_layout, new d());
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, ((AutoSelectContactMeBottomSheetOpenArguments) this.f95934l0.getValue(this, f95929n0[0])).f95989d, true, 0, 0, 0, 120);
        dVar.setOnCancelListener(new D3(this, 3));
        dVar.Q(new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f95932j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
