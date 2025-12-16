package com.avito.android.edit_seller_type.mvi;

import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vy.C49394a;

/* compiled from: EditSellerTypeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_seller_type.mvi.EditSellerTypeActor$process$1", f = "EditSellerTypeActor.kt", i = {}, l = {39, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditSellerTypeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146766q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f146767r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.edit_seller_type.mvi.entity.c f146768s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f146769t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.edit_seller_type.mvi.entity.c cVar, c cVar2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f146768s = cVar;
        this.f146769t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f146768s, this.f146769t, continuation);
        aVar.f146767r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EditSellerTypeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        c.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f146766q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f146767r;
            c.g gVar = (c.g) this.f146768s;
            c.e eVarB = gVar.f146828e.b();
            if (L.f(eVarB != null ? eVarB.f146819e : null, gVar.f146829f)) {
                EditSellerTypeInternalAction.Close close = EditSellerTypeInternalAction.Close.f146781b;
                this.f146766q = 1;
                if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c cVar = this.f146769t;
                cVar.f146775b.c(new C49394a(eVarB != null ? eVarB.f146815a : null));
                if ((eVarB != null ? eVarB.f146822h : null) != null) {
                    b.a.a(cVar.f146776c, eVarB.f146822h, null, null, 6);
                } else if (eVarB != null && (aVar = eVarB.f146821g) != null) {
                    EditSellerTypeInternalAction.OpenConfirmationDialog openConfirmationDialog = new EditSellerTypeInternalAction.OpenConfirmationDialog(aVar);
                    this.f146766q = 2;
                    if (interfaceC43172j.emit(openConfirmationDialog, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
