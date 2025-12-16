package com.avito.android.search.filter;

import kotlin.Metadata;

/* compiled from: FiltersViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f263362l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var) {
        super(0);
        this.f263362l = k1Var;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        io.reactivex.rxjava3.subjects.e<kotlin.G0> eVar = this.f263362l.f263383o;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        eVar.onNext(g02);
        return g02;
    }
}
