package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import com.avito.android.item_price_history.presentation.mvi.entity.IsFavoriteState;
import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import io.reactivex.rxjava3.core.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ItemPriceHistoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.item_price_history.presentation.mvi.ItemPriceHistoryActor$process$2", f = "ItemPriceHistoryActor.kt", i = {}, l = {62, 70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ItemPriceHistoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f173783q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f173784r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f173785s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EO.c f173786t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, EO.c cVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f173785s = cVar;
        this.f173786t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f173785s, this.f173786t, continuation);
        bVar.f173784r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ItemPriceHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f173783q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f173784r;
            ItemPriceHistoryInternalAction.ChangeIsFavoriteState changeIsFavoriteState = new ItemPriceHistoryInternalAction.ChangeIsFavoriteState(IsFavoriteState.f173796b);
            this.f173783q = 1;
            if (interfaceC43172j.emit(changeIsFavoriteState, this) == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        c cVar = this.f173785s;
        com.avito.android.favorite.h hVar = cVar.f173788b;
        ItemPriceHistoryInitialData itemPriceHistoryInitialData = cVar.f173790d;
        I iG2 = hVar.g(itemPriceHistoryInitialData.f173713b, new AbstractC30567a.g(itemPriceHistoryInitialData.f173717f), this.f173786t.f4006e, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0);
        this.f173783q = 2;
        if (C43292o.b(iG2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
