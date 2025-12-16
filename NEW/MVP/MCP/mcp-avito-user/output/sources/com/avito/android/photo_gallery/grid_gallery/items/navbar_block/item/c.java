package com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryNavbarChipItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/c;", "Lcom/avito/conveyor_item/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217269b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f217270c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f217271d;

    public c(@k String str, @k String str2, boolean z12) {
        this.f217269b = str;
        this.f217270c = str2;
        this.f217271d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f217269b, cVar.f217269b) && L.f(this.f217270c, cVar.f217270c) && this.f217271d == cVar.f217271d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF164006b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF164006b() {
        return this.f217269b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217271d) + H.d(this.f217269b.hashCode() * 31, 31, this.f217270c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridGalleryNavbarChipItem(stringId=");
        sb2.append(this.f217269b);
        sb2.append(", title=");
        sb2.append(this.f217270c);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f217271d, ')');
    }
}
