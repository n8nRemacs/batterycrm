package com.avito.android.comparison.mvi;

import Rq.b;
import Rq.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComparisonOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comparison/mvi/x;", "Lcom/avito/android/arch/mvi/t;", "LRq/b;", "LRq/c;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x implements com.avito.android.arch.mvi.t<Rq.b, Rq.c> {
    @Inject
    public x() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Rq.c b(Rq.b bVar) {
        Rq.b bVar2 = bVar;
        if (bVar2 instanceof b.i) {
            return new c.C0986c(((b.i) bVar2).f14681a);
        }
        if (bVar2 instanceof b.a) {
            return c.b.f14686a;
        }
        if (bVar2 instanceof b.k) {
            b.k kVar = (b.k) bVar2;
            return new c.d(kVar.f14683a, kVar.f14684b);
        }
        if (bVar2 instanceof b.C0985b) {
            return new c.a(((b.C0985b) bVar2).f14676a);
        }
        return null;
    }
}
