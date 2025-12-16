package com.avito.android.guests_selector;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
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
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.guests_selector.io.GuestsSelectorAvailableAge;
import com.avito.android.guests_selector.io.GuestsSelectorChild;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import gI.InterfaceC40585a;
import gI.InterfaceC40586b;
import hI.C40827a;
import hI.C40828b;
import hI.C40829c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: GuestsSelectorDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GuestsSelectorDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public r f161342h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f161343i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f161344j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f161345k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.guests_selector.j f161346l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f161347m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public o f161348n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public N f161349o0;

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f161341q0 = {m0.f406844a.e(new Y(GuestsSelectorDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/guests_selector/GuestsSelectorOpenParams;", 0))};

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final a f161340p0 = new a(null);

    /* compiled from: GuestsSelectorDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDialogFragment$a;", "", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.k
        public static GuestsSelectorDialogFragment a(@Y61.l GuestsSelectorInput guestsSelectorInput, @Y61.l Y41.l lVar) {
            String theme;
            List<GuestsSelectorAvailableAge> listC;
            List<GuestsSelectorChild> listF;
            List list;
            Boolean boolK;
            String strD;
            Integer numE;
            Integer numH;
            Integer numG;
            Integer numI;
            Integer numJ;
            GuestsSelectorDialogFragment guestsSelectorDialogFragment = new GuestsSelectorDialogFragment();
            if (guestsSelectorInput == null || (theme = guestsSelectorInput.getTheme()) == null) {
                theme = "avitoRe23";
            }
            String str = theme;
            boolean zBooleanValue = true;
            int iIntValue = (guestsSelectorInput == null || (numJ = guestsSelectorInput.getMinGuests()) == null) ? 1 : numJ.intValue();
            int iIntValue2 = Integer.MAX_VALUE;
            int iIntValue3 = (guestsSelectorInput == null || (numI = guestsSelectorInput.getMaxGuests()) == null) ? Integer.MAX_VALUE : numI.intValue();
            int iIntValue4 = (guestsSelectorInput == null || (numG = guestsSelectorInput.getMaxAdultCount()) == null) ? Integer.MAX_VALUE : numG.intValue();
            if (guestsSelectorInput != null && (numH = guestsSelectorInput.getMaxChildrenCount()) != null) {
                iIntValue2 = numH.intValue();
            }
            int i12 = iIntValue2;
            if (guestsSelectorInput == null || (listC = guestsSelectorInput.c()) == null) {
                com.avito.android.guests_selector.a.f161388a.getClass();
                listC = com.avito.android.guests_selector.a.f161389b;
            }
            List<GuestsSelectorAvailableAge> list2 = listC;
            int iIntValue5 = (guestsSelectorInput == null || (numE = guestsSelectorInput.getInitialAdultGuests()) == null) ? 2 : numE.intValue();
            if (guestsSelectorInput == null || (listF = guestsSelectorInput.f()) == null) {
                listF = C42784z0.f406748b;
            }
            List<GuestsSelectorChild> list3 = listF;
            PrintableText printableTextF = (guestsSelectorInput == null || (strD = guestsSelectorInput.getButtonTitle()) == null) ? null : com.avito.android.printable_text.b.f(strD);
            if (guestsSelectorInput != null && (boolK = guestsSelectorInput.getWithChildren()) != null) {
                zBooleanValue = boolK.booleanValue();
            }
            boolean z12 = zBooleanValue;
            if (guestsSelectorInput == null || (list = guestsSelectorInput.f161447b) == null) {
                list = C42784z0.f406748b;
            }
            guestsSelectorDialogFragment.f161347m0.setValue(guestsSelectorDialogFragment, GuestsSelectorDialogFragment.f161341q0[0], new GuestsSelectorOpenParams(str, iIntValue, iIntValue3, iIntValue4, i12, list2, iIntValue5, list3, printableTextF, z12, list));
            guestsSelectorDialogFragment.f161349o0 = (N) lVar;
            return guestsSelectorDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: GuestsSelectorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgI/a;", "action", "Lkotlin/G0;", "invoke", "(LgI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC40585a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40585a interfaceC40585a) {
            ((q) GuestsSelectorDialogFragment.this.f161343i0.getValue()).accept(interfaceC40585a);
            return G0.f406611a;
        }
    }

    /* compiled from: GuestsSelectorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.guests_selector.GuestsSelectorDialogFragment$onCreateDialog$2$2", f = "GuestsSelectorDialogFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f161351q;

        /* compiled from: GuestsSelectorDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.guests_selector.GuestsSelectorDialogFragment$onCreateDialog$2$2$1", f = "GuestsSelectorDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f161353q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ GuestsSelectorDialogFragment f161354r;

            /* compiled from: GuestsSelectorDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.guests_selector.GuestsSelectorDialogFragment$onCreateDialog$2$2$1$1", f = "GuestsSelectorDialogFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.guests_selector.GuestsSelectorDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C4723a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f161355q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GuestsSelectorDialogFragment f161356r;

                /* compiled from: GuestsSelectorDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.guests_selector.GuestsSelectorDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4724a extends H implements Y41.l<C40827a, G0> {
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
                    public final void f(@Y61.k C40827a c40827a) {
                        o oVar = ((GuestsSelectorDialogFragment) this.receiver).f161348n0;
                        if (oVar != null) {
                            C40828b c40828b = c40827a.f397144m;
                            PrintableText printableText = c40828b.f397146b;
                            Context context = oVar.f161577c;
                            I5.a(oVar.f161578d, printableText.k0(context), false);
                            C40829c c40829c = oVar.f161583i;
                            C40829c c40829c2 = c40828b.f397148d;
                            boolean zEquals = c40829c2.equals(c40829c);
                            Picker picker = oVar.f161581g;
                            if (!zEquals) {
                                picker.e();
                                picker.f();
                                ?? r12 = c40829c2.f397150a;
                                ArrayList arrayList = new ArrayList(r12.size());
                                for (Map.Entry entry : r12.entrySet()) {
                                    arrayList.add(new com.avito.android.lib.design.picker.k((String) entry.getKey(), ((PrintableText) entry.getValue()).k0(context)));
                                }
                                if (!arrayList.isEmpty()) {
                                    Picker.d(picker, arrayList, oVar.f161582h, 12);
                                    picker.b(new p(oVar));
                                    oVar.f161583i = c40829c2;
                                }
                            }
                            int iOrdinal = c40828b.f397145a.ordinal();
                            RecyclerView recyclerView = oVar.f161580f;
                            TextView textView = oVar.f161579e;
                            if (iOrdinal == 0) {
                                D6.w(picker);
                                D6.H(recyclerView);
                                PrintableText printableText2 = c40828b.f397147c;
                                if (printableText2 != null) {
                                    I5.a(textView, printableText2.k0(context), false);
                                    D6.H(textView);
                                }
                            } else if (iOrdinal == 1) {
                                D6.w(recyclerView);
                                D6.H(picker);
                                D6.w(textView);
                            }
                            oVar.f161575a.l(c40828b.f397149e, null);
                        }
                    }

                    @Override // Y41.l
                    public final /* bridge */ /* synthetic */ G0 invoke(C40827a c40827a) {
                        f(c40827a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4723a(GuestsSelectorDialogFragment guestsSelectorDialogFragment, Continuation<? super C4723a> continuation) {
                    super(2, continuation);
                    this.f161356r = guestsSelectorDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4723a(this.f161356r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4723a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f161355q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        GuestsSelectorDialogFragment guestsSelectorDialogFragment = this.f161356r;
                        n2<C40827a> state = ((q) guestsSelectorDialogFragment.f161343i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = guestsSelectorDialogFragment.f161344j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C4724a c4724a = new C4724a(1, guestsSelectorDialogFragment, GuestsSelectorDialogFragment.class, "render", "render(Lcom/avito/android/guests_selector/mvi/entity/state/GuestsSelectorState;)V", 0);
                        this.f161355q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c4724a, this) == coroutine_suspended) {
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

            /* compiled from: GuestsSelectorDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.guests_selector.GuestsSelectorDialogFragment$onCreateDialog$2$2$1$2", f = "GuestsSelectorDialogFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f161357q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ GuestsSelectorDialogFragment f161358r;

                /* compiled from: GuestsSelectorDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.guests_selector.GuestsSelectorDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C4725a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ GuestsSelectorDialogFragment f161359b;

                    public C4725a(GuestsSelectorDialogFragment guestsSelectorDialogFragment) {
                        this.f161359b = guestsSelectorDialogFragment;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Dialog dialog;
                        InterfaceC40586b interfaceC40586b = (InterfaceC40586b) obj;
                        a aVar = GuestsSelectorDialogFragment.f161340p0;
                        GuestsSelectorDialogFragment guestsSelectorDialogFragment = this.f161359b;
                        if (interfaceC40586b instanceof InterfaceC40586b.C11204b) {
                            ?? r02 = guestsSelectorDialogFragment.f161349o0;
                            if (r02 != 0) {
                                r02.invoke(((InterfaceC40586b.C11204b) interfaceC40586b).f396430a);
                            }
                            guestsSelectorDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("GUESTS_PICKER_DIALOG_RESULT_KEY", ((InterfaceC40586b.C11204b) interfaceC40586b).f396430a)), "GUESTS_PICKER_DIALOG_REQUEST_KEY");
                        } else if ((interfaceC40586b instanceof InterfaceC40586b.a) && (dialog = guestsSelectorDialogFragment.getDialog()) != null) {
                            dialog.dismiss();
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
                        return new C42801a(2, this.f161359b, GuestsSelectorDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(GuestsSelectorDialogFragment guestsSelectorDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f161358r = guestsSelectorDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f161358r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f161357q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        GuestsSelectorDialogFragment guestsSelectorDialogFragment = this.f161358r;
                        InterfaceC43160i<InterfaceC40586b> events = ((q) guestsSelectorDialogFragment.f161343i0.getValue()).getEvents();
                        C4725a c4725a = new C4725a(guestsSelectorDialogFragment);
                        this.f161357q = 1;
                        if (events.collect(c4725a, this) == coroutine_suspended) {
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
            public a(GuestsSelectorDialogFragment guestsSelectorDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f161354r = guestsSelectorDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f161354r, continuation);
                aVar.f161353q = obj;
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
                T t12 = (T) this.f161353q;
                GuestsSelectorDialogFragment guestsSelectorDialogFragment = this.f161354r;
                C43259k.d(t12, null, null, new C4723a(guestsSelectorDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(guestsSelectorDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return GuestsSelectorDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f161351q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                GuestsSelectorDialogFragment guestsSelectorDialogFragment = GuestsSelectorDialogFragment.this;
                a aVar = new a(guestsSelectorDialogFragment, null);
                this.f161351q = 1;
                if (C23056p0.b(guestsSelectorDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: GuestsSelectorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgI/a;", "action", "Lkotlin/G0;", "invoke", "(LgI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC40585a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40585a interfaceC40585a) {
            ((q) GuestsSelectorDialogFragment.this.f161343i0.getValue()).accept(interfaceC40585a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f161361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f161361l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f161361l);
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
            return GuestsSelectorDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f161363l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f161363l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f161363l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f161364l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f161364l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f161364l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f161365l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f161365l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f161365l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: GuestsSelectorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/guests_selector/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/guests_selector/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<q> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = GuestsSelectorDialogFragment.this.f161342h0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public GuestsSelectorDialogFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f161343i0 = new O0(m0.f406844a.b(q.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f161347m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.guests_selector.di.a.a().a(com.avito.android.analytics.screens.s.b(this), (GuestsSelectorOpenParams) this.f161347m0.getValue(this, f161341q0[0]), new d(), (com.avito.android.guests_selector.di.l) C29972i.a(C29972i.b(this), com.avito.android.guests_selector.di.l.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f161344j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f161344j0;
        Object[] objArr = 0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        kotlin.reflect.n<Object>[] nVarArr = f161341q0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f161347m0;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, ((GuestsSelectorOpenParams) c35968w3.getValue(this, nVar)).f161367b));
        View viewInflate = View.inflate(dVar, R.layout.guests_picker_dialog_fragment, null);
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(dVar, 0, 2, objArr == true ? 1 : 0);
        dVar2.G(viewInflate, true);
        dVar2.T();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        com.avito.konveyor.adapter.d dVar3 = this.f161345k0;
        com.avito.konveyor.adapter.d dVar4 = dVar3 != null ? dVar3 : null;
        b bVar = new b();
        GuestsSelectorOpenParams guestsSelectorOpenParams = (GuestsSelectorOpenParams) c35968w3.getValue(this, nVarArr[0]);
        com.avito.android.guests_selector.j jVar = this.f161346l0;
        this.f161348n0 = new o(viewInflate, dVar4, bVar, guestsSelectorOpenParams.f161375j, jVar != null ? jVar : null);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f161344j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar2;
    }
}
