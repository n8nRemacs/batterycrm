package com.avito.android.lib.design.gallery;

import android.graphics.drawable.GradientDrawable;
import com.avito.android.image_loader.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gallery/g;", "Lcom/avito/android/lib/design/gallery/GalleryViewHolder;", "Lcom/avito/android/lib/design/gallery/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends GalleryViewHolder<d> {
    @Override // com.avito.android.lib.design.gallery.GalleryViewHolder
    public final void B80(h hVar, c cVar, float f12, float f13, boolean z12) {
        ShapeableImageView shapeableImageView = (ShapeableImageView) this.itemView;
        q.b bVar = new q.b();
        bVar.k(f12);
        bVar.n(f13);
        bVar.h(f13);
        bVar.e(f12);
        shapeableImageView.setShapeAppearanceModel(bVar.a());
        shapeableImageView.setBackgroundColor(hVar.getBackgroundColor());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(hVar.getOverlayColor());
        gradientDrawable.setCornerRadii(new float[]{f12, f12, f13, f13, f13, f13, f12, f12});
        shapeableImageView.setForeground(gradientDrawable);
        hVar.f179223M0++;
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(shapeableImageView));
        aVar.d(((d) cVar).f179209a);
        aVar.f169490h = new e(shapeableImageView, z12, hVar, shapeableImageView, hVar);
        aVar.f169504v = new f(1, shapeableImageView, ShapeableImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
        aVar.c();
    }
}
