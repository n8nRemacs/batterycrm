package com.avito.android.advert_details_items.photogallery;

import Oi0.InterfaceC14697a;
import Y41.q;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.photo_gallery.ui.PhotoGallery;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.gallery.GalleryConfig;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertDetailsGalleryView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/photogallery/n;", "LOi0/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements n, InterfaceC14697a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f85093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoGallery f85094c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public k f85095d;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPager f85096b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPager f85097c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f85098d;

        public a(ViewPager viewPager, ViewPager viewPager2, q qVar) {
            this.f85096b = viewPager;
            this.f85097c = viewPager2;
            this.f85098d = qVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View childAt = this.f85097c.getChildAt(0);
            if (childAt != null) {
                ((j) this.f85098d).invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), AsyncViewportTracker.ViewContext.f430436z);
            }
            this.f85096b.removeOnLayoutChangeListener(this);
        }
    }

    public o(@Y61.k View view, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        super(view);
        this.f85093b = interfaceC35845m2;
        PhotoGallery photoGallery = (PhotoGallery) view.findViewById(R.id.gallery_holder);
        this.f85094c = photoGallery;
        photoGallery.getPager().setOnClickListener(new B(this, 11));
    }

    @Override // com.avito.android.advert_details_items.photogallery.n
    public final void Hx(@Y61.l List list, @Y61.l List list2, @Y61.l List list3, @Y61.l Map map, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l String str, @Y61.k R0 r02, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.l k kVar, @Y61.l Y41.a aVar, @Y61.l Y41.a aVar2, @Y61.l Y41.a aVar3, @Y61.l k kVar2, int i12, long j12, @Y61.k AdvertScreen advertScreen, @Y61.l GalleryConfig galleryConfig, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l List list4, boolean z12, @Y61.l com.avito.android.pinch_to_zoom.b bVar, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l e eVar, @Y61.l List list5, @Y61.l Y41.l lVar2) {
        this.f85095d = kVar2;
        PhotoGallery.a(this.f85094c, lVar.a(), video, nativeVideo, list, str, this.f85093b, kVar, i12, j12, advertScreen, autotekaTeaserResult, galleryTeaser, this.f85095d, list4);
        PhotoGallery photoGallery = this.f85094c;
        if (i12 > -1) {
            Handler handler = photoGallery.f217677c;
            (handler != null ? handler : null).post(new androidx.camera.video.internal.audio.q(i12, 11, photoGallery));
        } else {
            Handler handler2 = photoGallery.f217677c;
            (handler2 != null ? handler2 : null).post(new androidx.camera.video.internal.audio.q(0, 11, photoGallery));
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        ViewPager pager = this.f85094c.getPager();
        if (D6.y(pager)) {
            pager.addOnLayoutChangeListener(new a(pager, pager, qVar));
        }
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        androidx.viewpager.widget.a adapter = this.f85094c.getPager().getAdapter();
        com.avito.android.photo_gallery.adapter.g gVar = adapter instanceof com.avito.android.photo_gallery.adapter.g ? (com.avito.android.photo_gallery.adapter.g) adapter : null;
        if (gVar != null) {
            ArrayList arrayList = gVar.f216731t;
            if (!arrayList.isEmpty()) {
                H hE2 = gVar.f216722k.e();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hE2.m((Fragment) it.next());
                }
                hE2.f();
            }
            arrayList.clear();
        }
    }
}
