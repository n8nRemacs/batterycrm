package db1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.component.PushTestComponentImpl$sendTestNotification$$inlined$wrapInTask$1$1", f = "PushTestComponentImpl.kt", i = {}, l = {37, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f.b f393960q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f393960q = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new j(this.f393960q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        throw null;
    }
}
