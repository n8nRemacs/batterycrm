package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.account.G;
import com.avito.android.error_reporting.app_state.C30369h;
import com.avito.android.error_reporting.app_state.C30370i;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: EmployeeModeInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C30339b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f147499a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<k> f147500b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f147501c;

    /* renamed from: d, reason: collision with root package name */
    public final C30370i f147502d;

    /* renamed from: e, reason: collision with root package name */
    public final D f147503e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.employee_mode_impl.manager.scope.b f147504f;

    public j(Provider provider, Provider provider2, Provider provider3, C30370i c30370i, D d12, com.avito.android.employee_mode_impl.manager.scope.b bVar) {
        this.f147499a = provider;
        this.f147500b = provider2;
        this.f147501c = provider3;
        this.f147502d = c30370i;
        this.f147503e = d12;
        this.f147504f = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G g12 = this.f147499a.get();
        k kVar = this.f147500b.get();
        R0 r02 = this.f147501c.get();
        C30369h c30369h = (C30369h) this.f147502d.get();
        x xVar = (x) this.f147503e.get();
        this.f147504f.getClass();
        return new C30339b(g12, kVar, r02, c30369h, xVar, new com.avito.android.employee_mode_impl.manager.scope.a());
    }
}
