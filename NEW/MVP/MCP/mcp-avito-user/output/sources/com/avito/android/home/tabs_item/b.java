package com.avito.android.home.tabs_item;

import TV0.g;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionTabsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/home/tabs_item/b;", "LTV0/b;", "Lcom/avito/android/home/tabs_item/f;", "Lcom/avito/android/serp/adapter/home_section_tab/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements TV0.b<f, com.avito.android.serp.adapter.home_section_tab.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f162476a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f162477b = new g.a<>(R.layout.section_tabs_item, a.f162475l);

    public b(@k c cVar) {
        this.f162476a = cVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, com.avito.android.serp.adapter.home_section_tab.a> a() {
        return this.f162476a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f162477b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.serp.adapter.home_section_tab.a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f162476a, ((b) obj).f162476a);
    }

    public final int hashCode() {
        return this.f162476a.hashCode();
    }

    @k
    public final String toString() {
        return "SectionTabsItemBlueprint(presenter=" + this.f162476a + ')';
    }
}
