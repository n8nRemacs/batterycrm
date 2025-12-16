package com.avito.android.search.filter;

import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdditionalParameterProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/F1;", "Lcom/avito/android/search/filter/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F1 implements InterfaceC34534a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<AdditionalCategoryParameter> f261805b;

    /* JADX WARN: Multi-variable type inference failed */
    public F1(@Y61.k List<? extends AdditionalCategoryParameter> list) {
        this.f261805b = list;
    }

    @Override // com.avito.android.search.filter.InterfaceC34534a
    @Y61.l
    public final AdditionalCategoryParameter a(@Y61.k String str) {
        for (AdditionalCategoryParameter additionalCategoryParameter : this.f261805b) {
            if (kotlin.jvm.internal.L.f(additionalCategoryParameter.getId(), str)) {
                return additionalCategoryParameter;
            }
        }
        return null;
    }
}
