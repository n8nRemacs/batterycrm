package com.avito.android.service_booking_settings.work_hours.mvi;

import Y41.p;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingWorkHoursActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_settings.work_hours.mvi.ServiceBookingWorkHoursActor$process$1", f = "ServiceBookingWorkHoursActor.kt", i = {0}, l = {43, 45}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f278043q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f278044r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_booking_settings.work_hours.mvi.entity.a f278045s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ut0.h f278046t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.service_booking_settings.work_hours.mvi.entity.a aVar, Ut0.h hVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f278045s = aVar;
        this.f278046t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f278045s, this.f278046t, continuation);
        aVar.f278044r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceBookingWorkHoursInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f278043q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f278044r;
            ServiceBookingWorkHoursInternalAction.SaveSettingsInProgress saveSettingsInProgress = new ServiceBookingWorkHoursInternalAction.SaveSettingsInProgress();
            this.f278044r = interfaceC43172j;
            this.f278043q = 1;
            if (interfaceC43172j.emit(saveSettingsInProgress, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f278044r;
            C42729a0.b(obj);
        }
        if (((a.g) this.f278045s).f278103a) {
            Ut0.g gVar = this.f278046t.f16750l;
            if (gVar == null || (str = gVar.f16734e) == null) {
                str = "Изменить расписание";
            }
            ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = new ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked(str, WorkHoursSaveClickEvent.SaveDialogActionType.f278371c);
            this.f278044r = null;
            this.f278043q = 2;
            if (interfaceC43172j.emit(onActionButtonSaveDialogClicked, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
