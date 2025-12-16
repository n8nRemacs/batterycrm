package Bp;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SellerItemGalleryDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBp/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f1713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1715d;

    public b() {
        this(0, 0, 0, 7, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f1715d / 2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z12 = false;
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        int i13 = this.f1714c;
        int i14 = this.f1713b;
        if (itemCount != 0) {
            int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
            if (bindingAdapterPosition == 0) {
                i13 = i12;
                i12 = i14;
            } else if (bindingAdapterPosition != itemCount) {
                i13 = i12;
            }
        } else {
            i12 = i14;
        }
        rect.set(i12, 0, i13, 0);
        Object objW = recyclerView.W(view);
        if (objW instanceof f) {
            boolean z13 = RecyclerView.U(view) == 0;
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && RecyclerView.U(view) == layoutManager.o0() - 1) {
                z12 = true;
            }
            ((f) objW).Tr(z13 ? c.f1716a : c.f1717b, z13 ? c.f1716a : c.f1717b, z12 ? c.f1716a : c.f1717b, z12 ? c.f1716a : c.f1717b);
        }
    }

    public /* synthetic */ b(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }

    public b(int i12, int i13, int i14) {
        this.f1713b = i12;
        this.f1714c = i13;
        this.f1715d = i14;
    }
}
