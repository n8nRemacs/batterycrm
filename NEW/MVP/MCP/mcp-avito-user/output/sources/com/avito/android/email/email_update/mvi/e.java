package com.avito.android.email.email_update.mvi;

import Gy.InterfaceC13928a;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmailUpdateActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13928a> f147221a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f147222b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f147223c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f147224d;

    public e(Provider<InterfaceC13928a> provider, Provider<InterfaceC34401z0> provider2, Provider<G> provider3, Provider<R0> provider4) {
        this.f147221a = provider;
        this.f147222b = provider2;
        this.f147223c = provider3;
        this.f147224d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f147221a.get(), this.f147222b.get(), this.f147223c.get(), this.f147224d.get());
    }
}
