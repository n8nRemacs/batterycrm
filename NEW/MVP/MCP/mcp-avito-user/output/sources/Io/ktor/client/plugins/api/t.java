package io.ktor.client.plugins.api;

import io.ktor.client.plugins.m0;
import io.ktor.client.request.d0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommonHooks.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/m0;", "Lio/ktor/client/request/d0;", "request", "Lio/ktor/client/call/b;", "<anonymous>", "(Lio/ktor/client/plugins/m0;Lio/ktor/client/request/d0;)Lio/ktor/client/call/b;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class t extends SuspendLambda implements Y41.q<m0, d0, Continuation<? super io.ktor.client.call.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399086q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ m0 f399087r;

    public t() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(m0 m0Var, d0 d0Var, Continuation<? super io.ktor.client.call.b> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399086q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f399086q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return obj;
    }
}
