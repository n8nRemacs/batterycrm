package Jr0;

import Y61.k;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.seller_element.seller_pin.g;
import kotlin.Metadata;

/* compiled from: SellerPinItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJr0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f9162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9163c;

    public c(@k Context context) {
        this.f9162b = context.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f9163c = context.getResources().getDimensionPixelSize(R.dimen.seller_pin_item_bottom_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof g) {
            int i12 = this.f9162b;
            rect.left = -i12;
            rect.right = -i12;
            rect.bottom = this.f9163c;
        }
    }
}
