package com.avito.android.search.filter.adapter;

import Y61.l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersChangePayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/f;", "Lcom/avito/android/search/filter/adapter/e;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof ParameterElement.g) && (aVar2 instanceof ParameterElement.g)) {
            return new a();
        }
        return null;
    }
}
