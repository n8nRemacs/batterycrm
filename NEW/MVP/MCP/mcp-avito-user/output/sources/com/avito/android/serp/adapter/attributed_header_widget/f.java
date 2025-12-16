package com.avito.android.serp.adapter.attributed_header_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AttributedHeaderWidgetDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/attributed_header_widget/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f268938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268941e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268942f;

    public /* synthetic */ f(Resources resources, boolean z12, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? false : z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int i12 = this.f268938b ? this.f268940d : this.f268939c;
        if (cW2 instanceof k) {
            rect.left = i12;
            rect.right = i12;
            rect.top = this.f268941e;
            rect.bottom = this.f268942f;
        }
    }

    public f(@Y61.k Resources resources, boolean z12) {
        this.f268938b = z12;
        this.f268939c = resources.getDimensionPixelSize(R.dimen.attributed_header_widget_horizontal_padding);
        this.f268940d = resources.getDimensionPixelSize(R.dimen.attributed_header_widget_horizontal_padding_travel_search);
        this.f268941e = resources.getDimensionPixelSize(R.dimen.attributed_header_widget_top_padding);
        this.f268942f = resources.getDimensionPixelSize(R.dimen.attributed_header_widget_bottom_padding);
    }
}
