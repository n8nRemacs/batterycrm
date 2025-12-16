package com.avito.android.rubricator.items.linear_service;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.rubricator.RubricatorDynamicColumnsCountLinearLayoutManager;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: DynamicColumnsItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/items/linear_service/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f255796b = y6.b(6);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RubricatorDynamicColumnsCountLinearLayoutManager rubricatorDynamicColumnsCountLinearLayoutManager = layoutManager instanceof RubricatorDynamicColumnsCountLinearLayoutManager ? (RubricatorDynamicColumnsCountLinearLayoutManager) layoutManager : null;
        if (rubricatorDynamicColumnsCountLinearLayoutManager == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        int width = recyclerView.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i12 = rubricatorDynamicColumnsCountLinearLayoutManager.f255689O;
        layoutParams.width = i12;
        view.getLayoutParams().height = -1;
        int i13 = rubricatorDynamicColumnsCountLinearLayoutManager.f255690P;
        int i14 = rubricatorDynamicColumnsCountLinearLayoutManager.f255692R;
        if (itemCount == 1) {
            if (rubricatorDynamicColumnsCountLinearLayoutManager.f255694T) {
                i14 = 0;
            }
            rect.left = (int) (((i13 / 2.0f) + i14) - (i12 / 2.0f));
        } else {
            float f12 = i13 / 2.0f;
            float f13 = (rubricatorDynamicColumnsCountLinearLayoutManager.f255694T ? 0 : i14) + f12;
            rect.left = iU2 == 0 ? (int) (f13 - (i12 / 2.0f)) : (int) ((((width - f13) - (f12 + i14)) / (itemCount - 1)) - i12);
        }
        int i15 = rubricatorDynamicColumnsCountLinearLayoutManager.f53662H;
        int i16 = iU2 % i15;
        int i17 = this.f255796b;
        rect.top = i16 == 0 ? 0 : i17;
        rect.bottom = (itemCount <= 0 || i16 != i15 - 1) ? i17 : 0;
    }
}
