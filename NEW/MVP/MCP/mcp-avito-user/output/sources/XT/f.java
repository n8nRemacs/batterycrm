package Xt;

import Y61.k;
import Y61.l;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: SimpleVideoCircularGalleryItem.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXt/f;", "LXt/h;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f19119a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19120b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.image_loader.a f19121c;

    public f(@l com.avito.android.image_loader.a aVar, @l String str, @k String str2) {
        this.f19119a = str;
        this.f19120b = str2;
        this.f19121c = aVar;
    }

    @Override // Xt.InterfaceC17045a
    @k
    public final CircularGalleryItemType a() {
        return CircularGalleryItemType.f132171d;
    }

    @Override // Xt.h
    @l
    /* renamed from: getItemId, reason: from getter */
    public final String getF19119a() {
        return this.f19119a;
    }

    @Override // Xt.h
    @l
    public final com.avito.android.image_loader.k getThumbnail() {
        return this.f19121c;
    }

    @Override // Xt.h
    @k
    /* renamed from: getVideoUrl, reason: from getter */
    public final String getF19120b() {
        return this.f19120b;
    }
}
