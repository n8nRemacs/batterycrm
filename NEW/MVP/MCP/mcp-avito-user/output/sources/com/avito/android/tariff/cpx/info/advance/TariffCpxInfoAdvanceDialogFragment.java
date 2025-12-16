package com.avito.android.tariff.cpx.info.advance;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import tB0.C48533d;
import tB0.InterfaceC48532c;
import z1.AbstractC50339a;

/* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/TariffCpxInfoAdvanceDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxInfoAdvanceDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f296263n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f296264h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f296265i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.info.advance.f f296266j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final O0 f296267k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f296268l0;

    /* renamed from: m0, reason: collision with root package name */
    public Button f296269m0;

    /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/TariffCpxInfoAdvanceDialogFragment$a;", "", "<init>", "()V", "", "KEY_CONTENT", "Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/info/advance/TariffCpxInfoAdvanceDialogFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
            Dialog dialog = TariffCpxInfoAdvanceDialogFragment.this.getDialog();
            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
            KeyEvent.Callback callbackU = dVar != null ? dVar.u() : null;
            ViewGroup viewGroup = callbackU instanceof ViewGroup ? (ViewGroup) callbackU : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$onCreateDialog$1", f = "TariffCpxInfoAdvanceDialogFragment.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f296271q;

        /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$onCreateDialog$1$1", f = "TariffCpxInfoAdvanceDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f296273q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296274r;

            /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$onCreateDialog$1$1$1", f = "TariffCpxInfoAdvanceDialogFragment.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C9014a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f296275q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296276r;

                /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C9015a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296277b;

                    public C9015a(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment) {
                        this.f296277b = tariffCpxInfoAdvanceDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C48533d c48533d = (C48533d) obj;
                        TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = this.f296277b;
                        TextView textView = tariffCpxInfoAdvanceDialogFragment.f296268l0;
                        if (textView == null) {
                            textView = null;
                        }
                        com.avito.android.util.text.j.c(textView, c48533d.f439197a, null);
                        Button button = tariffCpxInfoAdvanceDialogFragment.f296269m0;
                        if (button == null) {
                            button = null;
                        }
                        ButtonAction buttonAction = c48533d.f439198b;
                        button.setText(buttonAction.getTitle());
                        Button button2 = tariffCpxInfoAdvanceDialogFragment.f296269m0;
                        Button button3 = button2 != null ? button2 : null;
                        Boolean boolIsEnabled = buttonAction.isEnabled();
                        button3.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
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
                        return new C42801a(2, this.f296277b, TariffCpxInfoAdvanceDialogFragment.class, "render", "render(Lcom/avito/android/tariff/cpx/info/advance/mvi/entity/TariffCpxInfoAdvanceState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9014a(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment, Continuation<? super C9014a> continuation) {
                    super(2, continuation);
                    this.f296276r = tariffCpxInfoAdvanceDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C9014a(this.f296276r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9014a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f296275q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
                        TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = this.f296276r;
                        n2<C48533d> state = ((com.avito.android.tariff.cpx.info.advance.e) tariffCpxInfoAdvanceDialogFragment.f296267k0.getValue()).getState();
                        C9015a c9015a = new C9015a(tariffCpxInfoAdvanceDialogFragment);
                        this.f296275q = 1;
                        if (state.collect(c9015a, this) == coroutine_suspended) {
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

            /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$onCreateDialog$1$1$2", f = "TariffCpxInfoAdvanceDialogFragment.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f296278q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296279r;

                /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9016a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296280b;

                    public C9016a(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment) {
                        this.f296280b = tariffCpxInfoAdvanceDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC48532c interfaceC48532c = (InterfaceC48532c) obj;
                        a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
                        TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = this.f296280b;
                        if (interfaceC48532c instanceof InterfaceC48532c.b) {
                            InterfaceC48532c.b bVar = (InterfaceC48532c.b) interfaceC48532c;
                            DeepLink deepLink = bVar.f439193a;
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCpxInfoAdvanceDialogFragment.f296264h0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            aVar2.r6(C22777e.b(new Q("tariff_cpx_info_key_advance_value", bVar.f439194b)), deepLink, "tariff_cpx_info_advance_deeplink_request_key");
                        } else if (interfaceC48532c instanceof InterfaceC48532c.a) {
                            String tag = tariffCpxInfoAdvanceDialogFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            tariffCpxInfoAdvanceDialogFragment.getParentFragmentManager().o0(((InterfaceC48532c.a) interfaceC48532c).f439192a, tag);
                            tariffCpxInfoAdvanceDialogFragment.dismiss();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
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
                        return new C42801a(2, this.f296280b, TariffCpxInfoAdvanceDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/info/advance/mvi/entity/TariffCpxInfoAdvanceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f296279r = tariffCpxInfoAdvanceDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f296279r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f296278q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
                        TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = this.f296279r;
                        InterfaceC43160i<InterfaceC48532c> events = ((com.avito.android.tariff.cpx.info.advance.e) tariffCpxInfoAdvanceDialogFragment.f296267k0.getValue()).getEvents();
                        C9016a c9016a = new C9016a(tariffCpxInfoAdvanceDialogFragment);
                        this.f296278q = 1;
                        if (events.collect(c9016a, this) == coroutine_suspended) {
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
            public a(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f296274r = tariffCpxInfoAdvanceDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f296274r, continuation);
                aVar.f296273q = obj;
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
                T t12 = (T) this.f296273q;
                TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = this.f296274r;
                C43259k.d(t12, null, null, new C9014a(tariffCpxInfoAdvanceDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(tariffCpxInfoAdvanceDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return TariffCpxInfoAdvanceDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f296271q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = TariffCpxInfoAdvanceDialogFragment.this;
                a aVar = new a(tariffCpxInfoAdvanceDialogFragment, null);
                this.f296271q = 1;
                if (C23056p0.b(tariffCpxInfoAdvanceDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = (TariffCpxInfoAdvanceDialogFragment) this.receiver;
            a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
            tariffCpxInfoAdvanceDialogFragment.getClass();
            tariffCpxInfoAdvanceDialogFragment.f296268l0 = (TextView) view2.findViewById(R.id.tariff_cpx_info_advance_title);
            Input input = (Input) view2.findViewById(R.id.tariff_cpx_info_advance_input);
            input.b(new com.avito.android.tariff.cpx.info.advance.c(input, tariffCpxInfoAdvanceDialogFragment));
            input.v();
            Button button = (Button) view2.findViewById(R.id.tariff_cpx_info_advance_button);
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(tariffCpxInfoAdvanceDialogFragment, 22));
            tariffCpxInfoAdvanceDialogFragment.f296269m0 = button;
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f296281l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f296281l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f296281l);
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
            return TariffCpxInfoAdvanceDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f296283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f296283l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f296283l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296284l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f296284l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296285l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f296285l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxInfoAdvanceDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/info/advance/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff.cpx.info.advance.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.info.advance.e invoke() {
            com.avito.android.tariff.cpx.info.advance.f fVar = TariffCpxInfoAdvanceDialogFragment.this.f296266j0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff.cpx.info.advance.e) fVar.get();
        }
    }

    public TariffCpxInfoAdvanceDialogFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f296267k0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.info.advance.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 15);
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
        Bundle bundleRequireArguments = requireArguments();
        TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody = (TariffCpxInfoAdvanceShowLinkBody) (bundleRequireArguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundleRequireArguments.getParcelable("tariff_cpx_info_advance_key_content", TariffCpxInfoAdvanceShowLinkBody.class) : bundleRequireArguments.getParcelable("tariff_cpx_info_advance_key_content"));
        if (tariffCpxInfoAdvanceShowLinkBody == null) {
            throw new IllegalArgumentException("tariff_cpx_info_advance_key_content param must not be null");
        }
        com.avito.android.tariff.cpx.info.advance.di.a.a().a((WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), s.b(this), tariffCpxInfoAdvanceShowLinkBody).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f296265i0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f296265i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.tariff_cpx_info_advance_bottom_sheet, true, new d(1, this, TariffCpxInfoAdvanceDialogFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296265i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
