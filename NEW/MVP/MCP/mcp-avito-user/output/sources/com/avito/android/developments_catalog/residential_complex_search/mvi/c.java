package com.avito.android.developments_catalog.residential_complex_search.mvi;

import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ResidentialComplexBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.b<ResidentialComplexInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_catalog.residential_complex_search.h f139201a;

    @Inject
    public c(@Y61.k com.avito.android.developments_catalog.residential_complex_search.h hVar) {
        this.f139201a = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ResidentialComplexInternalAction> a() {
        return this.f139201a.a("");
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
