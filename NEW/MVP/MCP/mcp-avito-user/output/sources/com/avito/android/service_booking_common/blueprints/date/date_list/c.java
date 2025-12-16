package com.avito.android.service_booking_common.blueprints.date.date_list;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbDateListItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/date_list/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f276336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f276337c;

    @Inject
    public c(@k Resources resources) {
        this.f276336b = resources.getDimensionPixelSize(R.dimen.sb_day_item_padding);
        this.f276337c = resources.getDimensionPixelSize(R.dimen.sb_day_list_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2 = RecyclerView.U(recyclerView.W(view).itemView);
        int i12 = 0;
        int i13 = this.f276337c;
        int i14 = iU2 == 0 ? i13 : 0;
        if (recyclerView.getAdapter() != null && iU2 == r5.getItemCount() - 1) {
            i12 = i13;
        }
        int i15 = this.f276336b;
        rect.left = i14 + i15;
        rect.right = i12 + i15;
    }
}
