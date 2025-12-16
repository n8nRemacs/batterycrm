package com.avito.android.analytics.screens.tracker;

import com.avito.android.I1;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.util.V2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pc.C47050a;

/* compiled from: ServerContentLoadingTrackerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/P;", "Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/k;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class P extends Y implements InterfaceC28489k {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90771c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90772d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.H f90773e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I1 f90774f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90775g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C28479a f90776h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f90777i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C28496s f90778j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Screen f90779k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f90780l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f90781m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final M f90782n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.a f90783o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final String f90784p;

    public P(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k com.avito.android.analytics.H h12, @Y61.k Dc.b bVar, @Y61.k I1 i12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28479a c28479a, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k C28496s c28496s, @Y61.k Screen screen, @Y61.k String str, @Y61.k String str2, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.trace.a aVar, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        super(bVar, cVar);
        this.f90771c = g12;
        this.f90772d = g13;
        this.f90773e = h12;
        this.f90774f = i12;
        this.f90775g = uVar;
        this.f90776h = c28479a;
        this.f90777i = nVar;
        this.f90778j = c28496s;
        this.f90779k = screen;
        this.f90780l = str;
        this.f90781m = str2;
        this.f90782n = m12;
        this.f90783o = aVar;
        this.f90784p = screen.f90471b;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28489k
    public final void e() {
        Dc.b bVar = this.f90796a;
        long jB2 = bVar.f3261a.b();
        String strA = this.f90773e.a();
        this.f90771c.f90731a.c(new C47050a(this.f90784p, this.f90775g.f90959a, jB2, strA, this.f90780l, com.avito.android.analytics.screens.u.c(), com.avito.android.analytics.screens.u.b(), bVar.b(), com.avito.android.analytics.screens.u.a(), this.f90781m, !this.f90779k.f90472c, this.f90774f.w().invoke().booleanValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28489k
    public final void g(@Y61.l Integer num, @Y61.k com.avito.android.analytics.screens.J j12, long j13) {
        G g12;
        String str;
        String str2;
        C34244a c34244a;
        boolean z12 = j12 instanceof J.b;
        C28496s c28496s = this.f90778j;
        String str3 = this.f90780l;
        if (z12) {
            c28496s.getClass();
            C28496s.f90913b.getClass();
            if (c28496s.f90914a.contains("server-loading-" + str3 + '-' + num)) {
                return;
            }
        }
        Set<String> set = c28496s.f90914a;
        C28496s.f90913b.getClass();
        set.add("server-loading-" + str3 + '-' + num);
        Dc.b bVar = this.f90796a;
        long jB2 = j13 == -1 ? bVar.f3261a.b() : j13;
        this.f90776h.getClass();
        String strA = C28479a.a(num);
        String strA2 = this.f90773e.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90772d.getF90370a());
        sb2.append(".absolute.");
        String str4 = this.f90784p;
        androidx.media3.exoplayer.analytics.m.p(sb2, str4, ".-.content-loading-server.", str3, ".page-");
        sb2.append(strA);
        sb2.append('.');
        sb2.append(strA2);
        sb2.append(".-.");
        sb2.append(j12.a());
        y.c cVar = new y.c(sb2.toString(), Long.valueOf(jB2), null);
        G g13 = this.f90771c;
        if (g13.b(cVar)) {
            str = null;
            g12 = g13;
            str2 = str4;
            this.f90782n.d(jB2, this.f90784p, this.f90780l, "load");
            this.f90783o.b(jB2, str3);
        } else {
            g12 = g13;
            str = null;
            str2 = str4;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        String str5 = j12 instanceof J.b ? str : "unknown";
        long j14 = this.f90775g.f90959a;
        long jC2 = com.avito.android.analytics.screens.u.c();
        long jB3 = com.avito.android.analytics.screens.u.b();
        long jB4 = bVar.b();
        long jA2 = com.avito.android.analytics.screens.u.a();
        if (z12) {
            c34244a = str;
        } else {
            if (!(j12 instanceof J.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C34244a c34244aB = this.f90777i.b(((J.a) j12).f90384a);
            c34244a = c34244aB;
            if (c34244aB == null) {
                V2.f318762a.g("NetworkErrorsBinding", "Failed to bind exception with high-level loading error for " + str2 + '(' + str3 + ')');
                c34244a = c34244aB;
            }
        }
        String str6 = c34244a != 0 ? c34244a.f253102a : str;
        g12.a(j12, new pc.i(this.f90784p, j14, jB2, strA2, this.f90780l, iIntValue, jC2, str5, jB3, jB4, jA2, this.f90781m, str6, !this.f90779k.f90472c, this.f90774f.w().invoke().booleanValue()));
        this.f90797b.h();
    }
}
