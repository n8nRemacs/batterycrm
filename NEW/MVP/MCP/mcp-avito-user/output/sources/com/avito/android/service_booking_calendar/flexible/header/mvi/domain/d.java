package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction$UpdateHeader;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.domain.CalendarHeaderInteractorImpl$updateHeader$1", f = "CalendarHeaderInteractor.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction.UpdateHeader>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275966q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275967r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f275968s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<WeekItem> f275969t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DayItem f275970u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f275971v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Integer num, List list, DayItem dayItem, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f275968s = num;
        this.f275969t = list;
        this.f275970u = dayItem;
        this.f275971v = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f275968s, this.f275969t, this.f275970u, this.f275971v, continuation);
        dVar.f275967r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction.UpdateHeader> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        int iIntValue;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275966q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275967r;
            int i13 = 0;
            List<WeekItem> list = this.f275969t;
            Integer num = this.f275968s;
            if (num == null) {
                Iterator<WeekItem> it = list.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        iIntValue = -1;
                        break;
                    }
                    Iterator<T> it2 = it.next().f275675c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        FlexibleCalendarDayItem flexibleCalendarDayItem = (FlexibleCalendarDayItem) next;
                        if ((flexibleCalendarDayItem instanceof DayItem) && ((DayItem) flexibleCalendarDayItem).f275356f) {
                            break;
                        }
                    }
                    if (next != null) {
                        iIntValue = i14;
                        break;
                    }
                    i14++;
                }
            } else {
                iIntValue = num.intValue();
            }
            DayItem dayItem = this.f275970u;
            int iD2 = dayItem.f275353c.f421948b.E().d() - 1;
            short s5 = dayItem.f275353c.f421948b.f421942c;
            List<WeekItem> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (Object obj2 : list2) {
                int i15 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                WeekItem weekItem = (WeekItem) obj2;
                Integer numBoxInt = Boxing.boxInt(iD2);
                numBoxInt.getClass();
                if (i13 != iIntValue) {
                    numBoxInt = null;
                }
                arrayList.add(WeekItem.a(weekItem, numBoxInt, s5));
                i13 = i15;
            }
            CalendarHeaderInternalAction.UpdateHeader updateHeader = new CalendarHeaderInternalAction.UpdateHeader(this.f275971v, arrayList);
            this.f275966q = 1;
            if (interfaceC43172j.emit(updateHeader, this) == coroutine_suspended) {
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
