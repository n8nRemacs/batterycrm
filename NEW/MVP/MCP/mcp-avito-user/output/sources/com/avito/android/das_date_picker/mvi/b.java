package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
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
@DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarActor$process$2", f = "DasCalendarActor.kt", i = {0}, l = {37, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DasCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f132362q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f132363r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DasCalendarState f132364s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DasCalendarState dasCalendarState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f132364s = dasCalendarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f132364s, continuation);
        bVar.f132363r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DasCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f132362q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f132363r;
            Date date = this.f132364s.f132385c;
            if (date == null) {
                return G0.f406611a;
            }
            DasCalendarInternalAction.PassSelectedDate passSelectedDate = new DasCalendarInternalAction.PassSelectedDate(date);
            this.f132363r = interfaceC43172j;
            this.f132362q = 1;
            if (interfaceC43172j.emit(passSelectedDate, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f132363r;
            C42729a0.b(obj);
        }
        DasCalendarInternalAction.CloseScreen closeScreen = DasCalendarInternalAction.CloseScreen.f132373b;
        this.f132363r = null;
        this.f132362q = 2;
        if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
