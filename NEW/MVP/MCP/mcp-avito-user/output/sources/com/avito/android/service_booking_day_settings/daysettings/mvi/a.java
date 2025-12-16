package com.avito.android.service_booking_day_settings.daysettings.mvi;

import Y41.p;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yt0.InterfaceC50300a;

/* compiled from: DaySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.mvi.DaySettingsActor$process$1$1", f = "DaySettingsActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f276903q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f276904r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50300a f276905s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DaySettingsState f276906t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC50300a interfaceC50300a, DaySettingsState daySettingsState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f276905s = interfaceC50300a;
        this.f276906t = daySettingsState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f276905s, this.f276906t, continuation);
        aVar.f276904r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f276903q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f276904r;
            if (((InterfaceC50300a.n) this.f276905s).f443581a) {
                DaySettingsState.SaveScheduleInfo saveScheduleInfo = this.f276906t.f276966c.f277004i;
                if (saveScheduleInfo == null || (str = saveScheduleInfo.f277014f) == null) {
                    str = "Изменить расписание";
                }
                DaySettingsInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = new DaySettingsInternalAction.OnActionButtonSaveDialogClicked(str, WorkHoursSaveClickEvent.SaveDialogActionType.f278371c);
                this.f276903q = 1;
                if (interfaceC43172j.emit(onActionButtonSaveDialogClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
