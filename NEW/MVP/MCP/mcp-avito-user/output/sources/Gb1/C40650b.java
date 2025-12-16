package gb1;

import Y41.l;
import bb1.r;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.factory.MasterHostIPCClientsFactoryImpl$create$authIPCClient$1", f = "MasterHostIPCClientsFactoryImpl.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: gb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40650b extends SuspendLambda implements l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f396492q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f396493r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40650b(r rVar, Continuation continuation) {
        super(1, continuation);
        this.f396493r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new C40650b(this.f396493r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return new C40650b(this.f396493r, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f396492q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f396492q = 1;
            if (this.f396493r.invoke(this) == coroutine_suspended) {
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
