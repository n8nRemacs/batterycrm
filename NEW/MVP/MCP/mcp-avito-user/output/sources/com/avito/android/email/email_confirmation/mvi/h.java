package com.avito.android.email.email_confirmation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmailConfirmationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f147148a;

    /* renamed from: b, reason: collision with root package name */
    public final j f147149b;

    /* renamed from: c, reason: collision with root package name */
    public final l f147150c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f147151d;

    public h(e eVar, j jVar, l lVar, Provider provider) {
        this.f147148a = eVar;
        this.f147149b = jVar;
        this.f147150c = lVar;
        this.f147151d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f147148a.get();
        this.f147149b.getClass();
        i iVar = new i();
        this.f147150c.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f147151d.get();
        Ey.c.f4433c.getClass();
        return new g("EmailConfirmation", Ey.c.f4434d, new f(cVar, screenPerformanceTracker, kVar, iVar));
    }
}
