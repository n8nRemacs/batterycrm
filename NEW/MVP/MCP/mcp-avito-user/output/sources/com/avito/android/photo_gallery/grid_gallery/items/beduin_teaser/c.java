package com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryBeduinTeaserItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/c;", "Lcom/avito/conveyor_item/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<BeduinModel> f217237b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<BeduinModel> f217238c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<BeduinModel> f217239d;

    public c(@k List list, @k List list2, @k List list3) {
        this.f217237b = list;
        this.f217238c = list2;
        this.f217239d = list3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f217237b, cVar.f217237b) && L.f(this.f217238c, cVar.f217238c) && L.f(this.f217239d, cVar.f217239d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return 102191382;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF202667b() {
        return "beduin_teaser";
    }

    public final int hashCode() {
        return this.f217239d.hashCode() + H.e(H.e(-1127034454, 31, this.f217237b), 31, this.f217238c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridGalleryBeduinTeaserItem(stringId=beduin_teaser, topModels=");
        sb2.append(this.f217237b);
        sb2.append(", mainModels=");
        sb2.append(this.f217238c);
        sb2.append(", bottomModels=");
        return H.p(sb2, this.f217239d, ')');
    }
}
