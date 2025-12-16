package com.avito.android.photo_gallery.grid_gallery.items.navbar_block;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryNavbarChipsDiffCallback.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends C23424o.f<TV0.a> {
    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c) && (aVar4 instanceof com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c)) {
            com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c cVar = (com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c) aVar3;
            com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c cVar2 = (com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c) aVar4;
            if (cVar.f217271d == cVar2.f217271d && L.f(cVar.f217270c, cVar2.f217270c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF186614b() == aVar2.getF186614b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar2;
        if ((aVar instanceof com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c) && (aVar3 instanceof com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c)) {
            return new d(Boolean.valueOf(((com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.c) aVar3).f217271d));
        }
        return null;
    }
}
