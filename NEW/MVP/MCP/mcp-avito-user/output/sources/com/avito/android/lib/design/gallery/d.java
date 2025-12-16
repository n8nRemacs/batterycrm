package com.avito.android.lib.design.gallery;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GalleryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/gallery/d;", "Lcom/avito/android/lib/design/gallery/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.a f179209a;

    public d(@k com.avito.android.image_loader.a aVar) {
        this.f179209a = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f179209a.equals(((d) obj).f179209a);
    }

    public final int hashCode() {
        return this.f179209a.hashCode();
    }

    @k
    public final String toString() {
        return "GalleryItemPicture(picture=" + this.f179209a + ')';
    }
}
