package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi;

import Aw.C13093d;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReturnToWorkFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f137215a;

    /* renamed from: b, reason: collision with root package name */
    public final h f137216b;

    /* renamed from: c, reason: collision with root package name */
    public final j f137217c;

    /* renamed from: d, reason: collision with root package name */
    public final l f137218d;

    public f(c cVar, h hVar, j jVar, l lVar) {
        this.f137215a = cVar;
        this.f137216b = hVar;
        this.f137217c = jVar;
        this.f137218d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f137215a.get();
        this.f137216b.getClass();
        g gVar = new g();
        this.f137217c.getClass();
        i iVar = new i();
        ReturnToWorkArguments returnToWorkArguments = (ReturnToWorkArguments) this.f137218d.f393949a;
        C13093d.f701c.getClass();
        return new e("ReturnToWork", new C13093d(returnToWorkArguments.f137203c, false), new d(bVar, iVar, gVar));
    }
}
