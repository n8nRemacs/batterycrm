package com.avito.android.photo_list_view.re23;

import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.remote.model.category_parameters.ImageAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishPhotoListAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/h;", "Lcom/avito/android/photo_list_view/re23/e;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f218208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f218209e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g80.d f218210f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public RecyclerView f218211g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public List<? extends InterfaceC33208b> f218212h = C42784z0.f406748b;

    public h(@Y61.k List list, @Y61.k a aVar, @Y61.k k kVar, @Y61.k g80.d dVar) {
        this.f218207c = list;
        this.f218208d = aVar;
        this.f218209e = kVar;
        this.f218210f = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f218212h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (L.f(this.f218212h.get(i12).getF218092a(), "9223372036854775806")) {
            return 0;
        }
        if (this.f218212h.get(i12).getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
            return 3;
        }
        return !(this.f218212h.get(i12).getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.a) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f218211g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((com.avito.android.photo_list_view.re23.viewholders.a) c12).B80(this.f218212h.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        g gVar = new g(viewGroup);
        a aVar = this.f218208d;
        k kVar = this.f218209e;
        if (i12 == 0) {
            kVar.getClass();
            return new com.avito.android.photo_list_view.re23.viewholders.b((View) gVar.invoke(Integer.valueOf(R.layout.photo_item_image_append_item)), aVar);
        }
        g80.d dVar = this.f218210f;
        if (i12 == 2) {
            kVar.getClass();
            return new com.avito.android.photo_list_view.re23.viewholders.h((View) gVar.invoke(Integer.valueOf(R.layout.photo_item_image_loading_item)), aVar, this.f218207c, dVar);
        }
        if (i12 != 3) {
            kVar.getClass();
            return new com.avito.android.photo_list_view.re23.viewholders.c((View) gVar.invoke(Integer.valueOf(R.layout.photo_item_image_content_item)), aVar, this, this.f218207c, dVar);
        }
        kVar.getClass();
        return new com.avito.android.photo_list_view.re23.viewholders.f((View) gVar.invoke(Integer.valueOf(R.layout.photo_item_image_error_item)), aVar, dVar);
    }
}
