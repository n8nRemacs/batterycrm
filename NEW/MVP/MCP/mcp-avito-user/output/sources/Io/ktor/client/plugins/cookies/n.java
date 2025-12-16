package io.ktor.client.plugins.cookies;

import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: HttpCookies.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public k f399384q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f399385r;

    /* renamed from: s, reason: collision with root package name */
    public int f399386s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f399387t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f399387t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f399387t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Iterator it;
        k kVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399386s;
        if (i12 == 0) {
            C42729a0.b(obj);
            k kVar2 = this.f399387t;
            it = kVar2.f399369c.iterator();
            kVar = kVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f399385r;
            kVar = this.f399384q;
            C42729a0.b(obj);
        }
        while (it.hasNext()) {
            Y41.p pVar = (Y41.p) it.next();
            d dVar = kVar.f399368b;
            this.f399384q = kVar;
            this.f399385r = it;
            this.f399386s = 1;
            if (pVar.invoke(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
