package com.avito.android.lib.design.gallery;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.gallery.j;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class i implements j.b {
    @Override // com.avito.android.lib.design.gallery.j.b
    public final GalleryViewHolder a(ViewGroup viewGroup) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(viewGroup.getContext());
        shapeableImageView.setLayoutParams(new RecyclerView.n(-2, -1));
        return new g(shapeableImageView);
    }
}
