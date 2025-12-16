package com.avito.android.error_reporting.error_reporter;

import com.avito.android.InterfaceC30741h0;
import com.avito.android.error_reporting.app_state.C;
import com.avito.android.error_reporting.app_state.C30371j;
import com.avito.android.error_reporting.app_state.C30372k;
import com.avito.android.error_reporting.app_state.E;
import com.avito.android.error_reporting.app_state.G;
import com.avito.android.error_reporting.app_state.H;
import com.avito.android.error_reporting.app_state.I;
import com.avito.android.error_reporting.app_state.L;
import com.avito.android.error_reporting.app_state.M;
import com.avito.android.error_reporting.app_state.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ErrorReportUpdater_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30741h0> f147891a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f147892b;

    /* renamed from: c, reason: collision with root package name */
    public final M f147893c;

    /* renamed from: d, reason: collision with root package name */
    public final C30372k f147894d;

    /* renamed from: e, reason: collision with root package name */
    public final z f147895e;

    /* renamed from: f, reason: collision with root package name */
    public final C f147896f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.error_reporting.app_state.w f147897g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.error_reporting.app_state.t f147898h;

    /* renamed from: i, reason: collision with root package name */
    public final I f147899i;

    /* renamed from: j, reason: collision with root package name */
    public final G f147900j;

    /* renamed from: k, reason: collision with root package name */
    public final E f147901k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.error_reporting.app_state.p f147902l;

    public m(Provider provider, Provider provider2, M m12, C30372k c30372k, z zVar, C c12, com.avito.android.error_reporting.app_state.w wVar, com.avito.android.error_reporting.app_state.t tVar, I i12, G g12, E e12, com.avito.android.error_reporting.app_state.p pVar) {
        this.f147891a = provider;
        this.f147892b = provider2;
        this.f147893c = m12;
        this.f147894d = c30372k;
        this.f147895e = zVar;
        this.f147896f = c12;
        this.f147897g = wVar;
        this.f147898h = tVar;
        this.f147899i = i12;
        this.f147900j = g12;
        this.f147901k = e12;
        this.f147902l = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f147891a.get(), this.f147892b.get(), (L) this.f147893c.get(), (C30371j) this.f147894d.get(), (com.avito.android.error_reporting.app_state.x) this.f147895e.get(), dagger.internal.g.b(this.f147896f), dagger.internal.g.b(this.f147897g), dagger.internal.g.b(this.f147898h), (H) this.f147899i.get(), dagger.internal.g.b(this.f147900j), dagger.internal.g.b(this.f147901k), dagger.internal.g.a(dagger.internal.w.a(this.f147902l)));
    }
}
