package PV;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaddingListDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPV/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f13079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13081d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13082e;

    public /* synthetic */ a(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this(i12, i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition() == 0 ? this.f13079b : 0;
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        rect.set(this.f13081d, i12, this.f13082e, bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) + (-1) ? this.f13080c : 0);
    }

    public a(@U int i12, @U int i13, @U int i14, @U int i15) {
        this.f13079b = i12;
        this.f13080c = i13;
        this.f13081d = i14;
        this.f13082e = i15;
    }
}
