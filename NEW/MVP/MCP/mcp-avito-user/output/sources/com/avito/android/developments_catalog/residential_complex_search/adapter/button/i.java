package com.avito.android.developments_catalog.residential_complex_search.adapter.button;

import Y61.k;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ResidentialComplexButtonView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/adapter/button/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_catalog/residential_complex_search/adapter/button/h;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f139150c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f139151b;

    public i(@k View view) {
        super(view);
        this.f139151b = view;
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.adapter.button.h
    public final void Qc(@k Y41.a<G0> aVar) {
        this.f139151b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(4, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f139151b.setOnClickListener(null);
    }
}
