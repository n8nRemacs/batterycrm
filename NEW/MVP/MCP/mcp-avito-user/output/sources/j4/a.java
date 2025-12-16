package J4;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BrandingGalleryBlockElementItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ4/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition() == (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
            return;
        }
        rect.right = view.getResources().getDimensionPixelSize(R.dimen.branding_gallery_element_end_margin);
    }
}
