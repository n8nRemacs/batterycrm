package com.avito.android.constructor_advert.ui.serp.constructor;

import Cr.InterfaceC13346a;
import Q81.a;
import Yt.C18324a;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.x;
import com.avito.android.cyclic_gallery_widget.item.CircularGalleryItemType;
import com.avito.android.design.widget.ClickableGalleryPager;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.android.util.p6;
import com.avito.android.util.w6;
import com.avito.android.video_snippets.b;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import j.InterfaceC42161q;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;

/* compiled from: ConstructorAdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/n;", "Lcom/avito/android/serp/c;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ConstructorAdvertItemViewImpl extends com.avito.android.serp.c implements n {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f125740x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f125741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.common.component.adapter.b f125742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f125743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public AsyncViewportTracker.ViewContext f125744e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final v f125745f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f125746g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ClickableGalleryPager f125747h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f125748i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final CompactFlexibleLayout f125749j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f125750k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f125751l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f125752m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final NoTouchEventRecyclerView f125753n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final View f125754o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final View f125755p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final View f125756q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final View f125757r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final View f125758s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f125759t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> f125760u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Vt.c f125761v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f125762w;

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125763a;

        static {
            int[] iArr = new int[PhoneLoadingState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125763a = iArr;
            int[] iArr2 = new int[BuyWithDeliveryLoadingState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BuyWithDeliveryLoadingState buyWithDeliveryLoadingState = BuyWithDeliveryLoadingState.f125735b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f125764b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ConstructorAdvertItemViewImpl f125765c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.q f125766d;

        public b(View view, ConstructorAdvertItemViewImpl constructorAdvertItemViewImpl, Y41.q qVar) {
            this.f125764b = view;
            this.f125765c = constructorAdvertItemViewImpl;
            this.f125766d = qVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            ConstructorAdvertItemViewImpl constructorAdvertItemViewImpl = this.f125765c;
            View childAt = constructorAdvertItemViewImpl.f125747h.getChildAt(0);
            if (childAt != null) {
                this.f125766d.invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), constructorAdvertItemViewImpl.f125744e);
            }
            this.f125764b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f125767b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.a;
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, String, G0> f125768b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.p<? super String, ? super String, G0> pVar) {
            this.f125768b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if (aVar != null) {
                this.f125768b.invoke(aVar.f326062a, aVar.f326063b);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f125769b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("ConstructorAdvertItemViewImpl", "onVideoError error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f125770b = new f<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.C10076b;
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f125771b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super String, G0> lVar) {
            this.f125771b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.C10076b c10076b = bVar instanceof b.C10076b ? (b.C10076b) bVar : null;
            if (c10076b != null) {
                this.f125771b.invoke(c10076b.f326064a);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f125772b = new h<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("ConstructorAdvertItemViewImpl", "onVideoStartPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/video_snippets/b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f125773b = new i<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.video_snippets.b) obj) instanceof b.c;
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.r<String, Double, Double, VideoStopReason, G0> f125774b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
            this.f125774b = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            if (cVar != null) {
                this.f125774b.invoke(cVar.f326065a, Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), cVar.f326068d);
            }
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f125775b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("ConstructorAdvertItemViewImpl", "onVideoStoppedPlaying error", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f125776l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Y41.a<G0> aVar) {
            super(0);
            this.f125776l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f125776l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl$m", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f125777b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f125778c;

        public m(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            this.f125777b = aVar;
            this.f125778c = aVar2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            V2.f318762a.c("ConstructorAdvertItemViewImpl", "ConstructorAdvertItemView onViewAttachedToWindow " + this, null);
            this.f125777b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            V2.f318762a.c("BeduinButtonComponent", "ConstructorAdvertItemView onViewDetachedFromWindow " + this, null);
            this.f125778c.invoke();
        }
    }

    public ConstructorAdvertItemViewImpl(@Y61.k View view, @Y61.k InterfaceC13346a interfaceC13346a, @Y61.k com.avito.android.beduin_shared.common.component.adapter.b bVar, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.b bVar2, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l v vVar, @InterfaceC42161q @Y61.l Integer num, @Y61.l RecyclerView.t tVar, boolean z12) {
        super(view);
        this.f125741b = view;
        this.f125742c = bVar;
        this.f125743d = bVar2;
        this.f125744e = viewContext;
        this.f125745f = vVar;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f125746g = constraintLayout;
        View viewFindViewById2 = view.findViewById(R.id.image_pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.design.widget.ClickableGalleryPager");
        }
        this.f125747h = (ClickableGalleryPager) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.page_indicator);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125748i = (TextView) viewFindViewById3;
        this.f125749j = (CompactFlexibleLayout) view.findViewById(R.id.badge_bar);
        this.f125750k = (SnippetBadgeBar) view.findViewById(R.id.badge_bar_v2);
        this.f125751l = (TextView) view.findViewById(R.id.badge_sticker);
        View viewFindViewById4 = view.findViewById(R.id.card_info_badge);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f125752m = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.free_form_recycler_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.NoTouchEventRecyclerView");
        }
        NoTouchEventRecyclerView noTouchEventRecyclerView = (NoTouchEventRecyclerView) viewFindViewById5;
        this.f125753n = noTouchEventRecyclerView;
        this.f125754o = view.findViewById(R.id.viewed_items_alpha);
        this.f125755p = view.findViewById(R.id.delivery);
        this.f125756q = view.findViewById(R.id.has_realty_layout);
        this.f125757r = view.findViewById(R.id.has_video);
        this.f125758s = view.findViewById(R.id.hidden_stub);
        this.f125759t = new io.reactivex.rxjava3.disposables.c();
        com.jakewharton.rxrelay3.c<com.avito.android.video_snippets.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f125760u = cVar;
        View viewFindViewById6 = view.findViewById(R.id.advert_content);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f125761v = new Vt.c(viewFindViewById6, new EnumMap(P0.e(new Q(CircularGalleryItemType.f132169b, new Yt.d(R.layout.constructor_advert_image_page, interfaceC13346a.getF268498a(), num != null ? Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(num.intValue())) : null)), new Q(CircularGalleryItemType.f132171d, new Yt.e(gVar, cVar)), new Q(CircularGalleryItemType.f132170c, new C18324a(true, num != null ? Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(num.intValue())) : null)), new Q(CircularGalleryItemType.f132172e, new Yt.b(true, gVar, cVar)))));
        if (z12) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), 0, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        }
        noTouchEventRecyclerView.setAdapter(bVar);
        noTouchEventRecyclerView.getContext();
        noTouchEventRecyclerView.setLayoutManager(new AnonymousClass1());
        if (tVar != null) {
            noTouchEventRecyclerView.setRecycledViewPool(tVar);
            noTouchEventRecyclerView.setItemAnimator(null);
            noTouchEventRecyclerView.setItemViewCacheSize(10);
            RecyclerView.m layoutManager = noTouchEventRecyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.f53688E = 100;
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f125741b.addOnAttachStateChangeListener(new m(aVar, aVar2));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Dm(boolean z12) {
        View view = this.f125756q;
        if (view != null) {
            D6.G(view, z12);
        }
    }

    @Override // Bu0.InterfaceC13187a
    public final void Ee(boolean z12) {
        Button button = (Button) this.f125753n.findViewWithTag("service_order_request_tag");
        if (button != null) {
            button.setLoading(z12);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Fd(int i12, @Y61.k List list) throws Resources.NotFoundException {
        Vt.c cVar = this.f125761v;
        cVar.a(list, true);
        cVar.f17465b.x(cVar.f17467d.b(i12), false);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Id(boolean z12) {
        this.f125747h.setSkipTouchEventToParent(z12);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.a
    public final void Jw(@Y61.k BuyWithDeliveryLoadingState buyWithDeliveryLoadingState) {
        Button button = (Button) this.f125753n.findViewWithTag("buy_with_delivery_tag");
        if (button != null) {
            int iOrdinal = buyWithDeliveryLoadingState.ordinal();
            if (iOrdinal == 0) {
                button.setLoading(false);
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                button.setLoading(true);
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f125747h);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Q3(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f125759t.b(this.f125760u.N(c.f125767b).v0(new d(pVar), e.f125769b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f125759t.b(this.f125760u.N(f.f125770b).v0(new g(lVar), h.f125772b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Tw(boolean z12) {
        View view = this.f125757r;
        if (view != null) {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Y4() {
        TextView textView = this.f125752m;
        I5.a(textView, textView.getContext().getText(R.string.reserved_badge_text), false);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        ClickableGalleryPager clickableGalleryPager = this.f125747h;
        if (D6.y(clickableGalleryPager)) {
            clickableGalleryPager.addOnLayoutChangeListener(new b(clickableGalleryPager, this, qVar));
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void Zc(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        ClickableGalleryPager clickableGalleryPager = this.f125747h;
        ViewGroup.LayoutParams layoutParams = clickableGalleryPager.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
        clickableGalleryPager.setLayoutParams(layoutParams);
        this.f125744e = viewContext;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f125759t.b(this.f125760u.N(i.f125773b).v0(new j(rVar), k.f125775b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void b6(@Y61.l BadgeSticker badgeSticker) {
        TextView textView = this.f125751l;
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f125741b.setOnClickListener(new com.avito.android.component.user_hat.items.k(3, aVar));
        this.f125761v.b(new l(aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        V2.f318762a.c("ConstructorAdvertItemViewImpl", "ConstructorAdvertItemView onUnbind " + this, null);
        Y41.a<G0> aVar = this.f125762w;
        if (aVar != null) {
            ((x.b) aVar).invoke();
        }
        this.f125762w = null;
        this.f125759t.e();
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void k5(boolean z12, boolean z13) {
        View view = this.f125758s;
        if (view == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f125746g;
        if (!z12) {
            D6.w(view);
            D6.H(constraintLayout);
            return;
        }
        D6.H(view);
        if (!z13) {
            view.setAlpha(1.0f);
            D6.g(constraintLayout);
        } else {
            view.setAlpha(0.0f);
            ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(200L);
            w6.a(duration, new o(this));
            duration.start();
        }
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        Button button = (Button) this.f125753n.findViewWithTag("button_with_loader_tag");
        if (button != null) {
            if (a.f125763a[phoneLoadingState.ordinal()] == 1) {
                button.setLoading(true);
            } else {
                button.setLoading(false);
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void setViewed(boolean z12) {
        TextView textView = this.f125752m;
        View view = this.f125754o;
        if (z12) {
            if (view != null) {
                view.setVisibility(0);
            }
            I5.a(textView, textView.getContext().getText(R.string.viewed_title), false);
        } else {
            if (view != null) {
                view.setVisibility(8);
            }
            D6.w(textView);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f125762w = aVar;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void t0(@Y61.l List<SerpBadge> list) {
        CompactFlexibleLayout compactFlexibleLayout = this.f125749j;
        if (compactFlexibleLayout == null) {
            return;
        }
        List<SerpBadge> list2 = list;
        com.avito.android.constructor_advert.ui.serp.constructor.b bVar = this.f125743d;
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void w8(boolean z12) {
        TextView textView = this.f125748i;
        ClickableGalleryPager clickableGalleryPager = this.f125747h;
        if (z12) {
            clickableGalleryPager.setVisibility(0);
            textView.setVisibility(0);
        } else {
            clickableGalleryPager.setVisibility(8);
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void x7(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f125761v.f17470g = (N) lVar;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public void xj(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.l SnippetSize snippetSize, @Y61.l SerpDisplayType serpDisplayType) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = this.f125746g;
        dVar.g(constraintLayout);
        SnippetSize snippetSize2 = SnippetSize.SMALL;
        Integer numValueOf = null;
        v vVar = this.f125745f;
        if (snippetSize == snippetSize2 && serpDisplayType == SerpDisplayType.List) {
            dVar.i(R.id.image_pager, 4, 0, 4);
            dVar.f(R.id.image_pager, 7);
            dVar.l(R.id.free_form_recycler_view, 0);
            dVar.k(R.id.free_form_recycler_view, -2);
            dVar.i(R.id.free_form_recycler_view, 6, R.id.image_pager, 7);
            dVar.i(R.id.free_form_recycler_view, 7, 0, 7);
            dVar.i(R.id.free_form_recycler_view, 3, 0, 3);
            if (vVar != null) {
                numValueOf = Integer.valueOf(vVar.f125833a);
            }
        } else {
            dVar.i(R.id.image_pager, 7, 0, 7);
            dVar.f(R.id.image_pager, 4);
            dVar.l(R.id.free_form_recycler_view, 0);
            dVar.k(R.id.free_form_recycler_view, -2);
            dVar.i(R.id.free_form_recycler_view, 6, 0, 6);
            dVar.i(R.id.free_form_recycler_view, 7, 0, 7);
            dVar.i(R.id.free_form_recycler_view, 3, R.id.image_pager, 4);
            if (vVar != null) {
                numValueOf = 0;
            }
        }
        dVar.c(constraintLayout);
        NoTouchEventRecyclerView noTouchEventRecyclerView = this.f125753n;
        if (numValueOf != null) {
            noTouchEventRecyclerView.setPaddingRelative(numValueOf.intValue(), noTouchEventRecyclerView.getPaddingTop(), noTouchEventRecyclerView.getPaddingEnd(), noTouchEventRecyclerView.getPaddingBottom());
        }
        if (list == null) {
            noTouchEventRecyclerView.setVisibility(8);
        } else {
            noTouchEventRecyclerView.setVisibility(0);
            this.f125742c.k(list);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void z0(boolean z12) {
        View view = this.f125755p;
        if (view != null) {
            D6.G(view, z12);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void z8(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        SnippetBadgeBar snippetBadgeBar = this.f125750k;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(dVar);
        }
    }

    public /* synthetic */ ConstructorAdvertItemViewImpl(View view, InterfaceC13346a interfaceC13346a, com.avito.android.beduin_shared.common.component.adapter.b bVar, com.avito.android.constructor_advert.ui.serp.constructor.b bVar2, com.avito.android.video_snippets.g gVar, AsyncViewportTracker.ViewContext viewContext, v vVar, Integer num, RecyclerView.t tVar, boolean z12, int i12, C42822w c42822w) {
        this(view, interfaceC13346a, bVar, bVar2, gVar, viewContext, (i12 & 64) != 0 ? null : vVar, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : tVar, z12);
    }
}
