package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.remote.model.SubscribeInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FavoriteSellersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$subscribe$1", f = "FavoriteSellersInteractor.kt", i = {0, 1, 2, 3, 3}, l = {232, 234, 242, 244, 259}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "subscribeInfo"}, s = {"L$0", "L$0", "L$0", "L$0", "L$3"})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f156095q;

    /* renamed from: r, reason: collision with root package name */
    public SubscribableItem f156096r;

    /* renamed from: s, reason: collision with root package name */
    public SubscribeInfo f156097s;

    /* renamed from: t, reason: collision with root package name */
    public int f156098t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f156099u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SubscribableItem f156100v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C30589m f156101w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C30589m c30589m, SubscribableItem subscribableItem, Continuation continuation) {
        super(2, continuation);
        this.f156100v = subscribableItem;
        this.f156101w = c30589m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f156101w, this.f156100v, continuation);
        rVar.f156099u = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorite_sellers.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
