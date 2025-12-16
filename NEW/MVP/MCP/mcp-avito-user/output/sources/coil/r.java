package coil;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f58602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N.b bVar, n nVar) {
        super(bVar);
        this.f58602b = nVar;
    }

    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        coil.util.o oVar = this.f58602b.f58547h;
        if (oVar == null || oVar.f58787a > 6) {
            return;
        }
        oVar.a(6, "RealImageLoader", null, th2);
    }
}
