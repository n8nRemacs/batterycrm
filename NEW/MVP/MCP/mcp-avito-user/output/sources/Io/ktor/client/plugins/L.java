package io.ktor.client.plugins;

import io.ktor.client.plugins.J;
import io.ktor.http.C41531l0;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpRedirect.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/m0;", "Lio/ktor/client/request/d0;", "context", "Lio/ktor/client/call/b;", "<anonymous>", "(Lio/ktor/client/plugins/m0;Lio/ktor/client/request/d0;)Lio/ktor/client/call/b;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", i = {0, 0}, l = {64, 69}, m = "invokeSuspend", n = {"$this$intercept", "context"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class L extends SuspendLambda implements Y41.q<m0, io.ktor.client.request.d0, Continuation<? super io.ktor.client.call.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399040q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ m0 f399041r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.request.d0 f399042s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f399043t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399044u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(J j12, io.ktor.client.a aVar, Continuation<? super L> continuation) {
        super(3, continuation);
        this.f399043t = j12;
        this.f399044u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(m0 m0Var, io.ktor.client.request.d0 d0Var, Continuation<? super io.ktor.client.call.b> continuation) {
        L l12 = new L(this.f399043t, this.f399044u, continuation);
        l12.f399041r = m0Var;
        l12.f399042s = d0Var;
        return l12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        m0 m0Var;
        io.ktor.client.request.d0 d0Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399040q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m0 m0Var2 = this.f399041r;
            io.ktor.client.request.d0 d0Var2 = this.f399042s;
            this.f399041r = m0Var2;
            this.f399042s = d0Var2;
            this.f399040q = 1;
            Object objA = m0Var2.a(d0Var2, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            m0Var = m0Var2;
            d0Var = d0Var2;
            obj = objA;
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io.ktor.client.request.d0 d0Var3 = this.f399042s;
            m0 m0Var3 = this.f399041r;
            C42729a0.b(obj);
            d0Var = d0Var3;
            m0Var = m0Var3;
        }
        io.ktor.client.call.b bVar = (io.ktor.client.call.b) obj;
        J j12 = this.f399043t;
        if (j12.f399025a) {
            Set<C41531l0> set = M.f399045a;
            io.ktor.client.request.c0 c0Var = bVar.f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            if (!set.contains(c0Var.getF399692b())) {
                return bVar;
            }
        }
        J.b bVar2 = J.f399022c;
        this.f399041r = null;
        this.f399042s = null;
        this.f399040q = 2;
        obj = J.b.c(bVar2, m0Var, d0Var, bVar, j12.f399026b, this.f399044u, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
