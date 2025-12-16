package com.avito.android.photo_gallery_carousel.gallery_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.di.C29972i;
import com.avito.android.photo_gallery_carousel.items.image.GalleryImageItem;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import z80.C50395a;

/* compiled from: CarouselPhotoGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryView;", "Landroid/widget/FrameLayout;", "Lgj/b;", "b", "Lgj/b;", "getBeduinContext", "()Lgj/b;", "setBeduinContext", "(Lgj/b;)V", "beduinContext", "Lgj/n;", "c", "Lgj/n;", "getBeduinViewFactory", "()Lgj/n;", "setBeduinViewFactory", "(Lgj/n;)V", "beduinViewFactory", "Lcom/avito/android/photo_gallery_carousel/a;", "d", "Lcom/avito/android/photo_gallery_carousel/a;", "getConverter", "()Lcom/avito/android/photo_gallery_carousel/a;", "setConverter", "(Lcom/avito/android/photo_gallery_carousel/a;)V", "converter", "Lcom/avito/android/deeplink_handler/handler/composite/a;", "e", "Lcom/avito/android/deeplink_handler/handler/composite/a;", "getDeeplinkHandler", "()Lcom/avito/android/deeplink_handler/handler/composite/a;", "setDeeplinkHandler", "(Lcom/avito/android/deeplink_handler/handler/composite/a;)V", "deeplinkHandler", "Lcom/avito/konveyor/adapter/d;", "f", "Lcom/avito/konveyor/adapter/d;", "getAdapter", "()Lcom/avito/konveyor/adapter/d;", "setAdapter", "(Lcom/avito/konveyor/adapter/d;)V", "adapter", "Lcom/avito/android/util/R0;", "g", "Lcom/avito/android/util/R0;", "getDispatchers", "()Lcom/avito/android/util/R0;", "setDispatchers", "(Lcom/avito/android/util/R0;)V", "dispatchers", "Lcom/avito/android/pinch_to_zoom/b;", "h", "Lcom/avito/android/pinch_to_zoom/b;", "getPinchToZoomHelper", "()Lcom/avito/android/pinch_to_zoom/b;", "setPinchToZoomHelper", "(Lcom/avito/android/pinch_to_zoom/b;)V", "pinchToZoomHelper", "Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryRecyclerView;", "i", "Lkotlin/C;", "getGalleryView", "()Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryRecyclerView;", "galleryView", "Landroid/widget/ImageView;", "j", "getRealtyLayoutView", "()Landroid/widget/ImageView;", "realtyLayoutView", "k", "getAiDesignView", "()Landroid/widget/FrameLayout;", "aiDesignView", "Lcom/avito/android/photo_gallery_carousel/d;", "p", "getPageIndicatorHolder", "()Lcom/avito/android/photo_gallery_carousel/d;", "pageIndicatorHolder", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarouselPhotoGalleryView extends FrameLayout {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f217796D = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public PinchToZoomSource f217797A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d f217798B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public C50395a f217799C;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Inject
    public InterfaceC40691b beduinContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Inject
    public gj.n beduinViewFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.android.photo_gallery_carousel.a converter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a deeplinkHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.konveyor.adapter.d adapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Inject
    public R0 dispatchers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.android.pinch_to_zoom.b pinchToZoomHelper;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C galleryView;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C realtyLayoutView;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C aiDesignView;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Toast f217810l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final s f217811m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final r f217812n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final e f217813o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C pageIndicatorHolder;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f217815q;

    /* renamed from: r, reason: collision with root package name */
    public long f217816r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f217817s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h f217818t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h f217819u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f217820v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f217821w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f217822x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public gj.k f217823y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public CarouselGalleryGroup f217824z;

    /* compiled from: CarouselPhotoGalleryView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217825a;

        static {
            int[] iArr = new int[CarouselGalleryGroup.values().length];
            try {
                iArr[CarouselGalleryGroup.NO_CROP_4_3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselGalleryGroup.CROP_4_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CarouselGalleryGroup.NO_CROP_9_7.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CarouselGalleryGroup.CROP_9_7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f217825a = iArr;
        }
    }

    /* compiled from: CarouselPhotoGalleryView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            CarouselPhotoGalleryView carouselPhotoGalleryView = CarouselPhotoGalleryView.this;
            com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar = carouselPhotoGalleryView.f217818t;
            if (hVar != null) {
                hVar.k(iIntValue, carouselPhotoGalleryView.f217816r);
            }
            carouselPhotoGalleryView.getRealtyLayoutView().setVisibility(carouselPhotoGalleryView.f217811m.a(iIntValue) ? 0 : 8);
            carouselPhotoGalleryView.getAiDesignView().setVisibility(carouselPhotoGalleryView.f217812n.a(iIntValue) ? 0 : 8);
            com.avito.android.photo_gallery_carousel.d pageIndicatorHolder = carouselPhotoGalleryView.getPageIndicatorHolder();
            pageIndicatorHolder.f217739c = iIntValue;
            int i12 = pageIndicatorHolder.f217740d;
            TextView textView = pageIndicatorHolder.f217738b;
            textView.setText(textView.getResources().getString(R.string.carousel_photo_gallery_text_page_indicator_text, Integer.valueOf(iIntValue + 1), Integer.valueOf(i12)));
            return G0.f406611a;
        }
    }

    @X41.j
    public CarouselPhotoGalleryView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void a(CarouselPhotoGalleryView carouselPhotoGalleryView, List list) {
        boolean z12 = true;
        boolean z13 = carouselPhotoGalleryView.getGalleryView().canScrollHorizontally(-1) || carouselPhotoGalleryView.getGalleryView().canScrollHorizontally(1);
        com.avito.android.photo_gallery_carousel.d pageIndicatorHolder = carouselPhotoGalleryView.getPageIndicatorHolder();
        if (list.size() > 1 && z13) {
            z12 = false;
        }
        pageIndicatorHolder.getClass();
        pageIndicatorHolder.f217737a.setVisibility(z12 ? 4 : 0);
    }

    public static void b(CarouselPhotoGalleryView carouselPhotoGalleryView, int i12, List list) {
        carouselPhotoGalleryView.getGalleryView().post(new RunnableC28882d(24, carouselPhotoGalleryView, list));
        com.avito.android.photo_gallery_carousel.d pageIndicatorHolder = carouselPhotoGalleryView.getPageIndicatorHolder();
        pageIndicatorHolder.f217739c = i12;
        int i13 = pageIndicatorHolder.f217740d;
        TextView textView = pageIndicatorHolder.f217738b;
        textView.setText(textView.getResources().getString(R.string.carousel_photo_gallery_text_page_indicator_text, Integer.valueOf(i12 + 1), Integer.valueOf(i13)));
        com.avito.android.photo_gallery_carousel.d pageIndicatorHolder2 = carouselPhotoGalleryView.getPageIndicatorHolder();
        int size = list.size();
        pageIndicatorHolder2.f217740d = size;
        int i14 = pageIndicatorHolder2.f217739c;
        TextView textView2 = pageIndicatorHolder2.f217738b;
        textView2.setText(textView2.getResources().getString(R.string.carousel_photo_gallery_text_page_indicator_text, Integer.valueOf(i14 + 1), Integer.valueOf(size)));
        carouselPhotoGalleryView.getGalleryView().A0(i12);
        carouselPhotoGalleryView.getGalleryView().post(new androidx.camera.video.internal.audio.q(i12, 12, carouselPhotoGalleryView));
    }

    public static void c(CarouselPhotoGalleryView carouselPhotoGalleryView, int i12) {
        RecyclerView.C cP2 = carouselPhotoGalleryView.getGalleryView().P(i12);
        if (cP2 == null) {
            return;
        }
        carouselPhotoGalleryView.getGalleryView().scrollBy(carouselPhotoGalleryView.f217813o.c(carouselPhotoGalleryView.f217815q, cP2.itemView)[0], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getAiDesignView() {
        return (FrameLayout) this.aiDesignView.getValue();
    }

    private final CarouselPhotoGalleryRecyclerView getGalleryView() {
        return (CarouselPhotoGalleryRecyclerView) this.galleryView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.avito.android.photo_gallery_carousel.d getPageIndicatorHolder() {
        return (com.avito.android.photo_gallery_carousel.d) this.pageIndicatorHolder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getRealtyLayoutView() {
        return (ImageView) this.realtyLayoutView.getValue();
    }

    public final void g() {
        getBeduinContext().onCleared();
        this.f217813o.b(null);
        C50395a c50395a = this.f217799C;
        if (c50395a != null) {
            U.b(c50395a.f443848c.f443855c, null);
            getGalleryView().v0(c50395a);
            this.f217799C = null;
        }
        this.f217823y = null;
        this.f217810l = null;
        getGalleryView().setAdapter(null);
    }

    @Y61.k
    public final com.avito.konveyor.adapter.d getAdapter() {
        com.avito.konveyor.adapter.d dVar = this.adapter;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Y61.k
    public final InterfaceC40691b getBeduinContext() {
        InterfaceC40691b interfaceC40691b = this.beduinContext;
        if (interfaceC40691b != null) {
            return interfaceC40691b;
        }
        return null;
    }

    @Y61.k
    public final gj.n getBeduinViewFactory() {
        gj.n nVar = this.beduinViewFactory;
        if (nVar != null) {
            return nVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.photo_gallery_carousel.a getConverter() {
        com.avito.android.photo_gallery_carousel.a aVar = this.converter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a getDeeplinkHandler() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.deeplinkHandler;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Y61.k
    public final R0 getDispatchers() {
        R0 r02 = this.dispatchers;
        if (r02 != null) {
            return r02;
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.pinch_to_zoom.b getPinchToZoomHelper() {
        com.avito.android.pinch_to_zoom.b bVar = this.pinchToZoomHelper;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final void h(@Y61.l List<Image> list, @Y61.l List<BeduinItemTeaser> list2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l List<Image> list3, @Y61.l Map<Integer, Image> map, @Y61.l GalleryTeaser galleryTeaser, @Y61.l AutotekaTeaserResult autotekaTeaserResult, int i12) {
        List<Image> list4;
        if ((video == null || !video.hasPreviewImage()) && ((nativeVideo == null || (!nativeVideo.hasThumbnail() && nativeVideo.getStatus() == null)) && ((list4 = list) == null || list4.isEmpty()))) {
            if (this.f217810l == null) {
                this.f217810l = L5.a(getContext(), R.string.carousel_photo_gallery_load_error, 0);
            }
            D6.w(this);
            return;
        }
        this.f217810l = null;
        ArrayList arrayListA = getConverter().a(video, nativeVideo, list, galleryTeaser, list3, map, list2, autotekaTeaserResult, this.f217817s, this.f217824z, this.f217797A, this.f217798B);
        int size = arrayListA.size() - 1;
        int i13 = i12;
        if (i13 > size) {
            i13 = size;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        s sVar = this.f217811m;
        LinkedHashMap linkedHashMap = sVar.f217851a;
        linkedHashMap.clear();
        int i14 = 0;
        for (Object obj : arrayListA) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            TV0.a aVar = (TV0.a) obj;
            linkedHashMap.put(Integer.valueOf(i14), Boolean.valueOf((aVar instanceof GalleryImageItem) && ((GalleryImageItem) aVar).f217941f));
            i14 = i15;
        }
        r rVar = this.f217812n;
        LinkedHashMap linkedHashMap2 = rVar.f217847a;
        linkedHashMap2.clear();
        int i16 = 0;
        for (Object obj2 : arrayListA) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            TV0.a aVar2 = (TV0.a) obj2;
            linkedHashMap2.put(Integer.valueOf(i16), Boolean.valueOf((aVar2 instanceof GalleryImageItem) && ((GalleryImageItem) aVar2).f217943h != null));
            i16 = i17;
        }
        Y41.a<G0> aVar3 = this.f217822x;
        if (aVar3 != null) {
            rVar.f217850d = aVar3;
        }
        getRealtyLayoutView().setVisibility(sVar.a(i13) ? 0 : 8);
        getAiDesignView().setVisibility(rVar.a(i13) ? 0 : 8);
        com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar = this.f217818t;
        if (hVar != null) {
            hVar.k(i13, this.f217816r);
        }
        getAdapter().l(arrayListA, new androidx.media3.exoplayer.drm.d(this, i13, arrayListA, 5));
    }

    public final void i(@Y61.k Fragment fragment, @Y61.l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar, long j12, @Y61.l String str, @Y61.k com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar2, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar, @Y61.l CarouselGalleryGroup carouselGalleryGroup, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar) {
        C50395a c50395a;
        if (!(fragment instanceof gj.i)) {
            throw new IllegalStateException("Parent fragment isn't implemented BeduinScreen");
        }
        this.f217816r = j12;
        this.f217817s = str;
        this.f217818t = hVar;
        this.f217819u = hVar2;
        this.f217820v = lVar;
        this.f217821w = lVar2;
        this.f217822x = aVar;
        this.f217824z = carouselGalleryGroup;
        this.f217797A = pinchToZoomSource;
        this.f217798B = dVar;
        if (this.f217823y == null) {
            gj.k kVarA = gj.m.a(getBeduinViewFactory(), fragment);
            this.f217823y = kVarA;
            ((com.avito.android.beduin.view.c) kVarA).l(getBeduinContext());
        }
        if (getGalleryView().getAdapter() == null) {
            getGalleryView().setAdapter(getAdapter());
        }
        this.f217813o.b(getGalleryView());
        if (pinchToZoomSource != null) {
            c50395a = new C50395a(getDispatchers(), (LinearLayoutManager) getGalleryView().getLayoutManager(), getPinchToZoomHelper(), pinchToZoomSource);
            getGalleryView().o(c50395a);
        } else {
            c50395a = null;
        }
        this.f217799C = c50395a;
        CarouselPhotoGalleryRecyclerView galleryView = getGalleryView();
        int i12 = carouselGalleryGroup == null ? -1 : a.f217825a[carouselGalleryGroup.ordinal()];
        float f12 = 0.75f;
        if (i12 != 1 && i12 != 2 && (i12 == 3 || i12 == 4)) {
            f12 = 0.84f;
        }
        galleryView.setHeightRatio(f12);
        D6.H(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        final int i12 = 0;
        getRealtyLayoutView().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_gallery_carousel.gallery_view.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CarouselPhotoGalleryView f217841c;

            {
                this.f217841c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer numValueOf;
                switch (i12) {
                    case 0:
                        CarouselPhotoGalleryView carouselPhotoGalleryView = this.f217841c;
                        Iterator it = carouselPhotoGalleryView.f217811m.f217851a.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                int iIntValue = ((Number) entry.getKey()).intValue();
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    numValueOf = Integer.valueOf(iIntValue);
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                        if (numValueOf != null) {
                            int iIntValue2 = numValueOf.intValue();
                            Y41.l<? super Integer, G0> lVar = carouselPhotoGalleryView.f217820v;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(iIntValue2));
                                break;
                            }
                        }
                        break;
                    default:
                        CarouselPhotoGalleryView carouselPhotoGalleryView2 = this.f217841c;
                        Y41.l<? super Integer, G0> lVar2 = carouselPhotoGalleryView2.f217821w;
                        if (lVar2 != null) {
                            lVar2.invoke(Integer.valueOf(carouselPhotoGalleryView2.f217812n.f217848b));
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        getAiDesignView().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.photo_gallery_carousel.gallery_view.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CarouselPhotoGalleryView f217841c;

            {
                this.f217841c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer numValueOf;
                switch (i13) {
                    case 0:
                        CarouselPhotoGalleryView carouselPhotoGalleryView = this.f217841c;
                        Iterator it = carouselPhotoGalleryView.f217811m.f217851a.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                int iIntValue = ((Number) entry.getKey()).intValue();
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    numValueOf = Integer.valueOf(iIntValue);
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                        if (numValueOf != null) {
                            int iIntValue2 = numValueOf.intValue();
                            Y41.l<? super Integer, G0> lVar = carouselPhotoGalleryView.f217820v;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(iIntValue2));
                                break;
                            }
                        }
                        break;
                    default:
                        CarouselPhotoGalleryView carouselPhotoGalleryView2 = this.f217841c;
                        Y41.l<? super Integer, G0> lVar2 = carouselPhotoGalleryView2.f217821w;
                        if (lVar2 != null) {
                            lVar2.invoke(Integer.valueOf(carouselPhotoGalleryView2.f217812n.f217848b));
                            break;
                        }
                        break;
                }
            }
        });
        CarouselPhotoGalleryRecyclerView galleryView = getGalleryView();
        galleryView.setItemAnimator(null);
        galleryView.o(new g(this.f217813o, new b()));
        galleryView.setAdapter(getAdapter());
        galleryView.setLayoutManager(this.f217815q);
        C35976x4.a(galleryView);
        galleryView.l(new com.avito.android.photo_gallery_carousel.items.b(), -1);
        galleryView.l(new com.avito.android.photo_gallery_carousel.items.a(D6.t(galleryView, R.dimen.carousel_photo_gallery_between_offset)), -1);
    }

    public final void setAdapter(@Y61.k com.avito.konveyor.adapter.d dVar) {
        this.adapter = dVar;
    }

    public final void setBeduinContext(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.beduinContext = interfaceC40691b;
    }

    public final void setBeduinViewFactory(@Y61.k gj.n nVar) {
        this.beduinViewFactory = nVar;
    }

    public final void setConverter(@Y61.k com.avito.android.photo_gallery_carousel.a aVar) {
        this.converter = aVar;
    }

    public final void setDeeplinkHandler(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.deeplinkHandler = aVar;
    }

    public final void setDispatchers(@Y61.k R0 r02) {
        this.dispatchers = r02;
    }

    public final void setPinchToZoomHelper(@Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.pinchToZoomHelper = bVar;
    }

    public CarouselPhotoGalleryView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.galleryView = C42727D.c(new k(this));
        this.realtyLayoutView = C42727D.c(new m(this));
        this.aiDesignView = C42727D.c(new j(this));
        this.f217811m = new s();
        this.f217812n = new r();
        this.f217813o = new e();
        this.pageIndicatorHolder = C42727D.c(new l(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.o1();
        linearLayoutManager.f53688E = 3;
        this.f217815q = linearLayoutManager;
        this.f217816r = -1L;
        com.avito.android.photo_gallery_carousel.di.h.a().a((com.avito.android.photo_gallery_carousel.di.a) C29972i.a(C29972i.b(this), com.avito.android.photo_gallery_carousel.di.a.class), (kj.c) C29972i.a(C29972i.b(this), kj.c.class), cv.c.a((androidx.appcompat.app.m) C35835l0.a(getContext())), new n(1, this, CarouselPhotoGalleryView.class, "handleAction", "handleAction(Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryAction;)V", 0)).a(this);
        setPadding(getPaddingLeft(), y6.b(8), getPaddingRight(), getPaddingBottom());
        LayoutInflater.from(context).inflate(R.layout.carousel_photo_gallery_view, (ViewGroup) this, true);
    }
}
