package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ScreenTrackerFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/K;", "Lcom/avito/android/analytics/screens/tracker/H;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class K implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f90757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f90758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Screen f90759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.r f90760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90761e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C28496s f90762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final G f90763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f90764h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final L f90765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.e f90766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public String f90767k;

    public K(@Y61.k com.avito.android.util.C c12, @Y61.k I i12, @Y61.k Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar) {
        this.f90757a = c12;
        this.f90758b = i12;
        this.f90759c = screen;
        this.f90760d = rVar;
        Long l12 = rVar.f90696c;
        if (l12 == null) {
            throw new IllegalArgumentException(com.avito.android.analytics.screens.r.class.getName().concat(" must be initialized with startup time passed").toString());
        }
        com.avito.android.analytics.screens.u uVar = new com.avito.android.analytics.screens.u(l12.longValue());
        this.f90761e = uVar;
        this.f90762f = new C28496s();
        this.f90763g = i12.c(uVar, screen);
        String string = rVar.f90697d;
        if (string == null) {
            com.avito.android.analytics.screens.utils.E.f90961a.getClass();
            string = UUID.randomUUID().toString();
        }
        this.f90764h = string;
        this.f90765i = new L();
        this.f90766j = new com.avito.android.analytics.screens.tracker.trace.e();
    }

    @Override // com.avito.android.analytics.screens.tracker.H
    @Y61.k
    public final com.avito.android.analytics.screens.o a() {
        return this.f90758b.d(this.f90763g, this.f90761e, this.f90762f, this.f90764h, this.f90759c, this.f90765i, this.f90766j);
    }

    @Override // com.avito.android.analytics.screens.tracker.H
    @Y61.k
    public final InterfaceC28499v b(@Y61.k H.c cVar) throws MultipleCoreContentsNotAllowedException {
        d(cVar);
        return this.f90758b.b(this.f90763g, this.f90761e, this.f90762f, this.f90764h, this.f90759c, cVar.f90738a, cVar.f90739b);
    }

    @Override // com.avito.android.analytics.screens.tracker.H
    @Y61.k
    public final InterfaceC28501x c(@Y61.k H.c cVar) throws MultipleCoreContentsNotAllowedException {
        d(cVar);
        return this.f90758b.a(this.f90763g, this.f90761e, this.f90762f, this.f90764h, this.f90759c, this.f90760d, cVar.f90738a, cVar.f90739b, this.f90766j);
    }

    public final void d(H.c cVar) throws MultipleCoreContentsNotAllowedException {
        if (cVar.f90739b) {
            String str = this.f90767k;
            String str2 = cVar.f90738a;
            if (str == null) {
                this.f90767k = str2;
            } else if (!kotlin.jvm.internal.L.f(str2, str) && !this.f90757a.l()) {
                throw new MultipleCoreContentsNotAllowedException(androidx.camera.core.Q.a("Received '", str2, "' marked as core content, but '", str, "' was already received as core content in the past. Please set 'isCoreContentType' to false for the second content type when calling 'createInitTracker' and 'createDiInjectTracker'."));
            }
        }
    }
}
