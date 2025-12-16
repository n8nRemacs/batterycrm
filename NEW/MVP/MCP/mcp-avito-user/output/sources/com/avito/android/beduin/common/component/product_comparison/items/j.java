package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.product_comparison.BeduinProductComparisonTextItemParams;
import com.avito.android.lib.util.t;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinProductComparisonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/j;", "Lcom/avito/android/lib/util/t;", "Lcom/avito/android/beduin/common/component/product_comparison/items/i;", "Landroid/widget/TextView;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class j extends t<i, TextView> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f102172a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f102173b;

    /* renamed from: c, reason: collision with root package name */
    public int f102174c;

    public j(@k View view) {
        this.f102172a = view;
        this.f102173b = (ViewGroup) view.findViewById(R.id.properties_container);
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        TextView textView = (TextView) view;
        i iVar = (i) obj;
        h.a(textView, iVar.f102169d, iVar.f102170e);
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = iVar.f102167b;
        int iB2 = y6.b(com.avito.android.beduin.common.component.model.a.d(beduinProductComparisonTextItemParams != null ? beduinProductComparisonTextItemParams.getMargin() : null)) + iVar.f102168c + this.f102174c;
        textView.setHeight(iVar.f102171f + iB2);
        textView.setPadding(textView.getPaddingLeft(), iB2, textView.getPaddingRight(), textView.getPaddingBottom());
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f102172a.getContext(), null, 0, 0, 14, null);
        aVar.setId(View.generateViewId());
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return aVar;
    }
}
