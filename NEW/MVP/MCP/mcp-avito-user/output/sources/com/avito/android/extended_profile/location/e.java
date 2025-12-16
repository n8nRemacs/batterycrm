package com.avito.android.extended_profile.location;

import com.avito.android.location.r;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileLocationProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f150031a;

    public e(u uVar) {
        this.f150031a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((r) this.f150031a.get());
    }
}
