package com.avito.android.beduin.common.component.product_comparison;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.product_comparison.items.i;
import com.avito.android.lib.util.t;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonLayout.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/h;", "Lcom/avito/android/lib/util/t;", "Lcom/avito/android/beduin/common/component/product_comparison/items/i;", "Landroid/widget/TextView;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class h extends t<i, TextView> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinearLayout f102144a;

    public h(@k LinearLayout linearLayout) {
        this.f102144a = linearLayout;
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        TextView textView = (TextView) view;
        i iVar = (i) obj;
        com.avito.android.beduin.common.component.product_comparison.items.h.a(textView, iVar.f102166a, iVar.f102167b);
        int i12 = iVar.f102168c + iVar.f102171f;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = iVar.f102170e;
        BeduinContainerIndent margin = beduinProductComparisonTextItemParams != null ? beduinProductComparisonTextItemParams.getMargin() : null;
        textView.setHeight(y6.b(com.avito.android.beduin.common.component.model.a.a(margin) + com.avito.android.beduin.common.component.model.a.d(margin)) + i12 + g.f102143a);
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f102144a.getContext(), null, 0, 0, 14, null);
        aVar.setId(View.generateViewId());
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return aVar;
    }
}
