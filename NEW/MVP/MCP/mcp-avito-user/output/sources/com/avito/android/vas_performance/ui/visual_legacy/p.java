package com.avito.android.vas_performance.ui.visual_legacy;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_performance.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: VisualVasViewModelImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/p;", "Lcom/avito/android/vas_performance/ui/visual_legacy/m;", "Landroidx/lifecycle/M0;", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends M0 implements m {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f322128w0 = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f322129E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f322130J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f322131K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final I f322132L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322133M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final TL0.d f322134N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f322135O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322136P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f322137Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<G0, P2<HL0.b>> f322138R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f322139S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f322140T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.vas_performance.ui.recycler.i> f322141U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.vas_performance.ui.a> f322142V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f322143W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<VisualVasCloseEvent> f322144X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<MnzFloatingFooter> f322145Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f322146Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<Integer, Boolean>> f322147a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public AtomicReference f322148b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322149c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f322150d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f322151e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f322152f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public String f322153g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public String f322154h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public String f322155i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public DeepLink f322156j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public DeepLink f322157k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public Integer f322158l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public MnzFloatingFooter f322159m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322160n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322161o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322162p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322163q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322164r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322165s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322166t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final D f322167u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f322168v0;

    /* compiled from: VisualVasViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/p$a;", "", "<init>", "()V", "", "THROTTLING_TIMEOUT", "J", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k I i12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k TL0.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, boolean z12, @Y61.k com.avito.android.preloading.j<G0, ? extends P2<? super HL0.b>> jVar) {
        this.f322129E = str;
        this.f322130J = str2;
        this.f322131K = aVar;
        this.f322132L = i12;
        this.f322133M = interfaceC35745a5;
        this.f322134N = dVar;
        this.f322135O = aVar2;
        this.f322136P = interfaceC28373a;
        this.f322137Q = z12;
        this.f322138R = jVar;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f322139S = c23038g0;
        C23038g0<P2<?>> c23038g02 = new C23038g0<>();
        this.f322140T = c23038g02;
        C23038g0<com.avito.android.vas_performance.ui.recycler.i> c23038g03 = new C23038g0<>();
        this.f322141U = c23038g03;
        C23038g0<com.avito.android.vas_performance.ui.a> c23038g04 = new C23038g0<>();
        this.f322142V = c23038g04;
        D<DeepLink> d12 = new D<>();
        this.f322143W = d12;
        C23038g0<VisualVasCloseEvent> c23038g05 = new C23038g0<>();
        this.f322144X = c23038g05;
        C23038g0<MnzFloatingFooter> c23038g06 = new C23038g0<>();
        this.f322145Y = c23038g06;
        C23038g0<Boolean> c23038g07 = new C23038g0<>();
        this.f322146Z = c23038g07;
        C23038g0<Q<Integer, Boolean>> c23038g08 = new C23038g0<>();
        this.f322147a0 = c23038g08;
        this.f322148b0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        this.f322149c0 = new io.reactivex.rxjava3.disposables.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f322150d0 = c42784z0;
        this.f322151e0 = c42784z0;
        this.f322152f0 = c42784z0;
        this.f322153g0 = "";
        this.f322154h0 = "";
        this.f322155i0 = "";
        ke();
        this.f322160n0 = c23038g03;
        this.f322161o0 = c23038g04;
        this.f322162p0 = c23038g06;
        this.f322163q0 = c23038g07;
        this.f322164r0 = c23038g08;
        this.f322165s0 = c23038g0;
        this.f322166t0 = c23038g02;
        this.f322167u0 = d12;
        this.f322168v0 = c23038g05;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: D7, reason: from getter */
    public final C23038g0 getF322163q0() {
        return this.f322163q0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: J4, reason: from getter */
    public final C23038g0 getF322164r0() {
        return this.f322164r0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: K, reason: from getter */
    public final C23038g0 getF322160n0() {
        return this.f322160n0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: L3, reason: from getter */
    public final D getF322167u0() {
        return this.f322167u0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f322149c0;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d) {
                io.reactivex.rxjava3.subjects.e f321841c = ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d) dVar).getF321841c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f321841c.getClass();
                cVar.b(f321841c.y(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f322133M.e()).v0(new y(this), z.f322176b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    public final void c6(@Y61.l Integer num) {
        this.f322158l0 = num;
        if (this.f322152f0.isEmpty()) {
            this.f322143W.postValue(this.f322157k0);
            return;
        }
        List<? extends com.avito.conveyor_item.a> list = this.f322152f0;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.conveyor_item.a) it.next()).getF200606b());
        }
        Set<String> setP0 = C42745f0.P0(arrayList);
        this.f322148b0.dispose();
        String str = this.f322155i0;
        io.reactivex.rxjava3.core.z<P2<DeepLinkResponse>> zVarA = this.f322131K.a(this.f322129E, (str == null || str.length() == 0) ? this.f322130J : this.f322155i0, setP0);
        u uVar = new u(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = zVarA.J(interfaceC43543a, uVar);
        InterfaceC43543a interfaceC43543a2 = new InterfaceC43543a() { // from class: com.avito.android.vas_performance.ui.visual_legacy.o
            @Override // l41.InterfaceC43543a
            public final void run() {
                p pVar = this.f322127b;
                pVar.f322147a0.postValue(new Q<>(pVar.f322158l0, Boolean.FALSE));
            }
        };
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        this.f322148b0 = (AtomicReference) pJ2.H(gVar, gVar, interfaceC43543a, interfaceC43543a2).j0(this.f322133M.e()).v0(new v(this), w.f322173b, interfaceC43543a);
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    public final void h0() {
        ke();
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    public final void i0() {
        this.f322136P.c(new sL0.d());
        this.f322144X.setValue(this.f322137Q ? VisualVasCloseEvent.f322071c : VisualVasCloseEvent.f322070b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        this.f322148b0.dispose();
        this.f322152f0 = C42784z0.f406748b;
        this.f322148b0 = (AtomicReference) com.avito.android.preloading.t.a(this.f322138R, new s(1, this, p.class, "handleLoadingState", "handleLoadingState(Lcom/avito/android/util/LoadingState;)V", 0), new t(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0));
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: o5, reason: from getter */
    public final C23038g0 getF322161o0() {
        return this.f322161o0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: q2, reason: from getter */
    public final C23038g0 getF322166t0() {
        return this.f322166t0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: u3, reason: from getter */
    public final C23038g0 getF322165s0() {
        return this.f322165s0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: w2, reason: from getter */
    public final C23038g0 getF322168v0() {
        return this.f322168v0;
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    public final void yc() {
        DeepLink deepLink = this.f322156j0;
        if (deepLink != null) {
            b.a.a(this.f322135O, deepLink, null, null, 6);
        }
    }

    @Override // com.avito.android.vas_performance.ui.visual_legacy.m
    @Y61.k
    /* renamed from: zd, reason: from getter */
    public final C23038g0 getF322162p0() {
        return this.f322162p0;
    }
}
