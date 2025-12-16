package g7;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.recomendations.n;
import com.avito.android.serp.adapter.recomendations.restyle.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ExpandableTitleItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg7/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40540a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Integer> f396320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f396321c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Resources f396322d;

    public C40540a(@k List<Integer> list, boolean z12, @k Resources resources) {
        this.f396320b = list;
        this.f396321c = z12;
        this.f396322d = resources;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if ((cW2 instanceof n) || (cW2 instanceof c)) {
            int iU2 = RecyclerView.U(view);
            List<Integer> list = this.f396320b;
            Integer num = (Integer) C42745f0.K(0, list);
            Resources resources = this.f396322d;
            if (num != null && iU2 == num.intValue()) {
                rect.top = resources.getDimensionPixelSize(R.dimen.expandable_section_top_margin);
            } else if (!list.contains(Integer.valueOf(iU2 - 1))) {
                rect.top = resources.getDimensionPixelSize(R.dimen.expandable_section_previous_section_expand_state_bottom_margin);
            }
            Integer num2 = (Integer) C42745f0.S(list);
            if (num2 != null && iU2 == num2.intValue()) {
                if (this.f396321c) {
                    return;
                }
            } else if (list.contains(Integer.valueOf(iU2 + 1)) || list.isEmpty()) {
                return;
            }
            rect.bottom = resources.getDimensionPixelSize(R.dimen.expandable_section_expand_state_bottom_margin);
        }
    }
}
