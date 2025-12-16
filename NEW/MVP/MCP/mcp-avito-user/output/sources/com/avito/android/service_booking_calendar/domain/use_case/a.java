package com.avito.android.service_booking_calendar.domain.use_case;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: LoadDayScheduleUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/mvi/entity/DayScheduleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.domain.use_case.LoadDayScheduleUseCase$scrollToInitialPosition$1", f = "LoadDayScheduleUseCase.kt", i = {}, l = {18, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 31, 36, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super DayScheduleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275557q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f275559s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<TimeSlotItem> f275560t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, List<? extends TimeSlotItem> list, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f275559s = bVar;
        this.f275560t = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f275559s, this.f275560t, continuation);
        aVar.f275558r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DayScheduleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275557q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275558r;
            b bVar = this.f275559s;
            if (bVar.f275562b) {
                DayScheduleInternalAction.ScrollToTime scrollToTime = new DayScheduleInternalAction.ScrollToTime(org.threeten.bp.g.t(), true);
                this.f275557q = 1;
                if (interfaceC43172j.emit(scrollToTime, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Integer num = bVar.f275561a;
                if (num != null) {
                    DayScheduleInternalAction.ScrollByOffset scrollByOffset = new DayScheduleInternalAction.ScrollByOffset(num.intValue());
                    this.f275557q = 2;
                    if (interfaceC43172j.emit(scrollByOffset, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    boolean z12 = bVar.f275563c;
                    if (z12) {
                        DayScheduleInternalAction.ScrollToTime scrollToTime2 = new DayScheduleInternalAction.ScrollToTime(org.threeten.bp.g.u(9, 0), false, 2, null);
                        this.f275557q = 3;
                        if (interfaceC43172j.emit(scrollToTime2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (!z12) {
                        Iterator<T> it = this.f275560t.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!(((TimeSlotItem) next) instanceof TimeSlotItem.InactiveTimeSlotItem)) {
                                break;
                            }
                        }
                        TimeSlotItem timeSlotItem = (TimeSlotItem) next;
                        if (timeSlotItem == null) {
                            DayScheduleInternalAction.ScrollToTime scrollToTime3 = new DayScheduleInternalAction.ScrollToTime(org.threeten.bp.g.u(9, 0), false, 2, null);
                            this.f275557q = 4;
                            if (interfaceC43172j.emit(scrollToTime3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            DayScheduleInternalAction.ScrollToTime scrollToTime4 = new DayScheduleInternalAction.ScrollToTime(org.threeten.bp.g.z(timeSlotItem.getF275530c()), false, 2, null);
                            this.f275557q = 5;
                            if (interfaceC43172j.emit(scrollToTime4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
