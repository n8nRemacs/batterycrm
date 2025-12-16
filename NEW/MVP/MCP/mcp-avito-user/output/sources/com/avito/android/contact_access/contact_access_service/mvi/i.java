package com.avito.android.contact_access.contact_access_service.mvi;

import com.avito.android.contact_access.contact_access_service.mvi.entity.ContactAccessServiceState;
import com.avito.android.deep_linking.links.NoMatchLink;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessServiceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f126001a;

    /* renamed from: b, reason: collision with root package name */
    public final b f126002b;

    /* renamed from: c, reason: collision with root package name */
    public final k f126003c;

    /* renamed from: d, reason: collision with root package name */
    public final f f126004d;

    public i(d dVar, b bVar, k kVar, f fVar) {
        this.f126001a = dVar;
        this.f126002b = bVar;
        this.f126003c = kVar;
        this.f126004d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f126001a.get();
        a aVar = (a) this.f126002b.get();
        this.f126003c.getClass();
        return new h("ContactAccessService", new ContactAccessServiceState.Content("", "", "", "", false, null, true, new NoMatchLink()), new g(aVar, new j(), (e) this.f126004d.get(), cVar));
    }
}
