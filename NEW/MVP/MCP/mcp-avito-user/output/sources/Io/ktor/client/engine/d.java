package io.ktor.client.engine;

import io.ktor.client.engine.InterfaceC41434a;
import io.ktor.client.request.d0;
import io.ktor.client.request.e0;
import io.ktor.client.request.k0;
import io.ktor.http.C41519f0;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;

/* compiled from: HttpClientEngine.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "content", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {70, 82}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class d extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f398893q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f398894r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f398895s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f398896t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41434a f398897u;

    /* compiled from: HttpClientEngine.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ io.ktor.client.a f398898l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ io.ktor.client.statement.d f398899m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.client.a aVar, io.ktor.client.statement.d dVar) {
            super(1);
            this.f398898l = aVar;
            this.f398899m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            if (th2 != null) {
                this.f398898l.f398784k.a(io.ktor.client.utils.f.f399836e, this.f398899m);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.ktor.client.a aVar, InterfaceC41434a interfaceC41434a, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f398896t = aVar;
        this.f398897u = interfaceC41434a;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        InterfaceC41434a interfaceC41434a = this.f398897u;
        d dVar = new d(this.f398896t, interfaceC41434a, continuation);
        dVar.f398894r = eVar;
        dVar.f398895s = obj;
        return dVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        e0 e0VarA;
        InterfaceC41434a interfaceC41434a;
        io.ktor.util.pipeline.e eVar;
        h<?> next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398893q;
        io.ktor.client.a aVar = this.f398896t;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar2 = this.f398894r;
            Object obj2 = this.f398895s;
            d0 d0Var = new d0();
            d0 d0Var2 = (d0) eVar2.f400528b;
            d0Var.f399711e = d0Var2.f399711e;
            d0Var.e(d0Var2);
            if (obj2 == null) {
                d0Var.f399710d = io.ktor.http.content.o.f399976a;
                kotlin.reflect.r rVarC = m0.c(Object.class);
                d0Var.c(new U31.b(m0.f406844a.b(Object.class), kotlin.reflect.y.d(rVarC), rVarC));
            } else if (obj2 instanceof io.ktor.http.content.p) {
                d0Var.f399710d = obj2;
                d0Var.c(null);
            } else {
                d0Var.f399710d = obj2;
                kotlin.reflect.r rVarC2 = m0.c(Object.class);
                d0Var.c(new U31.b(m0.f406844a.b(Object.class), kotlin.reflect.y.d(rVarC2), rVarC2));
            }
            aVar.f398784k.a(io.ktor.client.utils.f.f399833b, d0Var);
            e0VarA = d0Var.a();
            e0VarA.f399719f.a(o.f398908b, aVar.f398785l);
            Set<String> setNames = e0VarA.f399716c.names();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : setNames) {
                C41519f0.f400005a.getClass();
                if (C41519f0.f400004D.contains((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new UnsafeHeaderException(AK.c.k("Header(s) ", arrayList.toString(), " are controlled by the engine and cannot be set explicitly"));
            }
            Iterator<h<?>> it = e0VarA.f399720g.iterator();
            do {
                boolean zHasNext = it.hasNext();
                interfaceC41434a = this.f398897u;
                if (zHasNext) {
                    next = it.next();
                } else {
                    this.f398894r = eVar2;
                    this.f398895s = e0VarA;
                    this.f398893q = 1;
                    Object objA = InterfaceC41434a.C11397a.a(interfaceC41434a, e0VarA, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = eVar2;
                    obj = objA;
                }
            } while (interfaceC41434a.m4().contains(next));
            throw new IllegalArgumentException(("Engine doesn't support " + next).toString());
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        e0VarA = (e0) this.f398895s;
        eVar = this.f398894r;
        C42729a0.b(obj);
        io.ktor.client.call.b bVar = new io.ktor.client.call.b(aVar, e0VarA, (k0) obj);
        io.ktor.client.statement.d dVar = bVar.f398806d;
        if (dVar == null) {
            dVar = null;
        }
        aVar.f398784k.a(io.ktor.client.utils.f.f399834c, dVar);
        Q0.f(dVar.getF401596i()).k(new a(aVar, dVar));
        this.f398894r = null;
        this.f398895s = null;
        this.f398893q = 2;
        if (eVar.g(bVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
