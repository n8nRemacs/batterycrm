package com.avito.android.serp.adapter.constructor.rich;

import Q81.a;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cyclic_gallery_widget.GalleryBadgeDecoration;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ImageV2GalleryItemModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.util.p6;
import com.avito.android.video_snippets.b;
import com.jakewharton.rxbinding4.view.C37722i;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;
import z80.C50395a;

/* compiled from: ConstructorAdvertItemRichView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/rich/ConstructorAdvertItemRichViewImpl;", "Lcom/avito/android/serp/adapter/constructor/rich/C;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstructorAdvertItemRichViewImpl extends com.avito.android.serp.c implements com.avito.android.serp.adapter.constructor.rich.C {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f269566A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final View f269567B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f269568C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269569D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269570E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269571F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269572G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269573H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public GalleryBadgeDecoration f269574I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f269575J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f269576K;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f269577b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.common.component.adapter.b f269578c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f269579d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SellerInfoParams f269580e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public com.avito.android.cyclic_gallery_widget.image_carousel.m f269581f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f269582g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f269583h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f269584i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final R0 f269585j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f269586k;

    /* renamed from: l, reason: collision with root package name */
    public final Resources f269587l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.cyclic_gallery_widget.image_carousel.p f269588m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f269589n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f269590o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C50395a f269591p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final NoTouchEventRecyclerView f269592q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final CompactFlexibleLayout f269593r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final SnippetBadgeBar f269594s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final TextView f269595t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final View f269596u;

    /* renamed from: v, reason: collision with root package name */
    public final View f269597v;

    /* renamed from: w, reason: collision with root package name */
    public final View f269598w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f269599x;

    /* renamed from: y, reason: collision with root package name */
    public final View f269600y;

    /* renamed from: z, reason: collision with root package name */
    public final View f269601z;

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/constructor/rich/ConstructorAdvertItemRichViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f269602b;

        /* JADX WARN: Multi-variable type inference failed */
        public A(Y41.l<? super String, G0> lVar) {
            this.f269602b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f269602b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final B<T> f269603b = new B<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C<T> f269604b = new C<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.r<String, Double, Double, VideoStopReason, G0> f269605b;

        /* JADX WARN: Multi-variable type inference failed */
        public D(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f269605b = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f269605b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final E<T> f269606b = new E<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/constructor/rich/ConstructorAdvertItemRichViewImpl$F", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class F implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f269607b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f269608c;

        public F(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            this.f269607b = aVar;
            this.f269608c = aVar2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            this.f269607b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f269608c.invoke();
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$a, reason: case insensitive filesystem */
    public /* synthetic */ class C34716a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269609a;

        static {
            int[] iArr = new int[PhoneLoadingState.values().length];
            try {
                PhoneLoadingState phoneLoadingState = PhoneLoadingState.f430441b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f269609a = iArr;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$b, reason: case insensitive filesystem */
    public static final class ViewOnLayoutChangeListenerC34717b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f269610b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f269611c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.q f269612d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ConstructorAdvertItemRichViewImpl f269613e;

        public ViewOnLayoutChangeListenerC34717b(RecyclerView recyclerView, RecyclerView recyclerView2, Y41.q qVar, ConstructorAdvertItemRichViewImpl constructorAdvertItemRichViewImpl) {
            this.f269610b = recyclerView;
            this.f269611c = recyclerView2;
            this.f269612d = qVar;
            this.f269613e = constructorAdvertItemRichViewImpl;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View childAt = this.f269611c.getChildAt(0);
            if (childAt != null) {
                ((com.avito.android.serp.adapter.constructor.rich.y) this.f269612d).invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), this.f269613e.f269583h);
            }
            this.f269610b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$c, reason: case insensitive filesystem */
    public static final class C34718c<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C34718c<T> f269614b = new C34718c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$d, reason: case insensitive filesystem */
    public static final class C34719d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34719d<T, R> f269615b = new C34719d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$e, reason: case insensitive filesystem */
    public static final class C34720e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C34720e<T, R> f269616b = new C34720e<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return -1;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl$f, reason: case insensitive filesystem */
    public static final class C34721f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f269617b;

        /* JADX WARN: Multi-variable type inference failed */
        public C34721f(Y41.l<? super Integer, G0> lVar) {
            this.f269617b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf = null;
            }
            this.f269617b.invoke(numValueOf);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f269618b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click image error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f269619b = new h<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.d;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f269620b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Y41.l<? super DeepLink, G0> lVar) {
            this.f269620b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f269620b.invoke(((i.d) ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj)).f132021a);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f269621b = new j<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click deeplink error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f269622b = new k<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.b;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final l<T, R> f269623b = new l<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f269624b;

        /* JADX WARN: Multi-variable type inference failed */
        public m(Y41.l<? super Boolean, G0> lVar) {
            this.f269624b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f269624b.invoke(bool);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final n<T> f269625b = new n<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click call error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final o<T> f269626b = new o<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.c;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final p<T, R> f269627b = new p<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f269628b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(Y41.l<? super Boolean, G0> lVar) {
            this.f269628b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f269628b.invoke(bool);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final r<T> f269629b = new r<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click call order error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final s<T> f269630b = new s<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.h;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final t<T, R> f269631b = new t<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f269632b;

        /* JADX WARN: Multi-variable type inference failed */
        public u(Y41.l<? super Boolean, G0> lVar) {
            this.f269632b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f269632b.invoke(bool);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final v<T> f269633b = new v<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "Click write error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final w<T> f269634b = new w<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, String, G0> f269635b;

        /* JADX WARN: Multi-variable type inference failed */
        public x(Y41.p<? super String, ? super String, G0> pVar) {
            this.f269635b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f269635b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final y<T> f269636b = new y<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SerpAdvertRichCard", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemRichView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final z<T> f269637b = new z<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    public ConstructorAdvertItemRichViewImpl(@Y61.k View view, @Y61.k com.avito.android.beduin_shared.common.component.adapter.b bVar, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.b bVar2, @Y61.k SellerInfoParams sellerInfoParams, @Y61.k com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, @Y61.k RecyclerView.t tVar, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l RecyclerView.t tVar2, @Y61.k com.avito.android.video_snippets.g gVar, @Y61.k R0 r02, @Y61.k com.avito.android.pinch_to_zoom.b bVar3) {
        super(view);
        this.f269577b = view;
        this.f269578c = bVar;
        this.f269579d = bVar2;
        this.f269580e = sellerInfoParams;
        this.f269581f = mVar;
        this.f269582g = tVar;
        this.f269583h = viewContext;
        this.f269584i = gVar;
        this.f269585j = r02;
        this.f269586k = bVar3;
        this.f269587l = view.getResources();
        this.f269590o = new com.jakewharton.rxrelay3.c<>();
        View viewFindViewById = view.findViewById(R.id.free_form_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.NoTouchEventRecyclerView");
        }
        NoTouchEventRecyclerView noTouchEventRecyclerView = (NoTouchEventRecyclerView) viewFindViewById;
        this.f269592q = noTouchEventRecyclerView;
        View viewFindViewById2 = view.findViewById(R.id.badge_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
        }
        this.f269593r = (CompactFlexibleLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge_bar_v2);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.snippet_badge_bar.SnippetBadgeBar");
        }
        this.f269594s = (SnippetBadgeBar) viewFindViewById3;
        this.f269595t = (TextView) view.findViewById(R.id.badge_sticker);
        this.f269596u = view.findViewById(R.id.unavailable_item_gallery_alpha);
        ViewGroup viewGroup = (ViewGroup) view;
        this.f269597v = LayoutInflater.from(view.getContext()).inflate(R.layout.rich_snippet_info_viewed_badge, viewGroup, false);
        this.f269598w = LayoutInflater.from(view.getContext()).inflate(R.layout.rich_shippet_info_badges_container, viewGroup, false);
        this.f269599x = (TextView) LayoutInflater.from(view.getContext()).inflate(R.layout.rich_snippet_info_new_badge, viewGroup, false);
        this.f269600y = LayoutInflater.from(view.getContext()).inflate(R.layout.serp_rich_snippet_info_viewed_badge_str_redesign, viewGroup, false);
        this.f269601z = LayoutInflater.from(view.getContext()).inflate(R.layout.rich_shippet_info_badges_str_redesign_container, viewGroup, false);
        this.f269566A = (TextView) LayoutInflater.from(view.getContext()).inflate(R.layout.rich_snippet_info_new_badge_str_redesign, viewGroup, false);
        this.f269567B = view.findViewById(R.id.viewed_items_alpha);
        this.f269568C = new io.reactivex.rxjava3.disposables.c();
        this.f269576K = new com.jakewharton.rxrelay3.c<>();
        noTouchEventRecyclerView.setAdapter(bVar);
        noTouchEventRecyclerView.getContext();
        noTouchEventRecyclerView.setLayoutManager(new AnonymousClass1());
        if (tVar2 != null) {
            noTouchEventRecyclerView.setRecycledViewPool(tVar2);
            noTouchEventRecyclerView.setItemAnimator(null);
            noTouchEventRecyclerView.setItemViewCacheSize(10);
            RecyclerView.m layoutManager = noTouchEventRecyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.f53688E = 100;
            }
        }
        View viewFindViewById4 = view.findViewById(R.id.gallery);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f269589n = (RecyclerView) viewFindViewById4;
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void Bb(@Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar != null) {
            SellerInfoParams.SellerInfoBlockPosition sellerInfoBlockPosition = this.f269580e.f132108d;
            if (L.f(pVar.f132077l, bVar)) {
                return;
            }
            pVar.f132077l = bVar;
            pVar.f132078m = sellerInfoBlockPosition;
            pVar.h();
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void CB() {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar;
        View viewFindViewById = this.f269600y.findViewById(R.id.card_info_badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById, this.f269587l.getString(R.string.job_rich_snippet_cv_hidden), false);
        GalleryBadgeDecoration galleryBadgeDecoration = this.f269572G;
        if (galleryBadgeDecoration == null || (pVar = this.f269588m) == null) {
            return;
        }
        pVar.a(galleryBadgeDecoration);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f269577b.addOnAttachStateChangeListener(new F(aVar, aVar2));
    }

    @Override // Bu0.InterfaceC13187a
    public final void Ee(boolean z12) {
        Button button = (Button) this.f269592q.findViewWithTag("service_order_request_tag");
        if (button != null) {
            button.setLoading(z12);
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void G0(@Y61.k List<ImageV2GalleryItemModel> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar != null) {
            if (!L.f(pVar.f132074i, list) || pVar.f132067b.isEmpty()) {
                pVar.f132074i = list;
                pVar.f132083r = true;
                pVar.h();
            }
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void H0() {
        this.f269568C.e();
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void H1(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
            if (pVar != null) {
                pVar.f(parcelable);
                return;
            }
            return;
        }
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar2 = this.f269588m;
        if (pVar2 != null) {
            pVar2.e();
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void IO(boolean z12) {
        View view = this.f269596u;
        if (view == null) {
            return;
        }
        view.setVisibility(z12 ? 0 : 8);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        View viewFindViewById = this.f269577b.findViewById(R.id.gallery);
        if (viewFindViewById != null) {
            return ((com.avito.android.image_loader.m) kVar).a(viewFindViewById);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar != null) {
            pVar.f132081p = (N) lVar;
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f269590o.N(C34718c.f269614b).g(i.e.class).d0(C34719d.f269615b), C37722i.a(this.f269577b).d0(C34720e.f269616b));
        C34721f c34721f = new C34721f(lVar);
        l41.g<? super Throwable> gVar = g.f269618b;
        zVarG0.getClass();
        this.f269568C.b(zVarG0.v0(c34721f, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f269568C.b(this.f269576K.N(z.f269637b).v0(new A(lVar), B.f269603b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void S20(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f269568C.b(this.f269590o.N(k.f269622b).d0(l.f269623b).v0(new m(lVar), n.f269625b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        View viewFindViewById = this.f269577b.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (D6.y(recyclerView)) {
            recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC34717b(recyclerView, recyclerView, qVar, this));
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void a00(@Y61.l NewAdvertBadge newAdvertBadge) {
        for (TextView textView : C42745f0.U(this.f269599x, this.f269566A)) {
            if (newAdvertBadge != null) {
                Context context = textView.getContext();
                UniversalColor backgroundColor = newAdvertBadge.getStyle().getBackgroundColor();
                C48063a c48063a = C48063a.f437606a;
                c48063a.getClass();
                textView.setBackgroundTintList(C48063a.e(context, backgroundColor));
                textView.setTextColor(c48063a.a(textView.getContext(), newAdvertBadge.getStyle().getFontColor()));
                I5.a(textView, newAdvertBadge.getTitle(), false);
            } else {
                D6.w(textView);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f269568C.b(this.f269576K.N(C.f269604b).v0(new D(rVar), E.f269606b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void b6(@Y61.l BadgeSticker badgeSticker) {
        TextView textView = this.f269595t;
        if (badgeSticker == null) {
            if (textView != null) {
                D6.w(textView);
            }
        } else if (textView != null) {
            Context context = textView.getContext();
            UniversalColor backgroundColor = badgeSticker.getStyle().getBackgroundColor();
            C48063a.f437606a.getClass();
            textView.setBackgroundTintList(C48063a.e(context, backgroundColor));
            textView.setTextColor(C48063a.e(textView.getContext(), badgeSticker.getStyle().getFontColor()));
            I5.a(textView, badgeSticker.getTitle(), false);
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void b60(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f269568C.b(this.f269590o.N(o.f269626b).d0(p.f269627b).v0(new q(lVar), r.f269629b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void fQ(boolean z12) {
        View viewFindViewById = this.f269598w.findViewById(R.id.card_info_badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = this.f269601z.findViewById(R.id.card_info_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        D6.G(this.f269567B, z12);
        D6.G(textView, z12);
        D6.G((TextView) viewFindViewById2, z12);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar != null) {
            pVar.g(list, true);
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void iD(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f269568C.b(this.f269590o.N(h.f269619b).v0(new i(lVar), j.f269621b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        SV.a aVar;
        Y41.a<G0> aVar2 = this.f269575J;
        if (aVar2 != null) {
            ((com.avito.android.serp.adapter.constructor.rich.n) aVar2).invoke();
        }
        this.f269575J = null;
        H0();
        C50395a c50395a = this.f269591p;
        if (c50395a != null) {
            U.b(c50395a.f443848c.f443855c, null);
            this.f269589n.v0(c50395a);
            this.f269591p = null;
        }
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar == null || (aVar = pVar.f132079n) == null) {
            return;
        }
        aVar.b(null);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    @Y61.l
    public final Parcelable k2() {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar == null || L.f(pVar.f132076k, list)) {
            return;
        }
        pVar.f132076k = list;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void lt(@Y61.l String str) {
        View viewFindViewById = this.f269598w.findViewById(R.id.seller_online_badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = this.f269601z.findViewById(R.id.seller_online_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        if (str == null) {
            D6.w(textView);
            D6.w(textView2);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("● ".concat(str));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.d.getColor(this.itemView.getContext(), R.color.common_green_600)), 0, 1, 0);
        I5.a(textView, spannableStringBuilder, false);
        D6.H(textView);
        I5.a(textView2, spannableStringBuilder, false);
        D6.H(textView2);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void n80() {
        View viewFindViewById = this.f269600y.findViewById(R.id.card_info_badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById, this.f269587l.getString(R.string.job_rich_snippet_cv_viewed), false);
        setViewed(true);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f269568C.b(this.f269576K.N(w.f269634b).v0(new x(pVar), y.f269636b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    @Override // com.avito.android.serp.adapter.constructor.rich.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sT(@Y61.k com.avito.android.remote.model.SnippetSize r30, @Y61.l com.avito.android.remote.model.GalleryConfigModel r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, int r37, @Y61.k com.avito.android.serp.adapter.constructor.rich.i r38) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl.sT(com.avito.android.remote.model.SnippetSize, com.avito.android.remote.model.GalleryConfigModel, boolean, boolean, boolean, boolean, boolean, int, com.avito.android.serp.adapter.constructor.rich.i):void");
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        Button button = (Button) this.f269592q.findViewWithTag("button_with_loader_tag");
        if (button != null) {
            if (C34716a.f269609a[phoneLoadingState.ordinal()] == 1) {
                button.setLoading(true);
            } else {
                button.setLoading(false);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void setViewed(boolean z12) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar;
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar2;
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar3;
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar4;
        View view = this.f269567B;
        if (z12) {
            if (view != null) {
                view.setVisibility(0);
            }
            GalleryBadgeDecoration galleryBadgeDecoration = this.f269569D;
            if (galleryBadgeDecoration != null && (pVar4 = this.f269588m) != null) {
                pVar4.a(galleryBadgeDecoration);
            }
            GalleryBadgeDecoration galleryBadgeDecoration2 = this.f269572G;
            if (galleryBadgeDecoration2 == null || (pVar3 = this.f269588m) == null) {
                return;
            }
            pVar3.a(galleryBadgeDecoration2);
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        GalleryBadgeDecoration galleryBadgeDecoration3 = this.f269569D;
        if (galleryBadgeDecoration3 != null && (pVar2 = this.f269588m) != null) {
            pVar2.d(galleryBadgeDecoration3);
        }
        GalleryBadgeDecoration galleryBadgeDecoration4 = this.f269572G;
        if (galleryBadgeDecoration4 == null || (pVar = this.f269588m) == null) {
            return;
        }
        pVar.d(galleryBadgeDecoration4);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f269575J = aVar;
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void t0(@Y61.l List<SerpBadge> list) {
        List<SerpBadge> list2 = list;
        com.avito.android.constructor_advert.ui.serp.constructor.b bVar = this.f269579d;
        CompactFlexibleLayout compactFlexibleLayout = this.f269593r;
        if (list2 == null || list2.isEmpty()) {
            D6.w(compactFlexibleLayout);
            p6 p6Var = new p6(compactFlexibleLayout);
            while (p6Var.hasNext()) {
                bVar.b((View) p6Var.next());
            }
            compactFlexibleLayout.removeAllViews();
            return;
        }
        p6 p6Var2 = new p6(compactFlexibleLayout);
        while (p6Var2.hasNext()) {
            bVar.b((View) p6Var2.next());
        }
        compactFlexibleLayout.removeAllViews();
        Iterator<SerpBadge> it = list.iterator();
        while (it.hasNext()) {
            compactFlexibleLayout.addView(bVar.a(it.next(), compactFlexibleLayout.getContext()));
        }
        D6.H(compactFlexibleLayout);
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void tw(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
        NoTouchEventRecyclerView noTouchEventRecyclerView = this.f269592q;
        if (list == null) {
            noTouchEventRecyclerView.setVisibility(8);
        } else {
            noTouchEventRecyclerView.setVisibility(0);
            this.f269578c.k(list);
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set) {
        com.avito.android.cyclic_gallery_widget.image_carousel.p pVar = this.f269588m;
        if (pVar == null || L.f(pVar.f132072g, set)) {
            return;
        }
        pVar.f132072g = set;
        pVar.h();
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void wh(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f269568C.b(this.f269590o.N(s.f269630b).d0(t.f269631b).v0(new u(lVar), v.f269633b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.constructor.rich.C
    public final void z8(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f269594s.a(dVar);
    }
}
