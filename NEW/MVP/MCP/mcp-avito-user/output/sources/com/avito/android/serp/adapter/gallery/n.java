package com.avito.android.serp.adapter.gallery;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import javax.inject.Inject;
import kotlin.Metadata;
import or0.C44852b;

/* compiled from: GalleryHeaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/n;", "Lcom/avito/android/serp/adapter/gallery/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f270046b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f270047c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f270048d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f270049e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public GalleryHeaderItem f270050f;

    @Inject
    public n(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l String str) {
        this.f270046b = aVar;
        this.f270047c = gVar;
        this.f270048d = interfaceC28373a;
        this.f270049e = C35800g5.a(new C35792f5(str));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        p pVar = (p) eVar;
        GalleryHeaderItem galleryHeaderItem = (GalleryHeaderItem) aVar;
        pVar.cy(galleryHeaderItem, new m(this, pVar, i12, galleryHeaderItem));
        if (this.f270050f == null) {
            this.f270050f = galleryHeaderItem;
            this.f270047c.h(i12, "gallery_header_widget", pVar.Xn(), null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : galleryHeaderItem.f270010g);
            this.f270048d.c(new C44852b(pVar.Xn(), pVar.TE(0), this.f270049e));
        }
    }
}
