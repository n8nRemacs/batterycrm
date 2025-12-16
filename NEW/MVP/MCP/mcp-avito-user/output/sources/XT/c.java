package Xt;

import Y61.k;
import Y61.l;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import kotlin.Metadata;

/* compiled from: ExtendedVideoCircularGalleryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXt/c;", "LXt/h;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f19113a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19114b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.image_loader.a f19115c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final g f19116d;

    public c(@l String str, @k String str2, @l com.avito.android.image_loader.a aVar, @l g gVar) {
        this.f19113a = str;
        this.f19114b = str2;
        this.f19115c = aVar;
        this.f19116d = gVar;
    }

    @Override // Xt.InterfaceC17045a
    @k
    public final CircularGalleryItemType a() {
        return CircularGalleryItemType.f132172e;
    }

    @Override // Xt.h
    @l
    /* renamed from: getItemId, reason: from getter */
    public final String getF19113a() {
        return this.f19113a;
    }

    @Override // Xt.h
    @l
    public final com.avito.android.image_loader.k getThumbnail() {
        return this.f19115c;
    }

    @Override // Xt.h
    @k
    /* renamed from: getVideoUrl, reason: from getter */
    public final String getF19114b() {
        return this.f19114b;
    }
}
