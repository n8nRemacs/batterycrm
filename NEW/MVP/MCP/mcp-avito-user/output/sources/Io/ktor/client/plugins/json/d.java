package io.ktor.client.plugins.json;

import Y41.q;
import Y61.k;
import Y61.l;
import io.ktor.client.request.d0;
import io.ktor.client.utils.n;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.C41529k0;
import io.ktor.http.InterfaceC41525i0;
import io.ktor.http.U;
import io.ktor.http.content.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: JsonPlugin.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "payload", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.json.JsonPlugin$Plugin$install$1", f = "JsonPlugin.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class d extends SuspendLambda implements q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399467q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399468r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399469s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f399470t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f399470t = cVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        d dVar = new d(this.f399470t, continuation);
        dVar.f399468r = eVar;
        dVar.f399469s = obj;
        return dVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399467q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399468r;
            Object obj2 = this.f399469s;
            c cVar = this.f399470t;
            for (C41524i c41524i : cVar.f399461b) {
                U f399709c = ((InterfaceC41525i0) eVar.f400528b).getF399709c();
                C41519f0.f400005a.getClass();
                f399709c.d(C41519f0.f400006b, c41524i.toString());
            }
            if (cVar.f399463d.contains(m0.f406844a.b(obj2.getClass()))) {
                return G0.f406611a;
            }
            C41524i c41524iC = C41529k0.c((InterfaceC41525i0) eVar.f400528b);
            if (c41524iC == null) {
                return G0.f406611a;
            }
            if (!cVar.a(c41524iC)) {
                return G0.f406611a;
            }
            U u12 = ((d0) eVar.f400528b).f399709c;
            C41519f0.f400005a.getClass();
            u12.i(C41519f0.f400014j);
            p pVarB = (obj2.equals(G0.f406611a) || (obj2 instanceof n)) ? n.f399837a : cVar.f399460a.b(c41524iC, obj2);
            this.f399468r = null;
            this.f399467q = 1;
            if (eVar.g(pVarB, this) == coroutine_suspended) {
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
