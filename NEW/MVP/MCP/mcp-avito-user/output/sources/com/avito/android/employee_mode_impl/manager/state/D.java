package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import xD.C49818a;
import xD.C49820c;

/* compiled from: EmployeeModeStateUpdaterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f147397a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.employee_mode_impl.manager.domain.b f147398b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.employee_mode_impl.manager.domain.f f147399c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f147400d;

    /* renamed from: e, reason: collision with root package name */
    public final t f147401e;

    /* renamed from: f, reason: collision with root package name */
    public final w f147402f;

    /* renamed from: g, reason: collision with root package name */
    public final C49820c f147403g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.employee_mode_impl.manager.storage.b f147404h;

    public D(Provider provider, com.avito.android.employee_mode_impl.manager.domain.b bVar, com.avito.android.employee_mode_impl.manager.domain.f fVar, dagger.internal.f fVar2, t tVar, w wVar, C49820c c49820c, com.avito.android.employee_mode_impl.manager.storage.b bVar2) {
        this.f147397a = provider;
        this.f147398b = bVar;
        this.f147399c = fVar;
        this.f147400d = fVar2;
        this.f147401e = tVar;
        this.f147402f = wVar;
        this.f147403g = c49820c;
        this.f147404h = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f147397a.get();
        com.avito.android.employee_mode_impl.manager.domain.c cVar = (com.avito.android.employee_mode_impl.manager.domain.c) this.f147398b.get();
        com.avito.android.employee_mode_impl.manager.domain.g gVar = (com.avito.android.employee_mode_impl.manager.domain.g) this.f147399c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f147400d.get();
        this.f147401e.getClass();
        s sVar = new s();
        this.f147402f.getClass();
        return new y(r02, cVar, gVar, interfaceC28373a, sVar, new v(), (C49818a) this.f147403g.get(), (com.avito.android.employee_mode_impl.manager.storage.c) this.f147404h.get());
    }
}
