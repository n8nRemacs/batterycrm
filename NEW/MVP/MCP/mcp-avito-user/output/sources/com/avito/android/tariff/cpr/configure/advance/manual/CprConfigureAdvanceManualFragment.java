package com.avito.android.tariff.cpr.configure.advance.manual;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
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
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpr.common.f;
import com.avito.android.tariff.cpr.configure.advance.di.t;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import eB0.C39985a;
import eB0.C39986b;
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
import z1.AbstractC50339a;

/* compiled from: CprConfigureAdvanceManualFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/CprConfigureAdvanceManualFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CprConfigureAdvanceManualFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @k
    public static final a f295324u0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpr.configure.advance.manual.j f295325h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f295326i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f295327j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f295328k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f295329l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public Input f295330m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public Button f295331n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public TextView f295332o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f295333p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public com.avito.android.tariff.cpr.common.f f295334q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public Integer f295335r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Integer f295336s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Integer f295337t0;

    /* compiled from: CprConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/CprConfigureAdvanceManualFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CprConfigureAdvanceManualFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$a$a, reason: collision with other inner class name */
        public static final class C8977a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f295338l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8977a(String str) {
                super(1);
                this.f295338l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("configure_context", this.f295338l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static CprConfigureAdvanceManualFragment a(@k String str) {
            CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = new CprConfigureAdvanceManualFragment();
            C35966w1.a(cprConfigureAdvanceManualFragment, -1, new C8977a(str));
            return cprConfigureAdvanceManualFragment;
        }

        public a() {
        }
    }

    /* compiled from: CprConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpr/configure/advance/manual/CprConfigureAdvanceManualFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @k
        public final ViewGroup a() {
            return (ViewGroup) CprConfigureAdvanceManualFragment.this.requireDialog().findViewById(R.id.cpr_configure_advance_manual_root);
        }
    }

    /* compiled from: CprConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$onCreateDialog$1", f = "CprConfigureAdvanceManualFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f295340q;

        /* compiled from: CprConfigureAdvanceManualFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$onCreateDialog$1$1", f = "CprConfigureAdvanceManualFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f295342q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CprConfigureAdvanceManualFragment f295343r;

            /* compiled from: CprConfigureAdvanceManualFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$onCreateDialog$1$1$1", f = "CprConfigureAdvanceManualFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$c$a$a, reason: collision with other inner class name */
            public static final class C8978a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295344q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f295345r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ CprConfigureAdvanceManualFragment f295346s;

                /* compiled from: CprConfigureAdvanceManualFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LfB0/c;", "it", "Lkotlin/G0;", "invoke", "(LfB0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C8979a extends N implements Y41.l<fB0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CprConfigureAdvanceManualFragment f295347l;

                    /* renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ T f295348m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8979a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment, T t12) {
                        super(1);
                        this.f295347l = cprConfigureAdvanceManualFragment;
                        this.f295348m = t12;
                    }

                    @Override // Y41.l
                    public final G0 invoke(fB0.c cVar) {
                        Input input;
                        fB0.c cVar2 = cVar;
                        CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = this.f295347l;
                        com.avito.android.tariff.cpr.configure.advance.manual.c cVar3 = new com.avito.android.tariff.cpr.configure.advance.manual.c(1, (com.avito.android.tariff.cpr.configure.advance.manual.i) cprConfigureAdvanceManualFragment.f295326i0.getValue(), com.avito.android.tariff.cpr.configure.advance.manual.i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        ApiError apiError = cVar2.f395782g;
                        if (apiError != null) {
                            com.avito.android.progress_overlay.l lVar = cprConfigureAdvanceManualFragment.f295333p0;
                            if (lVar != null) {
                                lVar.a(z.k(apiError));
                            }
                        } else {
                            if (cVar2.f395783h) {
                                com.avito.android.progress_overlay.l lVar2 = cprConfigureAdvanceManualFragment.f295333p0;
                                if (lVar2 != null) {
                                    lVar2.k(null);
                                }
                            } else {
                                Input input2 = cprConfigureAdvanceManualFragment.f295330m0;
                                C39985a c39985a = cVar2.f395777b;
                                if (input2 != null) {
                                    input2.setHint(c39985a != null ? c39985a.f395048c : null);
                                }
                                if (c39985a != null) {
                                    String str = c39985a.f395049d;
                                    Input input3 = cprConfigureAdvanceManualFragment.f295330m0;
                                    if (input3 != null) {
                                        input3.setPostfix(str);
                                    }
                                }
                                Input input4 = cprConfigureAdvanceManualFragment.f295330m0;
                                if (input4 != null) {
                                    input4.setGravity(1);
                                }
                                com.avito.android.tariff.cpr.common.f fVar = cprConfigureAdvanceManualFragment.f295334q0;
                                if (fVar != null && (input = cprConfigureAdvanceManualFragment.f295330m0) != null) {
                                    input.h(fVar);
                                }
                                f.a.C8969a c8969a = f.a.C8969a.f295147a;
                                com.avito.android.tariff.cpr.configure.advance.manual.d dVar = new com.avito.android.tariff.cpr.configure.advance.manual.d(cVar3);
                                T t12 = this.f295348m;
                                com.avito.android.tariff.cpr.common.f fVar2 = new com.avito.android.tariff.cpr.common.f(t12, c8969a, dVar);
                                cprConfigureAdvanceManualFragment.f295334q0 = fVar2;
                                Input input5 = cprConfigureAdvanceManualFragment.f295330m0;
                                if (input5 != null) {
                                    input5.b(fVar2);
                                }
                                Input input6 = cprConfigureAdvanceManualFragment.f295330m0;
                                if (input6 != null) {
                                    input6.v();
                                }
                                Y41.l lVarA = com.avito.android.tariff.cpr.common.c.a(t12, new com.avito.android.tariff.cpr.configure.advance.manual.e(cVar3));
                                Button button = cprConfigureAdvanceManualFragment.f295331n0;
                                if (button != null) {
                                    ButtonAction buttonAction = cVar2.f395779d;
                                    com.avito.android.lib.design.button.b.a(button, buttonAction != null ? buttonAction.getTitle() : null, false);
                                }
                                Button button2 = cprConfigureAdvanceManualFragment.f295331n0;
                                if (button2 != null) {
                                    button2.setOnClickListener(new com.avito.android.seller_promotions.b(17, lVarA));
                                }
                                TextView textView = cprConfigureAdvanceManualFragment.f295332o0;
                                C39986b c39986b = cVar2.f395780e;
                                if (textView != null) {
                                    I5.a(textView, c39986b != null ? c39986b.f395050a : null, false);
                                }
                                if (c39986b == null || !c39986b.f395051b) {
                                    Integer num = cprConfigureAdvanceManualFragment.f295336s0;
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        TextView textView2 = cprConfigureAdvanceManualFragment.f295332o0;
                                        if (textView2 != null) {
                                            textView2.setTextColor(iIntValue);
                                        }
                                    }
                                } else {
                                    Integer num2 = cprConfigureAdvanceManualFragment.f295335r0;
                                    if (num2 != null) {
                                        int iIntValue2 = num2.intValue();
                                        TextView textView3 = cprConfigureAdvanceManualFragment.f295332o0;
                                        if (textView3 != null) {
                                            textView3.setTextColor(iIntValue2);
                                        }
                                    }
                                }
                                com.avito.android.progress_overlay.l lVar3 = cprConfigureAdvanceManualFragment.f295333p0;
                                if (lVar3 != null) {
                                    lVar3.j();
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8978a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment, Continuation<? super C8978a> continuation) {
                    super(2, continuation);
                    this.f295346s = cprConfigureAdvanceManualFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    C8978a c8978a = new C8978a(this.f295346s, continuation);
                    c8978a.f295345r = obj;
                    return c8978a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8978a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295344q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        T t12 = (T) this.f295345r;
                        CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = this.f295346s;
                        n2<fB0.c> state = ((com.avito.android.tariff.cpr.configure.advance.manual.i) cprConfigureAdvanceManualFragment.f295326i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cprConfigureAdvanceManualFragment.f295327j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8979a c8979a = new C8979a(cprConfigureAdvanceManualFragment, t12);
                        this.f295344q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8979a, this) == coroutine_suspended) {
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

            /* compiled from: CprConfigureAdvanceManualFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$onCreateDialog$1$1$2", f = "CprConfigureAdvanceManualFragment.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f295349q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CprConfigureAdvanceManualFragment f295350r;

                /* compiled from: CprConfigureAdvanceManualFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8980a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CprConfigureAdvanceManualFragment f295351b;

                    public C8980a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment) {
                        this.f295351b = cprConfigureAdvanceManualFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Object objF5 = CprConfigureAdvanceManualFragment.f5(this.f295351b, (fB0.b) obj, continuation);
                        return objF5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF5 : G0.f406611a;
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
                        return new H(2, this.f295351b, CprConfigureAdvanceManualFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualOneTimeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f295350r = cprConfigureAdvanceManualFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f295350r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f295349q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = this.f295350r;
                        InterfaceC43160i<fB0.b> events = ((com.avito.android.tariff.cpr.configure.advance.manual.i) cprConfigureAdvanceManualFragment.f295326i0.getValue()).getEvents();
                        C8980a c8980a = new C8980a(cprConfigureAdvanceManualFragment);
                        this.f295349q = 1;
                        if (events.collect(c8980a, this) == coroutine_suspended) {
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
            public a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f295343r = cprConfigureAdvanceManualFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f295343r, continuation);
                aVar.f295342q = obj;
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
                T t12 = (T) this.f295342q;
                CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = this.f295343r;
                C43259k.d(t12, null, null, new C8978a(cprConfigureAdvanceManualFragment, null), 3);
                C43259k.d(t12, null, null, new b(cprConfigureAdvanceManualFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CprConfigureAdvanceManualFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f295340q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = CprConfigureAdvanceManualFragment.this;
                a aVar = new a(cprConfigureAdvanceManualFragment, null);
                this.f295340q = 1;
                if (C23056p0.b(cprConfigureAdvanceManualFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CprConfigureAdvanceManualFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        public final void f(@k View view) {
            CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment = (CprConfigureAdvanceManualFragment) this.receiver;
            a aVar = CprConfigureAdvanceManualFragment.f295324u0;
            cprConfigureAdvanceManualFragment.getClass();
            View viewFindViewById = view.findViewById(R.id.cpr_advance_input);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            cprConfigureAdvanceManualFragment.f295330m0 = (Input) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.cpr_advance_label);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cprConfigureAdvanceManualFragment.f295332o0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.cpr_advance_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            cprConfigureAdvanceManualFragment.f295331n0 = (Button) viewFindViewById3;
            Context context = view.getContext();
            cprConfigureAdvanceManualFragment.f295335r0 = context != null ? Integer.valueOf(C35835l0.d(R.attr.black, context)) : null;
            Context context2 = view.getContext();
            cprConfigureAdvanceManualFragment.f295336s0 = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.warmGray54, context2)) : null;
            Context context3 = view.getContext();
            cprConfigureAdvanceManualFragment.f295337t0 = context3 != null ? Integer.valueOf(C35835l0.d(R.attr.red600, context3)) : null;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cpr_configure_advance_manual_root);
            InterfaceC28373a interfaceC28373a = cprConfigureAdvanceManualFragment.f295328k0;
            com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 26, null);
            lVar.f231600j = new com.avito.android.tariff.cpr.configure.advance.manual.b(cprConfigureAdvanceManualFragment);
            cprConfigureAdvanceManualFragment.f295333p0 = lVar;
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f295352l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f295352l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f295352l);
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
            return CprConfigureAdvanceManualFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f295354l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f295354l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f295354l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295355l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295355l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f295355l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295356l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295356l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f295356l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CprConfigureAdvanceManualFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpr/configure/advance/manual/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.tariff.cpr.configure.advance.manual.i> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpr.configure.advance.manual.i invoke() {
            com.avito.android.tariff.cpr.configure.advance.manual.j jVar = CprConfigureAdvanceManualFragment.this.f295325h0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.tariff.cpr.configure.advance.manual.i) jVar.get();
        }
    }

    public CprConfigureAdvanceManualFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f295326i0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpr.configure.advance.manual.i.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f5(com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment r4, fB0.b r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.tariff.cpr.configure.advance.manual.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.tariff.cpr.configure.advance.manual.a r0 = (com.avito.android.tariff.cpr.configure.advance.manual.a) r0
            int r1 = r0.f295362t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295362t = r1
            goto L18
        L13:
            com.avito.android.tariff.cpr.configure.advance.manual.a r0 = new com.avito.android.tariff.cpr.configure.advance.manual.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f295360r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f295362t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment r4 = r0.f295359q
            kotlin.C42729a0.b(r6)
            goto L7a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r6)
            boolean r6 = r5 instanceof fB0.b.a
            if (r6 == 0) goto L5a
            fB0.b$a r5 = (fB0.b.a) r5
            com.avito.android.deep_linking.links.DeepLink r6 = r5.f395772a
            if (r6 == 0) goto L89
            com.avito.android.deeplink_handler.handler.composite.a r4 = r4.f295329l0
            if (r4 == 0) goto L45
            goto L46
        L45:
            r4 = 0
        L46:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "keyCprConfigureAdvance"
            java.lang.String r5 = r5.f395773b
            r0.putString(r1, r5)
            kotlin.G0 r5 = kotlin.G0.f406611a
            java.lang.String r5 = "cpr_advance_manual_request_key"
            r4.r6(r0, r6, r5)
            goto L89
        L5a:
            boolean r5 = r5 instanceof fB0.b.C11135b
            if (r5 == 0) goto L89
            java.lang.Integer r5 = r4.f295337t0
            if (r5 == 0) goto L6d
            int r5 = r5.intValue()
            com.avito.android.lib.design.input.Input r6 = r4.f295330m0
            if (r6 == 0) goto L6d
            r6.setTextColor(r5)
        L6d:
            r0.f295359q = r4
            r0.f295362t = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = kotlinx.coroutines.C43131e0.b(r5, r0)
            if (r5 != r1) goto L7a
            goto L8b
        L7a:
            java.lang.Integer r5 = r4.f295335r0
            if (r5 == 0) goto L89
            int r5 = r5.intValue()
            com.avito.android.lib.design.input.Input r4 = r4.f295330m0
            if (r4 == 0) goto L89
            r4.setTextColor(r5)
        L89:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment.f5(com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment, fB0.b, kotlin.coroutines.Continuation):java.lang.Object");
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
        String string = requireArguments().getString("configure_context");
        if (string == null) {
            throw new IllegalArgumentException("configure_context param must not be null");
        }
        com.avito.android.tariff.cpr.configure.advance.manual.di.d.a().a((t) C29972i.a(C29972i.b(this), t.class), cv.c.b(this), CprConfigureAdvanceManualPerfScreen.f295358d, s.b(this), string).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295327j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f295327j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.E(R.layout.tariff_cpr_bottom_sheet_tariff_cpr_configure_advance_manual, true, new d(1, this, CprConfigureAdvanceManualFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f295327j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
