package com.avito.android.timestamp_storage.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimestampStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301516a;

    /* renamed from: b, reason: collision with root package name */
    public final c f301517b;

    /* renamed from: c, reason: collision with root package name */
    public final o f301518c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f301519d;

    public l(u uVar, c cVar, o oVar, Provider provider) {
        this.f301516a = uVar;
        this.f301517b = cVar;
        this.f301518c = oVar;
        this.f301519d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.timestamp_storage.data.dao.a aVar = (com.avito.android.timestamp_storage.data.dao.a) this.f301516a.get();
        this.f301517b.getClass();
        return new j(aVar, new b(), (m) this.f301518c.get(), this.f301519d.get());
    }
}
