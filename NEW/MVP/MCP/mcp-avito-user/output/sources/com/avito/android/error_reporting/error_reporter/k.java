package com.avito.android.error_reporting.error_reporter;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ErrorEventTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f147875a;

    /* renamed from: b, reason: collision with root package name */
    public final m f147876b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f147877c;

    public k(Provider provider, m mVar, Provider provider2) {
        this.f147875a = provider;
        this.f147876b = mVar;
        this.f147877c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f147875a.get(), (l) this.f147876b.get(), this.f147877c.get());
    }
}
