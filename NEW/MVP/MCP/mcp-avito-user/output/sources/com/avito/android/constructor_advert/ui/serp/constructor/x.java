package com.avito.android.constructor_advert.ui.serp.constructor;

import Xt.InterfaceC17045a;
import android.os.Parcelable;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.VideoGalleryItemModel;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mc.C44048a;

/* compiled from: SharedConstructorAdvertItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/x;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "Lcom/avito/android/constructor_advert/ui/serp/constructor/k;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class x<T extends ConstructorAdvertItem> implements k<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f125834b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f125835c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f125836d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.serp.r f125837e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f125838f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ConstructorAdvertState f125839g;

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125840l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f125841m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f125842n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f125843o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x<? super T> xVar, n nVar, T t12, int i12) {
            super(0);
            this.f125840l = xVar;
            this.f125841m = nVar;
            this.f125842n = t12;
            this.f125843o = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f125840l.h0(this.f125841m, this.f125842n, this.f125843o);
            return G0.f406611a;
        }
    }

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125844l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f125845m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f125846n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x<? super T> xVar, n nVar, T t12) {
            super(0);
            this.f125844l = xVar;
            this.f125845m = nVar;
            this.f125846n = t12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f125844l.i0(this.f125845m, this.f125846n);
            return G0.f406611a;
        }
    }

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "", "selectedPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125847l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f125848m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x<? super T> xVar, T t12) {
            super(1);
            this.f125847l = xVar;
            this.f125848m = t12;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            ConstructorAdvertState constructorAdvertState = this.f125847l.f125839g;
            constructorAdvertState.f125779b.put(this.f125848m.getF83628f(), Integer.valueOf(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125849l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f125850m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f125851n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x<? super T> xVar, T t12, int i12) {
            super(1);
            this.f125849l = xVar;
            this.f125850m = t12;
            this.f125851n = i12;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            x<T> xVar = this.f125849l;
            xVar.f125835c.c(new mc.e(str2, this.f125850m.getF83628f(), xVar.f125838f.getF220326i(), Integer.valueOf(this.f125851n), null, null, null, 96, null));
            return G0.f406611a;
        }
    }

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "", "videoUrl", "", "duration", "playbackPosition", "Lcom/avito/android/analytics/event/native_video/VideoStopReason;", "videoStopReason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;DDLcom/avito/android/analytics/event/native_video/VideoStopReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.r<String, Double, Double, VideoStopReason, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125852l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f125853m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f125854n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x<? super T> xVar, T t12, int i12) {
            super(4);
            this.f125852l = xVar;
            this.f125853m = t12;
            this.f125854n = i12;
        }

        @Override // Y41.r
        public final G0 invoke(String str, Double d12, Double d13, VideoStopReason videoStopReason) {
            double dDoubleValue = d12.doubleValue();
            double dDoubleValue2 = d13.doubleValue();
            x<T> xVar = this.f125852l;
            xVar.f125835c.c(new mc.g(str, this.f125853m.getF83628f(), xVar.f125838f.getF220326i(), Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), Integer.valueOf(this.f125854n), null, videoStopReason, null, 256, null));
            return G0.f406611a;
        }
    }

    /* compiled from: SharedConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "", "videoUrl", "errorMessage", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x<T> f125855l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f125856m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f125857n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(x<? super T> xVar, T t12, int i12) {
            super(2);
            this.f125855l = xVar;
            this.f125856m = t12;
            this.f125857n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            x<T> xVar = this.f125855l;
            xVar.f125835c.c(new C44048a(str, this.f125856m.getF83628f(), xVar.f125838f.getF220326i(), str2, Integer.valueOf(this.f125857n)));
            return G0.f406611a;
        }
    }

    public x(@Y61.k C36135w2 c36135w2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h hVar, @Y61.l com.avito.android.serp.r rVar, @Y61.l Kundle kundle, @Y61.k com.avito.android.player_holder.a aVar) {
        ConstructorAdvertState constructorAdvertState;
        this.f125834b = c36135w2;
        this.f125835c = interfaceC28373a;
        this.f125836d = hVar;
        this.f125837e = rVar;
        this.f125838f = aVar;
        this.f125839g = (kundle == null || (constructorAdvertState = (ConstructorAdvertState) kundle.d("constructor_advert_state")) == null) ? new ConstructorAdvertState(null, 1, null) : constructorAdvertState;
    }

    public static Xt.c g0(String str, VideoGalleryItemModel videoGalleryItemModel, DimmedImage dimmedImage, DimmedImage dimmedImage2) {
        return new Xt.c(str, videoGalleryItemModel.getVideoUrl(), com.avito.android.image_loader.b.b(videoGalleryItemModel.getThumbnail()), (dimmedImage == null || dimmedImage2 == null) ? null : new Xt.g(com.avito.android.image_loader.b.a(dimmedImage), com.avito.android.image_loader.b.a(dimmedImage2)));
    }

    public abstract void O(@Y61.k T t12);

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g2((n) eVar, (ConstructorAdvertItem) aVar, i12, z.f125860a);
    }

    public abstract void V(@Y61.k n nVar, @Y61.k T t12);

    @Override // TV0.f
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void g2(@Y61.k n nVar, @Y61.k T t12, int i12, @Y61.k List<? extends Object> list) {
        List<? extends InterfaceC17045a> listSingletonList;
        DimmedImage image;
        DimmedImage image2;
        nVar.xj(t12.getFreeFormConverted(), t12.getSize(), t12.getDisplayType());
        t tVarA = this.f125836d.a(t12.getSize(), t12.getDisplayType(), t12.isExtendedGallery());
        List<ConstructorAdvertGalleryItemModel> galleryItemsList = t12.getGalleryItemsList();
        List<DimmedImage> imageList = t12.getImageList();
        if (galleryItemsList != null) {
            String f74861c = t12.getF83628f();
            if (t12.isExtendedGallery()) {
                ArrayList arrayList = new ArrayList();
                Iterator<ConstructorAdvertGalleryItemModel> it = galleryItemsList.iterator();
                Parcelable parcelable = null;
                while (true) {
                    if (it.hasNext()) {
                        Parcelable parcelable2 = (ConstructorAdvertGalleryItemModel) it.next();
                        if (parcelable2 instanceof VideoGalleryItemModel) {
                            if (((VideoGalleryItemModel) parcelable2).getVideoUrl() != null) {
                                if (parcelable != null) {
                                    if (arrayList.size() == 2) {
                                        listSingletonList = Collections.singletonList(g0(f74861c, (VideoGalleryItemModel) parcelable, (DimmedImage) arrayList.get(0), (DimmedImage) arrayList.get(1)));
                                        break;
                                    }
                                } else {
                                    parcelable = parcelable2;
                                }
                            } else {
                                continue;
                            }
                        } else if ((parcelable2 instanceof ImageGalleryItemModel) && (image2 = ((ImageGalleryItemModel) parcelable2).getImage()) != null) {
                            if (arrayList.size() != 2) {
                                if (arrayList.size() == 1 && parcelable != null) {
                                    listSingletonList = Collections.singletonList(g0(f74861c, (VideoGalleryItemModel) parcelable, (DimmedImage) arrayList.get(0), image2));
                                    break;
                                }
                                arrayList.add(image2);
                            } else {
                                DimmedImage dimmedImage = (DimmedImage) arrayList.get(0);
                                DimmedImage dimmedImage2 = (DimmedImage) arrayList.get(1);
                                listSingletonList = Collections.singletonList(new Xt.b(com.avito.android.image_loader.b.b(dimmedImage.getImage()), !L.f(dimmedImage.getDimming(), Boolean.FALSE), dimmedImage2 != null ? new Xt.g(com.avito.android.image_loader.b.a(dimmedImage2), com.avito.android.image_loader.b.a(image2)) : null));
                            }
                        }
                    } else if (parcelable != null) {
                        listSingletonList = Collections.singletonList(g0(f74861c, (VideoGalleryItemModel) parcelable, null, null));
                    } else {
                        DimmedImage dimmedImage3 = (DimmedImage) C42745f0.G(arrayList);
                        listSingletonList = dimmedImage3 != null ? Collections.singletonList(new Xt.b(com.avito.android.image_loader.b.b(dimmedImage3.getImage()), !L.f(dimmedImage3.getDimming(), Boolean.FALSE), null)) : C42784z0.f406748b;
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel : galleryItemsList) {
                    if (constructorAdvertGalleryItemModel instanceof VideoGalleryItemModel) {
                        VideoGalleryItemModel videoGalleryItemModel = (VideoGalleryItemModel) constructorAdvertGalleryItemModel;
                        String videoUrl = videoGalleryItemModel.getVideoUrl();
                        if (videoUrl != null) {
                            arrayList2.add(new Xt.f(com.avito.android.image_loader.b.b(videoGalleryItemModel.getThumbnail()), f74861c, videoUrl));
                        }
                    } else if ((constructorAdvertGalleryItemModel instanceof ImageGalleryItemModel) && (image = ((ImageGalleryItemModel) constructorAdvertGalleryItemModel).getImage()) != null) {
                        arrayList2.add(new Xt.e(com.avito.android.image_loader.b.b(image.getImage()), !L.f(image.getDimming(), Boolean.FALSE)));
                    }
                }
                listSingletonList = arrayList2;
            }
            k0(listSingletonList, nVar, t12, tVarA, galleryItemsList.size() <= 1, i12);
        } else if (imageList != null) {
            ArrayList arrayList3 = new ArrayList();
            List<DimmedImage> imageList2 = t12.getImageList();
            if (imageList2 != null) {
                for (DimmedImage dimmedImage4 : imageList2) {
                    arrayList3.add(new Q(com.avito.android.image_loader.b.b(dimmedImage4.getImage()), dimmedImage4.getDimming()));
                }
            }
            k0(Vt.d.a(C42745f0.M0(arrayList3), t12.isExtendedGallery()), nVar, t12, tVarA, imageList.size() <= 1, i12);
        } else {
            nVar.w8(false);
        }
        nVar.z0(t12.isDelivery());
        nVar.Tw(t12.getHasVideo());
        nVar.Dm(t12.getHasRealtyLayout());
        nVar.k5(t12.isHidden(), list.contains("animation_flag_payload"));
        nVar.c(new a(this, nVar, t12, i12));
        nVar.t(new b(this, nVar, t12));
        SerpBadgeBar badgeBar = t12.getBadgeBar();
        List<SerpBadge> badges = badgeBar != null ? badgeBar.getBadges() : null;
        if (badges == null) {
            badges = C42784z0.f406748b;
        }
        int iB2 = Q81.b.b(badges);
        SerpBadgeBar badgeBar2 = t12.getBadgeBar();
        List<SerpBadge> badges2 = badgeBar2 != null ? badgeBar2.getBadges() : null;
        if (badges2 == null || badges2.isEmpty()) {
            nVar.t0(null);
            nVar.z8(null);
            nVar.b6(t12.getBadgeSticker());
        } else if (iB2 == 2) {
            nVar.t0(null);
            SerpBadgeBar badgeBar3 = t12.getBadgeBar();
            nVar.z8(badgeBar3 != null ? Q81.b.d(badgeBar3) : null);
            nVar.b6(t12.getBadgeSticker());
        } else {
            SerpBadgeBar badgeBar4 = t12.getBadgeBar();
            nVar.t0(badgeBar4 != null ? badgeBar4.getBadges() : null);
            nVar.z8(null);
            nVar.b6(null);
        }
        if (L.f(t12.getReserved(), Boolean.TRUE)) {
            nVar.setViewed(false);
            nVar.Y4();
        } else {
            nVar.setViewed(t12.getF156398J());
        }
        Map<String, String> analyticParams = t12.getAnalyticParams();
        if (this.f125834b.v().invoke().booleanValue()) {
            nVar.Z70(new y(this, analyticParams));
        }
        n0(nVar, t12);
        p0(nVar, t12);
        o0(nVar, t12);
        V(nVar, t12);
        O(t12);
        k(nVar, t12);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.k
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f125839g, "constructor_advert_state");
        return kundle;
    }

    public abstract void h0(@Y61.k n nVar, @Y61.k T t12, int i12);

    public abstract void i0(@Y61.k n nVar, @Y61.k T t12);

    public abstract void k(@Y61.k n nVar, @Y61.k T t12);

    public final void k0(List<? extends InterfaceC17045a> list, n nVar, T t12, t tVar, boolean z12, int i12) {
        nVar.w8(true);
        Integer num = this.f125839g.f125779b.get(t12.getF83628f());
        nVar.Fd(num != null ? num.intValue() : 0, list);
        nVar.x7(new c(this, t12));
        nVar.Zc(tVar.f125830a, tVar.f125831b, tVar.f125832c);
        if (t12.getSize() == SnippetSize.SMALL && z12) {
            nVar.Id(true);
        } else {
            nVar.Id(false);
        }
        nVar.R0(new d(this, t12, i12));
        nVar.a1(new e(this, t12, i12));
        nVar.Q3(new f(this, t12, i12));
    }

    public abstract void n0(@Y61.k n nVar, @Y61.k T t12);

    public abstract void o0(@Y61.k n nVar, @Y61.k T t12);

    public abstract void p0(@Y61.k n nVar, @Y61.k T t12);

    public /* synthetic */ x(C36135w2 c36135w2, InterfaceC28373a interfaceC28373a, h hVar, com.avito.android.serp.r rVar, Kundle kundle, com.avito.android.player_holder.a aVar, int i12, C42822w c42822w) {
        this(c36135w2, interfaceC28373a, hVar, (i12 & 8) != 0 ? null : rVar, kundle, aVar);
    }
}
