package com.avito.android.photo_list_view_groups;

import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.AbstractC33209c;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.y;
import com.avito.android.photo_list_view_groups.b;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.U;

/* compiled from: PhotoItemGroupsImageListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/f;", "Lcom/avito/android/photo_list_view/y;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f218543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f218544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.offlinization.ui.a f218545c;

    /* compiled from: PhotoItemGroupsImageListView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_list_view_groups/f$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            return 1;
        }
    }

    public f(@Y61.k RecyclerView recyclerView, @Y61.k g gVar, @Y61.k b.InterfaceC6557b interfaceC6557b, @Y61.k h hVar, @Y61.k g80.d dVar, @Y61.k List<ImageGroup> list, @Y61.k List<ImageBadgeGroup> list2, @Y61.k List<ImageAction> list3, @Y61.k R0 r02) {
        this.f218543a = gVar;
        b bVar = new b(hVar, dVar, list, list2, list3, gVar, interfaceC6557b, r02);
        this.f218544b = bVar;
        this.f218545c = (com.avito.android.offlinization.ui.a) new h80.b(bVar).a(recyclerView, gVar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(bVar);
        recyclerView.setOnClickListener(new com.avito.android.order.feature.c(this, 22));
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.f53667M = new a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.photo_list_view.y
    public final void a(@Y61.k List<? extends InterfaceC33208b> list) {
        Object next;
        b bVar = this.f218544b;
        ?? r12 = bVar.f218486l;
        List<? extends InterfaceC33208b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Object objC : list2) {
            if (objC instanceof G) {
                G g12 = (G) objC;
                String str = g12.f218072e;
                h hVar = bVar.f218477c;
                if (hVar.C3(str)) {
                    objC = G.c(g12, null, AbstractC33209c.b.f218156a, null, 479);
                } else {
                    String strI6 = hVar.i6(g12.f218072e);
                    if (strI6 != null || (strI6 = hVar.i6(((G) objC).f218068a)) != null) {
                        Iterator<T> it = bVar.f218480f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (L.f(((ImageBadgeGroup) next).getId(), strI6)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        ImageBadgeGroup imageBadgeGroup = (ImageBadgeGroup) next;
                        objC = G.c(g12, null, imageBadgeGroup != null ? new AbstractC33209c.d(imageBadgeGroup.getTitle(), imageBadgeGroup.getAppearance()) : AbstractC33209c.b.f218156a, null, 479);
                    }
                }
            }
            arrayList.add(objC);
        }
        bVar.f218486l = arrayList;
        C23424o.a(new c(arrayList, r12), true).b(bVar);
        RecyclerView recyclerView = bVar.f218485k;
        if (recyclerView != null) {
            recyclerView.c0();
        }
    }

    @Override // com.avito.android.photo_list_view.y
    public final void destroy() {
        U.b(this.f218544b.f218484j, null);
        ((C23427s) this.f218545c.f208626c).c(null);
    }
}
