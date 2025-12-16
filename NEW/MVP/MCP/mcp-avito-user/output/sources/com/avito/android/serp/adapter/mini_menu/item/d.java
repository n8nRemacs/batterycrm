package com.avito.android.serp.adapter.mini_menu.item;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MiniMenuElementItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f270356b;

    @Inject
    public d(@Y61.k Resources resources) {
        this.f270356b = resources.getDimensionPixelOffset(R.dimen.mini_menu_horizontal_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int iT02 = RecyclerView.m.t0(view);
        boolean z12 = iT02 == layoutManager.o0() - 1;
        int i12 = this.f270356b;
        if (iT02 != 0) {
            rect.left = i12;
        }
        if (z12) {
            return;
        }
        rect.right = i12;
    }
}
