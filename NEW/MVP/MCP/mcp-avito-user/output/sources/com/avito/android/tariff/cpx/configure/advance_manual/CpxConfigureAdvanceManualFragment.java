package com.avito.android.tariff.cpx.configure.advance_manual;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpx.configure.advance_manual.di.a;
import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import cv.InterfaceC39417a;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import oB0.InterfaceC44621b;
import oB0.c;
import z1.AbstractC50339a;

/* compiled from: CpxConfigureAdvanceManualFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/CpxConfigureAdvanceManualFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpxConfigureAdvanceManualFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @k
    public static final a f295770u0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.configure.advance_manual.g f295771h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f295772i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f295773j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f295774k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final O0 f295775l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public TextView f295776m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public Input f295777n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f295778o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public Button f295779p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public com.avito.android.tariff.cpx.configure.advance_manual.c f295780q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public Integer f295781r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Integer f295782s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Integer f295783t0;

    /* compiled from: CpxConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/CpxConfigureAdvanceManualFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CpxConfigureAdvanceManualFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$a$a, reason: collision with other inner class name */
        public static final class C8998a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceManualResult f295784l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8998a(CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult) {
                super(1);
                this.f295784l = cpxConfigureAdvanceManualResult;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_content_data", this.f295784l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static CpxConfigureAdvanceManualFragment a(@k CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult) {
            CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = new CpxConfigureAdvanceManualFragment();
            C35966w1.a(cpxConfigureAdvanceManualFragment, -1, new C8998a(cpxConfigureAdvanceManualResult));
            return cpxConfigureAdvanceManualFragment;
        }

        public a() {
        }
    }

    /* compiled from: CpxConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/configure/advance_manual/CpxConfigureAdvanceManualFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            View view = CpxConfigureAdvanceManualFragment.this.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: CpxConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$onCreateDialog$1", f = "CpxConfigureAdvanceManualFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f295786q;

        /* compiled from: CpxConfigureAdvanceManualFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$onCreateDialog$1$1", f = "CpxConfigureAdvanceManualFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f295788q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceManualFragment f295789r;

            /* compiled from: CpxConfigureAdvanceManualFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$onCreateDialog$1$1$1", f = "CpxConfigureAdvanceManualFragment.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$c$a$a, reason: collision with other inner class name */
            public static final class C8999a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295790q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CpxConfigureAdvanceManualFragment f295791r;

                /* compiled from: CpxConfigureAdvanceManualFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoB0/c;", "it", "Lkotlin/G0;", "invoke", "(LoB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C9000a extends N implements Y41.l<oB0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CpxConfigureAdvanceManualFragment f295792l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C9000a(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment) {
                        super(1);
                        this.f295792l = cpxConfigureAdvanceManualFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(oB0.c cVar) throws Resources.NotFoundException {
                        oB0.c cVar2 = cVar;
                        a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
                        CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = this.f295792l;
                        com.avito.android.tariff.cpx.configure.advance_manual.b bVar = new com.avito.android.tariff.cpx.configure.advance_manual.b(1, cpxConfigureAdvanceManualFragment.f5(), com.avito.android.tariff.cpx.configure.advance_manual.f.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        Input input = cpxConfigureAdvanceManualFragment.f295777n0;
                        boolean z12 = cVar2.f419564g;
                        if (input != null) {
                            Input.f179303W.getClass();
                            input.setState(z12 ? Input.f179305b0 : Input.f179304a0);
                        }
                        TextView textView = cpxConfigureAdvanceManualFragment.f295778o0;
                        if (textView != null) {
                            c.InterfaceC12174c interfaceC12174c = cVar2.f419562e;
                            I5.a(textView, interfaceC12174c != null ? interfaceC12174c.getF419579b() : null, false);
                            Integer num = z12 ? cpxConfigureAdvanceManualFragment.f295783t0 : interfaceC12174c instanceof c.InterfaceC12174c.C12175c ? cpxConfigureAdvanceManualFragment.f295781r0 : cpxConfigureAdvanceManualFragment.f295782s0;
                            if (num != null) {
                                textView.setTextColor(num.intValue());
                            }
                        }
                        Button button = cpxConfigureAdvanceManualFragment.f295779p0;
                        if (button != null) {
                            button.setLoading(cVar2.f419565h);
                        }
                        TextView textView2 = cpxConfigureAdvanceManualFragment.f295776m0;
                        CharSequence text = textView2 != null ? textView2.getText() : null;
                        if (text == null || text.length() == 0) {
                            TextView textView3 = cpxConfigureAdvanceManualFragment.f295776m0;
                            if (textView3 != null) {
                                com.avito.android.util.text.j.a(textView3, cVar2.f419559b, null);
                            }
                            Input input2 = cpxConfigureAdvanceManualFragment.f295777n0;
                            if (input2 != null) {
                                com.avito.android.tariff.cpx.configure.advance_manual.c cVar3 = cpxConfigureAdvanceManualFragment.f295780q0;
                                if (cVar3 != null) {
                                    input2.h(cVar3);
                                }
                                input2.v();
                                c.b bVar2 = cVar2.f419560c;
                                input2.setHint(bVar2 != null ? bVar2.f419570c : null);
                                if (bVar2 != null) {
                                    input2.setPostfix(bVar2.f419571d);
                                }
                                com.avito.android.tariff.cpx.configure.advance_manual.c cVar4 = new com.avito.android.tariff.cpx.configure.advance_manual.c(input2, bVar);
                                input2.b(cVar4);
                                cpxConfigureAdvanceManualFragment.f295780q0 = cVar4;
                            }
                            Button button2 = cpxConfigureAdvanceManualFragment.f295779p0;
                            if (button2 != null) {
                                ButtonAction buttonAction = cVar2.f419563f;
                                com.avito.android.lib.design.button.b.a(button2, buttonAction != null ? buttonAction.getTitle() : null, false);
                                Integer numA = com.avito.android.mnz_common.extensions.c.a(button2.getContext(), buttonAction != null ? buttonAction.getStyle() : null);
                                if (numA != null) {
                                    button2.setAppearance(numA.intValue());
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8999a(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment, Continuation<? super C8999a> continuation) {
                    super(2, continuation);
                    this.f295791r = cpxConfigureAdvanceManualFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C8999a(this.f295791r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8999a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295790q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
                        CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = this.f295791r;
                        n2<oB0.c> state = cpxConfigureAdvanceManualFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cpxConfigureAdvanceManualFragment.f295772i0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9000a c9000a = new C9000a(cpxConfigureAdvanceManualFragment);
                        this.f295790q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9000a, this) == coroutine_suspended) {
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

            /* compiled from: CpxConfigureAdvanceManualFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$onCreateDialog$1$1$2", f = "CpxConfigureAdvanceManualFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295793q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CpxConfigureAdvanceManualFragment f295794r;

                /* compiled from: CpxConfigureAdvanceManualFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9001a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CpxConfigureAdvanceManualFragment f295795b;

                    public C9001a(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment) {
                        this.f295795b = cpxConfigureAdvanceManualFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC44621b interfaceC44621b = (InterfaceC44621b) obj;
                        a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
                        CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = this.f295795b;
                        if (interfaceC44621b instanceof InterfaceC44621b.C12173b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = cpxConfigureAdvanceManualFragment.f295774k0;
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = aVar2 != null ? aVar2 : null;
                            InterfaceC44621b.C12173b c12173b = (InterfaceC44621b.C12173b) interfaceC44621b;
                            DeepLink deepLink = c12173b.f419555a;
                            Bundle bundle = new Bundle();
                            bundle.putString("key_cpx_configure_advance", c12173b.f419556b);
                            G0 g02 = G0.f406611a;
                            aVar3.r6(bundle, deepLink, "cpx_configure_advance_manual_request_key");
                        } else if (interfaceC44621b instanceof InterfaceC44621b.a) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar4 = cpxConfigureAdvanceManualFragment.f295774k0;
                            if (aVar4 == null) {
                                aVar4 = null;
                            }
                            b.a.a(aVar4, ((InterfaceC44621b.a) interfaceC44621b).f419554a, null, null, 6);
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
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
                        return new C42801a(2, this.f295795b, CpxConfigureAdvanceManualFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f295794r = cpxConfigureAdvanceManualFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f295794r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295793q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
                        CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = this.f295794r;
                        InterfaceC43160i<InterfaceC44621b> events = cpxConfigureAdvanceManualFragment.f5().getEvents();
                        C9001a c9001a = new C9001a(cpxConfigureAdvanceManualFragment);
                        this.f295793q = 1;
                        if (events.collect(c9001a, this) == coroutine_suspended) {
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
            public a(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f295789r = cpxConfigureAdvanceManualFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f295789r, continuation);
                aVar.f295788q = obj;
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
                T t12 = (T) this.f295788q;
                CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = this.f295789r;
                C43259k.d(t12, null, null, new C8999a(cpxConfigureAdvanceManualFragment, null), 3);
                C43259k.d(t12, null, null, new b(cpxConfigureAdvanceManualFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CpxConfigureAdvanceManualFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f295786q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = CpxConfigureAdvanceManualFragment.this;
                a aVar = new a(cpxConfigureAdvanceManualFragment, null);
                this.f295786q = 1;
                if (C23056p0.b(cpxConfigureAdvanceManualFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CpxConfigureAdvanceManualFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment = (CpxConfigureAdvanceManualFragment) this.receiver;
            a aVar = CpxConfigureAdvanceManualFragment.f295770u0;
            cpxConfigureAdvanceManualFragment.getClass();
            View viewFindViewById = view2.findViewById(R.id.cpx_configure_advance_manual_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cpxConfigureAdvanceManualFragment.f295776m0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.cpx_configure_advance_manual_input);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            cpxConfigureAdvanceManualFragment.f295777n0 = (Input) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.cpx_configure_advance_manual_label);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cpxConfigureAdvanceManualFragment.f295778o0 = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.cpx_configure_advance_manual_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById4;
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(cpxConfigureAdvanceManualFragment, 21));
            cpxConfigureAdvanceManualFragment.f295779p0 = button;
            Context context = view2.getContext();
            cpxConfigureAdvanceManualFragment.f295781r0 = context != null ? Integer.valueOf(C35835l0.d(R.attr.black, context)) : null;
            Context context2 = view2.getContext();
            cpxConfigureAdvanceManualFragment.f295782s0 = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.gray54, context2)) : null;
            Context context3 = view2.getContext();
            cpxConfigureAdvanceManualFragment.f295783t0 = context3 != null ? Integer.valueOf(C35835l0.d(R.attr.red600, context3)) : null;
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f295796l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f295796l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f295796l);
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
            return CpxConfigureAdvanceManualFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f295798l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f295798l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f295798l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295799l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295799l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f295799l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295800l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f295800l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/configure/advance_manual/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff.cpx.configure.advance_manual.f> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.configure.advance_manual.f invoke() {
            com.avito.android.tariff.cpx.configure.advance_manual.g gVar = CpxConfigureAdvanceManualFragment.this.f295771h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.tariff.cpx.configure.advance_manual.f) gVar.get();
        }
    }

    public CpxConfigureAdvanceManualFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f295775l0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.configure.advance_manual.f.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.g b5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 13);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @k
    public final a.i c5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC9002a interfaceC9002aA = com.avito.android.tariff.cpx.configure.advance_manual.di.g.a();
        WA0.b bVar = (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("key_content_data", CpxConfigureAdvanceManualResult.class) : arguments.getParcelable("key_content_data");
        if (parcelable == null) {
            throw new IllegalArgumentException("key_content_data - param must be not null");
        }
        interfaceC9002aA.a(bVar, interfaceC39417aB, rVarB, (CpxConfigureAdvanceManualResult) parcelable).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295772i0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.tariff.cpx.configure.advance_manual.f f5() {
        return (com.avito.android.tariff.cpx.configure.advance_manual.f) this.f295775l0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f295772i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.E(R.layout.fragment_cpx_configure_advance_manual, true, new d(1, this, CpxConfigureAdvanceManualFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f295772i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
