package com.avito.android.serp.adapter.serp_advert_card;

import Q81.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.android.video_snippets.b;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.internal.CheckableImageButton;
import hw.InterfaceC41177b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.PriceListCardView;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;

/* compiled from: SerpAdvertXlCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/F;", "Lcom/avito/android/serp/adapter/serp_advert_card/E;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class F implements E {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final DecimalFormat f271788V;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f271789A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final TextView f271790B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final View f271791C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final TextView f271792D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final ImageView f271793E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final ImageView f271794F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final TextView f271795G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final View f271796H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final TextView f271797I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final TextView f271798J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Q81.j f271799K;

    /* renamed from: L, reason: collision with root package name */
    public final float f271800L;

    /* renamed from: M, reason: collision with root package name */
    public final float f271801M;

    /* renamed from: N, reason: collision with root package name */
    public final float f271802N;

    /* renamed from: O, reason: collision with root package name */
    public final int f271803O;

    /* renamed from: P, reason: collision with root package name */
    public final int f271804P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final Drawable f271805Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f271806R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f271807S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final Vt.c f271808T;

    /* renamed from: U, reason: collision with root package name */
    public final int f271809U;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f271811c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f271812d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f271813e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f271814f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f271815g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f271816h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f271817i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f271818j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final TextView f271819k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final ImageView f271820l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f271821m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final TextView f271822n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f271823o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f271824p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f271825q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final PriceListCardView f271826r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f271827s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TextView f271828t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f271829u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f271830v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f271831w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f271832x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final View f271833y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final View f271834z;

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/F$a;", "", "<init>", "()V", "Ljava/text/DecimalFormat;", "ratingFormatter", "Ljava/text/DecimalFormat;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f271835a;

        static {
            int[] iArr = new int[PhoneLoadingState.values().length];
            try {
                PhoneLoadingState phoneLoadingState = PhoneLoadingState.f430441b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f271835a = iArr;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f271836b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.q f271837c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f271838d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ F f271839e;

        public c(View view, Y41.q qVar, View view2, F f12) {
            this.f271836b = view;
            this.f271837c = qVar;
            this.f271838d = view2;
            this.f271839e = f12;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View view2 = this.f271838d;
            this.f271837c.invoke(Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), this.f271839e.f271811c);
            this.f271836b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f271840b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, String, G0> f271841b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.p<? super String, ? super String, G0> pVar) {
            this.f271841b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f271841b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f271842b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertXlCardImpl", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f271843b = new g<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f271844b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Y41.l<? super String, G0> lVar) {
            this.f271844b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f271844b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f271845b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertXlCardImpl", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f271846b = new j<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.r<String, Double, Double, VideoStopReason, G0> f271847b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f271847b = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f271847b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T> f271848b = new l<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertXlCardImpl", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f271849l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a<G0> aVar) {
            super(0);
            this.f271849l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f271849l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/serp_advert_card/F$n", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f271850b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f271851c;

        public n(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            this.f271850b = aVar;
            this.f271851c = aVar2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            this.f271850b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f271851c.invoke();
        }
    }

    static {
        new a(null);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        f271788V = new DecimalFormat("0.0", decimalFormatSymbols);
    }

    public F(@Y61.k View view, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l com.avito.android.video_snippets.g gVar) throws Resources.NotFoundException {
        this.f271810b = view;
        this.f271811c = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271812d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.card_info_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271813e = (TextView) viewFindViewById2;
        this.f271814f = (TextView) view.findViewById(R.id.badge);
        this.f271815g = (SnippetBadgeBar) view.findViewById(R.id.advert_xl_item_badge_bar);
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271816h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.seller);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271817i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.verification);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271818j = (TextView) viewFindViewById5;
        this.f271819k = (TextView) view.findViewById(R.id.location);
        this.f271820l = (ImageView) view.findViewById(R.id.distance_icon);
        this.f271821m = (TextView) view.findViewById(R.id.quorum_filter_info);
        this.f271822n = (TextView) view.findViewById(R.id.distance);
        View viewFindViewById6 = view.findViewById(R.id.price);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById6;
        this.f271823o = textView;
        this.f271824p = (TextView) view.findViewById(R.id.normalized_price);
        View viewFindViewById7 = view.findViewById(R.id.price_without_discount);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271825q = (TextView) viewFindViewById7;
        this.f271826r = (PriceListCardView) view.findViewById(R.id.price_list);
        View viewFindViewById8 = view.findViewById(R.id.discount);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271827s = (TextView) viewFindViewById8;
        this.f271828t = (TextView) view.findViewById(R.id.discount_percentage);
        View viewFindViewById9 = view.findViewById(R.id.address);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271829u = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.date);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271830v = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.description);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271831w = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f271832x = (CheckableImageButton) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.call_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271833y = viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.phone_loader);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271834z = viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.call_button_text);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271789A = (TextView) viewFindViewById15;
        this.f271790B = (TextView) view.findViewById(R.id.additional_name);
        this.f271791C = view.findViewById(R.id.delivery);
        this.f271792D = (TextView) view.findViewById(R.id.delivery_terms);
        this.f271793E = (ImageView) view.findViewById(R.id.has_realty_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.has_video);
        this.f271794F = imageView;
        this.f271795G = (TextView) view.findViewById(R.id.seller_info_name);
        this.f271796H = view.findViewById(R.id.rating_star);
        this.f271797I = (TextView) view.findViewById(R.id.rating);
        this.f271798J = (TextView) view.findViewById(R.id.rating_count);
        this.f271799K = new Q81.j(textView, false);
        this.f271803O = C35835l0.d(R.attr.green600, view.getContext());
        this.f271804P = C35835l0.d(R.attr.green300, view.getContext());
        this.f271805Q = C35835l0.h(R.attr.ic_verify16, view.getContext());
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f271806R = cVar;
        this.f271807S = new io.reactivex.rxjava3.disposables.c();
        this.f271809U = view.getResources().getDimensionPixelSize(R.dimen.xl_advert_title_margin_right);
        Yt.d dVar = new Yt.d(R.layout.advert_xl_image_page, false, null, 6, null);
        Yt.e eVar = new Yt.e(gVar, cVar);
        View viewFindViewById16 = view.findViewById(R.id.pager);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271808T = new Vt.c(viewFindViewById16, new EnumMap(P0.g(new Q(CircularGalleryItemType.f132169b, dVar), new Q(CircularGalleryItemType.f132170c, dVar), new Q(CircularGalleryItemType.f132171d, eVar), new Q(CircularGalleryItemType.f132172e, eVar))));
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f271801M = typedValue.getFloat();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        this.f271800L = typedValue.getFloat();
        view.getResources().getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f271802N = typedValue.getFloat();
        if (imageView == null) {
            return;
        }
        imageView.setBackground(Q81.c.a(view));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void C(@Y61.l String str) {
        I5.a(this.f271829u, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f271821m;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f271810b.addOnAttachStateChangeListener(new n(aVar, aVar2));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void E0(@Y61.l String str) {
        TextView textView = this.f271822n;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void F0(@Y61.l Y41.a<G0> aVar) {
        G0 g02;
        CheckableImageButton checkableImageButton = this.f271832x;
        if (aVar != null) {
            checkableImageButton.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(10, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            checkableImageButton.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void F30(@Y61.k ArrayList arrayList) {
        this.f271808T.a(arrayList, true);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void M1(@Y61.l String str) {
        TextView textView = this.f271828t;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void N5(@Y61.l SellerRating sellerRating) {
        Float fValueOf;
        if (sellerRating != null) {
            Float scoreFloat = sellerRating.getScoreFloat();
            fValueOf = Float.valueOf(scoreFloat != null ? scoreFloat.floatValue() : sellerRating.getScore());
        } else {
            fValueOf = null;
        }
        boolean z12 = (sellerRating == null || fValueOf == null || sellerRating.getReviewCount() == null) ? false : true;
        TextView textView = this.f271797I;
        if (textView != null) {
            D6.G(textView, z12);
        }
        View view = this.f271796H;
        if (view != null) {
            D6.G(view, z12);
        }
        TextView textView2 = this.f271798J;
        if (textView2 != null) {
            D6.G(textView2, z12);
        }
        if (z12) {
            if (textView != null) {
                I5.a(textView, f271788V.format(fValueOf), false);
            }
            if (textView2 != null) {
                I5.a(textView2, sellerRating.getReviewCount(), false);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        View viewFindViewById = this.f271810b.findViewById(R.id.pager);
        if (viewFindViewById != null) {
            return ((com.avito.android.image_loader.m) kVar).a(viewFindViewById);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void O70(int i12, int i13) {
        View view = this.f271808T.f17464a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        TextView textView = this.f271792D;
        if (deliveryTerms == null) {
            D6.w(textView);
            return;
        }
        D6.G(textView, true);
        if (textView == null) {
            return;
        }
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f271810b.getContext();
        eVar.getClass();
        textView.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Q3(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f271807S.b(this.f271806R.N(d.f271840b).v0(new e(pVar), f.f271842b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f271807S.b(this.f271806R.N(g.f271843b).v0(new h(lVar), i.f271845b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f271820l;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f271810b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Sc(@Y61.l String str) {
        I5.a(this.f271789A, str, false);
        D6.G(this.f271833y, str != null);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Tu(int i12) {
        Vt.c cVar = this.f271808T;
        cVar.f17465b.x(cVar.f17467d.b(i12), false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void V(@Y61.l String str) {
        TextView textView = this.f271819k;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        View viewFindViewById = this.f271810b.findViewById(R.id.pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById.addOnLayoutChangeListener(new c(viewFindViewById, qVar, viewFindViewById, this));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f271807S.b(this.f271806R.N(j.f271846b).v0(new k(rVar), l.f271848b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void b(boolean z12, boolean z13) {
        TextView textView = this.f271813e;
        View view = this.f271812d;
        if (z12 && z13) {
            view.setAlpha(this.f271802N);
            D6.H(textView);
        } else if (z12 && !z13) {
            view.setAlpha(this.f271800L);
            D6.w(textView);
        } else if (!z12) {
            view.setAlpha(this.f271801M);
            D6.w(textView);
        }
        Drawable drawable = this.f271805Q;
        if (z13) {
            if (drawable != null) {
                drawable.setTint(this.f271804P);
            }
        } else if (drawable != null) {
            drawable.setTint(this.f271803O);
        }
        I5.d(this.f271818j, null, drawable, 11);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void b0(@Y61.l String str) {
        I5.a(this.f271830v, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void c(@Y61.l Y41.a<G0> aVar) {
        Vt.c cVar = this.f271808T;
        View view = this.f271810b;
        if (aVar == null) {
            view.setOnClickListener(null);
            cVar.b(null);
        } else {
            view.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(11, aVar));
            cVar.b(new m(aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void d1(boolean z12) {
        D6.G(this.f271832x, z12);
        int i12 = this.f271809U;
        if (i12 != 0) {
            if (!z12) {
                i12 = 0;
            }
            TextView textView = this.f271816h;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = i12;
            textView.requestLayout();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        SnippetBadgeBar snippetBadgeBar = this.f271815g;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(dVar);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void e1(@Y61.k Badge badge) {
        TextView textView = this.f271814f;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void ee(@Y61.l PriceList priceList) {
        PriceListCardView priceListCardView = this.f271826r;
        if (priceListCardView != null) {
            priceListCardView.setPriceList(priceList);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void f1(@Y61.l String str) {
        I5.a(this.f271825q, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void h(@Y61.l String str) {
        I5.a(this.f271831w, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void i1(@Y61.l String str) {
        TextView textView = this.f271790B;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void i3(@Y61.k List<? extends Q<? extends com.avito.android.image_loader.k, Boolean>> list) {
        this.f271808T.a(Vt.d.a(list, false), true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void k1(@Y61.l String str) {
        I5.a(this.f271818j, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void m1(@Y61.l String str) {
        TextView textView = this.f271795G;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void o1(boolean z12) {
        ImageView imageView = this.f271794F;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void oC(@Y61.l Y41.a<G0> aVar) {
        this.f271833y.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(9, aVar));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void sa(@Y61.l String str, boolean z12) {
        TextView textView = this.f271824p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        if (textView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        FlexboxLayout.LayoutParams layoutParams2 = null;
        FlexboxLayout.LayoutParams layoutParams3 = layoutParams instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.f348442k = z12;
            layoutParams2 = layoutParams3;
        }
        textView.setLayoutParams(layoutParams2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setActive(boolean z12) {
        boolean z13 = this.f271812d.getAlpha() == this.f271802N;
        this.f271810b.setClickable(z12);
        b(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setFavorite(boolean z12) {
        this.f271832x.setChecked(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f271833y.setEnabled(phoneLoadingState == PhoneLoadingState.f430441b);
        int i12 = b.f271835a[phoneLoadingState.ordinal()];
        View view = this.f271834z;
        TextView textView = this.f271789A;
        if (i12 == 1) {
            D6.g(textView);
            D6.H(view);
        } else {
            D6.H(textView);
            D6.w(view);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f271816h, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setViewed(boolean z12) {
        b(!(this.f271812d.getAlpha() == this.f271801M), z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void so(@Y61.l String str, @Y61.l DiscountIcon discountIcon) {
        D.a(this.f271827s, this.f271823o, str, discountIcon, (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? false : false, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void vb(@Y61.l String str) {
        I5.a(this.f271817i, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w0() {
        D6.w(this.f271814f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w1(boolean z12) {
        ImageView imageView = this.f271793E;
        if (imageView != null) {
            D6.G(imageView, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w4() {
        this.f271808T.a(C42784z0.f406748b, true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void x7(@Y61.l Y41.l<? super Integer, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void z0(boolean z12) {
        View view = this.f271791C;
        if (view == null) {
            this.f271823o.setCompoundDrawablesWithIntrinsicBounds(0, 0, z12 ? R.drawable.ic_delivery_16 : 0, 0);
        } else {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f271799K.a(str, z12, universalColor);
    }

    public /* synthetic */ F(View view, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, int i12, C42822w c42822w) {
        this(view, viewContext, (i12 & 4) != 0 ? null : gVar);
    }
}
