package com.avito.android.advert_details_items.photogallery;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.advert_details_items.photogallery.c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48490v;

/* compiled from: AdvertDetailsGalleryPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/k;", "Lcom/avito/android/advert_details_items/photogallery/d;", "LR70/b;", "LR70/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements d, R70.b, R70.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f85074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R70.b f85075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f85076d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f85077e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f85078f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f85079g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E f85080h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f85081i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f85082j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGalleryItem f85083k;

    @Inject
    public k(@Y61.k c cVar, @Y61.k R70.b bVar, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k com.avito.android.pinch_to_zoom.b bVar2, @Y61.k E e12, @Y61.k @InterfaceC48490v u3.l<SimpleTestGroupWithNone> lVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f85074b = cVar;
        this.f85075c = bVar;
        this.f85076d = lVar;
        this.f85077e = interfaceC28373a;
        this.f85078f = r02;
        this.f85079g = bVar2;
        this.f85080h = e12;
        this.f85081i = lVar2;
        this.f85082j = aVar;
    }

    @Override // R70.b
    public final void O(int i12, long j12) {
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f85083k;
        if (advertDetailsGalleryItem == null || advertDetailsGalleryItem.f85012k != i12) {
            this.f85075c.O(i12, j12);
            this.f85074b.r1();
            AdvertDetailsGalleryItem advertDetailsGalleryItem2 = this.f85083k;
            if (advertDetailsGalleryItem2 == null) {
                return;
            }
            advertDetailsGalleryItem2.f85012k = i12;
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.pinch_to_zoom.b bVar;
        PinchToZoomSource pinchToZoomSource;
        e eVar2;
        n nVar = (n) eVar;
        AdvertDetailsGalleryItem advertDetailsGalleryItem = (AdvertDetailsGalleryItem) aVar;
        this.f85083k = advertDetailsGalleryItem;
        u3.l<SimpleTestGroupWithNone> lVar = this.f85081i;
        lVar.b();
        if (lVar.f439745a.f439749b.b()) {
            pinchToZoomSource = PinchToZoomSource.f219965d;
            eVar2 = new e(advertDetailsGalleryItem, this);
            bVar = this.f85079g;
        } else {
            bVar = null;
            pinchToZoomSource = null;
            eVar2 = null;
        }
        int i13 = advertDetailsGalleryItem.f85012k;
        AdvertScreen advertScreen = AdvertScreen.f90278d;
        nVar.Hx(advertDetailsGalleryItem.f85005d, advertDetailsGalleryItem.f85006e, advertDetailsGalleryItem.f85007f, advertDetailsGalleryItem.f85008g, advertDetailsGalleryItem.f85009h, advertDetailsGalleryItem.f85010i, advertDetailsGalleryItem.f85014m, this.f85078f, this.f85076d, this, new f(advertDetailsGalleryItem, this), new g(advertDetailsGalleryItem, this), new h(advertDetailsGalleryItem, this), this, i13, advertDetailsGalleryItem.f85013l, advertScreen, advertDetailsGalleryItem.f85016o, advertDetailsGalleryItem.f85021t, advertDetailsGalleryItem.f85022u, advertDetailsGalleryItem.f85023v, advertDetailsGalleryItem.f85017p, bVar, pinchToZoomSource, eVar2, advertDetailsGalleryItem.f85026y, new i(advertDetailsGalleryItem, this));
        nVar.Z70(new j(advertDetailsGalleryItem, this));
    }

    public final void V(int i12, boolean z12) {
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f85083k;
        c.a.a(this.f85074b, i12, advertDetailsGalleryItem != null ? Long.valueOf(advertDetailsGalleryItem.f85013l) : null, Boolean.valueOf(z12), 4);
    }

    public final void Y(int i12) {
        this.f85074b.a0();
    }
}
