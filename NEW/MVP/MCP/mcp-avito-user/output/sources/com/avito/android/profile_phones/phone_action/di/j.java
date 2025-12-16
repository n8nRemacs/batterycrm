package com.avito.android.profile_phones.phone_action.di;

import com.avito.android.profile_phones.phone_action.PhoneParcelableEntity;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: PhoneActionModule_ProvideReplacingPhones$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<List<PhoneParcelableEntity>> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227295a;

    public j(d dVar) {
        this.f227295a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f227295a.f227286e;
    }
}
