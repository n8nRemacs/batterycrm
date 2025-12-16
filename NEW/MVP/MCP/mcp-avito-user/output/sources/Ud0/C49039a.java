package ud0;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PromoSnippetItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lud0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ud0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49039a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) throws Resources.NotFoundException {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.space_start_end_promo_item);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.space_between_promo_items);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        if (iU2 == 0) {
            rect.left = dimensionPixelSize;
            rect.right = dimensionPixelSize2;
        } else if (iU2 < itemCount) {
            rect.right = dimensionPixelSize2;
        } else {
            rect.right = dimensionPixelSize;
        }
    }
}
