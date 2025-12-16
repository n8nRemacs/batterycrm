package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SellerPromotionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateItemsStocks;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$process$3", f = "SellerPromotionsActor.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction.UpdateItemsStocks>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f268019q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f268020r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Oq0.g f268021s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34670a f268022t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Oq0.g gVar, C34670a c34670a, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f268021s = gVar;
        this.f268022t = c34670a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f268021s, this.f268022t, continuation);
        mVar.f268020r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction.UpdateItemsStocks> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f268019q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f268020r;
            List<com.avito.android.seller_promotions.konveyor.c> list = this.f268021s.f12624j;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof com.avito.android.seller_promotions.konveyor.snippet.d) {
                    arrayList.add(obj2);
                }
            }
            int iF2 = P0.f(C42745f0.q(arrayList, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((com.avito.android.seller_promotions.konveyor.snippet.d) it.next()).f267834b;
                linkedHashMap.put(str, this.f268022t.f267930e.get(str));
            }
            SellerPromotionsInternalAction.UpdateItemsStocks updateItemsStocks = new SellerPromotionsInternalAction.UpdateItemsStocks(linkedHashMap);
            this.f268019q = 1;
            if (interfaceC43172j.emit(updateItemsStocks, this) == coroutine_suspended) {
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
