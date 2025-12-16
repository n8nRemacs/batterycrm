package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProSbBlockItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/k;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f223508b = y6.b(8);

    @Inject
    public k() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cL2 = recyclerView.L(view);
        if (cL2 == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        if (cL2.getBindingAdapterPosition() != (itemCount >= 0 ? itemCount : 0)) {
            rect.right = this.f223508b;
        }
    }
}
