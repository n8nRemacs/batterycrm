package com.avito.android.search.filter.preloading;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FiltersOverrideParams;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FiltersTreePreloadable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/preloading/c;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final SearchParams f263766a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Area f263767b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final FiltersOverrideParams f263768c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Coordinates f263769d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f263770e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f263771f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ParametersTreeWithAdditional f263772g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final SearchParams f263773h;

    public c() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f263766a, cVar.f263766a) && L.f(this.f263767b, cVar.f263767b) && L.f(this.f263768c, cVar.f263768c) && L.f(this.f263769d, cVar.f263769d) && L.f(this.f263770e, cVar.f263770e) && L.f(this.f263771f, cVar.f263771f) && L.f(this.f263772g, cVar.f263772g) && L.f(this.f263773h, cVar.f263773h);
    }

    public final int hashCode() {
        SearchParams searchParams = this.f263766a;
        int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
        Area area = this.f263767b;
        int iHashCode2 = (iHashCode + (area == null ? 0 : area.hashCode())) * 31;
        FiltersOverrideParams filtersOverrideParams = this.f263768c;
        int iHashCode3 = (iHashCode2 + (filtersOverrideParams == null ? 0 : filtersOverrideParams.hashCode())) * 31;
        Coordinates coordinates = this.f263769d;
        int iHashCode4 = (iHashCode3 + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        String str = this.f263770e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f263771f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263772g;
        int iHashCode7 = (iHashCode6 + (parametersTreeWithAdditional == null ? 0 : parametersTreeWithAdditional.hashCode())) * 31;
        SearchParams searchParams2 = this.f263773h;
        return iHashCode7 + (searchParams2 != null ? searchParams2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersTreePreloadParams(params=");
        sb2.append(this.f263766a);
        sb2.append(", searchArea=");
        sb2.append(this.f263767b);
        sb2.append(", overrideParams=");
        sb2.append(this.f263768c);
        sb2.append(", radiusCoordinates=");
        sb2.append(this.f263769d);
        sb2.append(", drawId=");
        sb2.append(this.f263770e);
        sb2.append(", searchContext=");
        sb2.append(this.f263771f);
        sb2.append(", parametersTree=");
        sb2.append(this.f263772g);
        sb2.append(", backupSearchParams=");
        return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f263773h, ')');
    }

    public c(@l SearchParams searchParams, @l Area area, @l FiltersOverrideParams filtersOverrideParams, @l Coordinates coordinates, @l String str, @l String str2, @l ParametersTreeWithAdditional parametersTreeWithAdditional, @l SearchParams searchParams2) {
        this.f263766a = searchParams;
        this.f263767b = area;
        this.f263768c = filtersOverrideParams;
        this.f263769d = coordinates;
        this.f263770e = str;
        this.f263771f = str2;
        this.f263772g = parametersTreeWithAdditional;
        this.f263773h = searchParams2;
    }

    public /* synthetic */ c(SearchParams searchParams, Area area, FiltersOverrideParams filtersOverrideParams, Coordinates coordinates, String str, String str2, ParametersTreeWithAdditional parametersTreeWithAdditional, SearchParams searchParams2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : searchParams, (i12 & 2) != 0 ? null : area, (i12 & 4) != 0 ? null : filtersOverrideParams, (i12 & 8) != 0 ? null : coordinates, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : parametersTreeWithAdditional, (i12 & 128) == 0 ? searchParams2 : null);
    }
}
