package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.util.V2;
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

/* compiled from: FavoriteSellersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$refreshSellersStates$2", f = "FavoriteSellersInteractor.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.favorite_sellers.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30593q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FavoriteSellersInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156091q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f156092r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f156093s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C30589m f156094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30593q(C30589m c30589m, Continuation<? super C30593q> continuation) {
        super(3, continuation);
        this.f156094t = c30589m;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C30593q c30593q = new C30593q(this.f156094t, continuation);
        c30593q.f156092r = interfaceC43172j;
        c30593q.f156093s = th2;
        return c30593q.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156091q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f156092r;
            V2.f318762a.f(this.f156093s);
            InterfaceC43160i<FavoriteSellersInternalAction> interfaceC43160iC = this.f156094t.c(false);
            this.f156092r = null;
            this.f156091q = 1;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
