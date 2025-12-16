package com.avito.android.analytics.screens.tracker.fps;

import Bc.InterfaceC13133a;
import Y61.k;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.M;
import com.avito.android.analytics.statsd.y;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenContextFpsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/c;", "Lcom/avito/android/analytics/screens/tracker/fps/b;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f90859i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Screen f90860a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90861b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f90862c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC13133a f90863d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final M f90864e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ScreenFpsContext f90865f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.screens.tracker.trace.a f90866g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f90867h = new ArrayList();

    /* compiled from: ScreenContextFpsTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/c$a;", "", "<init>", "()V", "", "MAX_DURATIONS_COUNT", "I", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Screen screen, @k String str, @k InterfaceC28373a interfaceC28373a, @k InterfaceC13133a interfaceC13133a, @k M m12, @k ScreenFpsContext screenFpsContext, @k com.avito.android.analytics.screens.tracker.trace.a aVar) {
        this.f90860a = screen;
        this.f90861b = str;
        this.f90862c = interfaceC28373a;
        this.f90863d = interfaceC13133a;
        this.f90864e = m12;
        this.f90865f = screenFpsContext;
        this.f90866g = aVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.b
    public final void a(@k com.avito.android.fps.a aVar) {
        ArrayList arrayList = this.f90867h;
        if (21600 <= arrayList.size()) {
            return;
        }
        arrayList.add(aVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.b
    @k
    public final ArrayList b(long j12) {
        ArrayList arrayList = this.f90867h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            com.avito.android.fps.a aVar = (com.avito.android.fps.a) next;
            if (j12 < aVar.f158620d - aVar.f158617a.toMillis()) {
                arrayList2.add(next);
            }
        }
        arrayList.removeIf(new C28081y0(new d(j12), 2));
        return arrayList2;
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.b
    public final void c() {
        double dM2;
        double d12;
        ArrayList arrayList = this.f90867h;
        if (arrayList.isEmpty()) {
            return;
        }
        int iA2 = kotlin.math.b.a(this.f90863d.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            com.avito.android.fps.a aVar = (com.avito.android.fps.a) next;
            aVar.getClass();
            if (Duration.ZERO.compareTo(aVar.f158619c) < 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            com.avito.android.fps.a aVar2 = (com.avito.android.fps.a) next2;
            aVar2.getClass();
            if (Duration.ZERO.compareTo(aVar2.f158619c) >= 0) {
                arrayList3.add(next2);
            }
        }
        if (arrayList2.isEmpty()) {
            dM2 = 0.0d;
        } else {
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Long.valueOf(((com.avito.android.fps.a) it3.next()).f158619c.toMillis()));
            }
            dM2 = C42745f0.m(arrayList4);
        }
        f90859i.getClass();
        if (arrayList2.isEmpty()) {
            d12 = 0.0d;
        } else {
            Iterator it4 = arrayList2.iterator();
            long millis = 0;
            long millis2 = 0;
            while (it4.hasNext()) {
                millis2 += ((com.avito.android.fps.a) it4.next()).f158619c.toMillis();
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                millis += ((com.avito.android.fps.a) it5.next()).f158618b.toMillis();
            }
            d12 = (millis2 * 1000.0d) / millis;
        }
        String str = this.f90860a.f90471b;
        int size = arrayList2.size();
        int size2 = arrayList3.size();
        ScreenFpsContext screenFpsContext = this.f90865f;
        double d13 = dM2;
        pc.e eVar = new pc.e(str, size, size2, dM2, d12, iA2, screenFpsContext.f90852b, this.f90861b);
        InterfaceC28373a interfaceC28373a = this.f90862c;
        interfaceC28373a.c(eVar);
        double size3 = (arrayList2.size() / (arrayList2.size() + arrayList3.size())) * 100;
        StringBuilder sb2 = new StringBuilder("fps.jankFramesPercentage.");
        sb2.append(iA2);
        sb2.append('.');
        sb2.append(str);
        sb2.append('.');
        String str2 = screenFpsContext.f90852b;
        sb2.append(str2);
        interfaceC28373a.c(new y.c(sb2.toString(), Long.valueOf((long) size3), null));
        interfaceC28373a.c(new y.c("fps.jankDuration." + iA2 + '.' + str + '.' + str2, Long.valueOf((long) d13), null));
        interfaceC28373a.c(new y.c("fps.hitchTimeRatio." + iA2 + '.' + str + '.' + str2, Double.valueOf(d12), null));
        interfaceC28373a.c(new y.c("fps.jankFramesCount." + iA2 + '.' + str + '.' + str2, Integer.valueOf(arrayList2.size()), null));
        this.f90864e.getClass();
        M.b(str, str2, d12, size3, arrayList2);
        this.f90866g.d(str2, d12, d13, size3, arrayList2);
        arrayList.clear();
    }
}
