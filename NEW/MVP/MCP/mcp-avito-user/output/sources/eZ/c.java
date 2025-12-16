package EZ;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import cv.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import kj.C42699b;
import pj.C47101d;

/* compiled from: ModelCardScreenModule_ProvideBeduinContextFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.context.b f4071a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.e f4072b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4073c;

    /* renamed from: d, reason: collision with root package name */
    public final u f4074d;

    /* renamed from: e, reason: collision with root package name */
    public final l f4075e;

    public c(com.avito.android.beduin.context.b bVar, cv.e eVar, f fVar, u uVar, l lVar) {
        this.f4071a = bVar;
        this.f4072b = eVar;
        this.f4073c = fVar;
        this.f4074d = uVar;
        this.f4075e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = (gj.d) this.f4071a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f4072b.get();
        a.b bVar = (a.b) this.f4073c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f4074d.get();
        C28478k c28478k = (C28478k) this.f4075e.f393949a;
        b.f4070a.getClass();
        C47101d c47101d = new C47101d(screenPerformanceTracker);
        Screen screen = c28478k.f90636a;
        InterfaceC40691b interfaceC40691bA = d.a.a(dVar, aVar, bVar, c47101d, null, null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210394C), "ModelCard", false, 8, null), 56);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(screen);
        return interfaceC40691bA;
    }
}
