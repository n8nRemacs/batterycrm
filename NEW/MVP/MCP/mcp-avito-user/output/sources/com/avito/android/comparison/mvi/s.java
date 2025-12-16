package com.avito.android.comparison.mvi;

import Rq.b;
import com.avito.android.comparison.ComparisonFragmentMvi;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.util.Y5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ComparisonBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/mvi/s;", "Lcom/avito/android/arch/mvi/b;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements com.avito.android.arch.mvi.b<Rq.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.domain.a f124163a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComparisonFragmentMvi.a f124164b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Sq.g f124165c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.e f124166d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f124167e;

    @Inject
    public s(@Y61.k com.avito.android.comparison.domain.a aVar, @Y61.k ComparisonFragmentMvi.a aVar2, @Y61.k Sq.g gVar, @Y61.k com.avito.android.comparison.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3) {
        this.f124163a = aVar;
        this.f124164b = aVar2;
        this.f124165c = gVar;
        this.f124166d = eVar;
        this.f124167e = aVar3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Rq.b> a() {
        ComparisonFragmentMvi.a aVar = this.f124164b;
        io.reactivex.rxjava3.core.z zVarA = Y5.a(this.f124163a.c(aVar.f123787a, aVar.f123788b, true));
        final Sq.g gVar = this.f124165c;
        return C43175k.N(kotlinx.coroutines.rx3.y.a(io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(b.d.f14678a), zVarA.d0(new l41.o() { // from class: com.avito.android.comparison.mvi.o
            @Override // l41.o
            public final Object apply(Object obj) {
                return gVar.a((ComparisonResponse) obj, false);
            }
        }).d0(p.f124157b)).m0(new q(this))), C43175k.G(new r(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
