package com.avito.android.analytics.screens.tracker;

import android.os.Handler;
import com.avito.android.I1;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ContentDrawingTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/f;", "Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/e;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28484f extends Y implements InterfaceC28483e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90830c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90831d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.H f90832e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Handler f90833f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I1 f90834g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90835h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C28479a f90836i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f90837j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C28496s f90838k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Screen f90839l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f90840m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f90841n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final M f90842o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.a f90843p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.degrade.a f90844q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final L f90845r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final String f90846s;

    public C28484f(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k com.avito.android.analytics.H h12, @Y61.k Handler handler, @Y61.k Dc.b bVar, @Y61.k I1 i12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28479a c28479a, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k C28496s c28496s, @Y61.k Screen screen, @Y61.k String str, @Y61.k String str2, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.trace.a aVar, @Y61.k com.avito.android.analytics.screens.tracker.degrade.a aVar2, @Y61.k L l12, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        super(bVar, cVar);
        this.f90830c = g12;
        this.f90831d = g13;
        this.f90832e = h12;
        this.f90833f = handler;
        this.f90834g = i12;
        this.f90835h = uVar;
        this.f90836i = c28479a;
        this.f90837j = nVar;
        this.f90838k = c28496s;
        this.f90839l = screen;
        this.f90840m = str;
        this.f90841n = str2;
        this.f90842o = m12;
        this.f90843p = aVar;
        this.f90844q = aVar2;
        this.f90845r = l12;
        this.f90846s = screen.f90471b;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28483e
    public final long c() {
        return this.f90796a.a();
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28483e
    public final void d(@Y61.l Integer num, @Y61.k com.avito.android.analytics.screens.J j12) {
        this.f90833f.post(new Me.m(this, num, j12, 14));
    }
}
