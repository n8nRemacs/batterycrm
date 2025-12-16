package com.avito.android.advert.item.ownership_discrepancy.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.advert.item.ownership_discrepancy.mvi.entity.OwnershipDiscrepancyInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OwnershipDiscrepancyActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.ownership_discrepancy.mvi.OwnershipDiscrepancyActor$process$1", f = "OwnershipDiscrepancyActor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super OwnershipDiscrepancyInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f78108q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f78109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f78110s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f78110s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f78110s, continuation);
        aVar.f78109r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OwnershipDiscrepancyInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f78108q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f78109r;
            OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams = this.f78110s.f78111a;
            OwnershipDiscrepancyInternalAction.FollowLink followLink = new OwnershipDiscrepancyInternalAction.FollowLink(ownershipDiscrepancyOpenParams.f78096f, ownershipDiscrepancyOpenParams.f78097g, ownershipDiscrepancyOpenParams.f78098h);
            this.f78108q = 1;
            if (interfaceC43172j.emit(followLink, this) == coroutine_suspended) {
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
