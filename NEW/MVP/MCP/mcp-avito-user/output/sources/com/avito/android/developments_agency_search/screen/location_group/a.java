package com.avito.android.developments_agency_search.screen.location_group;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import oi0.C44783b;

/* compiled from: LocationGroupDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @Y61.k
    com.avito.android.realty_agency.inline_filters.district.a a(@Y61.k Context context, @Y61.k ParameterElement.s sVar, @Y61.l String str, @Y61.k List<District> list, @Y61.k List<String> list2, @Y61.k Y41.l<? super List<String>, G0> lVar);

    @Y61.k
    com.avito.android.realty_agency.inline_filters.location_suggest.a b(@Y61.k Context context, @Y61.k ParameterElement.v vVar, @Y61.l String str, @Y61.k Y41.l<? super C44783b, G0> lVar);

    @Y61.k
    com.avito.android.inline_filters.dialog.metro.c c(@Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k ParameterElement.s sVar, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.k MetroResponseBody metroResponseBody, @Y61.k List<String> list, @Y61.k Y41.l<? super List<String>, G0> lVar);
}
