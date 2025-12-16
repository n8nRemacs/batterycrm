package com.avito.android.email.email_confirmation.mvi;

import Gy.InterfaceC13928a;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmailConfirmationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f147135a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f147136b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC13928a> f147137c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f147138d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G> f147139e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f147140f;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f147135a = lVar;
        this.f147136b = lVar2;
        this.f147137c = provider;
        this.f147138d = provider2;
        this.f147139e = provider3;
        this.f147140f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(((Boolean) this.f147135a.f393949a).booleanValue(), (String) this.f147136b.f393949a, this.f147137c.get(), this.f147138d.get(), this.f147139e.get(), this.f147140f.get());
    }
}
