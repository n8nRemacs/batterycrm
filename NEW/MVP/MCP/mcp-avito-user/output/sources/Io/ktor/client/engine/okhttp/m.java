package io.ktor.client.engine.okhttp;

import io.ktor.http.content.p;
import io.ktor.utils.io.X;
import io.ktor.utils.io.e2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OkHttpEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class m extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f398951q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f398952r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.content.p f398953s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(io.ktor.http.content.p pVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f398953s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f398953s, continuation);
        mVar.f398952r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((m) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398951q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = (e2) this.f398952r;
            p.e eVar = (p.e) this.f398953s;
            X xA2 = e2Var.a();
            this.f398951q = 1;
            if (eVar.e(xA2, this) == coroutine_suspended) {
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
