package com.avito.android.comfortable_deal.clients.interactor;

import com.avito.android.comfortable_deal.clients.use_case.c;
import com.avito.android.comfortable_deal.repository.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f120251a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.use_case.e f120252b;

    public b(l lVar, com.avito.android.comfortable_deal.clients.use_case.e eVar) {
        this.f120251a = lVar;
        this.f120252b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.comfortable_deal.repository.a) this.f120251a.get(), (c) this.f120252b.get());
    }
}
