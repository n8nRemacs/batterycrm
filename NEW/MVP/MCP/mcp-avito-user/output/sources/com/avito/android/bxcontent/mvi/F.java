package com.avito.android.bxcontent.mvi;

import Rj.C15047a;
import cD.C27005a;
import com.avito.android.B2;
import com.avito.android.C36135w2;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.FeedId;
import com.avito.android.cross_category.CrossCategoryWidget;
import com.avito.android.home.o;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.location.InterfaceC31506h;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.EmptySearchContent;
import com.avito.android.remote.model.HomeTabItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarConfigElement;
import com.avito.android.remote.model.converters.SharingButtonConverter;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import com.avito.android.serp.adapter.InterfaceC34742k0;
import com.avito.android.serp.adapter.LayoutType;
import com.avito.android.serp.adapter.ad.SerpProfilePromoBannerItem;
import com.avito.android.serp.adapter.beduin_v2.BeduinV2Content;
import com.avito.android.serp.adapter.beduin_v2.BeduinV2Element;
import com.avito.android.serp.adapter.empty_search.EmptySearchElement;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.search_bar.InterfaceC34822a;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedTabsItem;
import com.avito.android.serp.adapter.warning.SerpWarningItem;
import com.avito.android.serp.warning.WarningState;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import com.avito.android.util.C35838l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import jl.C42394a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lr0.InterfaceC43821a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import sZ.AbstractC48135a;
import sZ.InterfaceC48136b;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/F;", "Lcom/avito/android/bxcontent/mvi/C;", "Lcom/avito/android/location/h;", "Lcom/avito/android/search/h;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class F implements C, InterfaceC31506h, com.avito.android.search.h {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f111263P = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30995b f111264A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.carousel_items.domain.a f111265B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f111266C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48136b f111267D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.o f111268E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final h31.e<AK0.l> f111269F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final h31.e<C27005a> f111270G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.main_start_onboarding.a f111271H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final C42394a f111272I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<String> f111273J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C35838l3 f111274K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.q f111275L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C15047a f111276M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f111277N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.brand_global_rubricator.c f111278O;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34323k> f111279a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.i f111280b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.Y0 f111281c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f111282d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.shortcut_navigation_bar.j0 f111283e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.mini_menu.o f111284f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.visual_rubricator.N f111285g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SharingButtonConverter f111286h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.search_bar_promo_widget.a f111287i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hero_banner.widget.d f111288j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.search_bar_promo_widget.m f111289k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final La.j f111290l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31506h f111291m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f111292n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f111293o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.U0 f111294p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f111295q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.h f111296r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.warning.f f111297s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.analytics.a f111298t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.business360.a f111299u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34822a f111300v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f111301w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final B2 f111302x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Ig.c f111303y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.n f111304z;

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/bxcontent/mvi/F$a;", "", "<init>", "()V", "", "CAMPAIGN_ID", "Ljava/lang/String;", "GROUP_ID", "LANDING_SOURCE", "LAUNCH_ID", "NOTIFICATION_ID", "NOTIFICATION_MESSAGE_ID", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111305a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.SERP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111305a = iArr;
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LsZ/a;", "popupType", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(LsZ/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getUnreadMessagesTooltipAfterBackground$1", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<AbstractC48135a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f111306q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = F.this.new c(continuation);
            cVar.f111306q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC48135a abstractC48135a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
            return ((c) create(abstractC48135a, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AbstractC48135a abstractC48135a = (AbstractC48135a) this.f111306q;
            if (abstractC48135a instanceof AbstractC48135a.b) {
                AbstractC48135a.b bVar = (AbstractC48135a.b) abstractC48135a;
                F.this.f111275L.d(new BxOnboardingStep.View.Tooltip(NavigationTab.f106973i, bVar.f437723a, bVar.f437724b, bVar.f437725c, null, 16, null));
            } else {
                kotlin.jvm.internal.L.f(abstractC48135a, AbstractC48135a.C12619a.f437722a);
            }
            return C43175k.w();
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LsZ/a;", "popupType", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(LsZ/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getUnreadMessagesTooltipAfterBackground$2", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<AbstractC48135a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f111308q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = F.this.new d(continuation);
            dVar.f111308q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC48135a abstractC48135a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
            return ((d) create(abstractC48135a, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AbstractC48135a abstractC48135a = (AbstractC48135a) this.f111308q;
            if (abstractC48135a instanceof AbstractC48135a.b) {
                F f12 = F.this;
                if (f12.f111271H.isRunning()) {
                    f12.f111271H.b(new MainStartOnboardingStep.Tooltip(NavigationTab.f106973i, ((AbstractC48135a.b) abstractC48135a).f437723a, null, 4, null));
                } else {
                    o.a.a(f12.f111268E, NavigationTab.f106973i, ((AbstractC48135a.b) abstractC48135a).f437723a, null, 12);
                }
            } else {
                kotlin.jvm.internal.L.f(abstractC48135a, AbstractC48135a.C12619a.f437722a);
            }
            return C43175k.w();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public F(@Y61.k h31.e<InterfaceC34323k> eVar, @Y61.k com.avito.android.serp.i iVar, @Y61.k com.avito.android.serp.adapter.Y0 y02, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k com.avito.android.shortcut_navigation_bar.j0 j0Var, @Y61.k com.avito.android.serp.adapter.mini_menu.o oVar, @Y61.k com.avito.android.visual_rubricator.N n12, @Y61.k SharingButtonConverter sharingButtonConverter, @Y61.k com.avito.android.bxcontent.search_bar_promo_widget.a aVar, @Y61.k com.avito.android.hero_banner.widget.d dVar, @Y61.k com.avito.android.bxcontent.search_bar_promo_widget.m mVar, @Y61.k La.j jVar, @Y61.k InterfaceC31506h interfaceC31506h, @Y61.k com.avito.android.advertising.loaders.n nVar, @Y61.k com.avito.android.advertising.loaders.j jVar2, @Y61.k com.avito.android.bxcontent.U0 u02, @Y61.k com.avito.android.util.R0 r02, @Y61.k com.avito.android.search.h hVar, @Y61.k com.avito.android.serp.warning.f fVar, @Y61.k com.avito.android.bxcontent.analytics.a aVar2, @Y61.k com.avito.android.bxcontent.business360.a aVar3, @Y61.k InterfaceC34822a interfaceC34822a, @Y61.k C36135w2 c36135w2, @Y61.k B2 b22, @Y61.k Ig.c cVar, @Y61.k com.avito.android.advertising.kebab.n nVar2, @Y61.k InterfaceC30995b interfaceC30995b, @Y61.k com.avito.android.carousel_items.domain.a aVar4, @Y61.k com.avito.android.connection_quality.connectivity.a aVar5, @Y61.k InterfaceC48136b interfaceC48136b, @Y61.k com.avito.android.home.o oVar2, @Y61.k h31.e<AK0.l> eVar2, @Y61.k h31.e<C27005a> eVar3, @Y61.k com.avito.android.main_start_onboarding.a aVar6, @Y61.k C42394a c42394a, @Y61.k Set<String> set, @Y61.k C35838l3 c35838l3, @Y61.k com.avito.android.onboarding.q qVar, @Y61.k C15047a c15047a, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k com.avito.android.brand_global_rubricator.c cVar2) {
        this.f111279a = eVar;
        this.f111280b = iVar;
        this.f111281c = y02;
        this.f111282d = searchParamsConverter;
        this.f111283e = j0Var;
        this.f111284f = oVar;
        this.f111285g = n12;
        this.f111286h = sharingButtonConverter;
        this.f111287i = aVar;
        this.f111288j = dVar;
        this.f111289k = mVar;
        this.f111290l = jVar;
        this.f111291m = interfaceC31506h;
        this.f111292n = nVar;
        this.f111293o = jVar2;
        this.f111294p = u02;
        this.f111295q = r02;
        this.f111296r = hVar;
        this.f111297s = fVar;
        this.f111298t = aVar2;
        this.f111299u = aVar3;
        this.f111300v = interfaceC34822a;
        this.f111301w = c36135w2;
        this.f111302x = b22;
        this.f111303y = cVar;
        this.f111304z = nVar2;
        this.f111264A = interfaceC30995b;
        this.f111265B = aVar4;
        this.f111266C = aVar5;
        this.f111267D = interfaceC48136b;
        this.f111268E = oVar2;
        this.f111269F = eVar2;
        this.f111270G = eVar3;
        this.f111271H = aVar6;
        this.f111272I = c42394a;
        this.f111273J = set;
        this.f111274K = c35838l3;
        this.f111275L = qVar;
        this.f111276M = c15047a;
        this.f111277N = interfaceC49101b;
        this.f111278O = cVar2;
    }

    public static final boolean H(F f12, BxContentResult bxContentResult, int i12) {
        f12.getClass();
        return (bxContentResult.getItems().isEmpty() || (bxContentResult.getItems().size() == 1 && (C42745f0.E(bxContentResult.getItems()) instanceof CrossCategoryWidget))) && i12 <= 1;
    }

    public static final NavigationBarStyle I(F f12, NavigationBarStyle navigationBarStyle, C.b bVar) {
        NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding;
        if (!f12.f111274K.f318922a) {
            return navigationBarStyle;
        }
        NavigationBarStyle.NavigationIconOnboarding navigationIconOnboardingCopy$default = null;
        if (!C35800g5.c(new C35792f5(bVar.f111217i)) || navigationBarStyle == null) {
            return null;
        }
        C15047a c15047a = f12.f111276M;
        c15047a.getClass();
        kotlin.reflect.n<Object> nVar = C15047a.f14573m[8];
        if (((Boolean) c15047a.f14582j.a().invoke()).booleanValue() && (navigationIconOnboarding = navigationBarStyle.getNavigationIconOnboarding()) != null) {
            navigationIconOnboardingCopy$default = NavigationBarStyle.NavigationIconOnboarding.copy$default(navigationIconOnboarding, null, null, null, f12.f111294p.i(), null, null, null, 119, null);
        }
        return NavigationBarStyle.copy$default(navigationBarStyle, null, null, null, null, null, null, navigationIconOnboardingCopy$default, NavigationBarStyle.DisplayType.SearchInput.INSTANCE, 31, null);
    }

    public static final FloatingPromoWidgetItem J(F f12, List list) {
        C36135w2 c36135w2 = f12.f111301w;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[15];
        if (!((Boolean) c36135w2.f327493n.a().invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FloatingPromoWidgetItem) {
                arrayList.add(obj);
            }
        }
        return (FloatingPromoWidgetItem) C42745f0.G(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.serp.adapter.l1 K(com.avito.android.bxcontent.mvi.F r10, java.util.ArrayList r11, com.avito.android.remote.model.SerpDisplayType r12, java.lang.String r13, boolean r14) {
        /*
            r10.getClass()
            java.util.Iterator r11 = r11.iterator()
        L7:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.Object r0 = r11.next()
            r2 = r0
            com.avito.android.remote.model.SerpElement r2 = (com.avito.android.remote.model.SerpElement) r2
            boolean r3 = r2 instanceof com.avito.android.remote.model.HeaderToolbarElement
            if (r3 == 0) goto L7
            com.avito.android.remote.model.HeaderToolbarElement r2 = (com.avito.android.remote.model.HeaderToolbarElement) r2
            boolean r2 = r2.getShowInHeaderToolbar()
            if (r2 == 0) goto L7
            goto L23
        L22:
            r0 = r1
        L23:
            r11 = r0
            com.avito.android.remote.model.SerpElement r11 = (com.avito.android.remote.model.SerpElement) r11
            boolean r2 = r11 instanceof com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget
            if (r2 == 0) goto L4f
            if (r14 == 0) goto L4e
            com.avito.android.B2 r2 = r10.f111302x
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.B2.f67184X
            r4 = 50
            r3 = r3[r4]
            com.avito.android.A0$a r2 = r2.f67207W
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4e
            boolean r11 = r11 instanceof com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget
            if (r11 == 0) goto L4e
            goto L4f
        L4e:
            r0 = r1
        L4f:
            com.avito.android.remote.model.SerpElement r0 = (com.avito.android.remote.model.SerpElement) r0
            if (r0 == 0) goto L6b
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r6 = 0
            r9 = 104(0x68, float:1.46E-43)
            com.avito.android.serp.i r2 = r10.f111280b
            r8 = 0
            r4 = r12
            r5 = r13
            r7 = r14
            java.util.List r10 = com.avito.android.serp.i.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r10 = kotlin.collections.C42745f0.G(r10)
            r1 = r10
            com.avito.android.serp.adapter.l1 r1 = (com.avito.android.serp.adapter.l1) r1
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.F.K(com.avito.android.bxcontent.mvi.F, java.util.ArrayList, com.avito.android.remote.model.SerpDisplayType, java.lang.String, boolean):com.avito.android.serp.adapter.l1");
    }

    public static final ToolbarConfig L(F f12, ArrayList arrayList) {
        f12.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ToolbarConfigElement) {
                arrayList2.add(obj);
            }
        }
        ToolbarConfigElement toolbarConfigElement = (ToolbarConfigElement) C42745f0.G(arrayList2);
        if (toolbarConfigElement != null) {
            return toolbarConfigElement.getToolbarConfig();
        }
        return null;
    }

    public static final List M(F f12, List list) {
        C36135w2 c36135w2 = f12.f111301w;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[6];
        if (((Boolean) c36135w2.f327487h.a().invoke()).booleanValue()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((l1) obj) instanceof Ig.d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final SerpElement p(F f12, BxContentResult bxContentResult) {
        f12.getClass();
        EmptySearchContent emptySearchContent = bxContentResult.getEmptySearchContent();
        BeduinV2 beduinV2 = emptySearchContent != null ? emptySearchContent.getBeduinV2() : null;
        if (beduinV2 != null) {
            return new BeduinV2Element(UUID.randomUUID().toString(), new BeduinV2Content(beduinV2.getJson()));
        }
        String emptySearchText = bxContentResult.getEmptySearchText();
        if (emptySearchText == null) {
            emptySearchText = f12.f111294p.h();
        }
        return new EmptySearchElement(UUID.randomUUID().toString(), emptySearchText, null, null, 12, null);
    }

    public static final com.avito.android.bxcontent.mvi.entity.s q(F f12, List list, BxContentResult bxContentResult) {
        Object next;
        Object next2;
        Object next3;
        FeaturedWidget featuredWidget;
        f12.getClass();
        Iterator<T> it = bxContentResult.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof FeaturedWidget) {
                break;
            }
        }
        if (!(next instanceof FeaturedWidget)) {
            next = null;
        }
        FeaturedWidget featuredWidget2 = (FeaturedWidget) next;
        if (featuredWidget2 == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof FeaturedTabsItem) {
                break;
            }
        }
        if (!(next2 instanceof FeaturedTabsItem)) {
            next2 = null;
        }
        FeaturedTabsItem featuredTabsItem = (FeaturedTabsItem) next2;
        if (featuredTabsItem == null) {
            return null;
        }
        List<FeaturedNavigation> list2 = featuredTabsItem.f272881c;
        int iF2 = kotlin.collections.P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (FeaturedNavigation featuredNavigation : list2) {
            String f272877b = featuredNavigation.getF272877b();
            C27005a c27005a = f12.f111270G.get();
            String f272877b2 = featuredNavigation.getF272877b();
            c27005a.getClass();
            if (kotlin.jvm.internal.L.f(featuredWidget2.getTitle(), f272877b2)) {
                featuredWidget = featuredWidget2;
            } else {
                Iterator<T> it3 = featuredWidget2.getAdditionalTabs().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (kotlin.jvm.internal.L.f(((FeaturedWidget) next3).getTitle(), f272877b2)) {
                        break;
                    }
                }
                featuredWidget = (FeaturedWidget) next3;
            }
            linkedHashMap.put(f272877b, featuredWidget == null ? C42784z0.f406748b : C42745f0.w(c27005a.f57794a.a(featuredWidget, featuredTabsItem.f272890l, null), 1));
        }
        return new com.avito.android.bxcontent.mvi.entity.s(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    public static final FeedId r(F f12, List list) {
        String str;
        Object next;
        Object next2;
        List<SectionTag> list2;
        SectionTag sectionTag;
        List<SectionTag> list3;
        SectionTag sectionTag2;
        ?? r32;
        HomeTabItem homeTabItem;
        f12.getClass();
        List list4 = list;
        Iterator it = list4.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((l1) next) instanceof com.avito.android.serp.adapter.home_section_tab.a) {
                break;
            }
        }
        com.avito.android.serp.adapter.home_section_tab.a aVar = next instanceof com.avito.android.serp.adapter.home_section_tab.a ? (com.avito.android.serp.adapter.home_section_tab.a) next : null;
        String feedId = (aVar == null || (r32 = aVar.f270159b) == 0 || (homeTabItem = (HomeTabItem) C42745f0.G(r32)) == null) ? null : homeTabItem.getFeedId();
        Iterator it2 = list4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((l1) next2) instanceof SectionTagsItem) {
                break;
            }
        }
        SectionTagsItem sectionTagsItem = next2 instanceof SectionTagsItem ? (SectionTagsItem) next2 : null;
        String str2 = (sectionTagsItem == null || (list3 = sectionTagsItem.f270152d) == null || (sectionTag2 = (SectionTag) C42745f0.G(list3)) == null) ? null : sectionTag2.f270145c;
        if (sectionTagsItem != null && (list2 = sectionTagsItem.f270152d) != null && (sectionTag = (SectionTag) C42745f0.G(list2)) != null) {
            str = sectionTag.f270147e;
        }
        List listV = C42745f0.V(str);
        if (feedId == null) {
            feedId = str2;
        }
        return new FeedId(feedId, listV);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(com.avito.android.bxcontent.mvi.F r22, java.util.List r23, com.avito.android.AnalyticParams r24, java.util.List r25, java.lang.String r26, java.lang.String r27, com.avito.android.remote.model.SerpDisplayType r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.avito.android.serp.adapter.LayoutType r33, java.lang.String r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.F.w(com.avito.android.bxcontent.mvi.F, java.util.List, com.avito.android.AnalyticParams, java.util.List, java.lang.String, java.lang.String, com.avito.android.remote.model.SerpDisplayType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.avito.android.serp.adapter.LayoutType, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final SearchParams N(SearchParams searchParams, String str) {
        SearchParams empty = searchParams == null ? SearchParams.INSTANCE.getEMPTY() : searchParams;
        if (!kotlin.jvm.internal.L.f(str, empty.getLocationId())) {
            empty = empty.copy(((-1234173943) & 1) != 0 ? empty.categoryId : null, ((-1234173943) & 2) != 0 ? empty.geoCoords : null, ((-1234173943) & 4) != 0 ? empty.locationId : str, ((-1234173943) & 8) != 0 ? empty.suggestLocationId : null, ((-1234173943) & 16) != 0 ? empty.metroIds : null, ((-1234173943) & 32) != 0 ? empty.directionId : null, ((-1234173943) & 64) != 0 ? empty.districtId : null, ((-1234173943) & 128) != 0 ? empty.params : null, ((-1234173943) & 256) != 0 ? empty.priceMax : null, ((-1234173943) & 512) != 0 ? empty.priceMin : null, ((-1234173943) & 1024) != 0 ? empty.query : null, ((-1234173943) & 2048) != 0 ? empty.title : null, ((-1234173943) & 4096) != 0 ? empty.owner : null, ((-1234173943) & 8192) != 0 ? empty.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? empty.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? empty.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? empty.radius : null, ((-1234173943) & 131072) != 0 ? empty.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? empty.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? empty.localPriority : null, ((-1234173943) & 1048576) != 0 ? empty.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? empty.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? empty.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? empty.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? empty.sellerId : null, ((-1234173943) & 33554432) != 0 ? empty.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? empty.displayType : null, ((-1234173943) & 134217728) != 0 ? empty.shopId : null, ((-1234173943) & 268435456) != 0 ? empty.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? empty.area : null, ((-1234173943) & 1073741824) != 0 ? empty.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? empty.clarifyIconType : null, (0 & 1) != 0 ? empty.drawId : null);
        }
        this.f111300v.d(empty);
        return empty;
    }

    public final C43152f0 O(List list, SerpDisplayType serpDisplayType, int i12, Y41.l lVar, Y41.l lVar2) {
        com.avito.android.advertising.loaders.n nVar = this.f111292n;
        if (i12 <= 1) {
            nVar.a();
        }
        int iB2 = nVar.b(list.size());
        long jD2 = nVar.d();
        List list2 = list;
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            l1 l1Var = (l1) obj;
            if ((l1Var instanceof gr0.d) && ((gr0.d) l1Var).getIsEmbedded()) {
                if (l1Var instanceof SerpProfilePromoBannerItem) {
                    ((SerpProfilePromoBannerItem) l1Var).setHidden(this.f111304z.e((com.avito.android.advertising.i) l1Var));
                }
                if ((l1Var instanceof InterfaceC28345a) && (l1Var instanceof com.avito.android.advertising.h)) {
                    this.f111293o.m4(((InterfaceC28345a) l1Var).getF86895d(), ((com.avito.android.advertising.h) l1Var).getBanner(), Integer.valueOf(i13 + iB2), BannerEvent.Type.f87773b);
                }
            }
            i13 = i14;
        }
        return new C43152f0(new C29203j0(C43175k.I(this.f111295q.a(), kotlinx.coroutines.rx3.y.a(io.reactivex.rxjava3.core.z.X(C42745f0.S0(list2)).N(C29211n0.f112489b).d0(C29213o0.f112493b).T(new C29220s0(this, jD2, i12, iB2), Integer.MAX_VALUE).d0(new C29222t0(this, serpDisplayType)).N(C29224u0.f112572b).d0(C29226v0.f112605b))), lVar2, lVar), new C29205k0(3, null));
    }

    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.k
    public final InterfaceC43160i<BxContentInternalAction> a() {
        C36135w2 c36135w2 = this.f111301w;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[38];
        boolean zBooleanValue = ((Boolean) c36135w2.f327466I.a().invoke()).booleanValue();
        InterfaceC48136b interfaceC48136b = this.f111267D;
        if (zBooleanValue) {
            return C43175k.C(new c(null), C43175k.t(interfaceC48136b.a(), 1));
        }
        return C43175k.C(new d(null), interfaceC48136b.a());
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final boolean b(@Y61.k String str) {
        return this.f111291m.b(str);
    }

    @Override // com.avito.android.search.h
    @Y61.k
    public final io.reactivex.rxjava3.core.z c(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l Boolean bool) {
        return this.f111296r.c(str, searchParams, presentationType, str2, bool);
    }

    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m d(@Y61.k C29126a.b bVar, @Y61.l String str, boolean z12) {
        InterfaceC43160i interfaceC43160iW;
        ItemsRequestParams f269267x;
        l1 l1Var = bVar.f112059b;
        C43152f0 c43152f0O = O(C42745f0.V(l1Var), SerpDisplayType.Grid, 1, new C29195f0(bVar), new C29197g0(bVar));
        D0 d0M = m(C42745f0.V(l1Var), new C29199h0(bVar), new C29201i0(bVar), z12);
        if (l1Var instanceof InterfaceC43821a) {
            InterfaceC43821a interfaceC43821a = (InterfaceC43821a) l1Var;
            if (!interfaceC43821a.v1() || (f269267x = interfaceC43821a.getF269267x()) == null) {
                interfaceC43160iW = C43175k.w();
            } else {
                if (str == null) {
                    str = "";
                }
                interfaceC43160iW = new C43152f0(C43175k.G(new C29123d0(kotlinx.coroutines.rx3.y.a(this.f111265B.a(f269267x, null, null, 1, str)), null, interfaceC43821a, bVar, bVar)), new C29125e0(interfaceC43821a, null, bVar));
            }
        } else {
            interfaceC43160iW = C43175k.w();
        }
        return C43175k.N(c43152f0O, d0M, interfaceC43160iW, ((l1Var instanceof com.avito.android.advertising.i) || (l1Var instanceof InterfaceC34742k0)) ? new C43210w(new BxContentInternalAction.BeduinNativeInternalAction.AddBlockIfNotExist(bVar)) : C43175k.w());
    }

    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.k
    public final kotlinx.coroutines.flow.X e(@Y61.l C.c cVar, @Y61.l C.b bVar) {
        l0.h hVar = new l0.h();
        l0.h hVar2 = new l0.h();
        l0.h hVar3 = new l0.h();
        com.avito.android.util.R0 r02 = this.f111295q;
        return new kotlinx.coroutines.flow.X(C43175k.N(new C43197r1(new J(hVar, null), cVar != null ? C43175k.I(r02.a(), new C43152f0(new C43137a0(new C29119b0(2, null), C43175k.G(new C29117a0(cVar, this, null))), new C29121c0(3, null))) : C43175k.w()), new C43197r1(new I(hVar2, hVar3, null), bVar != null ? C43175k.B(new N(bVar, this, null), C43175k.I(r02.a(), new C43152f0(new C43137a0(new L(bVar, null), C43175k.G(new K(bVar, this, null))), new M(bVar, null)))) : C43175k.w())), new H(hVar, hVar2, hVar3, null));
    }

    @Override // com.avito.android.bxcontent.mvi.C
    public final void f(@Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams, @Y61.l String str) {
        if (this.f111266C.c()) {
            int i12 = b.f111305a[presentationType.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
                SearchParams searchParamsN = N(searchParams, str);
                if (str == null) {
                    str = searchParamsN.getLocationId();
                }
                if (str != null) {
                    this.f111291m.i(str);
                }
            }
        }
    }

    @Override // com.avito.android.bxcontent.mvi.C
    public final void g(@Y61.k SerpWarningItem serpWarningItem) {
        WarningState.a aVar = WarningState.f273965c;
        this.f111297s.b(serpWarningItem.f273716c);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final void h(@Y61.k Location location) {
        this.f111291m.h(location);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final void i(@Y61.k String str) {
        this.f111291m.i(str);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> j() {
        return this.f111291m.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@Y61.k com.avito.android.recent_query_search.item.RecentQuerySearchItem r5, @Y61.l java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.bxcontent.mvi.G
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.bxcontent.mvi.G r0 = (com.avito.android.bxcontent.mvi.G) r0
            int r1 = r0.f111317s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111317s = r1
            goto L18
        L13:
            com.avito.android.bxcontent.mvi.G r0 = new com.avito.android.bxcontent.mvi.G
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f111315q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f111317s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            h31.e<com.avito.android.remote.k> r7 = r4.f111279a
            java.lang.Object r7 = r7.get()
            com.avito.android.remote.k r7 = (com.avito.android.remote.InterfaceC34323k) r7
            java.lang.String r5 = r5.getF252233d()
            r0.f111317s = r3
            java.lang.Object r7 = r7.f(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            java.lang.String r6 = "BxContentInteractor"
            if (r5 == 0) goto L5a
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            r7 = 0
            java.lang.String r0 = "Send close recent query search success."
            r5.c(r6, r0, r7)
            goto L7a
        L5a:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L7a
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L75
            java.lang.Exception r0 = new java.lang.Exception
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            java.lang.String r7 = r7.getF244063c()
            r0.<init>(r7)
        L75:
            java.lang.String r7 = "Send close recent query search error."
            r5.a(r6, r7, r0)
        L7a:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.F.k(com.avito.android.recent_query_search.item.RecentQuerySearchItem, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> l() {
        return this.f111291m.l();
    }

    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.k
    public final D0 m(@Y61.k List list, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, boolean z12) {
        return new D0(C43175k.B(new E0(this, null), new B0(new C0(new A0(new C43187o(list)), z12))), lVar2, lVar);
    }

    @Override // com.avito.android.bxcontent.mvi.C
    @Y61.k
    public final kotlinx.coroutines.flow.C0 n(@Y61.k PresentationType presentationType, @Y61.l String str, @Y61.l String str2, @Y61.l SearchParams searchParams, @Y61.k String str3, @Y61.l SerpSpaceType serpSpaceType, @Y61.l LayoutType layoutType) {
        return C43175k.B(new Z(this, presentationType, str, serpSpaceType, searchParams, str2, layoutType, str3, null), new C43152f0(new C43137a0(new X(2, null), new V(new C43197r1(new W(this, null), C43175k.I(this.f111295q.a(), kotlinx.coroutines.rx3.y.a(this.f111291m.l()))))), new Y(3, null)));
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.Q<Location, Boolean>> o(boolean z12) {
        return this.f111291m.o(z12);
    }
}
