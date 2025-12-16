package com.avito.android.favorite_sellers;

import FC.a;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$renderSubscriptionMenu$2$2", f = "FavoriteSellersView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class D extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f155393q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FavoriteSellersState.SubscriptionMenuState f155394r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H h12, FavoriteSellersState.SubscriptionMenuState subscriptionMenuState, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f155393q = h12;
        this.f155394r = subscriptionMenuState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new D(this.f155393q, this.f155394r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((D) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f155393q.f155430d.accept(new a.m(this.f155394r.f156053b));
        return G0.f406611a;
    }
}
