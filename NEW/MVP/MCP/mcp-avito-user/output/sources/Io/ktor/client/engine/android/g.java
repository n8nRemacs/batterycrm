package io.ktor.client.engine.android;

import Y41.p;
import Y61.l;
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

/* compiled from: AndroidClientEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1", f = "AndroidClientEngine.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class g extends SuspendLambda implements p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f398872q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f398873r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.content.p f398874s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.ktor.http.content.p pVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f398874s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f398874s, continuation);
        gVar.f398873r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((g) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398872q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = (e2) this.f398873r;
            p.e eVar = (p.e) this.f398874s;
            X xA2 = e2Var.a();
            this.f398872q = 1;
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
