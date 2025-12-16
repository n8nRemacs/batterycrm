package Wv0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ShiftListItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWv0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15802a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (view.getId() == R.id.item) {
            recyclerView.getClass();
            View childAt = recyclerView.getChildAt(RecyclerView.V(view) - 1);
            if (childAt == null || childAt.getId() != R.id.item) {
                return;
            }
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.shift_list_space_between_slots);
        }
    }
}
