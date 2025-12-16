package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.C43255z;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/scheduling/o;", "Lkotlinx/coroutines/M;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class o extends M {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final o f412186c = new o();

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        c cVar = c.f412169d;
        cVar.f412173c.b(runnable, n.f412185h, false);
    }

    @Override // kotlinx.coroutines.M
    @I0
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        c cVar = c.f412169d;
        cVar.f412173c.b(runnable, n.f412185h, true);
    }

    @Override // kotlinx.coroutines.M
    @B0
    @Y61.k
    public final M q(int i12) {
        C43255z.a(i12);
        return i12 >= n.f412181d ? this : super.q(i12);
    }
}
