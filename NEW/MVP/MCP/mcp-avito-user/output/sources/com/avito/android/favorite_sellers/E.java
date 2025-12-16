package com.avito.android.favorite_sellers;

import FC.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Q0;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$renderSubscriptionMenu$2$3", f = "FavoriteSellersView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class E extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f155395q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.subscriptions_settings.d f155396r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h12, com.avito.android.subscriptions_settings.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f155395q = h12;
        this.f155396r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f155395q, this.f155396r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((E) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        H h12 = this.f155395q;
        h12.f155433g.c(this.f155396r);
        h12.f155447u = null;
        h12.f155430d.accept(a.l.f4610a);
        Q0.d(h12.f155448v.f411905b);
        return G0.f406611a;
    }
}
