package com.avito.android.search.filter.adapter.segment;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SegmentItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/segment/b;", "LTV0/b;", "Lcom/avito/android/search/filter/adapter/segment/h;", "Lcom/avito/android/search/filter/converter/ParameterElement$v$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class b implements TV0.b<h, ParameterElement.v.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f262563a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f262564b = new g.a<>(R.layout.filter_screen_segment_view, a.f262562l);

    @Inject
    public b(@k d dVar) {
        this.f262563a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f262563a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f262564b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.v.b) && (((ParameterElement.v.b) aVar).f262845h instanceof ParameterElement.DisplayType.k);
    }
}
