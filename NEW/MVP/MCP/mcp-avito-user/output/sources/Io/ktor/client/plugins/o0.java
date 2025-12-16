package io.ktor.client.plugins;

import io.ktor.http.C41519f0;
import io.ktor.http.InterfaceC41525i0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.UserAgent$Plugin$install$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class o0 extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f399605r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0 n0Var, Continuation<? super o0> continuation) {
        super(3, continuation);
        this.f399605r = n0Var;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        o0 o0Var = new o0(this.f399605r, continuation);
        o0Var.f399604q = eVar;
        return o0Var.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        io.ktor.util.pipeline.e eVar = this.f399604q;
        org.slf4j.a aVar = r0.f399628a;
        StringBuilder sb2 = new StringBuilder("Adding User-Agent header: ");
        n0 n0Var = this.f399605r;
        sb2.append(n0Var.f399597a);
        sb2.append(" for ");
        sb2.append(((io.ktor.client.request.d0) eVar.f400528b).f399707a);
        aVar.e(sb2.toString());
        InterfaceC41525i0 interfaceC41525i0 = (InterfaceC41525i0) eVar.f400528b;
        C41519f0.f400005a.getClass();
        io.ktor.client.request.n0.a(interfaceC41525i0, C41519f0.f400001A, n0Var.f399597a);
        return G0.f406611a;
    }
}
