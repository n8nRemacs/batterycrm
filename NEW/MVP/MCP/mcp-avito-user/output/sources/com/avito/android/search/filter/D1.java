package com.avito.android.search.filter;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReplaceLocationParametersTreeWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/D1;", "Lcom/avito/android/search/filter/C1;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D1 implements C1 {
    @Inject
    public D1() {
    }

    @Override // com.avito.android.search.filter.C1
    @Y61.k
    public final ReplaceLocationParametersTree a(@Y61.k ParametersTreeWithAdditional parametersTreeWithAdditional, @Y61.k LocationInfo locationInfo) {
        return new ReplaceLocationParametersTree(parametersTreeWithAdditional, locationInfo, null, 4, null);
    }
}
