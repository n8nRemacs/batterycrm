package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import Y61.l;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.product_comparison.BeduinProductComparisonTextItemParams;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: BeduinProductComparisonItemView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final void a(@k TextView textView, @l String str, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams) {
        UniversalColor textColor;
        if (str == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        textView.setTextAppearance(com.avito.android.lib.util.f.r(textView.getContext(), beduinProductComparisonTextItemParams != null ? beduinProductComparisonTextItemParams.getStyle() : null));
        textView.setText(str);
        textView.setTextColor((beduinProductComparisonTextItemParams == null || (textColor = beduinProductComparisonTextItemParams.getTextColor()) == null) ? C35835l0.d(R.attr.black, textView.getContext()) : C48063a.f437606a.a(textView.getContext(), textColor));
        BeduinContainerIndent margin = beduinProductComparisonTextItemParams != null ? beduinProductComparisonTextItemParams.getMargin() : null;
        D6.b(textView, Integer.valueOf(y6.b(com.avito.android.beduin.common.component.model.a.b(margin))), Integer.valueOf(y6.b(com.avito.android.beduin.common.component.model.a.d(margin))), Integer.valueOf(y6.b(com.avito.android.beduin.common.component.model.a.c(margin))), Integer.valueOf(y6.b(com.avito.android.beduin.common.component.model.a.a(margin))));
    }
}
