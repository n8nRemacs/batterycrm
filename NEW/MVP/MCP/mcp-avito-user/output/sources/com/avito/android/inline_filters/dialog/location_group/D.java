package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationGroupFilterView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/D;", "Lcom/avito/android/inline_filters/dialog/E;", "Lcom/avito/android/inline_filters/dialog/B;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface D extends com.avito.android.inline_filters.dialog.E, com.avito.android.inline_filters.dialog.B {

    /* compiled from: LocationGroupFilterView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void b(@Y61.k List<GroupFilterItem> list);

    void d();

    @Y61.k
    com.jakewharton.rxrelay3.c f();

    void h(@Y61.k Y41.a<G0> aVar);

    @Y61.k
    com.jakewharton.rxrelay3.c i();

    void l(int i12);

    void m(@Y61.l String str);

    void n(@Y61.k String str);

    void r(@Y61.l Filter filter, boolean z12);

    void v(boolean z12);
}
