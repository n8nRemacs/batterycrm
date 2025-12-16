package com.avito.android.lib.beduin_v2.renderer.component.gallery;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.gallery.GalleryViewHolder;
import com.avito.android.lib.design.gallery.h;
import com.avito.android.util.D6;
import com.avito.beduin.v2.render.android_view.A;
import com.google.android.material.shape.q;
import kotlin.Metadata;

/* compiled from: GalleryComponentItemViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/renderer/component/gallery/f;", "Lcom/avito/android/lib/design/gallery/GalleryViewHolder;", "Lcom/avito/android/lib/beduin_v2/renderer/component/gallery/e;", "_design-modules_beduin-v2_renderer_component_gallery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends GalleryViewHolder<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BT.a f176417b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A f176418c;

    public f(@k BT.a aVar, @k A a12) {
        super(aVar);
        this.f176417b = aVar;
        this.f176418c = a12;
    }

    @Override // com.avito.android.lib.design.gallery.GalleryViewHolder
    public final void B80(h hVar, com.avito.android.lib.design.gallery.c cVar, float f12, float f13, boolean z12) {
        e eVar = (e) cVar;
        BT.a aVar = this.f176417b;
        aVar.removeAllViews();
        A a12 = this.f176418c;
        View viewF = eVar.f176416c.f(this.f176417b, eVar.f176415b, eVar.f176414a, a12.f337907c, null, null, a12);
        D6.z(viewF);
        q.b bVar = new q.b();
        bVar.k(f12);
        bVar.n(f13);
        bVar.h(f13);
        bVar.e(f12);
        aVar.setShapeModelClipPath(bVar.a());
        aVar.addView(viewF);
    }
}
