package com.avito.android.search_view;

import android.content.Context;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoBlackSearchView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search_view/b;", "Lcom/avito/android/search_view/Toolbar23SearchView;", "", "getInputViewId", "()I", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends Toolbar23SearchView {
    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, new Toolbar23SearchView.b(false, false, context.getString(R.string.search_avito_black), false, false, 24, null), new Toolbar23SearchView.a(androidx.core.content.d.getColor(context, R.color.custom_product_color_constant_gray_36_night), C35835l0.d(R.attr.constantWhite, context)));
        setId(R.id.avito_black_search_bar);
        int iD2 = C35835l0.d(R.attr.constantBlack, getContext());
        int iD3 = C35835l0.d(R.attr.constantWhite, getContext());
        Y(iD2, iD3, androidx.core.content.d.getColor(getContext(), R.color.custom_product_color_constant_black_night), androidx.core.content.d.getColorStateList(getContext(), R.color.re_23_constant_gray_12_night));
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a.a(this);
        U(iD3, androidx.core.content.d.getColorStateList(getContext(), R.color.custom_product_color_constant_gray_54_night), androidx.core.content.d.getColorStateList(getContext(), R.color.bg_redesign_input_avito_black), 1.0f);
    }

    @Override // com.avito.android.search_view.Toolbar23SearchView
    public int getInputViewId() {
        return R.id.avito_black_search_bar_input;
    }
}
