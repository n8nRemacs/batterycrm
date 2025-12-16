package B00;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormHorizontalCompactDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB00/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f769d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Set<Integer> f770e;

    public a(int i12, @k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f767b = i12;
        this.f768c = resources.getDimensionPixelOffset(R.dimen.form_horizontal_offset);
        this.f769d = resources.getDimensionPixelOffset(R.dimen.form_column_horizontal_offset);
        this.f770e = C42756l.l0(new Integer[]{Integer.valueOf(aVar.Y(com.avito.android.mortgage.person_form.list.items.input.compact.a.class)), Integer.valueOf(aVar.Y(com.avito.android.mortgage.person_form.list.items.select.compact.a.class))});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf(cW2.getItemViewType());
        Set<Integer> set = this.f770e;
        if (set.contains(numValueOf2)) {
            if (numValueOf == null) {
                Rect rect2 = new Rect();
                RecyclerView.Y(view, rect2);
                rect.set(rect2);
                return;
            }
            int i12 = 0;
            for (int iIntValue = numValueOf.intValue(); -1 < iIntValue; iIntValue--) {
                Set<Integer> set2 = set;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (!C42745f0.r(set2, adapter != null ? Integer.valueOf(adapter.getItemViewType(iIntValue)) : null)) {
                    break;
                }
                i12++;
            }
            int i13 = i12 % this.f767b;
            int i14 = this.f769d;
            int i15 = this.f768c;
            int i16 = i13 == 1 ? i15 : i14 / 2;
            if (i13 == 1) {
                i15 = i14 / 2;
            }
            rect.left = i16;
            rect.right = i15;
        }
    }
}
