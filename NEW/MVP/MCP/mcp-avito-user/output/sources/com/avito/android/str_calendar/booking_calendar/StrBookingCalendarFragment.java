package com.avito.android.str_calendar.booking_calendar;

import Cd.C13243a;
import UP0.a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.a;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import py0.InterfaceC47164a;
import py0.InterfaceC47165b;
import z1.AbstractC50339a;

/* compiled from: StrBookingCalendarFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/StrBookingCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingCalendarFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f286201z0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public p f286202n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f286203o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f286204p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f286205q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public L0 f286206r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.booking_calendar.h f286207s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f286208t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f286209u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f286210v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.widget_filters_shared.a f286211w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.str_calendar.booking_calendar.m f286212x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f286213y0;

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/StrBookingCalendarFragment$a;", "", "<init>", "()V", "", "ARGUMENTS_NOT_SET_ERROR", "Ljava/lang/String;", "INIT_PARAMETERS_CANT_BE_NULL_ERROR", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/StrBookingCalendarFragment$b;", "", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* compiled from: StrBookingCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/StrBookingCalendarFragment$b$a;", "", "<init>", "()V", "", "EXTRA_INIT_PARAMETERS", "Ljava/lang/String;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC47165b, G0> {
        public final void f(@Y61.k InterfaceC47165b interfaceC47165b) {
            ActivityC22955m activityC22955mL1;
            y f21241d;
            StrBookingCalendarFragment strBookingCalendarFragment = (StrBookingCalendarFragment) this.receiver;
            int i12 = StrBookingCalendarFragment.f286201z0;
            strBookingCalendarFragment.getClass();
            if (interfaceC47165b instanceof InterfaceC47165b.e) {
                InterfaceC47165b.e eVar = (InterfaceC47165b.e) interfaceC47165b;
                com.avito.android.str_calendar.booking_calendar.m mVar = strBookingCalendarFragment.f286212x0;
                if (mVar == null) {
                    mVar = null;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) mVar.f286356d.getLayoutManager();
                L0 l02 = strBookingCalendarFragment.f286206r0;
                gridLayoutManager.b2(eVar.f428907a, (l02 != null ? l02 : null).d() / 4);
                return;
            }
            if (interfaceC47165b instanceof InterfaceC47165b.g) {
                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, strBookingCalendarFragment.requireContext(), new com.avito.android.str_calendar.booking_calendar.e(interfaceC47165b, strBookingCalendarFragment)));
                return;
            }
            if (interfaceC47165b instanceof InterfaceC47165b.d) {
                InterfaceC47165b.d dVar = (InterfaceC47165b.d) interfaceC47165b;
                Intent intent = new Intent();
                DateRange dateRange = dVar.f428905a;
                Intent intentPutExtra = intent.putExtra("check_in_date", dateRange.f286636b).putExtra("check_out_date", dateRange.f286637c).putExtra("calendar_request_id", dVar.f428906b);
                ActivityC22955m activityC22955mL12 = strBookingCalendarFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.setResult(-1, intentPutExtra);
                }
                ActivityC22955m activityC22955mL13 = strBookingCalendarFragment.l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.finish();
                    return;
                }
                return;
            }
            if (interfaceC47165b instanceof InterfaceC47165b.c) {
                com.avito.android.widget_filters_shared.a aVar = strBookingCalendarFragment.f286211w0;
                (aVar != null ? aVar : null).accept(new a.C1124a(((InterfaceC47165b.c) interfaceC47165b).f428904a));
                return;
            }
            if (interfaceC47165b instanceof InterfaceC47165b.f) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                com.avito.android.str_calendar.booking_calendar.m mVar2 = strBookingCalendarFragment.f286212x0;
                strBookingCalendarFragment.f286213y0 = com.avito.android.component.toast.c.b(cVar, (mVar2 != null ? mVar2 : null).f286357e, com.avito.android.printable_text.b.f(((InterfaceC47165b.f) interfaceC47165b).f428908a), null, null, null, null, -1, ToastBarPosition.f181044b, null, false, false, null, null, 3742);
            } else {
                if (interfaceC47165b instanceof InterfaceC47165b.C12298b) {
                    com.avito.android.lib.design.toast_bar.k kVar = strBookingCalendarFragment.f286213y0;
                    if (kVar != null) {
                        kVar.setState(new ToastBarState(null, null, null, null, null, null, null, 0, false, false, null, ToastBarState.State.f181136c, 2047, null));
                    }
                    strBookingCalendarFragment.f286213y0 = null;
                    return;
                }
                if (!(interfaceC47165b instanceof InterfaceC47165b.a) || (activityC22955mL1 = strBookingCalendarFragment.l1()) == null || (f21241d = activityC22955mL1.getF21241d()) == null) {
                    return;
                }
                f21241d.c();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC47165b interfaceC47165b) {
            f(interfaceC47165b);
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<StrBookingCalendarState, G0> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(StrBookingCalendarState strBookingCalendarState) {
            StrBookingCalendarState strBookingCalendarState2 = strBookingCalendarState;
            StrBookingCalendarFragment strBookingCalendarFragment = StrBookingCalendarFragment.this;
            com.avito.android.str_calendar.booking_calendar.m mVar = strBookingCalendarFragment.f286212x0;
            if (mVar == null) {
                mVar = null;
            }
            com.avito.android.str_calendar.booking_calendar.mvi.entity.a aVar = strBookingCalendarState2.f286439q;
            StrBookingCalendarScreenConfig f286448c = aVar.getF286448c();
            D6.G(mVar.f286358f, f286448c.getF286369b());
            boolean f286370c = f286448c.getF286370c();
            Toolbar toolbar = mVar.f286353a;
            D6.G(toolbar, f286370c);
            PrintableText f286447b = aVar.getF286447b();
            toolbar.setTitle(f286447b != null ? f286447b.k0(toolbar.getContext()) : null);
            boolean z12 = aVar instanceof a.d;
            com.avito.android.progress_overlay.l lVar = mVar.f286355c;
            Button button = mVar.f286358f;
            TextView textView = mVar.f286354b;
            if (z12) {
                lVar.k(null);
                D6.h(textView);
                D6.h(button);
            } else if (aVar instanceof a.c) {
                lVar.a(((a.c) aVar).f286457h.k0(toolbar.getContext()));
                D6.h(textView);
                D6.h(button);
            } else if (aVar instanceof a.b) {
                lVar.j();
                a.b bVar = (a.b) aVar;
                textView.setEnabled(bVar.f286452i);
                button.setState(new UU.a(bVar.f286454k.k0(button.getContext()), null, bVar.f286453j, false, false, new com.avito.android.str_calendar.booking_calendar.f(strBookingCalendarFragment), null, null, null, false, 986, null));
                com.avito.konveyor.adapter.d dVar = strBookingCalendarFragment.f286210v0;
                B b12 = dVar;
                if (dVar == null) {
                    b12 = 0;
                }
                b12.l(bVar.f286451h, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment$onCreateView$3", f = "StrBookingCalendarFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286215q;

        /* compiled from: StrBookingCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment$onCreateView$3$1", f = "StrBookingCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f286217q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrBookingCalendarFragment f286218r;

            /* compiled from: StrBookingCalendarFragment.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment$onCreateView$3$1$1", f = "StrBookingCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment$e$a$a, reason: collision with other inner class name */
            public static final class C8573a extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ StrBookingCalendarFragment f286219q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8573a(StrBookingCalendarFragment strBookingCalendarFragment, Continuation<? super C8573a> continuation) {
                    super(2, continuation);
                    this.f286219q = strBookingCalendarFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8573a(this.f286219q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
                    return ((C8573a) create(g02, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    int i12 = StrBookingCalendarFragment.f286201z0;
                    this.f286219q.q5().accept(InterfaceC47164a.C12297a.f428897a);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StrBookingCalendarFragment strBookingCalendarFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f286218r = strBookingCalendarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f286218r, continuation);
                aVar.f286217q = obj;
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
                T t12 = (T) this.f286217q;
                StrBookingCalendarFragment strBookingCalendarFragment = this.f286218r;
                com.avito.android.widget_filters_shared.a aVar = strBookingCalendarFragment.f286211w0;
                if (aVar == null) {
                    aVar = null;
                }
                C43175k.K(new C43197r1(new C8573a(strBookingCalendarFragment, null), aVar.getF330574Q()), t12);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrBookingCalendarFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286215q;
            if (i12 == 0) {
                C42729a0.b(obj);
                StrBookingCalendarFragment strBookingCalendarFragment = StrBookingCalendarFragment.this;
                InterfaceC22983P viewLifecycleOwner = strBookingCalendarFragment.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(strBookingCalendarFragment, null);
                this.f286215q = 1;
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

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = StrBookingCalendarFragment.f286201z0;
            StrBookingCalendarFragment.this.q5().accept(InterfaceC47164a.d.f428900a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpy0/a;", "it", "Lkotlin/G0;", "invoke", "(Lpy0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC47164a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC47164a interfaceC47164a) {
            int i12 = StrBookingCalendarFragment.f286201z0;
            StrBookingCalendarFragment.this.q5().accept(interfaceC47164a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f286222l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f286222l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f286222l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrBookingCalendarFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f286224l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f286224l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f286224l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f286225l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f286225l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f286225l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f286226l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f286226l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f286226l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrBookingCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_calendar/booking_calendar/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<o> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = StrBookingCalendarFragment.this.f286202n0;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    static {
        new a(null);
    }

    public StrBookingCalendarFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f286203o0 = new O0(m0.f406844a.b(o.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f286204p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f286204p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, q5(), new c(1, this, StrBookingCalendarFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarOneTimeEvent;)V", 0), new d());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
        View viewInflate = layoutInflater.inflate(R.layout.calendar_booking_fragment, viewGroup, false);
        InterfaceC28373a interfaceC28373a = this.f286205q0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.a aVar = this.f286208t0;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.a aVar3 = this.f286209u0;
        com.avito.konveyor.adapter.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.konveyor.adapter.d dVar = this.f286210v0;
        com.avito.android.str_calendar.booking_calendar.m mVar = new com.avito.android.str_calendar.booking_calendar.m(viewInflate, interfaceC28373a2, aVar2, aVar4, dVar != null ? dVar : null);
        this.f286212x0 = mVar;
        final int i12 = 0;
        mVar.f286353a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.booking_calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrBookingCalendarFragment f286230c;

            {
                this.f286230c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StrBookingCalendarFragment strBookingCalendarFragment = this.f286230c;
                switch (i12) {
                    case 0:
                        int i13 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.b.f428898a);
                        break;
                    case 1:
                        int i14 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.C12297a.f428897a);
                        break;
                    default:
                        int i15 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.e.f428901a);
                        break;
                }
            }
        });
        final int i13 = 1;
        mVar.f286354b.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.booking_calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrBookingCalendarFragment f286230c;

            {
                this.f286230c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StrBookingCalendarFragment strBookingCalendarFragment = this.f286230c;
                switch (i13) {
                    case 0:
                        int i132 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.b.f428898a);
                        break;
                    case 1:
                        int i14 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.C12297a.f428897a);
                        break;
                    default:
                        int i15 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.e.f428901a);
                        break;
                }
            }
        });
        final int i14 = 2;
        mVar.f286358f.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.booking_calendar.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrBookingCalendarFragment f286230c;

            {
                this.f286230c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StrBookingCalendarFragment strBookingCalendarFragment = this.f286230c;
                switch (i14) {
                    case 0:
                        int i132 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.b.f428898a);
                        break;
                    case 1:
                        int i142 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.C12297a.f428897a);
                        break;
                    default:
                        int i15 = StrBookingCalendarFragment.f286201z0;
                        strBookingCalendarFragment.q5().accept(InterfaceC47164a.e.f428901a);
                        break;
                }
            }
        });
        mVar.f286355c.f231600j = new f();
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f286204p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Arguments not set");
        }
        StrBookingCalendarInitParameters strBookingCalendarInitParameters = (StrBookingCalendarInitParameters) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("extra_init_parameters", StrBookingCalendarInitParameters.class) : arguments.getParcelable("extra_init_parameters"));
        if (strBookingCalendarInitParameters == null) {
            throw new IllegalArgumentException("initParameters can't be null");
        }
        com.avito.android.str_calendar.booking_calendar.di.a.a().a((com.avito.android.str_calendar.booking_calendar.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.booking_calendar.di.c.class), s.c(this), strBookingCalendarInitParameters, requireActivity(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f286204p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final o q5() {
        return (o) this.f286203o0.getValue();
    }
}
