package com.avito.android.employee_mode_impl.deeplink;

import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: EmployeeModeSwitchLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f147352a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f147353b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f147354c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f147355d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f147356e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f147357f;

    /* renamed from: g, reason: collision with root package name */
    public final Xu.c f147358g;

    public j(dagger.internal.f fVar, Provider provider, C25721c c25721c, Provider provider2, dv.b bVar, dv.b bVar2, Xu.c cVar) {
        this.f147352a = fVar;
        this.f147353b = provider;
        this.f147354c = c25721c;
        this.f147355d = provider2;
        this.f147356e = bVar;
        this.f147357f = bVar2;
        this.f147358g = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f147352a.get(), this.f147353b.get(), (C25719a) this.f147354c.get(), this.f147355d.get(), (a.g) this.f147356e.get(), (a.i) this.f147357f.get(), (Resources) this.f147358g.get());
    }
}
