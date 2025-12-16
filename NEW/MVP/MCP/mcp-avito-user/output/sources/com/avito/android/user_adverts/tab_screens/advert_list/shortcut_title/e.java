package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortcutTitleItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f314778b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314779c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314780d;

    /* renamed from: e, reason: collision with root package name */
    public final int f314781e;

    @Inject
    public e(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f314778b = aVar.Y(com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a.class);
        this.f314779c = aVar.Y(c.class);
        this.f314780d = resources.getDimensionPixelSize(R.dimen.user_adverts_shortcut_title_first_offset);
        this.f314781e = resources.getDimensionPixelSize(R.dimen.user_adverts_shortcut_title_top_offset_after_disclaimer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12;
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        if (cW2.getItemViewType() != this.f314779c) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        if (cW2.getBindingAdapterPosition() == 0) {
            i12 = this.f314780d;
        } else {
            int bindingAdapterPosition = cW2.getBindingAdapterPosition() - 1;
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            i12 = (bindingAdapterPosition < 0 || bindingAdapterPosition >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(bindingAdapterPosition) != this.f314778b) ? 0 : this.f314781e;
        }
        rect.set(0, i12, 0, 0);
    }
}
