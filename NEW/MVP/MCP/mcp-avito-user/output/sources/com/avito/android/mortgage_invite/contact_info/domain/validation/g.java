package com.avito.android.mortgage_invite.contact_info.domain.validation;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactInfoFieldsValidator_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f205659a;

    /* renamed from: b, reason: collision with root package name */
    public final d f205660b;

    public g(b bVar, d dVar) {
        this.f205659a = bVar;
        this.f205660b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((e) this.f205659a.get(), (e) this.f205660b.get());
    }
}
