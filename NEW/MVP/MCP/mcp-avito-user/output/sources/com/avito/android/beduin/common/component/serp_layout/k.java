package com.avito.android.beduin.common.component.serp_layout;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SerpLayoutItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/k;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f102629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102630c;

    public k(int i12, int i13) {
        this.f102629b = i12;
        this.f102630c = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = this.f102629b;
        int i13 = iU2 % i12;
        int iB2 = y6.b(this.f102630c);
        rect.left = (i13 * iB2) / i12;
        rect.right = iB2 - (((i13 + 1) * iB2) / i12);
        if (iU2 >= i12) {
            rect.top = iB2;
        }
    }
}
