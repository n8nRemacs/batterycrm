package com.avito.android.bottom_sheet_group.bottomsheetgroup;

import Cd.r;
import Y41.p;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bk.InterfaceC25670b;
import com.avito.android.R;
import com.avito.android.analytics.screens.BottomSheetGroupScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.i;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupState;
import com.avito.android.bottom_sheet_group.di.p;
import com.avito.android.bottom_sheet_group.o;
import com.avito.android.bottom_sheet_group.v;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
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
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: BottomSheetGroupMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/BottomSheetGroupMviFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetGroupMviFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f107192n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public i.a f107193h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f107194i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f107195j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f107196k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f107197l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.avito.android.bottom_sheet_group.bottomsheetgroup.f f107198m0;

    /* compiled from: BottomSheetGroupMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/BottomSheetGroupMviFragment$a;", "", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetGroupMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$onCreateView$1", f = "BottomSheetGroupMviFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107199q;

        /* compiled from: BottomSheetGroupMviFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$onCreateView$1$1", f = "BottomSheetGroupMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f107201q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BottomSheetGroupMviFragment f107202r;

            /* compiled from: BottomSheetGroupMviFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$onCreateView$1$1$1", f = "BottomSheetGroupMviFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$b$a$a, reason: collision with other inner class name */
            public static final class C3202a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f107203q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BottomSheetGroupMviFragment f107204r;

                /* compiled from: BottomSheetGroupMviFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C3203a extends N implements Y41.l<BottomSheetGroupState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ BottomSheetGroupMviFragment f107205l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3203a(BottomSheetGroupMviFragment bottomSheetGroupMviFragment) {
                        super(1);
                        this.f107205l = bottomSheetGroupMviFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(BottomSheetGroupState bottomSheetGroupState) {
                        BottomSheetGroupState bottomSheetGroupState2 = bottomSheetGroupState;
                        BottomSheetGroupMviFragment bottomSheetGroupMviFragment = this.f107205l;
                        com.avito.android.bottom_sheet_group.bottomsheetgroup.a aVar = new com.avito.android.bottom_sheet_group.bottomsheetgroup.a(1, (i) bottomSheetGroupMviFragment.f107194i0.getValue(), i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        com.avito.konveyor.adapter.h hVar = bottomSheetGroupMviFragment.f107197l0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        com.avito.konveyor.util.a.a(hVar, bottomSheetGroupState2.f107263f);
                        com.avito.android.bottom_sheet_group.bottomsheetgroup.f fVar = bottomSheetGroupMviFragment.f107198m0;
                        com.avito.android.bottom_sheet_group.bottomsheetgroup.f fVar2 = fVar != null ? fVar : null;
                        com.avito.android.bottom_sheet_group.bottomsheetgroup.b bVar = new com.avito.android.bottom_sheet_group.bottomsheetgroup.b(aVar);
                        Button button = fVar2.f107219b;
                        if (button != null) {
                            com.avito.android.lib.design.button.b.a(button, bottomSheetGroupState2.f107259b, false);
                        }
                        if (button != null) {
                            button.setOnClickListener(new com.avito.android.blueprint.date.interval.j(20, bVar));
                        }
                        com.avito.android.bottom_sheet_group.bottomsheetgroup.c cVar = new com.avito.android.bottom_sheet_group.bottomsheetgroup.c(aVar);
                        TextView textView = fVar2.f107220c;
                        if (textView != null) {
                            I5.a(textView, bottomSheetGroupState2.f107261d, false);
                        }
                        if (textView != null) {
                            textView.setOnClickListener(new com.avito.android.blueprint.date.interval.j(21, cVar));
                        }
                        boolean z12 = bottomSheetGroupState2.f107262e;
                        if (textView != null) {
                            textView.setClickable(z12);
                        }
                        if (z12) {
                            Integer num = fVar2.f107221d;
                            if (num != null && textView != null) {
                                textView.setTextColor(num.intValue());
                            }
                        } else {
                            Integer num2 = fVar2.f107222e;
                            if (num2 != null && textView != null) {
                                textView.setTextColor(num2.intValue());
                            }
                        }
                        boolean z13 = bottomSheetGroupState2.f107260c;
                        Button button2 = fVar2.f107219b;
                        if (button2 != null) {
                            button2.setEnabled(z13);
                        }
                        if (button2 != null) {
                            D6.G(button2, z13);
                        }
                        fVar2.f107223f.notifyDataSetChanged();
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3202a(BottomSheetGroupMviFragment bottomSheetGroupMviFragment, Continuation<? super C3202a> continuation) {
                    super(2, continuation);
                    this.f107204r = bottomSheetGroupMviFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3202a(this.f107204r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3202a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f107203q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        BottomSheetGroupMviFragment bottomSheetGroupMviFragment = this.f107204r;
                        n2<BottomSheetGroupState> state = ((i) bottomSheetGroupMviFragment.f107194i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = bottomSheetGroupMviFragment.f107195j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3203a c3203a = new C3203a(bottomSheetGroupMviFragment);
                        this.f107203q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3203a, this) == coroutine_suspended) {
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

            /* compiled from: BottomSheetGroupMviFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$onCreateView$1$1$2", f = "BottomSheetGroupMviFragment.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$b$a$b, reason: collision with other inner class name */
            public static final class C3204b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f107206q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BottomSheetGroupMviFragment f107207r;

                /* compiled from: BottomSheetGroupMviFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3205a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BottomSheetGroupMviFragment f107208b;

                    public C3205a(BottomSheetGroupMviFragment bottomSheetGroupMviFragment) {
                        this.f107208b = bottomSheetGroupMviFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC25670b interfaceC25670b = (InterfaceC25670b) obj;
                        a aVar = BottomSheetGroupMviFragment.f107192n0;
                        BottomSheetGroupMviFragment bottomSheetGroupMviFragment = this.f107208b;
                        if (interfaceC25670b instanceof InterfaceC25670b.a) {
                            InterfaceC25670b.a aVar2 = (InterfaceC25670b.a) interfaceC25670b;
                            String str = aVar2.f57413a;
                            InterfaceC23487e targetFragment = bottomSheetGroupMviFragment.getTargetFragment();
                            v vVar = targetFragment instanceof v ? (v) targetFragment : null;
                            if (vVar != null) {
                                vVar.f(str, aVar2.f57414b);
                            }
                            bottomSheetGroupMviFragment.dismissAllowingStateLoss();
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
                        return new C42801a(2, this.f107208b, BottomSheetGroupMviFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3204b(BottomSheetGroupMviFragment bottomSheetGroupMviFragment, Continuation<? super C3204b> continuation) {
                    super(2, continuation);
                    this.f107207r = bottomSheetGroupMviFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3204b(this.f107207r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3204b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f107206q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        BottomSheetGroupMviFragment bottomSheetGroupMviFragment = this.f107207r;
                        InterfaceC43160i<InterfaceC25670b> events = ((i) bottomSheetGroupMviFragment.f107194i0.getValue()).getEvents();
                        C3205a c3205a = new C3205a(bottomSheetGroupMviFragment);
                        this.f107206q = 1;
                        if (events.collect(c3205a, this) == coroutine_suspended) {
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
            public a(BottomSheetGroupMviFragment bottomSheetGroupMviFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107202r = bottomSheetGroupMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f107202r, continuation);
                aVar.f107201q = obj;
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
                T t12 = (T) this.f107201q;
                BottomSheetGroupMviFragment bottomSheetGroupMviFragment = this.f107202r;
                C43259k.d(t12, null, null, new C3202a(bottomSheetGroupMviFragment, null), 3);
                C43259k.d(t12, null, null, new C3204b(bottomSheetGroupMviFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return BottomSheetGroupMviFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107199q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BottomSheetGroupMviFragment bottomSheetGroupMviFragment = BottomSheetGroupMviFragment.this;
                a aVar = new a(bottomSheetGroupMviFragment, null);
                this.f107199q = 1;
                if (C23056p0.b(bottomSheetGroupMviFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f107210m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f107210m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(BottomSheetGroupMviFragment.this, this.f107210m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomSheetGroupMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f107212l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f107212l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f107212l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107213l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107213l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f107213l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107214l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f107214l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BottomSheetGroupMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/i;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, i> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final i invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            i.a aVar = BottomSheetGroupMviFragment.this.f107193h0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public BottomSheetGroupMviFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f107194i0 = new O0(m0.f406844a.b(i.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        BottomSheetGroupParameter bottomSheetGroupParameter = (BottomSheetGroupParameter) requireArguments().getParcelable("bottom_sheet_group_parameter");
        p.a aVarA = com.avito.android.bottom_sheet_group.di.r.a();
        aVarA.a((com.avito.android.bottom_sheet_group.di.b) C29972i.a(C29972i.b(this), com.avito.android.bottom_sheet_group.di.b.class));
        aVarA.c(new C28478k(BottomSheetGroupScreen.f90301d, s.b(this), null, 4, null));
        aVarA.d(bottomSheetGroupParameter);
        aVarA.b(getResources());
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f107195j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f107195j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        String title = ((BottomSheetGroupParameter) requireArguments().getParcelable("bottom_sheet_group_parameter")).getTitle();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), R.style.Re23_BottomSheet_Default);
        dVar.A(R.layout.bottom_sheet_group_list, R.layout.select_main_button);
        dVar.T();
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, title, true, true, 2);
        dVar.setCancelable(true);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new o(1));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f107195j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        View viewFindViewById = dVar.findViewById(R.id.bottom_sheet_group_container);
        com.avito.konveyor.adapter.h hVar = this.f107197l0;
        com.avito.konveyor.adapter.h hVar2 = hVar != null ? hVar : null;
        com.avito.konveyor.a aVar = this.f107196k0;
        this.f107198m0 = new com.avito.android.bottom_sheet_group.bottomsheetgroup.f(viewFindViewById, aVar != null ? aVar : null, hVar2, (Button) dVar.findViewById(R.id.main_button), (TextView) dVar.findViewById(R.id.bottom_sheet_action_button));
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f107195j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
