package com.avito.android.search.filter.adapter.chips;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/chips/b;", "LTV0/e;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b extends TV0.e {

    /* compiled from: ChipsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void G();

    void O60(@Y61.l String str);

    void Or(@Y61.k List<? extends com.avito.android.lib.design.chips.h> list, @Y61.l List<? extends com.avito.android.lib.design.chips.h> list2);

    void c3(boolean z12);

    void i2(boolean z12);

    void lp(@Y61.l String str);

    void m2(@Y61.k Chips.DisplayType displayType);

    void m4(int i12);

    void oO(@Y61.k Y41.l<? super List<? extends com.avito.android.lib.design.chips.h>, G0> lVar);

    void r3(@Y61.k SelectStrategy selectStrategy);

    void ra();

    void setError(@Y61.k String str);

    void setTitle(@Y61.k String str);

    void setTopPadding(int i12);

    void t8();

    void vH(@Y61.l Y41.a<G0> aVar);

    void wi(@Y61.k String str, @Y61.k Y41.a<G0> aVar);
}
