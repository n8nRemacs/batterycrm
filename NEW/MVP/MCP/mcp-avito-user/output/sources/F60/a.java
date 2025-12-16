package F60;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PaymentListItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF60/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        boolean z12 = RecyclerView.V(view) == 0;
        if (z12 && view.getId() == R.id.title) {
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.payment_list_margin_top);
            rect.bottom = view.getResources().getDimensionPixelSize(R.dimen.payment_list_first_title_margin_bottom);
        } else {
            if (z12 || view.getId() != R.id.title) {
                return;
            }
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.payment_list_title_margin_top);
        }
    }
}
