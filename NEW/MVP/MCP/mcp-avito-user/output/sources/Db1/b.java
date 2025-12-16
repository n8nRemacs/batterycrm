package db1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.component.PushAvailabilityComponentImpl$checkPushAvailability$$inlined$wrapInTask$1$1", f = "PushAvailabilityComponentImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f.b f393956q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f393956q = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new b(this.f393956q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        new b(this.f393956q, continuation).invokeSuspend(G0.f406611a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        throw null;
    }
}
