package com.akita.compose.component.gallery;

import androidx.compose.runtime.I3;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryItemScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/gallery/GallerySizeElement;", "Landroidx/compose/ui/node/p0;", "Lcom/akita/compose/component/gallery/t;", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class GallerySizeElement extends AbstractC22430p0<t> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final I3<Integer> f61583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final I3<Integer> f61584c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f61585d;

    public GallerySizeElement() {
        throw null;
    }

    public GallerySizeElement(I3 i32, I3 i33, boolean z12, String str, int i12, C42822w c42822w) {
        i32 = (i12 & 1) != 0 ? null : i32;
        i33 = (i12 & 2) != 0 ? null : i33;
        z12 = (i12 & 4) != 0 ? true : z12;
        this.f61583b = i32;
        this.f61584c = i33;
        this.f61585d = z12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        t tVar = new t();
        tVar.f61624p = this.f61583b;
        tVar.f61625q = this.f61584c;
        tVar.f61626r = this.f61585d;
        return tVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        t tVar = (t) dVar;
        tVar.f61624p = this.f61583b;
        tVar.f61625q = this.f61584c;
        tVar.f61626r = this.f61585d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!GallerySizeElement.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        GallerySizeElement gallerySizeElement = (GallerySizeElement) obj;
        return L.f(this.f61583b, gallerySizeElement.f61583b) && L.f(this.f61584c, gallerySizeElement.f61584c);
    }

    public final int hashCode() {
        I3<Integer> i32 = this.f61583b;
        int iHashCode = (i32 != null ? i32.hashCode() : 0) * 31;
        I3<Integer> i33 = this.f61584c;
        return iHashCode + (i33 != null ? i33.hashCode() : 0);
    }
}
