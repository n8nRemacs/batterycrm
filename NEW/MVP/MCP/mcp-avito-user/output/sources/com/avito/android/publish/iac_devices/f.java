package com.avito.android.publish.iac_devices;

import com.avito.android.remote.H;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDevicesParserImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f236036a;

    public f(u uVar) {
        this.f236036a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((H) this.f236036a.get());
    }
}
