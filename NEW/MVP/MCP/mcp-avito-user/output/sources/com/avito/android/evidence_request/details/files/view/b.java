package com.avito.android.evidence_request.details.files.view;

import Rz.InterfaceC15097a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FilesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f148469a;

    /* renamed from: b, reason: collision with root package name */
    public final u f148470b;

    public b(u uVar, Provider provider) {
        this.f148469a = provider;
        this.f148470b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f148469a.get(), (InterfaceC15097a) this.f148470b.get());
    }
}
