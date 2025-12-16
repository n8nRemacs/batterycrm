package com.avito.android.advert_collection_list.mvi;

import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListActor$refreshPage$2", f = "AdvertCollectionListActor.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f82222q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f82223r;

    public f() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        f fVar = new f(3, continuation);
        fVar.f82223r = interfaceC43172j;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f82222q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f82223r;
            AdvertCollectionListInternalAction.HideSwipeToRefreshView hideSwipeToRefreshView = AdvertCollectionListInternalAction.HideSwipeToRefreshView.f82204b;
            this.f82222q = 1;
            if (interfaceC43172j.emit(hideSwipeToRefreshView, this) == coroutine_suspended) {
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
