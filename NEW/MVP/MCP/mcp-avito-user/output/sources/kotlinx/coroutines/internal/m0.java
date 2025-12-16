package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.u1;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/m0;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final CoroutineContext f411920a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object[] f411921b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u1<Object>[] f411922c;

    /* renamed from: d, reason: collision with root package name */
    public int f411923d;

    public m0(int i12, @Y61.k CoroutineContext coroutineContext) {
        this.f411920a = coroutineContext;
        this.f411921b = new Object[i12];
        this.f411922c = new u1[i12];
    }
}
