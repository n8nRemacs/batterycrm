package com.avito.android.cart_sheet_after_adding.mvi;

import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import gn.InterfaceC40710b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tn.d;

/* compiled from: CartSheetAfterAddingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingActor$process$1", f = "CartSheetAfterAddingActor.kt", i = {0}, l = {61, 64}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSheetAfterAddingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115349q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115350r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40710b f115351s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ gn.e f115352t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40710b interfaceC40710b, gn.e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f115351s = interfaceC40710b;
        this.f115352t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f115351s, this.f115352t, continuation);
        aVar.f115350r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CartSheetAfterAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115349q;
        InterfaceC40710b interfaceC40710b = this.f115351s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f115350r;
            d.b bVar = ((InterfaceC40710b.g) interfaceC40710b).f396803a;
            if (bVar.f439441b) {
                Stepper stepper = bVar.f439440a.get(this.f115352t.f396820c.f396825a);
                Integer numBoxInt = stepper != null ? Boxing.boxInt(stepper.f116271b) : null;
                if (numBoxInt == null || numBoxInt.intValue() == 0) {
                    CartSheetAfterAddingInternalAction.CloseScreen closeScreen = CartSheetAfterAddingInternalAction.CloseScreen.f115368b;
                    this.f115350r = interfaceC43172j;
                    this.f115349q = 1;
                    if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f115350r;
            C42729a0.b(obj);
        }
        CartSheetAfterAddingInternalAction.UpdateStocks updateStocks = new CartSheetAfterAddingInternalAction.UpdateStocks(((InterfaceC40710b.g) interfaceC40710b).f396803a.f439440a);
        this.f115350r = null;
        this.f115349q = 2;
        if (interfaceC43172j.emit(updateStocks, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
