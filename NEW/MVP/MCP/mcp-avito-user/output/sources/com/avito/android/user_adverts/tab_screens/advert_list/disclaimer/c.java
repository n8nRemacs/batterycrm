package com.avito.android.user_adverts.tab_screens.advert_list.disclaimer;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclaimerItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/disclaimer/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f314729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f314732e;

    @Inject
    public c(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f314729b = aVar.Y(a.class);
        this.f314730c = resources.getDimensionPixelSize(R.dimen.user_adverts_shortcut_disclaimer_first_offset);
        this.f314731d = resources.getDimensionPixelSize(R.dimen.user_adverts_shortcut_disclaimer_top_offset);
        this.f314732e = resources.getDimensionPixelSize(R.dimen.user_adverts_shortcut_disclaimer_bottom_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() == this.f314729b) {
            rect.set(0, cW2.getBindingAdapterPosition() == 0 ? this.f314730c : this.f314731d, 0, this.f314732e);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }
}
