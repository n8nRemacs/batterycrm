package com.avito.android.advert_collection.mvi;

import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: AdvertCollectionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionActor$process$3", f = "AdvertCollectionActor.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f81554q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f81555r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f81556s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionState f81557t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AdvertCollectionState advertCollectionState, Continuation<? super b> continuation) {
        super(3, continuation);
        this.f81556s = eVar;
        this.f81557t = advertCollectionState;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        b bVar = new b(this.f81556s, this.f81557t, continuation);
        bVar.f81555r = interfaceC43172j;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f81554q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f81555r;
            X xC2 = this.f81556s.c(this.f81557t);
            this.f81554q = 1;
            if (C43175k.u(this, xC2, interfaceC43172j) == coroutine_suspended) {
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
