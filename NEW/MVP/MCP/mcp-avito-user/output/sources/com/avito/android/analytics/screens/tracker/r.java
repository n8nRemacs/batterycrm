package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.V2;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LocalContentLoadingTrackerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/r;", "Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/k;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r extends Y implements InterfaceC28489k {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90904d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C28479a f90906f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C28496s f90907g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f90908h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f90909i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final M f90910j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.a f90911k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f90912l;

    public r(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k Dc.b bVar, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28479a c28479a, @Y61.k C28496s c28496s, @Y61.k Screen screen, @Y61.k String str, @Y61.k String str2, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.trace.a aVar, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        super(bVar, cVar);
        this.f90903c = g12;
        this.f90904d = g13;
        this.f90905e = uVar;
        this.f90906f = c28479a;
        this.f90907g = c28496s;
        this.f90908h = str;
        this.f90909i = str2;
        this.f90910j = m12;
        this.f90911k = aVar;
        this.f90912l = screen.f90471b;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28489k
    public final void e() {
        V2.f318762a.f(new kotlin.G("Logging loading interrupted is not supported for local content loading"));
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28489k
    public final void g(@Y61.l Integer num, @Y61.k com.avito.android.analytics.screens.J j12, long j13) {
        boolean z12 = j12 instanceof J.b;
        C28496s c28496s = this.f90907g;
        String str = this.f90908h;
        if (z12) {
            c28496s.getClass();
            C28496s.f90913b.getClass();
            if (c28496s.f90914a.contains("local-loading-" + str + '-' + num)) {
                return;
            }
        }
        Set<String> set = c28496s.f90914a;
        C28496s.f90913b.getClass();
        set.add("local-loading-" + str + '-' + num);
        Dc.b bVar = this.f90796a;
        long jB2 = j13 == -1 ? bVar.f3261a.b() : j13;
        this.f90906f.getClass();
        String strA = C28479a.a(num);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90904d.getF90370a());
        sb2.append(".absolute.");
        androidx.media3.exoplayer.analytics.m.p(sb2, this.f90912l, ".-.content-loading-local-storage.", str, ".page-");
        sb2.append(strA);
        sb2.append('.');
        sb2.append(j12.a());
        y.c cVar = new y.c(sb2.toString(), Long.valueOf(jB2), null);
        G g12 = this.f90903c;
        if (g12.b(cVar)) {
            this.f90910j.d(jB2, this.f90912l, this.f90908h, "load-local");
            this.f90911k.e(jB2, str);
        }
        g12.a(j12, new pc.h(this.f90912l, this.f90905e.f90959a, jB2, this.f90908h, num != null ? num.intValue() : 0, com.avito.android.analytics.screens.u.c(), j12 instanceof J.b ? null : "unknown", com.avito.android.analytics.screens.u.b(), bVar.b(), com.avito.android.analytics.screens.u.a(), this.f90909i));
        this.f90797b.h();
    }
}
