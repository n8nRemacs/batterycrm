package io.ktor.client.plugins.websocket;

import io.ktor.client.request.c0;
import io.ktor.http.C41519f0;
import io.ktor.http.T;
import io.ktor.websocket.C41716b;
import io.ktor.websocket.C41722h;
import io.ktor.websocket.InterfaceC41715a;
import io.ktor.websocket.O;
import io.ktor.websocket.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.text.C43066x;

/* compiled from: WebSockets.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class F extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399671q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399672r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.e f399673s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f399674t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f399675u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D d12, Continuation continuation, boolean z12) {
        super(3, continuation);
        this.f399674t = d12;
        this.f399675u = z12;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        F f12 = new F(this.f399674t, continuation, this.f399675u);
        f12.f399672r = eVar;
        f12.f399673s = eVar2;
        return f12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [io.ktor.websocket.L] */
    /* JADX WARN: Type inference failed for: r4v6, types: [io.ktor.client.plugins.websocket.x] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        y yVar;
        InterfaceC41715a interfaceC41715a;
        ?? arrayList;
        ?? arrayList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399671q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399672r;
            io.ktor.client.statement.e eVar2 = this.f399673s;
            U31.b bVar = eVar2.f399785a;
            Object obj2 = eVar2.f399786b;
            if (!(obj2 instanceof Z)) {
                org.slf4j.a aVar = G.f399677b;
                StringBuilder sb2 = new StringBuilder("Skipping non-websocket response from ");
                c0 c0Var = ((io.ktor.client.call.b) eVar.f400528b).f398805c;
                sb2.append((c0Var != null ? c0Var : null).getF399693c());
                sb2.append(": ");
                sb2.append(obj2);
                aVar.e(sb2.toString());
                return G0.f406611a;
            }
            org.slf4j.a aVar2 = G.f399677b;
            StringBuilder sb3 = new StringBuilder("Receive websocket session from ");
            c0 c0Var2 = ((io.ktor.client.call.b) eVar.f400528b).f398805c;
            if (c0Var2 == null) {
                c0Var2 = null;
            }
            sb3.append(c0Var2.getF399693c());
            sb3.append(": ");
            sb3.append(obj2);
            aVar2.e(sb3.toString());
            boolean zF2 = L.f(bVar.f16154a, m0.f406844a.b(x.class));
            Object obj3 = eVar.f400528b;
            if (zF2) {
                Z z12 = (Z) obj2;
                D d12 = this.f399674t;
                d12.getClass();
                boolean z13 = z12 instanceof InterfaceC41715a;
                if (z13) {
                    interfaceC41715a = (InterfaceC41715a) z12;
                } else {
                    long j12 = d12.f399660a;
                    long j13 = j12 * 2;
                    org.slf4j.a aVar3 = C41722h.f401551a;
                    if (z13) {
                        throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
                    }
                    C41716b c41716b = new C41716b(z12, j12, j13);
                    c41716b.y(d12.f399661b);
                    interfaceC41715a = c41716b;
                }
                io.ktor.client.call.b bVar2 = (io.ktor.client.call.b) obj3;
                ?? xVar = new x(interfaceC41715a);
                if (this.f399675u) {
                    io.ktor.client.statement.d dVar = bVar2.f398806d;
                    if (dVar == null) {
                        dVar = null;
                    }
                    T tB2 = dVar.getF399115f();
                    C41519f0.f400005a.getClass();
                    String str = tB2.get(C41519f0.f400025u);
                    if (str != null) {
                        int i13 = 0;
                        List listF0 = C43066x.f0(str, new String[]{","}, 0, 6);
                        arrayList2 = new ArrayList(C42745f0.q(listF0, 10));
                        Iterator it = listF0.iterator();
                        while (it.hasNext()) {
                            List listF02 = C43066x.f0((String) it.next(), new String[]{";"}, i13, 6);
                            String string = C43066x.A0((String) C42745f0.E(listF02)).toString();
                            List listW = C42745f0.w(listF02, 1);
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(listW, 10));
                            Iterator it2 = listW.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(C43066x.A0((String) it2.next()).toString());
                            }
                            arrayList2.add(new O(string, arrayList3));
                            i13 = 0;
                        }
                    } else {
                        arrayList2 = C42784z0.f406748b;
                    }
                    List list = (List) bVar2.q().g(G.f399676a);
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (((io.ktor.websocket.L) obj4).d(arrayList2)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = C42784z0.f406748b;
                }
                xVar.P(arrayList);
                yVar = xVar;
            } else {
                yVar = new y((Z) obj2);
            }
            io.ktor.client.statement.e eVar3 = new io.ktor.client.statement.e(bVar, yVar);
            this.f399672r = null;
            this.f399671q = 1;
            if (eVar.g(eVar3, this) == coroutine_suspended) {
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
