package io.ktor.client.plugins.logging;

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

/* compiled from: ObservingUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", f = "ObservingUtils.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class z extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399570q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399571r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p.e f399572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p.e eVar, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f399572s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        z zVar = new z(this.f399572s, continuation);
        zVar.f399571r = obj;
        return zVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((z) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399570q;
        if (i12 == 0) {
            C42729a0.b(obj);
            X xA2 = ((e2) this.f399571r).a();
            this.f399570q = 1;
            if (this.f399572s.e(xA2, this) == coroutine_suspended) {
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
