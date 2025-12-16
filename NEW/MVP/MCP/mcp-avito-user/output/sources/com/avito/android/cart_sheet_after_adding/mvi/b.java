package com.avito.android.cart_sheet_after_adding.mvi;

import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31170m;
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

/* compiled from: CartSheetAfterAddingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingActor$process$2", f = "CartSheetAfterAddingActor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSheetAfterAddingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115353q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f115354r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40710b f115355s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, InterfaceC40710b interfaceC40710b, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f115354r = eVar;
        this.f115355s = interfaceC40710b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f115354r, this.f115355s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CartSheetAfterAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115353q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC31170m interfaceC31170m = this.f115354r.f115365a;
            Integer numBoxInt = Boxing.boxInt(((InterfaceC40710b.d) this.f115355s).f396800a);
            this.f115353q = 1;
            if (interfaceC31170m.a(numBoxInt, this) == coroutine_suspended) {
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
