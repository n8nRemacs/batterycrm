package com.avito.android.analytics.screens.tracker;

import Bc.InterfaceC13133a;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.trace.g;
import kotlin.Metadata;

/* compiled from: ScreenTrackerFactoryDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/J;", "Lcom/avito/android/analytics/screens/tracker/I;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90740a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.H f90742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.image.a f90743d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final I1 f90744e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f90745f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.coverage.d f90746g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28490l f90747h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f90748i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.image.e f90749j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.D f90750k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.fps.a> f90751l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13133a f90752m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final V f90753n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final M f90754o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.degrade.a f90755p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.degrade.fps.f f90756q;

    public J(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.screens.G g12, @Y61.k com.avito.android.analytics.H h12, @Y61.k com.avito.android.analytics.screens.image.a aVar, @Y61.k I1 i12, @Y61.k com.avito.android.util.C c12, @Y61.k com.avito.android.analytics.coverage.d dVar, @Y61.k InterfaceC28490l interfaceC28490l, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k com.avito.android.remote.analytics.image.e eVar, @Y61.k com.avito.android.analytics.screens.D d12, @RE.a @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.fps.a> zVar, @Y61.k InterfaceC13133a interfaceC13133a, @Y61.k V v12, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.degrade.a aVar2, @Y61.k com.avito.android.analytics.screens.tracker.degrade.fps.f fVar) {
        this.f90740a = interfaceC28373a;
        this.f90741b = g12;
        this.f90742c = h12;
        this.f90743d = aVar;
        this.f90744e = i12;
        this.f90745f = c12;
        this.f90746g = dVar;
        this.f90747h = interfaceC28490l;
        this.f90748i = nVar;
        this.f90749j = eVar;
        this.f90750k = d12;
        this.f90751l = zVar;
        this.f90752m = interfaceC13133a;
        this.f90753n = v12;
        this.f90754o = m12;
        this.f90755p = aVar2;
        this.f90756q = fVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.I
    @Y61.k
    public final C28502y a(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28496s c28496s, @Y61.k String str, @Y61.k Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar, @Y61.k String str2, boolean z12, @Y61.k com.avito.android.analytics.screens.tracker.trace.e eVar) {
        Dc.b bVarA = new Dc.c(this.f90750k, this.f90744e, this.f90745f, uVar).a();
        com.avito.android.analytics.screens.tracker.trace.b bVar = new com.avito.android.analytics.screens.tracker.trace.b(screen);
        com.avito.android.analytics.screens.tracker.trace.c cVarA = com.avito.android.analytics.screens.tracker.trace.e.a(eVar, screen, g.b.f90924b, null, 12);
        return new C28502y(g12, this.f90741b, bVarA, uVar, this.f90746g, this.f90747h, c28496s, rVar, screen, str, str2, z12, this.f90754o, bVar, this.f90755p, cVarA);
    }

    @Override // com.avito.android.analytics.screens.tracker.I
    @Y61.k
    public final C28500w b(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28496s c28496s, @Y61.k String str, @Y61.k Screen screen, @Y61.k String str2, boolean z12) {
        return new C28500w(g12, this.f90741b, uVar, c28496s, screen, str2, z12, str, this.f90754o);
    }

    @Override // com.avito.android.analytics.screens.tracker.I
    @Y61.k
    public final G c(@Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k Screen screen) {
        return new G(this.f90740a, this.f90744e, this.f90745f, this.f90753n, uVar, screen);
    }

    @Override // com.avito.android.analytics.screens.tracker.I
    @Y61.k
    public final com.avito.android.analytics.screens.q d(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28496s c28496s, @Y61.k String str, @Y61.k Screen screen, @Y61.k L l12, @Y61.k com.avito.android.analytics.screens.tracker.trace.e eVar) {
        com.avito.android.analytics.screens.D d12 = this.f90750k;
        I1 i12 = this.f90744e;
        return new com.avito.android.analytics.screens.q(this.f90740a, g12, this.f90741b, screen, this.f90742c, new Dc.c(d12, i12, this.f90745f, uVar), this.f90743d, i12, uVar, new C28479a(), this.f90748i, this.f90749j, c28496s, str, this.f90751l, this.f90752m, this.f90754o, new com.avito.android.analytics.screens.tracker.trace.b(screen), this.f90755p, null, l12, this.f90756q, eVar, 524288, null);
    }
}
