package com.avito.android.rating.user_contacts;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: GridItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f247673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f247674c;

    /* renamed from: d, reason: collision with root package name */
    public final int f247675d;

    /* renamed from: e, reason: collision with root package name */
    public final int f247676e = y6.b(48);

    /* renamed from: f, reason: collision with root package name */
    public final int f247677f = y6.b(32);

    /* renamed from: g, reason: collision with root package name */
    public final int f247678g = y6.b(32);

    public a(int i12, int i13, @Y61.k com.avito.konveyor.a aVar) {
        this.f247673b = i12;
        this.f247674c = i13;
        this.f247675d = aVar.Y(com.avito.android.rating.user_contacts.adapter.contact.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemViewType(RecyclerView.U(view)) == this.f247675d) {
            int i12 = this.f247673b;
            int i13 = this.f247674c;
            if (i12 == 1) {
                rect.set(i13, 0, i13, this.f247676e);
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
            int i14 = bVar != null ? bVar.f53669f : -1;
            boolean z12 = i14 == 0;
            boolean z13 = i14 == i12 - 1;
            int i15 = this.f247677f;
            int i16 = this.f247678g;
            if (z12) {
                rect.set(i13, 0, i16 / 2, i15);
            } else if (z13) {
                rect.set(i16 / 2, 0, i13, i15);
            } else {
                int i17 = i16 / 2;
                rect.set(i17, 0, i17, i15);
            }
        }
    }
}
