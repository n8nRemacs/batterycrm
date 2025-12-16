package com.avito.android.photo_gallery.grid_gallery.items.double_entity;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GridGalleryDoubleEntityPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/e;", "LTV0/d;", "Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/g;", "Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/GridGalleryDoubleEntityItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, GridGalleryDoubleEntityItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<T70.c, G0> f217255b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super T70.c, G0> lVar) {
        this.f217255b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GridGalleryDoubleEntityItem gridGalleryDoubleEntityItem = (GridGalleryDoubleEntityItem) aVar;
        ((g) eVar).XZ(gridGalleryDoubleEntityItem.f217246c, gridGalleryDoubleEntityItem.f217247d, new c(this, gridGalleryDoubleEntityItem), new d(this, gridGalleryDoubleEntityItem));
    }
}
