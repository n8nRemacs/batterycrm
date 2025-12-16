package com.avito.android.favorite_sellers;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FavoriteSellersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$subscribe$2", f = "FavoriteSellersInteractor.kt", i = {0, 0}, l = {265, 280}, m = "invokeSuspend", n = {"$this$catch", "error"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.favorite_sellers.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30594s extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156102q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f156103r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f156104s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SubscribableItem f156105t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C30589m f156106u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30594s(C30589m c30589m, SubscribableItem subscribableItem, Continuation continuation) {
        super(3, continuation);
        this.f156105t = subscribableItem;
        this.f156106u = c30589m;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        SubscribableItem subscribableItem = this.f156105t;
        C30594s c30594s = new C30594s(this.f156106u, subscribableItem, continuation);
        c30594s.f156103r = interfaceC43172j;
        c30594s.f156104s = th2;
        return c30594s.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Throwable th2;
        InterfaceC43172j interfaceC43172j;
        FavoriteSellersInternalAction showSnackbarWithUndo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156102q;
        SubscribableItem subscribableItem = this.f156105t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f156103r;
            th2 = this.f156104s;
            subscribableItem.V0(false);
            FavoriteSellersInternalAction.SubscriptionProgress subscriptionProgress = new FavoriteSellersInternalAction.SubscriptionProgress(false);
            this.f156103r = interfaceC43172j2;
            this.f156104s = th2;
            this.f156102q = 1;
            if (interfaceC43172j2.emit(subscriptionProgress, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            th2 = this.f156104s;
            interfaceC43172j = this.f156103r;
            C42729a0.b(obj);
        }
        C30589m c30589m = this.f156106u;
        ApiError apiErrorA = c30589m.f155904i.a(th2);
        if (apiErrorA instanceof ApiError.ErrorDialog) {
            showSnackbarWithUndo = new FavoriteSellersInternalAction.ShowErrorDialog(((ApiError.ErrorDialog) apiErrorA).getUserDialog());
        } else if (apiErrorA instanceof ApiError.ErrorAction) {
            b.a.a(c30589m.f155899d, ((ApiError.ErrorAction) apiErrorA).getLink(), "key_favorite_presenter", null, 4);
            showSnackbarWithUndo = new FavoriteSellersInternalAction.DelayedResubscribe(subscribableItem);
        } else {
            showSnackbarWithUndo = new FavoriteSellersInternalAction.ShowSnackbarWithUndo(c30589m.f155904i.c(th2), subscribableItem);
        }
        this.f156103r = null;
        this.f156104s = null;
        this.f156102q = 2;
        if (interfaceC43172j.emit(showSnackbarWithUndo, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
