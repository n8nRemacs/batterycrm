package V00;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PreApprovalResultDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV00/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f16852b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f16853c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f16854d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f16855e = y6.b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f16856f = y6.b(18);

    /* renamed from: g, reason: collision with root package name */
    public final int f16857g = y6.b(20);

    /* renamed from: h, reason: collision with root package name */
    public final int f16858h = y6.b(12);

    /* renamed from: i, reason: collision with root package name */
    public final int f16859i = y6.b(20);

    /* renamed from: j, reason: collision with root package name */
    public final int f16860j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16861k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16862l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16863m;

    public a(@k com.avito.konveyor.a aVar) {
        this.f16860j = aVar.Y(com.avito.android.mortgage.pre_approval.list.items.title.a.class);
        this.f16861k = aVar.Y(com.avito.android.mortgage.pre_approval.result.list.items.description.a.class);
        this.f16862l = aVar.Y(com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.a.class);
        this.f16863m = aVar.Y(com.avito.android.mortgage.pre_approval.result.list.items.point.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            Rect rect2 = new Rect();
            RecyclerView.Y(view, rect2);
            rect.set(rect2);
            return;
        }
        if (numValueOf.intValue() > 0) {
            int itemViewType = adapter.getItemViewType(numValueOf.intValue() - 1);
            int itemViewType2 = cW2.getItemViewType();
            if (itemViewType2 == this.f16860j) {
                i12 = this.f16854d;
            } else if (itemViewType2 == this.f16861k) {
                i12 = this.f16855e;
            } else if (itemViewType2 == this.f16862l) {
                i12 = this.f16856f;
            } else {
                int i13 = this.f16863m;
                i12 = (itemViewType2 != i13 || itemViewType == i13) ? (itemViewType2 == i13 && itemViewType == i13) ? this.f16858h : this.f16859i : this.f16857g;
            }
        } else {
            i12 = this.f16853c;
        }
        rect.top = i12;
        int i14 = this.f16852b;
        rect.left = i14;
        rect.right = i14;
    }
}
