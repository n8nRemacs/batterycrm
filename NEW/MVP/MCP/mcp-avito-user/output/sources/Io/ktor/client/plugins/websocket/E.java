package io.ktor.client.plugins.websocket;

import io.ktor.client.request.d0;
import io.ktor.client.request.n0;
import io.ktor.http.C41519f0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;

/* compiled from: WebSockets.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class E extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399667q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399668r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f399669s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f399670t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(D d12, Continuation continuation, boolean z12) {
        super(3, continuation);
        this.f399669s = z12;
        this.f399670t = d12;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        boolean z12 = this.f399669s;
        E e12 = new E(this.f399670t, continuation, z12);
        e12.f399668r = eVar;
        return e12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399667q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399668r;
            String str = ((d0) eVar.f400528b).f399707a.f399862a.f399889a;
            boolean z12 = L.f(str, "ws") || L.f(str, "wss");
            TContext tcontext = eVar.f400528b;
            if (!z12) {
                G.f399677b.e("Skipping WebSocket plugin for non-websocket request: " + ((d0) tcontext).f399707a);
                return G0.f406611a;
            }
            org.slf4j.a aVar = G.f399677b;
            StringBuilder sb2 = new StringBuilder("Sending WebSocket request ");
            d0 d0Var = (d0) tcontext;
            sb2.append(d0Var.f399707a);
            aVar.e(sb2.toString());
            d0Var.d(z.f399686a, G0.f406611a);
            if (this.f399669s) {
                ArrayList arrayList = this.f399670t.f399662c.f401439a;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((io.ktor.websocket.L) ((Y41.a) it.next()).invoke());
                }
                d0Var.f399712f.a(G.f399676a, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C42745f0.h(((io.ktor.websocket.L) it2.next()).a(), arrayList3);
                }
                if (!arrayList3.isEmpty()) {
                    String strO = C42745f0.O(arrayList3, ";", null, null, null, 62);
                    C41519f0.f400005a.getClass();
                    n0.a(d0Var, C41519f0.f400025u, strO);
                }
            }
            A a12 = new A();
            this.f399667q = 1;
            if (eVar.g(a12, this) == coroutine_suspended) {
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
