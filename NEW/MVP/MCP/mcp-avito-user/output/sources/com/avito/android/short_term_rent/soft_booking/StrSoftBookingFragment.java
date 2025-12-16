package com.avito.android.short_term_rent.soft_booking;

import Cd.C13243a;
import Ju.InterfaceC14249c;
import Xv0.InterfaceC17053a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.StrSoftBookingScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogResult;
import com.avito.android.ui.fragments.BaseFragment;
import gw0.InterfaceC40745b;
import java.util.Date;
import java.util.List;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import ow0.InterfaceC44950a;
import ow0.InterfaceC44952b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrSoftBookingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/StrSoftBookingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "b", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StrSoftBookingFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f282537y0 = {m0.f406844a.e(new Y(StrSoftBookingFragment.class, "strSoftBookingView", "getStrSoftBookingView()Lcom/avito/android/short_term_rent/soft_booking/view/StrSoftBookingView;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public C f282538n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f282539o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f282540p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f282541q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f282542r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public AbstractC25658a<? extends RecyclerView.C> f282543s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC36134w1 f282544t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC17053a f282545u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.guests_selector.d f282546v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f282547w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f282548x0;

    /* compiled from: StrSoftBookingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/StrSoftBookingFragment$a;", "", "<init>", "()V", "", "ADVERT_ID_NOT_SET_ERROR", "Ljava/lang/String;", "ARGUMENTS_NOT_SET_ERROR", "SOURCE_NOT_SET_ERROR", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSoftBookingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/StrSoftBookingFragment$b;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: StrSoftBookingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/soft_booking/view/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<com.avito.android.short_term_rent.soft_booking.view.b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.short_term_rent.soft_booking.view.b bVar) {
            com.avito.android.short_term_rent.soft_booking.view.b bVar2 = bVar;
            bVar2.u();
            StrSoftBookingFragment strSoftBookingFragment = StrSoftBookingFragment.this;
            bVar2.g(new o(strSoftBookingFragment));
            bVar2.l(new s(strSoftBookingFragment));
            bVar2.L(new t(strSoftBookingFragment));
            bVar2.w(new u(strSoftBookingFragment));
            bVar2.n(new v(strSoftBookingFragment));
            bVar2.s(new w(strSoftBookingFragment));
            bVar2.E(new x(strSoftBookingFragment));
            bVar2.p(new y(strSoftBookingFragment));
            bVar2.x(new z(strSoftBookingFragment));
            bVar2.C(new com.avito.android.short_term_rent.soft_booking.e(strSoftBookingFragment));
            bVar2.A(new com.avito.android.short_term_rent.soft_booking.f(strSoftBookingFragment));
            bVar2.b(new com.avito.android.short_term_rent.soft_booking.g(strSoftBookingFragment));
            bVar2.j(new com.avito.android.short_term_rent.soft_booking.h(strSoftBookingFragment));
            bVar2.t(new com.avito.android.short_term_rent.soft_booking.i(strSoftBookingFragment));
            bVar2.D(new com.avito.android.short_term_rent.soft_booking.j(strSoftBookingFragment));
            bVar2.f(new com.avito.android.short_term_rent.soft_booking.k(strSoftBookingFragment));
            bVar2.o(new l(strSoftBookingFragment));
            bVar2.I(new m(strSoftBookingFragment));
            bVar2.d(new n(strSoftBookingFragment));
            bVar2.i(new p(strSoftBookingFragment));
            bVar2.k(new q(strSoftBookingFragment));
            bVar2.O(new r(strSoftBookingFragment));
            return G0.f406611a;
        }
    }

    /* compiled from: StrSoftBookingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$onViewCreated$2", f = "StrSoftBookingFragment.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282550q;

        /* compiled from: StrSoftBookingFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$onViewCreated$2$1", f = "StrSoftBookingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f282552q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSoftBookingFragment f282553r;

            /* compiled from: StrSoftBookingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$onViewCreated$2$1$1", f = "StrSoftBookingFragment.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$d$a$a, reason: collision with other inner class name */
            public static final class C8437a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f282554q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSoftBookingFragment f282555r;

                /* compiled from: StrSoftBookingFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C8438a extends N implements Y41.l<com.avito.android.short_term_rent.soft_booking.mvi.state.a, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrSoftBookingFragment f282556l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8438a(StrSoftBookingFragment strSoftBookingFragment) {
                        super(1);
                        this.f282556l = strSoftBookingFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar) {
                        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                        C47313c c47313c = this.f282556l.f282547w0;
                        kotlin.reflect.n<Object> nVar = StrSoftBookingFragment.f282537y0[0];
                        ((com.avito.android.short_term_rent.soft_booking.view.a) c47313c.a()).b(aVar);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8437a(StrSoftBookingFragment strSoftBookingFragment, Continuation<? super C8437a> continuation) {
                    super(2, continuation);
                    this.f282555r = strSoftBookingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8437a(this.f282555r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8437a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f282554q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                        StrSoftBookingFragment strSoftBookingFragment = this.f282555r;
                        n2<com.avito.android.short_term_rent.soft_booking.mvi.state.a> state = strSoftBookingFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = strSoftBookingFragment.f282541q0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8438a c8438a = new C8438a(strSoftBookingFragment);
                        this.f282554q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8438a, this) == coroutine_suspended) {
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

            /* compiled from: StrSoftBookingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$onViewCreated$2$1$2", f = "StrSoftBookingFragment.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f282557q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSoftBookingFragment f282558r;

                /* compiled from: StrSoftBookingFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$d$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8439a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSoftBookingFragment f282559b;

                    public C8439a(StrSoftBookingFragment strSoftBookingFragment) {
                        this.f282559b = strSoftBookingFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC44952b interfaceC44952b = (InterfaceC44952b) obj;
                        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                        StrSoftBookingFragment strSoftBookingFragment = this.f282559b;
                        if (interfaceC44952b instanceof InterfaceC44952b.a) {
                            ActivityC22955m activityC22955mL1 = strSoftBookingFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.finish();
                            }
                        } else if (interfaceC44952b instanceof InterfaceC44952b.e) {
                            Arguments arguments = ((InterfaceC44952b.e) interfaceC44952b).f422368a;
                            if (arguments != null) {
                                com.avito.android.select.bottom_sheet.c.a(strSoftBookingFragment, arguments).show(strSoftBookingFragment.getParentFragmentManager(), "tag_soft_booking_str");
                            }
                        } else {
                            if (interfaceC44952b instanceof InterfaceC44952b.f) {
                                InterfaceC44952b.f fVar = (InterfaceC44952b.f) interfaceC44952b;
                                com.avito.android.guests_selector.d dVar = strSoftBookingFragment.f282546v0;
                                (dVar != null ? dVar : null).a(fVar.f422369a, new com.avito.android.short_term_rent.soft_booking.d(strSoftBookingFragment)).show(strSoftBookingFragment.getParentFragmentManager(), "tag_soft_booking_str");
                            } else if (interfaceC44952b instanceof InterfaceC44952b.C12249b) {
                                DeepLink deepLink = ((InterfaceC44952b.C12249b) interfaceC44952b).f422365a;
                                if (deepLink != null) {
                                    com.avito.android.deeplink_handler.handler.composite.a aVar = strSoftBookingFragment.f282540p0;
                                    if (aVar == null) {
                                        aVar = null;
                                    }
                                    b.a.a(aVar, deepLink, "key_soft_booking_str", null, 4);
                                }
                            } else if (interfaceC44952b instanceof InterfaceC44952b.c) {
                                String str = ((InterfaceC44952b.c) interfaceC44952b).f422366a;
                                if (str != null) {
                                    InterfaceC36134w1 interfaceC36134w1 = strSoftBookingFragment.f282544t0;
                                    strSoftBookingFragment.startActivity((interfaceC36134w1 != null ? interfaceC36134w1 : null).j(str, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : null));
                                }
                            } else {
                                boolean z12 = interfaceC44952b instanceof InterfaceC44952b.h;
                                C47313c c47313c = strSoftBookingFragment.f282547w0;
                                if (z12 || (interfaceC44952b instanceof InterfaceC44952b.d)) {
                                    kotlin.reflect.n<Object> nVar = StrSoftBookingFragment.f282537y0[0];
                                    ((com.avito.android.short_term_rent.soft_booking.view.a) c47313c.a()).a(interfaceC44952b);
                                } else if (interfaceC44952b instanceof InterfaceC44952b.g) {
                                    StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams = ((InterfaceC44952b.g) interfaceC44952b).f422370a;
                                    StrSoftBookingPromoCodesDialogFragment.f282484m0.getClass();
                                    StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment = new StrSoftBookingPromoCodesDialogFragment();
                                    strSoftBookingPromoCodesDialogFragment.f282489k0.setValue(strSoftBookingPromoCodesDialogFragment, StrSoftBookingPromoCodesDialogFragment.f282485n0[0], strSoftBookingPromoCodesDialogOpenParams);
                                    strSoftBookingPromoCodesDialogFragment.show(strSoftBookingFragment.getParentFragmentManager(), "STR_SOFT_BOOKING_PROMO_CODES_DIALOG_TAG");
                                }
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
                        return new C42801a(2, this.f282559b, StrSoftBookingFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(StrSoftBookingFragment strSoftBookingFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f282558r = strSoftBookingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f282558r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f282557q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                        StrSoftBookingFragment strSoftBookingFragment = this.f282558r;
                        InterfaceC43160i<InterfaceC44952b> events = strSoftBookingFragment.q5().getEvents();
                        C8439a c8439a = new C8439a(strSoftBookingFragment);
                        this.f282557q = 1;
                        if (events.collect(c8439a, this) == coroutine_suspended) {
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

            /* compiled from: StrSoftBookingFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$onViewCreated$2$1$3", f = "StrSoftBookingFragment.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f282560q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSoftBookingFragment f282561r;

                /* compiled from: StrSoftBookingFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment$d$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C8440a extends H implements Y41.l<InterfaceC14249c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(InterfaceC14249c interfaceC14249c) {
                        InterfaceC14249c interfaceC14249c2 = interfaceC14249c;
                        StrSoftBookingFragment strSoftBookingFragment = (StrSoftBookingFragment) this.receiver;
                        kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                        strSoftBookingFragment.getClass();
                        if (interfaceC14249c2 instanceof CalendarLink.b.C3988b) {
                            strSoftBookingFragment.q5().accept(new InterfaceC44950a.f((CalendarLink.b.C3988b) interfaceC14249c2));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(StrSoftBookingFragment strSoftBookingFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f282561r = strSoftBookingFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f282561r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f282560q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSoftBookingFragment strSoftBookingFragment = this.f282561r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = strSoftBookingFragment.f282540p0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        C8440a c8440a = new C8440a(1, strSoftBookingFragment, StrSoftBookingFragment.class, "handleDeeplinkEvent", "handleDeeplinkEvent(Lcom/avito/android/deep_linking/links/result/DeeplinkResult;)V", 0);
                        this.f282560q = 1;
                        Object objCollect = new C34979b(new C34978a(kotlinx.coroutines.rx3.y.a(aVar.d9()))).collect(new C34980c(c8440a), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
                        }
                        if (objCollect == coroutine_suspended) {
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
            public a(StrSoftBookingFragment strSoftBookingFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f282553r = strSoftBookingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f282553r, continuation);
                aVar.f282552q = obj;
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
                T t12 = (T) this.f282552q;
                StrSoftBookingFragment strSoftBookingFragment = this.f282553r;
                C43259k.d(t12, null, null, new C8437a(strSoftBookingFragment, null), 3);
                C43259k.d(t12, null, null, new b(strSoftBookingFragment, null), 3);
                C43259k.d(t12, null, null, new c(strSoftBookingFragment, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSoftBookingFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282550q;
            if (i12 == 0) {
                C42729a0.b(obj);
                StrSoftBookingFragment strSoftBookingFragment = StrSoftBookingFragment.this;
                InterfaceC22983P viewLifecycleOwner = strSoftBookingFragment.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(strSoftBookingFragment, null);
                this.f282550q = 1;
                if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrSoftBookingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<String, Bundle, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult = (StrSoftBookingPromoCodesDialogResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("STR_SOFT_BOOKING_PROMO_CODES_DIALOG_RESULT_KEY", StrSoftBookingPromoCodesDialogResult.class) : bundle2.getParcelable("STR_SOFT_BOOKING_PROMO_CODES_DIALOG_RESULT_KEY"));
            boolean z12 = strSoftBookingPromoCodesDialogResult instanceof StrSoftBookingPromoCodesDialogResult.Apply;
            StrSoftBookingFragment strSoftBookingFragment = StrSoftBookingFragment.this;
            if (z12) {
                kotlin.reflect.n<Object>[] nVarArr = StrSoftBookingFragment.f282537y0;
                StrSoftBookingPromoCodesDialogResult.Apply apply = (StrSoftBookingPromoCodesDialogResult.Apply) strSoftBookingPromoCodesDialogResult;
                strSoftBookingFragment.q5().accept(new InterfaceC44950a.r(apply.f282506b, apply.f282507c));
            } else if (strSoftBookingPromoCodesDialogResult instanceof StrSoftBookingPromoCodesDialogResult.Select) {
                kotlin.reflect.n<Object>[] nVarArr2 = StrSoftBookingFragment.f282537y0;
                StrSoftBookingPromoCodesDialogResult.Select select = (StrSoftBookingPromoCodesDialogResult.Select) strSoftBookingPromoCodesDialogResult;
                strSoftBookingFragment.q5().accept(new InterfaceC44950a.u(select.f282510b, select.f282511c));
            } else if (strSoftBookingPromoCodesDialogResult instanceof StrSoftBookingPromoCodesDialogResult.Disable) {
                kotlin.reflect.n<Object>[] nVarArr3 = StrSoftBookingFragment.f282537y0;
                B bQ5 = strSoftBookingFragment.q5();
                PrintableText printableText = ((StrSoftBookingPromoCodesDialogResult.Disable) strSoftBookingPromoCodesDialogResult).f282508b;
                bQ5.accept(new InterfaceC44950a.s(printableText != null ? printableText.k0(strSoftBookingFragment.requireContext()) : null));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f282563l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f282563l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f282563l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrSoftBookingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f282565l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f282565l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f282565l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f282566l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f282566l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f282566l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f282567l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f282567l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f282567l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSoftBookingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/B;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/short_term_rent/soft_booking/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<B> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final B invoke() {
            C c12 = StrSoftBookingFragment.this.f282538n0;
            if (c12 == null) {
                c12 = null;
            }
            return (B) c12.get();
        }
    }

    static {
        new a(null);
    }

    public StrSoftBookingFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f282539o0 = new O0(m0.f406844a.b(B.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f282547w0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        q5().accept(new InterfaceC44950a.h(str, list, str2));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f282541q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.soft_booking_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.lib.design.tooltip.k kVar = this.f282548x0;
        if (kVar != null) {
            kVar.b(new TooltipState(null, false, null, null, null, null, null, null, null, null, false, null, null, TooltipState.State.f181286c, 8191, null));
        }
        this.f282548x0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        q5().accept(InterfaceC44950a.z.f422363a);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f282543s0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        com.avito.android.util.text.a aVar = this.f282542r0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.short_term_rent.soft_booking.view.l lVar = new com.avito.android.short_term_rent.soft_booking.view.l(view, abstractC25658a, aVar);
        new c().invoke((com.avito.android.short_term_rent.soft_booking.view.b) lVar.f282987c.getValue());
        C47313c c47313c = this.f282547w0;
        kotlin.reflect.n<Object> nVar = f282537y0[0];
        c47313c.b(this, lVar);
        q5().f282534N.g(StrSoftBookingScreen.f90524d);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f282543s0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        abstractC25658a2.o(q5().f282534N.B0());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        C22960s.b(this, "STR_SOFT_BOOKING_PROMO_CODES_DIALOG_REQUEST_KEY", new e());
        ScreenPerformanceTracker screenPerformanceTracker = this.f282541q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Arguments not set");
        }
        String string = arguments.getString("advert_id");
        if (string == null) {
            throw new IllegalStateException("advertId not set");
        }
        String string2 = arguments.getString(SearchParamsConverterKt.SOURCE);
        if (string2 == null) {
            throw new IllegalStateException("source not set");
        }
        String string3 = arguments.getString("check_in_date");
        Date dateA = string3 != null ? com.avito.android.short_term_rent.utils.j.a(string3) : null;
        String string4 = arguments.getString("check_out_date");
        Date dateA2 = string4 != null ? com.avito.android.short_term_rent.utils.j.a(string4) : null;
        int i12 = arguments.getInt("guest_count", 2);
        String string5 = arguments.getString("guests_detailed");
        boolean z12 = arguments.getBoolean("is_children", true);
        String string6 = arguments.getString("x_hash");
        Boolean boolValueOf = arguments.containsKey("no_refund") ? Boolean.valueOf(arguments.getBoolean("no_refund")) : null;
        String string7 = arguments.getString("payment_type");
        String string8 = arguments.getString("from_page");
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.short_term_rent.di.component.a.a().a((InterfaceC40745b) C29972i.a(C29972i.b(this), InterfaceC40745b.class), cv.c.b(this), string, dateA, dateA2, i12, string2, string5, z12, string6, boolValueOf, string7, string8, com.avito.android.analytics.screens.s.c(this)).a(this);
        long jB2 = fA2.b();
        ScreenPerformanceTracker screenPerformanceTracker = this.f282541q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(jB2);
    }

    public final B q5() {
        return (B) this.f282539o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
