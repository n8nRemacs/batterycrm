package com.avito.android.mortgage_invite.lead.mvi;

import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import dagger.internal.x;
import dagger.internal.y;
import m20.InterfaceC43866b;

/* compiled from: ApplicationLeadBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final m20.d f205904a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f205905b;

    public e(m20.d dVar, dagger.internal.l lVar) {
        this.f205904a = dVar;
        this.f205905b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC43866b) this.f205904a.get(), (ApplicationLeadArguments) this.f205905b.f393949a);
    }
}
