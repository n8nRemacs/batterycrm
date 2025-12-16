package com.avito.android.loyalty.ui.items.quality_progress;

import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: QualityProgress.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/quality_progress/e;", "Lkotlin/properties/e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends kotlin.properties.e<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QualityProgress f183731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f183732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, QualityProgress qualityProgress, Y41.a<G0> aVar) {
        super(obj);
        this.f183731b = qualityProgress;
        this.f183732c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.properties.e
    public final void afterChange(@k n<?> nVar, Object obj, Object obj2) {
        if (L.f(obj, obj2) || !this.f183731b.f183701F) {
            return;
        }
        this.f183732c.invoke();
    }
}
