package MM0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.verification.list_items.square_icon_with_text.g;
import kotlin.Metadata;

/* compiled from: SquareIconWithTextItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMM0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            if (((g) cW2).getBindingAdapterPosition() == 1) {
                rect.top = y6.b(24);
            } else {
                rect.top = y6.b(16);
            }
        }
    }
}
