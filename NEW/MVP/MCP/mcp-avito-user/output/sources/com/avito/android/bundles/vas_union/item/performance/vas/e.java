package com.avito.android.bundles.vas_union.item.performance.vas;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PerformanceVasItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f108651l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f108652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, c cVar) {
        super(0);
        this.f108651l = fVar;
        this.f108652m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f108651l.f108653b.onNext(this.f108652m.f108650i);
        return G0.f406611a;
    }
}
