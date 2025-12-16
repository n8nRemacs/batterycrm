package com.avito.android.profile_phones.confirm_phone;

import androidx.view.InterfaceC23487e;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmPhoneViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f227065a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.d f227066b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> f227067c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.profile_phones.validation.f f227068d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f227069e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f227070f;

    public n(dagger.internal.l lVar, com.avito.android.code_confirmation.code_confirmation.phone_confirm.d dVar, Provider provider, com.avito.android.profile_phones.validation.f fVar, Provider provider2, dagger.internal.l lVar2) {
        this.f227065a = lVar;
        this.f227066b = dVar;
        this.f227067c = provider;
        this.f227068d = fVar;
        this.f227069e = provider2;
        this.f227070f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((k) this.f227065a.f393949a, (com.avito.android.code_confirmation.code_confirmation.phone_confirm.b) this.f227066b.get(), this.f227067c.get(), (com.avito.android.profile_phones.validation.d) this.f227068d.get(), this.f227069e.get(), (InterfaceC23487e) this.f227070f.f393949a);
    }
}
