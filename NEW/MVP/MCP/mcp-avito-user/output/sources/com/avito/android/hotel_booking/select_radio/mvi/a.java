package com.avito.android.hotel_booking.select_radio.mvi;

import Y41.p;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectRadioActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.select_radio.mvi.SelectRadioActor$onApplyClick$1", f = "SelectRadioActor.kt", i = {}, l = {36, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectRadioInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f164019q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f164020r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TI.c f164021s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TI.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f164021s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f164021s, continuation);
        aVar.f164020r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectRadioInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f164019q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f164020r;
            RadioItem radioItem = this.f164021s.f15524e;
            if (radioItem == null) {
                SelectRadioInternalAction.CloseScreen closeScreen = SelectRadioInternalAction.CloseScreen.f164035b;
                this.f164019q = 1;
                if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                SelectRadioInternalAction.CloseScreenWithResult closeScreenWithResult = new SelectRadioInternalAction.CloseScreenWithResult(radioItem);
                this.f164019q = 2;
                if (interfaceC43172j.emit(closeScreenWithResult, this) == coroutine_suspended) {
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
