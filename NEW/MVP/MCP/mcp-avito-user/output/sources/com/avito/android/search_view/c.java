package com.avito.android.search_view;

import android.content.Context;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoSalesSearchView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search_view/c;", "Lcom/avito/android/search_view/Toolbar23SearchView;", "", "getInputViewId", "()I", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends Toolbar23SearchView {
    public c(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, new Toolbar23SearchView.b(true, false, null, false, false, 24, null), new Toolbar23SearchView.a(C35835l0.d(R.attr.gray36, context), C35835l0.d(R.attr.black, context)));
        setId(R.id.avito_sales_search_bar);
    }

    @Override // com.avito.android.search_view.Toolbar23SearchView
    public int getInputViewId() {
        return R.id.avito_sales_search_bar_input;
    }
}
