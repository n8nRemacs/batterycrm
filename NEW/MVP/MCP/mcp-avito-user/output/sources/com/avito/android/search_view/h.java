package com.avito.android.search_view;

import android.view.View;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ToolbarSearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/h;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h {
    void f();

    @Y61.k
    View getCartItemView();

    @Y61.k
    z<G0> getDismissEvents();

    @Y61.k
    /* renamed from: getFiltersItemView */
    View getF264438B();

    void r(int i12);

    void setCartEnabled(boolean z12);
}
