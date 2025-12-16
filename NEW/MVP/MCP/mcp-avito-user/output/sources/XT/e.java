package Xt;

import Y61.k;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SimplePictureCircularGalleryItem.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXt/e;", "LXt/d;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.k f19117a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19118b;

    public e(@k com.avito.android.image_loader.k kVar, boolean z12) {
        this.f19117a = kVar;
        this.f19118b = z12;
    }

    @Override // Xt.d
    @k
    /* renamed from: Y, reason: from getter */
    public final com.avito.android.image_loader.k getF19117a() {
        return this.f19117a;
    }

    @Override // Xt.d
    /* renamed from: Z, reason: from getter */
    public final boolean getF19118b() {
        return this.f19118b;
    }

    @Override // Xt.InterfaceC17045a
    @k
    public final CircularGalleryItemType a() {
        return CircularGalleryItemType.f132169b;
    }

    public /* synthetic */ e(com.avito.android.image_loader.k kVar, boolean z12, int i12, C42822w c42822w) {
        this(kVar, (i12 & 2) != 0 ? true : z12);
    }
}
