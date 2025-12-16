package Xt;

import Y61.k;
import Y61.l;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedPictureCircularGalleryItem.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXt/b;", "LXt/d;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.k f19110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19111b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final g f19112c;

    public b(@k com.avito.android.image_loader.k kVar, boolean z12, @l g gVar) {
        this.f19110a = kVar;
        this.f19111b = z12;
        this.f19112c = gVar;
    }

    @Override // Xt.d
    @k
    /* renamed from: Y, reason: from getter */
    public final com.avito.android.image_loader.k getF19110a() {
        return this.f19110a;
    }

    @Override // Xt.d
    /* renamed from: Z, reason: from getter */
    public final boolean getF19111b() {
        return this.f19111b;
    }

    @Override // Xt.InterfaceC17045a
    @k
    public final CircularGalleryItemType a() {
        return CircularGalleryItemType.f132170c;
    }

    public /* synthetic */ b(com.avito.android.image_loader.k kVar, boolean z12, g gVar, int i12, C42822w c42822w) {
        this(kVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : gVar);
    }
}
