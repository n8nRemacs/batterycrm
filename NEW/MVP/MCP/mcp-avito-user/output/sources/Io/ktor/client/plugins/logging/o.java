package io.ktor.client.plugins.logging;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import io.ktor.client.request.c0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/d;", "Lkotlin/G0;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$1", f = "Logging.kt", i = {0, 0, 0, 0}, l = {184, 191, 191}, m = "invokeSuspend", n = {"response", "logger", "header", PaymentStateKt.PAYMENT_STATE_FAILED}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes8.dex */
final class o extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0>, io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public StringBuilder f399542q;

    /* renamed from: r, reason: collision with root package name */
    public int f399543r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399544s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f399545t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f399546u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, Continuation<? super o> continuation) {
        super(3, continuation);
        this.f399546u = kVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0> eVar, io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        o oVar = new o(this.f399546u, continuation);
        oVar.f399544s = eVar;
        oVar.f399545t = dVar;
        return oVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.StringBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Throwable th2;
        io.ktor.client.statement.d dVar;
        d dVar2;
        StringBuilder sb2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        StringBuilder sb3 = this.f399543r;
        boolean z12 = true;
        k kVar = this.f399546u;
        try {
            if (sb3 == 0) {
                C42729a0.b(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f399544s;
                dVar = (io.ktor.client.statement.d) this.f399545t;
                if (kVar.f399526b == LogLevel.f399490f || dVar.getF399772b().q().c(s.f399556b)) {
                    return G0.f406611a;
                }
                dVar2 = (d) dVar.getF399772b().q().g(s.f399555a);
                sb2 = new StringBuilder();
                io.ktor.client.statement.d dVar3 = dVar.getF399772b().f398806d;
                if (dVar3 == null) {
                    dVar3 = null;
                }
                w.d(sb2, dVar3, kVar.f399526b, kVar.f399528d);
                Object objE = eVar.e();
                this.f399544s = dVar;
                this.f399545t = dVar2;
                this.f399542q = sb2;
                this.f399543r = 1;
                if (eVar.g(objE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (sb3 != 1) {
                    if (sb3 == 2) {
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    if (sb3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.f399544s;
                    C42729a0.b(obj);
                    throw th2;
                }
                sb2 = this.f399542q;
                dVar2 = (d) this.f399545t;
                dVar = (io.ktor.client.statement.d) this.f399544s;
                C42729a0.b(obj);
            }
            String string = sb2.toString();
            dVar2.getClass();
            String string2 = C43066x.A0(string).toString();
            sb3 = dVar2.f399513c;
            sb3.append(string2);
            sb3.append('\n');
            dVar2.f399515e.q3();
            if (!kVar.f399526b.f399494d) {
                this.f399544s = null;
                this.f399545t = null;
                this.f399542q = null;
                this.f399543r = 2;
                if (dVar2.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        } catch (Throwable th3) {
            try {
                c0 c0Var = dVar.getF399772b().f398805c;
                if (c0Var == null) {
                    c0Var = null;
                }
                k.b(kVar, sb3, c0Var, th3);
            } catch (Throwable th4) {
                th = th4;
                z12 = false;
            }
            try {
                throw th3;
            } catch (Throwable th5) {
                th = th5;
                String string3 = sb3.toString();
                dVar2.getClass();
                String string4 = C43066x.A0(string3).toString();
                StringBuilder sb4 = dVar2.f399513c;
                sb4.append(string4);
                sb4.append('\n');
                dVar2.f399515e.q3();
                if (!z12 && kVar.f399526b.f399494d) {
                    throw th;
                }
                this.f399544s = th;
                this.f399545t = null;
                this.f399542q = null;
                this.f399543r = 3;
                if (dVar2.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th2 = th;
                throw th2;
            }
        }
    }
}
