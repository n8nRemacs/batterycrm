package com.avito.android.service_booking_calendar.flexible.header.mvi;

import Y41.p;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import it0.C42107b;
import it0.InterfaceC42106a;
import jt0.InterfaceC42425a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.CalendarHeaderActor$process$2", f = "CalendarHeaderActor.kt", i = {0}, l = {48, 50}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275932q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275933r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42425a f275934s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC42425a interfaceC42425a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f275934s = interfaceC42425a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f275934s, continuation);
        bVar.f275933r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275932q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f275933r;
            CalendarHeaderInternalAction.SwitchMode switchMode = CalendarHeaderInternalAction.SwitchMode.f275999b;
            this.f275933r = interfaceC43172j;
            this.f275932q = 1;
            if (interfaceC43172j.emit(switchMode, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f275933r;
            C42729a0.b(obj);
        }
        InterfaceC42106a interfaceC42106a = ((InterfaceC42425a.f) this.f275934s).f405873a;
        if (interfaceC42106a != null && (interfaceC42106a instanceof C42107b)) {
            CalendarHeaderInternalAction.CloseTooltip closeTooltip = new CalendarHeaderInternalAction.CloseTooltip(interfaceC42106a);
            this.f275933r = null;
            this.f275932q = 2;
            if (interfaceC43172j.emit(closeTooltip, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
