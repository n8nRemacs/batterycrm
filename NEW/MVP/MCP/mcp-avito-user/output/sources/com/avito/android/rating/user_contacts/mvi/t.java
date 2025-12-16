package com.avito.android.rating.user_contacts.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserContactsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final u f247869a;

    public t(u uVar) {
        this.f247869a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.rating.user_contacts.j) this.f247869a.get());
    }
}
