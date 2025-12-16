package I3;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.active_orders.adapter.i;
import kotlin.Metadata;

/* compiled from: BxActiveOrdersWidgetDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI3/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f7904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7905c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7906d;

    public c(@k Resources resources) {
        this.f7904b = resources.getDimensionPixelSize(R.dimen.active_orders_item_top_offset);
        this.f7905c = resources.getDimensionPixelSize(R.dimen.active_orders_item_bottom_offset);
        this.f7906d = resources.getDimensionPixelSize(R.dimen.content_horizontal_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof i) {
            int i12 = this.f7906d;
            rect.left = i12;
            rect.top = this.f7904b;
            rect.right = i12;
            rect.bottom = this.f7905c;
        }
    }
}
