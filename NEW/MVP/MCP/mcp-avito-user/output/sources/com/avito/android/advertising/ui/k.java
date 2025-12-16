package com.avito.android.advertising.ui;

import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;

/* compiled from: CommercialLinkOpenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f88709a;

    /* renamed from: b, reason: collision with root package name */
    public final ur.e f88710b;

    public k(dagger.internal.f fVar, ur.e eVar) {
        this.f88709a = fVar;
        this.f88710b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.deep_linking.x) this.f88709a.get(), (InterfaceC49101b) this.f88710b.get());
    }
}
