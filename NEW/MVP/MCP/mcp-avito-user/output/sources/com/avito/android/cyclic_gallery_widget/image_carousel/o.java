package com.avito.android.cyclic_gallery_widget.image_carousel;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageCarousel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/o;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f132064b;

    public o(p pVar) {
        this.f132064b = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        ?? r22;
        int i13 = p.f132065v;
        p pVar = this.f132064b;
        if (pVar.f132070e.getScrollState() == 0 && (r22 = pVar.f132081p) != 0) {
            r22.invoke(Integer.valueOf(pVar.f132071f.H1()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        p pVar = this.f132064b;
        if (pVar.f132069d && pVar.f132084s == null) {
            pVar.f132084s = Boolean.FALSE;
            pVar.h();
            pVar.f132084s = Boolean.TRUE;
        }
        Y41.l<? super RecyclerView, G0> lVar = pVar.f132080o;
        if (lVar != null) {
            lVar.invoke(recyclerView);
        }
    }
}
