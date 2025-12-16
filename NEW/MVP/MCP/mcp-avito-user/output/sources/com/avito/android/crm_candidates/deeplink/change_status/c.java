package com.avito.android.crm_candidates.deeplink.change_status;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmChangeStatusDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f129164a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f129165b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f129166c;

    public c(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f129164a = bVar;
        this.f129165b = bVar2;
        this.f129166c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f129165b.get(), (a.f) this.f129164a.get(), this.f129166c.get());
    }
}
