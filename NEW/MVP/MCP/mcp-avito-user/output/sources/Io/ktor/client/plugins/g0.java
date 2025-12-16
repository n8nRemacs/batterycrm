package io.ktor.client.plugins;

import io.ktor.client.plugins.e0;
import io.ktor.http.C41529k0;
import io.ktor.http.InterfaceC41525i0;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HttpSend.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "content", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {104, 105}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class g0 extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399433q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399434r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399435s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f399436t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399437u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, io.ktor.client.a aVar, Continuation<? super g0> continuation) {
        super(3, continuation);
        this.f399436t = e0Var;
        this.f399437u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        g0 g0Var = new g0(this.f399436t, this.f399437u, continuation);
        g0Var.f399434r = eVar;
        g0Var.f399435s = obj;
        return g0Var.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, io.ktor.client.plugins.e0$b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, io.ktor.client.plugins.e0$c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        io.ktor.util.pipeline.e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399433q;
        if (i12 == 0) {
            C42729a0.b(obj);
            eVar = this.f399434r;
            Object obj2 = this.f399435s;
            if (!(obj2 instanceof io.ktor.http.content.p)) {
                throw new IllegalStateException(C43066x.F0("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.m0.f406844a.b(obj2.getClass()) + ", with Content-Type: " + C41529k0.c((InterfaceC41525i0) eVar.f400528b) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
            }
            io.ktor.client.request.d0 d0Var = (io.ktor.client.request.d0) eVar.f400528b;
            if (obj2 == null) {
                d0Var.f399710d = io.ktor.http.content.o.f399976a;
                kotlin.reflect.r rVarC = kotlin.jvm.internal.m0.c(io.ktor.http.content.p.class);
                d0Var.c(new U31.b(kotlin.jvm.internal.m0.f406844a.b(io.ktor.http.content.p.class), kotlin.reflect.y.d(rVarC), rVarC));
            } else if (obj2 instanceof io.ktor.http.content.p) {
                d0Var.f399710d = obj2;
                d0Var.c(null);
            } else {
                d0Var.f399710d = obj2;
                kotlin.reflect.r rVarC2 = kotlin.jvm.internal.m0.c(io.ktor.http.content.p.class);
                d0Var.c(new U31.b(kotlin.jvm.internal.m0.f406844a.b(io.ktor.http.content.p.class), kotlin.reflect.y.d(rVarC2), rVarC2));
            }
            e0 e0Var = this.f399436t;
            ?? bVar = new e0.b(e0Var.f399415a, this.f399437u);
            l0.h hVar = new l0.h();
            hVar.f406842b = bVar;
            ArrayList arrayList = e0Var.f399416b;
            kotlin.ranges.k it = kotlin.ranges.s.k(C42745f0.J(arrayList), 0).iterator();
            while (it.f406910d) {
                hVar.f406842b = new e0.c((Y41.q) arrayList.get(it.a()), (m0) hVar.f406842b);
            }
            m0 m0Var = (m0) hVar.f406842b;
            io.ktor.client.request.d0 d0Var2 = (io.ktor.client.request.d0) eVar.f400528b;
            this.f399434r = eVar;
            this.f399433q = 1;
            obj = m0Var.a(d0Var2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            eVar = this.f399434r;
            C42729a0.b(obj);
        }
        this.f399434r = null;
        this.f399433q = 2;
        if (eVar.g((io.ktor.client.call.b) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
