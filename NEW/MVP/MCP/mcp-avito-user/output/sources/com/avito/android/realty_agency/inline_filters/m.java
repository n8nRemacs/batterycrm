package com.avito.android.realty_agency.inline_filters;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import Y41.p;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import cE.C27025b;
import cU0.InterfaceC27108f;
import com.avito.android.C0;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.location.r;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.shortcut_navigation_bar.z0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.engine.component.z;
import iw.C42120a;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.rx3.y;
import lE.C43624b;

/* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/m;", "Lcom/avito/android/realty_agency/inline_filters/l;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements l, InterfaceC34996m, InlineFilterDialogOpener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f251725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<SearchParams> f251726c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f251727d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f251728e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f251729f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<SearchParams, G0> f251730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C34999p f251731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f251732i;

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/realty_agency/inline_filters/m$a", "Lcom/avito/android/shortcut_navigation_bar/p$b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements C34999p.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f251733a = y6.b(0);

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        public final /* bridge */ /* synthetic */ Integer a() {
            return null;
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        public final /* bridge */ /* synthetic */ Integer b() {
            return null;
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        public final /* bridge */ /* synthetic */ Integer c() {
            return null;
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        public final /* bridge */ /* synthetic */ Integer d() {
            return null;
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        public final /* bridge */ /* synthetic */ Integer e() {
            return null;
        }

        @Override // com.avito.android.shortcut_navigation_bar.C34999p.b
        @Y61.k
        public final Integer m() {
            return Integer.valueOf(this.f251733a);
        }
    }

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.RealtyAgencyInlineFilterViewHolderImpl$2", f = "RealtyAgencyInlineFilterViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InlineFiltersGeo, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return m.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InlineFiltersGeo inlineFiltersGeo, Continuation<? super G0> continuation) {
            return ((b) create(inlineFiltersGeo, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Y41.a<G0> aVar = m.this.f251728e;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterId", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.RealtyAgencyInlineFilterViewHolderImpl$3", f = "RealtyAgencyInlineFilterViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f251735q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = m.this.new c(continuation);
            cVar.f251735q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((c) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f251735q;
            m mVar = m.this;
            mVar.f251725b.o1(null, mVar.f251726c.invoke(), str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.RealtyAgencyInlineFilterViewHolderImpl$4", f = "RealtyAgencyInlineFilterViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<ShortcutNavigationItem, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f251737q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = m.this.new d(continuation);
            dVar.f251737q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(ShortcutNavigationItem shortcutNavigationItem, Continuation<? super G0> continuation) {
            return ((d) create(shortcutNavigationItem, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) this.f251737q;
            m mVar = m.this;
            mVar.getClass();
            boolean z12 = shortcutNavigationItem instanceof InlineFilterNavigationItem;
            Y41.a<G0> aVar = mVar.f251727d;
            if (z12) {
                InlineFilterNavigationItem inlineFilterNavigationItem = (InlineFilterNavigationItem) shortcutNavigationItem;
                if (!L.f(inlineFilterNavigationItem.f283228c, "filtersEntryPoint")) {
                    SearchParams searchParamsInvoke = mVar.f251726c.invoke();
                    mVar.f251725b.y1(inlineFilterNavigationItem.f283232g, searchParamsInvoke, null, null);
                } else if (aVar != null) {
                    aVar.invoke();
                }
            } else if ((shortcutNavigationItem instanceof ClarifyButtonItem) && aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoaded", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.RealtyAgencyInlineFilterViewHolderImpl$5", f = "RealtyAgencyInlineFilterViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f251739q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = m.this.new e(continuation);
            eVar.f251739q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((e) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            m.this.f251729f.invoke((Boolean) this.f251739q);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencyInlineFilterViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.RealtyAgencyInlineFilterViewHolderImpl$6", f = "RealtyAgencyInlineFilterViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f251741q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = m.this.new f(continuation);
            fVar.f251741q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super G0> continuation) {
            return ((f) create(q12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink deepLink = (DeepLink) ((Q) this.f251741q).f406619b;
            if ((deepLink instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink : null) != null) {
                m.this.f251730g.invoke(((ItemsSearchLink) deepLink).f133403b);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k View view, @Y61.l Fragment fragment, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.onboarding_manager.a aVar2, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k z zVar, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k com.avito.android.realty_agency.inline_filters.a aVar3, @Y61.k C36135w2 c36135w2, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k Y41.a<SearchParams> aVar4, @Y61.l Y41.a<G0> aVar5, @Y61.l Y41.a<G0> aVar6, @Y61.k Y41.l<? super Boolean, G0> lVar, @Y61.k Y41.l<? super SearchParams, G0> lVar2) {
        this.f251725b = interfaceC31062w;
        this.f251726c = aVar4;
        this.f251727d = aVar5;
        this.f251728e = aVar6;
        this.f251729f = lVar;
        this.f251730g = lVar2;
        View viewFindViewById = view.findViewById(R.id.shortcuts_scroll_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C34999p c34999p = new C34999p(viewFindViewById, aVar, aVar2, fragmentManager, null, fVar, new a(), bVar, screen, screenPerformanceTracker, interfaceC13094a, false, null, null, zVar, interfaceC27108f, c36135w2, 14352, null);
        this.f251731h = c34999p;
        this.f251732i = new k(fragment, interfaceC30999b, aVar3);
        Context context = view.getContext();
        C43175k.K(new C43197r1(new b(null), y.a(c34999p.f283480e0)), C22984Q.a(interfaceC22983P));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new c(null), y.a(c34999p.s60())));
        C43175k.K(new C43197r1(new d(null), y.a(c34999p.f283476c0)), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new e(null), y.a(interfaceC31062w.getF172393J())), C22981N.a(interfaceC22983P.getLifecycle()));
        C43175k.K(new C43197r1(new f(null), y.a(interfaceC31062w.getF172392I())), C22981N.a(interfaceC22983P.getLifecycle()));
        this.f251731h.i(C35835l0.d(R.attr.white, context));
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f251731h.Aq();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f251731h.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f251731h.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f251731h.OM(true);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final d2<Q<String, SectionTagPayload>> QZ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void R00(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k p pVar, @Y61.l Y41.l lVar, @Y61.k p pVar2, @Y61.k p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l C0 c02, @Y61.l C43624b c43624b) {
        this.f251732i.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f251731h.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f251731h.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.VA(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void WC(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        throw null;
    }

    public final void a(boolean z12, boolean z13, boolean z14, boolean z15) {
        if (z12) {
            this.f251725b.s1();
        }
        C34999p c34999p = this.f251731h;
        if (z13) {
            D6.H(c34999p.f283473b);
        } else {
            D6.w(c34999p.f283473b);
        }
        if (z14) {
            nV(false);
        } else {
            bM(false);
        }
        if (z15) {
            c34999p.f283462Q.setVisibility(0);
        } else {
            c34999p.f283462Q.setVisibility(8);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        this.f251731h.bM(false);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f251732i.d0();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f251732i.f2();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f251731h.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        this.f251731h.fk(bool, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f251731h.kF();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        this.f251731h.nV(false);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f251732i.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f251732i.getClass();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f251731h.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> s60() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> sA() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void w50(@Y61.l PinnedItem pinnedItem) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xL(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f251731h.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }

    public /* synthetic */ m(View view, Fragment fragment, FragmentManager fragmentManager, InterfaceC22983P interfaceC22983P, com.avito.android.util.text.a aVar, com.avito.android.onboarding_manager.a aVar2, com.avito.android.onboarding_manager.f fVar, com.avito.android.lib.beduin_v2.feature.item.b bVar, Screen screen, ScreenPerformanceTracker screenPerformanceTracker, InterfaceC13094a interfaceC13094a, z zVar, InterfaceC27108f interfaceC27108f, InterfaceC30999b interfaceC30999b, com.avito.android.realty_agency.inline_filters.a aVar3, C36135w2 c36135w2, InterfaceC31062w interfaceC31062w, Y41.a aVar4, Y41.a aVar5, Y41.a aVar6, Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        this(view, fragment, fragmentManager, interfaceC22983P, aVar, aVar2, fVar, bVar, screen, screenPerformanceTracker, interfaceC13094a, zVar, interfaceC27108f, interfaceC30999b, aVar3, c36135w2, interfaceC31062w, aVar4, (i12 & 262144) != 0 ? null : aVar5, (i12 & 524288) != 0 ? null : aVar6, lVar, lVar2);
    }
}
