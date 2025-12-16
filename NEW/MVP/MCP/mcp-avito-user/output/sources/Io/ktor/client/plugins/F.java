package io.ktor.client.plugins;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import io.ktor.http.C41524i;
import io.ktor.http.C41528k;
import io.ktor.http.C41529k0;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.core.C41641n;
import java.nio.charset.Charset;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpPlainText.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", i = {0, 0}, l = {136, 138}, m = "invokeSuspend", n = {"$this$intercept", RequestReviewResultKt.INFO_TYPE}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class F extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399017q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399018r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399019s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f399020t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D d12, Continuation<? super F> continuation) {
        super(3, continuation);
        this.f399020t = d12;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        F f12 = new F(this.f399020t, continuation);
        f12.f399018r = eVar;
        f12.f399019s = eVar2;
        return f12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        io.ktor.util.pipeline.e eVar;
        U31.b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399017q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar2 = this.f399018r;
            io.ktor.client.statement.e eVar3 = (io.ktor.client.statement.e) this.f399019s;
            U31.b bVar2 = eVar3.f399785a;
            if (kotlin.jvm.internal.L.f(bVar2.f16154a, kotlin.jvm.internal.m0.f406844a.b(String.class))) {
                Object obj2 = eVar3.f399786b;
                if (obj2 instanceof W0) {
                    this.f399018r = eVar2;
                    this.f399019s = bVar2;
                    this.f399017q = 1;
                    Object objI = ((W0) obj2).I(Long.MAX_VALUE, this);
                    if (objI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = eVar2;
                    obj = objI;
                    bVar = bVar2;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        bVar = (U31.b) this.f399019s;
        eVar = this.f399018r;
        C42729a0.b(obj);
        C41641n c41641n = (C41641n) obj;
        io.ktor.client.call.b bVar3 = (io.ktor.client.call.b) eVar.f400528b;
        D d12 = this.f399020t;
        d12.getClass();
        io.ktor.client.statement.d dVar = bVar3.f398806d;
        if (dVar == null) {
            dVar = null;
        }
        C41524i c41524iB = C41529k0.b(dVar);
        Charset charsetA = c41524iB != null ? C41528k.a(c41524iB) : null;
        if (charsetA == null) {
            charsetA = d12.f399007a;
        }
        org.slf4j.a aVar = I.f399021a;
        StringBuilder sb2 = new StringBuilder("Reading response body for ");
        io.ktor.client.request.c0 c0Var = bVar3.f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        sb2.append(c0Var.getF399693c());
        sb2.append(" as String with charset ");
        sb2.append(charsetA);
        aVar.e(sb2.toString());
        io.ktor.client.statement.e eVar4 = new io.ktor.client.statement.e(bVar, io.ktor.utils.io.core.S.c(c41641n, charsetA));
        this.f399018r = null;
        this.f399019s = null;
        this.f399017q = 2;
        if (eVar.g(eVar4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
