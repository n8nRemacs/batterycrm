package Vt;

import Y61.k;
import Y61.l;
import com.avito.android.cyclic_gallery_widget.image_carousel.m;
import com.avito.android.cyclic_gallery_widget.image_carousel.r;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.konveyor.a;
import hw.InterfaceC41178c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageGalleryItemBinderFactory.kt */
@InterfaceC41178c
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVt/g;", "LVt/f;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.b<?, ?>> f17473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17474b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17475c;

    public g(@k com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar, @k m mVar, @k SellerInfoParams sellerInfoParams, boolean z12, @l com.avito.android.video_snippets.g gVar, @l com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar2, @l com.avito.android.pinch_to_zoom.b bVar, @l PinchToZoomSource pinchToZoomSource, @l z80.e eVar) {
        Object obj;
        Object next;
        float f12 = mVar.f132041b;
        r rVar = new r(new u(f12, cVar), null, null, bVar, pinchToZoomSource, eVar);
        com.avito.android.cyclic_gallery_widget.image_carousel.c cVar3 = new com.avito.android.cyclic_gallery_widget.image_carousel.c(new com.avito.android.cyclic_gallery_widget.image_carousel.d(mVar.f132042c, cVar));
        float f13 = mVar.f132043d;
        List<TV0.b<?, ?>> listU = C42745f0.U(rVar, cVar3, new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.c(new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.f(cVar, f13, sellerInfoParams, z12)), new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.a(new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.f(cVar, f13, sellerInfoParams, z12)), new com.avito.android.cyclic_gallery_widget.image_carousel.native_video.a(new com.avito.android.cyclic_gallery_widget.image_carousel.native_video.d(f12, cVar, gVar, cVar2)));
        this.f17473a = listU;
        Iterator<T> it = listU.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TV0.b) next) instanceof r) {
                    break;
                }
            }
        }
        TV0.b bVar2 = (TV0.b) next;
        this.f17474b = bVar2 != null ? TV0.c.a(bVar2) : -1;
        Iterator<T> it2 = this.f17473a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((TV0.b) next2) instanceof com.avito.android.cyclic_gallery_widget.image_carousel.native_video.a) {
                obj = next2;
                break;
            }
        }
        TV0.b bVar3 = (TV0.b) obj;
        this.f17475c = bVar3 != null ? TV0.c.a(bVar3) : -1;
    }

    @k
    public final com.avito.konveyor.a a() {
        a.C10493a c10493a = new a.C10493a();
        Iterator<T> it = this.f17473a.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }

    public /* synthetic */ g(com.jakewharton.rxrelay3.c cVar, m mVar, SellerInfoParams sellerInfoParams, boolean z12, com.avito.android.video_snippets.g gVar, com.jakewharton.rxrelay3.c cVar2, com.avito.android.pinch_to_zoom.b bVar, PinchToZoomSource pinchToZoomSource, z80.e eVar, int i12, C42822w c42822w) {
        this(cVar, mVar, sellerInfoParams, z12, (i12 & 16) != 0 ? null : gVar, (i12 & 32) != 0 ? null : cVar2, (i12 & 64) != 0 ? null : bVar, (i12 & 128) != 0 ? null : pinchToZoomSource, (i12 & 256) != 0 ? null : eVar);
    }
}
