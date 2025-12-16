package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.j;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import it0.C42108c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$ShowHeader;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$showHeader$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction.ShowHeader>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275961q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275962r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<WeekItem> f275963s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f275964t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<C42108c> f275965u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, ArrayList arrayList, List list2, Continuation continuation) {
        super(2, continuation);
        this.f275963s = list;
        this.f275964t = arrayList;
        this.f275965u = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f275963s, this.f275964t, this.f275965u, continuation);
        cVar.f275962r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction.ShowHeader> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        int i12;
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f275961q;
        if (i13 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275962r;
            List<WeekItem> list = this.f275963s;
            Iterator<WeekItem> it = list.iterator();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                Iterator<T> it2 = it.next().f275675c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    FlexibleCalendarDayItem flexibleCalendarDayItem = (FlexibleCalendarDayItem) next2;
                    if ((flexibleCalendarDayItem instanceof DayItem) && ((DayItem) flexibleCalendarDayItem).f275356f) {
                        break;
                    }
                }
                if (next2 != null) {
                    break;
                }
                i15++;
            }
            Integer num = list.get(i15).f275676d;
            int iIntValue = num != null ? num.intValue() : 6;
            FlexibleCalendarDayItem flexibleCalendarDayItem2 = list.get(i15).f275675c.get(iIntValue);
            int iA2 = com.avito.android.service_booking_calendar.p.a(flexibleCalendarDayItem2.getF275369c());
            Iterator<WeekItem> it3 = list.iterator();
            loop2: while (true) {
                if (!it3.hasNext()) {
                    i12 = -1;
                    break;
                }
                List<FlexibleCalendarDayItem> list2 = it3.next().f275675c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (FlexibleCalendarDayItem flexibleCalendarDayItem3 : list2) {
                        if ((flexibleCalendarDayItem3 instanceof DayItem) && ((DayItem) flexibleCalendarDayItem3).f275355e) {
                            i12 = i14;
                            break loop2;
                        }
                    }
                }
                i14++;
            }
            Iterator<T> it4 = list.get(i12).f275675c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                FlexibleCalendarDayItem flexibleCalendarDayItem4 = (FlexibleCalendarDayItem) next;
                if ((flexibleCalendarDayItem4 instanceof DayItem) && ((DayItem) flexibleCalendarDayItem4).f275355e) {
                    break;
                }
            }
            FlexibleCalendarDayItem flexibleCalendarDayItem5 = (FlexibleCalendarDayItem) next;
            CalendarHeaderInternalAction.ShowHeader showHeader = new CalendarHeaderInternalAction.ShowHeader(this.f275964t, list, i15, j.a(i15, iIntValue, list), iA2, flexibleCalendarDayItem2 instanceof DayItem ? (DayItem) flexibleCalendarDayItem2 : null, flexibleCalendarDayItem5 instanceof DayItem ? (DayItem) flexibleCalendarDayItem5 : null, i12, this.f275965u);
            this.f275961q = 1;
            if (interfaceC43172j.emit(showHeader, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
