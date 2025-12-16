package com.avito.android.inline_filters.dialog.group.item.multiselect;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiselectView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/multiselect/c;", "LTV0/e;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c extends TV0.e {

    /* compiled from: MultiselectView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void dY(@k l<? super DeepLink, G0> lVar);

    void f70(@k p<? super Filter, ? super List<String>, G0> pVar);

    void yz(@k MultiselectItem multiselectItem, @k List<i> list);
}
