package com.avito.android.hotel_booking;

import Cd.C13243a;
import RI.b;
import RI.d;
import VU.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.hotel_booking.HotelBookingActivity;
import com.avito.android.hotel_booking.di.C30781b;
import com.avito.android.hotel_booking.di.InterfaceC30799u;
import com.avito.android.hotel_booking.h;
import com.avito.android.hotel_booking.mvi.HotelBookingScreen;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import com.avito.android.hotel_booking.mvi.entity.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.google.android.material.appbar.MaterialToolbar;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: HotelBookingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelBookingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f163213t = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public j f163215n;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f163217p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f163218q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f163219r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public com.avito.android.hotel_booking.h f163220s;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f163214m = C35961v3.a(this);

    /* renamed from: o, reason: collision with root package name */
    @k
    public final O0 f163216o = new O0(m0.f406844a.b(com.avito.android.hotel_booking.i.class), new g(), new f(new i()), new h());

    /* compiled from: HotelBookingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingActivity$a;", "", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HotelBookingActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<RI.d, G0> {
        @Override // Y41.l
        public final G0 invoke(RI.d dVar) {
            com.avito.android.hotel_booking.h hVar;
            LinearLayout linearLayout;
            MaterialToolbar materialToolbar;
            RI.d dVar2 = dVar;
            HotelBookingActivity hotelBookingActivity = (HotelBookingActivity) this.receiver;
            a aVar = HotelBookingActivity.f163213t;
            hotelBookingActivity.getClass();
            if (dVar2 instanceof d.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = hotelBookingActivity.f163218q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                d.b bVar = (d.b) dVar2;
                b.a.a(aVar2, bVar.f14295a, null, bVar.f14296b, 2);
            } else if (dVar2 instanceof d.c) {
                com.avito.android.hotel_booking.h hVar2 = hotelBookingActivity.f163220s;
                if (hVar2 != null) {
                    int i12 = ((d.c) dVar2).f14297a;
                    h.a aVar3 = hVar2.f163615r;
                    aVar3.f53878a = i12;
                    hVar2.f163614q.x1(aVar3);
                }
            } else if (dVar2 instanceof d.a) {
                hotelBookingActivity.finish();
            } else if (dVar2 instanceof d.C0949d) {
                com.avito.android.hotel_booking.h hVar3 = hotelBookingActivity.f163220s;
                if (hVar3 != null && (materialToolbar = hVar3.f163599b) != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, materialToolbar, ((d.C0949d) dVar2).f14298a, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                }
            } else if ((dVar2 instanceof d.e) && (hVar = hotelBookingActivity.f163220s) != null && (linearLayout = hVar.f163606i) != null) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, linearLayout, ((d.e) dVar2).f14299a, null, null, null, f.a.f125253a, 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelBookingActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<HotelBookingState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(HotelBookingState hotelBookingState) {
            String title;
            String style;
            HotelBookingState hotelBookingState2 = hotelBookingState;
            HotelBookingActivity hotelBookingActivity = HotelBookingActivity.this;
            com.avito.android.hotel_booking.h hVar = hotelBookingActivity.f163220s;
            if (hVar != null) {
                com.avito.android.hotel_booking.mvi.entity.a aVar = hotelBookingState2.f163879m;
                boolean z12 = aVar instanceof a.c;
                SpinnerOverlay spinnerOverlay = hVar.f163613p;
                RecyclerView recyclerView = hVar.f163612o;
                ShimmerLayout shimmerLayout = hVar.f163600c;
                NestedScrollView nestedScrollView = hVar.f163601d;
                Button button = hVar.f163605h;
                if (z12) {
                    D6.w(nestedScrollView);
                    D6.w(shimmerLayout);
                    D6.H(recyclerView);
                    D6.w(button);
                    a.c cVar = (a.c) aVar;
                    spinnerOverlay.setVisibility(cVar.f163890b ? 0 : 8);
                    com.avito.konveyor.adapter.d dVar = hotelBookingActivity.f163219r;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(cVar.f163889a, null);
                } else {
                    boolean z13 = aVar instanceof a.d;
                    TextView textView = hVar.f163603f;
                    TextView textView2 = hVar.f163602e;
                    if (z13) {
                        D6.H(nestedScrollView);
                        D6.w(shimmerLayout);
                        D6.w(spinnerOverlay);
                        D6.w(hVar.f163604g);
                        D6.w(recyclerView);
                        D6.H(button);
                        button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(22, aVar, hotelBookingActivity));
                        a.d dVar2 = (a.d) aVar;
                        ButtonAction buttonAction = dVar2.f163893c;
                        if (buttonAction != null && (style = buttonAction.getStyle()) != null) {
                            VU.b.f17147t.getClass();
                            button.setStyle(b.a.b(hotelBookingActivity, style));
                        }
                        ButtonAction buttonAction2 = dVar2.f163893c;
                        if (buttonAction2 != null && (title = buttonAction2.getTitle()) != null) {
                            button.setText(title);
                        }
                        I5.a(textView2, dVar2.f163891a.k0(hotelBookingActivity), false);
                        I5.a(textView, dVar2.f163892b.k0(hotelBookingActivity), false);
                    } else if (aVar instanceof a.C4801a) {
                        D6.H(nestedScrollView);
                        D6.w(shimmerLayout);
                        D6.w(spinnerOverlay);
                        D6.w(recyclerView);
                        D6.w(button);
                        a.C4801a c4801a = (a.C4801a) aVar;
                        I5.a(textView2, c4801a.f163886a.k0(hotelBookingActivity), false);
                        I5.a(textView, c4801a.f163887b.k0(hotelBookingActivity), false);
                    } else if (aVar instanceof a.b) {
                        D6.w(nestedScrollView);
                        D6.H(shimmerLayout);
                        D6.w(spinnerOverlay);
                        D6.w(recyclerView);
                        D6.w(button);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelBookingActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.HotelBookingActivity$onCreate$3", f = "HotelBookingActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f163222q;

        /* compiled from: HotelBookingActivity.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.hotel_booking.HotelBookingActivity$onCreate$3$1", f = "HotelBookingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f163224q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163225r;

            /* compiled from: HotelBookingActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.hotel_booking.HotelBookingActivity$d$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4770a extends C42801a implements p<RI.c, Continuation<? super G0>, Object>, SuspendFunction {
                @l
                public final G0 a(@k RI.c cVar) {
                    HotelBookingActivity hotelBookingActivity = (HotelBookingActivity) this.receiver;
                    com.avito.android.hotel_booking.h hVar = hotelBookingActivity.f163220s;
                    if (hVar != null) {
                        int i12 = cVar.f14292e ? 0 : 8;
                        LinearLayout linearLayout = hVar.f163606i;
                        linearLayout.setVisibility(i12);
                        D6.l(true, linearLayout, new com.avito.android.hotel_booking.b(hVar));
                        PrintableText printableText = cVar.f14291d;
                        String strK0 = printableText.k0(hotelBookingActivity);
                        Button button = hVar.f163610m;
                        button.setText(strK0);
                        b.a aVar = VU.b.f17147t;
                        int i13 = cVar.f14290c;
                        int iJ2 = C35835l0.j(i13, hotelBookingActivity);
                        aVar.getClass();
                        button.setStyle(b.a.c(iJ2, hotelBookingActivity));
                        String strK02 = printableText.k0(hotelBookingActivity);
                        Button button2 = hVar.f163611n;
                        button2.setText(strK02);
                        button2.setStyle(b.a.c(C35835l0.j(i13, hotelBookingActivity), hotelBookingActivity));
                        com.avito.android.util.text.j.a(hVar.f163608k, cVar.f14288a, null);
                        com.avito.android.util.text.j.a(hVar.f163609l, cVar.f14289b, null);
                        boolean z12 = cVar.f14293f;
                        hVar.f163607j.setVisibility(!z12 ? 0 : 8);
                        button.setVisibility(!z12 ? 0 : 8);
                        button2.setVisibility(z12 ? 0 : 8);
                    }
                    return G0.f406611a;
                }

                @Override // Y41.p
                public final /* bridge */ /* synthetic */ Object invoke(RI.c cVar, Continuation<? super G0> continuation) {
                    return a(cVar);
                }
            }

            /* compiled from: HotelBookingActivity.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.hotel_booking.HotelBookingActivity$onCreate$3$1$3", f = "HotelBookingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f163226q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ HotelBookingActivity f163227r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HotelBookingActivity hotelBookingActivity, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f163227r = hotelBookingActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    b bVar = new b(this.f163227r, continuation);
                    bVar.f163226q = obj;
                    return bVar;
                }

                @Override // Y41.p
                public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
                    return ((b) create(bool, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    Boolean bool = (Boolean) this.f163226q;
                    a aVar = HotelBookingActivity.f163213t;
                    this.f163227r.a2().accept(new b.j(bool.booleanValue()));
                    return G0.f406611a;
                }
            }

            /* compiled from: HotelBookingActivity.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.hotel_booking.HotelBookingActivity$onCreate$3$1$4", f = "HotelBookingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f163228q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ HotelBookingActivity f163229r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HotelBookingActivity hotelBookingActivity, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f163229r = hotelBookingActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    c cVar = new c(this.f163229r, continuation);
                    cVar.f163228q = obj;
                    return cVar;
                }

                @Override // Y41.p
                public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
                    return ((c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    C43501a c43501a = (C43501a) this.f163228q;
                    a aVar = HotelBookingActivity.f163213t;
                    this.f163229r.a2().accept(new b.g(c43501a));
                    return G0.f406611a;
                }
            }

            /* compiled from: SafeCollector.common.kt */
            @s0
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.hotel_booking.HotelBookingActivity$d$a$d, reason: collision with other inner class name */
            public static final class C4771d implements InterfaceC43160i<RI.c> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n2 f163230b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.hotel_booking.HotelBookingActivity$d$a$d$a, reason: collision with other inner class name */
                public static final class C4772a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43172j f163231b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.avito.android.hotel_booking.HotelBookingActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2", f = "HotelBookingActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: com.avito.android.hotel_booking.HotelBookingActivity$d$a$d$a$a, reason: collision with other inner class name */
                    public static final class C4773a extends ContinuationImpl {

                        /* renamed from: q, reason: collision with root package name */
                        public /* synthetic */ Object f163232q;

                        /* renamed from: r, reason: collision with root package name */
                        public int f163233r;

                        public C4773a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @l
                        public final Object invokeSuspend(@k Object obj) {
                            this.f163232q = obj;
                            this.f163233r |= BeduinInputModel.MIN_TEXT_VERSION;
                            return C4772a.this.emit(null, this);
                        }
                    }

                    public C4772a(InterfaceC43172j interfaceC43172j) {
                        this.f163231b = interfaceC43172j;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    @Y61.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.avito.android.hotel_booking.HotelBookingActivity.d.a.C4771d.C4772a.C4773a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.avito.android.hotel_booking.HotelBookingActivity$d$a$d$a$a r0 = (com.avito.android.hotel_booking.HotelBookingActivity.d.a.C4771d.C4772a.C4773a) r0
                            int r1 = r0.f163233r
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f163233r = r1
                            goto L18
                        L13:
                            com.avito.android.hotel_booking.HotelBookingActivity$d$a$d$a$a r0 = new com.avito.android.hotel_booking.HotelBookingActivity$d$a$d$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f163232q
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f163233r
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.C42729a0.b(r6)
                            goto L43
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.C42729a0.b(r6)
                            com.avito.android.hotel_booking.mvi.entity.HotelBookingState r5 = (com.avito.android.hotel_booking.mvi.entity.HotelBookingState) r5
                            RI.c r5 = r5.f163880n
                            r0.f163233r = r3
                            kotlinx.coroutines.flow.j r6 = r4.f163231b
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L43
                            return r1
                        L43:
                            kotlin.G0 r5 = kotlin.G0.f406611a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.HotelBookingActivity.d.a.C4771d.C4772a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                public C4771d(n2 n2Var) {
                    this.f163230b = n2Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43160i
                @l
                public final Object collect(@k InterfaceC43172j<? super RI.c> interfaceC43172j, @k Continuation continuation) {
                    Object objCollect = this.f163230b.collect(new C4772a(interfaceC43172j), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HotelBookingActivity hotelBookingActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f163225r = hotelBookingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f163225r, continuation);
                aVar.f163224q = obj;
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
                T t12 = (T) this.f163224q;
                a aVar = HotelBookingActivity.f163213t;
                HotelBookingActivity hotelBookingActivity = this.f163225r;
                C43175k.K(new C43197r1(new C4770a(2, hotelBookingActivity, HotelBookingActivity.class, "renderFloatingBlock", "renderFloatingBlock(Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingFloatingBlockViewState;)V", 4), C43175k.r(new C4771d(hotelBookingActivity.a2().getState()))), t12);
                C43175k.K(new C43197r1(new b(hotelBookingActivity, null), y.a(K2.h(hotelBookingActivity))), t12);
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = hotelBookingActivity.f163218q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                C43175k.K(new C43197r1(new c(hotelBookingActivity, null), y.a(aVar2.d9())), t12);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return HotelBookingActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163222q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                HotelBookingActivity hotelBookingActivity = HotelBookingActivity.this;
                a aVar = new a(hotelBookingActivity, null);
                this.f163222q = 1;
                if (C23056p0.b(hotelBookingActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: HotelBookingActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRI/b;", "it", "Lkotlin/G0;", "invoke", "(LRI/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<RI.b, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RI.b bVar) {
            a aVar = HotelBookingActivity.f163213t;
            HotelBookingActivity.this.a2().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f163236l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f163236l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f163236l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return HotelBookingActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return HotelBookingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: HotelBookingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/hotel_booking/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.hotel_booking.i> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.hotel_booking.i invoke() {
            j jVar = HotelBookingActivity.this.f163215n;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.hotel_booking.i) jVar.get();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C30781b.a().a(cv.c.a(this), (InterfaceC30799u) C29972i.a(C29972i.b(this), InterfaceC30799u.class), new C28478k(HotelBookingScreen.f163820d, s.a(this), null, 4, null), new e(), (HotelBookingOpenParams) this.f163214m.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163217p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.hotel_booking.i a2() {
        return (com.avito.android.hotel_booking.i) this.f163216o.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163217p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.hotel_booking_activity, (ViewGroup) null, false);
        com.avito.konveyor.adapter.d dVar = this.f163219r;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.hotel_booking.h hVar = new com.avito.android.hotel_booking.h(viewInflate, dVar);
        this.f163220s = hVar;
        final int i12 = 0;
        hVar.f163604g.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_booking.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163272c;

            {
                this.f163272c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelBookingActivity hotelBookingActivity = this.f163272c;
                switch (i12) {
                    case 0:
                        HotelBookingActivity.a aVar = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.n.f14286a);
                        break;
                    case 1:
                        HotelBookingActivity.a aVar2 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 2:
                        HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 3:
                        HotelBookingActivity.a aVar4 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.c.f14269a);
                        break;
                    default:
                        HotelBookingActivity.a aVar5 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.C0948b.f14268a);
                        break;
                }
            }
        });
        final int i13 = 1;
        hVar.f163610m.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_booking.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163272c;

            {
                this.f163272c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelBookingActivity hotelBookingActivity = this.f163272c;
                switch (i13) {
                    case 0:
                        HotelBookingActivity.a aVar = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.n.f14286a);
                        break;
                    case 1:
                        HotelBookingActivity.a aVar2 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 2:
                        HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 3:
                        HotelBookingActivity.a aVar4 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.c.f14269a);
                        break;
                    default:
                        HotelBookingActivity.a aVar5 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.C0948b.f14268a);
                        break;
                }
            }
        });
        final int i14 = 2;
        hVar.f163611n.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_booking.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163272c;

            {
                this.f163272c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelBookingActivity hotelBookingActivity = this.f163272c;
                switch (i14) {
                    case 0:
                        HotelBookingActivity.a aVar = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.n.f14286a);
                        break;
                    case 1:
                        HotelBookingActivity.a aVar2 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 2:
                        HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 3:
                        HotelBookingActivity.a aVar4 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.c.f14269a);
                        break;
                    default:
                        HotelBookingActivity.a aVar5 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.C0948b.f14268a);
                        break;
                }
            }
        });
        final int i15 = 3;
        hVar.f163609l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_booking.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163272c;

            {
                this.f163272c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelBookingActivity hotelBookingActivity = this.f163272c;
                switch (i15) {
                    case 0:
                        HotelBookingActivity.a aVar = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.n.f14286a);
                        break;
                    case 1:
                        HotelBookingActivity.a aVar2 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 2:
                        HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 3:
                        HotelBookingActivity.a aVar4 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.c.f14269a);
                        break;
                    default:
                        HotelBookingActivity.a aVar5 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.C0948b.f14268a);
                        break;
                }
            }
        });
        final int i16 = 4;
        hVar.f163599b.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_booking.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelBookingActivity f163272c;

            {
                this.f163272c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelBookingActivity hotelBookingActivity = this.f163272c;
                switch (i16) {
                    case 0:
                        HotelBookingActivity.a aVar = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.n.f14286a);
                        break;
                    case 1:
                        HotelBookingActivity.a aVar2 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 2:
                        HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.e.f14272a);
                        break;
                    case 3:
                        HotelBookingActivity.a aVar4 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.c.f14269a);
                        break;
                    default:
                        HotelBookingActivity.a aVar5 = HotelBookingActivity.f163213t;
                        hotelBookingActivity.a2().accept(b.C0948b.f14268a);
                        break;
                }
            }
        });
        setContentView(viewInflate);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f163217p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, a2(), new b(1, this, HotelBookingActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingOneTimeEvent;)V", 0), new c());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f163217p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.hotel_booking.h hVar = this.f163220s;
        if (hVar != null) {
            hVar.f163612o.setAdapter(null);
        }
        this.f163220s = null;
    }
}
