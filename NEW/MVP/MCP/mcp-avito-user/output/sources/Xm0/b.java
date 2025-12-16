package XM0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.verification.inn.list.button.g;
import kotlin.Metadata;

/* compiled from: ButtonDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXM0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f18856b;

    public b(int i12) {
        this.f18856b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g) {
            rect.right = y6.b(16);
            rect.left = y6.b(16);
            g gVar = (g) cW2;
            if (gVar.getBindingAdapterPosition() == 0) {
                return;
            }
            rect.top = y6.b(16);
            if (gVar.getBindingAdapterPosition() == (recyclerView.getAdapter() != null ? r2.getItemCount() : 0) - 1 && recyclerView.computeVerticalScrollOffset() == 0) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view.getLayoutParams().height));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                int height = recyclerView.getHeight() - (cW2.getBindingAdapterPosition() != 0 ? recyclerView.getChildAt(((g) cW2).getBindingAdapterPosition() - 1).getBottom() : 0);
                int iB2 = height - y6.b(16);
                int i12 = this.f18856b;
                if ((iB2 - i12) - view.getHeight() > 0) {
                    rect.top = (height - view.getHeight()) - i12;
                }
            }
        }
    }
}
