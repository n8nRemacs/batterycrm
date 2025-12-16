package LA;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: HorizontalPaddingsDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLA/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f9867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9869d;

    public a(int i12, int i13, int i14) {
        this.f9867b = i12;
        this.f9868c = i13;
        this.f9869d = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        Integer numValueOf = bVar != null ? Integer.valueOf(bVar.f53670g) : null;
        int i12 = this.f9867b;
        int i13 = this.f9868c;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            rect.set(i13, 0, i13, 0);
            return;
        }
        if (numValueOf == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            GridLayoutManager.b bVar2 = layoutParams2 instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams2 : null;
            int i14 = bVar2 != null ? bVar2.f53669f : -1;
            boolean z12 = i14 == 0;
            boolean z13 = i14 == i12 - 1;
            int i15 = this.f9869d;
            if (z12) {
                rect.set(i13, 0, i15, 0);
            } else if (z13) {
                rect.set(i15, 0, i13, 0);
            } else {
                rect.set(i15, 0, i15, 0);
            }
        }
    }
}
