package com.avito.android.review_gallery.router;

import Y61.k;
import Y61.l;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CallDeeplinkRouter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/router/b;", "Lcom/avito/android/review_gallery/router/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.review_gallery.router.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f255563a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28616b f255564b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Pv0.b f255565c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f255566d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f255567e = C42727D.c(new a());

    /* compiled from: CallDeeplinkRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/review_gallery/router/ContactBarCallItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ContactBarCallItem> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ContactBarCallItem invoke() {
            b bVar = b.this;
            GalleryItem galleryItem = bVar.f255565c.read();
            GalleryItem.GalleryContactBar galleryContactBar = galleryItem != null ? galleryItem.f68404f : null;
            String str = galleryContactBar != null ? galleryContactBar.f68424g : null;
            Image image = galleryContactBar != null ? galleryContactBar.f68420c : null;
            return new ContactBarCallItem(str, galleryContactBar != null ? galleryContactBar.f68419b : null, bVar.f255566d, image, galleryContactBar != null ? galleryContactBar.f68423f : null, galleryContactBar != null ? galleryContactBar.f68422e : null);
        }
    }

    /* compiled from: CallDeeplinkRouter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.review_gallery.router.b$b, reason: collision with other inner class name */
    public static final class C7651b extends N implements Y41.l<DeepLink, G0> {
        public C7651b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(b.this.f255563a, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC28616b interfaceC28616b, @k Pv0.b bVar, @l @com.avito.android.review_gallery.di.b String str) {
        this.f255563a = aVar;
        this.f255564b = interfaceC28616b;
        this.f255565c = bVar;
        this.f255566d = str;
    }

    @Override // com.avito.android.review_gallery.router.a
    public final void g(@l DeepLink deepLink) {
        if (deepLink != null) {
            boolean z12 = deepLink instanceof ClickStreamLink;
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f255563a;
            if (z12) {
                ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
                b.a.a(aVar, ClickStreamLink.a(clickStreamLink, null), null, null, 6);
                DeepLink deepLink2 = clickStreamLink.f133110e;
                if (deepLink2 != null) {
                    g(deepLink2);
                    return;
                }
                return;
            }
            if (!(deepLink instanceof PhoneRequestLink)) {
                b.a.a(aVar, deepLink, null, null, 6);
                return;
            }
            if (this.f255564b.N6()) {
                b.a.a(aVar, deepLink, null, null, 6);
                return;
            }
            this.f255564b.O6((ContactBarCallItem) this.f255567e.getValue(), null, deepLink, ContactSource.f89919d, null, new C7651b());
        }
    }
}
