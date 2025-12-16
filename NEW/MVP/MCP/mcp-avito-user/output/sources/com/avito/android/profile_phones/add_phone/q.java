package com.avito.android.profile_phones.add_phone;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddPhoneInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.d f226959a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_phones.validation.c f226960b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.profile_phones.validation.f f226961c;

    /* renamed from: d, reason: collision with root package name */
    public final u f226962d;

    public q(com.avito.android.code_confirmation.code_confirmation.phone_confirm.d dVar, com.avito.android.profile_phones.validation.c cVar, com.avito.android.profile_phones.validation.f fVar, u uVar) {
        this.f226959a = dVar;
        this.f226960b = cVar;
        this.f226961c = fVar;
        this.f226962d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.code_confirmation.code_confirmation.phone_confirm.b) this.f226959a.get(), (com.avito.android.profile_phones.validation.a) this.f226960b.get(), (com.avito.android.profile_phones.validation.d) this.f226961c.get(), (com.avito.android.profile_phones.add_phone.raw_phones_list.a) this.f226962d.get());
    }
}
