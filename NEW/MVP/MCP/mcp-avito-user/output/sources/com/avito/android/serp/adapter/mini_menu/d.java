package com.avito.android.serp.adapter.mini_menu;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MiniMenuBlockItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iU2;
        Object adapter = recyclerView.getAdapter();
        TV0.a item = null;
        com.avito.konveyor.adapter.i iVar = adapter instanceof com.avito.konveyor.adapter.i ? (com.avito.konveyor.adapter.i) adapter : null;
        if (iVar != null && (iU2 = RecyclerView.U(view)) != -1) {
            item = iVar.getItem(iU2);
        }
        if (item instanceof MiniMenuBlockItem) {
            MiniMenuBlockItem miniMenuBlockItem = (MiniMenuBlockItem) item;
            int i12 = miniMenuBlockItem.f270310e;
            rect.left = i12;
            rect.top = miniMenuBlockItem.f270309d;
            rect.right = i12;
            rect.bottom = miniMenuBlockItem.f270311f;
        }
    }
}
