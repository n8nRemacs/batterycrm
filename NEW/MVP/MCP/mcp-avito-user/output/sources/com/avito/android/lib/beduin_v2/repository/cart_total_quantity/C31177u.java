package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Cj.InterfaceC13310a;
import Dj.C13406a;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CartMenuIconRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LDj/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.cart_total_quantity.CartMenuIconRepository$getCartIconInfo$1$1", f = "CartMenuIconRepository.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31177u extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<C13406a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f176526q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31179w f176527r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31177u(C31179w c31179w, Continuation<? super C31177u> continuation) {
        super(2, continuation);
        this.f176527r = c31179w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C31177u(this.f176527r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<C13406a>> continuation) {
        return ((C31177u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176526q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC13310a interfaceC13310a = this.f176527r.f176534a.get();
            this.f176526q = 1;
            obj = interfaceC13310a.a(this);
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
