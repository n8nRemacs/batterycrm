package com.avito.android.favorite_sellers.mvi;

import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoriteSellersActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$initialDataLoad$1", f = "FavoriteSellersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<FavoriteSellersInternalAction, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f155979q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<FavoriteSellersState> f155980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f155981s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a<FavoriteSellersState> aVar, a aVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f155980r = aVar;
        this.f155981s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f155980r, this.f155981s, continuation);
        bVar.f155979q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(FavoriteSellersInternalAction favoriteSellersInternalAction, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>> continuation) {
        return ((b) create(favoriteSellersInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        FavoriteSellersInternalAction favoriteSellersInternalAction = (FavoriteSellersInternalAction) this.f155979q;
        return ((favoriteSellersInternalAction instanceof FavoriteSellersInternalAction.DataLoaded) && this.f155980r.invoke().f156052q) ? C43175k.N(new C43210w(favoriteSellersInternalAction), this.f155981s.f155960a.b()) : new C43210w(favoriteSellersInternalAction);
    }
}
