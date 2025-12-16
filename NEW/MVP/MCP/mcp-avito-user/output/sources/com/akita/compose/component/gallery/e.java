package com.akita.compose.component.gallery;

import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: GalleryItemScope.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/gallery/e;", "Lcom/akita/compose/component/gallery/d;", "<init>", "()V", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f61593a = U2.a(Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f61594b = U2.a(Integer.MAX_VALUE);

    @Override // com.akita.compose.component.gallery.d
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k v.a aVar) {
        GallerySizeElement gallerySizeElement = new GallerySizeElement(null, this.f61594b, false, "fillGalleryMaxHeight", 5, null);
        aVar.getClass();
        return gallerySizeElement;
    }

    @Override // com.akita.compose.component.gallery.d
    @Y61.k
    public final androidx.compose.ui.v b(@Y61.k v.a aVar) {
        GallerySizeElement gallerySizeElement = new GallerySizeElement(this.f61593a, null, false, "wrapGalleryMaxWidth", 2, null);
        aVar.getClass();
        return gallerySizeElement;
    }
}
