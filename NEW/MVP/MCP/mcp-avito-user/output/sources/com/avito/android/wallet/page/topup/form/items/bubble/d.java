package com.avito.android.wallet.page.topup.form.items.bubble;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BubbleItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/bubble/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f328308b;

    public d(@Y61.k Resources resources) {
        this.f328308b = resources.getDimensionPixelSize(R.dimen.select_bubble_interval);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        rect.right = this.f328308b;
    }
}
