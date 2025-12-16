package com.avito.android.publish.price_list.mvi;

import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import com.avito.android.publish.price_list.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectPriceListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListActor$process$1", f = "SelectPriceListActor.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectPriceListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238777q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f238778r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f238779s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.a f238780t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.f f238781u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, com.avito.android.publish.price_list.mvi.entity.a aVar, com.avito.android.publish.price_list.mvi.entity.f fVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f238779s = hVar;
        this.f238780t = aVar;
        this.f238781u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f238779s, this.f238780t, this.f238781u, continuation);
        dVar.f238778r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238777q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f238778r;
            h hVar = this.f238779s;
            com.avito.android.publish.price_list.domain.use_case.q qVar = hVar.f238879i;
            qVar.f238613a.h(qVar.f238614b.b(((a.k) this.f238780t).f238830a));
            InterfaceC43160i<SelectPriceListInternalAction> interfaceC43160iA = hVar.f238875e.a(this.f238781u.f238860k);
            this.f238777q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
