package com.avito.android.tariff_lf.edit_info.ui;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.h;
import com.avito.android.tariff_lf.edit_info.item.package_title.g;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditInfoPaddingDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/ui/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f299073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f299074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f299075d;

    @Inject
    public e(@k com.avito.konveyor.a aVar) {
        this.f299073b = aVar.Y(com.avito.android.tariff_lf.edit_info.item.edit_package.regular.b.class);
        this.f299074c = aVar.Y(com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.b.class);
        this.f299075d = aVar.Y(com.avito.android.tariff_lf.edit_info.item.info.b.class);
    }

    public static int c(View view, RecyclerView recyclerView) {
        RecyclerView.C cW2 = recyclerView.W(view);
        return cW2 instanceof h ? true : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h ? view.getResources().getDimensionPixelSize(R.dimen.container_horizontal_ripple_padding) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.banner.d ? y6.b(10) : y6.b(24);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        int iB2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemViewType = (adapter == null || (iU2 = RecyclerView.U(view)) == -1 || iU2 == 0) ? -1 : adapter.getItemViewType(iU2 - 1);
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof g;
        int i12 = this.f299073b;
        int i13 = this.f299074c;
        int iB3 = z12 ? y6.b(24) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.button.h ? y6.b(16) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.header.d ? y6.b(20) : ((cW2 instanceof com.avito.android.tariff_lf.edit_info.item.add_category.h) || (cW2 instanceof com.avito.android.tariff_lf.edit_info.item.manager_call.d)) ? y6.b(16) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.edit_button.h ? y6.b(14) : cW2 instanceof com.avito.android.tariff_lf.bar.g ? y6.b(12) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h ? itemViewType == i12 ? y6.b(2) : itemViewType == i13 ? y6.b(40) : y6.b(20) : cW2 instanceof h ? itemViewType == i13 ? y6.b(2) : itemViewType == i12 ? y6.b(40) : y6.b(20) : cW2 instanceof com.avito.android.tariff_lf.edit_info.item.info.g ? itemViewType == this.f299075d ? y6.b(10) : y6.b(16) : 0;
        rect.top = iB3;
        if (RecyclerView.U(view) == zVar.b() - 1) {
            iB2 = y6.b(24);
        } else {
            iB2 = recyclerView.W(view) instanceof com.avito.android.tariff_lf.edit_info.item.manager_call.d ? y6.b(8) : 0;
        }
        rect.bottom = iB2;
        rect.left = c(view, recyclerView);
        rect.right = c(view, recyclerView);
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        Integer numValueOf = -1;
        if (adapter2 != null) {
            int iU3 = RecyclerView.U(view);
            if (iU3 >= adapter2.getItemCount() - 1) {
                numValueOf = null;
            } else if (iU3 != -1) {
                numValueOf = Integer.valueOf(adapter2.getItemViewType(iU3 + 1));
            }
        }
        RecyclerView.C cW3 = recyclerView.W(view);
        boolean z13 = cW3 instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.h;
        int i14 = R.drawable.bg_package_angle_round;
        if (z13) {
            if (itemViewType == i12 && numValueOf != null && numValueOf.intValue() == i12) {
                i14 = R.drawable.bg_package_rectangle;
            } else if (itemViewType == i12) {
                i14 = R.drawable.bg_package_bottom_angle_round;
            } else if (numValueOf != null && numValueOf.intValue() == i12) {
                i14 = R.drawable.bg_package_top_angle_round;
            }
            view.setBackgroundResource(i14);
            return;
        }
        if (cW3 instanceof h) {
            if (itemViewType == i13 && numValueOf != null && numValueOf.intValue() == i13) {
                i14 = R.drawable.bg_package_rectangle;
            } else if (itemViewType == i13) {
                i14 = R.drawable.bg_package_bottom_angle_round;
            } else if (numValueOf != null && numValueOf.intValue() == i13) {
                i14 = R.drawable.bg_package_top_angle_round;
            }
            view.setBackgroundResource(i14);
        }
    }
}
