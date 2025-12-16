package com.avito.android.developments_catalog.residential_complex_search.adapter.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ResidentialComplexSuggestView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/h;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f139162e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f139163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f139164c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f139165d;

    public i(@k View view) {
        super(view);
        this.f139163b = view;
        this.f139164c = (TextView) view.findViewById(R.id.name);
        this.f139165d = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.adapter.title.h
    public final void F1(@k String str) {
        I5.a(this.f139164c, str, false);
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.adapter.title.h
    public final void Qc(@k Y41.a<G0> aVar) {
        this.f139163b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(5, aVar));
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.adapter.title.h
    public final void n(@k String str) {
        I5.a(this.f139165d, str, false);
    }
}
