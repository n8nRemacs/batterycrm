package com.avito.android.search_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: RedesignSuggestDividerDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ShapeDrawable f264552b;

    public f(@Y61.k Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(y6.b(1));
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.gray12, context));
        this.f264552b = shapeDrawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        int iB2 = y6.b(64);
        int width = recyclerView.getWidth() - y6.b(16);
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (i12 != recyclerView.getChildCount() - 1) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.C cW2 = recyclerView.W(childAt);
                int i13 = i12 + 1;
                boolean z12 = i13 <= recyclerView.getChildCount() - 1 && !(recyclerView.W(recyclerView.getChildAt(i13)) instanceof com.avito.android.list.new_text_suggest.i);
                if ((cW2 instanceof com.avito.android.list.new_text_suggest.i) && !z12) {
                    int bottom = childAt.getBottom();
                    ShapeDrawable shapeDrawable = this.f264552b;
                    shapeDrawable.setBounds(iB2, bottom, width, shapeDrawable.getIntrinsicHeight() + bottom);
                    shapeDrawable.draw(canvas);
                }
            }
        }
    }
}
