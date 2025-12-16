package com.avito.android.edit_seller_type.mvi;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vy.C49396c;

/* compiled from: EditSellerTypeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_seller_type.mvi.EditSellerTypeActor$process$2", f = "EditSellerTypeActor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super EditSellerTypeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146770q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f146771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.edit_seller_type.mvi.entity.c f146772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f146773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.edit_seller_type.mvi.entity.c cVar, c cVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f146772s = cVar;
        this.f146773t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f146772s, this.f146773t, continuation);
        bVar.f146771r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EditSellerTypeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f146770q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f146771r;
            c.e eVarB = ((c.g) this.f146772s).f146828e.b();
            if (eVarB != null) {
                InterfaceC28373a interfaceC28373a = this.f146773t.f146775b;
                String str = eVarB.f146815a;
                interfaceC28373a.c(new C49396c(str));
                EditSellerTypeInternalAction.ConfirmTypeChange confirmTypeChange = new EditSellerTypeInternalAction.ConfirmTypeChange(str, eVarB.f146819e);
                this.f146770q = 1;
                if (interfaceC43172j.emit(confirmTypeChange, this) == coroutine_suspended) {
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
