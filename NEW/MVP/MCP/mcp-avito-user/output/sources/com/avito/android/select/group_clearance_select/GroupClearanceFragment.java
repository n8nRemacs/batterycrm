package com.avito.android.select.group_clearance_select;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.GroupClearanceBottomSheetScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.group_clearance_select.b;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import cq0.C39399c;
import cq0.InterfaceC39397a;
import cq0.InterfaceC39398b;
import dagger.internal.t;
import dagger.internal.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import okhttp3.internal.ws.WebSocketProtocol;
import z1.AbstractC50339a;

/* compiled from: GroupClearanceFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/group_clearance_select/GroupClearanceFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GroupClearanceFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public u f265419h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f265420i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f265421j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f265422k0;

    /* renamed from: l0, reason: collision with root package name */
    public n f265423l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.inline_filters.dialog.k f265424m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265425n0;

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f265418p0 = {m0.f406844a.e(new Y(GroupClearanceFragment.class, "openParams", "getOpenParams()Lcom/avito/android/select/group_clearance_select/GroupClearanceParams;", 0))};

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f265417o0 = new a(null);

    /* compiled from: GroupClearanceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/group_clearance_select/GroupClearanceFragment$a;", "", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GroupClearanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            a aVar = GroupClearanceFragment.f265417o0;
            GroupClearanceFragment groupClearanceFragment = GroupClearanceFragment.this;
            String str = groupClearanceFragment.f5().f265444c;
            return str == null ? com.avito.android.printable_text.b.c(R.string.clearance_title, new Serializable[0]).k0(groupClearanceFragment.requireContext()) : str;
        }
    }

    /* compiled from: GroupClearanceFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC39397a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39397a interfaceC39397a) {
            ((p) this.receiver).accept(interfaceC39397a);
            return G0.f406611a;
        }
    }

    /* compiled from: GroupClearanceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.group_clearance_select.GroupClearanceFragment$onCreateView$1", f = "GroupClearanceFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f265427q;

        /* compiled from: GroupClearanceFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.select.group_clearance_select.GroupClearanceFragment$onCreateView$1$1", f = "GroupClearanceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f265429q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ GroupClearanceFragment f265430r;

            /* compiled from: GroupClearanceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.select.group_clearance_select.GroupClearanceFragment$onCreateView$1$1$1", f = "GroupClearanceFragment.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.select.group_clearance_select.GroupClearanceFragment$d$a$a, reason: collision with other inner class name */
            public static final class C7924a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f265431q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GroupClearanceFragment f265432r;

                /* compiled from: GroupClearanceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.select.group_clearance_select.GroupClearanceFragment$d$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7925a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f265433b;

                    public C7925a(n nVar) {
                        this.f265433b = nVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C39399c c39399c = (C39399c) obj;
                        n nVar = this.f265433b;
                        nVar.getClass();
                        ChipsState.DisplayType displayType = ChipsState.DisplayType.f178759e;
                        Iterable iterable = (Iterable) c39399c.f392967c;
                        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i12 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            com.avito.android.select.group_clearance_select.a aVar = c39399c.f392966b;
                            if (!zHasNext) {
                                nVar.f265533b.setState(new ChipsState(0, displayType, null, arrayList, new m(nVar), 5, null));
                                String f265480c = aVar != null ? aVar.getF265480c() : null;
                                String f265482e = aVar != null ? aVar.getF265482e() : null;
                                I5.a(nVar.f265534c, f265480c, false);
                                I5.a(nVar.f265535d, f265482e, false);
                                com.avito.android.select.group_clearance_select.j jVar = new com.avito.android.select.group_clearance_select.j(nVar, 1);
                                TextView textView = nVar.f265536e;
                                textView.setOnClickListener(jVar);
                                boolean z12 = c39399c.f392968d;
                                textView.setClickable(z12);
                                if (z12) {
                                    textView.setTextColor(nVar.f265537f);
                                } else {
                                    textView.setTextColor(nVar.f265538g);
                                }
                                boolean z13 = nVar.f265542k;
                                float f12 = c39399c.f392969e;
                                if (z13) {
                                    nVar.f265543l = new l(nVar, c39399c);
                                } else {
                                    nVar.a((-25) * f12);
                                }
                                if (c39399c.f392970f) {
                                    float f13 = f12 * (-25);
                                    if (!nVar.f265542k) {
                                        C1.f318564a.getClass();
                                        if (C1.a()) {
                                            nVar.f265540i.post(new com.avito.android.lib.design.master_plan_view.a(f13, 1, nVar));
                                        }
                                    }
                                }
                                G0 g02 = G0.f406611a;
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                return g02;
                            }
                            Object next = it.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            com.avito.android.select.group_clearance_select.a aVar2 = (com.avito.android.select.group_clearance_select.a) next;
                            arrayList.add(new ItemChipable(i12, null, null, null, L.f(aVar2, aVar), null, aVar2.getF265481d(), false, false, 430, null));
                            i12 = i13;
                        }
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
                        return new C42801a(2, this.f265433b, com.avito.android.select.group_clearance_select.i.class, "renderState", "renderState(Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7924a(GroupClearanceFragment groupClearanceFragment, Continuation<? super C7924a> continuation) {
                    super(2, continuation);
                    this.f265432r = groupClearanceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7924a(this.f265432r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7924a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f265431q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = GroupClearanceFragment.f265417o0;
                        GroupClearanceFragment groupClearanceFragment = this.f265432r;
                        n2<C39399c> state = ((p) groupClearanceFragment.f265420i0.getValue()).getState();
                        n nVar = groupClearanceFragment.f265423l0;
                        if (nVar == null) {
                            nVar = null;
                        }
                        C7925a c7925a = new C7925a(nVar);
                        this.f265431q = 1;
                        if (state.collect(c7925a, this) == coroutine_suspended) {
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

            /* compiled from: GroupClearanceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.select.group_clearance_select.GroupClearanceFragment$onCreateView$1$1$2", f = "GroupClearanceFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f265434q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GroupClearanceFragment f265435r;

                /* compiled from: GroupClearanceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.select.group_clearance_select.GroupClearanceFragment$d$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7926a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GroupClearanceFragment f265436b;

                    public C7926a(GroupClearanceFragment groupClearanceFragment) {
                        this.f265436b = groupClearanceFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC39398b interfaceC39398b = (InterfaceC39398b) obj;
                        a aVar = GroupClearanceFragment.f265417o0;
                        GroupClearanceFragment groupClearanceFragment = this.f265436b;
                        if (interfaceC39398b instanceof InterfaceC39398b.C10992b) {
                            if (groupClearanceFragment.f5().f265448g != null && groupClearanceFragment.f5().f265449h != null) {
                                InterfaceC23487e targetFragment = groupClearanceFragment.getTargetFragment();
                                com.avito.android.select.group_clearance_select.f fVar = targetFragment instanceof com.avito.android.select.group_clearance_select.f ? (com.avito.android.select.group_clearance_select.f) targetFragment : null;
                                if (fVar != null) {
                                    fVar.n(groupClearanceFragment.f5().f265448g, groupClearanceFragment.f5().f265449h);
                                }
                            }
                            InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = new InlineFilterValue.InlineFilterNumericRangeValue(null, null);
                            com.avito.android.inline_filters.dialog.k kVar = groupClearanceFragment.f265424m0;
                            if (kVar != null) {
                                kVar.a(inlineFilterNumericRangeValue);
                            }
                            com.avito.android.inline_filters.dialog.k kVar2 = groupClearanceFragment.f265424m0;
                            if (kVar2 != null) {
                                kVar2.onDialogClose();
                            }
                            groupClearanceFragment.dismissAllowingStateLoss();
                        } else if (interfaceC39398b instanceof InterfaceC39398b.a) {
                            com.avito.android.inline_filters.dialog.k kVar3 = groupClearanceFragment.f265424m0;
                            if (kVar3 != null) {
                                kVar3.onDialogClose();
                            }
                            groupClearanceFragment.dismissAllowingStateLoss();
                        } else if (interfaceC39398b instanceof InterfaceC39398b.c) {
                            ?? r92 = ((InterfaceC39398b.c) interfaceC39398b).f392963a;
                            if (groupClearanceFragment.f5().f265448g != null && groupClearanceFragment.f5().f265449h != null) {
                                InterfaceC23487e targetFragment2 = groupClearanceFragment.getTargetFragment();
                                com.avito.android.select.group_clearance_select.f fVar2 = targetFragment2 instanceof com.avito.android.select.group_clearance_select.f ? (com.avito.android.select.group_clearance_select.f) targetFragment2 : null;
                                if (fVar2 != 0) {
                                    GroupClearanceParams groupClearanceParamsF5 = groupClearanceFragment.f5();
                                    GroupClearanceParams groupClearanceParamsF52 = groupClearanceFragment.f5();
                                    String str = groupClearanceFragment.f5().f265443b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    fVar2.l(groupClearanceParamsF5.f265448g, groupClearanceParamsF52.f265449h, str, (String) groupClearanceFragment.f265425n0.getValue(), r92);
                                }
                            }
                            InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue2 = new InlineFilterValue.InlineFilterNumericRangeValue((Long) r92.get(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME), (Long) r92.get(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME));
                            com.avito.android.inline_filters.dialog.k kVar4 = groupClearanceFragment.f265424m0;
                            if (kVar4 != null) {
                                kVar4.a(inlineFilterNumericRangeValue2);
                            }
                            groupClearanceFragment.dismissAllowingStateLoss();
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
                        return new C42801a(2, this.f265436b, GroupClearanceFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(GroupClearanceFragment groupClearanceFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f265435r = groupClearanceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f265435r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f265434q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = GroupClearanceFragment.f265417o0;
                        GroupClearanceFragment groupClearanceFragment = this.f265435r;
                        InterfaceC43160i<InterfaceC39398b> events = ((p) groupClearanceFragment.f265420i0.getValue()).getEvents();
                        C7926a c7926a = new C7926a(groupClearanceFragment);
                        this.f265434q = 1;
                        if (events.collect(c7926a, this) == coroutine_suspended) {
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
            public a(GroupClearanceFragment groupClearanceFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f265430r = groupClearanceFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f265430r, continuation);
                aVar.f265429q = obj;
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
                T t12 = (T) this.f265429q;
                GroupClearanceFragment groupClearanceFragment = this.f265430r;
                C43259k.d(t12, null, null, new C7924a(groupClearanceFragment, null), 3);
                C43259k.d(t12, null, null, new b(groupClearanceFragment, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return GroupClearanceFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f265427q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                GroupClearanceFragment groupClearanceFragment = GroupClearanceFragment.this;
                a aVar = new a(groupClearanceFragment, null);
                this.f265427q = 1;
                if (C23056p0.b(groupClearanceFragment, state, aVar, this) == coroutine_suspended) {
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
        public final /* synthetic */ Y41.a f265437l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f265437l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f265437l);
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
            return GroupClearanceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f265439l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f265439l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f265439l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265440l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f265440l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265441l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265441l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f265441l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: GroupClearanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/select/group_clearance_select/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/select/group_clearance_select/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<p> {
        public j() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final p invoke() {
            u uVar = GroupClearanceFragment.this.f265419h0;
            if (uVar == null) {
                uVar = null;
            }
            return (p) uVar.get();
        }
    }

    public GroupClearanceFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f265420i0 = new O0(m0.f406844a.b(p.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f265422k0 = new C35968w3(this);
        this.f265425n0 = C42727D.c(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.C7928b c7928b = new b.C7928b();
        c7928b.f265487c = (InterfaceC23653b) C29972i.a(C29972i.b(this), InterfaceC23653b.class);
        c7928b.f265486b = f5();
        c7928b.f265485a = new C28478k(GroupClearanceBottomSheetScreen.f90367d, s.b(this), null, 4, null);
        t.a(GroupClearanceParams.class, c7928b.f265486b);
        t.a(InterfaceC23653b.class, c7928b.f265487c);
        b.c cVar = new b.c(c7928b.f265487c, c7928b.f265485a, c7928b.f265486b, null);
        this.f265419h0 = cVar.f265494g;
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f265493f.get();
        this.f265421j0 = screenPerformanceTracker;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final GroupClearanceParams f5() {
        return (GroupClearanceParams) this.f265422k0.getValue(this, f265418p0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        requireActivity().setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f265421j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.A(R.layout.auto_group_clearance_bottom_sheet, R.layout.select_main_button);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, (String) this.f265425n0.getValue(), true, true, 2);
        dVar.K(true);
        dVar.J(true);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f265421j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        this.f265423l0 = new n((ViewGroup) dVar.findViewById(R.id.bottom_sheet), (Button) dVar.findViewById(R.id.main_button), new c(1, (p) this.f265420i0.getValue(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        requireActivity().setRequestedOrientation(-1);
        super.onDetach();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.inline_filters.dialog.k kVar = this.f265424m0;
        if (kVar != null) {
            kVar.onDialogClose();
        }
    }
}
