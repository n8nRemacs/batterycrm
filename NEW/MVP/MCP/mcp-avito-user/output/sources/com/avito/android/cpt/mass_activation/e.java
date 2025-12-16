package com.avito.android.cpt.mass_activation;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CptMassActivationItemV2Decoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f126575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126576c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f126577d = y6.b(11);

    /* renamed from: e, reason: collision with root package name */
    public final int f126578e = y6.b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f126579f = y6.b(8);

    public e(@k com.avito.konveyor.a aVar) {
        this.f126575b = aVar.Y(com.avito.android.cpt.mass_activation.ui.items.advert_v2.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        int iU2;
        if (recyclerView.W(view) instanceof com.avito.android.cpt.mass_activation.ui.items.advert_v2.g) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType = -1;
            if (adapter != null && (iU2 = RecyclerView.U(view)) != -1 && iU2 != 0) {
                itemViewType = adapter.getItemViewType(iU2 - 1);
            }
            i12 = itemViewType == this.f126575b ? this.f126578e : this.f126577d;
        } else {
            i12 = 0;
        }
        rect.top = i12;
        int iU3 = RecyclerView.U(view);
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        rect.bottom = iU3 == (adapter2 != null ? adapter2.getItemCount() : 0) + (-1) ? this.f126579f : 0;
        int i13 = this.f126576c;
        rect.left = i13;
        rect.right = i13;
    }
}
