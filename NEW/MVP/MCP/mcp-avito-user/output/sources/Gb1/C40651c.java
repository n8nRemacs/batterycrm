package gb1;

import Y41.l;
import bb1.r;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.factory.MasterHostIPCClientsFactoryImpl$create$pushIPCClient$1", f = "MasterHostIPCClientsFactoryImpl.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: gb1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40651c extends SuspendLambda implements l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f396494q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f396495r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40651c(r rVar, Continuation continuation) {
        super(1, continuation);
        this.f396495r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new C40651c(this.f396495r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return new C40651c(this.f396495r, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f396494q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f396494q = 1;
            if (this.f396495r.invoke(this) == coroutine_suspended) {
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
