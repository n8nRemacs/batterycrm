package M9;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.price_list.v2.section.c;
import kotlin.Metadata;

/* compiled from: AdvertPriceListSectionItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM9/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof c) {
            rect.set(0, 0, 0, recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.advert_price_list_section_item_padding_bottom));
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }
}
