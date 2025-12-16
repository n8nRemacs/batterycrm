package com.avito.android.evidence_request.details;

import com.avito.android.evidence_request.details.files.FilesInteractor;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f148584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.details.params.a> f148585b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f148586c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<TV0.d<?, ?>>> f148587d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<y> f148588e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f148589f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<FilesInteractor> f148590g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f148591h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f148592i;

    public w(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f148584a = provider;
        this.f148585b = provider2;
        this.f148586c = provider3;
        this.f148587d = provider4;
        this.f148588e = provider5;
        this.f148589f = provider6;
        this.f148590g = provider7;
        this.f148591h = lVar;
        this.f148592i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f148584a.get();
        com.avito.android.evidence_request.details.params.a aVar = this.f148585b.get();
        InterfaceC36030r0 interfaceC36030r0 = this.f148586c.get();
        Set<TV0.d<?, ?>> set = this.f148587d.get();
        y yVar = this.f148588e.get();
        InterfaceC35741a1 interfaceC35741a1 = this.f148589f.get();
        return new v(gVar, yVar, this.f148590g.get(), aVar, (com.avito.android.evidence_request.details.validation.f) this.f148592i.get(), interfaceC35741a1, interfaceC36030r0, (String) this.f148591h.f393949a, set);
    }
}
