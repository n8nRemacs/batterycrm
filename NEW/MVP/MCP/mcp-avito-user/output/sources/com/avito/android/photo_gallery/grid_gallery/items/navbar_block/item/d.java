package com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryNavbarChipItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/d;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f217272a;

    public d(@l Boolean bool) {
        this.f217272a = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f217272a, ((d) obj).f217272a);
    }

    public final int hashCode() {
        Boolean bool = this.f217272a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public final String toString() {
        return C0.g(new StringBuilder("GridGalleryNavbarChipItemPayload(isSelected="), this.f217272a, ')');
    }
}
