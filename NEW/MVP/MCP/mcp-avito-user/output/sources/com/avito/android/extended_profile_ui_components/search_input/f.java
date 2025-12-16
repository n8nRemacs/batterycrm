package com.avito.android.extended_profile_ui_components.search_input;

import Y61.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.search_input.suggest.l;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ProfileSuggestDividerDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ShapeDrawable f153422b;

    public f(@k Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(y6.b(1));
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.gray12, context));
        this.f153422b = shapeDrawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        int iB2 = y6.b(64);
        int width = recyclerView.getWidth() - y6.b(16);
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (i12 != recyclerView.getChildCount() - 1) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.C cW2 = recyclerView.W(childAt);
                int i13 = i12 + 1;
                boolean z12 = i13 <= recyclerView.getChildCount() - 1 && !(recyclerView.W(recyclerView.getChildAt(i13)) instanceof l);
                if ((cW2 instanceof l) && !z12) {
                    int bottom = childAt.getBottom();
                    ShapeDrawable shapeDrawable = this.f153422b;
                    shapeDrawable.setBounds(iB2, bottom, width, shapeDrawable.getIntrinsicHeight() + bottom);
                    shapeDrawable.draw(canvas);
                }
            }
        }
    }
}
