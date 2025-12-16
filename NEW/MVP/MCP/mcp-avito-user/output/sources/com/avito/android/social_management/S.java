package com.avito.android.social_management;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SocialNotificationDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social_management/S;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class S extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) throws Resources.NotFoundException {
        int dimensionPixelSize = 0;
        rect.left = recyclerView.W(view) instanceof com.avito.android.social_management.adapter.notification.h ? view.getResources().getDimensionPixelOffset(R.dimen.content_highlight_horizontal_padding) : 0;
        rect.right = recyclerView.W(view) instanceof com.avito.android.social_management.adapter.notification.h ? view.getResources().getDimensionPixelOffset(R.dimen.content_highlight_horizontal_padding) : 0;
        rect.top = recyclerView.W(view) instanceof com.avito.android.social_management.adapter.notification.h ? view.getResources().getDimensionPixelOffset(R.dimen.social_notification_banner_top) : ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition() == 0 ? view.getResources().getDimensionPixelSize(R.dimen.list_top_padding) : 0;
        if (recyclerView.W(view) instanceof com.avito.android.social_management.adapter.notification.h) {
            dimensionPixelSize = view.getResources().getDimensionPixelOffset(R.dimen.social_notification_banner_bottom);
        } else {
            if (((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition() == (recyclerView.getAdapter() != null ? r6.getItemCount() : 0) - 1) {
                dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.list_top_padding);
            }
        }
        rect.bottom = dimensionPixelSize;
    }
}
