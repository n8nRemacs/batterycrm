package fB;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: UniversalWidgetCreateSectionDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfB/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40272a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i12 = itemCount - 1;
        int iB2 = (iU2 == 0 || iU2 == 1) ? y6.b(24) : C40273b.f395768a;
        int iB3 = (iU2 == i12 || (iU2 % 2 == 0 && iU2 == itemCount + (-2))) ? y6.b(28) : C40273b.f395768a;
        int i13 = C40273b.f395768a;
        rect.set(i13, iB2, i13, iB3);
    }
}
