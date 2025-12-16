package com.avito.android.remote.model.search;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"firstOption", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;", "Lcom/avito/android/remote/model/search/Filter;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class InlineFiltersKt {
    @l
    public static final Filter.InnerOptions.Options firstOption(@k Filter filter) {
        List<Filter.InnerOptions.Options> options;
        List<Filter.InnerOptions.Options> options2;
        List<Filter.InnerOptions> options3 = filter.getOptions();
        if (options3 == null || options3.isEmpty() || (options = filter.getOptions().get(0).getOptions()) == null || options.isEmpty() || (options2 = filter.getOptions().get(0).getOptions()) == null) {
            return null;
        }
        return options2.get(0);
    }
}
