package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import Y41.p;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionInternalAction;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ScheduleRepetitionActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_schedule_repetition_impl.mvi.ScheduleRepetitionActor$process$3", f = "ScheduleRepetitionActor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ScheduleRepetitionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f277622q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f277623r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ScheduleRepetitionState f277624s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ScheduleRepetitionState scheduleRepetitionState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f277624s = scheduleRepetitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f277624s, continuation);
        bVar.f277623r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ScheduleRepetitionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        ScheduleRepetitionState.Content.SaveScheduleInfo saveScheduleInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f277622q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277623r;
            ScheduleRepetitionState.Content content = this.f277624s.f277711d;
            if (content == null || (saveScheduleInfo = content.f277717d) == null || (str = saveScheduleInfo.f277723f) == null) {
                str = "Изменить расписание";
            }
            ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = new ScheduleRepetitionInternalAction.OnActionButtonSaveDialogClicked(str, WorkHoursSaveClickEvent.SaveDialogActionType.f278371c);
            this.f277622q = 1;
            if (interfaceC43172j.emit(onActionButtonSaveDialogClicked, this) == coroutine_suspended) {
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
