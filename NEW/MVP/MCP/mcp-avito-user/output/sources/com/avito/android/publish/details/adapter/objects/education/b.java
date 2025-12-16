package com.avito.android.publish.details.adapter.objects.education;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EducationListModule_ProvideEducationListPreviewBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f233299a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233300b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233301c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f233299a = provider;
        this.f233300b = uVar;
        this.f233301c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f233299a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233300b.get();
        u3.l lVar = (u3.l) this.f233301c.get();
        a.f233298a.getClass();
        return new d(eVar, aVar, lVar);
    }
}
