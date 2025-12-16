package com.avito.android.beduin.ui.universal;

import Hr.InterfaceC14024a;
import Wi.b;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.UniversalBeduinScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.action.BeduinNavigationBar;
import com.avito.android.beduin.common.action.BeduinSetNavigationBarAction;
import com.avito.android.beduin.common.action.BeduinUniversalPageContentImpl;
import com.avito.android.beduin.common.action.ScreenTitle;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.T2;
import com.avito.android.util.V2;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: UniversalBeduinViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/m;", "Landroidx/lifecycle/M0;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.g f104492E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28481c f104493J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.r f104494K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final D f104495L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f104496M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f104497N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final Long f104498O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final String f104499P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final ScreenPerformanceTracker f104500Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final kj.d f104501R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f104502S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f104503T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f104504U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f104505V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f104506W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f104507X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f104508Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<l>> f104509Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f104510a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<ApiError> f104511b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D f104512c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f104513d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D f104514e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104515f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final I0 f104516g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104517h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final I0 f104518i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104519j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final I0 f104520k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104521l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final I0 f104522m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public ScreenPerformanceTracker f104523n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f104524o0;

    /* compiled from: UniversalBeduinViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((m) this.receiver).ne(true);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<BeduinActionsResponse, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(BeduinActionsResponse beduinActionsResponse) {
            m.this.ne(false);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<ApiError, G0> {
        @Override // Y41.l
        public final G0 invoke(ApiError apiError) {
            m mVar = (m) this.receiver;
            mVar.f104511b0.postValue(apiError);
            mVar.ne(false);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isExpanded", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            m.this.f104507X.postValue(bool);
        }
    }

    /* compiled from: UniversalBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWi/b$a;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lkotlin/G0;", "accept", "(LWi/b$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            LinkedHashMap linkedHashMap = ((b.a) obj).f18021a;
            m mVar = m.this;
            String str = mVar.f104499P;
            if (str != null) {
                mVar.ke(linkedHashMap, str);
            }
        }
    }

    /* compiled from: UniversalBeduinViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            BeduinNavigationBar beduinNavigationBarCopy;
            BeduinSetNavigationBarAction beduinSetNavigationBarAction = (BeduinSetNavigationBarAction) obj;
            m mVar = m.this;
            C23038g0<P2<l>> c23038g0 = mVar.f104509Z;
            P2<l> value = c23038g0.getValue();
            l lVar = (l) T2.a(value);
            if (lVar != null) {
                BeduinNavigationBar beduinNavigationBar = lVar.f104489a;
                if (beduinNavigationBar != null) {
                    ScreenTitle screenTitle = beduinSetNavigationBarAction.getScreenTitle();
                    if (screenTitle == null) {
                        screenTitle = beduinNavigationBar.getScreenTitle();
                    }
                    List<NavigationBarItem> rightItems = beduinSetNavigationBarAction.getRightItems();
                    if (rightItems == null) {
                        rightItems = beduinNavigationBar.getRightItems();
                    }
                    UniversalColor backgroundColor = beduinSetNavigationBarAction.getBackgroundColor();
                    if (backgroundColor == null) {
                        backgroundColor = beduinNavigationBar.getBackgroundColor();
                    }
                    beduinNavigationBarCopy = beduinNavigationBar.copy(screenTitle, rightItems, backgroundColor);
                } else {
                    beduinNavigationBarCopy = null;
                }
                List<NavigationBarItem> rightItems2 = beduinNavigationBarCopy != null ? beduinNavigationBarCopy.getRightItems() : null;
                if (rightItems2 == null) {
                    rightItems2 = C42784z0.f406748b;
                }
                List<NavigationBarItem> list = rightItems2;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NavigationBarItem) it.next()).toBeduinModel(null));
                }
                mVar.f104515f0.h(new d.k(arrayList, "navigationBarRightItems"));
                value = new P2.b<>(l.a(lVar, beduinNavigationBarCopy, false, 6));
            }
            c23038g0.setValue(value);
        }
    }

    public m(@Y61.k InterfaceC14024a interfaceC14024a, @Y61.k Wi.b bVar, @Y61.l Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar, @Y61.k D d12, @Y61.k InterfaceC28481c interfaceC28481c, @Y61.l ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.beduin.common.g gVar, @Y61.k com.avito.android.beduin.common.actionhandler.set_navigation_bar.a aVar, @Y61.k com.avito.android.beduin.ui.universal.beduin.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.l Long l12, @Y61.l String str, @Y61.k kj.d dVar) {
        this.f104492E = gVar;
        this.f104493J = interfaceC28481c;
        this.f104494K = rVar;
        this.f104495L = d12;
        this.f104496M = interfaceC14024a;
        this.f104497N = interfaceC40691b;
        this.f104498O = l12;
        this.f104499P = str;
        this.f104500Q = screenPerformanceTracker;
        this.f104501R = dVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f104506W = cVar;
        C23038g0<Boolean> c23038g0 = new C23038g0<>();
        this.f104507X = c23038g0;
        this.f104508Y = c23038g0;
        C23038g0<P2<l>> c23038g02 = new C23038g0<>();
        this.f104509Z = c23038g02;
        this.f104510a0 = c23038g02;
        com.avito.android.util.architecture_components.D<ApiError> d13 = new com.avito.android.util.architecture_components.D<>();
        this.f104511b0 = d13;
        this.f104512c0 = d13;
        com.avito.android.util.architecture_components.D<G0> d14 = new com.avito.android.util.architecture_components.D<>();
        this.f104513d0 = d14;
        this.f104514e0 = d14;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        this.f104515f0 = interfaceC43779aJ;
        this.f104516g0 = interfaceC43779aJ.getF103348p().j0(interfaceC35745a5.e());
        InterfaceC43779a interfaceC43779aJ2 = interfaceC40691b.j();
        this.f104517h0 = interfaceC43779aJ2;
        this.f104518i0 = interfaceC43779aJ2.getF103348p().j0(interfaceC35745a5.e());
        InterfaceC43779a interfaceC43779aJ3 = interfaceC40691b.j();
        this.f104519j0 = interfaceC43779aJ3;
        this.f104520k0 = interfaceC43779aJ3.getF103348p().j0(interfaceC35745a5.e());
        InterfaceC43779a interfaceC43779aJ4 = interfaceC40691b.j();
        this.f104521l0 = interfaceC43779aJ4;
        this.f104522m0 = interfaceC43779aJ4.getF103348p().j0(interfaceC35745a5.e());
        this.f104524o0 = true;
        if (screen != null) {
            interfaceC40691b.g(screen);
            dVar.a(screen);
        }
        if (l12 != null) {
            Object objB = interfaceC14024a.b(Long.valueOf(l12.longValue()));
            BeduinUniversalPageContentImpl beduinUniversalPageContentImpl = (BeduinUniversalPageContentImpl) (objB instanceof BeduinUniversalPageContentImpl ? objB : null);
            if (beduinUniversalPageContentImpl != null) {
                me(new P2.b(beduinUniversalPageContentImpl), null);
            }
        }
        if (str != null) {
            ke(null, str);
        }
        cVar.b(com.avito.android.beduin.common.l.a(interfaceC40691b.q(), new a(0, this, m.class, "onExecutingRequest", "onExecutingRequest()V", 0), new b(), new c(1, this, m.class, "onExecuteRequestError", "onExecuteRequestError(Lcom/avito/android/remote/error/ApiError;)V", 0)));
        cVar.b(aVar2.f104455b.t0(new d()));
        cVar.b(bVar.f18020b.t0(new e()));
        cVar.b(aVar.f100383b.t0(new f()));
    }

    public final void ke(@Y61.l LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f104495L.getClass();
        F f12 = new F();
        f12.c();
        com.avito.android.beduin.common.g gVar = this.f104492E;
        gVar.getClass();
        C42007e c42007e = new C42007e(new com.avito.android.advert.deeplinks.delivery.p(str, linkedHashMap, gVar));
        InterfaceC35745a5 interfaceC35745a5 = gVar.f103419b;
        z zVarR0 = c42007e.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).r(n.f104529b).F().r0(P2.c.f318721a);
        o oVar = new o(this, f12);
        p pVar = new p(this);
        zVarR0.getClass();
        this.f104506W.b(zVarR0.v0(oVar, pVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Y61.l
    public final ScreenPerformanceTracker le() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f104500Q;
        return screenPerformanceTracker == null ? this.f104523n0 : screenPerformanceTracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void me(P2 p22, F f12) {
        ScreenPerformanceTracker screenPerformanceTrackerLe;
        ScreenPerformanceTracker screenPerformanceTrackerLe2;
        boolean z12 = p22 instanceof P2.b;
        C23038g0<P2<l>> c23038g0 = this.f104509Z;
        if (!z12) {
            P2.c cVar = P2.c.f318721a;
            if (L.f(p22, cVar)) {
                c23038g0.setValue(cVar);
                G0 g02 = G0.f406611a;
                return;
            }
            if (!(p22 instanceof P2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (f12 != null && (screenPerformanceTrackerLe = le()) != null) {
                ScreenPerformanceTracker.a.e(screenPerformanceTrackerLe, null, null, new J.a(((P2.a) p22).f318719a), f12.b(), 11);
            }
            ScreenPerformanceTracker screenPerformanceTrackerLe3 = le();
            if (screenPerformanceTrackerLe3 != null) {
                screenPerformanceTrackerLe3.m(screenPerformanceTrackerLe3.getF305951e());
            }
            P2.a aVar = (P2.a) p22;
            ApiError apiError = aVar.f318719a;
            boolean z13 = apiError instanceof ApiError.UnknownError;
            ApiError apiError2 = aVar.f318719a;
            if (z13) {
                V2.f318762a.e(((ApiError.UnknownError) apiError).getF244063c(), ((ApiError.UnknownError) apiError2).f253395c);
            } else {
                V2.f318762a.e(apiError.toString(), null);
            }
            c23038g0.setValue(p22);
            ScreenPerformanceTracker screenPerformanceTrackerLe4 = le();
            if (screenPerformanceTrackerLe4 != null) {
                ScreenPerformanceTracker.a.c(screenPerformanceTrackerLe4, null, new J.a(apiError2), null, 5);
                G0 g03 = G0.f406611a;
                return;
            }
            return;
        }
        BeduinUniversalPageContentImpl beduinUniversalPageContentImpl = (BeduinUniversalPageContentImpl) ((P2.b) p22).f318720a;
        String screenName = beduinUniversalPageContentImpl.getScreenName();
        ScreenPerformanceTracker screenPerformanceTrackerLe5 = le();
        InterfaceC40691b interfaceC40691b = this.f104497N;
        if (screenPerformanceTrackerLe5 == null) {
            UniversalBeduinScreen universalBeduinScreen = new UniversalBeduinScreen(screenName);
            this.f104501R.a(universalBeduinScreen);
            com.avito.android.analytics.screens.tracker.F fA2 = this.f104493J.a(new C28478k(universalBeduinScreen, this.f104494K, "load-page"));
            this.f104523n0 = fA2;
            interfaceC40691b.g(universalBeduinScreen);
            ((com.avito.android.beduin.common.analytics.f) interfaceC40691b).n(fA2);
            this.f104513d0.postValue(G0.f406611a);
        }
        if (f12 != null && (screenPerformanceTrackerLe2 = le()) != null) {
            ScreenPerformanceTracker.a.e(screenPerformanceTrackerLe2, null, null, null, f12.b(), 15);
        }
        ScreenPerformanceTracker screenPerformanceTrackerLe6 = le();
        if (screenPerformanceTrackerLe6 != null) {
            screenPerformanceTrackerLe6.m(screenPerformanceTrackerLe6.getF305951e());
        }
        c23038g0.setValue(new P2.b(new l(beduinUniversalPageContentImpl.getNavigationBar(), false, beduinUniversalPageContentImpl.getSettings())));
        BeduinNavigationBar navigationBar = beduinUniversalPageContentImpl.getNavigationBar();
        List<NavigationBarItem> rightItems = navigationBar != null ? navigationBar.getRightItems() : null;
        if (rightItems == null) {
            rightItems = C42784z0.f406748b;
        }
        List<NavigationBarItem> list = rightItems;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NavigationBarItem) it.next()).toBeduinModel(null));
        }
        this.f104515f0.h(new d.k(arrayList, "navigationBarRightItems"));
        List<BeduinModel> topComponents = beduinUniversalPageContentImpl.getTopComponents();
        if (topComponents == null) {
            topComponents = C42784z0.f406748b;
        }
        String topFormId = beduinUniversalPageContentImpl.getTopFormId();
        if (topFormId == null) {
            topFormId = "top";
        }
        this.f104517h0.h(new d.k(topComponents, topFormId));
        List<BeduinModel> mainComponents = beduinUniversalPageContentImpl.getMainComponents();
        String mainFormId = beduinUniversalPageContentImpl.getMainFormId();
        if (mainFormId == null) {
            mainFormId = "main";
        }
        this.f104519j0.h(new d.k(mainComponents, mainFormId));
        List<BeduinModel> bottomComponents = beduinUniversalPageContentImpl.getBottomComponents();
        if (bottomComponents == null) {
            bottomComponents = C42784z0.f406748b;
        }
        String bottomFormId = beduinUniversalPageContentImpl.getBottomFormId();
        if (bottomFormId == null) {
            bottomFormId = "bottom";
        }
        this.f104521l0.h(new d.k(bottomComponents, bottomFormId));
        ScreenPerformanceTracker screenPerformanceTrackerLe7 = le();
        if (screenPerformanceTrackerLe7 != null) {
            ScreenPerformanceTracker.a.c(screenPerformanceTrackerLe7, null, null, null, 7);
        }
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, beduinUniversalPageContentImpl.getOnOpenActions());
        this.f104502S = beduinUniversalPageContentImpl.getOnCloseActions();
        this.f104503T = beduinUniversalPageContentImpl.getOnBackButtonActions();
        this.f104505V = beduinUniversalPageContentImpl.getOnAppearActions();
        this.f104504U = beduinUniversalPageContentImpl.getOnDisappearActions();
        Boolean closeOnBack = beduinUniversalPageContentImpl.getCloseOnBack();
        this.f104524o0 = closeOnBack != null ? closeOnBack.booleanValue() : true;
        G0 g04 = G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ne(boolean z12) {
        C23038g0<P2<l>> c23038g0 = this.f104509Z;
        P2<l> value = c23038g0.getValue();
        if (value == null || !(value instanceof P2.b)) {
            return;
        }
        c23038g0.postValue(new P2.b(l.a((l) ((P2.b) value).f318720a, null, z12, 5)));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f104506W.e();
        this.f104497N.onCleared();
    }
}
