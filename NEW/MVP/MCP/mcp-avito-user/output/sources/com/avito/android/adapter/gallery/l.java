package com.avito.android.adapter.gallery;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/adapter/gallery/l;", "Lcom/avito/android/adapter/gallery/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f68467b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f68468c;

    /* compiled from: GalleryItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/adapter/gallery/l$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f68470c;

        public a(Y41.a<G0> aVar) {
            this.f68470c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) l.this.f68467b.getLayoutManager();
            if (i12 < 0 || linearLayoutManager.o0() - linearLayoutManager.M1() > linearLayoutManager.o0() / 4) {
                return;
            }
            this.f68470c.invoke();
        }
    }

    public l(@Y61.k Activity activity, @Y61.k View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.review_gallery);
        this.f68467b = recyclerView;
        this.f68468c = new t(recyclerView, activity, null, 4, null);
    }

    @Override // com.avito.android.adapter.gallery.k
    public final void SS(@Y61.k Y41.a<G0> aVar) {
        RecyclerView recyclerView = this.f68467b;
        recyclerView.setItemViewCacheSize(10);
        recyclerView.o(new a(aVar));
    }

    @Override // com.avito.android.adapter.gallery.k
    /* renamed from: Z2, reason: from getter */
    public final t getF68468c() {
        return this.f68468c;
    }

    @Override // com.avito.android.adapter.gallery.k
    public final void k3(int i12) {
        D6.c(this.itemView, null, Integer.valueOf(i12), null, null, 13);
    }

    @Override // com.avito.android.adapter.gallery.k
    public final void yn(int i12) {
        D6.c(this.itemView, Integer.valueOf(i12 / 2), null, null, null, 14);
    }
}
