package com.avito.android.service_booking_calendar.day.schedule;

import Cd.C13243a;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bt0.C25711c;
import bt0.InterfaceC25709a;
import bt0.InterfaceC25710b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.service_booking_calendar.day.schedule.di.b;
import com.avito.android.service_booking_calendar.day.schedule.di.o;
import com.avito.android.service_booking_calendar.day.schedule.perf_screen.ServicesBookingDayCalendar;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
import dt0.C39802a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import okhttp3.internal.ws.WebSocketProtocol;
import z1.AbstractC50339a;

/* compiled from: DayScheduleFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/DayScheduleFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Companion", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayScheduleFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final Companion f275256y0 = new Companion(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_calendar.b f275257n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public n f275258o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f275259p0;

    /* renamed from: q0, reason: collision with root package name */
    public l f275260q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f275261r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f275262s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f275263t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f275264u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f275265v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f275266w0;

    /* renamed from: x0, reason: collision with root package name */
    public b f275267x0;

    /* compiled from: DayScheduleFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/DayScheduleFragment$Companion;", "", "<init>", "()V", "ScheduleType", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DayScheduleFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/DayScheduleFragment$Companion$ScheduleType;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScheduleType {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ScheduleType[] f275268b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f275269c;

            static {
                ScheduleType[] scheduleTypeArr = {new ScheduleType("FLEXIBLE", 0), new ScheduleType("STATIC", 1)};
                f275268b = scheduleTypeArr;
                f275269c = kotlin.enums.c.a(scheduleTypeArr);
            }

            public ScheduleType() {
                throw null;
            }

            public static ScheduleType valueOf(String str) {
                return (ScheduleType) Enum.valueOf(ScheduleType.class, str);
            }

            public static ScheduleType[] values() {
                return (ScheduleType[]) f275268b.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: DayScheduleFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1", f = "DayScheduleFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275270q;

        /* compiled from: DayScheduleFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1$1", f = "DayScheduleFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a, reason: collision with other inner class name */
        public static final class C8163a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f275272q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ DayScheduleFragment f275273r;

            /* compiled from: DayScheduleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1$1$1", f = "DayScheduleFragment.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$a, reason: collision with other inner class name */
            public static final class C8164a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f275274q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ DayScheduleFragment f275275r;

                /* compiled from: DayScheduleFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbt0/c;", "it", "Lkotlin/G0;", "invoke", "(Lbt0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$a$a, reason: collision with other inner class name */
                public static final class C8165a extends N implements Y41.l<C25711c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ DayScheduleFragment f275276l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8165a(DayScheduleFragment dayScheduleFragment) {
                        super(1);
                        this.f275276l = dayScheduleFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(C25711c c25711c) {
                        C25711c c25711c2 = c25711c;
                        DayScheduleFragment dayScheduleFragment = this.f275276l;
                        com.avito.android.service_booking_calendar.day.schedule.h hVar = new com.avito.android.service_booking_calendar.day.schedule.h(1, (m) dayScheduleFragment.f275259p0.getValue(), m.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        l lVar = dayScheduleFragment.f275260q0;
                        if (lVar == null) {
                            lVar = null;
                        }
                        if (c25711c2.f57525b) {
                            C42670a.d(lVar.f275385c);
                            G0 g02 = G0.f406611a;
                        } else if (c25711c2.f57526c != null) {
                            lVar.f275385c.c(null, new i(dayScheduleFragment, c25711c2));
                            lVar.f275385c.a(new com.avito.android.seller_promotions.b(5, hVar));
                            G0 g03 = G0.f406611a;
                        } else {
                            lVar.f275385c.b();
                            List<TimeSlotItem> list = c25711c2.f57527d;
                            if (list != null) {
                                com.avito.konveyor.adapter.h hVar2 = dayScheduleFragment.f275261r0;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.f338510e = new UV0.c(list);
                                com.avito.konveyor.adapter.j jVar = dayScheduleFragment.f275262s0;
                                if (jVar == null) {
                                    jVar = null;
                                }
                                jVar.notifyDataSetChanged();
                            }
                            com.avito.android.service_booking_calendar.domain.b bVar = c25711c2.f57528e;
                            if (bVar != null) {
                                com.avito.android.service_booking_calendar.b bVar2 = dayScheduleFragment.f275257n0;
                                (bVar2 != null ? bVar2 : null).Y4(bVar);
                                G0 g04 = G0.f406611a;
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8164a(DayScheduleFragment dayScheduleFragment, Continuation<? super C8164a> continuation) {
                    super(2, continuation);
                    this.f275275r = dayScheduleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8164a(this.f275275r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8164a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f275274q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        DayScheduleFragment dayScheduleFragment = this.f275275r;
                        n2<C25711c> state = ((m) dayScheduleFragment.f275259p0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = dayScheduleFragment.f275265v0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8165a c8165a = new C8165a(dayScheduleFragment);
                        this.f275274q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8165a, this) == coroutine_suspended) {
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

            /* compiled from: DayScheduleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1$1$2", f = "DayScheduleFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f275277q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ DayScheduleFragment f275278r;

                /* compiled from: DayScheduleFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8166a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DayScheduleFragment f275279b;

                    public C8166a(DayScheduleFragment dayScheduleFragment) {
                        this.f275279b = dayScheduleFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC25710b interfaceC25710b = (InterfaceC25710b) obj;
                        Companion companion = DayScheduleFragment.f275256y0;
                        DayScheduleFragment dayScheduleFragment = this.f275279b;
                        if (interfaceC25710b instanceof InterfaceC25710b.a) {
                            l lVar = dayScheduleFragment.f275260q0;
                            (lVar != null ? lVar : null).f275384b.post(new com.avito.android.service_booking_calendar.day.schedule.b(dayScheduleFragment, interfaceC25710b));
                        } else {
                            if (!(interfaceC25710b instanceof InterfaceC25710b.C2022b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l lVar2 = dayScheduleFragment.f275260q0;
                            (lVar2 != null ? lVar2 : null).f275384b.post(new com.avito.android.service_booking_calendar.day.schedule.b(interfaceC25710b, dayScheduleFragment));
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
                        return new C42801a(2, this.f275279b, DayScheduleFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleOneTimeEvent;)Z", 12);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DayScheduleFragment dayScheduleFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f275278r = dayScheduleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f275278r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f275277q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        DayScheduleFragment dayScheduleFragment = this.f275278r;
                        InterfaceC43160i<InterfaceC25710b> events = ((m) dayScheduleFragment.f275259p0.getValue()).getEvents();
                        C8166a c8166a = new C8166a(dayScheduleFragment);
                        this.f275277q = 1;
                        if (events.collect(c8166a, this) == coroutine_suspended) {
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

            /* compiled from: DayScheduleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1$1$3", f = "DayScheduleFragment.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$c */
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f275280q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ DayScheduleFragment f275281r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(DayScheduleFragment dayScheduleFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f275281r = dayScheduleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f275281r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f275280q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        DayScheduleFragment dayScheduleFragment = this.f275281r;
                        Set<TV0.d<?, ?>> set = dayScheduleFragment.f275263t0;
                        if (set == null) {
                            set = null;
                        }
                        this.f275280q = 1;
                        if (DayScheduleFragment.q5(dayScheduleFragment, set, this) == coroutine_suspended) {
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

            /* compiled from: DayScheduleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$onCreateView$1$1$4", f = "DayScheduleFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$d */
            public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f275282q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ DayScheduleFragment f275283r;

                /* compiled from: DayScheduleFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment$a$a$d$a, reason: collision with other inner class name */
                public /* synthetic */ class C8167a extends H implements Y41.l<InterfaceC25709a, G0> {
                    @Override // Y41.l
                    public final G0 invoke(InterfaceC25709a interfaceC25709a) {
                        ((m) this.receiver).accept(interfaceC25709a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(DayScheduleFragment dayScheduleFragment, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f275283r = dayScheduleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new d(this.f275283r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f275282q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        DayScheduleFragment dayScheduleFragment = this.f275283r;
                        C8167a c8167a = new C8167a(1, (m) dayScheduleFragment.f275259p0.getValue(), m.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        this.f275282q = 1;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = dayScheduleFragment.f275264u0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        Object objCollect = new C43152f0(y.a(aVar.V9()), new com.avito.android.service_booking_calendar.day.schedule.c(3, null)).collect(new com.avito.android.service_booking_calendar.day.schedule.d(c8167a), this);
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
            public C8163a(DayScheduleFragment dayScheduleFragment, Continuation<? super C8163a> continuation) {
                super(2, continuation);
                this.f275273r = dayScheduleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8163a c8163a = new C8163a(this.f275273r, continuation);
                c8163a.f275272q = obj;
                return c8163a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8163a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f275272q;
                DayScheduleFragment dayScheduleFragment = this.f275273r;
                C43259k.d(t12, null, null, new C8164a(dayScheduleFragment, null), 3);
                C43259k.d(t12, null, null, new b(dayScheduleFragment, null), 3);
                C43259k.d(t12, null, null, new c(dayScheduleFragment, null), 3);
                C43259k.d(t12, null, null, new d(dayScheduleFragment, null), 3);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return DayScheduleFragment.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275270q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                DayScheduleFragment dayScheduleFragment = DayScheduleFragment.this;
                C8163a c8163a = new C8163a(dayScheduleFragment, null);
                this.f275270q = 1;
                if (C23056p0.b(dayScheduleFragment, state, c8163a, this) == coroutine_suspended) {
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

    /* compiled from: DayScheduleFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_calendar/day/schedule/DayScheduleFragment$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public int f275284b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                com.avito.android.service_booking_calendar.b bVar = DayScheduleFragment.this.f275257n0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.P2(this.f275284b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            this.f275284b += i13;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f275286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f275286l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f275286l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DayScheduleFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f275288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f275288l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f275288l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f275289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f275289l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f275289l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f275290l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f275290l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f275290l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DayScheduleFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_calendar/day/schedule/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<m> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = DayScheduleFragment.this.f275258o0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    public DayScheduleFragment() {
        super(R.layout.fragment_service_booking_day_schedule);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f275259p0 = new O0(m0.f406844a.b(m.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q5(com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment r7, java.util.Set r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof com.avito.android.service_booking_calendar.day.schedule.e
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.service_booking_calendar.day.schedule.e r0 = (com.avito.android.service_booking_calendar.day.schedule.e) r0
            int r1 = r0.f275378u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275378u = r1
            goto L18
        L13:
            com.avito.android.service_booking_calendar.day.schedule.e r0 = new com.avito.android.service_booking_calendar.day.schedule.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f275376s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f275378u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r7 = r0.f275375r
            com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment r8 = r0.f275374q
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
            if (r9 == 0) goto L75
            java.lang.Object r9 = r7.next()
            TV0.d r9 = (TV0.d) r9
            boolean r2 = r9 instanceof com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c
            if (r2 == 0) goto L41
            com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c r9 = (com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c) r9
            kotlinx.coroutines.flow.e2 r9 = r9.getF275430c()
            com.avito.android.service_booking_calendar.day.schedule.f r2 = new com.avito.android.service_booking_calendar.day.schedule.f
            r4 = 3
            r5 = 0
            r2.<init>(r4, r5)
            kotlinx.coroutines.flow.f0 r4 = new kotlinx.coroutines.flow.f0
            r4.<init>(r9, r2)
            com.avito.android.service_booking_calendar.day.schedule.g r9 = new com.avito.android.service_booking_calendar.day.schedule.g
            r9.<init>(r8)
            r0.f275374q = r8
            r0.f275375r = r7
            r0.f275378u = r3
            java.lang.Object r9 = r4.collect(r9, r0)
            if (r9 != r1) goto L41
            goto L77
        L75:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment.q5(com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment, java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new a(null), 3);
        this.f275267x0 = new b();
        return layoutInflater.inflate(R.layout.fragment_service_booking_day_schedule, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        l lVar = new l(view);
        this.f275260q0 = lVar;
        com.avito.konveyor.adapter.j jVar = this.f275262s0;
        if (jVar == null) {
            jVar = null;
        }
        lVar.f275384b.setAdapter(jVar);
        l lVar2 = this.f275260q0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.f275384b.l(new C39802a(view.getContext(), this.f275266w0, getResources()), -1);
        l lVar3 = this.f275260q0;
        if (lVar3 == null) {
            lVar3 = null;
        }
        RecyclerView recyclerView = lVar3.f275384b;
        b bVar = this.f275267x0;
        recyclerView.o(bVar != null ? bVar : null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key.day_id") : null;
        if (string == null) {
            throw new IllegalArgumentException("Day id is not provided");
        }
        Bundle arguments2 = getArguments();
        Boolean boolValueOf = arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("key.is_today", false)) : null;
        if (boolValueOf == null) {
            throw new IllegalArgumentException("IsToday property is not provided");
        }
        this.f275266w0 = boolValueOf.booleanValue();
        Bundle arguments3 = getArguments();
        Boolean boolValueOf2 = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("key.is_day_off", false)) : null;
        if (boolValueOf2 == null) {
            throw new IllegalArgumentException("IsDayOff property is not provided");
        }
        boolean zBooleanValue = boolValueOf2.booleanValue();
        Bundle arguments4 = getArguments();
        String string2 = arguments4 != null ? arguments4.getString("key.type") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("ScheduleType property is not provided");
        }
        Companion.ScheduleType scheduleTypeValueOf = Companion.ScheduleType.valueOf(string2);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.service_booking_calendar.day.schedule.di.a.a();
        C28478k c28478k = new C28478k(ServicesBookingDayCalendar.f275422d, s.c(this), "sb-calendar-day-schedule");
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.service_booking_calendar.day.schedule.di.n nVar = (com.avito.android.service_booking_calendar.day.schedule.di.n) C29972i.a(C29972i.b(this), com.avito.android.service_booking_calendar.day.schedule.di.n.class);
        o oVar = (o) C29972i.a(C29972i.b(this), o.class);
        boolean z12 = this.f275266w0;
        Bundle arguments5 = getArguments();
        Integer numValueOf = arguments5 != null ? Integer.valueOf(arguments5.getInt("key.scroll_offset")) : null;
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        aVarA.a(c28478k, nVar, oVar, interfaceC39417aB, string, z12, zBooleanValue, numValueOf, scheduleTypeValueOf).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f275265v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
