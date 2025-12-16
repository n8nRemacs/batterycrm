package io.ktor.client.plugins.contentnegotiation;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import io.ktor.client.request.c0;
import io.ktor.http.C41509b0;
import io.ktor.http.C41517e0;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.C41529k0;
import io.ktor.http.O;
import io.ktor.http.T;
import io.ktor.http.T0;
import io.ktor.serialization.ContentConvertException;
import java.nio.charset.Charset;
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
import kotlin.text.C43047d;

/* compiled from: ContentNegotiation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", f = "ContentNegotiation.kt", i = {0, 0}, l = {262, 265}, m = "invokeSuspend", n = {"$this$intercept", RequestReviewResultKt.INFO_TYPE}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class d extends SuspendLambda implements q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399317q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399318r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f399320t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f399320t = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f399320t, continuation);
        dVar.f399318r = eVar;
        dVar.f399319s = eVar2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws ContentConvertException {
        Charset charsetForName;
        io.ktor.util.pipeline.e eVar;
        U31.b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399317q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar2 = this.f399318r;
            io.ktor.client.statement.e eVar3 = (io.ktor.client.statement.e) this.f399319s;
            U31.b bVar2 = eVar3.f399785a;
            io.ktor.client.statement.d dVar = ((io.ktor.client.call.b) eVar2.f400528b).f398806d;
            if (dVar == null) {
                dVar = null;
            }
            C41524i c41524iB = C41529k0.b(dVar);
            if (c41524iB == null) {
                h.f399335a.e("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                return G0.f406611a;
            }
            io.ktor.client.call.b bVar3 = (io.ktor.client.call.b) eVar2.f400528b;
            c0 c0Var = bVar3.f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            T f399282f = c0Var.getF399115f();
            Charset charset = C43047d.f410589b;
            C41519f0.f400005a.getClass();
            Iterator it = C42745f0.B0(C41517e0.a(f399282f.get(C41519f0.f400007c)), new C41509b0()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    charsetForName = null;
                    break;
                }
                String str = ((O) it.next()).f399881a;
                if (L.f(str, "*")) {
                    charsetForName = charset;
                    break;
                }
                if (Charset.isSupported(str)) {
                    charsetForName = Charset.forName(str);
                    break;
                }
            }
            Charset charset2 = charsetForName == null ? charset : charsetForName;
            c0 c0Var2 = bVar3.f398805c;
            if (c0Var2 == null) {
                c0Var2 = null;
            }
            T0 f399703d = c0Var2.getF399693c();
            this.f399318r = eVar2;
            this.f399319s = bVar2;
            this.f399317q = 1;
            Object objB = this.f399320t.b(f399703d, bVar2, eVar3.f399786b, c41524iB, charset2, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = eVar2;
            obj = objB;
            bVar = bVar2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            bVar = (U31.b) this.f399319s;
            eVar = this.f399318r;
            C42729a0.b(obj);
        }
        if (obj == null) {
            return G0.f406611a;
        }
        io.ktor.client.statement.e eVar4 = new io.ktor.client.statement.e(bVar, obj);
        this.f399318r = null;
        this.f399319s = null;
        this.f399317q = 2;
        if (eVar.g(eVar4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
