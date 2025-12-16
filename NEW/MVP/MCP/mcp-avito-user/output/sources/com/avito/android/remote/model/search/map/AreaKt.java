package com.avito.android.remote.model.search.map;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import q50.InterfaceC47203a;

/* compiled from: Area.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003*\u0004\u0018\u00010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"SEARCH_AREA", "", "toMap", "", "Lcom/avito/android/remote/model/search/map/Area;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class AreaKt {

    @k
    private static final String SEARCH_AREA = "searchArea";

    @k
    public static final Map<String, String> toMap(@l Area area) {
        return area != null ? P0.g(new Q("searchArea[latTop]", String.valueOf(area.getTopLeft().getLatitude())), new Q("searchArea[lonLeft]", String.valueOf(area.getTopLeft().getLongitude())), new Q("searchArea[latBottom]", String.valueOf(area.getBottomRight().getLatitude())), new Q("searchArea[lonRight]", String.valueOf(area.getBottomRight().getLongitude()))) : P0.c();
    }
}
