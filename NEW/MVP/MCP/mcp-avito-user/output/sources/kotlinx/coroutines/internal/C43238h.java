package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/h;", "Lkotlinx/coroutines/T;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43238h implements kotlinx.coroutines.T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f411905b;

    public C43238h(@Y61.k CoroutineContext coroutineContext) {
        this.f411905b = coroutineContext;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF411905b() {
        return this.f411905b;
    }

    @Y61.k
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f411905b + ')';
    }
}
