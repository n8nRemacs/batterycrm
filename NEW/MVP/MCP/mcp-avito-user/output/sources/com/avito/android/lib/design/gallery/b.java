package com.avito.android.lib.design.gallery;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.gallery.GalleryViewHolder;
import com.avito.android.lib.design.gallery.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/gallery/b;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/lib/design/gallery/c;", "Lcom/avito/android/lib/design/gallery/GalleryViewHolder;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends B<c, GalleryViewHolder<? extends c>> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f179207e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f179208f;

    /* compiled from: GalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/lib/design/gallery/b$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/lib/design/gallery/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.f<c> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(c cVar, c cVar2) {
            return cVar.equals(cVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(c cVar, c cVar2) {
            return cVar.equals(cVar2);
        }
    }

    public b(@k j jVar, @k h hVar) {
        super(new a());
        this.f179207e = jVar;
        this.f179208f = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        kotlin.reflect.d dVarB = m0.f406844a.b(getItem(i12).getClass());
        Integer num = (Integer) this.f179207e.f179232a.get(dVarB);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("No viewType registered for class " + dVarB).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        GalleryViewHolder galleryViewHolder = (GalleryViewHolder) c12;
        GalleryViewHolder.Position position = i12 == 0 ? GalleryViewHolder.Position.f179198b : i12 == this.f53650c.f53994f.size() - 1 ? GalleryViewHolder.Position.f179199c : GalleryViewHolder.Position.f179200d;
        boolean z12 = getItemCount() == 1;
        c item = getItem(i12);
        boolean z13 = item instanceof d;
        h hVar = this.f179208f;
        float edgeCornerRadius = (z12 || position == GalleryViewHolder.Position.f179198b) ? hVar.getEdgeCornerRadius() : hVar.getCornerRadius();
        h hVar2 = this.f179208f;
        galleryViewHolder.B80(hVar, item, edgeCornerRadius, (z12 || position == GalleryViewHolder.Position.f179199c) ? hVar2.getEdgeCornerRadius() : hVar2.getCornerRadius(), z12);
        View view = galleryViewHolder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.n nVar = (RecyclerView.n) layoutParams;
        if (!z13) {
            ((ViewGroup.MarginLayoutParams) nVar).width = z12 ? -1 : (int) (hVar2.getGalleryHeight() * 1.3333334f);
        }
        nVar.setMargins(0, 0, (z12 || position == GalleryViewHolder.Position.f179199c) ? 0 : hVar2.getSpacing(), 0);
        view.setLayoutParams(nVar);
        if (z13) {
            return;
        }
        hVar2.M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        j.b bVar = (j.b) this.f179207e.f179233b.get(Integer.valueOf(i12));
        if (bVar != null) {
            return bVar.a(viewGroup);
        }
        throw new IllegalStateException(("No viewHolderCreator registered for viewType " + i12).toString());
    }
}
