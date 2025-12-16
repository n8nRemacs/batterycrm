package com.avito.android.developments_catalog.residential_complex_search.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sx.InterfaceC48426a;
import sx.InterfaceC48427b;

/* compiled from: ResidentialComplexFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lsx/a;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/n;", "Lsx/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.l<q<InterfaceC48426a, ResidentialComplexInternalAction, n, InterfaceC48427b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f139203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f139204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f139205n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f139206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, l lVar, j jVar) {
        super(1);
        this.f139203l = cVar;
        this.f139204m = aVar;
        this.f139205n = lVar;
        this.f139206o = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48426a, ResidentialComplexInternalAction, n, InterfaceC48427b> qVar) {
        q<InterfaceC48426a, ResidentialComplexInternalAction, n, InterfaceC48427b> qVar2 = qVar;
        qVar2.f92008d = this.f139203l;
        qVar2.f92009e = this.f139204m;
        qVar2.f92011g = this.f139205n;
        qVar2.f92010f = this.f139206o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
