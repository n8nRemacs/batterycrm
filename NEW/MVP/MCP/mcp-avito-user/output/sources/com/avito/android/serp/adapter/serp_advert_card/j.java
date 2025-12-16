package com.avito.android.serp.adapter.serp_advert_card;

import Q81.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.cyclic_gallery_widget.GalleryBadgeDecoration;
import com.avito.android.cyclic_gallery_widget.image_carousel.ActionType;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.QuorumFilterPrice;
import com.avito.android.remote.model.TravelInstallments;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.avito.android.video_snippets.b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.jakewharton.rxbinding4.view.C37722i;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import m.C43852a;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.rating_and_reviews.RatingAndReviews;
import ru.avito.component.serp.rating_and_reviews.RatingAndReviewsColors;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;

/* compiled from: SerpAdvertRichCard.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/j;", "Lcom/avito/android/serp/adapter/serp_advert_card/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class j implements InterfaceC34849h {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final TextView f271958A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final GalleryBadgeDecoration f271959A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final ImageView f271960B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final GalleryBadgeDecoration f271961B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final TextView f271962C;

    /* renamed from: C0, reason: collision with root package name */
    public final int f271963C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final TextView f271964D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public z80.e f271965D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final View f271966E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final TextView f271967F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final TextView f271968G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final Badge f271969H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final TextView f271970I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final TextView f271971J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final TextView f271972K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final TextView f271973L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final TextView f271974M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f271975N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final View f271976O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final View f271977P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final View f271978Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final TextView f271979R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final View f271980S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final TextView f271981T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public final TextView f271982U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public final Button f271983V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f271984W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public final ImageView f271985X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public final TextView f271986Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final ImageView f271987Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final ImageView f271988a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271989b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final Q81.j f271990b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SellerInfoParams f271991c;

    /* renamed from: c0, reason: collision with root package name */
    public final float f271992c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f271993d;

    /* renamed from: d0, reason: collision with root package name */
    public final float f271994d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f271995e;

    /* renamed from: e0, reason: collision with root package name */
    public final float f271996e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f271997f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f271998f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q81.d f271999g;

    /* renamed from: g0, reason: collision with root package name */
    public final int f272000g0;

    /* renamed from: h, reason: collision with root package name */
    public final View f272001h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public final Drawable f272002h0;

    /* renamed from: i, reason: collision with root package name */
    public final View f272003i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public final Drawable f272004i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f272005j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public final RelativeLayout f272006j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f272007k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public final TextView f272008k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f272009l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public final TextView f272010l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f272011m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public final FrameLayout f272012m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final TextView f272013n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f272014n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final TextView f272015o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f272016o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f272017p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public final TextView f272018p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final TextView f272019q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public final TextView f272020q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f272021r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f272022r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f272023s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public final TextView f272024s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final ImageView f272025t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public final TextView f272026t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f272027u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cyclic_gallery_widget.image_carousel.p f272028u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f272029v;

    /* renamed from: v0, reason: collision with root package name */
    public final Resources f272030v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f272031w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f272032w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f272033x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f272034x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final TextView f272035y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f272036y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f272037z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final GalleryBadgeDecoration f272038z0;

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f272039b;

        /* JADX WARN: Multi-variable type inference failed */
        public A(Y41.l<? super String, G0> lVar) {
            this.f272039b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f272039b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final B<T> f272040b = new B<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C<T> f272041b = new C<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.r<String, Double, Double, VideoStopReason, G0> f272042b;

        /* JADX WARN: Multi-variable type inference failed */
        public D(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f272042b = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f272042b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final E<T> f272043b = new E<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final F<T> f272044b = new F<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.h;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final G<T, R> f272045b = new G<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final H<T, R> f272046b = new H<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272047b;

        /* JADX WARN: Multi-variable type inference failed */
        public I(Y41.l<? super Boolean, G0> lVar) {
            this.f272047b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            this.f272047b.invoke(bool);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final J<T> f272048b = new J<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click write error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$a, reason: case insensitive filesystem */
    public /* synthetic */ class C34850a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f272049a;

        static {
            int[] iArr = new int[PhoneLoadingState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f272049a = iArr;
            int[] iArr2 = new int[RatingAndReviewsColors.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<RatingAndReviewsColors> creator = RatingAndReviewsColors.CREATOR;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<RatingAndReviewsColors> creator2 = RatingAndReviewsColors.CREATOR;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<RatingAndReviewsColors> creator3 = RatingAndReviewsColors.CREATOR;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Parcelable.Creator<RatingAndReviewsColors> creator4 = RatingAndReviewsColors.CREATOR;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$b, reason: case insensitive filesystem */
    public static final class C34851b<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C34851b<T> f272050b = new C34851b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.b;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$c, reason: case insensitive filesystem */
    public static final class C34852c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34852c<T, R> f272051b = new C34852c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$d, reason: case insensitive filesystem */
    public static final class C34853d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34853d<T, R> f272052b = new C34853d<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$e, reason: case insensitive filesystem */
    public static final class C34854e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272053b;

        /* JADX WARN: Multi-variable type inference failed */
        public C34854e(Y41.l<? super Boolean, G0> lVar) {
            this.f272053b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            this.f272053b.invoke(bool);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$f, reason: case insensitive filesystem */
    public static final class C34855f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34855f<T> f272054b = new C34855f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click call error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$g, reason: case insensitive filesystem */
    public static final class C34856g<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C34856g<T> f272055b = new C34856g<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.c;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$h, reason: case insensitive filesystem */
    public static final class C34857h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34857h<T, R> f272056b = new C34857h<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$i, reason: case insensitive filesystem */
    public static final class C34858i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34858i<T, R> f272057b = new C34858i<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.j$j, reason: collision with other inner class name */
    public static final class C8082j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272058b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8082j(Y41.l<? super Boolean, G0> lVar) {
            this.f272058b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            this.f272058b.invoke(bool);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f272059b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click call order error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T> f272060b = new l<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.d;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$d;", "it", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$d;)Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final m<T, R> f272061b = new m<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((i.d) obj).f132021a;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272062b;

        /* JADX WARN: Multi-variable type inference failed */
        public n(Y41.l<? super DeepLink, G0> lVar) {
            this.f272062b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f272062b.invoke((DeepLink) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final o<T> f272063b = new o<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "DeepLink click error", (Throwable) obj);
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f272064b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f272065c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f272066d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f272067e;

        /* JADX WARN: Multi-variable type inference failed */
        public p(RecyclerView recyclerView, RecyclerView recyclerView2, Y41.q qVar, j jVar) {
            this.f272064b = recyclerView;
            this.f272065c = recyclerView2;
            this.f272066d = (N) qVar;
            this.f272067e = jVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View childAt = this.f272065c.getChildAt(0);
            if (childAt != null) {
                this.f272066d.invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), this.f272067e.f271993d);
            }
            this.f272064b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/serp_advert_card/j$q", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q implements z80.e {
        public q() {
        }

        @Override // z80.e
        public final void a(@Y61.l Integer num) {
            z80.e eVar = j.this.f271965D0;
            if (eVar != null) {
                eVar.a(num);
            }
        }

        @Override // z80.e
        public final void b() {
            z80.e eVar = j.this.f271965D0;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final r<T> f272069b = new r<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final s<T, R> f272070b = new s<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final t<T, R> f272071b = new t<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return -1;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f272072b;

        /* JADX WARN: Multi-variable type inference failed */
        public u(Y41.l<? super Integer, G0> lVar) {
            this.f272072b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf = null;
            }
            this.f272072b.invoke(numValueOf);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final v<T> f272073b = new v<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click image error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final w<T> f272074b = new w<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, String, G0> f272075b;

        /* JADX WARN: Multi-variable type inference failed */
        public x(Y41.p<? super String, ? super String, G0> pVar) {
            this.f272075b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f272075b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final y<T> f272076b = new y<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final z<T> f272077b = new z<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    public j(@Y61.k View view, @Y61.k RecyclerView.t tVar, @Y61.k com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, @Y61.k SellerInfoParams sellerInfoParams, @Y61.k com.avito.android.pinch_to_zoom.b bVar, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k AsyncViewportTracker.ViewContext viewContext) throws Resources.NotFoundException {
        this.f271989b = view;
        this.f271991c = sellerInfoParams;
        this.f271993d = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271995e = viewFindViewById;
        this.f271997f = (LinearLayout) view.findViewById(R.id.advert_info_container);
        Q81.d dVar = new Q81.d(view.getContext(), null, 0, 6, null);
        this.f271999g = dVar;
        ViewGroup viewGroup = (ViewGroup) view;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.rich_snippet_info_viewed_badge, viewGroup, false);
        this.f272001h = viewInflate;
        View viewInflate2 = LayoutInflater.from(view.getContext()).inflate(R.layout.rich_snippet_info_viewed_badge_str_redesign, viewGroup, false);
        this.f272003i = viewInflate2;
        this.f272005j = dVar.getBadge();
        this.f272007k = (SnippetBadgeBar) view.findViewById(R.id.badge_bar);
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272009l = (TextView) viewFindViewById2;
        this.f272011m = (LinearLayout) view.findViewById(R.id.seller_layout);
        this.f272013n = (TextView) view.findViewById(R.id.realtor_bonus);
        this.f272015o = (TextView) view.findViewById(R.id.specification);
        this.f272017p = (TextView) view.findViewById(R.id.seller);
        this.f272019q = (TextView) view.findViewById(R.id.seller_since);
        this.f272021r = (TextView) view.findViewById(R.id.verification);
        View viewFindViewById3 = view.findViewById(R.id.location);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272023s = (TextView) viewFindViewById3;
        this.f272025t = (ImageView) view.findViewById(R.id.distance_icon);
        View viewFindViewById4 = view.findViewById(R.id.distance);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272027u = (TextView) viewFindViewById4;
        this.f272029v = (TextView) view.findViewById(R.id.quorum_filter_info);
        View viewFindViewById5 = view.findViewById(R.id.price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        this.f272031w = textView;
        this.f272033x = (TextView) view.findViewById(R.id.normalized_price);
        this.f272035y = (TextView) view.findViewById(R.id.price_subtitle);
        this.f272037z = (ViewGroup) view.findViewById(R.id.buyer_bonuses_container);
        this.f271958A = (TextView) view.findViewById(R.id.buyer_bonuses_text);
        this.f271960B = (ImageView) view.findViewById(R.id.buyer_bonuses_icon);
        this.f271962C = (TextView) view.findViewById(R.id.price_without_discount);
        View viewFindViewById6 = view.findViewById(R.id.discount);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271964D = (TextView) viewFindViewById6;
        this.f271966E = view.findViewById(R.id.discount_icon);
        this.f271967F = (TextView) view.findViewById(R.id.discount_separator);
        this.f271968G = (TextView) view.findViewById(R.id.discount_percentage);
        this.f271969H = (Badge) view.findViewById(R.id.discount_percentage_badge);
        this.f271970I = (TextView) view.findViewById(R.id.date_range);
        this.f271971J = (TextView) view.findViewById(R.id.address);
        this.f271972K = (TextView) view.findViewById(R.id.multiaddresses_info);
        this.f271973L = (TextView) view.findViewById(R.id.date);
        this.f271974M = (TextView) view.findViewById(R.id.description);
        View viewFindViewById7 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f271975N = (CheckableImageButton) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.btn_call);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271976O = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.phone_loader);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271977P = viewFindViewById9;
        this.f271978Q = view.findViewById(R.id.btn_write);
        this.f271979R = (TextView) view.findViewById(R.id.call_button_text);
        this.f271980S = dVar.getHasDelivery();
        this.f271981T = (TextView) view.findViewById(R.id.delivery_terms);
        this.f271982U = (TextView) view.findViewById(R.id.additional_action);
        this.f271983V = (Button) view.findViewById(R.id.call_order_button);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hotel_rating_container);
        this.f271984W = linearLayout;
        this.f271985X = linearLayout != null ? (ImageView) linearLayout.findViewById(R.id.hotel_rating_image) : null;
        this.f271986Y = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.hotel_rating_title) : null;
        this.f271987Z = dVar.getHasRealtyLayoutBadge();
        ImageView hasVideoBadge = dVar.getHasVideoBadge();
        this.f271988a0 = hasVideoBadge;
        this.f271990b0 = new Q81.j(textView, true);
        this.f271998f0 = C35835l0.d(R.attr.green600, view.getContext());
        this.f272000g0 = C35835l0.d(R.attr.green300, view.getContext());
        this.f272002h0 = C35835l0.h(R.attr.ic_verify16, view.getContext());
        this.f272004i0 = C43852a.a(view.getContext(), R.drawable.ic_chevron_right_20);
        this.f272006j0 = (RelativeLayout) view.findViewById(R.id.developer_profile);
        this.f272008k0 = (TextView) view.findViewById(R.id.developer_title);
        this.f272010l0 = (TextView) view.findViewById(R.id.developer_subtitle);
        this.f272012m0 = (FrameLayout) view.findViewById(R.id.developer_image_layout);
        this.f272014n0 = (SimpleDraweeView) view.findViewById(R.id.developer_image);
        this.f272016o0 = (LinearLayout) view.findViewById(R.id.short_term_rent_rating_and_reviews);
        this.f272018p0 = (TextView) view.findViewById(R.id.short_term_rent_rating);
        this.f272020q0 = (TextView) view.findViewById(R.id.short_term_rent_reviews);
        this.f272022r0 = (LinearLayout) view.findViewById(R.id.travel_installments_container);
        this.f272024s0 = (TextView) view.findViewById(R.id.installments_period_payment);
        this.f272026t0 = (TextView) view.findViewById(R.id.installments_period_count);
        Resources resources = view.getResources();
        this.f272030v0 = resources;
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f272032w0 = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f272034x0 = cVar2;
        this.f272036y0 = new io.reactivex.rxjava3.disposables.c();
        View viewFindViewById10 = view.findViewById(R.id.gallery);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById10;
        PinchToZoomSource pinchToZoomSource = PinchToZoomSource.f219964c;
        Vt.g gVar2 = new Vt.g(cVar, mVar, sellerInfoParams, true, gVar, cVar2, bVar, pinchToZoomSource, new q());
        com.avito.konveyor.a aVarA = gVar2.a();
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = new com.avito.android.cyclic_gallery_widget.image_carousel.p(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, tVar, false, null, null, bVar.b(pinchToZoomSource), 112, null);
        this.f272028u0 = pVar;
        int i12 = gVar2.f17474b;
        this.f271963C0 = i12;
        GalleryBadgeDecoration.DecorationGravity decorationGravity = GalleryBadgeDecoration.DecorationGravity.f131982c;
        Integer numValueOf = Integer.valueOf(i12);
        int i13 = gVar2.f17475c;
        GalleryBadgeDecoration galleryBadgeDecoration = new GalleryBadgeDecoration(dVar, decorationGravity, C42756l.l0(new Integer[]{numValueOf, Integer.valueOf(i13)}));
        this.f271961B0 = galleryBadgeDecoration;
        pVar.a(galleryBadgeDecoration);
        GalleryBadgeDecoration.DecorationGravity decorationGravity2 = GalleryBadgeDecoration.DecorationGravity.f131981b;
        this.f272038z0 = new GalleryBadgeDecoration(viewInflate, decorationGravity2, C42756l.l0(new Integer[]{Integer.valueOf(i12), Integer.valueOf(i13)}));
        this.f271959A0 = new GalleryBadgeDecoration(viewInflate2, decorationGravity2, C42756l.l0(new Integer[]{Integer.valueOf(i12), Integer.valueOf(i13)}));
        pVar.f132066a.getLayoutParams().height = (int) (((resources.getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) * mVar.f132040a);
        hasVideoBadge.setBackground(Q81.c.a(view));
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f271994d0 = typedValue.getFloat();
        resources.getValue(R.dimen.active_alpha, typedValue, true);
        this.f271992c0 = typedValue.getFloat();
        resources.getValue(R.dimen.viewed_alpha, typedValue, true);
        this.f271996e0 = typedValue.getFloat();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Bb(@Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        SellerInfoParams.SellerInfoBlockPosition sellerInfoBlockPosition = this.f271991c.f132108d;
        if (L.f(pVar.f132077l, bVar)) {
            return;
        }
        pVar.f132077l = bVar;
        pVar.f132078m = sellerInfoBlockPosition;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void C(@Y61.l String str) {
        TextView textView = this.f271971J;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        QuorumFilterPrice price;
        TextView textView = this.f272029v;
        if (textView != null) {
            I5.a(textView, (quorumFilterInfo == null || (price = quorumFilterInfo.getPrice()) == null) ? null : price.getText(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void E0(@Y61.l String str) {
        I5.a(this.f272027u, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void FR(@Y61.l Y41.l lVar, @Y61.l DeveloperProfile developerProfile) {
        RelativeLayout relativeLayout = this.f272006j0;
        if (developerProfile == null) {
            D6.w(relativeLayout);
            return;
        }
        TextView textView = this.f272008k0;
        if (textView != null) {
            I5.d(textView, null, this.f272004i0, 11);
        }
        if (textView != null) {
            I5.e(textView, null, Integer.valueOf(androidx.core.content.d.getColor(textView.getContext(), R.color.black)), 11);
        }
        if (textView != null) {
            I5.a(textView, developerProfile.getTitle(), false);
        }
        TextView textView2 = this.f272010l0;
        if (textView2 != null) {
            I5.a(textView2, developerProfile.getSubtitle(), false);
        }
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(lVar, developerProfile));
        }
        D6.H(relativeLayout);
        lVar.invoke(developerProfile.getEntryPointShowEvent());
        Image logoURLs = developerProfile.getLogoURLs();
        FrameLayout frameLayout = this.f272012m0;
        if (logoURLs == null) {
            D6.w(frameLayout);
            return;
        }
        SimpleDraweeView simpleDraweeView = this.f272014n0;
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(developerProfile.getLogoURLs()), null, null, null, 14);
        }
        D6.H(frameLayout);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H0() {
        this.f272036y0.e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H1(@Y61.l Parcelable parcelable) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        if (parcelable != null) {
            pVar.f(parcelable);
        } else {
            pVar.e();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f271982U;
        if (textView != null) {
            textView.setOnClickListener(new i(0, aVar));
        }
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Ls(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f272032w0.N(C34851b.f272050b).d0(C34852c.f272051b), C37722i.a(this.f271976O).d0(C34853d.f272052b));
        C34854e c34854e = new C34854e(lVar);
        l41.g<? super Throwable> gVar = C34855f.f272054b;
        zVarG0.getClass();
        this.f272036y0.b(zVarG0.v0(c34854e, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void N30(@Y61.l String str, boolean z12) {
        TextView textView = this.f271968G;
        if (textView != null) {
            I5.a(textView, str, false);
        } else {
            Badge badge = this.f271969H;
            if (badge != null) {
                if (str != null) {
                    badge.setVisibility(0);
                    badge.setTitleText(str);
                } else {
                    badge.setVisibility(8);
                }
            }
        }
        FlexboxLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = textView != null ? textView.getLayoutParams() : null;
        FlexboxLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.f348442k = z12;
            layoutParams = layoutParams3;
        }
        if (layoutParams == null || textView == null) {
            return;
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        View viewFindViewById = this.f271989b.findViewById(R.id.gallery);
        if (viewFindViewById != null) {
            return ((com.avito.android.image_loader.m) kVar).a(viewFindViewById);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f272032w0.N(r.f272069b).g(i.e.class).d0(s.f272070b), C37722i.a(this.f271989b).d0(t.f272071b));
        u uVar = new u(lVar);
        l41.g<? super Throwable> gVar = v.f272073b;
        zVarG0.getClass();
        this.f272036y0.b(zVarG0.v0(uVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        TextView textView = this.f271981T;
        if (deliveryTerms == null) {
            D6.w(textView);
            return;
        }
        D6.G(textView, true);
        if (textView == null) {
            return;
        }
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f271989b.getContext();
        eVar.getClass();
        textView.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f272036y0.b(this.f272034x0.N(z.f272077b).v0(new A(lVar), B.f272040b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Ro(@Y61.l TravelInstallments travelInstallments) {
        LinearLayout linearLayout = this.f272022r0;
        if (linearLayout != null) {
            D6.G(linearLayout, travelInstallments != null);
        }
        if (travelInstallments != null) {
            Resources resources = this.f272030v0;
            TextView textView = this.f272024s0;
            if (textView != null) {
                textView.setText(resources.getString(R.string.travel_installment_payment, Integer.valueOf(travelInstallments.getPeriodPayment())));
            }
            TextView textView2 = this.f272026t0;
            if (textView2 == null) {
                return;
            }
            textView2.setText(resources.getQuantityString(R.plurals.travel_installments_count, travelInstallments.getPeriodCount(), Integer.valueOf(travelInstallments.getPeriodCount())));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Sc(@Y61.l String str) {
        TextView textView = this.f271979R;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        boolean z12 = str == null || str.length() == 0;
        View view = this.f271976O;
        if (z12) {
            if (textView != null) {
                D6.w(textView);
            }
            D6.w(view);
        } else {
            if (textView != null) {
                D6.H(textView);
            }
            D6.H(view);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void U40() {
        l0.h hVar = new l0.h();
        this.f272028u0.f132080o = new com.avito.android.serp.adapter.serp_advert_card.k(this, hVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void UN(@Y61.l RealtorBonus realtorBonus) {
        TextView textView = this.f272013n;
        if (textView != null) {
            I5.a(textView, realtorBonus != null ? realtorBonus.getText() : null, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void V(@Y61.l String str) {
        I5.a(this.f272023s, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void VH(@Y61.l Action action, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        Button button = (Button) this.f271989b.findViewById(R.id.btn_booking);
        if (button != null) {
            Integer numValueOf = null;
            com.avito.android.lib.design.button.b.a(button, action != null ? action.getTitle() : null, false);
            if (action != null) {
                String style = action.getStyle();
                if (style != null && style.length() > 0) {
                    numValueOf = Integer.valueOf(com.avito.android.lib.util.f.d(style));
                }
                if (numValueOf != null) {
                    button.setAppearanceFromAttr(numValueOf.intValue());
                }
                button.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(18, lVar, action));
            }
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void W2() {
        wd(B0.f406639b);
        D6.w(this.f271976O);
        TextView textView = this.f271979R;
        if (textView != null) {
            D6.w(textView);
        }
        D6.w(this.f271983V);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        View viewFindViewById = this.f271989b.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (D6.y(recyclerView)) {
            recyclerView.addOnLayoutChangeListener(new p(recyclerView, recyclerView, qVar, this));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Zr(@Y61.l String str, @Y61.l String str2) {
        LinearLayout linearLayout = this.f272011m;
        if (linearLayout != null) {
            D6.G(linearLayout, ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) ? false : true);
        }
        TextView textView = this.f272017p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        TextView textView2 = this.f272019q;
        if (textView2 != null) {
            I5.a(textView2, str2, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f272036y0.b(this.f272034x0.N(C.f272041b).v0(new D(rVar), E.f272043b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void aY(@Y61.l CharSequence charSequence) {
        TextView textView = this.f272015o;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
    }

    public final void b(boolean z12, boolean z13, boolean z14) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        GalleryBadgeDecoration galleryBadgeDecoration = this.f272038z0;
        pVar.d(galleryBadgeDecoration);
        GalleryBadgeDecoration galleryBadgeDecoration2 = this.f271959A0;
        pVar.d(galleryBadgeDecoration2);
        if (z12 && z13 && z14) {
            pVar.a(galleryBadgeDecoration2);
        } else if (z12 && z13) {
            pVar.a(galleryBadgeDecoration);
        } else {
            View view = this.f271995e;
            if (z12) {
                view.setAlpha(this.f271992c0);
            } else {
                view.setAlpha(this.f271994d0);
            }
        }
        Drawable drawable = this.f272002h0;
        if (z13) {
            if (drawable != null) {
                drawable.setTint(this.f272000g0);
            }
        } else if (drawable != null) {
            drawable.setTint(this.f271998f0);
        }
        TextView textView = this.f272021r;
        if (textView != null) {
            I5.d(textView, null, drawable, 11);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void b0(@Y61.l String str) {
        TextView textView = this.f271973L;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void b00(@Y61.l String str) {
        TextView textView = this.f271972K;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void d1(boolean z12) {
        D6.G(this.f271975N, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        SnippetBadgeBar snippetBadgeBar = this.f272007k;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(dVar);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dC(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor, boolean z13, boolean z14) {
        if (!z13) {
            this.f271990b0.a(str, z12, universalColor);
            return;
        }
        TextView textView = this.f272031w;
        I5.a(textView, str, false);
        View view = this.f271989b;
        if (z12) {
            textView.setBackgroundResource(R.drawable.bg_price_str_redesign);
            D6.c(this.f272031w, null, null, null, Integer.valueOf(y6.b(z14 ? 0 : 4)), 7);
            textView.setTextColor(C35835l0.d(R.attr.constantBlack, view.getContext()));
        } else {
            textView.setBackgroundResource(0);
            textView.setPadding(0, 0, 0, 0);
            D6.c(this.f272031w, null, null, null, 0, 7);
            textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dv(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        io.reactivex.rxjava3.core.z zVarD0 = this.f272032w0.N(F.f272044b).d0(G.f272045b);
        View view = this.f271978Q;
        if (view != null) {
            zVarD0 = io.reactivex.rxjava3.core.z.g0(zVarD0, C37722i.a(view).d0(H.f272046b));
        }
        I i12 = new I(lVar);
        l41.g<? super Throwable> gVar = J.f272048b;
        zVarD0.getClass();
        this.f272036y0.b(zVarD0.v0(i12, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void e1(@Y61.k com.avito.android.remote.model.badge.Badge badge) {
        TextView textView = this.f272005j;
        if (textView == null) {
            return;
        }
        D6.G(textView, true);
        Q81.c.b(textView, badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void f1(@Y61.l String str) {
        TextView textView = this.f271962C;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void fY(@Y61.l RatingAndReviews ratingAndReviews) {
        int i12;
        int i13;
        LinearLayout linearLayout = this.f272016o0;
        if (ratingAndReviews == null) {
            if (linearLayout != null) {
                D6.w(linearLayout);
                return;
            }
            return;
        }
        if (linearLayout != null) {
            D6.H(linearLayout);
        }
        TextView textView = this.f272018p0;
        if (textView != null) {
            textView.setText(ratingAndReviews.f430540b);
        }
        TextView textView2 = this.f272020q0;
        if (textView2 != null) {
            textView2.setText(ratingAndReviews.f430541c);
        }
        RatingAndReviewsColors ratingAndReviewsColors = ratingAndReviews.f430542d;
        int iOrdinal = ratingAndReviewsColors.ordinal();
        if (iOrdinal == 0) {
            i12 = R.drawable.bg_str_rating_green;
        } else if (iOrdinal == 1) {
            i12 = R.drawable.bg_str_rating_lime;
        } else if (iOrdinal == 2) {
            i12 = R.drawable.bg_str_rating_orange;
        } else if (iOrdinal == 3) {
            i12 = R.drawable.bg_str_rating_red;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.bg_str_rating_gray;
        }
        if (textView != null) {
            textView.setBackgroundResource(i12);
        }
        int iOrdinal2 = ratingAndReviewsColors.ordinal();
        if (iOrdinal2 == 0) {
            i13 = R.color.green700;
        } else if (iOrdinal2 == 1) {
            i13 = R.color.rating_color_lime;
        } else if (iOrdinal2 == 2) {
            i13 = R.color.orange700;
        } else if (iOrdinal2 == 3) {
            i13 = R.color.red700;
        } else {
            if (iOrdinal2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.color.gray44;
        }
        int color = androidx.core.content.d.getColor(this.f271989b.getContext(), i13);
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void fr(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13) {
        if (z13) {
            I5.a(this.f271964D, str, false);
            return;
        }
        com.avito.android.serp.adapter.serp_advert_card.D.a(this.f271964D, this.f272031w, str, discountIcon, (64 & 16) != 0 ? false : !z12, (64 & 32) != 0 ? false : z12, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void gs(@Y61.l String str, boolean z12) {
        TextView textView = this.f272035y;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        FlexboxLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = textView != null ? textView.getLayoutParams() : null;
        FlexboxLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.f348442k = z12;
            layoutParams = layoutParams3;
        }
        if (layoutParams == null || textView == null) {
            return;
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void h(@Y61.l String str) {
        TextView textView = this.f271974M;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        this.f272028u0.g(list, true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void k1(@Y61.l String str) {
        TextView textView = this.f272021r;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @Y61.l
    public final Parcelable k2() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        if (L.f(pVar.f132076k, list)) {
            return;
        }
        pVar.f132076k = list;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void ki(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        Button button = this.f271983V;
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f272032w0.N(C34856g.f272055b).d0(C34857h.f272056b), (button != null ? C37722i.a(button) : U.f403867b).d0(C34858i.f272057b));
        C8082j c8082j = new C8082j(lVar);
        l41.g<? super Throwable> gVar = k.f272059b;
        zVarG0.getClass();
        this.f272036y0.b(zVarG0.v0(c8082j, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void l5(@Y61.l Y41.a<G0> aVar) {
        G0 g02;
        CheckableImageButton checkableImageButton = this.f271975N;
        if (aVar != null) {
            checkableImageButton.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(27, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            checkableImageButton.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void mB(boolean z12, boolean z13, boolean z14) {
        View view = this.f271966E;
        if (view == null) {
            return;
        }
        View view2 = this.f271989b;
        int iD2 = (z13 && z14) ? com.avito.android.actions_sheet.a.d(view2, R.dimen.discount_icon_zero_padding) : z13 ? com.avito.android.actions_sheet.a.d(view2, R.dimen.discount_icon_small_padding) : com.avito.android.actions_sheet.a.d(view2, R.dimen.discount_icon_large_padding);
        if (z12) {
            view.setPadding(iD2, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        D6.G(view, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void nd(boolean z12, boolean z13) {
        boolean z14 = this.f271995e.getAlpha() == this.f271996e0;
        this.f271989b.setClickable(z12);
        b(z12, z14, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void nv(boolean z12) {
        TextView textView = this.f271967F;
        if (z12) {
            D6.H(textView);
        } else {
            D6.w(textView);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void o1(boolean z12) {
        D6.G(this.f271988a0, z12);
        this.f271961B0.f131980f = false;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void o2(@Y61.l String str) {
        TextView textView = this.f271982U;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        float f12 = 4 * this.f271989b.getResources().getDisplayMetrics().density;
        if (textView != null) {
            D6.m(textView, kotlin.math.b.b(f12));
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void oH(@Y61.l HotelRating hotelRating) {
        Integer numA;
        Context context;
        LinearLayout linearLayout = this.f271984W;
        if (linearLayout != null) {
            linearLayout.setVisibility(hotelRating != null ? 0 : 8);
        }
        if (hotelRating == null) {
            return;
        }
        String iconName = hotelRating.getIconName();
        Drawable drawableM = null;
        ImageView imageView = this.f271985X;
        if (iconName != null && (numA = com.avito.android.lib.util.q.a(iconName)) != null) {
            int iIntValue = numA.intValue();
            if (imageView != null && (context = imageView.getContext()) != null) {
                drawableM = C35835l0.m(context, iIntValue, R.attr.black);
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawableM);
        }
        if (imageView != null) {
            imageView.setVisibility(drawableM != null ? 0 : 8);
        }
        TextView textView = this.f271986Y;
        if (textView == null) {
            return;
        }
        textView.setText(hotelRating.getTitle());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void p7(@Y61.l z80.e eVar) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f272036y0.b(this.f272034x0.N(w.f272074b).v0(new x(pVar), y.f272076b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void q7(boolean z12, boolean z13) {
        b(!(this.f271995e.getAlpha() == this.f271994d0), z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void rG(@Y61.l String str, boolean z12) {
        Drawable drawableMutate;
        Drawable drawable = null;
        Integer numA = str != null ? com.avito.android.lib.util.q.a(str) : null;
        ImageView imageView = this.f272025t;
        if (numA == null) {
            if (imageView != null) {
                D6.w(imageView);
                return;
            }
            return;
        }
        if (imageView != null) {
            D6.H(imageView);
        }
        View view = this.f271989b;
        if (z12) {
            Drawable drawableH = C35835l0.h(R.attr.expected_ic_footPassengerM, view.getContext());
            if (imageView != null) {
                imageView.setImageDrawable(drawableH);
                return;
            }
            return;
        }
        ColorStateList colorStateListE = C35835l0.e(R.attr.gray36, view.getContext());
        Drawable drawableH2 = C35835l0.h(numA.intValue(), view.getContext());
        if (drawableH2 != null && (drawableMutate = drawableH2.mutate()) != null) {
            drawableMutate.setTintList(colorStateListE);
            drawable = drawableMutate;
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void rJ(@Y61.l String str) {
        TextView textView = this.f271970I;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void sa(@Y61.l String str, boolean z12) {
        TextView textView = this.f272033x;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        FlexboxLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = textView != null ? textView.getLayoutParams() : null;
        FlexboxLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.f348442k = z12;
            layoutParams = layoutParams3;
        }
        if (layoutParams == null || textView == null) {
            return;
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @SuppressLint({"RestrictedApi"})
    public final void setFavorite(boolean z12) {
        this.f271975N.setChecked(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        Object next;
        this.f271976O.setEnabled(phoneLoadingState == PhoneLoadingState.f430441b);
        int i12 = C34850a.f272049a[phoneLoadingState.ordinal()];
        View view = this.f271977P;
        TextView textView = this.f271979R;
        if (i12 == 1) {
            if (textView != null) {
                D6.g(textView);
            }
            D6.H(view);
        } else {
            if (textView != null) {
                D6.H(textView);
            }
            D6.w(view);
        }
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        ActionType actionType = ActionType.f131985d;
        Iterator<T> it = pVar.f132072g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.cyclic_gallery_widget.image_carousel.a) next).f131993a == actionType) {
                    break;
                }
            }
        }
        com.avito.android.cyclic_gallery_widget.image_carousel.a aVar = (com.avito.android.cyclic_gallery_widget.image_carousel.a) next;
        if (aVar == null || aVar.f131997e == phoneLoadingState) {
            return;
        }
        aVar.f131997e = phoneLoadingState;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f272009l, str, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void v5(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void vE(@Y61.l BuyerBonuses buyerBonuses) {
        Drawable drawableH;
        ViewGroup viewGroup = this.f272037z;
        G0 g02 = null;
        if (buyerBonuses != null) {
            D6.H(viewGroup);
            TextView textView = this.f271958A;
            if (textView != null) {
                com.avito.android.util.text.j.a(textView, buyerBonuses.getText(), null);
            }
            String name = buyerBonuses.getIcon().getName();
            if (name != null) {
                Integer numA = com.avito.android.lib.util.q.a(name);
                if (numA != null) {
                    drawableH = C35835l0.h(numA.intValue(), this.f271989b.getContext());
                } else {
                    drawableH = null;
                }
                ImageView imageView = this.f271960B;
                if (imageView != null) {
                    imageView.setImageDrawable(drawableH);
                    g02 = G0.f406611a;
                }
            }
        }
        if (g02 == null) {
            D6.w(viewGroup);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void vb(@Y61.l String str) {
        LinearLayout linearLayout = this.f272011m;
        if (linearLayout != null) {
            D6.G(linearLayout, true ^ (str == null || str.length() == 0));
        }
        TextView textView = this.f272017p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w0() {
        D6.w(this.f272005j);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w1(boolean z12) {
        D6.G(this.f271987Z, z12);
        this.f271961B0.f131980f = false;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w4() {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = com.avito.android.cyclic_gallery_widget.image_carousel.p.f132065v;
        pVar.g(c42784z0, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void wL(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f272036y0.b(this.f272032w0.N(l.f272060b).g(i.d.class).d0(m.f272061b).v0(new n(lVar), o.f272063b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set) {
        Object next;
        Object next2;
        Object next3;
        set.size();
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f272028u0;
        if (!L.f(pVar.f132072g, set)) {
            pVar.f132072g = set;
            pVar.h();
        }
        Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set2 = set;
        Iterator<T> it = set2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.cyclic_gallery_widget.image_carousel.a) next).f131993a == ActionType.f131985d) {
                    break;
                }
            }
        }
        D6.G(this.f271976O, next != null);
        View view = this.f271978Q;
        if (view != null) {
            Iterator<T> it2 = set2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (((com.avito.android.cyclic_gallery_widget.image_carousel.a) next3).f131993a == ActionType.f131987f) {
                        break;
                    }
                }
            }
            D6.G(view, next3 != null);
        }
        Iterator<T> it3 = set2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (((com.avito.android.cyclic_gallery_widget.image_carousel.a) next2).f131993a == ActionType.f131986e) {
                    break;
                }
            }
        }
        com.avito.android.cyclic_gallery_widget.image_carousel.a aVar = (com.avito.android.cyclic_gallery_widget.image_carousel.a) next2;
        String str = aVar != null ? aVar.f131994b : null;
        Button button = this.f271983V;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void z0(boolean z12) {
        D6.G(this.f271980S, z12);
        this.f271961B0.f131980f = false;
    }

    public /* synthetic */ j(View view, com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, RecyclerView.t tVar, SellerInfoParams sellerInfoParams, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, com.avito.android.pinch_to_zoom.b bVar, int i12, C42822w c42822w) {
        this(view, tVar, mVar, sellerInfoParams, bVar, (i12 & 32) != 0 ? null : gVar, viewContext);
    }
}
