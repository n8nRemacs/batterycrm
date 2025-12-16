package com.avito.android.contact_access.contact_access_package.mvi;

import com.avito.android.contact_access.contact_access_package.mvi.entity.ContactAccessPackageState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f125888a;

    /* renamed from: b, reason: collision with root package name */
    public final i f125889b;

    /* renamed from: c, reason: collision with root package name */
    public final o f125890c;

    /* renamed from: d, reason: collision with root package name */
    public final m f125891d;

    public c(k kVar, i iVar, o oVar, m mVar) {
        this.f125888a = kVar;
        this.f125889b = iVar;
        this.f125890c = oVar;
        this.f125891d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f125888a.get();
        h hVar = (h) this.f125889b.get();
        this.f125890c.getClass();
        n nVar = new n();
        this.f125891d.getClass();
        return new b("ContactAccessPackage", new ContactAccessPackageState(null, true), new a(hVar, nVar, new l(), jVar));
    }
}
