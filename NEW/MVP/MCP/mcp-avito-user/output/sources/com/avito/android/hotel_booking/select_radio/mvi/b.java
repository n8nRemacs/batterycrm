package com.avito.android.hotel_booking.select_radio.mvi;

import TI.a;
import Y41.p;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectRadioActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.select_radio.mvi.SelectRadioActor$onItemClick$1", f = "SelectRadioActor.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super SelectRadioInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f164022q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f164023r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TI.c f164024s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.c f164025t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f164026u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TI.c cVar, a.c cVar2, c cVar3, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f164024s = cVar;
        this.f164025t = cVar2;
        this.f164026u = cVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f164024s, this.f164025t, this.f164026u, continuation);
        bVar.f164023r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectRadioInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f164022q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f164023r;
            TI.c cVar = this.f164024s;
            List<RadioItem> list = cVar.f15521b;
            RadioItem radioItem = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((RadioItem) next).getId(), this.f164025t.f15515a)) {
                        break;
                    }
                }
                RadioItem radioItem2 = (RadioItem) next;
                if (radioItem2 != null && !radioItem2.isSelected()) {
                    radioItem = radioItem2;
                }
            }
            ParametrizedEvent parametrizedEvent = cVar.f15522c;
            if (parametrizedEvent != null) {
                this.f164026u.f164027a.a(parametrizedEvent, radioItem);
            }
            if (radioItem != null) {
                SelectRadioInternalAction.UpdateSelectedItem updateSelectedItem = new SelectRadioInternalAction.UpdateSelectedItem(radioItem);
                this.f164022q = 1;
                if (interfaceC43172j.emit(updateSelectedItem, this) == coroutine_suspended) {
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
