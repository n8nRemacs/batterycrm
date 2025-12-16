package com.avito.android.user_adverts.tab_screens.advert_list;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.beduin_v2.beduin_item.stateless.h;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BannerDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f314718b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f314719c = y6.b(14);

    /* renamed from: d, reason: collision with root package name */
    public final int f314720d = y6.b(10);

    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (!(cW2 instanceof h)) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        h hVar = (h) cW2;
        int i12 = (hVar.getBindingAdapterPosition() == 0 || hVar.getOldPosition() == 0) ? 0 : this.f314718b;
        int i13 = this.f314720d;
        rect.set(i13, i12, i13, this.f314719c);
    }
}
