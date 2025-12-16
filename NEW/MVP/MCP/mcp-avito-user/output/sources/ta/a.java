package TA;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.InterfaceC34729e;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: HorizontalPaddingsDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTA/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f15495b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15497d;

    public a(int i12, int i13, @k com.avito.konveyor.a aVar) {
        this.f15495b = i12;
        this.f15496c = i13;
        this.f15497d = aVar.Y(com.avito.android.extended_profile_serp.adapter.job_list_item.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        Integer numValueOf = bVar != null ? Integer.valueOf(bVar.f53670g) : null;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemViewType(RecyclerView.U(view)) == this.f15497d) {
            return;
        }
        int i12 = this.f15495b;
        int iB2 = this.f15496c;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            rect.set(iB2, 0, iB2, 0);
            return;
        }
        if (numValueOf == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            GridLayoutManager.b bVar2 = layoutParams2 instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams2 : null;
            int i13 = bVar2 != null ? bVar2.f53669f : -1;
            boolean z12 = i13 == 0;
            boolean z13 = i13 == i12 - 1;
            if (recyclerView.W(view) instanceof InterfaceC34729e) {
                iB2 -= y6.b(4);
            }
            if (z12) {
                rect.set(iB2, 0, 0, 0);
            } else if (z13) {
                rect.set(0, 0, iB2, 0);
            }
        }
    }
}
