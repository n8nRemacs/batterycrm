package com.avito.android.service_booking_day_settings.daysettings.mvi;

import Y41.p;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DaySettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.mvi.DaySettingsActor$process$4$1", f = "DaySettingsActor.kt", i = {}, l = {138, 157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f276907q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f276908r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f276909s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DaySettingsState f276910t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DaySettingsState.DayScheduleInfo f276911u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, DaySettingsState daySettingsState, DaySettingsState.DayScheduleInfo dayScheduleInfo, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f276909s = dVar;
        this.f276910t = daySettingsState;
        this.f276911u = dayScheduleInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f276909s, this.f276910t, this.f276911u, continuation);
        bVar.f276908r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f276907q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276908r;
            com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e eVar = this.f276909s.f276921d;
            DaySettingsState daySettingsState = this.f276910t;
            com.avito.android.service_booking_day_settings.daysettings.domain.breaks.d dVarA = eVar.a(daySettingsState, false);
            if (dVarA instanceof d.b) {
                long j12 = daySettingsState.f276966c.f276999d.f276996d;
                DaySettingsState.DayScheduleInfo dayScheduleInfo = this.f276911u;
                boolean z12 = dayScheduleInfo.f276999d.f276994b;
                DaySettingsState.WorkHoursInfo workHoursInfo = dayScheduleInfo.f277001f;
                int iJ2 = workHoursInfo.f277031c.f277026b.J();
                int iJ3 = workHoursInfo.f277031c.f277027c.J();
                List<SettingsBreakItem> list = ((d.b) dVarA).f276765a;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        SettingsBreakItem settingsBreakItem = (SettingsBreakItem) obj2;
                        if (settingsBreakItem.f276724c.f276729b != null && settingsBreakItem.f276725d.f276729b != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        SettingsBreakItem settingsBreakItem2 = (SettingsBreakItem) it.next();
                        arrayList.add(new ServiceBookingScheduleRepetitionLink.Break(settingsBreakItem2.f276724c.f276729b.J(), settingsBreakItem2.f276725d.f276729b.J()));
                    }
                } else {
                    arrayList = null;
                }
                DaySettingsInternalAction.OpenDeepLink openDeepLink = new DaySettingsInternalAction.OpenDeepLink(new ServiceBookingScheduleRepetitionLink(j12, z12, iJ2, iJ3, arrayList));
                this.f276907q = 1;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (dVarA instanceof d.a) {
                d.a aVar = (d.a) dVarA;
                DaySettingsInternalAction.UpdateBreaksDescriptions updateBreaksDescriptions = new DaySettingsInternalAction.UpdateBreaksDescriptions(aVar.f276763a, aVar.f276764b);
                this.f276907q = 2;
                if (interfaceC43172j.emit(updateBreaksDescriptions, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
