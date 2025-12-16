package com.avito.android.search.filter;

import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InputItemFormatterProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/m1;", "Lcom/avito/android/search/filter/l1;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.l f263734a;

    @Inject
    public m1(@Y61.k com.avito.android.common.l lVar) {
        this.f263734a = lVar;
    }

    @Override // com.avito.android.search.filter.l1
    @Y61.l
    public final com.avito.android.common.l a(@Y61.l ParameterElement.j jVar) {
        if (jVar instanceof ParameterElement.j.a) {
            return this.f263734a;
        }
        if (jVar == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
