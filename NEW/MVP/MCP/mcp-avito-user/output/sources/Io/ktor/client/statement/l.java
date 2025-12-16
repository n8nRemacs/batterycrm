package io.ktor.client.statement;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpStatement.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/statement/d;", "it", "<anonymous>", "(Lio/ktor/client/statement/d;)Lio/ktor/client/statement/d;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class l extends SuspendLambda implements Y41.p<d, Continuation<? super d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399808q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399809r;

    public l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(2, continuation);
        lVar.f399809r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(d dVar, Continuation<? super d> continuation) {
        return ((l) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399808q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.client.call.b f399772b = ((d) this.f399809r).getF399772b();
            this.f399808q = 1;
            obj = io.ktor.client.call.g.a(f399772b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        d dVar = ((io.ktor.client.call.b) obj).f398806d;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
