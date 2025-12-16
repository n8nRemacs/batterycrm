package com.avito.android.analytics.screens;

import Bc.InterfaceC13133a;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.C28479a;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.C28487i;
import com.avito.android.analytics.screens.tracker.C28495q;
import com.avito.android.analytics.screens.tracker.C28496s;
import com.avito.android.analytics.screens.tracker.C28498u;
import com.avito.android.analytics.screens.tracker.InterfaceC28485g;
import com.avito.android.analytics.screens.tracker.L;
import com.avito.android.analytics.screens.tracker.M;
import com.avito.android.analytics.screens.tracker.P;
import com.avito.android.analytics.screens.tracker.trace.g;
import com.avito.android.util.V2;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenFlowTrackerProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/q;", "Lcom/avito/android/analytics/screens/o;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90669a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.G f90670b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90671c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Screen f90672d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.H f90673e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Dc.c f90674f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.image.a f90675g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final I1 f90676h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final u f90677i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C28479a f90678j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f90679k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.image.e f90680l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C28496s f90681m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f90682n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.fps.a> f90683o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13133a f90684p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final M f90685q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.a f90686r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.degrade.a f90687s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Handler f90688t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final L f90689u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.degrade.fps.f f90690v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.e f90691w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90692x;

    public q() {
        throw null;
    }

    public q(InterfaceC28373a interfaceC28373a, com.avito.android.analytics.screens.tracker.G g12, G g13, Screen screen, com.avito.android.analytics.H h12, Dc.c cVar, com.avito.android.analytics.screens.image.a aVar, I1 i12, u uVar, C28479a c28479a, com.avito.android.remote.analytics.n nVar, com.avito.android.remote.analytics.image.e eVar, C28496s c28496s, String str, io.reactivex.rxjava3.core.z zVar, InterfaceC13133a interfaceC13133a, M m12, com.avito.android.analytics.screens.tracker.trace.a aVar2, com.avito.android.analytics.screens.tracker.degrade.a aVar3, Handler handler, L l12, com.avito.android.analytics.screens.tracker.degrade.fps.f fVar, com.avito.android.analytics.screens.tracker.trace.e eVar2, int i13, C42822w c42822w) {
        Handler handler2 = (i13 & 524288) != 0 ? new Handler(Looper.getMainLooper()) : handler;
        this.f90669a = interfaceC28373a;
        this.f90670b = g12;
        this.f90671c = g13;
        this.f90672d = screen;
        this.f90673e = h12;
        this.f90674f = cVar;
        this.f90675g = aVar;
        this.f90676h = i12;
        this.f90677i = uVar;
        this.f90678j = c28479a;
        this.f90679k = nVar;
        this.f90680l = eVar;
        this.f90681m = c28496s;
        this.f90682n = str;
        this.f90683o = zVar;
        this.f90684p = interfaceC13133a;
        this.f90685q = m12;
        this.f90686r = aVar2;
        this.f90687s = aVar3;
        this.f90688t = handler2;
        this.f90689u = l12;
        this.f90690v = fVar;
        this.f90691w = eVar2;
        this.f90692x = C42727D.c(new p(this));
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.fps.f a() {
        V2.f318762a.c("ScreenFlowTrackerProvider", "getFps", null);
        return (com.avito.android.analytics.screens.tracker.fps.f) this.f90692x.getValue();
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.image.h b(@Y61.k com.avito.android.analytics.screens.image.c cVar) {
        V2.f318762a.c("ScreenFlowTrackerProvider", "getImageLoading", null);
        return new com.avito.android.analytics.screens.image.h(new com.avito.android.analytics.screens.image.f(this.f90669a, this.f90671c, this.f90672d, cVar, this.f90673e, this.f90688t, this.f90676h, this.f90675g, this.f90677i, this.f90679k, this.f90680l));
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final C28495q c() {
        return new C28495q(this.f90669a, this.f90672d, this.f90682n, this.f90679k);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final C28498u d() {
        return new C28498u(this.f90682n, this.f90669a, this.f90676h);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final P e(@Y61.k String str) {
        V2.f318762a.c("ScreenFlowTrackerProvider", "getContentLoadingFromRemoteStorage", null);
        Dc.b bVarA = this.f90674f.a();
        g.f fVar = g.f.f90928b;
        com.avito.android.analytics.screens.tracker.trace.e eVar = this.f90691w;
        Screen screen = this.f90672d;
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar, screen, fVar, str, 8);
        return new P(this.f90670b, this.f90671c, this.f90673e, bVarA, this.f90676h, this.f90677i, this.f90678j, this.f90679k, this.f90681m, screen, str, this.f90682n, this.f90685q, this.f90686r, cVarA);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final InterfaceC28485g f() {
        I1 i12 = this.f90676h;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[47];
        return ((Boolean) i12.f67300V.a().invoke()).booleanValue() ? new C28487i(this.f90688t, null, 2, null) : InterfaceC28485g.a.f90885a;
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.A g() {
        return new com.avito.android.analytics.screens.tracker.A(this.f90669a, this.f90672d);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final C28484f h(@Y61.k String str) {
        V2.f318762a.c("ScreenFlowTrackerProvider", "getContentDrawing", null);
        Dc.b bVarA = this.f90674f.a();
        g.a aVar = g.a.f90923b;
        com.avito.android.analytics.screens.tracker.trace.e eVar = this.f90691w;
        Screen screen = this.f90672d;
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar, screen, aVar, str, 8);
        return new C28484f(this.f90670b, this.f90671c, this.f90673e, this.f90688t, bVarA, this.f90676h, this.f90677i, this.f90678j, this.f90679k, this.f90681m, screen, str, this.f90682n, this.f90685q, this.f90686r, this.f90687s, this.f90689u, cVarA);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.E i(@Y61.k String str) {
        Dc.b bVarA = this.f90674f.a();
        g.e eVar = g.e.f90927b;
        com.avito.android.analytics.screens.tracker.trace.e eVar2 = this.f90691w;
        Screen screen = this.f90672d;
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar2, screen, eVar, str, 8);
        return new com.avito.android.analytics.screens.tracker.E(this.f90670b, this.f90671c, bVarA, screen, str, this.f90685q, cVarA);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.r j(@Y61.k String str) {
        V2.f318762a.c("ScreenFlowTrackerProvider", "getContentLoadingFromLocalStorage", null);
        Dc.b bVarA = this.f90674f.a();
        g.c cVar = g.c.f90925b;
        com.avito.android.analytics.screens.tracker.trace.e eVar = this.f90691w;
        Screen screen = this.f90672d;
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar, screen, cVar, str, 8);
        return new com.avito.android.analytics.screens.tracker.r(this.f90670b, this.f90671c, bVarA, this.f90677i, this.f90678j, this.f90681m, screen, str, this.f90682n, this.f90685q, this.f90686r, cVarA);
    }

    @Override // com.avito.android.analytics.screens.o
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.C k() {
        Dc.b bVarA = this.f90674f.a();
        g.d dVar = g.d.f90926b;
        com.avito.android.analytics.screens.tracker.trace.e eVar = this.f90691w;
        Screen screen = this.f90672d;
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar, screen, dVar, null, 4);
        return new com.avito.android.analytics.screens.tracker.C(this.f90670b, this.f90671c, bVarA, screen, this.f90688t, this.f90685q, cVarA);
    }
}
