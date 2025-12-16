package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
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
    public final u f148773a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30381a> f148774b;

    public b(u uVar, Provider provider) {
        this.f148773a = uVar;
        this.f148774b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f148773a.get(), this.f148774b.get());
    }
}
