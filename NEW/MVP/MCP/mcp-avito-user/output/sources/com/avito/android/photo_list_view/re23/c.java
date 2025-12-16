package com.avito.android.photo_list_view.re23;

import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.F;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishPhotoImageListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/c;", "Lcom/avito/android/photo_list_view/y;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f218199a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f218200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.offlinization.ui.a f218201c;

    public c(@Y61.k RecyclerView recyclerView, @Y61.k a aVar, @Y61.k k kVar, @Y61.k g80.d dVar, @Y61.k List list) {
        this.f218199a = aVar;
        h hVar = new h(list, aVar, kVar, dVar);
        this.f218200b = hVar;
        this.f218201c = (com.avito.android.offlinization.ui.a) new F().a(recyclerView, aVar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(hVar);
        recyclerView.setOnClickListener(new com.avito.android.order.feature.c(this, 20));
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.f53667M = new b();
        }
    }

    @Override // com.avito.android.photo_list_view.y
    public final void a(@Y61.k List<? extends InterfaceC33208b> list) {
        h hVar = this.f218200b;
        List<? extends InterfaceC33208b> list2 = hVar.f218212h;
        hVar.f218212h = list;
        C23424o.a(new f(list2, list), true).b(hVar);
        RecyclerView recyclerView = hVar.f218211g;
        if (recyclerView != null) {
            recyclerView.c0();
        }
    }

    @Override // com.avito.android.photo_list_view.y
    public final void destroy() {
        ((C23427s) this.f218201c.f208626c).c(null);
    }
}
