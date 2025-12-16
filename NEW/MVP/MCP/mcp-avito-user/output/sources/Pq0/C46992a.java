package pQ0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: GigItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpQ0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46992a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        boolean z12 = RecyclerView.V(view) == 0;
        View childAt = z12 ? null : recyclerView.getChildAt(RecyclerView.V(view) - 1);
        if (view.getId() == R.id.title_root && z12) {
            rect.bottom = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_title_margin_bottom);
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_margin_top);
            return;
        }
        if (view.getId() == R.id.title_root && childAt != null && childAt.getId() == R.id.gig_shift_item_root) {
            rect.bottom = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_title_margin_bottom);
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_title_margin_top_until_shift);
            return;
        }
        if (view.getId() == R.id.title_root) {
            rect.bottom = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_title_margin_bottom);
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_title_margin_top);
        } else if (view.getId() == R.id.gig_shift_item_root && z12) {
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_shift_margin_top);
        } else if (view.getId() == R.id.banner_root && z12) {
            rect.top = view.getResources().getDimensionPixelSize(R.dimen.work_profile_gig_margin_top);
        }
    }
}
