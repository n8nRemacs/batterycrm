package com.avito.android.rating.user_contacts;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: UserContactsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.user_contacts.mvi.m f247872a;

    public q(com.avito.android.rating.user_contacts.mvi.m mVar) {
        this.f247872a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating.user_contacts.mvi.l lVar = (com.avito.android.rating.user_contacts.mvi.l) this.f247872a.get();
        i2.f411430a.getClass();
        return new p(lVar, i2.a.f411433c);
    }
}
