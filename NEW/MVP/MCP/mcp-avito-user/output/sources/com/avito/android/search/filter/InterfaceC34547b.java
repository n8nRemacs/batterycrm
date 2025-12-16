package com.avito.android.search.filter;

import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CategoriesParameterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/b;", "", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34547b {

    /* compiled from: CategoriesParameterFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.b$a */
    public static final class a {
    }

    /* compiled from: CategoriesParameterFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/b$b;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.b$b, reason: collision with other inner class name */
    public interface InterfaceC7857b {
        @Y61.k
        String a();

        @Y61.k
        String b();
    }

    @Y61.k
    List<CategoryParameter> a(@Y61.k List<Category> list, @Y61.l Category category, @Y61.l SelectParameter.Displaying displaying, @Y61.l List<SelectParameter.Value> list2);
}
