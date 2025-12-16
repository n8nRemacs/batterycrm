package com.avito.android.photo_list_view;

import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.C33210d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ImageListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/z;", "Lcom/avito/android/photo_list_view/y;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f218359a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33210d f218360b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.offlinization.ui.a f218361c;

    public z(@Y61.k RecyclerView recyclerView, @Y61.k s sVar, @Y61.k C33210d.a aVar) {
        this.f218359a = sVar;
        C33210d c33210d = new C33210d(C42784z0.f406748b, sVar, aVar);
        this.f218360b = c33210d;
        this.f218361c = (com.avito.android.offlinization.ui.a) new F().a(recyclerView, sVar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(c33210d);
        recyclerView.setOnClickListener(new com.avito.android.order.feature.c(this, 18));
    }

    @Override // com.avito.android.photo_list_view.y
    public final void a(@Y61.k List<? extends InterfaceC33208b> list) {
        C33210d c33210d = this.f218360b;
        c33210d.getClass();
        C23424o.e eVarA = C23424o.a(new C33212f(c33210d, list), true);
        c33210d.f218161c = list;
        eVarA.b(c33210d);
    }

    @Override // com.avito.android.photo_list_view.y
    public final void destroy() {
        ((C23427s) this.f218361c.f208626c).c(null);
    }
}
