package com.avito.android.photo_gallery.grid_gallery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import com.avito.android.remote.model.grid_gallery.GridGallery;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/C;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "LT70/e;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C implements com.avito.android.arch.mvi.u<GridGalleryInternalAction, T70.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f217313b;

    @Inject
    public C(@Y61.k E e12) {
        this.f217313b = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final T70.e a(GridGalleryInternalAction gridGalleryInternalAction, T70.e eVar) {
        Object next;
        GridGalleryInternalAction gridGalleryInternalAction2 = gridGalleryInternalAction;
        T70.e eVar2 = eVar;
        boolean z12 = gridGalleryInternalAction2 instanceof GridGalleryInternalAction.ContentLoaded;
        E e12 = this.f217313b;
        if (!z12) {
            if (gridGalleryInternalAction2 instanceof GridGalleryInternalAction.ScrollToItem) {
                return T70.e.a(eVar2, null, false, 0, 0, 0, null, null, null, 253);
            }
            if (gridGalleryInternalAction2 instanceof GridGalleryInternalAction.UpdateGalleryItemPosition) {
                GridGalleryInternalAction.UpdateGalleryItemPosition updateGalleryItemPosition = (GridGalleryInternalAction.UpdateGalleryItemPosition) gridGalleryInternalAction2;
                return T70.e.a(eVar2, null, false, 0, updateGalleryItemPosition.f217331b, updateGalleryItemPosition.f217332c, null, null, null, 231);
            }
            if (gridGalleryInternalAction2 instanceof GridGalleryInternalAction.UpdateLastValidGridGalleryItemPosition) {
                int i12 = ((GridGalleryInternalAction.UpdateLastValidGridGalleryItemPosition) gridGalleryInternalAction2).f217333b;
                return i12 > eVar2.f15419d ? T70.e.a(eVar2, null, false, i12, 0, 0, null, null, null, 251) : eVar2;
            }
            if (!(gridGalleryInternalAction2 instanceof GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId)) {
                return eVar2;
            }
            T70.e eVarA = T70.e.a(eVar2, null, false, 0, 0, 0, ((GridGalleryInternalAction.UpdateNavbarChipSelectedBlockId) gridGalleryInternalAction2).f217334b, null, null, 223);
            e12.getClass();
            return E.b(eVarA);
        }
        GridGalleryInternalAction.ContentLoaded contentLoaded = (GridGalleryInternalAction.ContentLoaded) gridGalleryInternalAction2;
        GridGalleryOpenParams gridGalleryOpenParams = contentLoaded.f217324b;
        Iterator<T> it = gridGalleryOpenParams.f217124b.getBlocks().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Boolean boolIsHiddenInNavigationBar = ((GridGallery.Block) next).isHiddenInNavigationBar();
            if (boolIsHiddenInNavigationBar != null && !boolIsHiddenInNavigationBar.booleanValue()) {
                break;
            }
        }
        GridGallery.Block block = (GridGallery.Block) next;
        T70.e eVarA2 = T70.e.a(eVar2, gridGalleryOpenParams, true, 0, 0, 0, block != null ? block.getTitle() : null, contentLoaded.f217325c, null, 156);
        e12.getClass();
        return E.b(eVarA2);
    }
}
