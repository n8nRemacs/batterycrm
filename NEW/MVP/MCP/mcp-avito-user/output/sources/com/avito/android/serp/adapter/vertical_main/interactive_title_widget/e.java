package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.n;

/* compiled from: InteractiveTitleItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f272953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272955d;

    public e(@Y61.k Resources resources, @Y61.k C36135w2 c36135w2) throws Resources.NotFoundException {
        this.f272953b = resources.getDimensionPixelSize(R.dimen.interactive_title_widget_top_margin);
        this.f272954c = resources.getDimensionPixelSize(R.dimen.interactive_title_widget_bottom_margin);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.content_horizontal_padding);
        n<Object> nVar = C36135w2.f327457X[21];
        boolean zBooleanValue = ((Boolean) c36135w2.f327497r.a().invoke()).booleanValue();
        if (zBooleanValue) {
            dimensionPixelSize = y6.b(12);
        } else if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        this.f272955d = dimensionPixelSize;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iU2;
        Object adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.i iVar = adapter instanceof com.avito.konveyor.adapter.i ? (com.avito.konveyor.adapter.i) adapter : null;
        if (iVar == null || (iU2 = RecyclerView.U(view)) == -1) {
            return;
        }
        TV0.a item = iVar.getItem(iU2);
        if (item instanceof InteractiveTitleWidgetItem) {
            InteractiveTitleWidgetItem interactiveTitleWidgetItem = (InteractiveTitleWidgetItem) item;
            VerticalInsets verticalInsets = interactiveTitleWidgetItem.f272942f;
            rect.top = verticalInsets != null ? y6.b(verticalInsets.f272950b) : this.f272953b;
            VerticalInsets verticalInsets2 = interactiveTitleWidgetItem.f272942f;
            rect.bottom = verticalInsets2 != null ? y6.b(verticalInsets2.f272951c) : this.f272954c;
            com.avito.android.remote.model.vertical_main.HorizontalInsets horizontalInsets = interactiveTitleWidgetItem.f272943g;
            int iB2 = this.f272955d;
            rect.left = horizontalInsets != null ? y6.b(horizontalInsets.getLeft()) : iB2;
            if (horizontalInsets != null) {
                iB2 = y6.b(horizontalInsets.getRight());
            }
            rect.right = iB2;
        }
    }
}
