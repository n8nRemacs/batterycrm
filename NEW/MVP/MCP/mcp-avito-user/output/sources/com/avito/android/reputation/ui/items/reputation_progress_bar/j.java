package com.avito.android.reputation.ui.items.reputation_progress_bar;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ReputationProgressBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_progress_bar/j;", "Lkotlin/properties/e;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends kotlin.properties.e<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34407a f254967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f254968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Object obj, C34407a c34407a, Y41.a<G0> aVar) {
        super(obj);
        this.f254967b = c34407a;
        this.f254968c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.properties.e
    public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, Object obj, Object obj2) {
        if (L.f(obj, obj2) || !this.f254967b.f254929G) {
            return;
        }
        this.f254968c.invoke();
    }
}
