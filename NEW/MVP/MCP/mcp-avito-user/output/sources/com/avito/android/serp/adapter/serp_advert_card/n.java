package com.avito.android.serp.adapter.serp_advert_card;

import Q81.a;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.android.video_snippets.b;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.google.android.material.internal.CheckableImageButton;
import com.jakewharton.rxbinding4.view.C37722i;
import hw.InterfaceC41177b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.PriceListCardView;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;

/* compiled from: SerpAdvertRichServiceCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/n;", "Lcom/avito/android/serp/adapter/serp_advert_card/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class n implements com.avito.android.serp.adapter.serp_advert_card.m {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f272080A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final SnippetBadgeBar f272081B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final PriceListCardView f272082C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final Q81.j f272083D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Drawable f272084E;

    /* renamed from: F, reason: collision with root package name */
    public final int f272085F;

    /* renamed from: G, reason: collision with root package name */
    public final float f272086G;

    /* renamed from: H, reason: collision with root package name */
    public final float f272087H;

    /* renamed from: I, reason: collision with root package name */
    public final float f272088I;

    /* renamed from: J, reason: collision with root package name */
    public final float f272089J;

    /* renamed from: K, reason: collision with root package name */
    public final float f272090K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f272091L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.cyclic_gallery_widget.image_carousel.p f272092M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f272093N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f272094O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f272095P;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f272096b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f272097c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RelativeLayout f272098d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f272099e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f272100f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f272101g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f272102h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f272103i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ImageView f272104j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final TextView f272105k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f272106l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f272107m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f272108n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f272109o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f272110p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f272111q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Button f272112r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Button f272113s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Button f272114t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Button f272115u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f272116v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final CompactFlexibleLayout f272117w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f272118x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f272119y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final RatingBar f272120z;

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272121b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            this.f272121b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272121b.invoke();
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f272122b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "Click write error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272123b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a<G0> aVar) {
            this.f272123b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272123b.invoke();
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f272124b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "Click write error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272125b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.a<G0> aVar) {
            this.f272125b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272125b.invoke();
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f272126b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "Click call error", (Throwable) obj);
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f272127b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f272128c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.q f272129d;

        public g(View view, n nVar, Y41.q qVar) {
            this.f272127b = view;
            this.f272128c = nVar;
            this.f272129d = qVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            n nVar = this.f272128c;
            View childAt = nVar.f272101g.getChildAt(0);
            if (childAt != null) {
                this.f272129d.invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), nVar.f272097c);
            }
            this.f272127b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f272130b = new h<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T, R> f272131b = new i<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T, R> f272132b = new j<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return -1;
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272133b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.l<? super Integer, G0> lVar) {
            this.f272133b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf = null;
            }
            this.f272133b.invoke(numValueOf);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T> f272134b = new l<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichJobCard", "Click item error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final m<T> f272135b = new m<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.n$n, reason: collision with other inner class name */
    public static final class C8083n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272136b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8083n(Y41.p<? super String, ? super String, G0> pVar) {
            this.f272136b = (N) pVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f272136b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final o<T> f272137b = new o<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final p<T> f272138b = new p<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272139b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(Y41.l<? super String, G0> lVar) {
            this.f272139b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f272139b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final r<T> f272140b = new r<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final s<T> f272141b = new s<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272142b;

        /* JADX WARN: Multi-variable type inference failed */
        public t(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f272142b = (N) rVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.r, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f272142b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final u<T> f272143b = new u<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272144b;

        /* JADX WARN: Multi-variable type inference failed */
        public v(Y41.a<G0> aVar) {
            this.f272144b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272144b.invoke();
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final w<T> f272145b = new w<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichJobCard", "Click seller error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272146b;

        /* JADX WARN: Multi-variable type inference failed */
        public x(Y41.a<G0> aVar) {
            this.f272146b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272146b.invoke();
        }
    }

    /* compiled from: SerpAdvertRichServiceCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final y<T> f272147b = new y<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichServiceCard", "Click write error", (Throwable) obj);
        }
    }

    public n(@Y61.k View view, boolean z12, @Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, @Y61.l RecyclerView.t tVar, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l com.avito.android.video_snippets.g gVar) throws Resources.NotFoundException, BlueprintCollisionException {
        Button button;
        Button button2;
        Button button3;
        this.f272096b = view;
        this.f272097c = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        this.f272098d = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fields_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f272099e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.top_badge_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f272100f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.gallery);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f272101g = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272102h = (TextView) viewFindViewById5;
        this.f272103i = (TextView) view.findViewById(R.id.location);
        this.f272104j = (ImageView) view.findViewById(R.id.distance_icon);
        this.f272105k = (TextView) view.findViewById(R.id.quorum_filter_info);
        this.f272106l = (TextView) view.findViewById(R.id.distance);
        View viewFindViewById6 = view.findViewById(R.id.price);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.description);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272107m = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.address);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272108n = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.card_info_badge);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f272109o = viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f272110p = (CheckableImageButton) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.actions_container);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f272111q = (LinearLayout) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.btn_call);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button4 = (Button) viewFindViewById12;
        this.f272112r = button4;
        View viewFindViewById13 = view.findViewById(R.id.btn_write);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button5 = (Button) viewFindViewById13;
        this.f272113s = button5;
        View viewFindViewById14 = view.findViewById(R.id.btn_booking);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button6 = (Button) viewFindViewById14;
        this.f272114t = button6;
        View viewFindViewById15 = view.findViewById(R.id.btn_order_request);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button7 = (Button) viewFindViewById15;
        this.f272115u = button7;
        View viewFindViewById16 = view.findViewById(R.id.seller_name);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272116v = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.seller_badge_bar);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
        }
        this.f272117w = (CompactFlexibleLayout) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.seller_logo);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f272118x = (SimpleDraweeView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.seller_rating_value);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272119y = (TextView) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.seller_rating);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f272120z = (RatingBar) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.seller_rating_comment);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272080A = (TextView) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.advert_item_rich_service_snippet_badge_bar);
        if (viewFindViewById22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.snippet_badge_bar.SnippetBadgeBar");
        }
        this.f272081B = (SnippetBadgeBar) viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.price_list);
        if (viewFindViewById23 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.serp.PriceListCardView");
        }
        this.f272082C = (PriceListCardView) viewFindViewById23;
        this.f272083D = new Q81.j(textView, false);
        this.f272084E = D6.u(view, R.drawable.advert_item_rich_favorite_black);
        this.f272085F = D6.j(view, 8);
        this.f272086G = D6.j(view, 3);
        this.f272087H = D6.j(view, 18);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        this.f272091L = decimalFormat;
        Resources resources = view.getResources();
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f272093N = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f272094O = cVar2;
        this.f272095P = new io.reactivex.rxjava3.disposables.c();
        if (mVar != null) {
            D6.H(recyclerView);
            float f12 = mVar.f132041b;
            com.avito.android.cyclic_gallery_widget.image_carousel.r rVar = new com.avito.android.cyclic_gallery_widget.image_carousel.r(new com.avito.android.cyclic_gallery_widget.image_carousel.u(f12, cVar), null, null, null, null, null, 56, null);
            com.avito.android.cyclic_gallery_widget.image_carousel.native_video.a aVar = new com.avito.android.cyclic_gallery_widget.image_carousel.native_video.a(new com.avito.android.cyclic_gallery_widget.image_carousel.native_video.d(f12, cVar, gVar, cVar2));
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(rVar);
            c10493a.b(aVar);
            com.avito.konveyor.a aVarA = c10493a.a();
            button = button7;
            button2 = button6;
            button3 = button5;
            com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = new com.avito.android.cyclic_gallery_widget.image_carousel.p(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, tVar, false, null, null, false, 240, null);
            this.f272092M = pVar;
            pVar.f132066a.getLayoutParams().height = (int) (((resources.getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) * mVar.f132040a);
        } else {
            button = button7;
            button2 = button6;
            button3 = button5;
            D6.w(recyclerView);
            D6.c(viewFindViewById2, null, 0, null, null, 13);
            this.f272092M = null;
        }
        if (!z12) {
            button3.setAppearanceFromAttr(R.attr.buttonDefaultMedium);
            button4.setAppearanceFromAttr(R.attr.buttonDefaultMedium);
            button2.setAppearanceFromAttr(R.attr.buttonDefaultMedium);
            button.setAppearanceFromAttr(R.attr.buttonDefaultMedium);
        }
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f272089J = typedValue.getFloat();
        resources.getValue(R.dimen.active_alpha, typedValue, true);
        this.f272088I = typedValue.getFloat();
        resources.getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f272090K = typedValue.getFloat();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void Bt(@Y61.k Y41.a<G0> aVar) {
        this.f272095P.b(C37722i.a(this.f272112r).v0(new e(aVar), f.f272126b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void C(@Y61.l String str) {
        I5.a(this.f272108n, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f272105k;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void E0(@Y61.l String str) {
        TextView textView = this.f272106l;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void Fo(@Y61.k Y41.a<G0> aVar) {
        this.f272095P.b(C37722i.a(this.f272114t).v0(new a(aVar), b.f272122b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void H0() {
        this.f272095P.e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void H1(@Y61.l Parcelable parcelable) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272092M;
        if (parcelable != null) {
            if (pVar != null) {
                pVar.f(parcelable);
            }
        } else if (pVar != null) {
            pVar.e();
        }
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        View viewFindViewById = this.f272096b.findViewById(R.id.gallery);
        if (viewFindViewById != null) {
            return ((com.avito.android.image_loader.m) kVar).a(viewFindViewById);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f272093N.N(h.f272130b).g(i.e.class).d0(i.f272131b), C37722i.a(this.f272096b).d0(j.f272132b));
        k kVar = new k(lVar);
        l41.g<? super Throwable> gVar = l.f272134b;
        zVarG0.getClass();
        this.f272095P.b(zVarG0.v0(kVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f272095P.b(this.f272094O.N(p.f272138b).v0(new q(lVar), r.f272140b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void RF() {
        TextView textView = this.f272116v;
        textView.setText((CharSequence) null);
        D6.w(textView);
        SimpleDraweeView simpleDraweeView = this.f272118x;
        C35949t5.a(simpleDraweeView).b();
        D6.w(simpleDraweeView);
        D6.w(this.f272117w);
        D6.w(this.f272119y);
        D6.w(this.f272120z);
        D6.w(this.f272080A);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void S0(@Y61.l String str) {
        ImageView imageView = this.f272104j;
        if (imageView != null) {
            Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
            if (numA == null) {
                D6.w(imageView);
                return;
            }
            D6.G(imageView, true);
            View view = this.f272096b;
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), view.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.gray36, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void W2() {
        h2(C42784z0.f406748b);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        RecyclerView recyclerView = this.f272101g;
        if (D6.y(recyclerView)) {
            recyclerView.addOnLayoutChangeListener(new g(recyclerView, this, qVar));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f272095P.b(this.f272094O.N(s.f272141b).v0(new t(rVar), u.f272143b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void b(boolean z12, boolean z13) {
        View view = this.f272109o;
        if (z12 && z13) {
            D6.H(view);
            return;
        }
        RelativeLayout relativeLayout = this.f272098d;
        if (z12 && !z13) {
            relativeLayout.setAlpha(this.f272088I);
            D6.w(view);
        } else {
            if (z12) {
                return;
            }
            relativeLayout.setAlpha(this.f272089J);
            D6.G(view, z13);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void cw(@Y61.k Y41.a<G0> aVar) {
        io.reactivex.rxjava3.core.z zVarE0 = io.reactivex.rxjava3.core.z.e0(C37722i.a(this.f272118x), C37722i.a(this.f272116v), C37722i.a(this.f272117w));
        v vVar = new v(aVar);
        l41.g<? super Throwable> gVar = w.f272145b;
        zVarE0.getClass();
        this.f272095P.b(zVarE0.v0(vVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void ee(@Y61.l PriceList priceList) {
        this.f272082C.setPriceList(priceList);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void h(@Y61.l String str) {
        I5.a(this.f272107m, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void h2(@Y61.k List<? extends AdvertAction> list) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Button button;
        Button button2;
        Button button3;
        Button button4;
        List<? extends AdvertAction> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.Phone) {
                    break;
                }
            }
        }
        AdvertAction advertAction = (AdvertAction) next;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((AdvertAction) next2) instanceof AdvertAction.Messenger) {
                    break;
                }
            }
        }
        AdvertAction advertAction2 = (AdvertAction) next2;
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (((AdvertAction) next3) instanceof AdvertAction.Booking) {
                    break;
                }
            }
        }
        AdvertAction advertAction3 = (AdvertAction) next3;
        Iterator<T> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it4.next();
                if (((AdvertAction) next4) instanceof AdvertAction.ServiceOrderRequest) {
                    break;
                }
            }
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = next4 instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) next4 : null;
        Iterator<T> it5 = list2.iterator();
        while (true) {
            boolean zHasNext = it5.hasNext();
            button = this.f272114t;
            button2 = this.f272113s;
            button3 = this.f272112r;
            button4 = this.f272115u;
            if (!zHasNext) {
                break;
            }
            AdvertAction advertAction4 = (AdvertAction) it5.next();
            boolean z12 = advertAction4 instanceof AdvertAction.Phone;
            LinearLayout linearLayout = this.f272111q;
            if (z12) {
                linearLayout.removeView(button3);
                linearLayout.addView(button3);
            } else if (advertAction4 instanceof AdvertAction.Messenger) {
                linearLayout.removeView(button2);
                linearLayout.addView(button2);
            } else if (advertAction4 instanceof AdvertAction.Booking) {
                linearLayout.removeView(button);
                linearLayout.addView(button);
            } else if (advertAction4 instanceof AdvertAction.ServiceOrderRequest) {
                linearLayout.removeView(button4);
                linearLayout.addView(button4);
            }
        }
        com.avito.android.lib.design.button.b.a(button3, advertAction != null ? advertAction.getTitle() : null, false);
        com.avito.android.lib.design.button.b.a(button2, advertAction2 != null ? advertAction2.getTitle() : null, false);
        com.avito.android.lib.design.button.b.a(button, advertAction3 != null ? advertAction3.getTitle() : null, false);
        com.avito.android.lib.design.button.b.a(button4, serviceOrderRequest != null ? serviceOrderRequest.getTitle() : null, false);
        button4.setLoading(serviceOrderRequest != null ? serviceOrderRequest.getIsLoading() : false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272092M;
        if (pVar != null) {
            int i12 = com.avito.android.cyclic_gallery_widget.image_carousel.p.f132065v;
            pVar.g(list, false);
        }
        D6.c(this.f272099e, null, Integer.valueOf(D6.j(this.f272096b, 10)), null, null, 13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void iu(@Y61.k Y41.a<G0> aVar) {
        this.f272095P.b(C37722i.a(this.f272113s).v0(new x(aVar), y.f272147b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    @SuppressLint({"RestrictedApi"})
    public final void jb(boolean z12, boolean z13) {
        CheckableImageButton checkableImageButton = this.f272110p;
        checkableImageButton.setChecked(z12);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) checkableImageButton.getLayoutParams();
        View view = this.f272100f;
        Drawable drawable = this.f272084E;
        RecyclerView recyclerView = this.f272101g;
        View view2 = this.f272096b;
        if (z13) {
            D6.H(recyclerView);
            checkableImageButton.setImageDrawable(drawable);
            D6.c(this.f272110p, null, Integer.valueOf(D6.j(view2, 9)), Integer.valueOf(D6.j(view2, 12)), null, 9);
            layoutParams.removeRule(10);
            layoutParams.addRule(3, view.getId());
        } else {
            D6.w(recyclerView);
            checkableImageButton.setImageDrawable(drawable);
            D6.c(this.f272110p, null, Integer.valueOf(D6.j(view2, -1)), Integer.valueOf(D6.j(view2, 12)), null, 9);
            layoutParams.removeRule(10);
            layoutParams.addRule(3, view.getId());
        }
        checkableImageButton.requestLayout();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272092M;
        if (pVar == null || L.f(pVar.f132076k, list)) {
            return;
        }
        pVar.f132076k = list;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void kq(@Y61.k String str, @Y61.l com.avito.android.image_loader.a aVar, @Y61.l SerpBadgeBar serpBadgeBar, boolean z12, @Y61.l SellerRating sellerRating) {
        String string;
        TextView textView = this.f272116v;
        textView.setText(str);
        D6.H(textView);
        C35949t5.c(this.f272118x, aVar, null, null, null, 14);
        float f12 = z12 ? this.f272086G : this.f272087H;
        SimpleDraweeView simpleDraweeView = this.f272118x;
        com.avito.android.lib.util.v.a(simpleDraweeView, f12);
        D6.H(simpleDraweeView);
        CompactFlexibleLayout compactFlexibleLayout = this.f272117w;
        if (serpBadgeBar != null) {
            D6.H(compactFlexibleLayout);
            Q81.b.a(compactFlexibleLayout, serpBadgeBar.getBadges(), 0);
        } else {
            D6.w(compactFlexibleLayout);
        }
        Float scoreFloat = sellerRating != null ? sellerRating.getScoreFloat() : null;
        TextView textView2 = this.f272080A;
        TextView textView3 = this.f272119y;
        RatingBar ratingBar = this.f272120z;
        if (scoreFloat == null) {
            D6.w(textView3);
            D6.w(ratingBar);
            D6.w(textView2);
        } else {
            D6.H(ratingBar);
            try {
                string = this.f272091L.format(scoreFloat);
            } catch (Exception unused) {
                string = scoreFloat.toString();
            }
            I5.a(textView3, string, false);
            ratingBar.setRating(scoreFloat.floatValue());
            I5.a(textView2, sellerRating.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void l5(@Y61.l Y41.a<G0> aVar) {
        G0 g02;
        CheckableImageButton checkableImageButton = this.f272110p;
        if (aVar != null) {
            checkableImageButton.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(28, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            checkableImageButton.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f272095P.b(this.f272094O.N(m.f272135b).v0(new C8083n(pVar), o.f272137b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void q7(boolean z12, boolean z13) {
        b(!(this.f272098d.getAlpha() == this.f272089J), z12);
        if (!z13) {
            D6.c(this.f272109o, 0, 0, null, null, 12);
        } else {
            int i12 = this.f272085F;
            D6.c(this.f272109o, Integer.valueOf(i12), Integer.valueOf(i12), null, null, 12);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void sR(@Y61.k Y41.a<G0> aVar) {
        this.f272095P.b(C37722i.a(this.f272115u).v0(new c(aVar), d.f272124b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void setActive(boolean z12) {
        boolean z13 = this.f272098d.getAlpha() == this.f272090K;
        this.f272096b.setClickable(z12);
        b(z12, z13);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        PhoneLoadingState phoneLoadingState2 = PhoneLoadingState.f430441b;
        Button button = this.f272112r;
        if (phoneLoadingState == phoneLoadingState2) {
            button.setClickable(true);
            button.setOnTouchListener(null);
        } else {
            button.setClickable(false);
            button.setOnTouchListener(new Ha1.a(1));
        }
        button.setLoading(phoneLoadingState == PhoneLoadingState.f430442c);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void setTitle(@Y61.k String str) {
        this.f272102h.setText(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void t80(@Y61.l String str, @Y61.l ArrayList arrayList) {
        TextView textView = this.f272103i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        Q81.g gVar = arrayList != null ? new Q81.g(this.f272096b.getContext(), arrayList, 0, 0.0f, 0, 28, null) : null;
        if (textView != null) {
            I5.d(textView, gVar, null, 14);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f272081B.a(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void w4() {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272092M;
        if (pVar != null) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            int i12 = com.avito.android.cyclic_gallery_widget.image_carousel.p.f132065v;
            pVar.g(c42784z0, false);
        }
        D6.c(this.f272099e, null, 0, null, null, 13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void y30() {
        Button button = this.f272115u;
        button.setClickable(true);
        button.setOnTouchListener(null);
        button.setLoading(true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f272083D.a(str, z12, universalColor);
    }

    public /* synthetic */ n(View view, boolean z12, com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, RecyclerView.t tVar, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, int i12, C42822w c42822w) {
        this(view, z12, mVar, tVar, viewContext, (i12 & 32) != 0 ? null : gVar);
    }
}
