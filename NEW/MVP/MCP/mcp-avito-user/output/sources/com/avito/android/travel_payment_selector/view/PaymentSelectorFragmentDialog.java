package com.avito.android.travel_payment_selector.view;

import Cd.C13243a;
import SK0.b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.travel_payment_selector.di.c;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import eF0.InterfaceC40000a;
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
import lF0.C43630c;
import lF0.InterfaceC43628a;
import lF0.InterfaceC43629b;
import lF0.InterfaceC43631d;
import nF0.C44246a;
import nF0.C44247b;
import oF0.C44635a;
import z1.AbstractC50339a;

/* compiled from: PaymentSelectorFragmentDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/PaymentSelectorFragmentDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentSelectorFragmentDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f302702s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.travel_payment_selector.view.d f302703h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f302704i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f302705j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f302706k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f302707l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f302708m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f302709n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public C44247b f302710o0;

    /* renamed from: p0, reason: collision with root package name */
    public RecyclerView f302711p0;

    /* renamed from: q0, reason: collision with root package name */
    public Spinner f302712q0;

    /* renamed from: r0, reason: collision with root package name */
    public FloatingContainer f302713r0;

    /* compiled from: PaymentSelectorFragmentDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/PaymentSelectorFragmentDialog$a;", "", "<init>", "()V", "", "DIALOG_TAG", "Ljava/lang/String;", "KEY_BOOKING_ID", "KEY_MCID", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentSelectorFragmentDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$onCreateDialog$1", f = "PaymentSelectorFragmentDialog.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f302714q;

        /* compiled from: PaymentSelectorFragmentDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$onCreateDialog$1$1", f = "PaymentSelectorFragmentDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f302716q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PaymentSelectorFragmentDialog f302717r;

            /* compiled from: PaymentSelectorFragmentDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$onCreateDialog$1$1$1", f = "PaymentSelectorFragmentDialog.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$b$a$a, reason: collision with other inner class name */
            public static final class C9267a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f302718q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PaymentSelectorFragmentDialog f302719r;

                /* compiled from: PaymentSelectorFragmentDialog.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlF0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LlF0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$b$a$a$a, reason: collision with other inner class name */
                public static final class C9268a extends N implements l<C43630c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ PaymentSelectorFragmentDialog f302720l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C9268a(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog) {
                        super(1);
                        this.f302720l = paymentSelectorFragmentDialog;
                    }

                    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.List] */
                    @Override // Y41.l
                    public final G0 invoke(C43630c c43630c) {
                        a aVar = PaymentSelectorFragmentDialog.f302702s0;
                        PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = this.f302720l;
                        InterfaceC43631d interfaceC43631d = c43630c.f413684i;
                        if (interfaceC43631d instanceof InterfaceC43631d.a) {
                            Spinner spinner = paymentSelectorFragmentDialog.f302712q0;
                            if (spinner == null) {
                                spinner = null;
                            }
                            D6.w(spinner);
                            Dialog dialog = paymentSelectorFragmentDialog.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                dVar.K(true);
                                dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
                            }
                            InterfaceC43631d.a aVar2 = (InterfaceC43631d.a) interfaceC43631d;
                            String str = aVar2.f413686b;
                            if (str != null) {
                                FloatingContainer floatingContainer = paymentSelectorFragmentDialog.f302713r0;
                                if (floatingContainer == null) {
                                    floatingContainer = null;
                                }
                                D6.H(floatingContainer);
                                FloatingContainer floatingContainer2 = paymentSelectorFragmentDialog.f302713r0;
                                if (floatingContainer2 == null) {
                                    floatingContainer2 = null;
                                }
                                floatingContainer2.a(str);
                                FloatingContainer floatingContainer3 = paymentSelectorFragmentDialog.f302713r0;
                                if (floatingContainer3 == null) {
                                    floatingContainer3 = null;
                                }
                                floatingContainer3.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(paymentSelectorFragmentDialog, 15));
                            }
                            RecyclerView recyclerView = paymentSelectorFragmentDialog.f302711p0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            D6.H(recyclerView);
                            com.avito.konveyor.adapter.a aVar3 = paymentSelectorFragmentDialog.f302706k0;
                            (aVar3 != null ? aVar3 : null).c(new UV0.c(aVar2.f413685a));
                        } else if (interfaceC43631d instanceof InterfaceC43631d.b) {
                            Spinner spinner2 = paymentSelectorFragmentDialog.f302712q0;
                            if (spinner2 == null) {
                                spinner2 = null;
                            }
                            D6.H(spinner2);
                            FloatingContainer floatingContainer4 = paymentSelectorFragmentDialog.f302713r0;
                            if (floatingContainer4 == null) {
                                floatingContainer4 = null;
                            }
                            D6.w(floatingContainer4);
                            RecyclerView recyclerView2 = paymentSelectorFragmentDialog.f302711p0;
                            D6.w(recyclerView2 != null ? recyclerView2 : null);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9267a(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog, Continuation<? super C9267a> continuation) {
                    super(2, continuation);
                    this.f302719r = paymentSelectorFragmentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9267a(this.f302719r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9267a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f302718q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = PaymentSelectorFragmentDialog.f302702s0;
                        PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = this.f302719r;
                        n2<C43630c> state = ((com.avito.android.travel_payment_selector.view.c) paymentSelectorFragmentDialog.f302704i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = paymentSelectorFragmentDialog.f302707l0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C9268a c9268a = new C9268a(paymentSelectorFragmentDialog);
                        this.f302718q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c9268a, this) == coroutine_suspended) {
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

            /* compiled from: PaymentSelectorFragmentDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$onCreateDialog$1$1$2", f = "PaymentSelectorFragmentDialog.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$b$a$b, reason: collision with other inner class name */
            public static final class C9269b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f302721q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ PaymentSelectorFragmentDialog f302722r;

                /* compiled from: PaymentSelectorFragmentDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C9270a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PaymentSelectorFragmentDialog f302723b;

                    public C9270a(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog) {
                        this.f302723b = paymentSelectorFragmentDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC43629b interfaceC43629b = (InterfaceC43629b) obj;
                        a aVar = PaymentSelectorFragmentDialog.f302702s0;
                        PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = this.f302723b;
                        if (interfaceC43629b instanceof InterfaceC43629b.C11780b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = paymentSelectorFragmentDialog.f302709n0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, new ToastMessageLink(((InterfaceC43629b.C11780b) interfaceC43629b).f413672a.k0(paymentSelectorFragmentDialog.requireContext()), ToastMessageLink.ToastType.f133736e, ToastMessageLink.ToastBarPosition.f133725c, null, null, false, null, 120, null), null, null, 6);
                            paymentSelectorFragmentDialog.dismiss();
                        } else if (interfaceC43629b instanceof InterfaceC43629b.a) {
                            DeepLink deepLink = ((InterfaceC43629b.a) interfaceC43629b).f413671a;
                            if (deepLink != null) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = paymentSelectorFragmentDialog.f302709n0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b.a.a(aVar3, deepLink, null, null, 6);
                            }
                            paymentSelectorFragmentDialog.dismiss();
                        } else if (interfaceC43629b instanceof InterfaceC43629b.c) {
                            C44247b c44247b = paymentSelectorFragmentDialog.f302710o0;
                            C44247b c44247b2 = c44247b != null ? c44247b : null;
                            c44247b2.getClass();
                            b.a.a(c44247b2.f414964a, new C44246a(), null, null, null, 14);
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
                        return new C42801a(2, this.f302723b, PaymentSelectorFragmentDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9269b(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog, Continuation<? super C9269b> continuation) {
                    super(2, continuation);
                    this.f302722r = paymentSelectorFragmentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C9269b(this.f302722r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C9269b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f302721q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = PaymentSelectorFragmentDialog.f302702s0;
                        PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = this.f302722r;
                        InterfaceC43160i<InterfaceC43629b> events = ((com.avito.android.travel_payment_selector.view.c) paymentSelectorFragmentDialog.f302704i0.getValue()).getEvents();
                        C9270a c9270a = new C9270a(paymentSelectorFragmentDialog);
                        this.f302721q = 1;
                        if (events.collect(c9270a, this) == coroutine_suspended) {
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
            public a(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f302717r = paymentSelectorFragmentDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f302717r, continuation);
                aVar.f302716q = obj;
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
                T t12 = (T) this.f302716q;
                PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = this.f302717r;
                C43259k.d(t12, null, null, new C9267a(paymentSelectorFragmentDialog, null), 3);
                C43259k.d(t12, null, null, new C9269b(paymentSelectorFragmentDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return PaymentSelectorFragmentDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f302714q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = PaymentSelectorFragmentDialog.this;
                a aVar = new a(paymentSelectorFragmentDialog, null);
                this.f302714q = 1;
                if (C23056p0.b(paymentSelectorFragmentDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: PaymentSelectorFragmentDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/travel_payment_selector/view/PaymentSelectorFragmentDialog$c", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.lib.design.bottom_sheet.d {
    }

    /* compiled from: PaymentSelectorFragmentDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlF0/a;", "action", "Lkotlin/G0;", "invoke", "(LlF0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<InterfaceC43628a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC43628a interfaceC43628a) {
            a aVar = PaymentSelectorFragmentDialog.f302702s0;
            ((com.avito.android.travel_payment_selector.view.c) PaymentSelectorFragmentDialog.this.f302704i0.getValue()).accept(interfaceC43628a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f302725l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f302725l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f302725l);
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
            return PaymentSelectorFragmentDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f302727l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f302727l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f302727l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f302728l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f302728l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f302728l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f302729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f302729l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f302729l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PaymentSelectorFragmentDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/travel_payment_selector/view/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.travel_payment_selector.view.c> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.travel_payment_selector.view.c invoke() {
            com.avito.android.travel_payment_selector.view.d dVar = PaymentSelectorFragmentDialog.this.f302703h0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.travel_payment_selector.view.c) dVar.get();
        }
    }

    public PaymentSelectorFragmentDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f302704i0 = new O0(m0.f406844a.b(com.avito.android.travel_payment_selector.view.c.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_booking_id") : null;
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("key_mcid")) : null;
        C28478k c28478k = new C28478k(PaymentSelectorScreen.f302731d, s.b(this), null, 4, null);
        c.a aVarA = com.avito.android.travel_payment_selector.di.a.a();
        if (string == null) {
            string = "";
        }
        aVarA.a(string, lValueOf, c28478k, (com.avito.android.travel_payment_selector.di.f) C29972i.a(C29972i.b(this), com.avito.android.travel_payment_selector.di.f.class), (InterfaceC40000a) C29972i.a(C29972i.b(this), InterfaceC40000a.class), new d(), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f302707l0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f302707l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.deeplink_handler.view.d dVar = this.f302708m0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, null, 30);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        c cVar = new c(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        cVar.A(R.layout.fragment_payment_selector, R.layout.layout_payment_apply_button);
        cVar.T();
        cVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.M(cVar, null, false, true, 7);
        this.f302712q0 = (Spinner) cVar.findViewById(R.id.spinner);
        this.f302713r0 = (FloatingContainer) cVar.findViewById(R.id.payment_action_button);
        RecyclerView recyclerView = (RecyclerView) cVar.findViewById(R.id.recycler);
        this.f302711p0 = recyclerView;
        cVar.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.f302711p0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        com.avito.konveyor.adapter.j jVar = this.f302705j0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        RecyclerView recyclerView3 = this.f302711p0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.l(new C44635a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f302707l0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return cVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        RecyclerView recyclerView = this.f302711p0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
    }
}
