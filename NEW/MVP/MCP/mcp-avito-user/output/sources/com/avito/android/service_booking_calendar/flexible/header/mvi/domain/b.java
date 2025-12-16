package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import com.avito.android.util.R0;
import it0.InterfaceC42106a;
import it0.InterfaceC42109d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/domain/b;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/domain/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42109d f275943a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f275944b;

    /* compiled from: CalendarHeaderInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SelectDay;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$onDayClicked$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275945q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275946r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CalendarHeaderState f275947s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ FlexibleCalendarDayItem f275948t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CalendarHeaderState calendarHeaderState, FlexibleCalendarDayItem flexibleCalendarDayItem, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f275947s = calendarHeaderState;
            this.f275948t = flexibleCalendarDayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f275947s, this.f275948t, continuation);
            aVar.f275946r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            FlexibleCalendarDayItem flexibleCalendarDayItem;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275945q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275946r;
                Iterator<WeekItem> it = this.f275947s.f276011h.iterator();
                int i13 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    flexibleCalendarDayItem = this.f275948t;
                    if (!zHasNext) {
                        i13 = -1;
                        break;
                    }
                    Iterator<T> it2 = it.next().f275675c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (L.f(((FlexibleCalendarDayItem) next).getF275369c(), flexibleCalendarDayItem.getF275369c())) {
                            break;
                        }
                    }
                    if (next != null) {
                        break;
                    }
                    i13++;
                }
                CalendarHeaderInternalAction.SelectDay selectDay = new CalendarHeaderInternalAction.SelectDay(flexibleCalendarDayItem, i13, com.avito.android.service_booking_calendar.p.a(flexibleCalendarDayItem.getF275369c()));
                this.f275945q = 1;
                if (interfaceC43172j.emit(selectDay, this) == coroutine_suspended) {
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

    /* compiled from: CalendarHeaderInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SelectDay;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$onMonthScrolledTo$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_calendar.flexible.header.mvi.domain.b$b, reason: collision with other inner class name */
    public static final class C8187b extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275949q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275950r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CalendarHeaderState f275951s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f275952t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8187b(CalendarHeaderState calendarHeaderState, int i12, Continuation<? super C8187b> continuation) {
            super(2, continuation);
            this.f275951s = calendarHeaderState;
            this.f275952t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8187b c8187b = new C8187b(this.f275951s, this.f275952t, continuation);
            c8187b.f275950r = obj;
            return c8187b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8187b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object obj2;
            Object next;
            DayItem dayItem;
            org.threeten.bp.f fVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275949q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275950r;
                CalendarHeaderState calendarHeaderState = this.f275951s;
                List<WeekItem> list = calendarHeaderState.f276011h;
                int i13 = this.f275952t;
                WeekItem weekItem = list.get(i13);
                if (!weekItem.f()) {
                    return G0.f406611a;
                }
                List<FlexibleCalendarDayItem> list2 = weekItem.f275675c;
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((FlexibleCalendarDayItem) next).getF275369c().f421948b.f421943d == 1) {
                        break;
                    }
                }
                FlexibleCalendarDayItem flexibleCalendarDayItem = next instanceof DayItem ? (DayItem) next : null;
                if (flexibleCalendarDayItem == null) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((FlexibleCalendarDayItem) next2) instanceof DayItem) {
                            obj2 = next2;
                            break;
                        }
                    }
                    flexibleCalendarDayItem = (FlexibleCalendarDayItem) obj2;
                }
                if (flexibleCalendarDayItem == null || !((dayItem = calendarHeaderState.f276014k) == null || (fVar = dayItem.f275353c) == null || flexibleCalendarDayItem.getF275369c().f421948b.f421942c != fVar.f421948b.f421942c)) {
                    return G0.f406611a;
                }
                CalendarHeaderInternalAction.SelectDay selectDay = new CalendarHeaderInternalAction.SelectDay(flexibleCalendarDayItem, i13, com.avito.android.service_booking_calendar.p.a(flexibleCalendarDayItem.getF275369c()));
                this.f275949q = 1;
                if (interfaceC43172j.emit(selectDay, this) == coroutine_suspended) {
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

    /* compiled from: CalendarHeaderInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$SelectDay;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$onWeekScrolledTo$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275953q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275954r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CalendarHeaderState f275955s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f275956t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CalendarHeaderState calendarHeaderState, int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f275955s = calendarHeaderState;
            this.f275956t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f275955s, this.f275956t, continuation);
            cVar.f275954r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction.SelectDay> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f275953q
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                kotlin.C42729a0.b(r8)
                goto L93
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f275954r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState r1 = r7.f275955s
                java.util.List<com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem> r3 = r1.f276011h
                int r4 = r7.f275956t
                java.lang.Object r3 = r3.get(r4)
                com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem r3 = (com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem) r3
                com.avito.android.service_booking_calendar.day.schedule.domain.DayItem r1 = r1.f276014k
                r5 = 0
                if (r1 == 0) goto L46
                org.threeten.bp.f r1 = r1.f275353c
                if (r1 == 0) goto L46
                org.threeten.bp.e r1 = r1.f421948b
                org.threeten.bp.DayOfWeek r1 = r1.E()
                if (r1 == 0) goto L46
                int r1 = r1.d()
                int r1 = r1 - r2
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                goto L47
            L46:
                r1 = r5
            L47:
                if (r1 == 0) goto L5e
                int r1 = r1.intValue()
                java.util.List<com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem> r6 = r3.f275675c
                java.lang.Object r1 = r6.get(r1)
                boolean r6 = r1 instanceof com.avito.android.service_booking_calendar.day.schedule.domain.DayItem
                if (r6 == 0) goto L5a
                com.avito.android.service_booking_calendar.day.schedule.domain.DayItem r1 = (com.avito.android.service_booking_calendar.day.schedule.domain.DayItem) r1
                goto L5b
            L5a:
                r1 = r5
            L5b:
                if (r1 == 0) goto L5e
                goto L7b
            L5e:
                java.util.List<com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem> r1 = r3.f275675c
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L66:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L78
                java.lang.Object r3 = r1.next()
                r6 = r3
                com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem r6 = (com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem) r6
                boolean r6 = r6 instanceof com.avito.android.service_booking_calendar.day.schedule.domain.DayItem
                if (r6 == 0) goto L66
                r5 = r3
            L78:
                r1 = r5
                com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem r1 = (com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem) r1
            L7b:
                if (r1 == 0) goto L93
                com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SelectDay r3 = new com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction$SelectDay
                org.threeten.bp.f r5 = r1.getF275369c()
                int r5 = com.avito.android.service_booking_calendar.p.a(r5)
                r3.<init>(r1, r4, r5)
                r7.f275953q = r2
                java.lang.Object r8 = r8.emit(r3, r7)
                if (r8 != r0) goto L93
                return r0
            L93:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_calendar.flexible.header.mvi.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CalendarHeaderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$setTooltipWasShow$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275957q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f275958r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42106a f275960t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC42106a interfaceC42106a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f275960t = interfaceC42106a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f275960t, continuation);
            dVar.f275958r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275957q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275958r;
                InterfaceC42109d interfaceC42109d = b.this.f275943a;
                InterfaceC42106a interfaceC42106a = this.f275960t;
                interfaceC42109d.b(interfaceC42106a);
                CalendarHeaderInternalAction.CloseTooltip closeTooltip = new CalendarHeaderInternalAction.CloseTooltip(interfaceC42106a);
                this.f275957q = 1;
                if (interfaceC43172j.emit(closeTooltip, this) == coroutine_suspended) {
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

    @Inject
    public b(@k InterfaceC42109d interfaceC42109d, @k R0 r02) {
        this.f275943a = interfaceC42109d;
        this.f275944b = r02;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i<CalendarHeaderInternalAction.SelectDay> a(int i12, @k CalendarHeaderState calendarHeaderState) {
        return C43175k.I(this.f275944b.a(), C43175k.G(new C8187b(calendarHeaderState, i12, null)));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i<CalendarHeaderInternalAction.SelectDay> b(@k FlexibleCalendarDayItem flexibleCalendarDayItem, @k CalendarHeaderState calendarHeaderState) {
        return C43175k.I(this.f275944b.a(), C43175k.G(new a(calendarHeaderState, flexibleCalendarDayItem, null)));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i c(@k ArrayList arrayList, @k List list, @k DayItem dayItem, @l Integer num) {
        return C43175k.I(this.f275944b.a(), C43175k.G(new com.avito.android.service_booking_calendar.flexible.header.mvi.domain.d(num, list, dayItem, arrayList, null)));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i d(@k ArrayList arrayList, @k List list, @k List list2) {
        return C43175k.I(this.f275944b.a(), C43175k.G(new com.avito.android.service_booking_calendar.flexible.header.mvi.domain.c(list, arrayList, list2, null)));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i<CalendarHeaderInternalAction> e(@k InterfaceC42106a interfaceC42106a) {
        return C43175k.G(new d(interfaceC42106a, null));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a
    @k
    public final InterfaceC43160i<CalendarHeaderInternalAction.SelectDay> f(int i12, @k CalendarHeaderState calendarHeaderState) {
        return C43175k.I(this.f275944b.a(), C43175k.G(new c(calendarHeaderState, i12, null)));
    }
}
