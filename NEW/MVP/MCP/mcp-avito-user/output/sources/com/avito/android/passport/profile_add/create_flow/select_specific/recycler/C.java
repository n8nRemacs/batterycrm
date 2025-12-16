package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpecificsItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/C;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f211769b = y6.b(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f211770c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f211771d = y6.b(36);

    /* renamed from: e, reason: collision with root package name */
    public final int f211772e;

    @Inject
    public C(@Y61.k com.avito.konveyor.a aVar) {
        this.f211772e = aVar.Y(s.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        int itemViewType = adapter.getItemViewType(iU2);
        rect.bottom = iU2 == adapter.getItemCount() + (-1) ? this.f211771d : y6.b(0);
        int i12 = this.f211772e;
        if (i12 != itemViewType) {
            return;
        }
        rect.top = (iU2 != 0 && adapter.getItemViewType(iU2 + (-1)) == i12) ? this.f211769b : iU2 != 0 ? this.f211770c : y6.b(0);
    }
}
