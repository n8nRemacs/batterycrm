package com.avito.android.tariff_lf.package_info.viewmodel;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffPackagePaddingDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/w;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w extends RecyclerView.l {
    @Inject
    public w() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int iB2 = ((cW2 instanceof com.avito.android.tariff_lf.bar.g) || (cW2 instanceof com.avito.android.tariff_lf.package_info.recycler.header.d)) ? y6.b(16) : ((cW2 instanceof com.avito.android.tariff_lf.package_info.recycler.d) || (cW2 instanceof com.avito.android.tariff_lf.package_info.recycler.price_segment.e)) ? y6.b(24) : 0;
        rect.top = iB2;
        rect.bottom = 0;
        rect.left = y6.b(24);
        rect.right = y6.b(24);
    }
}
