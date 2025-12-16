package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CustomTariffsListItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f135371b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135372c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135373d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135374e;

    /* renamed from: f, reason: collision with root package name */
    public final int f135375f;

    public f(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f135371b = resources.getBoolean(R.bool.is_tablet);
        this.f135372c = resources.getConfiguration().orientation == 2;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.default_horizontal_padding);
        this.f135373d = dimensionPixelOffset;
        this.f135374e = (dimensionPixelOffset / 2) / 2;
        this.f135375f = resources.getDimensionPixelSize(R.dimen.tariff_card_width);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            boolean z12 = iU2 == adapter.getItemCount() - 1;
            boolean z13 = iU2 == 0;
            int i12 = this.f135374e;
            int i13 = this.f135373d;
            rect.left = z13 ? i13 : i12;
            if (z12) {
                i12 = i13;
            }
            rect.right = i12;
            int i14 = (!z13 || !z12 || this.f135371b || this.f135372c) ? this.f135375f : view.getContext().getResources().getDisplayMetrics().widthPixels - (i13 * 2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i14;
            view.setLayoutParams(layoutParams);
        }
    }
}
