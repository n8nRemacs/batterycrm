package com.avito.android.remote.model.developments_catalog.serp;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabs;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: FiltersTabs.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"orDefault", "Lcom/avito/android/remote/model/developments_catalog/serp/FiltersTabs$Configuration$Type;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class FiltersTabsKt {
    @k
    public static final FiltersTabs.Configuration.Type orDefault(@l FiltersTabs.Configuration.Type type) {
        return type == null ? FiltersTabs.Configuration.Type.Tabs : type;
    }
}
