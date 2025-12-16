package com.avito.android.advert_details_items.photogallery;

import Oi0.InterfaceC14697a;
import Y41.q;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.photo_gallery.ui.PhotoGallery2;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.gallery.GalleryConfig;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertDetailsGalleryView2.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/photogallery/n;", "LOi0/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends com.avito.konveyor.adapter.b implements n, InterfaceC14697a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f85099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoGallery2 f85100c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final View f85101d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public k f85102e;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f85103b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f85104c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f85105d;

        public a(ViewPager2 viewPager2, ViewPager2 viewPager22, q qVar) {
            this.f85103b = viewPager2;
            this.f85104c = viewPager22;
            this.f85105d = qVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View childAt = this.f85104c.getChildAt(0);
            if (childAt != null) {
                ((j) this.f85105d).invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), AsyncViewportTracker.ViewContext.f430436z);
            }
            this.f85103b.removeOnLayoutChangeListener(this);
        }
    }

    public p(@Y61.k View view, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        super(view);
        this.f85099b = interfaceC35845m2;
        PhotoGallery2 photoGallery2 = (PhotoGallery2) view.findViewById(R.id.gallery_holder);
        this.f85100c = photoGallery2;
        this.f85101d = view.findViewById(R.id.bottom_divider);
        photoGallery2.getPager().setOnClickListener(new B(this, 12));
    }

    @Override // com.avito.android.advert_details_items.photogallery.n
    public final void Hx(@Y61.l List list, @Y61.l List list2, @Y61.l List list3, @Y61.l Map map, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l String str, @Y61.k R0 r02, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.l k kVar, @Y61.l Y41.a aVar, @Y61.l Y41.a aVar2, @Y61.l Y41.a aVar3, @Y61.l k kVar2, int i12, long j12, @Y61.k AdvertScreen advertScreen, @Y61.l GalleryConfig galleryConfig, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l List list4, boolean z12, @Y61.l com.avito.android.pinch_to_zoom.b bVar, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l e eVar, @Y61.l List list5, @Y61.l Y41.l lVar2) {
        this.f85102e = kVar2;
        PhotoGallery2.c(this.f85100c, r02, lVar.a(), lVar.e().getLifecycle(), list2, list3, map, video, nativeVideo, list, str, this.f85099b, kVar, aVar, aVar2, aVar3, i12, j12, galleryConfig, advertScreen, autotekaTeaserResult, galleryTeaser, this.f85102e, list4, bVar, pinchToZoomSource, eVar, lVar2, list5, 4196352);
        View view = this.f85101d;
        if (view != null) {
            D6.G(view, z12);
        }
        PhotoGallery2 photoGallery2 = this.f85100c;
        if (i12 > -1) {
            photoGallery2.setCurrentItem(i12);
        } else {
            photoGallery2.setCurrentItem(0);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        ViewPager2 pager = this.f85100c.getPager();
        if (D6.y(pager)) {
            pager.addOnLayoutChangeListener(new a(pager, pager, qVar));
        }
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f85100c.b();
    }
}
