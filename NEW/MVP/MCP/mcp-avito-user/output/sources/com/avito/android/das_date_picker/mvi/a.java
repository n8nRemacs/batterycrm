package com.avito.android.das_date_picker.mvi;

import bu.C25713b;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import com.huawei.hms.adapter.internal.AvailableCode;
import du.C39804b;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DasCalendarActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarActor$process$1", f = "DasCalendarActor.kt", i = {0}, l = {22, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DasCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f132359q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f132360r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DasCalendarState f132361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DasCalendarState dasCalendarState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f132361s = dasCalendarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f132361s, continuation);
        aVar.f132360r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DasCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f132359q;
        DasCalendarState dasCalendarState = this.f132361s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f132360r;
            Date date = dasCalendarState.f132384b;
            if (date == null) {
                return G0.f406611a;
            }
            DasCalendarInternalAction.DayClick dayClick = new DasCalendarInternalAction.DayClick(date);
            this.f132360r = interfaceC43172j;
            this.f132359q = 1;
            if (interfaceC43172j.emit(dayClick, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f132360r;
            C42729a0.b(obj);
        }
        C25713b c25713b = dasCalendarState.f132389g;
        if (c25713b == null) {
            return G0.f406611a;
        }
        Integer numA = C39804b.a(dasCalendarState.f132384b, c25713b);
        if (numA != null) {
            DasCalendarInternalAction.ScrollToPosition scrollToPosition = new DasCalendarInternalAction.ScrollToPosition(numA.intValue());
            this.f132360r = null;
            this.f132359q = 2;
            if (interfaceC43172j.emit(scrollToPosition, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
