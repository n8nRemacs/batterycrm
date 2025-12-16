package com.avito.android.beduin.common.component.product_comparison;

import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonLayout.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/f;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout;", "Lcom/avito/android/beduin/common/component/product_comparison/items/b;", "", "r", "I", "getParentWidth", "()I", "parentWidth", "Landroidx/recyclerview/widget/B;", "s", "Landroidx/recyclerview/widget/B;", "getAdapter", "()Landroidx/recyclerview/widget/B;", "adapter", "Lcom/avito/android/lib/design/text_view/a;", "u", "Lcom/avito/android/lib/design/text_view/a;", "getTextView", "()Lcom/avito/android/lib/design/text_view/a;", "textView", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends BeduinBaseHorizontalSliderLayout<com.avito.android.beduin.common.component.product_comparison.items.b> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int parentWidth;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f102140s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final h f102141t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @k
    public final com.avito.android.lib.design.text_view.a textView;

    public f(@k Context context, int i12, @k com.avito.konveyor.adapter.d dVar, @k AbstractC35201t abstractC35201t) {
        super(context);
        this.parentWidth = i12;
        this.f102140s = dVar;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.textView = aVar;
        this.f103063e = dVar;
        RecyclerView recyclerView = this.recycler;
        recyclerView.setAdapter(dVar);
        addView(recyclerView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f102141t = new h(linearLayout);
        addView(linearLayout);
    }

    @k
    public final B<com.avito.android.beduin.common.component.product_comparison.items.b, ?> getAdapter() {
        return this.f102140s;
    }

    public final int getParentWidth() {
        return this.parentWidth;
    }

    @k
    public final com.avito.android.lib.design.text_view.a getTextView() {
        return this.textView;
    }
}
