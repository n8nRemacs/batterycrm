package AR;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lf_levels.ui.items.business_tool.h;
import com.avito.android.lf_levels.ui.items.business_tools_header.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: LfLevelsItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAR/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f330b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f331c = y6.b(32);

    /* renamed from: d, reason: collision with root package name */
    public final int f332d = y6.b(20);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = this.f332d;
        rect.left = i12;
        recyclerView.getClass();
        int i13 = 0;
        boolean z12 = RecyclerView.U(view) == 0;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (!z12) {
            if (cW2 instanceof g) {
                i13 = this.f331c;
            } else if (cW2 instanceof h) {
                i13 = this.f330b;
            }
        }
        rect.top = i13;
        rect.right = i12;
    }
}
