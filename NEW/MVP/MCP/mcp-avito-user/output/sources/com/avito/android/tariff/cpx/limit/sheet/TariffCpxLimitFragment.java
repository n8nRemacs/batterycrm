package com.avito.android.tariff.cpx.limit.sheet;

import Cd.C13243a;
import NB0.b;
import NB0.c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
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
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: TariffCpxLimitFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/TariffCpxLimitFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxLimitFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.limit.sheet.f f297227h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f297228i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f297229j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f297230k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f297231l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final C35968w3 f297232m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public TextView f297233n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public ComponentContainer f297234o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public Input f297235p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public ComponentContainer f297236q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public Input f297237r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public TextView f297238s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Button f297239t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Button f297240u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.tariff.cpx.limit.sheet.b f297241v0;

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f297226x0 = {m0.f406844a.e(new Y(TariffCpxLimitFragment.class, "content", "getContent()Lcom/avito/android/tariff/cpx/limit/sheet/domain/TariffCpxLimitContent;", 0))};

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f297225w0 = new a(null);

    /* compiled from: TariffCpxLimitFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/TariffCpxLimitFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxLimitFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/limit/sheet/TariffCpxLimitFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            Dialog dialog = TariffCpxLimitFragment.this.getDialog();
            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
            return (ViewGroup) (dVar != null ? dVar.u() : null);
        }
    }

    /* compiled from: TariffCpxLimitFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$onCreateDialog$1", f = "TariffCpxLimitFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f297243q;

        /* compiled from: TariffCpxLimitFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$onCreateDialog$1$1", f = "TariffCpxLimitFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f297245q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TariffCpxLimitFragment f297246r;

            /* compiled from: TariffCpxLimitFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$onCreateDialog$1$1$1", f = "TariffCpxLimitFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9063a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f297247q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxLimitFragment f297248r;

                /* compiled from: TariffCpxLimitFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNB0/c;", "it", "Lkotlin/G0;", "invoke", "(LNB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C9064a extends N implements Y41.l<NB0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ TariffCpxLimitFragment f297249l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C9064a(TariffCpxLimitFragment tariffCpxLimitFragment) {
                        super(1);
                        this.f297249l = tariffCpxLimitFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(NB0.c cVar) throws Resources.NotFoundException {
                        Integer num;
                        DeepLink deeplink;
                        Button button;
                        DeepLink deeplink2;
                        Button button2;
                        Input input;
                        int[] iArr;
                        NB0.c cVar2 = cVar;
                        a aVar = TariffCpxLimitFragment.f297225w0;
                        TariffCpxLimitFragment tariffCpxLimitFragment = this.f297249l;
                        com.avito.android.tariff.cpx.limit.sheet.a aVar2 = new com.avito.android.tariff.cpx.limit.sheet.a(1, tariffCpxLimitFragment.f5(), com.avito.android.tariff.cpx.limit.sheet.e.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        TextView textView = tariffCpxLimitFragment.f297233n0;
                        if (textView != null) {
                            com.avito.android.util.text.j.a(textView, cVar2.f11308b, null);
                        }
                        ComponentContainer componentContainer = tariffCpxLimitFragment.f297234o0;
                        c.b bVar = cVar2.f11309c;
                        if (componentContainer != null) {
                            componentContainer.setTitle(bVar != null ? bVar.f11322b : null);
                        }
                        Input input2 = tariffCpxLimitFragment.f297235p0;
                        if (input2 != null) {
                            if (cVar2.f11318l) {
                                Input.f179303W.getClass();
                                iArr = Input.f179305b0;
                            } else {
                                Input.f179303W.getClass();
                                iArr = Input.f179304a0;
                            }
                            input2.setState(iArr);
                        }
                        Input input3 = tariffCpxLimitFragment.f297237r0;
                        if (input3 != null) {
                            input3.setEnabled(false);
                        }
                        ComponentContainer componentContainer2 = tariffCpxLimitFragment.f297236q0;
                        c.C0724c c0724c = cVar2.f11311e;
                        if (componentContainer2 != null) {
                            componentContainer2.setTitle(c0724c != null ? c0724c.f11327e : null);
                        }
                        if (c0724c != null) {
                            Input input4 = tariffCpxLimitFragment.f297237r0;
                            FormatterType.f179288e.getClass();
                            FormatterType formatterTypeA = FormatterType.f179291h;
                            MaskParameters maskParameters = formatterTypeA.f179302d;
                            MaskParameters maskParametersA = maskParameters != null ? MaskParameters.a(maskParameters, null, null, 1887) : null;
                            if (c0724c.f11324b) {
                                formatterTypeA = FormatterType.a(formatterTypeA, maskParametersA);
                            }
                            if (input4 != null) {
                                input4.setFormatterType(formatterTypeA);
                            }
                        }
                        if ((c0724c != null ? c0724c.f11325c : null) != null) {
                            ComponentContainer componentContainer3 = tariffCpxLimitFragment.f297236q0;
                            if (componentContainer3 != null) {
                                D6.H(componentContainer3);
                            }
                            Input input5 = tariffCpxLimitFragment.f297237r0;
                            if (input5 != null) {
                                Input.t(input5, c0724c.f11326d, false, 6);
                            }
                        } else if (c0724c != null && (num = c0724c.f11323a) != null) {
                            int iIntValue = num.intValue();
                            Input input6 = tariffCpxLimitFragment.f297237r0;
                            if (input6 != null) {
                                FormatterType.f179288e.getClass();
                                input6.setFormatterType(FormatterType.f179291h);
                            }
                            ComponentContainer componentContainer4 = tariffCpxLimitFragment.f297236q0;
                            if (componentContainer4 != null) {
                                D6.H(componentContainer4);
                            }
                            if (iIntValue > 0) {
                                Input input7 = tariffCpxLimitFragment.f297237r0;
                                if (input7 != null) {
                                    Input.t(input7, String.valueOf(iIntValue), false, 6);
                                }
                            } else {
                                Input input8 = tariffCpxLimitFragment.f297237r0;
                                if (input8 != null) {
                                    Input.t(input8, "0", false, 6);
                                }
                            }
                        }
                        TextView textView2 = tariffCpxLimitFragment.f297238s0;
                        if (textView2 != null) {
                            com.avito.android.util.text.j.a(textView2, cVar2.f11312f, null);
                        }
                        Button button3 = tariffCpxLimitFragment.f297239t0;
                        ButtonAction buttonAction = cVar2.f11316j;
                        tariffCpxLimitFragment.g5(button3, buttonAction);
                        Button button4 = tariffCpxLimitFragment.f297240u0;
                        ButtonAction buttonAction2 = cVar2.f11317k;
                        tariffCpxLimitFragment.g5(button4, buttonAction2);
                        Button button5 = tariffCpxLimitFragment.f297239t0;
                        boolean z12 = cVar2.f11319m;
                        if (button5 != null) {
                            button5.setLoading(z12);
                        }
                        Button button6 = tariffCpxLimitFragment.f297240u0;
                        if (button6 != null) {
                            button6.setLoading(z12);
                        }
                        if (!cVar2.f11320n && (input = tariffCpxLimitFragment.f297235p0) != null) {
                            com.avito.android.tariff.cpx.limit.sheet.b bVar2 = tariffCpxLimitFragment.f297241v0;
                            if (bVar2 != null) {
                                input.h(bVar2);
                            }
                            input.v();
                            if (bVar != null) {
                                int iIntValue2 = bVar.f11321a.intValue();
                                Input input9 = tariffCpxLimitFragment.f297235p0;
                                if (input9 != null) {
                                    Input.t(input9, String.valueOf(iIntValue2), false, 6);
                                }
                            }
                            com.avito.android.tariff.cpx.limit.sheet.b bVar3 = new com.avito.android.tariff.cpx.limit.sheet.b(input, aVar2, cVar2);
                            input.b(bVar3);
                            tariffCpxLimitFragment.f297241v0 = bVar3;
                        }
                        if (buttonAction != null && (deeplink2 = buttonAction.getDeeplink()) != null && (button2 = tariffCpxLimitFragment.f297239t0) != null) {
                            button2.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(tariffCpxLimitFragment, deeplink2, cVar2, 18));
                        }
                        if (buttonAction2 != null && (deeplink = buttonAction2.getDeeplink()) != null && (button = tariffCpxLimitFragment.f297240u0) != null) {
                            button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(2, tariffCpxLimitFragment, deeplink));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9063a(TariffCpxLimitFragment tariffCpxLimitFragment, Continuation<? super C9063a> continuation) {
                    super(2, continuation);
                    this.f297248r = tariffCpxLimitFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C9063a(this.f297248r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9063a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f297247q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxLimitFragment.f297225w0;
                        TariffCpxLimitFragment tariffCpxLimitFragment = this.f297248r;
                        n2<NB0.c> state = tariffCpxLimitFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = tariffCpxLimitFragment.f297229j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9064a c9064a = new C9064a(tariffCpxLimitFragment);
                        this.f297247q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9064a, this) == coroutine_suspended) {
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

            /* compiled from: TariffCpxLimitFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$onCreateDialog$1$1$2", f = "TariffCpxLimitFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f297250q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxLimitFragment f297251r;

                /* compiled from: TariffCpxLimitFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9065a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCpxLimitFragment f297252b;

                    public C9065a(TariffCpxLimitFragment tariffCpxLimitFragment) {
                        this.f297252b = tariffCpxLimitFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar;
                        NB0.b bVar = (NB0.b) obj;
                        a aVar2 = TariffCpxLimitFragment.f297225w0;
                        TariffCpxLimitFragment tariffCpxLimitFragment = this.f297252b;
                        if (bVar instanceof b.a) {
                            tariffCpxLimitFragment.dismiss();
                        } else {
                            if (bVar instanceof b.f) {
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                ((b.f) bVar).getClass();
                                throw null;
                            }
                            if (bVar instanceof b.c) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = tariffCpxLimitFragment.f297231l0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b.a.a(aVar3, ((b.c) bVar).f11301a, "cpx_limits_request_key", null, 4);
                            } else if (bVar instanceof b.e) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar4 = tariffCpxLimitFragment.f297231l0;
                                aVar = aVar4 != null ? aVar4 : null;
                                b.e eVar = (b.e) bVar;
                                DeepLink deepLink = eVar.f11304a;
                                Bundle bundle = new Bundle();
                                bundle.putInt("key_cpx_configure_limit", eVar.f11305b);
                                bundle.putBoolean("key_cpx_configure_limit_is_change", false);
                                G0 g02 = G0.f406611a;
                                aVar.r6(bundle, deepLink, "cpx_limits_request_key");
                            } else if (bVar instanceof b.d) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar5 = tariffCpxLimitFragment.f297231l0;
                                aVar = aVar5 != null ? aVar5 : null;
                                b.d dVar = (b.d) bVar;
                                DeepLink deepLink2 = dVar.f11302a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("key_cpx_configure_limit", dVar.f11303b);
                                bundle2.putBoolean("key_cpx_configure_limit_is_change", true);
                                G0 g03 = G0.f406611a;
                                aVar.r6(bundle2, deepLink2, "cpx_limits_request_key");
                            } else if (bVar instanceof b.C0723b) {
                                String tag = tariffCpxLimitFragment.getTag();
                                if (tag == null) {
                                    tag = "";
                                }
                                tariffCpxLimitFragment.getParentFragmentManager().o0(((b.C0723b) bVar).f11300a, tag);
                                tariffCpxLimitFragment.dismiss();
                            }
                        }
                        G0 g04 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g04;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f297252b, TariffCpxLimitFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TariffCpxLimitFragment tariffCpxLimitFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f297251r = tariffCpxLimitFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f297251r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f297250q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxLimitFragment.f297225w0;
                        TariffCpxLimitFragment tariffCpxLimitFragment = this.f297251r;
                        InterfaceC43160i<NB0.b> events = tariffCpxLimitFragment.f5().getEvents();
                        C9065a c9065a = new C9065a(tariffCpxLimitFragment);
                        this.f297250q = 1;
                        if (events.collect(c9065a, this) == coroutine_suspended) {
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
            public a(TariffCpxLimitFragment tariffCpxLimitFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f297246r = tariffCpxLimitFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f297246r, continuation);
                aVar.f297245q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f297245q;
                TariffCpxLimitFragment tariffCpxLimitFragment = this.f297246r;
                C43259k.d(t12, null, null, new C9063a(tariffCpxLimitFragment, null), 3);
                C43259k.d(t12, null, null, new b(tariffCpxLimitFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return TariffCpxLimitFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f297243q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TariffCpxLimitFragment tariffCpxLimitFragment = TariffCpxLimitFragment.this;
                a aVar = new a(tariffCpxLimitFragment, null);
                this.f297243q = 1;
                if (C23056p0.b(tariffCpxLimitFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TariffCpxLimitFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TariffCpxLimitFragment tariffCpxLimitFragment = (TariffCpxLimitFragment) this.receiver;
            a aVar = TariffCpxLimitFragment.f297225w0;
            tariffCpxLimitFragment.getClass();
            tariffCpxLimitFragment.f297233n0 = (TextView) view2.findViewById(R.id.tariff_cpx_limit_title);
            tariffCpxLimitFragment.f297234o0 = (ComponentContainer) view2.findViewById(R.id.tariff_cpx_limit_input_container);
            tariffCpxLimitFragment.f297235p0 = (Input) view2.findViewById(R.id.tariff_cpx_limit_input);
            tariffCpxLimitFragment.f297236q0 = (ComponentContainer) view2.findViewById(R.id.tariff_cpx_limit_remains_container);
            tariffCpxLimitFragment.f297237r0 = (Input) view2.findViewById(R.id.tariff_cpx_limit_remains);
            tariffCpxLimitFragment.f297238s0 = (TextView) view2.findViewById(R.id.tariff_cpx_limit_hint);
            tariffCpxLimitFragment.f297239t0 = (Button) view2.findViewById(R.id.tariff_cpx_limit_primary_button);
            tariffCpxLimitFragment.f297240u0 = (Button) view2.findViewById(R.id.tariff_cpx_limit_secondary_button);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f297253l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f297253l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f297253l);
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
            return TariffCpxLimitFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f297255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f297255l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f297255l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297256l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297256l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f297256l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297257l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297257l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f297257l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxLimitFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/limit/sheet/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff.cpx.limit.sheet.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.limit.sheet.e invoke() {
            com.avito.android.tariff.cpx.limit.sheet.f fVar = TariffCpxLimitFragment.this.f297227h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff.cpx.limit.sheet.e) fVar.get();
        }
    }

    public TariffCpxLimitFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f297228i0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.limit.sheet.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f297232m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 18);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.i c5() {
        return new b(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpx.limit.sheet.di.a.a().a(s.b(this), (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), (TariffCpxLimitContent) this.f297232m0.getValue(this, f297226x0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f297229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.tariff.cpx.limit.sheet.e f5() {
        return (com.avito.android.tariff.cpx.limit.sheet.e) this.f297228i0.getValue();
    }

    public final void g5(Button button, ButtonAction buttonAction) throws Resources.NotFoundException {
        Dialog dialog;
        Context context;
        Integer numA;
        if (buttonAction != null) {
            if (button != null) {
                D6.H(button);
            }
            if (button != null) {
                com.avito.android.lib.design.button.b.a(button, buttonAction.getTitle(), false);
            }
            if (button != null) {
                Boolean boolIsEnabled = buttonAction.isEnabled();
                button.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
            }
            String style = buttonAction.getStyle();
            if (style == null || (dialog = getDialog()) == null || (context = dialog.getContext()) == null || (numA = com.avito.android.mnz_common.extensions.c.a(context, style)) == null) {
                return;
            }
            int iIntValue = numA.intValue();
            if (button != null) {
                button.setAppearance(iIntValue);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f297229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.tariff_cpx_limits_fragment, true, new d(1, this, TariffCpxLimitFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 4);
        dVar.J(true);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f297229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
