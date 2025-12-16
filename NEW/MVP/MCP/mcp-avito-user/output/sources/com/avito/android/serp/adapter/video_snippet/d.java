package com.avito.android.serp.adapter.video_snippet;

import Y41.p;
import Y41.q;
import Y61.l;
import Yt.C18324a;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import com.avito.android.design.widget.ClickableGalleryPager;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.C34731f;
import com.avito.android.serp.adapter.InterfaceC34729e;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup;
import com.avito.android.util.V2;
import com.avito.android.video_snippets.b;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.r;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: AdvertGridItemWithVideoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/video_snippet/d;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/video_snippet/c;", "Lcom/avito/android/serp/adapter/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.android.serp.c implements com.avito.android.serp.adapter.video_snippet.c, InterfaceC34729e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f273692i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f273693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34731f f273694c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f273695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f273696e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ClickableGalleryPager f273697f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Vt.c f273698g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f273699h;

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f273700b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<String, String, G0> f273701b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super String, ? super String, G0> pVar) {
            this.f273701b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f273701b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f273702b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdvertGridItemWithVideoView", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.video_snippet.d$d, reason: collision with other inner class name */
    public static final class C8122d<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final C8122d<T> f273703b = new C8122d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f273704b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super String, G0> lVar) {
            this.f273704b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f273704b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f273705b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdvertGridItemWithVideoView", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f273706b = new g<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.r<String, Double, Double, VideoStopReason, G0> f273707b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f273707b = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f273707b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f273708b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdvertGridItemWithVideoView", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f273709l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Y41.a<G0> aVar) {
            super(0);
            this.f273709l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f273709l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/video_snippet/d$k", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f273710b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f273711c;

        public k(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            this.f273710b = aVar;
            this.f273711c = aVar2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            this.f273710b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f273711c.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, com.avito.android.server_time.h hVar, Locale locale, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, Integer num, int i12, C42822w c42822w) {
        super(view);
        num = (i12 & 32) != 0 ? null : num;
        this.f273693b = view;
        this.f273694c = new C34731f(view, hVar, locale, viewContext, gVar, num);
        this.f273695d = new io.reactivex.rxjava3.disposables.c();
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f273696e = cVar;
        View viewFindViewById = view.findViewById(R.id.image_pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.design.widget.ClickableGalleryPager");
        }
        this.f273697f = (ClickableGalleryPager) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f273698g = new Vt.c(viewFindViewById2, P0.e(new Q(CircularGalleryItemType.f132169b, new Yt.d(R.layout.constructor_advert_image_page, true, num != null ? Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(num.intValue())) : null)), new Q(CircularGalleryItemType.f132171d, new Yt.e(gVar, cVar)), new Q(CircularGalleryItemType.f132170c, new C18324a(true, num != null ? Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(num.intValue())) : null)), new Q(CircularGalleryItemType.f132172e, new Yt.b(true, gVar, cVar))));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B1(long j12) {
        this.f273694c.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B5(@l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f273694c.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void C(@l String str) {
        this.f273694c.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void D0(@l QuorumFilterInfo quorumFilterInfo) {
        this.f273694c.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.video_snippet.c
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f273693b.addOnAttachStateChangeListener(new k(aVar, aVar2));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void E0(@l String str) {
        this.f273694c.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Ed(@Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        this.f273694c.Ed(serpDisplayType, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void F0(@Y61.k Y41.a<G0> aVar) {
        this.f273694c.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fc(@l String str, @l UniversalColor universalColor, boolean z12, @l UniversalColor universalColor2) {
        this.f273694c.Fc(str, universalColor, z12, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fd(int i12, @Y61.k List list) throws Resources.NotFoundException {
        Vt.c cVar = this.f273698g;
        cVar.a(list, false);
        cVar.f17465b.x(cVar.f17467d.b(0), false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void GZ(@l String str, boolean z12, @l Boolean bool) {
        this.f273694c.GZ(str, z12, bool);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void H2(@l Y41.a<G0> aVar) {
        this.f273694c.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Id(boolean z12) {
        this.f273694c.Id(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void K9(@l BadgeSticker badgeSticker, boolean z12) {
        this.f273694c.K9(badgeSticker, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Kl(@l DeliveryTerms deliveryTerms, @l String str) {
        this.f273694c.Kl(deliveryTerms, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void L6(@Y61.k Y41.l lVar, @l BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f273694c.L6(lVar, buyWithDeliveryButton);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void M1(@l String str) {
        this.f273694c.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void N5(@l SellerRating sellerRating) {
        this.f273694c.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f273694c.f269948b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void O5(boolean z12, boolean z13) {
        this.f273694c.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.video_snippet.c
    public final void Q3(@Y61.k p<? super String, ? super String, G0> pVar) {
        this.f273695d.b(this.f273696e.N(a.f273700b).v0(new b(pVar), c.f273702b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.video_snippet.c
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f273695d.b(this.f273696e.N(C8122d.f273703b).v0(new e(lVar), f.f273705b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void S0(@l String str) {
        this.f273694c.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void W9(@Y61.k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f273694c.f269948b.f271760f0 = shownItemsAbTestGroup;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X2(@l UniversalColor universalColor, @Y61.k String str) {
        this.f273694c.X2(universalColor, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X3(@l String str) {
        this.f273694c.X3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Y4() {
        this.f273694c.Y4();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f273694c.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Zc(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        this.f273694c.Zc(i12, i13, viewContext);
    }

    @Override // com.avito.android.serp.adapter.video_snippet.c
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f273695d.b(this.f273696e.N(g.f273706b).v0(new h(rVar), i.f273708b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void a7() {
        this.f273694c.a7();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void b2(@l String str) {
        this.f273694c.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f273693b.setOnClickListener(new A(2, aVar));
        this.f273698g.b(new j(aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void cJ(@l String str, @l DiscountIcon discountIcon, boolean z12, boolean z13) {
        this.f273694c.cJ(str, discountIcon, z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d1(boolean z12) {
        this.f273694c.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d5(@l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f273694c.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e1(@Y61.k Badge badge) {
        this.f273694c.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e7(@l String str) {
        this.f273694c.e7(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void f1(@l String str) {
        this.f273694c.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void i1(@l String str) {
        this.f273694c.i1(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f273699h;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f273699h = null;
        this.f273695d.e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k1(@l String str) {
        this.f273694c.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k5(boolean z12, boolean z13) {
        this.f273694c.k5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void ka(@Y61.k Y41.a aVar, boolean z12) {
        this.f273694c.ka(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l3(@l String str) {
        this.f273694c.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l6(@Y61.k Y41.a aVar, boolean z12) {
        this.f273694c.l6(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void m1(@l String str) {
        this.f273694c.m1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o1(boolean z12) {
        this.f273694c.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o2(@l String str) {
        this.f273694c.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o3(@l String str) {
        this.f273694c.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o5(@l SerpBadgeBar serpBadgeBar) {
        this.f273694c.o5(serpBadgeBar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setActive(boolean z12) {
        this.f273694c.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setViewed(boolean z12) {
        this.f273694c.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.video_snippet.c
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f273699h = aVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w0() {
        this.f273694c.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w1(boolean z12) {
        this.f273694c.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w8(boolean z12) {
        this.f273694c.w8(true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void z0(boolean z12) {
        this.f273694c.z0(z12);
    }
}
