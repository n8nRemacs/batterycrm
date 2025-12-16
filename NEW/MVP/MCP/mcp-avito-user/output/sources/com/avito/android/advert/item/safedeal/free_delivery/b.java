package com.avito.android.advert.item.safedeal.free_delivery;

import Y41.p;
import Y61.k;
import Y61.l;
import aa.C19848a;
import aa.C19849b;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Laa/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.safedeal.free_delivery.FreeDeliveryInteractor$requestFreeDelivery$1$1", f = "FreeDeliveryInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<C19849b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f78801q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f78802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f78803s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f78802r = dVar;
        this.f78803s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f78802r, this.f78803s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C19849b>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f78801q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z9.a aVar = this.f78802r.f78805a.get();
            C19848a c19848a = new C19848a(Long.parseLong(this.f78803s));
            this.f78801q = 1;
            obj = aVar.c(c19848a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
