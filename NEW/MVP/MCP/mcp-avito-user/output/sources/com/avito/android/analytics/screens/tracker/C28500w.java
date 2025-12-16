package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.statsd.y;
import java.util.Set;
import kotlin.Metadata;
import pc.C47051b;

/* compiled from: ScreenDiInjectTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/w;", "Lcom/avito/android/analytics/screens/tracker/v;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28500w implements InterfaceC28499v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f90933a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90934b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90935c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C28496s f90936d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f90937e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90938f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f90939g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final M f90940h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f90941i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f90942j;

    public C28500w(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k C28496s c28496s, @Y61.k Screen screen, @Y61.k String str, boolean z12, @Y61.k String str2, @Y61.k M m12) {
        this.f90933a = g12;
        this.f90934b = g13;
        this.f90935c = uVar;
        this.f90936d = c28496s;
        this.f90937e = str;
        this.f90938f = z12;
        this.f90939g = str2;
        this.f90940h = m12;
        this.f90941i = screen.f90471b;
        this.f90942j = z12 ? "screen-di-inject" : androidx.camera.camera2.internal.G.f("component-di.", str);
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28499v
    public final void a(long j12) {
        C28496s c28496s = this.f90936d;
        c28496s.getClass();
        C28496s.f90913b.getClass();
        StringBuilder sb2 = new StringBuilder("di-inject-");
        String str = this.f90937e;
        sb2.append(str);
        String string = sb2.toString();
        Set<String> set = c28496s.f90914a;
        if (set.contains(string)) {
            return;
        }
        set.add("di-inject-" + str);
        com.avito.android.analytics.screens.u uVar = this.f90935c;
        long j13 = uVar.f90960b;
        boolean z12 = this.f90938f;
        String str2 = this.f90941i;
        com.avito.android.analytics.screens.G g12 = this.f90934b;
        G g13 = this.f90933a;
        if (z12 && j13 > 0) {
            if (g13.b(new y.c(g12.getF90370a() + ".absolute." + str2 + ".-.screen-preinitialization", Long.valueOf(j13), null))) {
                this.f90940h.d(j13, this.f90941i, this.f90937e, "preinit");
            }
        }
        if (g13.b(new y.c(g12.getF90370a() + ".absolute." + str2 + ".-." + this.f90942j, Long.valueOf(j12), null))) {
            this.f90940h.d(j12, this.f90941i, this.f90937e, "di-inject");
        }
        g13.a(J.b.f90385a, new C47051b(uVar.f90959a, j12, com.avito.android.analytics.screens.u.c(), com.avito.android.analytics.screens.u.b(), com.avito.android.analytics.screens.u.b(), com.avito.android.analytics.screens.u.a(), this.f90941i, this.f90939g, this.f90937e));
    }
}
