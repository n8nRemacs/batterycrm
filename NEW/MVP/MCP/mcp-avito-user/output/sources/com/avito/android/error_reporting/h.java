package com.avito.android.error_reporting;

import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FirebaseErrorReporter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f147914a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f147915b;

    public h(u uVar, Provider provider) {
        this.f147914a = uVar;
        this.f147915b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((c) this.f147914a.get(), this.f147915b.get());
    }
}
