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
@DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionActor$process$2", f = "AdvertCollectionActor.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f81550q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f81551r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f81552s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionState f81553t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, AdvertCollectionState advertCollectionState, Continuation<? super a> continuation) {
        super(3, continuation);
        this.f81552s = eVar;
        this.f81553t = advertCollectionState;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        a aVar = new a(this.f81552s, this.f81553t, continuation);
        aVar.f81551r = interfaceC43172j;
        return aVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f81550q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f81551r;
            X xC2 = this.f81552s.c(this.f81553t);
            this.f81550q = 1;
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
