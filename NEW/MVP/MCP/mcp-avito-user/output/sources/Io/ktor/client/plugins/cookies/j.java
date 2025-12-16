package io.ktor.client.plugins.cookies;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCookies.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/d;", "Lkotlin/G0;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", f = "HttpCookies.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class j extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0>, io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399363q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.d f399364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f399365s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f399365s = kVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0> eVar, io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        j jVar = new j(this.f399365s, continuation);
        jVar.f399364r = dVar;
        return jVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399363q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.client.statement.d dVar = this.f399364r;
            this.f399363q = 1;
            if (this.f399365s.c(dVar, this) == coroutine_suspended) {
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
