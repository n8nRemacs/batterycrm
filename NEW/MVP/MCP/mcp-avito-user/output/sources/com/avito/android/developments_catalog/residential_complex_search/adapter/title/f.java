package com.avito.android.developments_catalog.residential_complex_search.adapter.title;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import jx.C42440b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResidentialComplexSuggestPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/f;", "Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/d;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<c, G0> f139160b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super c, G0> lVar) {
        this.f139160b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String locationName;
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        C42440b c42440b = cVar.f139157c;
        hVar.F1(c42440b.getName());
        String officialDeveloper = c42440b.getOfficialDeveloper();
        if (officialDeveloper == null || officialDeveloper.length() == 0 || (locationName = c42440b.getLocationName()) == null || locationName.length() == 0) {
            hVar.n("");
        } else {
            hVar.n(c42440b.getOfficialDeveloper() + ", " + c42440b.getLocationName());
        }
        hVar.Qc(new e(this, cVar));
    }
}
