package io.ktor.client.plugins;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/m0;", "Lio/ktor/client/request/d0;", "request", "Lio/ktor/client/call/b;", "<anonymous>", "(Lio/ktor/client/plugins/m0;Lio/ktor/client/request/d0;)Lio/ktor/client/call/b;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", i = {1}, l = {151, 152}, m = "invokeSuspend", n = {"call"}, s = {"L$0"})
/* renamed from: io.ktor.client.plugins.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41464u extends SuspendLambda implements Y41.q<m0, io.ktor.client.request.d0, Continuation<? super io.ktor.client.call.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399638q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399639r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.request.d0 f399640s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41465v f399641t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41464u(C41465v c41465v, Continuation<? super C41464u> continuation) {
        super(3, continuation);
        this.f399641t = c41465v;
    }

    @Override // Y41.q
    public final Object invoke(m0 m0Var, io.ktor.client.request.d0 d0Var, Continuation<? super io.ktor.client.call.b> continuation) {
        C41464u c41464u = new C41464u(this.f399641t, continuation);
        c41464u.f399639r = m0Var;
        c41464u.f399640s = d0Var;
        return c41464u.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399638q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m0 m0Var = (m0) this.f399639r;
            io.ktor.client.request.d0 d0Var = this.f399640s;
            this.f399639r = null;
            this.f399638q = 1;
            obj = m0Var.a(d0Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                io.ktor.client.call.b bVar = (io.ktor.client.call.b) this.f399639r;
                C42729a0.b(obj);
                return bVar;
            }
            C42729a0.b(obj);
        }
        io.ktor.client.call.b bVar2 = (io.ktor.client.call.b) obj;
        io.ktor.client.statement.d dVar = bVar2.f398806d;
        io.ktor.client.statement.d dVar2 = dVar != null ? dVar : null;
        this.f399639r = bVar2;
        this.f399638q = 2;
        return C41465v.b(this.f399641t, dVar2, this) == coroutine_suspended ? coroutine_suspended : bVar2;
    }
}
