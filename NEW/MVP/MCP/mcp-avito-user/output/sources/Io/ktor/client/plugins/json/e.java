package io.ktor.client.plugins.json;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import io.ktor.http.C41524i;
import io.ktor.http.C41529k0;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.core.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: JsonPlugin.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.json.JsonPlugin$Plugin$install$2", f = "JsonPlugin.kt", i = {0, 0}, l = {221, 223}, m = "invokeSuspend", n = {"$this$intercept", RequestReviewResultKt.INFO_TYPE}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class e extends SuspendLambda implements q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public h f399471q;

    /* renamed from: r, reason: collision with root package name */
    public U31.b f399472r;

    /* renamed from: s, reason: collision with root package name */
    public int f399473s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399474t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f399475u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f399476v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, Continuation<? super e> continuation) {
        super(3, continuation);
        this.f399476v = cVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        e eVar3 = new e(this.f399476v, continuation);
        eVar3.f399474t = eVar;
        eVar3.f399475u = eVar2;
        return eVar3.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        io.ktor.util.pipeline.e eVar;
        U31.b bVar;
        h hVar;
        U31.b bVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399473s;
        if (i12 == 0) {
            C42729a0.b(obj);
            eVar = this.f399474t;
            io.ktor.client.statement.e eVar2 = (io.ktor.client.statement.e) this.f399475u;
            bVar = eVar2.f399785a;
            Object obj2 = eVar2.f399786b;
            if (!(obj2 instanceof W0)) {
                return G0.f406611a;
            }
            c cVar = this.f399476v;
            if (cVar.f399463d.contains(bVar.f16154a)) {
                return G0.f406611a;
            }
            io.ktor.client.statement.d dVar = ((io.ktor.client.call.b) eVar.f400528b).f398806d;
            if (dVar == null) {
                dVar = null;
            }
            C41524i c41524iB = C41529k0.b(dVar);
            if (c41524iB == null) {
                return G0.f406611a;
            }
            if (!cVar.a(c41524iB)) {
                return G0.f406611a;
            }
            this.f399474t = eVar;
            this.f399475u = bVar;
            h hVar2 = cVar.f399460a;
            this.f399471q = hVar2;
            this.f399472r = bVar;
            this.f399473s = 1;
            obj = ((W0) obj2).I(Long.MAX_VALUE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = hVar2;
            bVar2 = bVar;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            bVar = this.f399472r;
            hVar = this.f399471q;
            bVar2 = (U31.b) this.f399475u;
            eVar = this.f399474t;
            C42729a0.b(obj);
        }
        io.ktor.client.statement.e eVar3 = new io.ktor.client.statement.e(bVar2, hVar.a(bVar, (x) obj));
        this.f399474t = null;
        this.f399475u = null;
        this.f399471q = null;
        this.f399472r = null;
        this.f399473s = 2;
        if (eVar.g(eVar3, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
