package com.avito.android.service_booking_details;

import Bt0.InterfaceC13184a;
import Bt0.b;
import Cd.C13243a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking.api.remote.model.details.ServiceBookingItemDetailsResult;
import com.avito.android.service_booking_common.blueprints.contact.d;
import com.avito.android.service_booking_details.ToastConfig;
import com.avito.android.service_booking_details.p;
import com.avito.android.service_booking_details.perf_screen.ServicesBookingItemDetails;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import com.avito.android.util.V;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
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
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingItemDetailsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_details/ServiceBookingItemDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/service_booking_common/blueprints/contact/d$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingItemDetailsActivity extends com.avito.android.ui.activity.a implements d.a, InterfaceC28477j.b {

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final a f277175C = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public com.avito.android.service_booking_details.di.c f277176A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public p f277177B;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public t f277178m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f277179n = new O0(m0.f406844a.b(s.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f277180o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f277181p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f277182q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f277183r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public R0 f277184s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public j f277185t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f277186u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f277187v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f277188w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_utils.ux_feedback.a f277189x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public l f277190y;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public V f277191z;

    /* compiled from: ServiceBookingItemDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_details/ServiceBookingItemDetailsActivity$a;", "", "<init>", "()V", "", "KEY_BOOKING_ID", "Ljava/lang/String;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingItemDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$onCreate$1", f = "ServiceBookingItemDetailsActivity.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277192q;

        /* compiled from: ServiceBookingItemDetailsActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$onCreate$1$1", f = "ServiceBookingItemDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f277194q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ServiceBookingItemDetailsActivity f277195r;

            /* compiled from: ServiceBookingItemDetailsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$onCreate$1$1$1", f = "ServiceBookingItemDetailsActivity.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$b$a$a, reason: collision with other inner class name */
            public static final class C8230a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f277196q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServiceBookingItemDetailsActivity f277197r;

                /* compiled from: ServiceBookingItemDetailsActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C8231a extends H implements Y41.l<InterfaceC13184a, G0> {
                    @Override // Y41.l
                    public final G0 invoke(InterfaceC13184a interfaceC13184a) {
                        ((s) this.receiver).accept(interfaceC13184a);
                        return G0.f406611a;
                    }
                }

                /* compiled from: ServiceBookingItemDetailsActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBt0/c;", "it", "Lkotlin/G0;", "invoke", "(LBt0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$b$a$a$b, reason: collision with other inner class name */
                public static final class C8232b extends N implements Y41.l<Bt0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ServiceBookingItemDetailsActivity f277198l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8232b(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity) {
                        super(1);
                        this.f277198l = serviceBookingItemDetailsActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(Bt0.c cVar) throws Throwable {
                        Button button;
                        ViewGroup viewGroup;
                        char c12;
                        boolean z12 = false;
                        z12 = false;
                        int i12 = 1;
                        Bt0.c cVar2 = cVar;
                        a aVar = ServiceBookingItemDetailsActivity.f277175C;
                        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277198l;
                        if (cVar2.f1775j) {
                            p pVar = serviceBookingItemDetailsActivity.f277177B;
                            if (pVar != null) {
                                C42670a c42670a = pVar.f277473p;
                                if (c42670a != null) {
                                    C42670a.d(c42670a);
                                }
                                D6.g(pVar.f277465h);
                            }
                        } else {
                            Throwable th2 = null;
                            if (cVar2.f1774i != null) {
                                p pVar2 = serviceBookingItemDetailsActivity.f277177B;
                                if (pVar2 != null) {
                                    C42670a c42670a2 = pVar2.f277473p;
                                    if (c42670a2 != null) {
                                        c42670a2.c(null, new r(pVar2));
                                    }
                                    D6.g(pVar2.f277465h);
                                }
                            } else {
                                final p pVar3 = serviceBookingItemDetailsActivity.f277177B;
                                if (pVar3 != null) {
                                    pVar3.f277460c.c(new UV0.c(cVar2.f1770e));
                                    pVar3.f277466i.setTitle(cVar2.f1768c);
                                    TextView textView = pVar3.f277471n;
                                    AttributedText attributedText = cVar2.f1773h;
                                    com.avito.android.util.text.j.a(textView, attributedText, pVar3.f277461d);
                                    if (attributedText != null) {
                                        C43175k.K(new C43197r1(new q(pVar3, null), y.a(attributedText.linkClicksV3())), pVar3.f277475r);
                                    }
                                    List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> list = cVar2.f1771f;
                                    List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction> list2 = cVar2.f1772g;
                                    D6.G(pVar3.f277465h, (list2 == null && list == null) ? false : true);
                                    LinearLayout linearLayout = pVar3.f277472o;
                                    linearLayout.removeAllViews();
                                    D6.w(linearLayout);
                                    if (list2 != null) {
                                        int i13 = 0;
                                        for (Object obj : list2) {
                                            int i14 = i13 + 1;
                                            if (i13 < 0) {
                                                Throwable th3 = th2;
                                                C42745f0.H0();
                                                throw th3;
                                            }
                                            ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction serviceBookingItemDetailsButtonsAction = (ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction) obj;
                                            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                                            int i15 = -2;
                                            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                            linearLayout2.setOrientation(0);
                                            linearLayout2.setGravity(17);
                                            if (i13 != list2.size() - i12) {
                                                viewGroup = linearLayout2;
                                                D6.c(linearLayout2, null, null, null, Integer.valueOf(y6.b(12)), 7);
                                            } else {
                                                viewGroup = linearLayout2;
                                            }
                                            linearLayout.addView(viewGroup);
                                            int i16 = 0;
                                            for (Object obj2 : serviceBookingItemDetailsButtonsAction.getActions()) {
                                                int i17 = i16 + 1;
                                                if (i16 < 0) {
                                                    C42745f0.H0();
                                                    throw null;
                                                }
                                                final ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction serviceBookingItemDetailsAction = (ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction) obj2;
                                                Button button2 = new Button(viewGroup.getContext(), null, 0, 0, 14, null);
                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i15, i15);
                                                layoutParams.weight = 1.0f;
                                                button2.setLayoutParams(layoutParams);
                                                com.avito.android.lib.design.button.b.a(button2, serviceBookingItemDetailsAction.getTitle(), false);
                                                int i18 = p.b.f277478b[serviceBookingItemDetailsAction.getButtonType().ordinal()];
                                                if (i18 == 1) {
                                                    button2.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
                                                } else if (i18 == 2) {
                                                    button2.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
                                                }
                                                final int i19 = z12 ? 1 : 0;
                                                button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_booking_details.o
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i19) {
                                                            case 0:
                                                                Y41.l<? super InterfaceC13184a, G0> lVar = pVar3.f277474q;
                                                                if (lVar != null) {
                                                                    lVar.invoke(new InterfaceC13184a.d(serviceBookingItemDetailsAction.getUri()));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                Y41.l<? super InterfaceC13184a, G0> lVar2 = pVar3.f277474q;
                                                                if (lVar2 != null) {
                                                                    lVar2.invoke(new InterfaceC13184a.d(serviceBookingItemDetailsAction.getUri()));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                if (i16 != C42745f0.J(serviceBookingItemDetailsButtonsAction.getActions())) {
                                                    c12 = '\f';
                                                    D6.c(button2, null, null, Integer.valueOf(y6.b(12)), null, 11);
                                                } else {
                                                    c12 = '\f';
                                                }
                                                viewGroup.addView(button2);
                                                i16 = i17;
                                                i15 = -2;
                                            }
                                            i13 = i14;
                                            i12 = 1;
                                            th2 = null;
                                        }
                                    }
                                    D6.H(linearLayout);
                                    Button button3 = pVar3.f277468k;
                                    D6.w(button3);
                                    Button button4 = pVar3.f277469l;
                                    D6.w(button4);
                                    Button button5 = pVar3.f277470m;
                                    D6.w(button5);
                                    if (list != null) {
                                        for (final ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction serviceBookingItemDetailsAction2 : list) {
                                            int i22 = p.b.f277477a[serviceBookingItemDetailsAction2.getActionType().ordinal()];
                                            if (i22 == 1) {
                                                button = button3;
                                            } else if (i22 == 2) {
                                                button = button5;
                                            } else {
                                                if (i22 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                button = button4;
                                            }
                                            com.avito.android.lib.design.button.b.a(button, serviceBookingItemDetailsAction2.getTitle(), false);
                                            int i23 = p.b.f277478b[serviceBookingItemDetailsAction2.getButtonType().ordinal()];
                                            final int i24 = 1;
                                            if (i23 == 1) {
                                                button.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
                                            } else if (i23 == 2) {
                                                button.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
                                            }
                                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_booking_details.o
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i24) {
                                                        case 0:
                                                            Y41.l<? super InterfaceC13184a, G0> lVar = pVar3.f277474q;
                                                            if (lVar != null) {
                                                                lVar.invoke(new InterfaceC13184a.d(serviceBookingItemDetailsAction2.getUri()));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            Y41.l<? super InterfaceC13184a, G0> lVar2 = pVar3.f277474q;
                                                            if (lVar2 != null) {
                                                                lVar2.invoke(new InterfaceC13184a.d(serviceBookingItemDetailsAction2.getUri()));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        if (D6.y(button4) && D6.y(button5)) {
                                            z12 = true;
                                        }
                                        D6.G(pVar3.f277467j, z12);
                                    }
                                    C42670a c42670a3 = pVar3.f277473p;
                                    if (c42670a3 != null) {
                                        c42670a3.b();
                                    }
                                }
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8230a(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, Continuation<? super C8230a> continuation) {
                    super(2, continuation);
                    this.f277197r = serviceBookingItemDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8230a(this.f277197r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8230a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f277196q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277197r;
                        p pVar = serviceBookingItemDetailsActivity.f277177B;
                        if (pVar != null) {
                            C8231a c8231a = new C8231a(1, serviceBookingItemDetailsActivity.b2(), s.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                            pVar.f277474q = c8231a;
                            C42670a c42670a = pVar.f277473p;
                            if (c42670a != null) {
                                c42670a.a(new com.avito.android.seller_promotions.b(10, c8231a));
                            }
                        }
                        n2<Bt0.c> state = serviceBookingItemDetailsActivity.b2().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = serviceBookingItemDetailsActivity.f277180o;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8232b c8232b = new C8232b(serviceBookingItemDetailsActivity);
                        this.f277196q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8232b, this) == coroutine_suspended) {
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

            /* compiled from: ServiceBookingItemDetailsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$onCreate$1$1$2", f = "ServiceBookingItemDetailsActivity.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$b$a$b, reason: collision with other inner class name */
            public static final class C8233b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f277199q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServiceBookingItemDetailsActivity f277200r;

                /* compiled from: ServiceBookingItemDetailsActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8234a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ServiceBookingItemDetailsActivity f277201b;

                    public C8234a(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity) {
                        this.f277201b = serviceBookingItemDetailsActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        p pVar;
                        Bt0.b bVar = (Bt0.b) obj;
                        a aVar = ServiceBookingItemDetailsActivity.f277175C;
                        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277201b;
                        if (bVar instanceof b.a) {
                            serviceBookingItemDetailsActivity.setResult(((b.a) bVar).f1760a);
                            serviceBookingItemDetailsActivity.finish();
                        } else if (bVar instanceof b.e) {
                            p pVar2 = serviceBookingItemDetailsActivity.f277177B;
                            if (pVar2 != null) {
                                pVar2.f277463f.a();
                            }
                        } else {
                            if (bVar instanceof b.c) {
                                DeepLink deepLink = ((b.c) bVar).f1762a;
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = serviceBookingItemDetailsActivity.f277186u;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                b.a.a(aVar2, deepLink, null, C22777e.b(new Q("with_up_intent", Boolean.FALSE)), 2);
                            } else if (bVar instanceof b.C0075b) {
                                String str = ((b.C0075b) bVar).f1761a.f276295j;
                                if (str != null && str.length() != 0) {
                                    V v12 = serviceBookingItemDetailsActivity.f277191z;
                                    (v12 != null ? v12 : null).a(str);
                                }
                            } else if ((bVar instanceof b.d) && (pVar = serviceBookingItemDetailsActivity.f277177B) != null) {
                                ToastConfig.ToastAnchor[] toastAnchorArr = ToastConfig.ToastAnchor.f277210b;
                                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                                PrintableText printableText = ((b.d) bVar).f1763a;
                                f.c.f125255c.getClass();
                                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, pVar.f277459b, printableText, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                            }
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
                        return new C42801a(2, this.f277201b, ServiceBookingItemDetailsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8233b(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, Continuation<? super C8233b> continuation) {
                    super(2, continuation);
                    this.f277200r = serviceBookingItemDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8233b(this.f277200r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8233b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f277199q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ServiceBookingItemDetailsActivity.f277175C;
                        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277200r;
                        InterfaceC43160i<Bt0.b> events = serviceBookingItemDetailsActivity.b2().getEvents();
                        C8234a c8234a = new C8234a(serviceBookingItemDetailsActivity);
                        this.f277199q = 1;
                        if (events.collect(c8234a, this) == coroutine_suspended) {
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

            /* compiled from: ServiceBookingItemDetailsActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity$onCreate$1$1$3", f = "ServiceBookingItemDetailsActivity.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f277202q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ServiceBookingItemDetailsActivity f277203r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f277203r = serviceBookingItemDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f277203r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f277202q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277203r;
                        Set<TV0.d<?, ?>> set = serviceBookingItemDetailsActivity.f277188w;
                        if (set == null) {
                            set = null;
                        }
                        this.f277202q = 1;
                        if (ServiceBookingItemDetailsActivity.a2(serviceBookingItemDetailsActivity, set, this) == coroutine_suspended) {
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
            public a(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f277195r = serviceBookingItemDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f277195r, continuation);
                aVar.f277194q = obj;
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
                T t12 = (T) this.f277194q;
                ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f277195r;
                C43259k.d(t12, null, null, new C8230a(serviceBookingItemDetailsActivity, null), 3);
                C43259k.d(t12, null, null, new C8233b(serviceBookingItemDetailsActivity, null), 3);
                C43259k.d(t12, null, null, new c(serviceBookingItemDetailsActivity, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ServiceBookingItemDetailsActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277192q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = ServiceBookingItemDetailsActivity.this;
                a aVar = new a(serviceBookingItemDetailsActivity, null);
                this.f277192q = 1;
                if (C23056p0.b(serviceBookingItemDetailsActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = ServiceBookingItemDetailsActivity.f277175C;
            ServiceBookingItemDetailsActivity.this.b2().accept(InterfaceC13184a.C0074a.f1753a);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingItemDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = ServiceBookingItemDetailsActivity.f277175C;
            ServiceBookingItemDetailsActivity.this.b2().accept(new InterfaceC13184a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f277206l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f277206l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f277206l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ServiceBookingItemDetailsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ServiceBookingItemDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ServiceBookingItemDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_details/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<s> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = ServiceBookingItemDetailsActivity.this.f277178m;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a2(com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity r7, java.util.Set r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof com.avito.android.service_booking_details.f
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.service_booking_details.f r0 = (com.avito.android.service_booking_details.f) r0
            int r1 = r0.f277354u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277354u = r1
            goto L18
        L13:
            com.avito.android.service_booking_details.f r0 = new com.avito.android.service_booking_details.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f277352s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f277354u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r7 = r0.f277351r
            com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity r8 = r0.f277350q
            kotlin.C42729a0.b(r9)
            goto L41
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.C42729a0.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L41:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L79
            java.lang.Object r9 = r7.next()
            TV0.d r9 = (TV0.d) r9
            boolean r2 = r9 instanceof com.avito.android.service_booking_common.blueprints.contact.d
            if (r2 == 0) goto L41
            com.avito.android.service_booking_common.blueprints.contact.d r9 = (com.avito.android.service_booking_common.blueprints.contact.d) r9
            com.jakewharton.rxrelay3.c r9 = r9.getF276303c()
            kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.rx3.y.a(r9)
            com.avito.android.service_booking_details.g r2 = new com.avito.android.service_booking_details.g
            r4 = 3
            r5 = 0
            r2.<init>(r4, r5)
            kotlinx.coroutines.flow.f0 r4 = new kotlinx.coroutines.flow.f0
            r4.<init>(r9, r2)
            com.avito.android.service_booking_details.h r9 = new com.avito.android.service_booking_details.h
            r9.<init>(r8)
            r0.f277350q = r8
            r0.f277351r = r7
            r0.f277354u = r3
            java.lang.Object r9 = r4.collect(r9, r0)
            if (r9 != r1) goto L41
            goto L7b
        L79:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity.a2(com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity, java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.service_booking_details_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        String stringExtra = getIntent().getStringExtra("key_booking_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException(("key_booking_id was not passed to " + this).toString());
        }
        com.avito.android.service_booking_details.di.c cVarA = com.avito.android.service_booking_details.di.b.a().a(this, (com.avito.android.service_booking_details.di.d) C29972i.a(C29972i.b(this), com.avito.android.service_booking_details.di.d.class), cv.c.a(this), new C28478k(ServicesBookingItemDetails.f277479d, com.avito.android.analytics.screens.s.a(this), "serviceBookingItemDetails"), stringExtra, getResources(), new d());
        this.f277176A = cVarA;
        cVarA.a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f277180o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final s b2() {
        return (s) this.f277179n.getValue();
    }

    public final void c2(@Y61.k com.avito.android.service_booking_common.blueprints.contact.c cVar) {
        b2().accept(new InterfaceC13184a.c(cVar));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f277180o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewFindViewById = findViewById(R.id.service_booking_details_root);
        com.avito.konveyor.adapter.j jVar = this.f277181p;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f277182q;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.util.text.a aVar3 = this.f277183r;
        com.avito.android.util.text.a aVar4 = aVar3 != null ? aVar3 : null;
        R0 r02 = this.f277184s;
        R0 r03 = r02 != null ? r02 : null;
        j jVar3 = this.f277185t;
        j jVar4 = jVar3 != null ? jVar3 : null;
        com.avito.android.service_booking_utils.ux_feedback.a aVar5 = this.f277189x;
        this.f277177B = new p(viewFindViewById, jVar2, aVar2, aVar4, r03, jVar4, aVar5 != null ? aVar5 : null);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        C19918B.a(getF21241d(), this, new c(), 2);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f277180o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        p pVar = this.f277177B;
        if (pVar != null) {
            U.b(pVar.f277475r, null);
        }
        this.f277177B = null;
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        Set<TV0.d<?, ?>> set = this.f277188w;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_booking_common.blueprints.contact.d) {
                ((com.avito.android.service_booking_common.blueprints.contact.d) dVar).D7(this);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        Set<TV0.d<?, ?>> set = this.f277188w;
        if (set == null) {
            set = null;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_booking_common.blueprints.contact.d) {
                ((com.avito.android.service_booking_common.blueprints.contact.d) dVar).e();
            }
        }
        super.onStop();
    }
}
