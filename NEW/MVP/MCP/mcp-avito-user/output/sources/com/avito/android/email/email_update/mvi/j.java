package com.avito.android.email.email_update.mvi;

import Fy.C13855c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmailUpdateFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f147244a;

    /* renamed from: b, reason: collision with root package name */
    public final e f147245b;

    /* renamed from: c, reason: collision with root package name */
    public final l f147246c;

    /* renamed from: d, reason: collision with root package name */
    public final n f147247d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f147248e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f147244a = gVar;
        this.f147245b = eVar;
        this.f147246c = lVar;
        this.f147247d = nVar;
        this.f147248e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f147244a.get();
        d dVar = (d) this.f147245b.get();
        this.f147246c.getClass();
        k kVar = new k();
        m mVar = (m) this.f147247d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f147248e.get();
        C13855c.f6095c.getClass();
        return new i("EmailUpdate", C13855c.f6096d, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
